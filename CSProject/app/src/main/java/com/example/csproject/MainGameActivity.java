package com.example.csproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.csproject.db.AppDatabase;

public class MainGameActivity extends AppCompatActivity {
    UpdateGame upgame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);
        upgame = new UpdateGame();
    }

    public void clickedOption(View view)
    {
        Button buttonfind = (Button) findViewById(view.getId());
        String buttonoption = (String)buttonfind.getText();
        String button1;
        String button2;
        String button3;
        String button4;
        String button5;
        String button6;
        String newText;

        upgame.updateStory(buttonoption);
        button1 = upgame.newButton(1);
        button2 = upgame.newButton(1);
        button3 = upgame.newButton(1);
        button4 = upgame.newButton(1);
        button5 = upgame.newButton(1);
        button6 = upgame.newButton(1);

        newText = upgame.newText();

        updateScreen(newText);
        updateButton1(button1);
        updateButton2(button2);
        updateButton3(button3);
        updateButton4(button4);

    }

    public void updateScreen(String text)
    {
        TextView textview = (TextView) findViewById(R.id.main_text);
        textview.setText(text);
    }

    public void updateButton1(String newButtonText)
    {
        Button button = (Button) findViewById(R.id.option1);

        button.setText(newButtonText);
    }

    public void updateButton2(String newButtonText)
    {
        Button button = (Button) findViewById(R.id.option2);

        button.setText(newButtonText);
    }

    public void updateButton3(String newButtonText)
    {
        Button button = (Button) findViewById(R.id.option3);

        button.setText(newButtonText);
    }

    public void updateButton4(String newButtonText)
    {
        Button button = (Button) findViewById(R.id.option4);

        button.setText(newButtonText);
    }

}
