
public enum StatusType {
    Poor(1), Average(2), Rich(3);

    private int numberStatus;


    StatusType(int numberStatus) {
        this.numberStatus = numberStatus;
    }

    public int getNumberStatus() {
        return numberStatus;
    }

}
