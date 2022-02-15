package com.kodilla.warcaby;

import java.util.List;
import java.util.Map;

public class MiniMax {
    private final Utility utility;
    private  final AI ai;
    private String[] bestMove;


    public MiniMax(Utility utility, AI ai) {
        this.utility = utility;
        this.ai = ai;
    }

    public int miniMax(Map<String, Piece>whitePieces, Map<String, Piece> redPieces, int depth, int alpha, int beta, boolean player) {
        ai.recursionCounter++;
        utility.getPossibleMoves(whitePieces, redPieces, player);
        List<String[]> jumpMoves = utility.getJumpMoves();
        List<String[]> simpleMoves = utility.getSimpleMoves();
        if (depth == 0 || (simpleMoves.isEmpty() && jumpMoves.isEmpty())) {
            return heuristic(whitePieces, redPieces);
        }
        List<String[]> possibleMoves;
        possibleMoves = simpleMoves;
        if (!jumpMoves.isEmpty()) {
            possibleMoves = jumpMoves;
        }
        String[] tempBestMove = null;

        if(!player) {
            int score = Integer.MIN_VALUE;

            for (String[] move : possibleMoves) {

                Map<String, Piece> copyWhitePieces = utility.deepCopyMap(whitePieces);
                Map<String, Piece> copyRedPieces = utility.deepCopyMap(redPieces);

                ai.makeMove(move, copyWhitePieces, copyRedPieces, false , false);
                score = miniMax(copyWhitePieces, copyRedPieces, depth - 1, alpha, beta, true);

                if (alpha <= score) {
                    alpha = score;
                    tempBestMove = move;
                }
                if (beta <= alpha) {
                    break;
                }
            }
            bestMove = tempBestMove;
            return score;
        } else {
            int score = Integer.MAX_VALUE;
            for (String[] move : possibleMoves) {

                Map<String, Piece> copyWhitePieces = utility.deepCopyMap(whitePieces);
                Map<String, Piece> copyRedPieces = utility.deepCopyMap(redPieces);

                ai.makeMove(move, copyWhitePieces, copyRedPieces, false , true);

                utility.getPossibleMoves(copyWhitePieces, copyRedPieces, false);

                score = miniMax(copyWhitePieces, copyRedPieces, depth - 1, alpha, beta, false);

                if (score <= beta) {
                    beta = score;
                    tempBestMove = move;
                }
                if (beta <= alpha) {
                    break;
                }
            }
            bestMove = tempBestMove;
            return score;
        }

    }

    private int heuristic(Map<String, Piece> whitePieces, Map<String, Piece> redPieces) {
        int diffWhiteRed = redPieces.size() - whitePieces.size();
        int numberKings = 0;
        for (String piece : redPieces.keySet()) {
            if (redPieces.get(piece).isKing()) {
                numberKings++;
            }
        }
        return diffWhiteRed + numberKings;
    }

    public String[] getBestMove() {
        return bestMove;
    }
}
