public class Payment {
    private int id;
    private int commuterId;
    private int tripId;
    private double amount;
    private String paymentTime;

    public Payment(int id, int commuterId, int tripId, double amount, String paymentTime) {
        this.id = id;
        this.commuterId = commuterId;
        this.tripId = tripId;
        this.amount = amount;
        this.paymentTime = paymentTime;
    }

    public int getId() {
        return id;
    }

    public int getCommuterId() {
        return commuterId;
    }

    public int getTripId() {
        return tripId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentTime() {
        return paymentTime;
    }
}
