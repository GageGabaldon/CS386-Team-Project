package com.example.csproject.Characters;


import java.util.ArrayList;

public class Player implements PlayerStats
{

    // fields
    int health;
    ArrayList<Item> inventory = new ArrayList<>();
    int moralityscore;
    String location;

    public Player()
    {
        health = 100;
        moralityscore = 0;
    }

}
