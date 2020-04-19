package com.example.csproject.Characters;


public interface UseItemMethod
{

    Player player = new Player();
    Item useItem(Item obj, String objType);

    static void equipmentMethod()
    {
        //in progress
    }

    static void clueMethod()
    {
        //in progress
    }

    static void healMethod()
    {
        player.health += 20;
    }
}
