package ParkingLot.model;

public class Gate {
    private GateType gateType;
    private int gateNumber;
    private int operatorId;
    private GateStatus status;

    public Gate(GateType gateType, int gateNumber, int operatorId, GateStatus status){
        this.gateType = gateType;
        this.gateNumber = gateNumber;
        this.operatorId = operatorId;
        this.status = status;
    }
}
