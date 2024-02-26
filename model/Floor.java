package ParkingLot.model;

import java.util.List;
import ParkingLot.model.ParkingSlot;

public class Floor {
    private int floorNumber;
    private int noOfSlots;
    private VechileType allowedVechileType;
    private List<ParkingSlot> slotsList;


    public Floor(int floorNumber, int noOfSlots, VechileType allowedVechileType){
          this.floorNumber = floorNumber;
          this.noOfSlots = noOfSlots;
          this.allowedVechileType = allowedVechileType;
          this.slotsList = createSlots(noOfSlots,allowedVechileType);
        System.out.println("Floor: " + this.floorNumber + " created with " + this.noOfSlots + " slots for " + this.allowedVechileType);
    }

    //Create Slots for each vechile type.
    public List<ParkingSlot> createSlots(int noOfSlots, VechileType allowedVechileTye){
        List<ParkingSlot> slots = null;
        System.out.println("Inside createSlots method");
        for(int i=1; i<=noOfSlots; i++) {
            slots.add(new ParkingSlot(i, allowedVechileTye));
        }
        System.out.println("CreateSlots completed.");
        return slots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getNoOfSlots() {
        return noOfSlots;
    }

    public void setNoOfSlots(int noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public VechileType getAllowedVechileType() {
        return allowedVechileType;
    }

    public void setAllowedVechileType(VechileType allowedVechileType) {
        this.allowedVechileType = allowedVechileType;
    }

    public List<ParkingSlot> getSlotsList() {
        return slotsList;
    }

    public void setSlotsList(List<ParkingSlot> slotsList) {
        this.slotsList = slotsList;
    }
}

