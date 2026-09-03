package com.yalla.yalla.data.db.model;

import androidx.compose.runtime.Oooo0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;

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
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.uid = Oooo0.OooO00o();
    }
}
