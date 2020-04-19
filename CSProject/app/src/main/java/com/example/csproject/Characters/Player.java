package com.example.csproject.Characters;


import java.util.ArrayList;

public class Player
{

    // fields
    private String name;
    private final int MAXHEALTH = 100;
    public int health;
    private int moralityScore;

    public ArrayList<Item> inventory;
    public String location;

    Player()
    {
        name = "";
        health = MAXHEALTH;
        moralityScore = 0;
        inventory = new ArrayList<>();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public int getHealth()
    {
        return health;
    }

    public void updateHealth(int healthChange)
    {
        health += healthChange;
        if(health > MAXHEALTH)
        {
            health = MAXHEALTH;
        }
    }

    public int getMoralityScore()
    {
        return moralityScore;
    }

    public void updateMoralityScore(int moralityScoreChange)
    {
        moralityScore += moralityScoreChange;
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
