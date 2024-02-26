package ParkingLot.model;

public class ParkingSlot {
    private int slotNumber;
    private VechileType vechileType;
    private ParkingStatus status;

    public ParkingSlot(int slotNumber, VechileType vechileType){
        this.slotNumber = slotNumber;
        this.vechileType = vechileType;
        this.status = ParkingStatus.AVAILABLE;
        System.out.println("Parking Slot Constructor");
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    public ParkingStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingStatus status) {
        this.status = status;
    }
}
