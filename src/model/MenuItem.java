package model;

public class MenuItem
{
    private String Name;
    private int ID;
    private double Preis;

    public MenuItem(String name, int ID, double preis)
        {
        Name = name;
        this.ID = ID;
        Preis = preis;
        }

    public String getName()
        {
        return Name;
        }

    public void setName(String name)
        {
        Name = name;
        }

    public int getID()
        {
        return ID;
        }

    public void setID(int ID)
        {
        this.ID = ID;
        }

    public double getPreis()
        {
        return Preis;
        }

    public void setPreis(double preis)
        {
        Preis = preis;
        }

    @Override
    public String toString()
        {
        return
                Name + " - " + Preis +
                        " EURO";
        }
}
