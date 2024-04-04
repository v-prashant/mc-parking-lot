package com.example.parkingLot

fun main() {

    val vehicle = Vehicle()

    parkVehicle(vehicle, Vehicle.VehicleType.TWO_WHEELER)
    existVehicle(vehicle, Vehicle.VehicleType.TWO_WHEELER)

}

fun parkVehicle(vehicle: Vehicle, vehicleType: Vehicle.VehicleType) {
    val entranceGate = EntranceGate(vehicleType, vehicle)
    if(entranceGate.findSpace()){
        entranceGate.bookSpot(Vehicle.VehicleType.TWO_WHEELER)
        print("Vehicle parked")
        val ticket = entranceGate.generateTicket(Vehicle.VehicleType.TWO_WHEELER)
    }else{
        print("Not able to find spot")
    }
}

fun existVehicle(vehicle: Vehicle, vehicleType: Vehicle.VehicleType) {
    val exitGate  = ExitGate(vehicleType, vehicle)
    val cast = exitGate.castComputation()
    exitGate.deallocateSlot()
    print("Vehicle removed")
}
