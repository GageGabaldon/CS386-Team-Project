package com.example.csproject;

import androidx.room.Room;

import com.example.csproject.db.AppDatabase;
import com.example.csproject.db.DAO.PlayersDao;
import com.example.csproject.db.Entities.Players;
import com.example.csproject.StoryStuff.Story;

public class UpdateGame {

    Story story;
    AppDatabase db;
    public UpdateGame()
    {
      //  int currentEvent = getCurrentEventNumber();
       // story = new Story(currentEvent);
    }

    public int getCurrentEventNumber()
    {

        PlayersDao playersDao = db.playersDao();

        Players player = playersDao.getAll();

        return player.getEvent();

    }

    public String newButton(int buttonNum)
    {
        String buttontext = story.getChoices(1);

        if(buttontext == null)
        {
            return null;
        }
        return buttontext;
    }

    public void updateStory(String playerchoice)
    {
        story.newChoice(playerchoice);
    }

    public String newText()
    {
        String text = story.getCurrentText();
        return text;
    }
}
