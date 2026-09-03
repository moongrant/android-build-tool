package com.app.base.mixedroom.model;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/app/base/mixedroom/model/TreasureBoxProgressModel;", "", "timeId", "", "percent", "", "boxLevel", "(JII)V", "getBoxLevel", "()I", "setBoxLevel", "(I)V", "getPercent", "setPercent", "getTimeId", "()J", "setTimeId", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class TreasureBoxProgressModel {
    public static final int $stable = 8;
    private int boxLevel;
    private int percent;
    private long timeId;

    public TreasureBoxProgressModel() {
        this(0L, 0, 0, 7, null);
    }

    public TreasureBoxProgressModel(long j, int i, int i2) {
        this.timeId = j;
        this.percent = i;
        this.boxLevel = i2;
    }

    public static /* synthetic */ TreasureBoxProgressModel copy$default(TreasureBoxProgressModel treasureBoxProgressModel, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = treasureBoxProgressModel.timeId;
        }
        if ((i3 & 2) != 0) {
            i = treasureBoxProgressModel.percent;
        }
        if ((i3 & 4) != 0) {
            i2 = treasureBoxProgressModel.boxLevel;
        }
        return treasureBoxProgressModel.copy(j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeId() {
        return this.timeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPercent() {
        return this.percent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBoxLevel() {
        return this.boxLevel;
    }

    @NotNull
    public final TreasureBoxProgressModel copy(long timeId, int percent, int boxLevel) {
        return new TreasureBoxProgressModel(timeId, percent, boxLevel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TreasureBoxProgressModel)) {
            return false;
        }
        TreasureBoxProgressModel treasureBoxProgressModel = (TreasureBoxProgressModel) other;
        return this.timeId == treasureBoxProgressModel.timeId && this.percent == treasureBoxProgressModel.percent && this.boxLevel == treasureBoxProgressModel.boxLevel;
    }

    public final int getBoxLevel() {
        return this.boxLevel;
    }

    public final int getPercent() {
        return this.percent;
    }

    public final long getTimeId() {
        return this.timeId;
    }

    public int hashCode() {
        long j = this.timeId;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.percent) * 31) + this.boxLevel;
    }

    public final void setBoxLevel(int i) {
        this.boxLevel = i;
    }

    public final void setPercent(int i) {
        this.percent = i;
    }

    public final void setTimeId(long j) {
        this.timeId = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("TreasureBoxProgressModel(timeId=");
        sbOooO0o0.append(this.timeId);
        sbOooO0o0.append(", percent=");
        sbOooO0o0.append(this.percent);
        sbOooO0o0.append(", boxLevel=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.boxLevel, ')');
    }

    public /* synthetic */ TreasureBoxProgressModel(long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
