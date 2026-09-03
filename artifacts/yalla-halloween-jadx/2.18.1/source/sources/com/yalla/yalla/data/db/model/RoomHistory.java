package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index(unique = true, value = {"repeat"})})
public class RoomHistory {

    @ColumnInfo(name = "barid")
    public String barid;

    @ColumnInfo(name = "baridx")
    public String baridx;

    @ColumnInfo(name = "barimage")
    public String barimage;

    @ColumnInfo(name = "barlevel")
    public String barlevel;

    @ColumnInfo(name = "barname")
    public String barname;

    @ColumnInfo(name = "bartype")
    public String bartype;

    @ColumnInfo(name = "countryid")
    public String countryid;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "isencrypt")
    public String isencrypt;

    @ColumnInfo(name = "isofficial")
    public int isofficial;
    public int istop = 0;

    @ColumnInfo(name = "labelname")
    public String labelname;

    @ColumnInfo(name = "medal")
    public String medal;

    @ColumnInfo(name = "notice")
    public String notice;

    @ColumnInfo(name = "repeat")
    public String repeat;

    @ColumnInfo(name = "roomserverip")
    public String roomserverip;

    @ColumnInfo(name = "time")
    public long time;

    @ColumnInfo(name = "uid")
    public String uid;
}
