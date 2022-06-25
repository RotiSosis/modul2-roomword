package com.example.roomworld.DATA;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Kata.class}, version = 1)
public abstract class KataDatabase extends RoomDatabase {
    public abstract KataDao KataDao();
}
