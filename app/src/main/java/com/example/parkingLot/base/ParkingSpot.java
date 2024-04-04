package com.example.parkingLot.base;

import com.example.parkingLot.Vehicle;

public class ParkingSpot {

    protected int id;
    protected boolean isEmpty;
    Vehicle v;

    public ParkingSpot(int id, boolean isEmpty, Vehicle v) {
        this.id = id;
        this.isEmpty = isEmpty;
        this.v = v;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getV() {
        return v;
    }

    public void setV(Vehicle v) {
        this.v = v;
    }

    void parkVehicle() {

    }

    void removeVehicle() {

    }

}
