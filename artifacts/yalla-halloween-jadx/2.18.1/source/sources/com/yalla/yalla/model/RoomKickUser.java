package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.UserInfoModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J;\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\bHÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006&"}, d2 = {"Lcom/yalla/yalla/model/RoomKickUser;", "Lcom/yalla/yalla/common/model/UserInfoModel;", "exTime", "", "execUserId", "exNickName", "", "exRole", "", "isForbid", "(JJLjava/lang/String;II)V", "getExNickName", "()Ljava/lang/String;", "setExNickName", "(Ljava/lang/String;)V", "getExRole", "()I", "setExRole", "(I)V", "getExTime", "()J", "setExTime", "(J)V", "getExecUserId", "setExecUserId", "setForbid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RoomKickUser extends UserInfoModel {
    public static final int $stable = 8;

    @NotNull
    private String exNickName;
    private int exRole;
    private long exTime;
    private long execUserId;
    private int isForbid;

    public RoomKickUser() {
        this(0L, 0L, null, 0, 0, 31, null);
    }

    public /* synthetic */ RoomKickUser(long j, long j2, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) == 0 ? j2 : 0L, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getExTime() {
        return this.exTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExecUserId() {
        return this.execUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExNickName() {
        return this.exNickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getExRole() {
        return this.exRole;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIsForbid() {
        return this.isForbid;
    }

    @NotNull
    public final RoomKickUser copy(long exTime, long execUserId, @NotNull String exNickName, int exRole, int isForbid) {
        Intrinsics.checkNotNullParameter(exNickName, "exNickName");
        return new RoomKickUser(exTime, execUserId, exNickName, exRole, isForbid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomKickUser)) {
            return false;
        }
        RoomKickUser roomKickUser = (RoomKickUser) other;
        return this.exTime == roomKickUser.exTime && this.execUserId == roomKickUser.execUserId && Intrinsics.areEqual(this.exNickName, roomKickUser.exNickName) && this.exRole == roomKickUser.exRole && this.isForbid == roomKickUser.isForbid;
    }

    @NotNull
    public final String getExNickName() {
        return this.exNickName;
    }

    public final int getExRole() {
        return this.exRole;
    }

    public final long getExTime() {
        return this.exTime;
    }

    public final long getExecUserId() {
        return this.execUserId;
    }

    public int hashCode() {
        long j = this.exTime;
        long j2 = this.execUserId;
        return ((o0O0O00.OooO00o(this.exNickName, ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31) + this.exRole) * 31) + this.isForbid;
    }

    public final int isForbid() {
        return this.isForbid;
    }

    public final void setExNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.exNickName = str;
    }

    public final void setExRole(int i) {
        this.exRole = i;
    }

    public final void setExTime(long j) {
        this.exTime = j;
    }

    public final void setExecUserId(long j) {
        this.execUserId = j;
    }

    public final void setForbid(int i) {
        this.isForbid = i;
    }

    @Override // com.yalla.yalla.common.model.UserInfoModel, com.yalla.yalla.common.db.table.UserInfo
    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RoomKickUser(exTime=");
        sbOooO0o0.append(this.exTime);
        sbOooO0o0.append(", execUserId=");
        sbOooO0o0.append(this.execUserId);
        sbOooO0o0.append(", exNickName=");
        sbOooO0o0.append(this.exNickName);
        sbOooO0o0.append(", exRole=");
        sbOooO0o0.append(this.exRole);
        sbOooO0o0.append(", isForbid=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.isForbid, ')');
    }

    public RoomKickUser(long j, long j2, @NotNull String exNickName, int i, int i2) {
        Intrinsics.checkNotNullParameter(exNickName, "exNickName");
        this.exTime = j;
        this.execUserId = j2;
        this.exNickName = exNickName;
        this.exRole = i;
        this.isForbid = i2;
    }
}
