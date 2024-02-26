package ParkingLot.model;

public class Payment {
    private int refNumber;
    private String paymentMode;
    private double amount;
    private String status;

    public Payment(int refNumber, String paymentMode, double amount, String status){
        this.refNumber = refNumber;
        this.paymentMode = paymentMode;
        this.amount = amount;
        this.status = status;
    }

    public int getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(int refNumber) {
        this.refNumber = refNumber;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
