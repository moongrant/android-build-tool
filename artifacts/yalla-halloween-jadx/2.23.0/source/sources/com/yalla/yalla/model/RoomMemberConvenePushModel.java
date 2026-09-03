package com.yalla.yalla.model;

import android.support.v4.media.session.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o000Oo0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jm\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a¨\u0006/"}, d2 = {"Lcom/yalla/yalla/model/RoomMemberConvenePushModel;", "Lcom/yalla/yalla/model/BasePushMessage;", "userId", "", "userIdx", "", "userName", "userLevel", "", "userAvatar", "vip", "", "vipLevel", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "time", ContributionFragment.ARG_1, "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;JJ)V", "getMessage", "()Ljava/lang/String;", "getRoomId", "()J", "getTime", "getUserAvatar", "getUserId", "getUserIdx", "getUserLevel", "()I", "getUserName", "getVip", "()Z", "getVipLevel", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RoomMemberConvenePushModel extends BasePushMessage {
    public static final int $stable = 0;

    @NotNull
    private final String message;
    private final long roomId;
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
    public RoomMemberConvenePushModel(long j, @NotNull String userIdx, @NotNull String userName, int i, @NotNull String userAvatar, boolean z, int i2, @NotNull String message, long j2, long j3) {
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
        this.roomId = j3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getRoomId() {
        return this.roomId;
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
    public final RoomMemberConvenePushModel copy(long userId, @NotNull String userIdx, @NotNull String userName, int userLevel, @NotNull String userAvatar, boolean vip, int vipLevel, @NotNull String message, long time, long roomId) {
        Intrinsics.checkNotNullParameter(userIdx, "userIdx");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userAvatar, "userAvatar");
        Intrinsics.checkNotNullParameter(message, "message");
        return new RoomMemberConvenePushModel(userId, userIdx, userName, userLevel, userAvatar, vip, vipLevel, message, time, roomId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomMemberConvenePushModel)) {
            return false;
        }
        RoomMemberConvenePushModel roomMemberConvenePushModel = (RoomMemberConvenePushModel) other;
        return this.userId == roomMemberConvenePushModel.userId && Intrinsics.areEqual(this.userIdx, roomMemberConvenePushModel.userIdx) && Intrinsics.areEqual(this.userName, roomMemberConvenePushModel.userName) && this.userLevel == roomMemberConvenePushModel.userLevel && Intrinsics.areEqual(this.userAvatar, roomMemberConvenePushModel.userAvatar) && this.vip == roomMemberConvenePushModel.vip && this.vipLevel == roomMemberConvenePushModel.vipLevel && Intrinsics.areEqual(this.message, roomMemberConvenePushModel.message) && this.time == roomMemberConvenePushModel.time && this.roomId == roomMemberConvenePushModel.roomId;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getRoomId() {
        return this.roomId;
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
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
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
        int i = (iOooO00o2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.roomId;
        return i + ((int) ((j3 >>> 32) ^ j3));
    }

    @NotNull
    public String toString() {
        long j = this.userId;
        String str = this.userIdx;
        String str2 = this.userName;
        int i = this.userLevel;
        String str3 = this.userAvatar;
        boolean z = this.vip;
        int i2 = this.vipLevel;
        String str4 = this.message;
        long j2 = this.time;
        long j3 = this.roomId;
        StringBuilder sb = new StringBuilder("RoomMemberConvenePushModel(userId=");
        sb.append(j);
        sb.append(", userIdx=");
        sb.append(str);
        sb.append(", userName=");
        sb.append(str2);
        sb.append(", userLevel=");
        sb.append(i);
        sb.append(", userAvatar=");
        sb.append(str3);
        sb.append(", vip=");
        sb.append(z);
        sb.append(", vipLevel=");
        sb.append(i2);
        sb.append(", message=");
        sb.append(str4);
        OooO0O0.OooO00o(sb, ", time=", j2, ", roomId=");
        return OooO0o.OooO0O0(sb, j3, ")");
    }
}
