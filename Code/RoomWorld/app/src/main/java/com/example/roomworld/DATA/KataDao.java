package com.example.roomworld.DATA;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface KataDao {
    @Insert
    void insertAll(Kata... kata);

    @Query("SELECT * FROM Kata")
    List<Kata> getAllKata();
}
