package ParkingLot.model;

import java.util.Date;

public class Ticket {
    private int ticketNumber;
    private Date entryTime;
    private String vechileNumber;
    private int slotNumber;
    private int gateNumber;
    private int operatorId;

    public Ticket(int ticketNumber, Date entryTime, String vechileNumber, int slotNumber, int gateNumber, int operatorId){
        this.ticketNumber = ticketNumber;
        this.entryTime = entryTime;
        this.vechileNumber = vechileNumber;
        this.slotNumber = slotNumber;
        this.gateNumber = gateNumber;
        this.operatorId = operatorId;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public String getVechileNumber() {
        return vechileNumber;
    }

    public void setVechileNumber(String vechileNumber) {
        this.vechileNumber = vechileNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }
}
