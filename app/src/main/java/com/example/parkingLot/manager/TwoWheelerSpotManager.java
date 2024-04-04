package com.example.parkingLot.manager;

import com.example.parkingLot.TwoWheelerSpot;
import com.example.parkingLot.base.ParkingSpot;
import com.example.parkingLot.Vehicle;

import java.util.ArrayList;

public class TwoWheelerSpotManager extends ParkingSpotManager {

    public TwoWheelerSpotManager(ArrayList<ParkingSpot> list) {
        super(list);
    }

    public static ArrayList<ParkingSpot> getTwoVehicleList() {
        int spaceSize = 5;

        ArrayList<ParkingSpot> list = new ArrayList<>();
        for(int i = 0; i<spaceSize; i++){
            list.add(new TwoWheelerSpot(1, true, null));
        }

        return list;
    }

    public void parkVehicle(Vehicle vehicle) {
         ArrayList<ParkingSpot> list = getTwoVehicleList();
         for(int i=0;i<list.size();i++){
             if(list.get(i).isEmpty()){
                 list.get(i).setEmpty(false);
                 list.get(i).setV(vehicle);
                 break;
             }
         }
    }

    public void removeVehicle(Vehicle vehicle) {
        ArrayList<ParkingSpot> list = getTwoVehicleList();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getV() != null && list.get(i).getV().equals(vehicle)){
                list.get(i).setEmpty(true);
                list.get(i).setV(null);
                break;
            }
        }
    }


}
