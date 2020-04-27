package com.example.csproject;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.csproject.StoryStuff.Event;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class EventUpdateTest {
    private Context context = ApplicationProvider.getApplicationContext();
    Event event1 = new Event( "Introduction/", context );

    @Test
    public void eventUpdateDescription()
    {
        String actualDescription =
                "You find yourself waiting in line in a coffee shop. The barista states "
                + "\"I can help whoever is next.\". You notice you are now at the front of "
                + "the line and so you take a step forward to the counter. The barista asks "
                + "\"What would you like, detective?\".";
        event1.setEventFileName( "CoffeeShopIntro.txt" );
        event1.updateDescription( "CoffeeShop/" );
        assertEquals( event1.getDescription(), actualDescription );
    }

    @Test
    public void eventUpdatePaths()
    {
        String[] expectedArray = { "CoffeeShopPathOne.txt",
                "CoffeeShopPathTwo.txt",
                "CoffeeShopPathThree.txt",
                "CoffeeShopPathFour.txt" };
        event1.setEventFileName( "CoffeeShopIntro.txt" );
        event1.updateChoicePaths( "CoffeeShop/" );
        assertArrayEquals( event1.getChoicePaths(), expectedArray );
    }

    @Test
    public void eventUpdateChoices()
    {
        String[] expectedArray = { "Black Coffee",
                "Hot Mocha",
                "Iced Mocha Frapuccino with whipped cream and chocolate syrup drizzle",
                "Egg Sandwich" };
        event1.setEventFileName( "CoffeeShopIntro.txt" );
        event1.updateChoices( "CoffeeShop/" );
        assertArrayEquals( event1.getChoices(), expectedArray );
    }
}