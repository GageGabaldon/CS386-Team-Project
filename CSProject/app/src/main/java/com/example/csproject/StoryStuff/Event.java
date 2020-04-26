package com.example.csproject.StoryStuff;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.example.csproject.DataAccess;
import com.example.csproject.MainGameActivity;
import com.example.csproject.MainPage2;


public class Event
{
    /*
    This class is in charge of providing the description of the event and the choices available for
    this event. This object will be updated constantly, member states will change.
     */
    private String eventFileName;
    private String eventDescription;
    private String storyDirectory;
    private String[] choices;
    private String[] choicePath;
    private Context context;
    // buffer stores data for event or choices temporarily
    private DataAccess accessBuffer;

    public Event( String storyDirectory, Context context)
    {
        this.context = context;
        eventFileName = "Introduction.txt";
        this.storyDirectory = storyDirectory;
        choices = new String[ 4 ];
        choicePath = new String[ 4 ];
        accessBuffer = new DataAccess(context);
        updateDescription( this.storyDirectory );
        updateChoices( this.storyDirectory );
        updateChoicePaths( this.storyDirectory );
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
        eventDescription = accessBuffer.getEventDescription( storyDir, eventFileName);
    }

    /**
     * Updates the available choices for the event using data access class object.
     *
     */
    public void updateChoices( String storyDir )
    {
        // choiceBuffer will return a 2d string array which will need to be passed out to each choice
        // and choice path index in. first index is choices, second is choice paths
        String[] tempChoices = accessBuffer.getEventChoices( storyDir, eventFileName);
        int cIndex = 0;
        for( String choice : tempChoices )
        {
            if( choice != "" )
            {
                choices[ cIndex ] = choice;
            }
            else
            {
                choices[ cIndex ] = "";
            }

            cIndex++;
        }
    }

    public void updateChoicePaths( String storyDir )
    {
        String[] tempPaths = accessBuffer.getChoicePaths( storyDir, eventFileName);
        int cIndex = 0;
        for( String path : tempPaths )
        {
            if( path != "" )
            {
                choicePath[ cIndex ] = path;
            }
            else
            {
                choicePath[ cIndex ] = "";
            }

            cIndex++;
        }
    }

    /**
    * Method receives the choice made, and the current event in the story.
    * Updates description and choices available for the player.
    * Returns the ID for the next event.
     */
    public void updateCurrentEvent( int choice )
    {
        //update the event file name with verifyChoice otherwise
        eventFileName = choicePath[ choice ].trim();
        //If the new path is the end of the story, set directory to our main hub, the local precinct

        if( eventFileName.compareTo( "Dreams" ) == 0 )
        {
            storyDirectory = "Dreams/";
            eventFileName = "dreamsbeginning.txt";
        }
        else if( eventFileName.compareTo( "Coffee Intro" ) == 0 )
        {
            storyDirectory = "CoffeeShop/";
            eventFileName = "CoffeeShopIntro.txt";
        }
        else if( eventFileName.compareTo( ""))
        else if( eventFileName.compareTo( "Enter Name" ) == 0 )
        {

            storyDirectory = "CoffeeShop/";
            eventFileName = "CoffeeShopOutro.txt";
        }
        else if( eventFileName.compareTo( "Warehouse" ) == 0 )
        {
            storyDirectory = "Warehouse/";
            eventFileName = "WarehouseIntro.txt";
        }
        else if( eventFileName.compareTo( "Story End" ) == 0 )
        {
            storyDirectory = "Hub/";
            eventFileName = "Precinct.txt";
        }
        // uses updateChoices and updateDescription
        updateDescription( storyDirectory );
        updateChoices( storyDirectory );
        updateChoicePaths( storyDirectory );
    }

    public void changeIntent()
    {
        Intent intent = new Intent(context, MainPage2.class);
        context.startActivity(intent);
    }
}
