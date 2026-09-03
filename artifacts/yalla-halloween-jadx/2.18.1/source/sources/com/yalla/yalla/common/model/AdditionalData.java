package com.yalla.yalla.common.model;

import OooO00o.OooO00o;
import Oooo000.o00oO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/common/model/AdditionalData;", "", "userId", "", "activeToken", "", "(JLjava/lang/String;)V", "getActiveToken", "()Ljava/lang/String;", "setActiveToken", "(Ljava/lang/String;)V", "getUserId", "()J", "setUserId", "(J)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AdditionalData {
    public static final int $stable = 8;

    @NotNull
    private String activeToken;

    @SerializedName("userid")
    private long userId;

    public AdditionalData() {
        this(0L, null, 3, null);
    }

    public AdditionalData(long j, @NotNull String activeToken) {
        Intrinsics.checkNotNullParameter(activeToken, "activeToken");
        this.userId = j;
        this.activeToken = activeToken;
    }

    public static /* synthetic */ AdditionalData copy$default(AdditionalData additionalData, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = additionalData.userId;
        }
        if ((i & 2) != 0) {
            str = additionalData.activeToken;
        }
        return additionalData.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActiveToken() {
        return this.activeToken;
    }

    @NotNull
    public final AdditionalData copy(long userId, @NotNull String activeToken) {
        Intrinsics.checkNotNullParameter(activeToken, "activeToken");
        return new AdditionalData(userId, activeToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalData)) {
            return false;
        }
        AdditionalData additionalData = (AdditionalData) other;
        return this.userId == additionalData.userId && Intrinsics.areEqual(this.activeToken, additionalData.activeToken);
    }

    @NotNull
    public final String getActiveToken() {
        return this.activeToken;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        long j = this.userId;
        return this.activeToken.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final void setActiveToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activeToken = str;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("AdditionalData(userId=");
        sbOooO0o0.append(this.userId);
        sbOooO0o0.append(", activeToken=");
        return o00oO0o.OooO0O0(sbOooO0o0, this.activeToken, ')');
    }

    public /* synthetic */ AdditionalData(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
