package com.yalla.yalla.data.db.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"cid", "userId"})}, primaryKeys = {"cid", "userId"})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/db/model/ReadPostTable;", "", "()V", "cid", "", "getCid", "()J", "setCid", "(J)V", "readPostId", "getReadPostId", "setReadPostId", "userId", "getUserId", "setUserId", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ReadPostTable {
    public static final int $stable = 8;

    @ColumnInfo(name = "cid")
    private long cid;

    @ColumnInfo(name = "readPostId")
    private long readPostId;

    @ColumnInfo(name = "userId")
    private long userId;

    public final long getCid() {
        return this.cid;
    }

    public final long getReadPostId() {
        return this.readPostId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setCid(long j) {
        this.cid = j;
    }

    public final void setReadPostId(long j) {
        this.readPostId = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
