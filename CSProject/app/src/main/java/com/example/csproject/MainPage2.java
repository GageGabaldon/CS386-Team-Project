package com.example.csproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

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

    public void sendMessage(View view) {
        EditText edittext = (EditText) findViewById(R.id.editText);

        AppDatabase db = Room.databaseBuilder(this,
                AppDatabase.class, "database-name").allowMainThreadQueries().build();

        PlayersDao playersDao = db.playersDao();

        String textString = edittext.getText().toString();

        /**
        Players player = new Players();
        player.setFirstName(textString);
        playersDao.insertAll(player);
        **/

    }
    private AppDatabase createDatabase() {

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name").build();

        return db;
    }
}
