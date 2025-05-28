package tugas.week11;

public class PulsaTidakCukupException extends Exception {
    private int amount;

    public PulsaTidakCukupException(int amount) {
        super("Pulsa tidak cukup");
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
