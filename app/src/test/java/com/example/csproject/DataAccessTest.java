package com.example.csproject;
import android.content.Context;
import android.provider.ContactsContract;

import androidx.test.core.app.ApplicationProvider;

import org.junit.Assert;
import org.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class DataAccessTest
{
    @Mock
    Context context;
    DataAccess da;
    String testDirectory = "Introduction/";
    String testFile = "Introduction.txt";

    @Test
    public void testDataAccess()
    {
        String filepath = "Plot/Story/Introduction/Introduction.txt";
        String exampleinfo = "Welcome to Text Adventure Game. In this game you make your own story based on the decisions you make. Each choice you make will define your path and what you see. Enjoy!\n" +
                "1Continue...@Coffee Intro\n";
        DataAccess da = new DataAccess(context);
        String actualreading = da.readFile(filepath);
        assertEquals(exampleinfo, actualreading);
    }
}
