package com.example.parkingLot.factory;

import com.example.parkingLot.base.ParkingSpot;
import com.example.parkingLot.Vehicle;
import com.example.parkingLot.manager.FourWheelerSpotManager;
import com.example.parkingLot.manager.ParkingSpotManager;
import com.example.parkingLot.manager.TwoWheelerSpotManager;

import java.util.ArrayList;

public class ParkingSpotFactory {

    public ParkingSpotManager getParkingManager(Vehicle.VehicleType vType, Vehicle vehicle) {
        ArrayList<ParkingSpot> list;
        if(vType == Vehicle.VehicleType.TWO_WHEELER) {
            list = TwoWheelerSpotManager.getTwoVehicleList();
            return new TwoWheelerSpotManager(list);
        }
        else if(vType == Vehicle.VehicleType.FOUR_WHEELER) {
            list = FourWheelerSpotManager.getFourVehicleList(vehicle);
            return new FourWheelerSpotManager(list);
        }
        return null;
    }

}
