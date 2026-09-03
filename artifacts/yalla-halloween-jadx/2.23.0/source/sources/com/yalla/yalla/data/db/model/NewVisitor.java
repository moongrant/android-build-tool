package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes4.dex */
@Entity(indices = {@Index(unique = true, value = {"visitorid"})}, tableName = "NewVisitor")
@Deprecated
public class NewVisitor {

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "uid")
    public String uid;

    @ColumnInfo(name = "visitorid")
    public String visitorId;
}
