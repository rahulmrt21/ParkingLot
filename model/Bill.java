package ParkingLot.model;

import java.time.LocalTime;
import java.util.List;

public class Bill {
    private int id;
    private int billNumber;
    private int gateNumber;
    private int operatorId;
    private int ticketNumber;
    private LocalTime exitTime;
    private double billAmount;
    private String status;
    private List<Payment> payment;

    public Bill(int id, int billNumber, int gateNumber, int operatorId, int ticketNumber, LocalTime exitTime, double billAmount, String status, List<Payment> payment){
        this.id = id;
        this.billNumber = billNumber;
        this.gateNumber = gateNumber;
        this.operatorId = operatorId;
        this.ticketNumber = ticketNumber;
        this.exitTime = exitTime;
        this.billAmount = billAmount;
        this.status = status;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(int billNumber) {
        this.billNumber = billNumber;
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

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }
}
