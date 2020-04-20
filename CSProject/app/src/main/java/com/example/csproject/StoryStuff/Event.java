package com.example.csproject.StoryStuff;

import android.content.Context;

import com.example.csproject.DataAccess;


public class Event
{
    /*
    This class is in charge of providing the description of the event and the choices available for
    this event. This object will be updated constantly, member states will change.
     */
    private String eventFileName;
    private String eventDescription;
    private String[] choices;
    private String[] choicePath;
    // buffer stores data for event or choices temporarily
    private DataAccess accessBuffer;

    public Event( String storyDirectory, Context context)
    {
        eventFileName = "Introduction.txt";
        choices = new String[ 4 ];
        choicePath = new String[ 4 ];
        accessBuffer = new DataAccess(context);
        updateDescription( storyDirectory );
        updateChoices( storyDirectory );
    }
    /**
     *
     */
    public void setEventFileName( String newFileName )
    {
        eventFileName = newFileName;
    }

    public String getEventFileName()
    {
        return eventFileName;
    }

    /**
     *
     * @return returns description as String object
     */
    public String getDescription()
    {
        return eventDescription;
    }

    /**
     *
     * @return returns String object array of size & capacity 4
     */
    public String[] getChoices()
    {
        return choices;
    }

    /**
     * Uses the data access class object to retrieve data from the files in plot folder
     *
     */
    public void updateDescription( String storyDir )
    {
        // eventBuffer will get string from file, and return the value to the eventDescription
        eventDescription = accessBuffer.getEventDescription( storyDir, eventFileName );
    }

    /**
     * Updates the available choices for the event using data access class object.
     *
     */
    public void updateChoices( String storyDir )
    {
        // choiceBuffer will return a 2d string array which will need to be passed out to each choice
        // and choice path index in. first index is choices, second is choice paths
        String[][] tempChoices = accessBuffer.getEventChoices( storyDir, eventFileName );
        int cIndex = 0;
        for( String choice : tempChoices[0] )
        {
            if( choice != null )
            {
                choices[ cIndex ] = choice;
                choicePath[ cIndex ] = tempChoices[ 1 ][ cIndex ];
            }
            else
            {
                choices[ cIndex ] = "";
            }
            cIndex++;
        }
    }

    /**
    * Method receives the choice made, and the current event in the story.
    * Updates description and choices available for the player.
    * Returns the ID for the next event.
     */
    public void updateCurrentEvent( String storyDir, int choice )
    {
        //update the event file name with verifyChoice otherwise
        eventFileName = choicePath[ choice ];
        //If the new path is the end of the story, set directory to our main hub, the local precinct
        if( eventFileName == "Story End" )
        {
            storyDir = "Dreams";
            eventFileName = "dreamsbeginning.txt";
        }
        else if( eventFileName == "Enter Name" )
        {
            storyDir = "CoffeeShop";
            eventFileName = "CoffeeShopOutro.txt";
        }
        else if( eventFileName == "Coffee Intro" )
        {
            storyDir = "CoffeeShop";
            eventFileName = "CoffeeShopIntro.txt";
        }
        // uses updateChoices and updateDescription
        updateDescription( storyDir );
        updateChoices( storyDir );
    }
}
