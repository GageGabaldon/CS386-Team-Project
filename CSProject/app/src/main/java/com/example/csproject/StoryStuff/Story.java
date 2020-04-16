package com.example.csproject.StoryStuff;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Story {
    /* declaration of the event object and initialization of unplayable events (complete or unreachable)
    array and currentStoryID
     */
    private Event currentEvent;
    private ArrayList<Integer> unplayableEvents;
    private int currentStoryID;


    public Story( int newStoryID )
    {
        currentStoryID = newStoryID;
        currentEvent = new Event();
        unplayableEvents = new ArrayList<>();
        // using 0 for choice made and eventID, because this is the start of the story.
        currentEvent.updateCurrentEvent( currentStoryID, 0, 0 );
    }

    public int getCurrentStoryID()
    {
        return currentStoryID;
    }

    public int getEventID()
    {
        return currentEvent.getEventID();
    }
    public String getCurrentDescription()
    {
        return currentEvent.getDescription();
    }

    public String[] getCurrentChoices()
    {
        return currentEvent.getChoices();
    }

    /**
     * updates the unplayable events array to include the current event as well as any events
     * that can no longer be played because of choices. How can this be done? This game currently runs
     * through events linearly.
     */
    public void updateEvents( int choiceMade )
    {
        // adds current event to unplayable events
        if( !unplayableEvents.contains( currentEvent.getEventID() ) )
        unplayableEvents.add( currentEvent.getEventID() );

        // updates current event
        currentEvent.updateCurrentEvent( currentStoryID, choiceMade, currentEvent.getEventID() );
    }

    // Missing NPC methods for now.
}
