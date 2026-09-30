/**
 * Inventory handles displaying inventory records.
 */
public class Inventory {
    /**
     * Displays all items in the inventory that are not empty.
     *
     * @param names  Array of item names.
     * @param prices Array of item prices.
     * @param stocks Array of item quantities in stock.
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        System.out.println("Inventory:");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i] + " - $" + prices[i] + " - Stock: " + stocks[i]);
            }
        }
    }
}
