package com.example.roomworld.DATA;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Kata {
    @PrimaryKey(autoGenerate = true)
    public int kid;

    @ColumnInfo(name = "nama_kata")
    public String namaKata;

    public Kata(String namaKata) {
        this.namaKata = namaKata;
    }

    public String getNamaKata() {
        return namaKata;
    }
}
