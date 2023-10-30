package econ.bank.client;

import econ.bank.Coins;
import econ.bank.Material;
import econ.bank.PiggyBank;

import java.util.Arrays;

/**
 * JR: good test-drive, shows that the logic in PiggyBank is working correctly,
 * but the thoroughness here would be better in the ValidationTest class,
 * and then in here you would just create a PiggyBank object, addCoin() to it a few times,
 * show the total, and then break the bank.
 */
class PiggyBankClient {

    public static void main(String[] args) {
        PiggyBank pig = new PiggyBank(Material.PLASTIC);
        pig.addCoin(Coins.DIME);
        pig.addCoin(Coins.QUARTER);
        pig.addCoin(Coins.NICKLE);
        System.out.println(pig);

        System.out.println(Arrays.toString(pig.getCoins()));

        System.out.println();
        double total = PiggyBank.countCoins(Coins.PENNY, Coins.NICKLE, Coins.DIME, Coins.QUARTER);
        System.out.printf("The total deposited is %.2f.\n", total);

        //BVT for addCoin() based on coin position
        PiggyBank bank1 = new PiggyBank(Material.CERAMIC);
        bank1.addCoin(Coins.DIME, -1);
        System.out.println(bank1.getTotal());
        bank1.addCoin(Coins.NICKLE, 0);
        System.out.println(bank1.getTotal());
        bank1.addCoin(Coins.QUARTER, 100);
        System.out.println(bank1.getTotal());
        bank1.addCoin(Coins.PENNY, 101);
        System.out.println(bank1.getTotal());
        bank1.breakBank();                                  //SMASH if not plastic
        System.out.println(bank1);


        PiggyBank b1 = new PiggyBank(Material.CLAY);
        b1.addCoin(Coins.DIME);                             // total = .10
        System.out.println(b1.getTotal());
        b1.addCoin(Coins.PENNY);                            // =.11
        System.out.println(b1.getTotal());
        b1.addCoin(Coins.NICKLE);                           // = .16
        System.out.println(b1.getTotal());
        b1.addCoin(Coins.QUARTER);                          // = .41
        System.out.println(b1.getTotal());
        b1.breakBank();                                     //SMASH
        System.out.println(b1);

        // IsPlastic Testing
        PiggyBank b2 = new PiggyBank(Material.PLASTIC);
        System.out.println(b2.getTotal());                   // expected 0.0
        b2.addCoin(Coins.QUARTER);
        System.out.println(b2.getTotal());                  // expected 0.25
        b2.breakBank();                                     // clear if plastic
        System.out.println(b2.getTotal());                  // expected 0.0
        System.out.println(b2.getShape());                  // expected cat
       }
}