package econ.bank.test;

import econ.bank.Coins;
import econ.bank.Material;
import econ.bank.PiggyBank;

import java.util.Arrays;

/**
 * JR: nice job, I believe this shows that the logic works correctly.
 * Incorrect class name, should be PiggyBankValidationTest.
 */
class PiggyBankClientValidationTest {
    public static void main(String[] args) {

        // JR: delete extraneous blank lines such as these

        PiggyBank bank1 = new PiggyBank(Material.CERAMIC);
        bank1.addCoin(Coins.DIME, -1);
        System.out.println(bank1.getTotal());
        bank1.addCoin(Coins.DIME, 0);
        System.out.println(bank1.getTotal());
        bank1.addCoin(Coins.DIME, 100);
        System.out.println(bank1.getTotal());
        bank1.addCoin(Coins.DIME, 101);
        System.out.println(bank1.getTotal());
        bank1.breakBank();                                  //SMASH if not plastic
        System.out.println(bank1);
        System.out.println("------------------------------------------");

        PiggyBank b2 = new PiggyBank(Material.CLAY);
        b2.addCoin(Coins.QUARTER);
        b2.addCoin(Coins.DIME);
        b2.addCoin(Coins.NICKLE);
        b2.addCoin(Coins.PENNY);
        System.out.println(Arrays.toString(b2.getCoins()));
        System.out.println(b2);
        System.out.println("--------------------------------");

        b2.addCoin(Coins.QUARTER,10);
        b2.addCoin(Coins.DIME,10);
        b2.addCoin(Coins.NICKLE,10);
        b2.addCoin(Coins.PENNY,10);
        System.out.println(Arrays.toString(b2.getCoins()));
        System.out.println(b2);

        System.out.println("------------------------------------");
        b2.setTotal(-1.0);
        System.out.println(b2.getTotal());
        b2.setTotal(0.0);
        System.out.println(b2.getTotal());
        b2.setTotal(100.0);
        System.out.println(b2.getTotal());
        b2.setTotal(101.0);
        System.out.println(b2.getTotal());
        System.out.println(b2);

        System.out.println("--------------------------------------------");
        b2.setMaterial(Material.PLASTIC);
        System.out.println(b2.getMaterial());
        b2.setMaterial(Material.CERAMIC);
        System.out.println(b2.getMaterial());
        b2.setMaterial(Material.CLAY);
        System.out.println(b2.getMaterial());
        System.out.println(b2);
        System.out.println("---------------------------------------");

        b2.setShape("Tiger");
        System.out.println(b2.getShape());
        b2.setShape("Dog");
        System.out.println(b2.getShape());
        b2.setShape("Penguin");
        System.out.println(b2.getShape());
        System.out.println(b2);
    }
}