public class Restock {

    /**
     * Searches the inventory for an item by name and adds the specified amount
     * to its current stock count. If the item does not exist, prints an error message.
     *
     * @param names  Array of item names.
     * @param stocks Array of item stock quantities.
     * @param target The name of the item to restock.
     * @param amount The quantity to add to the existing stock.
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] = stocks[i] + amount;
                System.out.println("Restocked " + names[i] + ". New stock: " + stocks[i]);
                found = true;
                break; // Stop searching after restocking
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

}
