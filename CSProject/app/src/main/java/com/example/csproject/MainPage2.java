package com.example.csproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainPage2 extends AppCompatActivity
{
    UpdateGame upgame;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page2);
        upgame = new UpdateGame(this);
    }

    /** On button click saves play name to database and sends to a different activity*/
    public void sendMessage(View view)
    {
        EditText edittext = (EditText) findViewById(R.id.editText);
        String textString = edittext.getText().toString();
        upgame.setPlayerName(textString);
        finish();
    }


}
