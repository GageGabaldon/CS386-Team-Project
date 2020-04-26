package com.example.csproject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MainGameActivityTest
{
    MainGameActivity mg;
    UpdateGame upgame;

    @Test
    public void testButtons()
    {
        mg = new MainGameActivity();
        int expected = 0;
        assertEquals(expected, mg.getButton(R.id.option1));
    }

    @Test
    public void testupdatescreen()
    {
        upgame = mock(UpdateGame.class);
        String[] array ={"Continue...", "", "", ""};
        when(upgame.getChoices()).thenReturn(array);
        when(upgame.updateMainGameText()).thenReturn("Welcome to Text Adventure Game. In this game you make your own story based on the decisions you make. Each choice you make will define your path and what you see. Enjoy!");
        mg = new MainGameActivity();
        mg.setupGame();
    }
}
