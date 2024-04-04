package com.example.parkingLot.manager;

import com.example.parkingLot.FourWheelerSpot;
import com.example.parkingLot.base.ParkingSpot;
import com.example.parkingLot.Vehicle;

import java.util.ArrayList;

public class FourWheelerSpotManager extends ParkingSpotManager {

    public FourWheelerSpotManager(ArrayList<ParkingSpot> list) {
        super(list);
    }

    public static ArrayList<ParkingSpot> getFourVehicleList(Vehicle vehicle) {
        int spaceSize = 3;

        ArrayList<ParkingSpot> list = new ArrayList<>();
        for(int i = 0; i<spaceSize; i++){
            list.add(new FourWheelerSpot(1, true, null));
        }

        return list;
    }

    public void parkVehicle(Vehicle vehicle) {
        ArrayList<ParkingSpot> list = getFourVehicleList(vehicle);
        for(int i=0;i<list.size();i++){
            if(list.get(i).isEmpty()){
                list.get(i).setEmpty(false);
                list.get(i).setV(vehicle);
                break;
            }
        }
    }

    public void removeVehicle(Vehicle vehicle) {
        ArrayList<ParkingSpot> list = getFourVehicleList(vehicle);
        for(int i=0;i<list.size();i++){
            if(list.get(i).getV().equals(vehicle)){
                list.get(i).setEmpty(true);
                list.get(i).setV(null);
                break;
            }
        }
    }

}
