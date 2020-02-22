package com.example.csproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainPage2.class);
        startActivity(intent);
    }
    public void sendAbout(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
    public void sendSettings(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
