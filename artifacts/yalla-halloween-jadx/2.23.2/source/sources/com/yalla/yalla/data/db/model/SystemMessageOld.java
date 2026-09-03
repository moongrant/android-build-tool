package com.yalla.yalla.data.db.model;

import androidx.compose.foundation.layout.OooO0O0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes4.dex */
@Entity(indices = {@Index(unique = true, value = {"midx"})}, tableName = "SystemMessage")
@Deprecated
public class SystemMessageOld {

    @ColumnInfo(name = "content")
    public String content;

    @ColumnInfo(name = "data")
    public String data;

    @ColumnInfo(name = "datetime")
    public String datetime;

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    @ColumnInfo(name = "isRead")
    public boolean isRead = false;

    @ColumnInfo(name = "localtime")
    public long localtime;

    @ColumnInfo(name = "midx")
    public String mid;

    @ColumnInfo(name = "topic_id")
    public long topicId;

    @ColumnInfo(name = "topic_state")
    public int topicState;

    @ColumnInfo(name = "type_code")
    public int type_code;

    @ColumnInfo(name = "uid")
    public String uid;

    public String toString() {
        StringBuilder sb = new StringBuilder("SystemMessage{id=");
        sb.append(this.id);
        sb.append(", type_code=");
        sb.append(this.type_code);
        sb.append(", mid='");
        sb.append(this.mid);
        sb.append("', data='");
        sb.append(this.data);
        sb.append("', content='");
        sb.append(this.content);
        sb.append("', localtime=");
        sb.append(this.localtime);
        sb.append(", datetime='");
        sb.append(this.datetime);
        sb.append("', uid='");
        sb.append(this.uid);
        sb.append("', isRead=");
        sb.append(this.isRead);
        sb.append(", topicId=");
        sb.append(this.topicId);
        sb.append(", topicState=");
        return OooO0O0.OooO00o(sb, this.topicState, '}');
    }
}
