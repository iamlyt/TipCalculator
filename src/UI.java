import java.text.DecimalFormat;
import java.util.Scanner;

public class UI {

    protected TipCalculator calculator = new TipCalculator();
    protected Scanner scn = new Scanner(System.in);

    public UI() {
        handleInput();
    }

    protected void handleInput() {

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Welcome to the tip calculator.");

        System.out.println("What was the total bill?");
        double billTotal = scn.nextDouble();

        System.out.println("How many people to split the bill?");
        int numOfPeople = scn.nextInt();

        System.out.println("What percentage tip would you like to give? 10, " +
                "12, or 15?");
        int tip = scn.nextInt();

        double amountPerPerson = calculator.calculateByPerson(billTotal,
                numOfPeople, tip);

        System.out.println("Each person should pay: $" + df.format(amountPerPerson));
    }
}
