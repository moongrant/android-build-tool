package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index(unique = true, value = {"userid"})}, tableName = "NewFriendsTable")
@Deprecated
public class NewFriendsOld {

    @Ignore
    public static final String State_Agree = "agree";

    @Ignore
    public static final String State_Default = "default";

    @Ignore
    public static final String State_New = "new";

    @Ignore
    public static final String State_Refuse = "refuse";

    @ColumnInfo(name = "gender")
    public int gender;

    @ColumnInfo(name = "headphoto")
    public String headphoto;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "isRead")
    public boolean isRead = false;

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    public String message;

    @ColumnInfo(name = "mid")
    public String mid;

    @ColumnInfo(name = "standbyone")
    public String standbyone;

    @ColumnInfo(name = "standbythree")
    public String standbythree;

    @ColumnInfo(name = "standbytwo")
    public String standbytwo;

    @ColumnInfo(name = ServerProtocol.DIALOG_PARAM_STATE)
    public String state;

    @ColumnInfo(name = "time")
    public long time;

    @ColumnInfo(name = "userLevel")
    public int userLevel;

    @ColumnInfo(name = "userid")
    public String userid;

    @ColumnInfo(name = "username")
    public String username;

    @ColumnInfo(name = "uservip")
    public String uservip;

    @ColumnInfo(name = "vip")
    public int vip;

    @ColumnInfo(name = "vipLevel")
    public int vipLevel;
}
