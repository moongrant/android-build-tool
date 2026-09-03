package com.yalla.yalla.model;

import Oooo000.o000O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\rHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003Jw\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0005HÆ\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001c¨\u00061"}, d2 = {"Lcom/yalla/yalla/model/FriendRequestPushModel;", "", "mid", "", "receiverId", "", "userId", "userIdx", "userName", "userLevel", "", "userAvatar", "vip", "", "vipLevel", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "time", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getMid", "getReceiverId", "()J", "getTime", "getUserAvatar", "getUserId", "getUserIdx", "getUserLevel", "()I", "getUserName", "getVip", "()Z", "getVipLevel", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class FriendRequestPushModel {
    public static final int $stable = 0;

    @NotNull
    private final String message;

    @NotNull
    private final String mid;
    private final long receiverId;
    private final long time;

    @SerializedName("userAvater")
    @NotNull
    private final String userAvatar;
    private final long userId;

    @NotNull
    private final String userIdx;
    private final int userLevel;

    @NotNull
    private final String userName;
    private final boolean vip;
    private final int vipLevel;

    public FriendRequestPushModel(@NotNull String mid, long j, long j2, @NotNull String userIdx, @NotNull String userName, int i, @NotNull String userAvatar, boolean z, int i2, @NotNull String message, long j3) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(message, "message");
        this.mid = mid;
        this.receiverId = j;
        this.userId = j2;
        this.userIdx = userIdx;
        this.userName = userName;
        this.userLevel = i;
        this.userAvatar = userAvatar;
        this.vip = z;
        this.vipLevel = i2;
        this.message = message;
        this.time = j3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMid() {
        return this.mid;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getReceiverId() {
        return this.receiverId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserIdx() {
        return this.userIdx;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUserAvatar() {
        return this.userAvatar;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getVip() {
        return this.vip;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getVipLevel() {
        return this.vipLevel;
    }

    @NotNull
    public final FriendRequestPushModel copy(@NotNull String mid, long receiverId, long userId, @NotNull String userIdx, @NotNull String userName, int userLevel, @NotNull String userAvatar, boolean vip, int vipLevel, @NotNull String message, long time) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(message, "message");
        return new FriendRequestPushModel(mid, receiverId, userId, userIdx, userName, userLevel, userAvatar, vip, vipLevel, message, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendRequestPushModel)) {
            return false;
        }
        FriendRequestPushModel friendRequestPushModel = (FriendRequestPushModel) other;
        return Intrinsics.areEqual(this.mid, friendRequestPushModel.mid) && this.receiverId == friendRequestPushModel.receiverId && this.userId == friendRequestPushModel.userId && Intrinsics.areEqual(this.userIdx, friendRequestPushModel.userIdx) && Intrinsics.areEqual(this.userName, friendRequestPushModel.userName) && this.userLevel == friendRequestPushModel.userLevel && Intrinsics.areEqual(this.userAvatar, friendRequestPushModel.userAvatar) && this.vip == friendRequestPushModel.vip && this.vipLevel == friendRequestPushModel.vipLevel && Intrinsics.areEqual(this.message, friendRequestPushModel.message) && this.time == friendRequestPushModel.time;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMid() {
        return this.mid;
    }

    public final long getReceiverId() {
        return this.receiverId;
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getUserAvatar() {
        return this.userAvatar;
    }

    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserIdx() {
        return this.userIdx;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    @NotNull
    public final String getUserName() {
        return this.userName;
    }

    public final boolean getVip() {
        return this.vip;
    }

    public final int getVipLevel() {
        return this.vipLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    public int hashCode() {
        int iHashCode = this.mid.hashCode() * 31;
        long j = this.receiverId;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.userId;
        int iOooO00o = o0O0O00.OooO00o(this.userAvatar, (o0O0O00.OooO00o(this.userName, o0O0O00.OooO00o(this.userIdx, (i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31), 31) + this.userLevel) * 31, 31);
        boolean z = this.vip;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iOooO00o2 = o0O0O00.OooO00o(this.message, (((iOooO00o + r1) * 31) + this.vipLevel) * 31, 31);
        long j3 = this.time;
        return iOooO00o2 + ((int) (j3 ^ (j3 >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FriendRequestPushModel(mid=");
        sbOooO0o0.append(this.mid);
        sbOooO0o0.append(", receiverId=");
        sbOooO0o0.append(this.receiverId);
        sbOooO0o0.append(", userId=");
        sbOooO0o0.append(this.userId);
        sbOooO0o0.append(", userIdx=");
        sbOooO0o0.append(this.userIdx);
        sbOooO0o0.append(", userName=");
        sbOooO0o0.append(this.userName);
        sbOooO0o0.append(", userLevel=");
        sbOooO0o0.append(this.userLevel);
        sbOooO0o0.append(", userAvatar=");
        sbOooO0o0.append(this.userAvatar);
        sbOooO0o0.append(", vip=");
        sbOooO0o0.append(this.vip);
        sbOooO0o0.append(", vipLevel=");
        sbOooO0o0.append(this.vipLevel);
        sbOooO0o0.append(", message=");
        sbOooO0o0.append(this.message);
        sbOooO0o0.append(", time=");
        return o000O0.OooO0O0(sbOooO0o0, this.time, ')');
    }
}
