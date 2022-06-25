package com.example.roomworld.DATA;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Pustaka.class}, version = 1)
public abstract class PustakaDatabase extends RoomDatabase {
    public abstract PustakaDao pustakaDao();
}
