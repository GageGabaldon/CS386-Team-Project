package com.example.csproject.Characters;


import java.util.ArrayList;

/**
 * Handles Everything related to the player including their health, name,
 * moralityScore
 *
 */
public class Player
{
    // fields
    private String name;
    private final int MAXHEALTH = 100;
    private int health;
    private int moralityScore;

    public ArrayList<Item> inventory;
    public String location;

    Player()
    {
        name = "PLAYER";
        health = MAXHEALTH;
        moralityScore = 0;
        inventory = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getHealth()
    {
        return health;
    }

    public int getMaxHealth()
    {
        return MAXHEALTH;
    }

    public int getMoralityScore()
    {
        return moralityScore;
    }

    public void updateMoralityScore(int moralityScoreChange)
    {
        moralityScore += moralityScoreChange;
    }

    public void updateHealth(int healthChange)
    {
        health += healthChange;
        if (health > MAXHEALTH)
        {
            health = MAXHEALTH;
        }
    }

    // action being either add or remove
    public void updateInventory(String action, Item item)
    {
        if (action.toLowerCase().equals("remove"))
        {
            inventory.remove(item);
        }
        if (action.toLowerCase().equals("add"))
        {
            inventory.add(item);
        }
    }
}
