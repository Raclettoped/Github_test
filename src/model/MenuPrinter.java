package model;

import java.util.ArrayList;

public class MenuPrinter
{
    public void printMenu(ArrayList<MenuItem> menuItems)
        {
        System.out.println("=== Restaurant Menu ===");
        System.out.println();
        for (int i = 0; i < menuItems.size(); i++)
            {
            System.out.println((i + 1) + ". " + menuItems.get(i));
            }

        }
}
