package com.example.parkingLot.manager;

import com.example.parkingLot.Vehicle;
import com.example.parkingLot.base.ParkingSpot;

import java.util.List;

public class ParkingSpotManager {

    private List<ParkingSpot> list;

    public ParkingSpotManager(List<ParkingSpot> list){
        this.list = list;
    }

    public boolean findParkingSpace(){
        return list.stream().anyMatch(ParkingSpot::isEmpty);
    }

    public void increaseParkingSpace(){

    }

    public void decreaseParkingSpace() {

    }

    public void removeVehicle(Vehicle vehicle) {

    }

    public void parkVehicle(Vehicle vehicle) {

    }

}
