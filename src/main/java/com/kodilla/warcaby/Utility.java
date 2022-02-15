package com.kodilla.warcaby;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utility {
    public static final int MAX_BOARDER = 7;
    public static final int MIN_BOARDER = 0;

    private List<String[]> simpleMoves;
    private List<String[]> jumpMoves;
    private List<String[]> copyJumpMoves;

    private Map<Integer, List<String[]>> tempJumpKey = new HashMap<>();
    private Map<String, List<String[]>> jumpKey = new HashMap<>();


    public void successor(String selectedPosition, Map<String, Piece> whitePieces, Map<String, Piece> redPieces, boolean player) {

        String[] xy = selectedPosition.split(":");
        int x = Integer.valueOf(xy[0]);
        int y = Integer.valueOf(xy[1]);

        Map<String, Piece> currentPlayer;


        boolean king;
        if (player) {
            king = whitePieces.get(selectedPosition).isKing();
            currentPlayer =  redPieces;
        } else {
            king = redPieces.get(selectedPosition).isKing();
            currentPlayer =  whitePieces;
        }

        int maxY = y + 1;
        int minY = y - 1;
        int minX = x - 1;
        int maxX = x + 1;


        int jumpMaxY = y + 2;
        int jumpMinY = y - 2;
        int jumpMaxX = x + 2;
        int jumpMinX = x - 2;

        String simpleMoveKey1 = createKey(maxX, minY);
        String simpleMoveKey2 = createKey(minX, minY);
        String simpleMoveKey3 = createKey(maxX, maxY);
        String simpleMoveKey4 = createKey(minX, maxY);

        String jumpKey1 = createKey(jumpMaxX, jumpMinY);
        String jumpKey2 = createKey(jumpMinX, jumpMinY);
        String jumpKey3 = createKey(jumpMaxX, jumpMaxY);
        String jumpKey4 = createKey(jumpMinX, jumpMaxY);



            if (!whitePieces.containsKey(jumpKey1) && !redPieces.containsKey(jumpKey1)) {
                if (currentPlayer.containsKey(simpleMoveKey1)) {
                    if (jumpMaxX <= MAX_BOARDER && jumpMinY >= MIN_BOARDER) {
                        String[] jumpMoveKeys = {jumpKey1, selectedPosition, simpleMoveKey1};
                        jumpMoves.add((jumpMoveKeys));
                    }
                }
            }
            if (!whitePieces.containsKey(jumpKey2) && !redPieces.containsKey(jumpKey2)) {
                if (currentPlayer.containsKey(simpleMoveKey2)) {
                    if (jumpMinX >= MIN_BOARDER && jumpMinY >= MIN_BOARDER) {
                        String[] jumpMoveKeys = {jumpKey2, selectedPosition, simpleMoveKey2};
                        jumpMoves.add(jumpMoveKeys);
                    }
                }
            }

            if (!whitePieces.containsKey(jumpKey3) && !redPieces.containsKey(jumpKey3)) {
                if (currentPlayer.containsKey(simpleMoveKey3)) {
                    if (jumpMaxX <= MAX_BOARDER && jumpMaxY <= MAX_BOARDER) {
                        String[] jumpMoveKeys = {jumpKey3, selectedPosition, simpleMoveKey3};
                        jumpMoves.add((jumpMoveKeys));
                    }
                }
            }
            if (!whitePieces.containsKey(jumpKey4) && !redPieces.containsKey(jumpKey4)) {
                if (currentPlayer.containsKey(simpleMoveKey4)) {
                    if (jumpMinX >= MIN_BOARDER && jumpMaxY <= MAX_BOARDER) {
                        String[] jumpMoveKeys = {jumpKey4, selectedPosition, simpleMoveKey4};
                        jumpMoves.add(jumpMoveKeys);
                    }
                }
            }


        if (jumpMoves.isEmpty()) {
            if (king || !player) {
                if (maxX <= MAX_BOARDER && minY >= MIN_BOARDER) {
                    if (!whitePieces.containsKey(simpleMoveKey1) && !redPieces.containsKey(simpleMoveKey1)) {
                        String[] simpleMove = {simpleMoveKey1, selectedPosition};
                        simpleMoves.add(simpleMove);
                    }
                }
                if (minX >= MIN_BOARDER && minY >= MIN_BOARDER) {
                    if (!whitePieces.containsKey(simpleMoveKey2) && !redPieces.containsKey(simpleMoveKey2)) {
                        String[] simpleMove = {simpleMoveKey2, selectedPosition};
                        simpleMoves.add(simpleMove);
                    }
                }

            }
            if (king || player) {
                if (maxX <= MAX_BOARDER && maxY <= MAX_BOARDER) {
                    if (!whitePieces.containsKey(simpleMoveKey3) && !redPieces.containsKey(simpleMoveKey3)) {
                        String[] simpleMove = {simpleMoveKey3, selectedPosition};
                        simpleMoves.add(simpleMove);
                    }
                }
                if (minX >= MIN_BOARDER && maxY <= MAX_BOARDER) {
                    if (!whitePieces.containsKey(simpleMoveKey4) && !redPieces.containsKey(simpleMoveKey4)) {
                        String[] simpleMove = {simpleMoveKey4, selectedPosition};
                        simpleMoves.add(simpleMove);
                    }
                }

            }
        }
    }

    public void checkMultipleJump(Map<String, Piece> whitePieces, Map<String, Piece> redPieces, boolean player) {

        if (!jumpMoves.isEmpty()) {

            for (int i = 0; i < copyJumpMoves.size(); i++) {

                String newKey = copyJumpMoves.get(i)[0];
                String formerKey = copyJumpMoves.get(i)[1];
                String removeKey = copyJumpMoves.get(i)[2];

                if (!tempJumpKey.containsKey(i)) {
                    tempJumpKey.put(i, new ArrayList<>());
                }
                List<String[]> tempKeys = this.tempJumpKey.get(i);
                String[] keyCombination = {removeKey, newKey};
                tempKeys.add(keyCombination);

                this.tempJumpKey.put(i, tempKeys);

                Piece piece = new Piece();
                if (player) {
                    piece.setKing(whitePieces.get(formerKey).isKing());
                    whitePieces.put(newKey, piece);

                } else {
                    piece.setKing(redPieces.get(formerKey).isKing());
                    redPieces.put(newKey, piece);
                }

                jumpMoves = new ArrayList<>();
                successor(newKey, whitePieces, redPieces, player);

                if (!jumpMoves.isEmpty()) {
                    copyJumpMoves.remove(i);
                    String[] key = jumpMoves.get(jumpMoves.size() - 1);

                    String[] comb = {key[2], key[0]};
                    tempKeys.add(comb);

                    copyJumpMoves.add(i, key);
                    clearMoves();
                    checkMultipleJump(whitePieces, redPieces, player);
                }
            }
            for (int i = 0; i < copyJumpMoves.size(); i++) {
                List<String[]> keys = tempJumpKey.get(i);
                String key = copyJumpMoves.get(i)[0];
                jumpKey.put(key, keys);
            }
            tempJumpKey = new HashMap<>();
        }

    }

    public void getPossibleMoves(Map<String, Piece> whitePieces, Map<String, Piece> redPieces, boolean player) {

        clearMoves();
        Map<String, Piece> pieces;
        if (player) {
            pieces = whitePieces;
        } else {
            pieces = redPieces;
        }

        for (String currentPlayerKeys : pieces.keySet()) {
            successor(currentPlayerKeys, whitePieces, redPieces, player);
        }
    }


    public List<String[]> deepCopyList(List<String[]> originalList) {

        List<String[]> newList = new ArrayList<String[]>();
        for (String[] moves : originalList) {
            String[] copiedArray = new String[moves.length];
            System.arraycopy(moves, 0, copiedArray, 0, moves.length);
            newList.add(copiedArray);
        }
        return newList;

    }


    public Map<String, Piece> deepCopyMap(Map<String, Piece> originalMap) {

        Map<String, Piece> copyRedPiece = new HashMap<>();

        for (String key : originalMap.keySet()) {
            copyRedPiece.put(key, originalMap.get(key));
        }
        return copyRedPiece;
    }



    public int[] getXY(String key) {
        String[] keyXY = key.split(":");
        int x = Integer.valueOf(keyXY[0]);
        int y = Integer.valueOf(keyXY[1]);
        int xy[] = new int[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public List<String[]> getSimpleMoves() {
        return simpleMoves;
    }

    public void setJumpMoves(List<String[]> jumpMoves) {
        this.jumpMoves = jumpMoves;
    }

    public List<String[]> getJumpMoves() {
        return jumpMoves;
    }

    public void clearMoves() {
        simpleMoves = new ArrayList<>();
        jumpMoves = new ArrayList<>();
    }

    public String createKey(int x, int y) {
        return String.valueOf(x) + ":" + String.valueOf(y);
    }

    public Map<String, List<String[]>> getJumpKey() {
        return jumpKey;
    }

    public void clearRemoveKeys() {
        jumpKey = new HashMap<>();
    }

    public void setCopyJumpMoves(List<String[]> copyJumpMoves) {
        this.copyJumpMoves = copyJumpMoves;
    }
}
