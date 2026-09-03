package com.yalla.yalla.data.db.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index({"id", "uid"})}, primaryKeys = {"id", "uid"}, tableName = "FriendsTable")
@Deprecated
public class FriendsTableOld {

    @ColumnInfo(name = "time")
    public long ctime;

    @ColumnInfo(name = "headframeurl")
    public String headframeurl;

    @ColumnInfo(name = "head")
    public String headphoto;

    @ColumnInfo(name = "check_warn")
    public boolean isCheckWarn;

    @ColumnInfo(name = "memoName")
    public String memoName;

    @Ignore
    @Deprecated
    public String remarkname;

    @ColumnInfo(name = "role")
    public int role;

    @ColumnInfo(name = "sign")
    public String sign;

    @ColumnInfo(name = "add_from")
    public String standbyfour;

    @ColumnInfo(name = "idx")
    public String standbyone;

    @ColumnInfo(name = "sex")
    public String standbythree;

    @NonNull
    @ColumnInfo(name = "uid")
    public String standbytwo;

    @ColumnInfo(name = "vip_level")
    public String supervip;

    @NonNull
    @ColumnInfo(name = "id")
    public String userid;

    @ColumnInfo(name = "name")
    public String username;

    @ColumnInfo(name = "vip")
    public String uservip;
}
