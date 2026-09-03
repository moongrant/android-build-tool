package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.ui.adapter.message.MessageModelHeadType;

/* JADX INFO: loaded from: classes4.dex */
@Entity(indices = {@Index(unique = true, value = {"midx", "fromid"})})
@Deprecated
public class MessageRecord {

    @ColumnInfo(name = "dtime")
    public long dtime;

    @ColumnInfo(name = "fromid")
    public long fromid;

    @Ignore
    private MessageModelHeadType headType;

    @ColumnInfo(name = "headframeurl")
    public String headframeurl;

    @ColumnInfo(name = "headphoto")
    public String headphoto;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "isread")
    public int isRead;

    @ColumnInfo(name = "isTop")
    @Deprecated
    public int isTop;

    @ColumnInfo(name = "isTopTime")
    public long isTopTime;

    @ColumnInfo(name = "level")
    public int level;

    @ColumnInfo(name = "ltime")
    public long localtime;

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    public String message;

    @ColumnInfo(name = "midx")
    public String mid;

    @ColumnInfo(name = "msgstatus")
    public int msgstatus;

    @ColumnInfo(name = "role")
    public int role;

    @ColumnInfo(name = "scount")
    public int scount;

    @ColumnInfo(name = AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)
    public int status = 0;

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_TITLE)
    public String title;

    @ColumnInfo(name = "toid")
    public long to;

    @ColumnInfo(name = "type")
    public int type;

    public MessageRecord() {
    }

    public MessageModelHeadType getHeadType() {
        return this.headType;
    }

    public String toString() {
        return "MessageRecord{id=" + this.id + ", mid='" + this.mid + "', title='" + this.title + "', message='" + this.message + "', type=" + this.type + ", headphoto='" + this.headphoto + "', scount=" + this.scount + ", fromid=" + this.fromid + ", to=" + this.to + ", level=" + this.level + ", isTop=" + this.isTop + ", isTopTime=" + this.isTopTime + ", dtime=" + this.dtime + ", localtime=" + this.localtime + ", status=" + this.status + ", isRead=" + this.isRead + ", msgstatus=" + this.msgstatus + ", role=" + this.role + ", headframeurl='" + this.headframeurl + "', headType=" + this.headType + '}';
    }

    public MessageRecord(MessageModelHeadType messageModelHeadType) {
        this.headType = messageModelHeadType;
    }
}
