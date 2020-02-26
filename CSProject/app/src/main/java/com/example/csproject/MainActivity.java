package com.example.csproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.csproject.db.GameContract;
import com.example.csproject.db.GameContractHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDatabase();
    }

    private void createDatabase() {
        // Create new helper
        GameContractHelper dbHelper = new GameContractHelper(this);

        // Get the database. If it does not exist, this is where it will
        // also be created.
        SQLiteDatabase db = dbHelper.getWritableDatabase();

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
    public void sendSettings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }



}
