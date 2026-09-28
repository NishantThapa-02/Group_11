import java.util.Scanner;
import java.util.InputMismatchException;

/**
* Program that utilizes parallel arrays to simulate a grocery management system.
*/
public class Main {
    public static void main(String[] args) throws Exception {
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
        
        System.out.println("Welcome to the Grocery Managment System");
        
        while(true) {
            System.out.println("Select from the following menus:");
            System.out.println("1. View\n2. Restock\n3. Exit");
            int option = readOption(input);
            input.nextLine();

            if (option == 1) {
                //printInventory(itemNames, itemPrices, itemStocks);
            }
            else if (option == 2) {
                System.out.println("What item to restock?: ");
                String target = input.nextLine();

                System.out.print("How many will be restocked?: ");
                int amount = input.nextInt();

                //restockItem(itemNames, itemStocks, target, amount);
            }
            else {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("-------------------------------------");
        }
        
        input.close();
    }

    /**
     * Reads a valid menu option from the user.
     *
     * @param input the scanner used to read input
     * @return a valid option between 1 and 3
     */
    private static int readOption(Scanner input) {
        while (true) {
            try {
                int value = input.nextInt();
                if (value >= 1 && value <= 3) {
                    return value;
                }
                System.out.println("Please enter either 1, 2 or 3.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }   
        }
    }   
}

