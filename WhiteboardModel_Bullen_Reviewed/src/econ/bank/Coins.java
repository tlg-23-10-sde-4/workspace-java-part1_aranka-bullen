package econ.bank;

/**
 * JR: better name = Coin, since Coin.PENNY is a single Coin object.
 */
public enum Coins {
    PENNY(0.01),
    NICKLE(0.05),
    DIME(0.10),
    QUARTER(0.25);

    //FIELDS
    private final double value;

    //CONSTRUCTORS
    Coins(double value) {
        this.value = value;
    }
    //GETTER
    public double getValue() {
        return value;
    }
}