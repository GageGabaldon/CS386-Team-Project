package com.example.csproject;


import com.example.csproject.StoryStuff.World;

public class UpdateGame {

    World world;
    public UpdateGame()
    {
       // world = new Story(currentEvent);
    }

    public String updateMainGameText()
    {
        String world = world.getStoryText();
        return world;
    }
/*
    public int getCurrentEventNumber()
    {

        PlayersDao playersDao = db.playersDao();

        Players player = playersDao.getAll();

        return player.getEvent();

    }
*/
    public String getButtonText(int buttonNum)
    {
        String buttontext = world.getChoices(1);

        if(buttontext == null)
        {
            return null;
        }
        return buttontext;
    }

    public void updateStory(int buttonchoice)
    {
        world.updateStory(buttonchoice);
    }

}
