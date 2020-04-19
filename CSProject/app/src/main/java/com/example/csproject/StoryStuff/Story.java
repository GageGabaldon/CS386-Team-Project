package com.example.csproject.StoryStuff;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Story {
    /* declaration of the event object and initialization of unplayable events (complete or unreachable)
    array and currentStoryID
     */
    private Event currentEvent;
    private String storyDirectory;


    Story()
    {
        storyDirectory = "Introduction";
        currentEvent = new Event( storyDirectory );
    }
    
    /**
     *
     * @return returns the event ID for the current event
     */
    public String getEventFileName()
    {
        return currentEvent.getEventFileName();
    }

    /**
     * updates the unplayable events array to include the current event as well as any events
     * that can no longer be played because of choices. How can this be done? This game currently runs
     * through events linearly.
     */
    public void updateEvents( int choiceMade )
    {
        // updates current event
        currentEvent.updateCurrentEvent( storyDirectory, choiceMade );
    }

    public String getEventDescription()
    {
        return currentEvent.getDescription();
    }

    public String[] getAvailableChoices()
    {
        return currentEvent.getChoices();
    }

    // Missing NPC methods for now.
}
