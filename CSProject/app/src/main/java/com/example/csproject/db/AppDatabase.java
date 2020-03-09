package com.example.csproject.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.csproject.db.DAO.PlayersDao;
import com.example.csproject.db.Entities.Players;

@Database(entities = {Players.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract PlayersDao playersDao();
}
