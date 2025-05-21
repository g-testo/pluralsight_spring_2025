package com.ps;

public class Room implements Cleanable, Reservable{
    private boolean isClean;
    private boolean isReserved;

    public Room() {}

    public Room(boolean isClean, boolean isReserved) {
        this.isClean = isClean;
        this.isReserved = isReserved;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    @Override
    public void clean(){
        System.out.println("Sweep, sweep, sweep");
        this.isClean = true;
    }

    @Override
    public void reserve() {
        System.out.println("Room is now reserved...");
        this.isReserved = true;
    }

    @Override
    public boolean getIsReserved() {
        return isReserved;
    }
}
