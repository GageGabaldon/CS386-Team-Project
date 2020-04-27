package com.example.csproject;

import android.view.View;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MainGameActivityTest {
    //mock object
    @Mock
    View view;
    MainGameActivity mg= new MainGameActivity();

    @Test
    public void testButtons() {
        int expected = 0;
        assertEquals(expected, mg.getButton(R.id.option1));
    }

}

