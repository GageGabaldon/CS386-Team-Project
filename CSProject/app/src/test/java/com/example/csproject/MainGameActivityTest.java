package com.example.csproject;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MainGameActivityTest
{
    MainGameActivity mg;
    @Mock
    Context context;
    @Mock
    UpdateGame upgame;

    @Test
    public void testButtons()
    {
        mg = new MainGameActivity();
        int expected = 0;
        assertEquals(expected, mg.getButton(R.id.option1));
    }
    @Test
    public void testUpdateText()
    {

    }
    @Test
    public void testUpdateButtons()
    {

    }

}
