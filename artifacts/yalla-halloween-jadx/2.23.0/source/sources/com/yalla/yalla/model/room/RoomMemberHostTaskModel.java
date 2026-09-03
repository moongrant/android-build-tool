package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/model/room/RoomMemberHostTaskModel;", "", "dayFriendShip", "", "memberNum", "", "taskList", "", "Lcom/yalla/yalla/model/room/RoomMemberTaskHostInfoModel;", "weekRank", "(JILjava/util/List;I)V", "getDayFriendShip", "()J", "getMemberNum", "()I", "getTaskList", "()Ljava/util/List;", "getWeekRank", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RoomMemberHostTaskModel {
    public static final int $stable = 8;
    private final long dayFriendShip;
    private final int memberNum;

    @NotNull
    private final List<RoomMemberTaskHostInfoModel> taskList;
    private final int weekRank;

    public RoomMemberHostTaskModel() {
        this(0L, 0, null, 0, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RoomMemberHostTaskModel copy$default(RoomMemberHostTaskModel roomMemberHostTaskModel, long j, int i, List list, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = roomMemberHostTaskModel.dayFriendShip;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = roomMemberHostTaskModel.memberNum;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            list = roomMemberHostTaskModel.taskList;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            i2 = roomMemberHostTaskModel.weekRank;
        }
        return roomMemberHostTaskModel.copy(j2, i4, list2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getDayFriendShip() {
        return this.dayFriendShip;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMemberNum() {
        return this.memberNum;
    }

    @NotNull
    public final List<RoomMemberTaskHostInfoModel> component3() {
        return this.taskList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWeekRank() {
        return this.weekRank;
    }

    @NotNull
    public final RoomMemberHostTaskModel copy(long dayFriendShip, int memberNum, @NotNull List<RoomMemberTaskHostInfoModel> taskList, int weekRank) {
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        return new RoomMemberHostTaskModel(dayFriendShip, memberNum, taskList, weekRank);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomMemberHostTaskModel)) {
            return false;
        }
        RoomMemberHostTaskModel roomMemberHostTaskModel = (RoomMemberHostTaskModel) other;
        return this.dayFriendShip == roomMemberHostTaskModel.dayFriendShip && this.memberNum == roomMemberHostTaskModel.memberNum && Intrinsics.areEqual(this.taskList, roomMemberHostTaskModel.taskList) && this.weekRank == roomMemberHostTaskModel.weekRank;
    }

    public final long getDayFriendShip() {
        return this.dayFriendShip;
    }

    public final int getMemberNum() {
        return this.memberNum;
    }

    @NotNull
    public final List<RoomMemberTaskHostInfoModel> getTaskList() {
        return this.taskList;
    }

    public final int getWeekRank() {
        return this.weekRank;
    }

    public int hashCode() {
        long j = this.dayFriendShip;
        return ((this.taskList.hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + this.memberNum) * 31)) * 31) + this.weekRank;
    }

    @NotNull
    public String toString() {
        return "RoomMemberHostTaskModel(dayFriendShip=" + this.dayFriendShip + ", memberNum=" + this.memberNum + ", taskList=" + this.taskList + ", weekRank=" + this.weekRank + ")";
    }

    public RoomMemberHostTaskModel(long j, int i, @NotNull List<RoomMemberTaskHostInfoModel> taskList, int i2) {
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        this.dayFriendShip = j;
        this.memberNum = i;
        this.taskList = taskList;
        this.weekRank = i2;
    }

    public /* synthetic */ RoomMemberHostTaskModel(long j, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? CollectionsKt.emptyList() : list, (i3 & 8) != 0 ? 0 : i2);
    }
}
