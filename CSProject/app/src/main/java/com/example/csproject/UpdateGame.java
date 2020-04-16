package com.example.csproject;


import com.example.csproject.StoryStuff.Story;

public class UpdateGame {

    Story story;
    public UpdateGame()
    {
       // story = new Story(currentEvent);
    }

    public String updateMainGameText()
    {
        String storytext = story.getStoryText();
        return storytext;
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
        String buttontext = story.getChoices(1);

        if(buttontext == null)
        {
            return null;
        }
        return buttontext;
    }

    public void updateStory(int buttonchoice)
    {
        story.progressStory(buttonchoice);
    }

}
