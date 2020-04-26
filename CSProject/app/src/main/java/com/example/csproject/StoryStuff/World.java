package com.example.csproject.StoryStuff;

import android.content.Context;
import android.util.Log;

import com.example.csproject.Characters.Player;

import java.util.ArrayList;

    /**
     * This class provides the latest information on the story state. The events, past and current.
     * The current description and the available choices as well as choices made.
     */
public class World
{
    private ArrayList<String> playedStories;
    private Story currentStory;

    public World(Context context)
    {
        // Story object is created which instantiates the first event in the story, adds story to
        //played stories array list
        currentStory = new Story(context);
        playedStories = new ArrayList<>();
        playedStories.add( currentStory.getEventFileName());
    }

    /**
    * adds current story to played stories array if not already in it, then updates the events for the current story.
    * If there are no events left, the story needs to end and return to the "hub" or precinct.
     */
    public void updateStory( int choice )
    {
        if( !playedStories.contains( currentStory.getEventFileName() ) )
            playedStories.add( currentStory.getEventFileName() );
        else
            currentStory.setCurrentEventFileName( "No Replay" );
        currentStory.updateEvents( choice );
    }

    /**
     *
     * @return
     */
    public String getCurrentDescription()
    {
        String descriptionIncludingName = currentStory.getEventDescription();
        Log.d("Name in Description: ", Player.getInstance().getName());
        return descriptionIncludingName.replaceAll( "playerName", Player.getInstance().getName() );
    }

    public String[] getChoices()
    {
        return currentStory.getAvailableChoices();
    }

    public void updatePlayer(String name)
    {
        Player.getInstance().setName(name);
    }
}
