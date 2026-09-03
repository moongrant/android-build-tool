package com.yalla.yalla.model.room;

import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.netdetector.OooO00o;
import com.facebook.appevents.OooOOO0;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yallatech.support.platform.share.bean.ShareRequest;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b¢\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J³\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\bHÖ\u0001J\t\u0010?\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001dR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001d¨\u0006@"}, d2 = {"Lcom/yalla/yalla/model/room/RoomUserRecordModel;", "", "createTime", "", "execUserId", "execUserName", "", "execUserPosition", "", "headUrl", "id", "isForbid", "isVip", "kaVipLv", "nickName", "nvipLv", "prettyId", ContributionFragment.ARG_1, "sex", "type", "userId", "userLevel", "(JJLjava/lang/String;ILjava/lang/String;IIIILjava/lang/String;IJJIIJI)V", "getCreateTime", "()J", "getExecUserId", "getExecUserName", "()Ljava/lang/String;", "getExecUserPosition", "()I", "getHeadUrl", "getId", "getKaVipLv", "getNickName", "getNvipLv", "getPrettyId", "getRoomId", "getSex", "getType", "getUserId", "getUserLevel", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RoomUserRecordModel {
    public static final int $stable = 0;
    private final long createTime;
    private final long execUserId;

    @NotNull
    private final String execUserName;
    private final int execUserPosition;

    @NotNull
    private final String headUrl;
    private final int id;
    private final int isForbid;
    private final int isVip;
    private final int kaVipLv;

    @NotNull
    private final String nickName;
    private final int nvipLv;
    private final long prettyId;
    private final long roomId;
    private final int sex;
    private final int type;
    private final long userId;
    private final int userLevel;

    public RoomUserRecordModel() {
        this(0L, 0L, null, 0, null, 0, 0, 0, 0, null, 0, 0L, 0L, 0, 0, 0L, 0, 131071, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getNvipLv() {
        return this.nvipLv;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getPrettyId() {
        return this.prettyId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getRoomId() {
        return this.roomId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getUserLevel() {
        return this.userLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExecUserId() {
        return this.execUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExecUserName() {
        return this.execUserName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getExecUserPosition() {
        return this.execUserPosition;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeadUrl() {
        return this.headUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getIsForbid() {
        return this.isForbid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getIsVip() {
        return this.isVip;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getKaVipLv() {
        return this.kaVipLv;
    }

    @NotNull
    public final RoomUserRecordModel copy(long createTime, long execUserId, @NotNull String execUserName, int execUserPosition, @NotNull String headUrl, int id, int isForbid, int isVip, int kaVipLv, @NotNull String nickName, int nvipLv, long prettyId, long roomId, int sex, int type, long userId, int userLevel) {
        Intrinsics.checkNotNullParameter(execUserName, "execUserName");
        Intrinsics.checkNotNullParameter(headUrl, "headUrl");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        return new RoomUserRecordModel(createTime, execUserId, execUserName, execUserPosition, headUrl, id, isForbid, isVip, kaVipLv, nickName, nvipLv, prettyId, roomId, sex, type, userId, userLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomUserRecordModel)) {
            return false;
        }
        RoomUserRecordModel roomUserRecordModel = (RoomUserRecordModel) other;
        return this.createTime == roomUserRecordModel.createTime && this.execUserId == roomUserRecordModel.execUserId && Intrinsics.areEqual(this.execUserName, roomUserRecordModel.execUserName) && this.execUserPosition == roomUserRecordModel.execUserPosition && Intrinsics.areEqual(this.headUrl, roomUserRecordModel.headUrl) && this.id == roomUserRecordModel.id && this.isForbid == roomUserRecordModel.isForbid && this.isVip == roomUserRecordModel.isVip && this.kaVipLv == roomUserRecordModel.kaVipLv && Intrinsics.areEqual(this.nickName, roomUserRecordModel.nickName) && this.nvipLv == roomUserRecordModel.nvipLv && this.prettyId == roomUserRecordModel.prettyId && this.roomId == roomUserRecordModel.roomId && this.sex == roomUserRecordModel.sex && this.type == roomUserRecordModel.type && this.userId == roomUserRecordModel.userId && this.userLevel == roomUserRecordModel.userLevel;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getExecUserId() {
        return this.execUserId;
    }

    @NotNull
    public final String getExecUserName() {
        return this.execUserName;
    }

    public final int getExecUserPosition() {
        return this.execUserPosition;
    }

    @NotNull
    public final String getHeadUrl() {
        return this.headUrl;
    }

    public final int getId() {
        return this.id;
    }

    public final int getKaVipLv() {
        return this.kaVipLv;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final int getNvipLv() {
        return this.nvipLv;
    }

    public final long getPrettyId() {
        return this.prettyId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final int getSex() {
        return this.sex;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getUserLevel() {
        return this.userLevel;
    }

    public int hashCode() {
        long j = this.createTime;
        long j2 = this.execUserId;
        int iOooO00o = (OooO0O0.OooO00o(this.nickName, (((((((OooO0O0.OooO00o(this.headUrl, (OooO0O0.OooO00o(this.execUserName, ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31) + this.execUserPosition) * 31, 31) + this.id) * 31) + this.isForbid) * 31) + this.isVip) * 31) + this.kaVipLv) * 31, 31) + this.nvipLv) * 31;
        long j3 = this.prettyId;
        int i = (iOooO00o + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.roomId;
        int i2 = (((((i + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.sex) * 31) + this.type) * 31;
        long j5 = this.userId;
        return ((i2 + ((int) ((j5 >>> 32) ^ j5))) * 31) + this.userLevel;
    }

    public final int isForbid() {
        return this.isForbid;
    }

    public final int isVip() {
        return this.isVip;
    }

    @NotNull
    public String toString() {
        long j = this.createTime;
        long j2 = this.execUserId;
        String str = this.execUserName;
        int i = this.execUserPosition;
        String str2 = this.headUrl;
        int i2 = this.id;
        int i3 = this.isForbid;
        int i4 = this.isVip;
        int i5 = this.kaVipLv;
        String str3 = this.nickName;
        int i6 = this.nvipLv;
        long j3 = this.prettyId;
        long j4 = this.roomId;
        int i7 = this.sex;
        int i8 = this.type;
        long j5 = this.userId;
        int i9 = this.userLevel;
        StringBuilder sbOooO00o = o00O0000.OooO00o("RoomUserRecordModel(createTime=", j, ", execUserId=");
        sbOooO00o.append(j2);
        sbOooO00o.append(", execUserName=");
        sbOooO00o.append(str);
        sbOooO00o.append(", execUserPosition=");
        sbOooO00o.append(i);
        sbOooO00o.append(", headUrl=");
        sbOooO00o.append(str2);
        sbOooO00o.append(", id=");
        sbOooO00o.append(i2);
        sbOooO00o.append(", isForbid=");
        sbOooO00o.append(i3);
        sbOooO00o.append(", isVip=");
        sbOooO00o.append(i4);
        sbOooO00o.append(", kaVipLv=");
        sbOooO00o.append(i5);
        sbOooO00o.append(", nickName=");
        sbOooO00o.append(str3);
        sbOooO00o.append(", nvipLv=");
        sbOooO00o.append(i6);
        OooOOO0.OooO00o(sbOooO00o, ", prettyId=", j3, ", roomId=");
        sbOooO00o.append(j4);
        sbOooO00o.append(", sex=");
        sbOooO00o.append(i7);
        sbOooO00o.append(", type=");
        sbOooO00o.append(i8);
        sbOooO00o.append(", userId=");
        sbOooO00o.append(j5);
        sbOooO00o.append(", userLevel=");
        sbOooO00o.append(i9);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public RoomUserRecordModel(long j, long j2, @NotNull String str, int i, @NotNull String str2, int i2, int i3, int i4, int i5, @NotNull String str3, int i6, long j3, long j4, int i7, int i8, long j5, int i9) {
        OooO00o.OooO00o(str, "execUserName", str2, "headUrl", str3, "nickName");
        this.createTime = j;
        this.execUserId = j2;
        this.execUserName = str;
        this.execUserPosition = i;
        this.headUrl = str2;
        this.id = i2;
        this.isForbid = i3;
        this.isVip = i4;
        this.kaVipLv = i5;
        this.nickName = str3;
        this.nvipLv = i6;
        this.prettyId = j3;
        this.roomId = j4;
        this.sex = i7;
        this.type = i8;
        this.userId = j5;
        this.userLevel = i9;
    }

    public /* synthetic */ RoomUserRecordModel(long j, long j2, String str, int i, String str2, int i2, int i3, int i4, int i5, String str3, int i6, long j3, long j4, int i7, int i8, long j5, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j, (i10 & 2) != 0 ? 0L : j2, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? 0 : i, (i10 & 16) != 0 ? "" : str2, (i10 & 32) != 0 ? 0 : i2, (i10 & 64) != 0 ? 0 : i3, (i10 & 128) != 0 ? 0 : i4, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0 : i5, (i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 ? str3 : "", (i10 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i6, (i10 & 2048) != 0 ? 0L : j3, (i10 & 4096) != 0 ? 0L : j4, (i10 & 8192) != 0 ? 0 : i7, (i10 & 16384) != 0 ? 0 : i8, (i10 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? 0L : j5, (i10 & 65536) != 0 ? 0 : i9);
    }
}
