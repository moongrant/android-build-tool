package com.yallatech.support.platform.login.bean;

import androidx.annotation.Keep;
import androidx.compose.animation.OooO0O0;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\f\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0007R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001b\u0010\u0004¨\u0006 "}, d2 = {"Lcom/yallatech/support/platform/login/bean/AppStatus;", "", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "component3", "component4", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, "appName", "appIcon", "shareStatus", "copy", "(ILjava/lang/String;Ljava/lang/String;I)Lcom/yallatech/support/platform/login/bean/AppStatus;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getStatus", "Ljava/lang/String;", "getAppIcon", "getAppName", "getShareStatus", "<init>", "(ILjava/lang/String;Ljava/lang/String;I)V", "Companion", "OooO00o", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppStatus {
    public static final int STATUS_BANNED = 2;
    public static final int STATUS_DEFAULT = 1;
    public static final int STATUS_SHARE_CLOSE = 2;
    public static final int STATUS_SHARE_DEFAULT = 1;

    @SerializedName("app_icon")
    @NotNull
    private final String appIcon;

    @SerializedName(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING)
    @NotNull
    private final String appName;

    @SerializedName("share_status")
    private final int shareStatus;
    private final int status;

    public AppStatus(int i, @NotNull String appName, @NotNull String appIcon, int i2) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appIcon, "appIcon");
        this.status = i;
        this.appName = appName;
        this.appIcon = appIcon;
        this.shareStatus = i2;
    }

    public static /* synthetic */ AppStatus copy$default(AppStatus appStatus, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appStatus.status;
        }
        if ((i3 & 2) != 0) {
            str = appStatus.appName;
        }
        if ((i3 & 4) != 0) {
            str2 = appStatus.appIcon;
        }
        if ((i3 & 8) != 0) {
            i2 = appStatus.shareStatus;
        }
        return appStatus.copy(i, str, str2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppIcon() {
        return this.appIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getShareStatus() {
        return this.shareStatus;
    }

    @NotNull
    public final AppStatus copy(int status, @NotNull String appName, @NotNull String appIcon, int shareStatus) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appIcon, "appIcon");
        return new AppStatus(status, appName, appIcon, shareStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStatus)) {
            return false;
        }
        AppStatus appStatus = (AppStatus) other;
        return this.status == appStatus.status && Intrinsics.areEqual(this.appName, appStatus.appName) && Intrinsics.areEqual(this.appIcon, appStatus.appIcon) && this.shareStatus == appStatus.shareStatus;
    }

    @NotNull
    public final String getAppIcon() {
        return this.appIcon;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final int getShareStatus() {
        return this.shareStatus;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return OooO0O0.OooO00o(this.appIcon, OooO0O0.OooO00o(this.appName, this.status * 31, 31), 31) + this.shareStatus;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AppStatus(status=");
        sb.append(this.status);
        sb.append(", appName=");
        sb.append(this.appName);
        sb.append(", appIcon=");
        sb.append(this.appIcon);
        sb.append(", shareStatus=");
        return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.shareStatus, ')');
    }

    public /* synthetic */ AppStatus(int i, String str, String str2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, i2);
    }
}
