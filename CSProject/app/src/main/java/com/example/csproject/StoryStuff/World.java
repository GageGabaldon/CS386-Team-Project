package com.example.csproject.StoryStuff;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

    /**
     * This class provides the latest information on the story state. The events, past and current.
     * The current description and the available choices as well as choices made.
     */
public class World
{
    // Plan to implement class to read directories and return file names in strings to remove hard coding
    //Also, this should probably be placed in DataAccess so that class will have a reference for the hashtable
    private Dictionary<Double, String> fileNameKeys = new Hashtable<Double, String>(){
                                                        { put(1.0, "Introduction.txt");
                                                          put(2.0, "CoffeeShopIntro.txt"); // dependent on the choice in 2.0, you go to either 2.1,.2,.3, or .4 (notice this, button 1, 2, 3, 4) until you go to 3.0 and story ends.
                                                          put(2.1, "CoffeeShopPath1.txt");
                                                          put(2.2, "CoffeeShopPath2.txt");
                                                          put(2.3, "CoffeeShopPath3.txt");
                                                          put(2.4, "CoffeeShopPath4.txt");
                                                          put(3.0, "CoffeeShopOutro.txt");
                                                        }
    };
    /* Idea: Maybe each storyline should be kept in a separate file with a master story directory
    This could be useful for event ID numbering, we wont have large or sub level numbers to worry about.
    Ex. If we don't separate the stories, we will have story 1 with events n, 1.n and if we use choices
    in this as m, this could be a 1.n.m. Instead, we keep track of what story folder we are in and
    can just focus on a single number 1 for event one and so on.
     */
    private ArrayList<Integer> playedStories;
    private ArrayList<Location> allLocations;
    private ArrayList<Integer> choicesMade;
    //private Player player;
    private Story currentStory;

    public World()
    {
        // Story object is created which instantiates the first event in the story
        currentStory = new Story( 0 );
        // construct world locations

    }
    public void updateLocation()
    {
        // knowing the current story

    }

    public void constructLocationList()
    {
        // another hashtable with <name: string, description: string> ? or perhaps use IDs?
    }

    /**
     * adds choice made to choices made array list
      */
    public void updateChoicesMade( ArrayList<Integer> choicesMade, int choiceMade )
    {
        choicesMade.add( choiceMade );
    }

    /**
    * adds current story to played stories array if not already in it, then updates the events for the current story.
    * If there are no events left, the story needs to end and return to the "hub" or precinct.
     */
    public void updateStory( int currentEventID )
    {
        if( !playedStories.contains( currentStory ) )
            playedStories.add( currentStory.getCurrentStoryID() );
        if( hasEvents())
        currentStory.updateEvents( choicesMade.get( choicesMade.size() ) );

    }

    /**
    * For now, this check only accounts for a linear progression through the story ( 1 -> 2 -> 3 -> etc )
    * The plan will be to have this more complex to make story progression more interesting.
     */
    public boolean hasEvents()
    {
        return currentStory.getEventID() < fileNameKeys.size();
    }

    public void updatePlayer()
        {

    }
}
