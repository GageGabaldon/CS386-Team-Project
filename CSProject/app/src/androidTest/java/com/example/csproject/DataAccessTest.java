package com.example.csproject;
import android.content.Context;
import android.util.Log;

import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class DataAccessTest
{
    private Context context = ApplicationProvider.getApplicationContext();
    DataAccess da;
    String foldername = "Introduction/";
    String filename = "Introduction.txt";

    String exampleoutput = "Welcome to Text Adventure Game. In this game you make your own story based on the decisions you make. Each choice you make will define your path and what you see. Enjoy!";


    @Test
    public void testGetDescription()
    {
        da = new DataAccess(context);
        String output = da.getEventDescription(foldername, filename);
        assertEquals(exampleoutput, output);
    }
}
