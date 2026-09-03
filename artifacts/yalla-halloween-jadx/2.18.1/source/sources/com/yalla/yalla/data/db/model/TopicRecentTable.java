package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import kotlin.collections.unsigned.OooO00o;
import org.jetbrains.annotations.NotNull;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@Entity(indices = {@Index({"topic_id", "uid"})}, primaryKeys = {"topic_id", "uid"})
public class TopicRecentTable {

    @ColumnInfo(name = "create_time")
    public long createTime;

    @ColumnInfo(name = "topic_id")
    @NotNull
    public long topicId;

    @ColumnInfo(name = "topic_name")
    public String topicName;

    @ColumnInfo(name = "uid")
    @NotNull
    public String uid = OooO00o.OooO0O0(OooOOO.f41216OooO00o);
}
