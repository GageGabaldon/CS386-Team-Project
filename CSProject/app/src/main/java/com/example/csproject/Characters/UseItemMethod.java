package com.example.csproject.Characters;


public interface UseItemMethod
{

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
        Player.getInstance().updateHealth(20);
    }
}
