package com.example.parkingLot.factory;

import com.example.parkingLot.base.CastComputation;
import com.example.parkingLot.FourWheelerCastComputation;
import com.example.parkingLot.TwoWheekerCastComputation;
import com.example.parkingLot.Vehicle;

public class CastComputationFactory {

    Vehicle.VehicleType vehicleType;
    public CastComputationFactory(Vehicle.VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }

    public CastComputation getCastComputation(){
        if(vehicleType == Vehicle.VehicleType.TWO_WHEELER)
            return new TwoWheekerCastComputation();
        else if(vehicleType == Vehicle.VehicleType.FOUR_WHEELER)
            return new FourWheelerCastComputation();

        return null;
    }


}
