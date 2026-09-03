package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/CheckInAddUpWeekModel;", "", "num", "", "rewardMultiple", "(II)V", "getNum", "()I", "setNum", "(I)V", "getRewardMultiple", "setRewardMultiple", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class CheckInAddUpWeekModel {
    public static final int $stable = 8;
    private int num;
    private int rewardMultiple;

    public CheckInAddUpWeekModel(int i, int i2) {
        this.num = i;
        this.rewardMultiple = i2;
    }

    public static /* synthetic */ CheckInAddUpWeekModel copy$default(CheckInAddUpWeekModel checkInAddUpWeekModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = checkInAddUpWeekModel.num;
        }
        if ((i3 & 2) != 0) {
            i2 = checkInAddUpWeekModel.rewardMultiple;
        }
        return checkInAddUpWeekModel.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getNum() {
        return this.num;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRewardMultiple() {
        return this.rewardMultiple;
    }

    @NotNull
    public final CheckInAddUpWeekModel copy(int num, int rewardMultiple) {
        return new CheckInAddUpWeekModel(num, rewardMultiple);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckInAddUpWeekModel)) {
            return false;
        }
        CheckInAddUpWeekModel checkInAddUpWeekModel = (CheckInAddUpWeekModel) other;
        return this.num == checkInAddUpWeekModel.num && this.rewardMultiple == checkInAddUpWeekModel.rewardMultiple;
    }

    public final int getNum() {
        return this.num;
    }

    public final int getRewardMultiple() {
        return this.rewardMultiple;
    }

    public int hashCode() {
        return (this.num * 31) + this.rewardMultiple;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setRewardMultiple(int i) {
        this.rewardMultiple = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CheckInAddUpWeekModel(num=");
        sbOooO0o0.append(this.num);
        sbOooO0o0.append(", rewardMultiple=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.rewardMultiple, ')');
    }

    public /* synthetic */ CheckInAddUpWeekModel(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, i2);
    }
}
