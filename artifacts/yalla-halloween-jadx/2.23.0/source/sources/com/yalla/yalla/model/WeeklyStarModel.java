package com.yalla.yalla.model;

import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/WeeklyStarModel;", "", "weekStarsTitle", "", "weekStarsUrl", "shopType", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getShopType", "()Z", "getWeekStarsTitle", "()Ljava/lang/String;", "getWeekStarsUrl", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WeeklyStarModel {
    public static final int $stable = 0;
    private final boolean shopType;

    @NotNull
    private final String weekStarsTitle;

    @NotNull
    private final String weekStarsUrl;

    public WeeklyStarModel(@NotNull String weekStarsTitle, @NotNull String weekStarsUrl, boolean z) {
        Intrinsics.checkNotNullParameter(weekStarsTitle, "weekStarsTitle");
        Intrinsics.checkNotNullParameter(weekStarsUrl, "weekStarsUrl");
        this.weekStarsTitle = weekStarsTitle;
        this.weekStarsUrl = weekStarsUrl;
        this.shopType = z;
    }

    public static /* synthetic */ WeeklyStarModel copy$default(WeeklyStarModel weeklyStarModel, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weeklyStarModel.weekStarsTitle;
        }
        if ((i & 2) != 0) {
            str2 = weeklyStarModel.weekStarsUrl;
        }
        if ((i & 4) != 0) {
            z = weeklyStarModel.shopType;
        }
        return weeklyStarModel.copy(str, str2, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWeekStarsTitle() {
        return this.weekStarsTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWeekStarsUrl() {
        return this.weekStarsUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShopType() {
        return this.shopType;
    }

    @NotNull
    public final WeeklyStarModel copy(@NotNull String weekStarsTitle, @NotNull String weekStarsUrl, boolean shopType) {
        Intrinsics.checkNotNullParameter(weekStarsTitle, "weekStarsTitle");
        Intrinsics.checkNotNullParameter(weekStarsUrl, "weekStarsUrl");
        return new WeeklyStarModel(weekStarsTitle, weekStarsUrl, shopType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyStarModel)) {
            return false;
        }
        WeeklyStarModel weeklyStarModel = (WeeklyStarModel) other;
        return Intrinsics.areEqual(this.weekStarsTitle, weeklyStarModel.weekStarsTitle) && Intrinsics.areEqual(this.weekStarsUrl, weeklyStarModel.weekStarsUrl) && this.shopType == weeklyStarModel.shopType;
    }

    public final boolean getShopType() {
        return this.shopType;
    }

    @NotNull
    public final String getWeekStarsTitle() {
        return this.weekStarsTitle;
    }

    @NotNull
    public final String getWeekStarsUrl() {
        return this.weekStarsUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.weekStarsUrl, this.weekStarsTitle.hashCode() * 31, 31);
        boolean z = this.shopType;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iOooO00o + r1;
    }

    @NotNull
    public String toString() {
        String str = this.weekStarsTitle;
        String str2 = this.weekStarsUrl;
        boolean z = this.shopType;
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("WeeklyStarModel(weekStarsTitle=", str, ", weekStarsUrl=", str2, ", shopType=");
        sbOooO0OO.append(z);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }
}
