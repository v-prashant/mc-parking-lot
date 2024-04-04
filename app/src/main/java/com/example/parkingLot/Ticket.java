package com.example.parkingLot;

public class Ticket extends Vehicle {

    long entryTime;
    Vehicle v;
    int parkingSlot;

    public Ticket(long entryTime, Vehicle v, int parkingSlot) {
        this.entryTime = entryTime;
        this.v = v;
        this.parkingSlot = parkingSlot;
    }

    public Ticket() {

    }
}
