package com.example.csproject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MainGameActivityTest
{
    //mock object
    MainGameActivity mg;

    @Mock
    UpdateGame updategame;

    @Before
    public void setup()
    {
        mg = new MainGameActivity();
        updategame = mock(UpdateGame.class);
        mg.setUpdateGame(updategame);
    }
    @Test
    public void testButtons()
    {
        int expected = 0;
        assertEquals(expected, mg.getButton(R.id.option1));
    }

    @Test
    public void testupdatescreen()
    {
        String[] array ={"Continue...", "", "", ""};
        when(updategame.getChoices()).thenReturn(array);
        when(updategame.updateMainGameText()).thenReturn("Welcome to Text Adventure Game. In this game you make your own story based on the decisions you make. Each choice you make will define your path and what you see. Enjoy!");
        mg.setupGame();
    }
}
