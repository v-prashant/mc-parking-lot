package com.example.parkingLot;

import com.example.parkingLot.factory.ParkingSpotFactory;
import com.example.parkingLot.manager.ParkingSpotManager;

public class EntranceGate {

    private ParkingSpotFactory parkingSpotFactory;
    private ParkingSpotManager parkingSpotManager;
    private Vehicle vehicle;

    public EntranceGate(Vehicle.VehicleType vehicleType, Vehicle vehicle) {
        parkingSpotFactory = new ParkingSpotFactory();
        parkingSpotManager =  parkingSpotFactory.getParkingManager(vehicleType, vehicle);
        this.vehicle = vehicle;
    }

    public boolean findSpace() {
        return parkingSpotManager.findParkingSpace();
    }

    void bookSpot(Vehicle.VehicleType vehicleType) {
        parkingSpotManager.parkVehicle(vehicle);
    }

    void generateTicket(Vehicle.VehicleType vehicleType){
        Ticket generateTicket = new Ticket();
    }


}
