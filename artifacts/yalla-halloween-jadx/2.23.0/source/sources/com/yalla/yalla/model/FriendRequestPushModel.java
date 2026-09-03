package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jc\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u000b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\bHÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018¨\u0006,"}, d2 = {"Lcom/yalla/yalla/model/FriendRequestPushModel;", "Lcom/yalla/yalla/model/BasePushMessage;", "userId", "", "userIdx", "", "userName", "userLevel", "", "userAvatar", "vip", "", "vipLevel", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "time", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;J)V", "getMessage", "()Ljava/lang/String;", "getTime", "()J", "getUserAvatar", "getUserId", "getUserIdx", "getUserLevel", "()I", "getUserName", "getVip", "()Z", "getVipLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FriendRequestPushModel extends BasePushMessage {
    public static final int $stable = 0;

    @NotNull
    private final String message;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendRequestPushModel(long j, @NotNull String userIdx, @NotNull String userName, int i, @NotNull String userAvatar, boolean z, int i2, @NotNull String message, long j2) {
        super(0L, 1, null);
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(message, "message");
        this.userId = j;
        this.userIdx = userIdx;
        this.userName = userName;
        this.userLevel = i;
        this.userAvatar = userAvatar;
        this.vip = z;
        this.vipLevel = i2;
        this.message = message;
        this.time = j2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserIdx() {
        return this.userIdx;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserAvatar() {
        return this.userAvatar;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getVip() {
        return this.vip;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVipLevel() {
        return this.vipLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final FriendRequestPushModel copy(long userId, @NotNull String userIdx, @NotNull String userName, int userLevel, @NotNull String userAvatar, boolean vip, int vipLevel, @NotNull String message, long time) {
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(message, "message");
        return new FriendRequestPushModel(userId, userIdx, userName, userLevel, userAvatar, vip, vipLevel, message, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendRequestPushModel)) {
            return false;
        }
        FriendRequestPushModel friendRequestPushModel = (FriendRequestPushModel) other;
        return this.userId == friendRequestPushModel.userId && Intrinsics.areEqual(this.userIdx, friendRequestPushModel.userIdx) && Intrinsics.areEqual(this.userName, friendRequestPushModel.userName) && this.userLevel == friendRequestPushModel.userLevel && Intrinsics.areEqual(this.userAvatar, friendRequestPushModel.userAvatar) && this.vip == friendRequestPushModel.vip && this.vipLevel == friendRequestPushModel.vipLevel && Intrinsics.areEqual(this.message, friendRequestPushModel.message) && this.time == friendRequestPushModel.time;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
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
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        long j = this.userId;
        int iOooO00o = o0OO00O.OooO00o(this.userAvatar, (o0OO00O.OooO00o(this.userName, o0OO00O.OooO00o(this.userIdx, ((int) (j ^ (j >>> 32))) * 31, 31), 31) + this.userLevel) * 31, 31);
        boolean z = this.vip;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iOooO00o2 = o0OO00O.OooO00o(this.message, (((iOooO00o + r1) * 31) + this.vipLevel) * 31, 31);
        long j2 = this.time;
        return iOooO00o2 + ((int) ((j2 >>> 32) ^ j2));
    }

    @NotNull
    public String toString() {
        return "FriendRequestPushModel(userId=" + this.userId + ", userIdx=" + this.userIdx + ", userName=" + this.userName + ", userLevel=" + this.userLevel + ", userAvatar=" + this.userAvatar + ", vip=" + this.vip + ", vipLevel=" + this.vipLevel + ", message=" + this.message + ", time=" + this.time + ")";
    }
}
