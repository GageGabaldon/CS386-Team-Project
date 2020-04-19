package com.example.csproject.StoryStuff;

import com.example.csproject.DataAccess;


public class Event
{
    /*
    This class is in charge of providing the description of the event and the choices available for
    this event. This object will be updated constantly, member states will change.
     */
    private int eventID;
    private String eventDescription = "";
    private String[] choices = new String[ 4 ];

    // buffer stores data for event or choices temporarily
    private DataAccess accessBuffer = new DataAccess();

    /**
     *
     * @param newID This is used in
     */
    public void setEventID( int newID )
    {
        eventID = newID;
    }

    public int getEventID()
    {
        return eventID;
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
     * @param currentStoryID is the ID for the current story, used with hashtable to find correct folder name
     * @param currentEventID is the ID for the current event, used with hashtable to find correct filename
     */
    public void updateDescription( int currentStoryID, int currentEventID )
    {
        // eventBuffer will get string from file, and return the value to the eventDescription
        eventDescription = accessBuffer.getEventDesription( currentStoryID, currentEventID );
    }

    /**
     * Updates the available choices for the event using data access class object.
     * @param currentStoryID is the ID for the current story, used with hashtable to find correct folder name
     * @param currentEventID is the ID for the current event, used with hashtable to find correct filename
     */
    public void updateChoices( int currentStoryID, int currentEventID )
    {
        // choiceBuffer will return a string array which will need to be passed out to each choice
        String[] tempChoices = accessBuffer.getEventChoice( currentStoryID, currentEventID );
        int cIndex = 0;
        for( String choice : tempChoices )
        {
            choices[ cIndex ] = choice;
            cIndex++;
        }
    }

    /**
    * Method receives the choice made, and the current event in the story.
    * Updates description and choices available for the player.
    * Returns the ID for the next event.
     */
    public void updateCurrentEvent( int currentStory, int choiceMade, int currentEventID )
    {
     // verify choices
        // function: verifyChoices -> Temporarily: provide next event in story
        setEventID( currentEventID++ );
        // uses updateChoices and updateDescription
        updateDescription( currentStory, eventID );
        updateChoices( currentStory, eventID );
    }

    /**
    * Method uses world factors to verify the next event(s) the player can proceed to
    * **Unfinished, bypass for now**
     */
    public int verifyChoice( int[] choicesMade )
    {
        // computes next event possible based on all previously
        int playerMoralStanding = 0;
        for( int choice : choicesMade )
        {
            playerMoralStanding += choice;
        }
        /*
        NOTICE:
        Still in the process of finding a cool and efficient way to decide what the player can do next
        given their choices made thus far, the current event, and perhaps other factors.
         */
        // For now will return the next event based on the number selected for the current event
        return choicesMade[ choicesMade.length - 1 ];
    }
}
