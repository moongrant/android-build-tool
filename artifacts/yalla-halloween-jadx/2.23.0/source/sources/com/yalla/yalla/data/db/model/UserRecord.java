package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes4.dex */
@Entity(indices = {@Index(unique = true, value = {"userid"})})
@Deprecated
public class UserRecord {

    @ColumnInfo(name = "headframeurl")
    public String headframeurl;

    @ColumnInfo(name = "headurl")
    public String headurl;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "level")
    public int level;

    @ColumnInfo(name = "localtime")
    public long localtime;

    @ColumnInfo(name = "nickname")
    public String nickname;

    @ColumnInfo(name = "prettyId")
    public long prettyId;

    @ColumnInfo(name = "role")
    public int role;

    @ColumnInfo(name = "sex")
    public int sex;

    @ColumnInfo(name = "time")
    public long time;

    @ColumnInfo(name = "userid")
    public long userid;

    @ColumnInfo(name = "vip")
    public int vip;

    @ColumnInfo(name = "vipLevel")
    public int vipLevel;
}
