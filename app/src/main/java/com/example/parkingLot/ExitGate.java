package com.example.parkingLot;

import com.example.parkingLot.base.CastComputation;
import com.example.parkingLot.factory.CastComputationFactory;
import com.example.parkingLot.factory.ParkingSpotFactory;
import com.example.parkingLot.manager.ParkingSpotManager;

public class ExitGate {

    private ParkingSpotFactory parkingSpotFactory;
    private ParkingSpotManager parkingSpotManager;
    private CastComputation castComputation;
    private Vehicle vehicle;
    public ExitGate(Vehicle.VehicleType vType, Vehicle vehicle){
        parkingSpotFactory = new ParkingSpotFactory();
        parkingSpotManager =  parkingSpotFactory.getParkingManager(vType, vehicle);

        castComputation = new CastComputationFactory(vType).getCastComputation();
        this.vehicle = vehicle;
    }

    public int castComputation() {
        return castComputation.price();
    }

    public void deallocateSlot() {
        parkingSpotManager.removeVehicle(vehicle);
    }

}
