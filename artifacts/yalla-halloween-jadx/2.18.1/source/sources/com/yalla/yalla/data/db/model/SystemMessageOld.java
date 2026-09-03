package com.yalla.yalla.data.db.model;

import OooO00o.OooO00o;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SystemMessage{id=");
        sbOooO0o0.append(this.id);
        sbOooO0o0.append(", type_code=");
        sbOooO0o0.append(this.type_code);
        sbOooO0o0.append(", mid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.mid, '\'', ", data='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.data, '\'', ", content='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.content, '\'', ", localtime=");
        sbOooO0o0.append(this.localtime);
        sbOooO0o0.append(", datetime='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.datetime, '\'', ", uid='");
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.OooO00o.OooO00o(sbOooO0o0, this.uid, '\'', ", isRead=");
        sbOooO0o0.append(this.isRead);
        sbOooO0o0.append(", topicId=");
        sbOooO0o0.append(this.topicId);
        sbOooO0o0.append(", topicState=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.topicState, '}');
    }
}
