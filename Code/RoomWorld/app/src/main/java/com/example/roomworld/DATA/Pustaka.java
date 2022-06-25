package com.example.roomworld.DATA;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pustaka {
    @PrimaryKey(autoGenerate = true)
    public int pid;

    @ColumnInfo(name = "nama_pustaka")
    public String namaPustaka;

    public Pustaka(String namaPustaka) {
        this.namaPustaka = namaPustaka;
    }

    public String getNamaPustaka() {
        return namaPustaka;
    }
}
