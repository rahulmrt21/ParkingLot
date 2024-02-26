package ParkingLot.app;

import ParkingLot.controllers.ParkingLotController;
import ParkingLot.model.VechileType;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int noOfFloors, int noOfSlots, VechileType allowedVechileTye
        System.out.println("Please enter the number of floors for a Parking Lot.");
        int noOfFloors = scanner.nextInt();

        System.out.println("Enter the number of slots on each floor.");
        int noOfSlots = scanner.nextInt();

        System.out.println("Vechile Type");
        String allowedVechiles = scanner.next();

        ParkingLotController parkingLotController = new ParkingLotController();
        parkingLotController.CreateParkingLot(noOfFloors, noOfSlots, VechileType.valueOf(allowedVechiles));
    }
}
