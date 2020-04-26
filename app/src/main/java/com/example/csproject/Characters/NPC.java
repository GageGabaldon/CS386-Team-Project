package com.example.csproject.Characters;

public class NPC
{
    private int health;
    private int maxHealth;

    NPC()
    {
        setMaxHealth();
        setHealth();
    }

    public void setMaxHealth()
    {
        maxHealth = 100;
    }

    public void setHealth()
    {
        health = 100;
    }

    public int getHealth()
    {
        return health;
    }
}
