package econ.bank;

import java.util.Arrays;

/**
 * JR: Very good result overall.
 * Demonstrates good understanding of program concepts, with a few improvements needed.
 * Nice creativity applied, and the logic appears to be correct.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been very good, keep it up!
 *
 * Class names, package names, and overall structure are not correct.
 *  ValidationTest class should be named PiggyBankValidationTest.
 */
public class PiggyBank {

    //FIELDS
    private String shape = "Cat";
    private Material material = Material.CERAMIC;
    private double total = 0.0;
    private final Coins[] coins = new Coins[100];  // have to pick a size, unfilled slots will be null!
    private int currentIndex = 0;


    //CONSTRUCTORS
    public PiggyBank(Material material) {
        setMaterial(material);
    }

    // JR: list Material first, to be consistent with other ctor above
    public PiggyBank(String shape, Material material) {
        this(material);
        setShape(shape);
    }

    /*
     * JR: neither of these "counting" methods are probably necessary.
     */

    // STATIC "CLASS" METHODS
    public static double count(double... values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

    public static double countCoins(Coins... coins) {
        double[] coinValues = new double[coins.length];
        for (int i = 0; i < coins.length; i++) {
            coinValues[i] = coins[i].getValue();
        }
        return count(coinValues);
    }

    // CLIENT-SIDE METHODS

    //method to empty piggy bank once based on whether the piggybank is plastic or not.
    // Gives total and then clears bank.
    public void breakBank() {
        if (isPlastic()) {
            System.out.println("Piggybank cleared");
            System.out.printf("You saved %.2f\n", getTotal());
        } else {
            System.out.println("SMASH");
            System.out.printf(" You need a new piggybank but you saved %.2f!\n", getTotal());
        }
        setTotal(0.0);
    }

    // method adds coins to the array list until the array is filled.
    //  adds coin one at a time

    /*
     * JR: nice touch, really like the creativity here.
     * Especially the "full" feature (if >100 coins) in the bank.
     */
    public void addCoin(Coins coin) {
        if (currentIndex < coins.length) {
            coins[currentIndex++] = coin;  // insert into next slot
            total += coin.getValue();      // total = total + coin.getValue()
        } else {
            System.out.println("Piggy bank is full. Time to break bank.");
        }
    }

    // quick method to add large amounts of coins based of the fixed coin values

    /*
     * JR: I would not write it like this personally (so many returns!), but the
     * logic appears sound, and I will assume you tested it thoroughly.
     *
     * My logic would likely be something like this, leveraging the good work already
     * done in addCoin() above, i.e., this "plural" add-many method simply calls the
     * "singular" add-one method above repeatedly.
     *
     *  for (Coins coin : coins) {
     *    for (int i = 0; i < count; i++) {
     *      addCoin(coin);
     *    }
     *  }
     *
     * I think my code would work, though haven't tested it.
     * But still like your thinking here, and you'll want to keep on the lookout for
     * one method calling another in the same class, its usefulness comes up pretty often.
     */
    public void addCoin(Coins coins, int count) {
        if (currentIndex >= 100) {         // limits index to 100
            System.out.println("Piggy bank is full. Time to break bank.");
            return;
        }
        if (count <= 0) {                   // drop negative numbers
            return;
        }
        int index = coins.ordinal();            //coin values are fixed based on position in array.
        for (int i = 0; i < count; i++) {
            if (currentIndex >= 100) {
                System.out.println("Piggy bank is full. Time to break bank.");
                return;
            }
            this.coins[currentIndex] = coins;        //adds coin to index
            currentIndex++;
        }
        total += coins.getValue() * count;
    }


    // GETTERS AND SETTERS
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getShape() {
        return shape;
    }

    // JR: so...Monkey is out of the question I guess...sad Monkey.  :|
    // Simple but nice creative touch.
    public void setShape(String shape) {
        if (shape != null && shape.length() > 5) {
            // limits shape to a 5 character string
            System.out.println(" 5 character limitations. Please try again.");

        } else {
            // JR: problem is that if 'shape' comes in as null, you do indeed take it
            this.shape = shape;
        }
    }

    /*
     * JR: likely not appropriate for a client to directly set the total like this.
     * Instead, the client has to addCoin() the traditional way to put money in the bank.
     * It's like offering me a setBalance() method on my bank account:
     *  go ahead, and I'll be sure to call setBalance(1_000_000.0) right away.
     */
    public void setTotal(double total) {
        if (100 >= total && total >= 0) {
            this.total = total;
        } else {
            System.out.println("Invalid entry");
        }
    }


    public double getTotal() {
        return total;
    }

    public Coins[] getCoins() {
        return Arrays.copyOf(coins, currentIndex);
    }

    // verifies if the material is plastic.
    private boolean isPlastic() {
        return getMaterial() == Material.PLASTIC;
    }

    // TOSTRING METHOD

    // JR: use getClass().getName() or getClass().getSimpleName() instead of just getClass()
    // String name = "Bullen";
    //  name.getClass() returns                  "class java.lang.String"
    //  name.getClass().getName() returns        "java.lang.String"
    //  name.getClass().getSimpleName() returns  "String"
    public String toString() {
        return String.format("%s Shape=%s, Material=%s, Total=%.2f, econ.bank.Coins=%s.\n",
                getClass(), getShape(), getMaterial(), getTotal(), Arrays.toString(getCoins()));
    }
}

