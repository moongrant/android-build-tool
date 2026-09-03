package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/data/repository/CircleCreateCheck;", "", "checkPower", "", "checkRegTime", "checkUserLevel", "circleState", "(IIII)V", "getCheckPower", "()I", "getCheckRegTime", "getCheckUserLevel", "getCircleState", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CircleCreateCheck {
    public static final int $stable = 0;
    private final int checkPower;
    private final int checkRegTime;
    private final int checkUserLevel;
    private final int circleState;

    public CircleCreateCheck(int i, int i2, int i3, int i4) {
        this.checkPower = i;
        this.checkRegTime = i2;
        this.checkUserLevel = i3;
        this.circleState = i4;
    }

    public static /* synthetic */ CircleCreateCheck copy$default(CircleCreateCheck circleCreateCheck, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = circleCreateCheck.checkPower;
        }
        if ((i5 & 2) != 0) {
            i2 = circleCreateCheck.checkRegTime;
        }
        if ((i5 & 4) != 0) {
            i3 = circleCreateCheck.checkUserLevel;
        }
        if ((i5 & 8) != 0) {
            i4 = circleCreateCheck.circleState;
        }
        return circleCreateCheck.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCheckPower() {
        return this.checkPower;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCheckRegTime() {
        return this.checkRegTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCheckUserLevel() {
        return this.checkUserLevel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCircleState() {
        return this.circleState;
    }

    @NotNull
    public final CircleCreateCheck copy(int checkPower, int checkRegTime, int checkUserLevel, int circleState) {
        return new CircleCreateCheck(checkPower, checkRegTime, checkUserLevel, circleState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CircleCreateCheck)) {
            return false;
        }
        CircleCreateCheck circleCreateCheck = (CircleCreateCheck) other;
        return this.checkPower == circleCreateCheck.checkPower && this.checkRegTime == circleCreateCheck.checkRegTime && this.checkUserLevel == circleCreateCheck.checkUserLevel && this.circleState == circleCreateCheck.circleState;
    }

    public final int getCheckPower() {
        return this.checkPower;
    }

    public final int getCheckRegTime() {
        return this.checkRegTime;
    }

    public final int getCheckUserLevel() {
        return this.checkUserLevel;
    }

    public final int getCircleState() {
        return this.circleState;
    }

    public int hashCode() {
        return (((((this.checkPower * 31) + this.checkRegTime) * 31) + this.checkUserLevel) * 31) + this.circleState;
    }

    @NotNull
    public String toString() {
        int i = this.checkPower;
        int i2 = this.checkRegTime;
        int i3 = this.checkUserLevel;
        int i4 = this.circleState;
        StringBuilder sbOooO00o = o00000.OooO00o("CircleCreateCheck(checkPower=", i, ", checkRegTime=", i2, ", checkUserLevel=");
        sbOooO00o.append(i3);
        sbOooO00o.append(", circleState=");
        sbOooO00o.append(i4);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }
}
