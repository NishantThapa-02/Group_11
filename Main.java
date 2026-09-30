import java.util.scanner;
import java.util.InputMismatchException;

/**
 * Program that utilizes parallel arrays to simulate a grocery management system.
 * Provides a text menu to view the inventory, restock an item, or exit.
 */
public class Main {
    /**
     * Entry point of the program. Sets up the parallel arrays with starting
     * items and runs the user menu until the user chooses to exit.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        Scanner input = new Scanner(System.in);

        itemNames[0] = "Apples";
        itemPrices[0] = 1.50;
        itemStocks[0] = 20;

        itemNames[1] = "Oranges";
        itemPrices[1] = 1.00;
        itemStocks[1] = 25;

        itemNames[2] = "Limes";
        itemPrices[2] = 0.50;
        itemStocks[2] = 50;

        System.out.println("Welcome to the Grocery Management System");

        while (true) {
            System.out.println("Select from the following menus:");
            System.out.println("1. View\n2. Restock\n3. Exit");
            int option = readOption(input);
            input.nextLine();

            if (option == 1) {
                Inventory.printInventory(itemNames, itemPrices, itemStocks);
            }
            else if (option == 2) {
                System.out.print("What item to restock?: ");
                String target = input.nextLine().trim();

                System.out.print("How many will be restocked?: ");
                try {
                    int amount = Integer.parseInt(input.nextLine().trim());
                    if (amount < 0) {
                        System.out.println("Amount cannot be negative.");
                    } else {
                        Restock.restockItem(itemNames, itemStocks, target, amount);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid amount. Please enter a whole number.");
                }
            }
            else {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("-------------------------------------");
        }

        input.close();
    }
}
