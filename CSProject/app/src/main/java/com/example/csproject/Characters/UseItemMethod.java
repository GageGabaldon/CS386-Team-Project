package com.example.csproject.Characters;


interface UseItemMethod
{
    Item getItem(Item usedItem);

    static UseItemMethod equipmentMethod()
    {
        //in progress
        return usedItem -> usedItem;
    }

    static UseItemMethod clueMethod()
    {
        //in progress
        return usedItem -> usedItem;
    }

    static UseItemMethod defaultMethod()
    {
        return usedItem -> usedItem;
    }
}
