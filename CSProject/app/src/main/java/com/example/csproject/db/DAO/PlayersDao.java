package com.example.csproject.db.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.csproject.db.Entities.Players;

import java.util.List;
// this is list of methods that you can call to use database
@Dao
public interface PlayersDao {
        @Query("SELECT * FROM Players")
        Players getAll();


        @Insert
        void insertAll(Players... players);

        @Delete
        void delete(Players user);
}


