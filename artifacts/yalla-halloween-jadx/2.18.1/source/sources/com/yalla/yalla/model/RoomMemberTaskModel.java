package com.yalla.yalla.model;

import Oooo000.o000O0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b¢\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\bHÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u00069"}, d2 = {"Lcom/yalla/yalla/model/RoomMemberTaskModel;", "", "badgeLevel", "", "badgeSate", "badgeUrl", "", "dayFriendShip", "", "dayFriendShipLimit", "totalFriendShip", "memberLevel", "memberLevelLimit", "memberNum", "taskList", "", "Lcom/yalla/yalla/model/RoomMemberTaskInfoModel;", "weekRank", "totalProgress", "currentProgress", "(IILjava/lang/String;JJJIIILjava/util/List;IJJ)V", "getBadgeLevel", "()I", "getBadgeSate", "getBadgeUrl", "()Ljava/lang/String;", "getCurrentProgress", "()J", "getDayFriendShip", "getDayFriendShipLimit", "getMemberLevel", "getMemberLevelLimit", "getMemberNum", "getTaskList", "()Ljava/util/List;", "getTotalFriendShip", "getTotalProgress", "getWeekRank", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class RoomMemberTaskModel {
    public static final int $stable = 8;
    private final int badgeLevel;
    private final int badgeSate;

    @NotNull
    private final String badgeUrl;
    private final long currentProgress;
    private final long dayFriendShip;
    private final long dayFriendShipLimit;
    private final int memberLevel;
    private final int memberLevelLimit;
    private final int memberNum;

    @NotNull
    private final List<RoomMemberTaskInfoModel> taskList;
    private final long totalFriendShip;
    private final long totalProgress;
    private final int weekRank;

    public RoomMemberTaskModel() {
        this(0, 0, null, 0L, 0L, 0L, 0, 0, 0, null, 0, 0L, 0L, 8191, null);
    }

    public RoomMemberTaskModel(int i, int i2, @NotNull String badgeUrl, long j, long j2, long j3, int i3, int i4, int i5, @NotNull List<RoomMemberTaskInfoModel> taskList, int i6, long j4, long j5) {
        Intrinsics.checkNotNullParameter(badgeUrl, "badgeUrl");
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        this.badgeLevel = i;
        this.badgeSate = i2;
        this.badgeUrl = badgeUrl;
        this.dayFriendShip = j;
        this.dayFriendShipLimit = j2;
        this.totalFriendShip = j3;
        this.memberLevel = i3;
        this.memberLevelLimit = i4;
        this.memberNum = i5;
        this.taskList = taskList;
        this.weekRank = i6;
        this.totalProgress = j4;
        this.currentProgress = j5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBadgeLevel() {
        return this.badgeLevel;
    }

    @NotNull
    public final List<RoomMemberTaskInfoModel> component10() {
        return this.taskList;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getWeekRank() {
        return this.weekRank;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getTotalProgress() {
        return this.totalProgress;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getCurrentProgress() {
        return this.currentProgress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBadgeSate() {
        return this.badgeSate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getDayFriendShip() {
        return this.dayFriendShip;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDayFriendShipLimit() {
        return this.dayFriendShipLimit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTotalFriendShip() {
        return this.totalFriendShip;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMemberLevel() {
        return this.memberLevel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMemberLevelLimit() {
        return this.memberLevelLimit;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMemberNum() {
        return this.memberNum;
    }

    @NotNull
    public final RoomMemberTaskModel copy(int badgeLevel, int badgeSate, @NotNull String badgeUrl, long dayFriendShip, long dayFriendShipLimit, long totalFriendShip, int memberLevel, int memberLevelLimit, int memberNum, @NotNull List<RoomMemberTaskInfoModel> taskList, int weekRank, long totalProgress, long currentProgress) {
        Intrinsics.checkNotNullParameter(badgeUrl, "badgeUrl");
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        return new RoomMemberTaskModel(badgeLevel, badgeSate, badgeUrl, dayFriendShip, dayFriendShipLimit, totalFriendShip, memberLevel, memberLevelLimit, memberNum, taskList, weekRank, totalProgress, currentProgress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomMemberTaskModel)) {
            return false;
        }
        RoomMemberTaskModel roomMemberTaskModel = (RoomMemberTaskModel) other;
        return this.badgeLevel == roomMemberTaskModel.badgeLevel && this.badgeSate == roomMemberTaskModel.badgeSate && Intrinsics.areEqual(this.badgeUrl, roomMemberTaskModel.badgeUrl) && this.dayFriendShip == roomMemberTaskModel.dayFriendShip && this.dayFriendShipLimit == roomMemberTaskModel.dayFriendShipLimit && this.totalFriendShip == roomMemberTaskModel.totalFriendShip && this.memberLevel == roomMemberTaskModel.memberLevel && this.memberLevelLimit == roomMemberTaskModel.memberLevelLimit && this.memberNum == roomMemberTaskModel.memberNum && Intrinsics.areEqual(this.taskList, roomMemberTaskModel.taskList) && this.weekRank == roomMemberTaskModel.weekRank && this.totalProgress == roomMemberTaskModel.totalProgress && this.currentProgress == roomMemberTaskModel.currentProgress;
    }

    public final int getBadgeLevel() {
        return this.badgeLevel;
    }

    public final int getBadgeSate() {
        return this.badgeSate;
    }

    @NotNull
    public final String getBadgeUrl() {
        return this.badgeUrl;
    }

    public final long getCurrentProgress() {
        return this.currentProgress;
    }

    public final long getDayFriendShip() {
        return this.dayFriendShip;
    }

    public final long getDayFriendShipLimit() {
        return this.dayFriendShipLimit;
    }

    public final int getMemberLevel() {
        return this.memberLevel;
    }

    public final int getMemberLevelLimit() {
        return this.memberLevelLimit;
    }

    public final int getMemberNum() {
        return this.memberNum;
    }

    @NotNull
    public final List<RoomMemberTaskInfoModel> getTaskList() {
        return this.taskList;
    }

    public final long getTotalFriendShip() {
        return this.totalFriendShip;
    }

    public final long getTotalProgress() {
        return this.totalProgress;
    }

    public final int getWeekRank() {
        return this.weekRank;
    }

    public int hashCode() {
        int iOooO00o = o0O0O00.OooO00o(this.badgeUrl, ((this.badgeLevel * 31) + this.badgeSate) * 31, 31);
        long j = this.dayFriendShip;
        int i = (iOooO00o + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.dayFriendShipLimit;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.totalFriendShip;
        int iHashCode = (((this.taskList.hashCode() + ((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.memberLevel) * 31) + this.memberLevelLimit) * 31) + this.memberNum) * 31)) * 31) + this.weekRank) * 31;
        long j4 = this.totalProgress;
        int i3 = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.currentProgress;
        return i3 + ((int) ((j5 >>> 32) ^ j5));
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("RoomMemberTaskModel(badgeLevel=");
        sbOooO0o0.append(this.badgeLevel);
        sbOooO0o0.append(", badgeSate=");
        sbOooO0o0.append(this.badgeSate);
        sbOooO0o0.append(", badgeUrl=");
        sbOooO0o0.append(this.badgeUrl);
        sbOooO0o0.append(", dayFriendShip=");
        sbOooO0o0.append(this.dayFriendShip);
        sbOooO0o0.append(", dayFriendShipLimit=");
        sbOooO0o0.append(this.dayFriendShipLimit);
        sbOooO0o0.append(", totalFriendShip=");
        sbOooO0o0.append(this.totalFriendShip);
        sbOooO0o0.append(", memberLevel=");
        sbOooO0o0.append(this.memberLevel);
        sbOooO0o0.append(", memberLevelLimit=");
        sbOooO0o0.append(this.memberLevelLimit);
        sbOooO0o0.append(", memberNum=");
        sbOooO0o0.append(this.memberNum);
        sbOooO0o0.append(", taskList=");
        sbOooO0o0.append(this.taskList);
        sbOooO0o0.append(", weekRank=");
        sbOooO0o0.append(this.weekRank);
        sbOooO0o0.append(", totalProgress=");
        sbOooO0o0.append(this.totalProgress);
        sbOooO0o0.append(", currentProgress=");
        return o000O0.OooO0O0(sbOooO0o0, this.currentProgress, ')');
    }

    public /* synthetic */ RoomMemberTaskModel(int i, int i2, String str, long j, long j2, long j3, int i3, int i4, int i5, List list, int i6, long j4, long j5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? "" : str, (i7 & 8) != 0 ? 0L : j, (i7 & 16) != 0 ? 0L : j2, (i7 & 32) != 0 ? 0L : j3, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) != 0 ? CollectionsKt.emptyList() : list, (i7 & 1024) != 0 ? 0 : i6, (i7 & RecyclerView.oo0o0Oo.FLAG_MOVED) != 0 ? 0L : j4, (i7 & 4096) != 0 ? 0L : j5);
    }
}
