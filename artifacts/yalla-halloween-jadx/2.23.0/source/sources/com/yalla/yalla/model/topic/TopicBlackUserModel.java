package com.yalla.yalla.model.topic;

import OooO0OO.OooO0O0;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p069o0000ooO.o0OO00O;
import p082o000OoOo.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0006HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00063"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicBlackUserModel;", "", "createTime", "", "id", "imageurl", "", "nickName", "prettyId", "", "sex", "userId", "vip", "vipLevel", "exUserid", "exRole", "exnickName", "(IILjava/lang/String;Ljava/lang/String;JIJIIJILjava/lang/String;)V", "getCreateTime", "()I", "getExRole", "getExUserid", "()J", "getExnickName", "()Ljava/lang/String;", "getId", "getImageurl", "getNickName", "getPrettyId", "getSex", "getUserId", "getVip", "getVipLevel", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TopicBlackUserModel {
    public static final int $stable = 0;
    private final int createTime;
    private final int exRole;
    private final long exUserid;

    @NotNull
    private final String exnickName;
    private final int id;

    @NotNull
    private final String imageurl;

    @NotNull
    private final String nickName;
    private final long prettyId;
    private final int sex;
    private final long userId;
    private final int vip;
    private final int vipLevel;

    public TopicBlackUserModel() {
        this(0, 0, null, null, 0L, 0, 0L, 0, 0, 0L, 0, null, 4095, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getExUserid() {
        return this.exUserid;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getExRole() {
        return this.exRole;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getExnickName() {
        return this.exnickName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageurl() {
        return this.imageurl;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPrettyId() {
        return this.prettyId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getVip() {
        return this.vip;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getVipLevel() {
        return this.vipLevel;
    }

    @NotNull
    public final TopicBlackUserModel copy(int createTime, int id, @NotNull String imageurl, @NotNull String nickName, long prettyId, int sex, long userId, int vip, int vipLevel, long exUserid, int exRole, @NotNull String exnickName) {
        Intrinsics.checkNotNullParameter(imageurl, "imageurl");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(exnickName, "exnickName");
        return new TopicBlackUserModel(createTime, id, imageurl, nickName, prettyId, sex, userId, vip, vipLevel, exUserid, exRole, exnickName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicBlackUserModel)) {
            return false;
        }
        TopicBlackUserModel topicBlackUserModel = (TopicBlackUserModel) other;
        return this.createTime == topicBlackUserModel.createTime && this.id == topicBlackUserModel.id && Intrinsics.areEqual(this.imageurl, topicBlackUserModel.imageurl) && Intrinsics.areEqual(this.nickName, topicBlackUserModel.nickName) && this.prettyId == topicBlackUserModel.prettyId && this.sex == topicBlackUserModel.sex && this.userId == topicBlackUserModel.userId && this.vip == topicBlackUserModel.vip && this.vipLevel == topicBlackUserModel.vipLevel && this.exUserid == topicBlackUserModel.exUserid && this.exRole == topicBlackUserModel.exRole && Intrinsics.areEqual(this.exnickName, topicBlackUserModel.exnickName);
    }

    public final int getCreateTime() {
        return this.createTime;
    }

    public final int getExRole() {
        return this.exRole;
    }

    public final long getExUserid() {
        return this.exUserid;
    }

    @NotNull
    public final String getExnickName() {
        return this.exnickName;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getImageurl() {
        return this.imageurl;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final long getPrettyId() {
        return this.prettyId;
    }

    public final int getSex() {
        return this.sex;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final int getVip() {
        return this.vip;
    }

    public final int getVipLevel() {
        return this.vipLevel;
    }

    public int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.nickName, o0OO00O.OooO00o(this.imageurl, ((this.createTime * 31) + this.id) * 31, 31), 31);
        long j = this.prettyId;
        int i = (((iOooO00o + ((int) (j ^ (j >>> 32)))) * 31) + this.sex) * 31;
        long j2 = this.userId;
        int i2 = (((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.vip) * 31) + this.vipLevel) * 31;
        long j3 = this.exUserid;
        return this.exnickName.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.exRole) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.createTime;
        int i2 = this.id;
        String str = this.imageurl;
        String str2 = this.nickName;
        long j = this.prettyId;
        int i3 = this.sex;
        long j2 = this.userId;
        int i4 = this.vip;
        int i5 = this.vipLevel;
        long j3 = this.exUserid;
        int i6 = this.exRole;
        String str3 = this.exnickName;
        StringBuilder sbOooO00o = o00000.OooO00o("TopicBlackUserModel(createTime=", i, ", id=", i2, ", imageurl=");
        OooO0O0.OooO00o(sbOooO00o, str, ", nickName=", str2, ", prettyId=");
        sbOooO00o.append(j);
        sbOooO00o.append(", sex=");
        sbOooO00o.append(i3);
        o000Oo0.OooO0O0.OooO00o(sbOooO00o, ", userId=", j2, ", vip=");
        OooOOO0.OooO00o(sbOooO00o, i4, ", vipLevel=", i5, ", exUserid=");
        sbOooO00o.append(j3);
        sbOooO00o.append(", exRole=");
        sbOooO00o.append(i6);
        return OooO0OO.OooO0OO(sbOooO00o, ", exnickName=", str3, ")");
    }

    public TopicBlackUserModel(int i, int i2, @NotNull String str, @NotNull String str2, long j, int i3, long j2, int i4, int i5, long j3, int i6, @NotNull String str3) {
        androidx.compose.compiler.plugins.kotlin.lower.OooO0OO.OooO00o(str, "imageurl", str2, "nickName", str3, "exnickName");
        this.createTime = i;
        this.id = i2;
        this.imageurl = str;
        this.nickName = str2;
        this.prettyId = j;
        this.sex = i3;
        this.userId = j2;
        this.vip = i4;
        this.vipLevel = i5;
        this.exUserid = j3;
        this.exRole = i6;
        this.exnickName = str3;
    }

    public /* synthetic */ TopicBlackUserModel(int i, int i2, String str, String str2, long j, int i3, long j2, int i4, int i5, long j3, int i6, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? "" : str, (i7 & 8) != 0 ? "" : str2, (i7 & 16) != 0 ? 0L : j, (i7 & 32) != 0 ? 0 : i3, (i7 & 64) != 0 ? 0L : j2, (i7 & 128) != 0 ? 0 : i4, (i7 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0 : i5, (i7 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 ? j3 : 0L, (i7 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? 0 : i6, (i7 & 2048) == 0 ? str3 : "");
    }
}
