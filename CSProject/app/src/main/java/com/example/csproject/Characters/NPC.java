package com.example.csproject.Characters;

public class NPC
{
    private int health;

    NPC()
    {
        setHealth();
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
