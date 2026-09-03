package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index(unique = true, value = {"fansid"})}, tableName = "NewFans")
@Deprecated
public class NewFans {

    @ColumnInfo(name = "fansid")
    public String fansid;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "uid")
    public String uid;
}
