package com.yalla.yalla.common.db.table;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "friendId"})}, primaryKeys = {"uid", "friendId"}, tableName = "FriendTable")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001e\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000e¨\u0006!"}, d2 = {"Lcom/yalla/yalla/common/db/table/Friend;", "Ljava/io/Serializable;", "()V", "deleteMark", "", "getDeleteMark", "()Z", "setDeleteMark", "(Z)V", "friendId", "", "getFriendId", "()J", "setFriendId", "(J)V", "inRoom", "getInRoom", "setInRoom", "isCheckUserRisk", "setCheckUserRisk", "memoName", "", "getMemoName", "()Ljava/lang/String;", "setMemoName", "(Ljava/lang/String;)V", "time", "getTime", "setTime", "uid", "getUid", "setUid", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class Friend implements Serializable {
    public static final int $stable = 8;

    @ColumnInfo(name = "deleteMark")
    private boolean deleteMark;

    @ColumnInfo(name = "friendId")
    private long friendId;

    @ColumnInfo(name = "inRoom")
    private boolean inRoom;

    @ColumnInfo(name = "isCheckUserRisk")
    private boolean isCheckUserRisk;

    @ColumnInfo(name = "memoName")
    @Nullable
    private String memoName;

    @ColumnInfo(name = "time")
    private long time;

    @ColumnInfo(name = "uid")
    private long uid;

    public final boolean getDeleteMark() {
        return this.deleteMark;
    }

    public final long getFriendId() {
        return this.friendId;
    }

    public final boolean getInRoom() {
        return this.inRoom;
    }

    @Nullable
    public final String getMemoName() {
        return this.memoName;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: isCheckUserRisk, reason: from getter */
    public final boolean getIsCheckUserRisk() {
        return this.isCheckUserRisk;
    }

    public final void setCheckUserRisk(boolean z) {
        this.isCheckUserRisk = z;
    }

    public final void setDeleteMark(boolean z) {
        this.deleteMark = z;
    }

    public final void setFriendId(long j) {
        this.friendId = j;
    }

    public final void setInRoom(boolean z) {
        this.inRoom = z;
    }

    public final void setMemoName(@Nullable String str) {
        this.memoName = str;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Friend(uid=");
        sbOooO0o0.append(this.uid);
        sbOooO0o0.append(", friendId=");
        sbOooO0o0.append(this.friendId);
        sbOooO0o0.append(", memoName=");
        sbOooO0o0.append(this.memoName);
        sbOooO0o0.append(", time=");
        sbOooO0o0.append(this.time);
        sbOooO0o0.append(", inRoom=");
        sbOooO0o0.append(this.inRoom);
        sbOooO0o0.append(", deleteMark=");
        sbOooO0o0.append(this.deleteMark);
        sbOooO0o0.append(", isCheckUserRisk=");
        return Oooo0.OooO0O0(sbOooO0o0, this.isCheckUserRisk, ')');
    }
}
