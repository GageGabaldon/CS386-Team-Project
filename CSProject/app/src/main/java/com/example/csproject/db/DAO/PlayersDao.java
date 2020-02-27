package com.example.csproject.db.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.csproject.db.Entities.Players;

import java.util.List;

@Dao
public interface PlayersDao {
        @Query("SELECT * FROM Players")
        List<Players> getAll();

        @Insert
        void insertAll(Players... players);

        @Delete
        void delete(Players user);
}


