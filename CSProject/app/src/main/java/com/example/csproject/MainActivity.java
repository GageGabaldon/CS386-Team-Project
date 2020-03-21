package com.example.csproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.util.Log;
import android.view.View;


import com.example.csproject.db.AppDatabase;
import com.example.csproject.db.Entities.Players;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // createDatabase();
    }

    private void createDatabase() {

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();

    }


    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainPage2.class);
        startActivity(intent);
    }

    /** sends to about activity */
    public void sendAbout(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    /** sends to Settings Activity */
    public void sendSettings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void sendFeedback(View view) {
        Intent intent  = new Intent(this, Feedback.class);
        startActivity(intent);
    }



}
