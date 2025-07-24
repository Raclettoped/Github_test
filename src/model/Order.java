package model;

import java.util.ArrayList;

public class Order
{
    private final ArrayList<MenuItem> orders;

    public Order()
        {
        orders = new ArrayList<>();
        }

    public void addItem(MenuItem item)
        {
        orders.add(item);
        System.out.println(item.getName() + "wurde hinzugefügt");
        }

    public double getTotal()
        {
        double total = 0.0;
        for (MenuItem item : orders)
            {
            total += item.getPreis();

            }
        return total;

        }

    public void Receipt()
        {
        System.out.println("\n---Deine Bestellung---");
        for (MenuItem item : orders)
            {
            System.out.println("- " + item);
            }
        System.out.println("Gesamtpreis: " + getTotal() + "Euro");
        }


}
