package com.ps;

public class Pair<G> implements Comparable{
    private G leftNumber;
    private G rightNumber;

    public Pair(G leftNumber, G rightNumber) {
        this.leftNumber = leftNumber;
        this.rightNumber = rightNumber;
    }

    public G getLeftNumber() {
        return leftNumber;
    }

    public void setLeftNumber(G leftNumber) {
        this.leftNumber = leftNumber;
    }

    public G getRightNumber() {
        return rightNumber;
    }

    public void setRightNumber(G rightNumber) {
        this.rightNumber = rightNumber;
    }

    public void swap() {
        G temp = leftNumber;
        leftNumber = rightNumber;
        rightNumber = temp;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
