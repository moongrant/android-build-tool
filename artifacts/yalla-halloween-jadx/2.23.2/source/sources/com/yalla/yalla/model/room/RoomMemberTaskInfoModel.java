package com.yalla.yalla.model.room;

import androidx.compose.animation.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.netdetector.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003Jc\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u0006-"}, d2 = {"Lcom/yalla/yalla/model/room/RoomMemberTaskInfoModel;", "", "completedVal", "", "currVal", "state", "", "taskDesc", "", "unitRewardVal", "taskId", "taskName", "taskPic", "taskType", "(JJILjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V", "getCompletedVal", "()J", "getCurrVal", "getState", "()I", "getTaskDesc", "()Ljava/lang/String;", "setTaskDesc", "(Ljava/lang/String;)V", "getTaskId", "getTaskName", "setTaskName", "getTaskPic", "getTaskType", "getUnitRewardVal", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RoomMemberTaskInfoModel {
    public static final int $stable = 8;
    private final long completedVal;
    private final long currVal;
    private final int state;

    @NotNull
    private String taskDesc;
    private final int taskId;

    @NotNull
    private String taskName;

    @NotNull
    private final String taskPic;
    private final int taskType;
    private final int unitRewardVal;

    public RoomMemberTaskInfoModel() {
        this(0L, 0L, 0, null, 0, 0, null, null, 0, 511, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCompletedVal() {
        return this.completedVal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCurrVal() {
        return this.currVal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTaskDesc() {
        return this.taskDesc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getUnitRewardVal() {
        return this.unitRewardVal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTaskId() {
        return this.taskId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTaskName() {
        return this.taskName;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTaskPic() {
        return this.taskPic;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getTaskType() {
        return this.taskType;
    }

    @NotNull
    public final RoomMemberTaskInfoModel copy(long completedVal, long currVal, int state, @NotNull String taskDesc, int unitRewardVal, int taskId, @NotNull String taskName, @NotNull String taskPic, int taskType) {
        Intrinsics.checkNotNullParameter(taskDesc, "taskDesc");
        Intrinsics.checkNotNullParameter(taskName, "taskName");
        Intrinsics.checkNotNullParameter(taskPic, "taskPic");
        return new RoomMemberTaskInfoModel(completedVal, currVal, state, taskDesc, unitRewardVal, taskId, taskName, taskPic, taskType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoomMemberTaskInfoModel)) {
            return false;
        }
        RoomMemberTaskInfoModel roomMemberTaskInfoModel = (RoomMemberTaskInfoModel) other;
        return this.completedVal == roomMemberTaskInfoModel.completedVal && this.currVal == roomMemberTaskInfoModel.currVal && this.state == roomMemberTaskInfoModel.state && Intrinsics.areEqual(this.taskDesc, roomMemberTaskInfoModel.taskDesc) && this.unitRewardVal == roomMemberTaskInfoModel.unitRewardVal && this.taskId == roomMemberTaskInfoModel.taskId && Intrinsics.areEqual(this.taskName, roomMemberTaskInfoModel.taskName) && Intrinsics.areEqual(this.taskPic, roomMemberTaskInfoModel.taskPic) && this.taskType == roomMemberTaskInfoModel.taskType;
    }

    public final long getCompletedVal() {
        return this.completedVal;
    }

    public final long getCurrVal() {
        return this.currVal;
    }

    public final int getState() {
        return this.state;
    }

    @NotNull
    public final String getTaskDesc() {
        return this.taskDesc;
    }

    public final int getTaskId() {
        return this.taskId;
    }

    @NotNull
    public final String getTaskName() {
        return this.taskName;
    }

    @NotNull
    public final String getTaskPic() {
        return this.taskPic;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    public final int getUnitRewardVal() {
        return this.unitRewardVal;
    }

    public int hashCode() {
        long j = this.completedVal;
        long j2 = this.currVal;
        return OooO0O0.OooO00o(this.taskPic, OooO0O0.OooO00o(this.taskName, (((OooO0O0.OooO00o(this.taskDesc, ((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.state) * 31, 31) + this.unitRewardVal) * 31) + this.taskId) * 31, 31), 31) + this.taskType;
    }

    public final void setTaskDesc(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.taskDesc = str;
    }

    public final void setTaskName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.taskName = str;
    }

    @NotNull
    public String toString() {
        long j = this.completedVal;
        long j2 = this.currVal;
        int i = this.state;
        String str = this.taskDesc;
        int i2 = this.unitRewardVal;
        int i3 = this.taskId;
        String str2 = this.taskName;
        String str3 = this.taskPic;
        int i4 = this.taskType;
        StringBuilder sbOooO00o = o00O0000.OooO00o("RoomMemberTaskInfoModel(completedVal=", j, ", currVal=");
        sbOooO00o.append(j2);
        sbOooO00o.append(", state=");
        sbOooO00o.append(i);
        sbOooO00o.append(", taskDesc=");
        sbOooO00o.append(str);
        sbOooO00o.append(", unitRewardVal=");
        sbOooO00o.append(i2);
        sbOooO00o.append(", taskId=");
        sbOooO00o.append(i3);
        sbOooO00o.append(", taskName=");
        sbOooO00o.append(str2);
        sbOooO00o.append(", taskPic=");
        sbOooO00o.append(str3);
        sbOooO00o.append(", taskType=");
        sbOooO00o.append(i4);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public RoomMemberTaskInfoModel(long j, long j2, int i, @NotNull String str, int i2, int i3, @NotNull String str2, @NotNull String str3, int i4) {
        OooO00o.OooO00o(str, "taskDesc", str2, "taskName", str3, "taskPic");
        this.completedVal = j;
        this.currVal = j2;
        this.state = i;
        this.taskDesc = str;
        this.unitRewardVal = i2;
        this.taskId = i3;
        this.taskName = str2;
        this.taskPic = str3;
        this.taskType = i4;
    }

    public /* synthetic */ RoomMemberTaskInfoModel(long j, long j2, int i, String str, int i2, int i3, String str2, String str3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0L : j, (i5 & 2) == 0 ? j2 : 0L, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? "" : str, (i5 & 16) != 0 ? 0 : i2, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? "" : str2, (i5 & 128) == 0 ? str3 : "", (i5 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0 ? i4 : 0);
    }
}
