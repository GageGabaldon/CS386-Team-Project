package com.example.csproject.Characters;


import android.util.Log;

import java.util.ArrayList;

public final class Player
{
    private static final Player player = new Player();
    // fields
    private String name;
    private final int MAXHEALTH = 100;
    private int health;
    private int moralityScore;

    public ArrayList<Item> inventory;

    private Player()
    {
        name = "Detective";
        health = MAXHEALTH;
        moralityScore = 0;
        inventory = new ArrayList<>();
    }
    public static Player getInstance()
    {
        return player;
    }
    public void setName(String newName)
    {
        name = newName;
        Log.d("Player's Name Set: ", name );
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
