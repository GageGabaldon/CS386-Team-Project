package com.example.csproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.csproject.db.AppDatabase;
import com.example.csproject.db.DAO.PlayersDao;
import com.example.csproject.db.Entities.Players;

public class MainPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page2);

    }

    /** On button click saves play name to database and sends to a different activity*/
    public void sendMessage(View view) {
        EditText edittext = (EditText) findViewById(R.id.editText);

        // intiate database and set up a way to add a thing
        AppDatabase db = Room.databaseBuilder(this,
                AppDatabase.class, "database-name").allowMainThreadQueries().build();

        PlayersDao playersDao = db.playersDao();

        String textString = edittext.getText().toString();

        //
        /**
        Players player = new Players();
        player.setFirstName(textString);
        playersDao.insertAll(player);
        **/

        Intent intent2 = new Intent(this, MainGameActivity.class);
        startActivity(intent2);
    }

    // may not be used yet
    private AppDatabase createDatabase() {

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();

        return db;
    }
}
