package ParkingLot.model;

public class VechileDetails {
    private VechileType vechileType;
    private String vechileNumber;
    private String ownerName;
    private int phno;

    public VechileDetails(VechileType vechileType, String vechileNumber, String ownerName, int phno){
        this.vechileType = vechileType;
        this.vechileNumber = vechileNumber;
        this.ownerName = ownerName;
        this.phno = phno;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    public String getVechileNumber() {
        return vechileNumber;
    }

    public void setVechileNumber(String vechileNumber) {
        this.vechileNumber = vechileNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }
}
