package ParkingLot.model;

import java.util.List;

public class ParkingLot {
    private int noOfFloors;
    private List<Floor> floors;
    private int noOfSlots;
    private VechileType allowedVechileTye;
    private List<Gate> gate;
    private ParkingLotStatus status;
    private List<ParkingSlot> parkingSlots;

    public ParkingLot(int noOfFloors, int noOfSlots,VechileType allowedVechileTye){
        this.floors = addFloors(noOfFloors, noOfSlots, allowedVechileTye);
        this.noOfSlots = noOfSlots;
        //this.gate = new ArrayList<>();
        this.allowedVechileTye = allowedVechileTye;
        this.status = ParkingLotStatus.OPEN;
    }

    //Create the floors
    //Add Slots on each floor
    //For resp Vechile.
    public List<Floor> addFloors(int noOfFloors,int noOfSlots,VechileType allowedVechileTye) {
        for (int i = 1; i < noOfFloors; i++) {
            floors.add(new Floor(i,noOfSlots, allowedVechileTye));

            //Add Entry gate and exit gate on ground floor
            if(i == 1){
                gate.add(new Gate(GateType.ENTRY, 1, 123, GateStatus.OPEN));
                gate.add(new Gate(GateType.ENTRY, 2, 321, GateStatus.OPEN));

                gate.add(new Gate(GateType.EXIT, 3, 567, GateStatus.OPEN));
                gate.add(new Gate(GateType.EXIT, 4, 765, GateStatus.OPEN));

                System.out.println("Entry and exit gates added on 1st floor.");
            }
        }
        return floors;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public int getNoOfSlots() {
        return noOfSlots;
    }

    public void setNoOfSlots(int noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public VechileType getAllowedVechileTye() {
        return allowedVechileTye;
    }

    public void setAllowedVechileTye(VechileType allowedVechileTye) {
        this.allowedVechileTye = allowedVechileTye;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

//    public Ticket issueTicket(){
//        for(int i=1; i<noOfFloors; i++){
//            for(int j=1; j<noOfSlots; j++){
//                floors(i).get(ParkingSlot.getStatus());
//            }
//        }
//        Ticket ticket = new Ticket(Math.random(), Timestamp.from(Instant.now()), "MH12 MQ 9999", getSlotNumber(), 1, 123);
//        return ticket;
//    }
}
