package com.yalla.yalla.common.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import com.app.base.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "mid"})}, primaryKeys = {"uid", "mid"}, tableName = "SquareEventRoomTable")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/common/db/table/SquareEventRoom;", "", "()V", "eventCreateTime", "", "getEventCreateTime", "()J", "setEventCreateTime", "(J)V", "mid", "", "getMid", "()Ljava/lang/String;", "setMid", "(Ljava/lang/String;)V", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "targetId", "getTargetId", "setTargetId", "userId", "getUserId", "setUserId", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SquareEventRoom {
    public static final int $stable = 8;

    @ColumnInfo(name = "eventCreateTime")
    private long eventCreateTime;

    @ColumnInfo(name = "mid")
    @NotNull
    private String mid = "";

    @ColumnInfo(name = ContributionFragment.ARG_1)
    private long roomId;

    @ColumnInfo(name = "targetId")
    private long targetId;

    @ColumnInfo(name = "uid")
    private long userId;

    public final long getEventCreateTime() {
        return this.eventCreateTime;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getTargetId() {
        return this.targetId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setEventCreateTime(long j) {
        this.eventCreateTime = j;
    }

    public final void setMid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mid = str;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setTargetId(long j) {
        this.targetId = j;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }
}
