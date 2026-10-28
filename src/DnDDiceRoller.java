import java.util.Scanner;

// Dice Roller for Dungeons & Dragons
public class DnDDiceRoller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What die do you need? (d4, d6, d8, d10, d12, d20, d100)");
        String dice = scan.nextLine().trim().toLowerCase();

        int sides;
        try {
            if (!dice.startsWith("d")) {
                throw new NumberFormatException();
            }
            sides = Integer.parseInt(dice.substring(1));
        } catch (NumberFormatException e) {
            System.out.println("Invalid die. Use a value such as d6 or d20.");
            scan.close();
            return;
        }

        if (sides != 4 && sides != 6 && sides != 8 && sides != 10
                && sides != 12 && sides != 20 && sides != 100) {
            System.out.println("That die is not supported.");
            scan.close();
            return;
        }

        System.out.println("What are your modifiers?");
        int modifier = scan.nextInt();

        System.out.println("How many dice do you want to roll?");
        int numberOfRolls = scan.nextInt();

        if (numberOfRolls <= 0) {
            System.out.println("Number of rolls must be greater than zero.");
            scan.close();
            return;
        }

        MultifacedDie die = new MultifacedDie(sides);
        int allDice = 0;

        for (int i = 0; i < numberOfRolls; i++) {
            int result = die.roll();
            allDice += result;

            if (sides == 20 && result == 20) {
                System.out.println("!!!!!!!!!!Critical Success!!!!!!!!!!");
            } else if (sides == 20 && result == 1) {
                System.out.println("!!!!!!!!!!Critical Failure!!!!!!!!!!");
            }

            System.out.println("You rolled a d" + die.getSides() + " and got a " + die.getValue());
        }

        int total = allDice + modifier;
        System.out.println("Your roll plus modifiers is " + total);
        scan.close();
    }
}
