package com.kodilla.warcaby;

public class FieldInfo {
     int number;
     String letter;
     String status;
     String membership;
    boolean occupation;

    public FieldInfo(int number, String letter, String status, String membership, boolean occupation) {
        this.number = number;
        this.letter = letter;
        this.status = status;
        this.membership = membership;
        this.occupation = occupation;
    }
    public FieldInfo() {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    public boolean isOccupation() {
        return occupation;
    }

    public void setOccupation(boolean occupation) {
        this.occupation = occupation;
    }
}
