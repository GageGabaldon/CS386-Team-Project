package com.example.csproject.StoryStuff;

public class Location
{
    /* This class is fairly simple, and should not need explaining.
    This class should not be updated. Once the object is made with given data, it is only used
    as a reference for providing the name and description.
     */

    private String locationName;
    // Will we need ID?
    private int locationID;
    private String locationDescription;

    public Location( int newID, String newName, String newDescription )
    {
        locationName = newName;
        locationID = newID;
        locationDescription = newDescription;
    }
    public String getLocation()
    {
        return locationName;
    }

    public int getLocationID()
    {
        return locationID;
    }

    public String getDescription()
    {
        return locationDescription;
    }
}
