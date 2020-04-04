package com.example.csproject.Characters;


import java.util.ArrayList;

public class Player implements PlayerStats
{

    // fields
    private int health;
    private int moralityScore;
    ArrayList<Item> inventory;
    String location;

    Player()
    {
        setHealth();
        setMoralityScore();
        inventory = new ArrayList<>();
    }

    public void setHealth()
    {
        health = 100;
    }

    public void setMoralityScore()
    {
        moralityScore = 0;
    }

    public int getHealth()
    {
        return health;
    }

    public int getMoralityScore()
    {
        return moralityScore;
    }

    public void updateHealth(int healthChange)
    {
        health += healthChange;
    }

    // action being either add or remove
    public void updateInventory(String action, Item item)
    {
        if (action.equals("remove"))
        {
            inventory.remove(item);
        }
        if (action.equals("add"))
        {
            inventory.add(item);
        }
    }
}
