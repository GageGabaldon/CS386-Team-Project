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

    public void setEventID( int newID )
    {
        eventID = newID;
    }

    public int getEventID()
    {
        return eventID;
    }

    public String getDescription()
    {
        return eventDescription;
    }

    public String[] getChoices()
    {
        return choices;
    }

    public void updateDescription( int currentStory, int currentEventID )
    {
        // eventBuffer will get string from file, and return the value to the eventDescription
        eventDescription = accessBuffer.getData( currentStory, currentEventID );
    }

    public void updateChoices( int currentStory, int currentEventID )
    {
        // choiceBuffer will return a string array which will need to be passed out to each choice
        String[] tempChoices = accessBuffer.getData( currentStory, currentEventID );
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
        eventID = currentEventID++;
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
        // return next event
        return -1;
    }
}
