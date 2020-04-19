package com.example.csproject;


import com.example.csproject.StoryStuff.World;

public class UpdateGame {

    World world;
    public UpdateGame()
    {
        world = new World();
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
