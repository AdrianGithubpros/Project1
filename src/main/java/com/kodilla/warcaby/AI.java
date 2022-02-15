package com.kodilla.warcaby;

import java.util.*;

public class AI {
    public static final int EASY = 1;
    public static final int MEDIUM = 2;
    public static final int HARD = 4;
    public static final int VERY_HARD = 10;

    private Utility utility;
    public MiniMax miniMax;

    private Map<String, Piece> finalRedPieces = new HashMap<>();
    private Map<String, Piece> finalWhitePieces = new HashMap<>();
    public boolean botLost = false;
    public String formerPositionKey;
    private int level;
    public int recursionCounter;

    public AI(Utility utility) {
        this.utility = utility;
        miniMax = new MiniMax(utility, this);
        level = AI.EASY;

    }

    public void makeMove(String[] movements, Map<String, Piece> whitePieces, Map<String, Piece> redPieces, boolean realMove , boolean player) {

        if (!player) {

            String formerPositionKey;
            if (realMove) {
                formerPositionKey = this.formerPositionKey;
            } else {
                formerPositionKey = movements[1];
            }

            String newPositionKey = movements[0];
            int[] newXY = utility.getXY(newPositionKey);
            int newY = newXY[1];

            redPieces.put(newPositionKey, new Piece());
            if (newY == Utility.MIN_BOARDER || redPieces.get(formerPositionKey).isKing()) {
                redPieces.get(newPositionKey).setKing(true);
            }
            redPieces.remove(formerPositionKey);

            if (movements.length == 3){
                if (realMove){

                    checkMultiStepMovementAi(whitePieces, redPieces);

                } else {
                    whitePieces.remove(movements[2]);
                }
            } else {
                if (realMove) {
                    finalRedPieces = redPieces;
                    finalWhitePieces = whitePieces;
                }
            }
            if (realMove) {
                utility.clearMoves();
            }

        }else {
            String formerPositionKey;
            if (realMove) {
                formerPositionKey = this.formerPositionKey;
            } else {
                formerPositionKey = movements[1];
            }

            String newPositionKey = movements[0];
            int[] newXY = utility.getXY(newPositionKey);
            int newY = newXY[1];

            whitePieces.put(newPositionKey, new Piece());
            if (newY == Utility.MIN_BOARDER || whitePieces.get(formerPositionKey).isKing()) {
                whitePieces.get(newPositionKey).setKing(true);
            }
            whitePieces.remove(formerPositionKey);

            if (movements.length == 3) {
                if (realMove) {

                    checkMultiStepMovementAi(whitePieces, redPieces);

                } else {
                    redPieces.remove(movements[2]);
                }
            } else {
                if (realMove) {
                    finalRedPieces = redPieces;
                    finalWhitePieces = whitePieces;
                }
            }
            if (realMove) {
                utility.clearMoves();
            }
        }
    }

    public void moveAI(Map<String, Piece> whitePieces1, Map<String, Piece> redPieces1) {

        Map<String, Piece> whitePieces = whitePieces1;
        Map<String, Piece> redPieces = redPieces1;

        utility.getPossibleMoves(whitePieces, redPieces, false);
        List<String[]> simpleMoves = utility.getSimpleMoves();
        List<String[]> jumpMoves = utility.getJumpMoves();

        if (simpleMoves.isEmpty() && jumpMoves.isEmpty()) {
            botLost = true;

        } else {

            recursionCounter = 1;
            miniMax.miniMax(utility.deepCopyMap(whitePieces), utility.deepCopyMap(redPieces), level, Integer.MIN_VALUE, Integer.MAX_VALUE, false);


            String[] bestMove = miniMax.getBestMove();
            formerPositionKey = bestMove[1];

            if (bestMove.length == 3){
                jumpMoves = new ArrayList<>();
                jumpMoves.add(bestMove);
                utility.setJumpMoves(jumpMoves);
                List<String[]> copiedJumpMoves = utility.deepCopyList(jumpMoves);
                utility.setCopyJumpMoves(copiedJumpMoves);
                utility.clearRemoveKeys();
                utility.checkMultipleJump(utility.deepCopyMap(whitePieces), utility.deepCopyMap(redPieces), false);
                bestMove = copiedJumpMoves.get(0);
            }
            makeMove(bestMove, whitePieces, redPieces, true,false);
        }


    }

    private void checkMultiStepMovementAi(Map<String, Piece> whitePieces, Map<String, Piece> redPieces) {

        Map<String, List<String[]>> removeKeys = utility.getJumpKey();
        for (String removeKey : removeKeys.keySet()) {
            List<String[]> keys = removeKeys.get(removeKey);
            for (int i = 0; i < keys.size(); i++) {

                whitePieces.remove(keys.get(i)[0]);
                int finalI = i;

                    whitePieces.remove(keys.get(finalI)[0]);

                    redPieces.put(keys.get(finalI)[1],new Piece());

                    if (finalI > 0) {
                        redPieces.remove(keys.get(finalI - 1)[1]);
                    }
            }
        }
         finalRedPieces = redPieces;
         finalWhitePieces = whitePieces;
    }


    public void setLevel(int level) {
        this.level = level;
    }
    public int getLevel() {
        return this.level;
    }

    public Map<String, Piece> getFinalRedPieces() {
        return finalRedPieces;
    }

    public Map<String, Piece> getFinalWhitePieces() {
        return finalWhitePieces;
    }
    public void finalRefresh(){
         finalRedPieces = new HashMap<>();
         finalWhitePieces = new HashMap<>();
    }
}