import model.MenuItem;
import model.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantApp
{
    public static void main(String[] args)
        {
        ArrayList<MenuItem> menuItems = getMenuItems();
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        JavaGUI myClass = new JavaGUI();







        System.out.println("=== Restaurant Menu ===");
        System.out.println();
        for (int i = 0; i < menuItems.size(); i++) {
        System.out.println((i + 1) + ". " + menuItems.get(i));
        }

        System.out.println("Bitte gib deinen Namen ein:");
        String name = scanner.nextLine();


        String weitereItems;
        do {
        System.out.println("Bitte gib die Item-Nummer ein (1-5): ");
        int itemNumber = scanner.nextInt();

        if (itemNumber >= 1 && itemNumber <= menuItems.size()) {
        MenuItem selectedItem = menuItems.get(itemNumber - 1);
        order.addItem(selectedItem);
        } else {
        System.out.println("Ungültige Nummer!");
        }

        System.out.println("Möchtest du noch ein Item hinzufügen? (ja/nein): ");
        weitereItems = scanner.next();

        } while (weitereItems.equalsIgnoreCase("ja"));

        // Finale Bestellung anzeigen
        order.Receipt();
        System.out.println("Vielen Dank für deine Bestellung, " + name + "!");




        }

    public static ArrayList<MenuItem> getMenuItems()
        {
        ArrayList<MenuItem> menutItems = new ArrayList<>();

        MenuItem pizza1 = new MenuItem("Pizza Margherita", 1, 12.99);
        MenuItem pizza2 = new MenuItem("Pizza Salami", 2, 14.99);
        MenuItem pizza3 = new MenuItem("Pizza Funghi", 3, 15.99);
        MenuItem pizza4 = new MenuItem("Kinderpizza", 4, 10.99);
        MenuItem pizza5 = new MenuItem("Pizza Calzone", 5, 20.54);
        menutItems.add(pizza1);
        menutItems.add(pizza2);
        menutItems.add(pizza3);
        menutItems.add(pizza4);
        menutItems.add(pizza5);
        return menutItems;
        }
}
