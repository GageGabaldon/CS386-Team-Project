package com.example.csproject;


import android.content.Context;
import com.example.csproject.StoryStuff.World;


public class UpdateGame {

    World world;
    public UpdateGame(Context context)
    {
        world = new World(context);
    }

    public String updateMainGameText()
    {
        return world.getCurrentDescription();
    }
    public String[] getChoices()
    {
        return world.getChoices();
    }

    public void updateStory(int buttonchoice)
    {
        world.updateStory(buttonchoice);
    }

}
