package com.example.csproject.Characters;

import java.util.ArrayList;

public class Item implements UseItemMethod
{
    // fields
    String itemName;
    String itemDescription;


    String itemType;
    Boolean itemState;
    int itemNumber;

    Player player = new Player();

    // constructor
    public Item(String itemName, String itemDescription, String itemType)
    {
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemDescription = itemDescription;

        setItemState();
        setItemNumber();
    }

    public void setItemState()
    {
        itemState = false;
    }

    public void setItemNumber()
    {
        itemNumber = 1;
    }

    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }

    public void setItemType(String itemType)
    {
        this.itemType = itemType;
    }

    /*
    Uses item in the player's current inventory space(arraylist); invoked through choices
     */
    public Item useItem(Item obj, String objType)
    {
        Item usedItem;
        usedItem = obj;
        usedItem.itemType = objType;

        switch(objType)
        {
            case "HealItem":
                UseItemMethod.healMethod();
                break;
            case "ClueItem":
                //progress through the story?
                UseItemMethod.clueMethod();
                break;
            case "EquipmentMethod":
                //add to status?
                UseItemMethod.equipmentMethod();
        }

        usedItem.itemState = true;
        usedItem.itemNumber--;

        // delete item from inventory arraylist in Player class if the number of it == 0
        if(usedItem.itemNumber == 0)
        {
            player.updateInventory("remove", usedItem);
        }

        return usedItem;
    }

}
