package com.example.parkingLot;

import com.example.parkingLot.base.ParkingSpot;

public class FourWheelerSpot extends ParkingSpot {
    private int price = 10;

    public FourWheelerSpot(int id, boolean isEmpty, Vehicle vehicle) {
        super(id, isEmpty, vehicle);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
