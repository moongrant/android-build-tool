package com.yalla.yalla.model;

import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/TreasureBoxCarouselInfo;", "", "broadcast", "", "headUrl", "nickName", "userId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBroadcast", "()Ljava/lang/String;", "getHeadUrl", "getNickName", "getUserId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TreasureBoxCarouselInfo {
    public static final int $stable = 0;

    @NotNull
    private final String broadcast;

    @NotNull
    private final String headUrl;

    @NotNull
    private final String nickName;
    private final int userId;

    public TreasureBoxCarouselInfo() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ TreasureBoxCarouselInfo copy$default(TreasureBoxCarouselInfo treasureBoxCarouselInfo, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = treasureBoxCarouselInfo.broadcast;
        }
        if ((i2 & 2) != 0) {
            str2 = treasureBoxCarouselInfo.headUrl;
        }
        if ((i2 & 4) != 0) {
            str3 = treasureBoxCarouselInfo.nickName;
        }
        if ((i2 & 8) != 0) {
            i = treasureBoxCarouselInfo.userId;
        }
        return treasureBoxCarouselInfo.copy(str, str2, str3, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBroadcast() {
        return this.broadcast;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeadUrl() {
        return this.headUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    @NotNull
    public final TreasureBoxCarouselInfo copy(@NotNull String broadcast, @NotNull String headUrl, @NotNull String nickName, int userId) {
        Intrinsics.checkNotNullParameter(broadcast, "broadcast");
        Intrinsics.checkNotNullParameter(headUrl, "headUrl");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        return new TreasureBoxCarouselInfo(broadcast, headUrl, nickName, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TreasureBoxCarouselInfo)) {
            return false;
        }
        TreasureBoxCarouselInfo treasureBoxCarouselInfo = (TreasureBoxCarouselInfo) other;
        return Intrinsics.areEqual(this.broadcast, treasureBoxCarouselInfo.broadcast) && Intrinsics.areEqual(this.headUrl, treasureBoxCarouselInfo.headUrl) && Intrinsics.areEqual(this.nickName, treasureBoxCarouselInfo.nickName) && this.userId == treasureBoxCarouselInfo.userId;
    }

    @NotNull
    public final String getBroadcast() {
        return this.broadcast;
    }

    @NotNull
    public final String getHeadUrl() {
        return this.headUrl;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return o0OO00O.OooO00o(this.nickName, o0OO00O.OooO00o(this.headUrl, this.broadcast.hashCode() * 31, 31), 31) + this.userId;
    }

    @NotNull
    public String toString() {
        String str = this.broadcast;
        String str2 = this.headUrl;
        String str3 = this.nickName;
        int i = this.userId;
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("TreasureBoxCarouselInfo(broadcast=", str, ", headUrl=", str2, ", nickName=");
        sbOooO0OO.append(str3);
        sbOooO0OO.append(", userId=");
        sbOooO0OO.append(i);
        sbOooO0OO.append(")");
        return sbOooO0OO.toString();
    }

    public TreasureBoxCarouselInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        OooO0OO.OooO00o(str, "broadcast", str2, "headUrl", str3, "nickName");
        this.broadcast = str;
        this.headUrl = str2;
        this.nickName = str3;
        this.userId = i;
    }

    public /* synthetic */ TreasureBoxCarouselInfo(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? 0 : i);
    }
}
