package com.yalla.yalla.data.db.table;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import com.facebook.appevents.OooOOO0;
import com.facebook.share.internal.ShareConstants;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "targetUserId"})}, primaryKeys = {"uid", "targetUserId"}, tableName = "FriendRequestMessageTable")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001e\u0010 \u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Lcom/yalla/yalla/data/db/table/FriendRequestMessage;", "Ljava/io/Serializable;", "()V", "isRead", "", "()Z", "setRead", "(Z)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "mid", "getMid", "setMid", "state", "", "getState", "()I", "setState", "(I)V", "targetUserId", "", "getTargetUserId", "()J", "setTargetUserId", "(J)V", "time", "getTime", "setTime", "uid", "getUid", "setUid", "toString", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FriendRequestMessage implements Serializable {
    public static final int State_Agree = 1;
    public static final int State_Default = 0;
    public static final int State_Expired = 3;
    public static final int State_Pass = -1;
    public static final int State_Refuse = 2;

    @ColumnInfo(name = "isRead")
    private boolean isRead;

    @ColumnInfo(name = ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    @Nullable
    private String message;

    @ColumnInfo(name = "mid")
    @Nullable
    private String mid;

    @ColumnInfo(name = "state")
    private int state;

    @ColumnInfo(name = "targetUserId")
    private long targetUserId;

    @ColumnInfo(name = "time")
    private long time;

    @ColumnInfo(name = "uid")
    private long uid;
    public static final int $stable = 8;

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getMid() {
        return this.mid;
    }

    public final int getState() {
        return this.state;
    }

    public final long getTargetUserId() {
        return this.targetUserId;
    }

    public final long getTime() {
        return this.time;
    }

    public final long getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: isRead, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setMid(@Nullable String str) {
        this.mid = str;
    }

    public final void setRead(boolean z) {
        this.isRead = z;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setTargetUserId(long j) {
        this.targetUserId = j;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setUid(long j) {
        this.uid = j;
    }

    @NotNull
    public String toString() {
        long j = this.uid;
        long j2 = this.targetUserId;
        String str = this.mid;
        int i = this.state;
        String str2 = this.message;
        long j3 = this.time;
        boolean z = this.isRead;
        StringBuilder sbOooO00o = o00O0000.OooO00o("FriendRequestMessage(uid=", j, ", targetUserId=");
        sbOooO00o.append(j2);
        sbOooO00o.append(", mid=");
        sbOooO00o.append(str);
        sbOooO00o.append(", state=");
        sbOooO00o.append(i);
        sbOooO00o.append(", message=");
        sbOooO00o.append(str2);
        OooOOO0.OooO00o(sbOooO00o, ", time=", j3, ", isRead=");
        sbOooO00o.append(z);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }
}
