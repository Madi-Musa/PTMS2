public class Commuter {
    private int id;
    private String name;
    private double cardBalance;

    public Commuter(String name, double cardBalance) {
        this.name = name;
        this.cardBalance = cardBalance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCardBalance() {
        return cardBalance;
    }
}
