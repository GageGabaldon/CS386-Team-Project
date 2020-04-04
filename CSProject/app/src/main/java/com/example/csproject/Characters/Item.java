package com.example.csproject.Characters;

import java.util.ArrayList;

public class Item
{
    // fields
    String itemType;
    Boolean itemState;
    int itemNumber;

    Player player = new Player();

    // constructor
    public Item()
    {
        this.itemState = false;
        this.itemNumber = 1;
    }

    /*
    Uses item in the player's current inventory space(arraylist); invoked through choices
     */
    public Item useItem(Item obj, int inventoryIndex)
    {
        Item usedItem;
        usedItem = obj;

        /* IN PROGRESS
        depending on itemtype, use item accordingly, which means methods for using each??
        item types might include: equipment, important story item(clues), not clues but items that
                                  helps you progress, ie: a key
         */

        usedItem.itemState = true;
        usedItem.itemNumber--;

        // delete item from inventory arraylist in Player class if the number of it == 0
        if(usedItem.itemNumber == 0)
        {
            player.inventory.remove(inventoryIndex);
        }

        return usedItem;
    }

}
