package com.example.roomworld.DATA;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PustakaDao {
    @Insert
    void insertAll(Pustaka... pustaka);

    @Query("SELECT * FROM Pustaka")
    List<Pustaka> getAllPustaka();
}
