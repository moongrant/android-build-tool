package com.yalla.yalla.data.db.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.o0OoOo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
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
    public String uid;

    public TopicRecentTable() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        this.uid = o0OoOo0.OooO00o();
    }
}
