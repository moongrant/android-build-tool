package com.yalla.yalla.common.db.table;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Entity(indices = {@Index(unique = true, value = {"uid", "targetUserId"})}, primaryKeys = {"uid", "targetUserId"}, tableName = "FriendRequestMessageTable")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001e\u0010 \u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Lcom/yalla/yalla/common/db/table/FriendRequestMessage;", "", "()V", "isRead", "", "()Z", "setRead", "(Z)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "mid", "getMid", "setMid", ServerProtocol.DIALOG_PARAM_STATE, "", "getState", "()I", "setState", "(I)V", "targetUserId", "", "getTargetUserId", "()J", "setTargetUserId", "(J)V", "time", "getTime", "setTime", "uid", "getUid", "setUid", "toString", "Companion", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FriendRequestMessage {
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

    @ColumnInfo(name = ServerProtocol.DIALOG_PARAM_STATE)
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
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("FriendRequestMessage(uid=");
        sbOooO0o0.append(this.uid);
        sbOooO0o0.append(", targetUserId=");
        sbOooO0o0.append(this.targetUserId);
        sbOooO0o0.append(", mid=");
        sbOooO0o0.append(this.mid);
        sbOooO0o0.append(", state=");
        sbOooO0o0.append(this.state);
        sbOooO0o0.append(", message=");
        sbOooO0o0.append(this.message);
        sbOooO0o0.append(", time=");
        sbOooO0o0.append(this.time);
        sbOooO0o0.append(", isRead=");
        return Oooo0.OooO0O0(sbOooO0o0, this.isRead, ')');
    }
}
