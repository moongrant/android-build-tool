package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.OooOO0;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/room/RoomMemberTaskHostInfoModel;", "", "completedNum", "", "taskDesc", "", "taskId", "taskName", "taskIcon", "(ILjava/lang/String;ILjava/lang/String;I)V", "getCompletedNum", "()I", "getTaskDesc", "()Ljava/lang/String;", "setTaskDesc", "(Ljava/lang/String;)V", "getTaskIcon", "setTaskIcon", "(I)V", "getTaskId", "getTaskName", "setTaskName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RoomMemberTaskHostInfoModel {
    public static final int $stable = 8;
    private final int completedNum;

    @NotNull
    private String taskDesc;
    private int taskIcon;
    private final int taskId;

    @NotNull
    private String taskName;

    public RoomMemberTaskHostInfoModel() {
        this(0, null, 0, null, 0, 31, null);
    }

    public static /* synthetic */ RoomMemberTaskHostInfoModel copy$default(RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModel, int i, String str, int i2, String str2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = roomMemberTaskHostInfoModel.completedNum;
        }
        if ((i4 & 2) != 0) {
            str = roomMemberTaskHostInfoModel.taskDesc;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            i2 = roomMemberTaskHostInfoModel.taskId;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            str2 = roomMemberTaskHostInfoModel.taskName;
        }
        String str4 = str2;
        if ((i4 & 16) != 0) {
            i3 = roomMemberTaskHostInfoModel.taskIcon;
        }
        return roomMemberTaskHostInfoModel.copy(i, str3, i5, str4, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCompletedNum() {
        return this.completedNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTaskDesc() {
        return this.taskDesc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTaskId() {
        return this.taskId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTaskName() {
        return this.taskName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTaskIcon() {
        return this.taskIcon;
    }

    @NotNull
    public final RoomMemberTaskHostInfoModel copy(int completedNum, @NotNull String taskDesc, int taskId, @NotNull String taskName, int taskIcon) {
        Intrinsics.checkNotNullParameter(taskDesc, "taskDesc");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        return new RoomMemberTaskHostInfoModel(completedNum, taskDesc, taskId, taskName, taskIcon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomMemberTaskHostInfoModel)) {
            return false;
        }
        RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModel = (RoomMemberTaskHostInfoModel) other;
        return this.completedNum == roomMemberTaskHostInfoModel.completedNum && Intrinsics.areEqual(this.taskDesc, roomMemberTaskHostInfoModel.taskDesc) && this.taskId == roomMemberTaskHostInfoModel.taskId && Intrinsics.areEqual(this.taskName, roomMemberTaskHostInfoModel.taskName) && this.taskIcon == roomMemberTaskHostInfoModel.taskIcon;
    }

    public final int getCompletedNum() {
        return this.completedNum;
    }

    @NotNull
    public final String getTaskDesc() {
        return this.taskDesc;
    }

    public final int getTaskIcon() {
        return this.taskIcon;
    }

    public final int getTaskId() {
        return this.taskId;
    }

    @NotNull
    public final String getTaskName() {
        return this.taskName;
    }

    public int hashCode() {
        return o0OO00O.OooO00o(this.taskName, (o0OO00O.OooO00o(this.taskDesc, this.completedNum * 31, 31) + this.taskId) * 31, 31) + this.taskIcon;
    }

    public final void setTaskDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.taskDesc = str;
    }

    public final void setTaskIcon(int i) {
        this.taskIcon = i;
    }

    public final void setTaskName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.taskName = str;
    }

    @NotNull
    public String toString() {
        int i = this.completedNum;
        String str = this.taskDesc;
        int i2 = this.taskId;
        String str2 = this.taskName;
        int i3 = this.taskIcon;
        StringBuilder sb = new StringBuilder("RoomMemberTaskHostInfoModel(completedNum=");
        sb.append(i);
        sb.append(", taskDesc=");
        sb.append(str);
        sb.append(", taskId=");
        sb.append(i2);
        sb.append(", taskName=");
        sb.append(str2);
        sb.append(", taskIcon=");
        return OooOO0.OooO0O0(sb, i3, ")");
    }

    public RoomMemberTaskHostInfoModel(int i, @NotNull String taskDesc, int i2, @NotNull String taskName, int i3) {
        Intrinsics.checkNotNullParameter(taskDesc, "taskDesc");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        this.completedNum = i;
        this.taskDesc = taskDesc;
        this.taskId = i2;
        this.taskName = taskName;
        this.taskIcon = i3;
    }

    public /* synthetic */ RoomMemberTaskHostInfoModel(int i, String str, int i2, String str2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? str2 : "", (i4 & 16) != 0 ? 0 : i3);
    }
}
