import model.MenuItem;
import model.MenuPrinter;
import model.MenuUtils;
import model.Order;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantApp
{
    public static void main(String[] args)
        {

        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        JavaGUI myClass = new JavaGUI();

        ArrayList<MenuItem> menuItems = MenuUtils.getMenuItems();
        MenuPrinter printer = new MenuPrinter();
        printer.printMenu(menuItems);

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

}
