package com.kodilla.warcaby;

public class Piece {

    private boolean king;

    public boolean isKing() {
        return king;
    }

    public void setKing(boolean king) {
        this.king = king;
    }
    public Piece() {
    }

    public Piece(boolean king) {
        this.king = king;
    }


}

