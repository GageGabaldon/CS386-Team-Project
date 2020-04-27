package com.example.csproject;
import android.view.View;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
public class MainPage2Test {
    MainPage2 mp2 = new MainPage2();

    @Mock
    private View view;
    @Before
    public void setup()
    {
        MainPage2 mp2 = new MainPage2();
        mp2.setContentView(R.layout.activity_main_page2);
    }
    @Test
    public void testSend()
    {
        view = mock(View.class);
        mp2.sendMessage(view);
    }
}
