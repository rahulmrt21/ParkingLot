package ParkingLot.controllers;

import ParkingLot.model.ParkingLot;
import ParkingLot.model.VechileType;

public class ParkingLotController {
    public void CreateParkingLot(int noOfFloors, int noOfSlots, VechileType allowedVechileTye) {
        ParkingLot parkingLot = new ParkingLot(noOfFloors, noOfSlots, allowedVechileTye);
    }
}
