package econ.bank.client;

import econ.bank.Coins;
import econ.bank.Material;
import econ.bank.PiggyBank;

import java.time.LocalDateTime;

/**
 * JR: works as intended, though emits extra unnecessary output.
 */
public class PiggyBankClientArgs {
    public static void main(String[] args) {
        String usage = "Please enter the desired number of <Pennies> <Nickles> <Dimes> <Quarters>";
        String example = " Ex: Enter 2 4 6 4 for 2 pennies, 4 nickels, 6 dimes, and 4 quarter.";
        String spacing = " NUMBERS ONLY. Do not forget the space!";
        String warning = usage + "\n" + example + "\n" + spacing + "\n";

        if (args.length < 4) {
            System.out.println("Invalid Command-line Arguments:");
            System.out.println("You provided " + args.length + " arguments");
            System.out.println(warning);
            return;
        }

        // converts the string inputs to int and prints it.

        int numberOfPennies = Integer.parseInt(args[0]);
        int numberOfNickles = Integer.parseInt(args[1]);
        int numberOfDimes = Integer.parseInt(args[2]);
        int numberOfQuarters = Integer.parseInt(args[3]);
        System.out.printf("You have deposited %s pennies, %s nickles, %s dimes, %s quarters.\n",
                numberOfPennies, numberOfNickles, numberOfDimes, numberOfQuarters);

        // adds the value of each coin by the input quantity

        PiggyBank bank = new PiggyBank(Material.PLASTIC);

        /*
         * JR: for these, you could call the addCoin(Coins coins, int count) method instead,
         * e.g., bank.addCoin(Coins.PENNY, numberOfPennies)
         */
        for (int i = 0; i < numberOfPennies; i++) {
            bank.addCoin(Coins.PENNY);
        }
        for (int i = 0; i < numberOfNickles; i++) {
            bank.addCoin(Coins.NICKLE);
        }
        for (int i = 0; i < numberOfDimes; i++) {
            bank.addCoin(Coins.DIME);
        }
        for (int i = 0; i < numberOfQuarters; i++) {
            bank.addCoin(Coins.QUARTER);
        }
        double totalDeposited = bank.getTotal();

        System.out.printf("%s: Your total saving is %.2f!\n",
                LocalDateTime.now().withSecond(0).withNano(0), totalDeposited);

        bank.breakBank();
        System.out.println(bank.getTotal());

        System.out.println(bank);
        System.out.println("---------------------");

        // JR: this part is unnecessary, your work in here is done as of this point
        PiggyBank bank2 = new PiggyBank("Penguin", Material.CLAY); //reject Penguin and take default cat
        bank2.addCoin(Coins.PENNY, 10);
        bank2.addCoin(Coins.QUARTER, 10);
        bank2.addCoin(Coins.NICKLE, 10);
        bank2.addCoin(Coins.DIME, 10);
        System.out.println(bank2.getTotal());

        System.out.println(bank2);


    }
}

