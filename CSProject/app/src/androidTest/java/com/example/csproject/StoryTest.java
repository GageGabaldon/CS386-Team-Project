package com.example.csproject;
import android.content.Context;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.csproject.StoryStuff.Story;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class StoryTest
{

    private Context context = ApplicationProvider.getApplicationContext();
    Story story = new Story(context);

    @Test
    public void testGetFilename()
    {
        String expected = "Introduction.txt";
        String outputstring = story.getEventFileName();
        assertEquals(expected, outputstring);
    }

    @Test
    public void testGetAvalableChoices()
    {
        String[] expected = {"Continue...", "", "", ""};
        String[] output = story.getAvailableChoices();
        assertArrayEquals(expected, output);
    }

    @Test
    public void testGetDescription()
    {
        String exampleoutput = "Welcome to Text Adventure Game. In this game you make your own story based on the decisions you make. Each choice you make will define your path and what you see. Enjoy!";
        String result = story.getEventDescription();
        assertEquals(exampleoutput, result);
    }
}
