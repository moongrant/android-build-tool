package com.yalla.yalla.model;

import Oooo000.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006+"}, d2 = {"Lcom/yalla/yalla/model/BadgePersonal;", "", "rank", "", "sumStars", "copperNum", "silverNum", "goldNum", "diamondNum", "openDiamondMedal", "", "(IIIIIIZ)V", "getCopperNum", "()I", "setCopperNum", "(I)V", "getDiamondNum", "setDiamondNum", "getGoldNum", "setGoldNum", "getOpenDiamondMedal", "()Z", "setOpenDiamondMedal", "(Z)V", "getRank", "setRank", "getSilverNum", "setSilverNum", "getSumStars", "setSumStars", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class BadgePersonal {
    public static final int $stable = 8;
    private int copperNum;
    private int diamondNum;
    private int goldNum;
    private boolean openDiamondMedal;
    private int rank;
    private int silverNum;
    private int sumStars;

    public BadgePersonal(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        this.rank = i;
        this.sumStars = i2;
        this.copperNum = i3;
        this.silverNum = i4;
        this.goldNum = i5;
        this.diamondNum = i6;
        this.openDiamondMedal = z;
    }

    public static /* synthetic */ BadgePersonal copy$default(BadgePersonal badgePersonal, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = badgePersonal.rank;
        }
        if ((i7 & 2) != 0) {
            i2 = badgePersonal.sumStars;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = badgePersonal.copperNum;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = badgePersonal.silverNum;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = badgePersonal.goldNum;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = badgePersonal.diamondNum;
        }
        int i12 = i6;
        if ((i7 & 64) != 0) {
            z = badgePersonal.openDiamondMedal;
        }
        return badgePersonal.copy(i, i8, i9, i10, i11, i12, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSumStars() {
        return this.sumStars;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCopperNum() {
        return this.copperNum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSilverNum() {
        return this.silverNum;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGoldNum() {
        return this.goldNum;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDiamondNum() {
        return this.diamondNum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getOpenDiamondMedal() {
        return this.openDiamondMedal;
    }

    @NotNull
    public final BadgePersonal copy(int rank, int sumStars, int copperNum, int silverNum, int goldNum, int diamondNum, boolean openDiamondMedal) {
        return new BadgePersonal(rank, sumStars, copperNum, silverNum, goldNum, diamondNum, openDiamondMedal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgePersonal)) {
            return false;
        }
        BadgePersonal badgePersonal = (BadgePersonal) other;
        return this.rank == badgePersonal.rank && this.sumStars == badgePersonal.sumStars && this.copperNum == badgePersonal.copperNum && this.silverNum == badgePersonal.silverNum && this.goldNum == badgePersonal.goldNum && this.diamondNum == badgePersonal.diamondNum && this.openDiamondMedal == badgePersonal.openDiamondMedal;
    }

    public final int getCopperNum() {
        return this.copperNum;
    }

    public final int getDiamondNum() {
        return this.diamondNum;
    }

    public final int getGoldNum() {
        return this.goldNum;
    }

    public final boolean getOpenDiamondMedal() {
        return this.openDiamondMedal;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getSilverNum() {
        return this.silverNum;
    }

    public final int getSumStars() {
        return this.sumStars;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        int i = ((((((((((this.rank * 31) + this.sumStars) * 31) + this.copperNum) * 31) + this.silverNum) * 31) + this.goldNum) * 31) + this.diamondNum) * 31;
        boolean z = this.openDiamondMedal;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return i + r1;
    }

    public final void setCopperNum(int i) {
        this.copperNum = i;
    }

    public final void setDiamondNum(int i) {
        this.diamondNum = i;
    }

    public final void setGoldNum(int i) {
        this.goldNum = i;
    }

    public final void setOpenDiamondMedal(boolean z) {
        this.openDiamondMedal = z;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setSilverNum(int i) {
        this.silverNum = i;
    }

    public final void setSumStars(int i) {
        this.sumStars = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("BadgePersonal(rank=");
        sbOooO0o0.append(this.rank);
        sbOooO0o0.append(", sumStars=");
        sbOooO0o0.append(this.sumStars);
        sbOooO0o0.append(", copperNum=");
        sbOooO0o0.append(this.copperNum);
        sbOooO0o0.append(", silverNum=");
        sbOooO0o0.append(this.silverNum);
        sbOooO0o0.append(", goldNum=");
        sbOooO0o0.append(this.goldNum);
        sbOooO0o0.append(", diamondNum=");
        sbOooO0o0.append(this.diamondNum);
        sbOooO0o0.append(", openDiamondMedal=");
        return Oooo0.OooO0O0(sbOooO0o0, this.openDiamondMedal, ')');
    }

    public /* synthetic */ BadgePersonal(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, i6, (i7 & 64) != 0 ? false : z);
    }
}
