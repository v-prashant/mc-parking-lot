package com.example.parkingLot;

public class Vehicle {

    private int vehicleNumber;
    private VehicleType vehicleType;

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public enum VehicleType {
        TWO_WHEELER, FOUR_WHEELER
    }

}
