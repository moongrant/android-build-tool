package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index(unique = true, value = {"repeat"})})
public class RoomJoinHistory {

    @ColumnInfo(name = "barid")
    public String barid;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "repeat")
    public String repeat;

    @ColumnInfo(name = "uid")
    public String uid;
}
