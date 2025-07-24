package model;

import java.util.ArrayList;

public class MenuUtils
{
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
