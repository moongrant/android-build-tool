package com.yalla.yalla.model.topic;

import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.OooOOO0;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015¨\u0006'"}, d2 = {"Lcom/yalla/yalla/model/topic/TopicManagerModel;", "", "id", "", "userId", "nickName", "", "prettyId", "headUrl", "sex", "", "vip", "vipLevel", "(JJLjava/lang/String;JLjava/lang/String;III)V", "getHeadUrl", "()Ljava/lang/String;", "getId", "()J", "getNickName", "getPrettyId", "getSex", "()I", "getUserId", "getVip", "getVipLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TopicManagerModel {
    public static final int $stable = 0;

    @SerializedName("imageurl")
    @NotNull
    private final String headUrl;
    private final long id;

    @NotNull
    private final String nickName;
    private final long prettyId;
    private final int sex;
    private final long userId;
    private final int vip;
    private final int vipLevel;

    public TopicManagerModel() {
        this(0L, 0L, null, 0L, null, 0, 0, 0, 255, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPrettyId() {
        return this.prettyId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHeadUrl() {
        return this.headUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSex() {
        return this.sex;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVip() {
        return this.vip;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getVipLevel() {
        return this.vipLevel;
    }

    @NotNull
    public final TopicManagerModel copy(long id, long userId, @NotNull String nickName, long prettyId, @NotNull String headUrl, int sex, int vip, int vipLevel) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(headUrl, "headUrl");
        return new TopicManagerModel(id, userId, nickName, prettyId, headUrl, sex, vip, vipLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicManagerModel)) {
            return false;
        }
        TopicManagerModel topicManagerModel = (TopicManagerModel) other;
        return this.id == topicManagerModel.id && this.userId == topicManagerModel.userId && Intrinsics.areEqual(this.nickName, topicManagerModel.nickName) && this.prettyId == topicManagerModel.prettyId && Intrinsics.areEqual(this.headUrl, topicManagerModel.headUrl) && this.sex == topicManagerModel.sex && this.vip == topicManagerModel.vip && this.vipLevel == topicManagerModel.vipLevel;
    }

    @NotNull
    public final String getHeadUrl() {
        return this.headUrl;
    }

    public final long getId() {
        return this.id;
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
        long j = this.id;
        long j2 = this.userId;
        int iOooO00o = OooO0O0.OooO00o(this.nickName, ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31);
        long j3 = this.prettyId;
        return ((((OooO0O0.OooO00o(this.headUrl, (iOooO00o + ((int) ((j3 >>> 32) ^ j3))) * 31, 31) + this.sex) * 31) + this.vip) * 31) + this.vipLevel;
    }

    @NotNull
    public String toString() {
        long j = this.id;
        long j2 = this.userId;
        String str = this.nickName;
        long j3 = this.prettyId;
        String str2 = this.headUrl;
        int i = this.sex;
        int i2 = this.vip;
        int i3 = this.vipLevel;
        StringBuilder sbOooO00o = o00O0000.OooO00o("TopicManagerModel(id=", j, ", userId=");
        sbOooO00o.append(j2);
        sbOooO00o.append(", nickName=");
        sbOooO00o.append(str);
        OooOOO0.OooO00o(sbOooO00o, ", prettyId=", j3, ", headUrl=");
        sbOooO00o.append(str2);
        sbOooO00o.append(", sex=");
        sbOooO00o.append(i);
        sbOooO00o.append(", vip=");
        sbOooO00o.append(i2);
        sbOooO00o.append(", vipLevel=");
        sbOooO00o.append(i3);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public TopicManagerModel(long j, long j2, @NotNull String nickName, long j3, @NotNull String headUrl, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(headUrl, "headUrl");
        this.id = j;
        this.userId = j2;
        this.nickName = nickName;
        this.prettyId = j3;
        this.headUrl = headUrl;
        this.sex = i;
        this.vip = i2;
        this.vipLevel = i3;
    }

    public /* synthetic */ TopicManagerModel(long j, long j2, String str, long j3, String str2, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? 0L : j2, (i4 & 4) != 0 ? "" : str, (i4 & 8) == 0 ? j3 : 0L, (i4 & 16) == 0 ? str2 : "", (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? 0 : i2, (i4 & 128) == 0 ? i3 : 0);
    }
}
