package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.common.util.OooO;
import java.io.File;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00100\u001a\u00020\"J6\u00101\u001a\u0002022\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010'\u001a\u0004\u0018\u00010\n2\u0006\u0010-\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\"\u00103\u001a\u0002022\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nJ\b\u00104\u001a\u00020\nH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010 ¨\u00065"}, d2 = {"Lcom/yalla/yalla/model/UpdateAppModel;", "Ljava/io/Serializable;", "()V", "apkFile", "Ljava/io/File;", "getApkFile", "()Ljava/io/File;", "setApkFile", "(Ljava/io/File;)V", "apkUrl", "", "getApkUrl", "()Ljava/lang/String;", "setApkUrl", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "currentVersionCode", "getCurrentVersionCode", "setCurrentVersionCode", "notificationContentText", "getNotificationContentText", "setNotificationContentText", "notificationContentTitle", "getNotificationContentTitle", "setNotificationContentTitle", "notificationDrawableId", "", "getNotificationDrawableId", "()I", "setNotificationDrawableId", "(I)V", "showNotification", "", "getShowNotification", "()Z", "setShowNotification", "(Z)V", "targetVersionCode", "getTargetVersionCode", "setTargetVersionCode", "targetVersionName", "getTargetVersionName", "setTargetVersionName", "upApkCode", "getUpApkCode", "setUpApkCode", "haveUpdate", "setModel", "", "setNotificationInfo", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class UpdateAppModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private File apkFile;
    private int notificationDrawableId;
    private boolean showNotification;
    private int upApkCode;

    @NotNull
    private String currentVersionCode = "";

    @NotNull
    private String targetVersionCode = "";

    @NotNull
    private String targetVersionName = "";

    @NotNull
    private String content = "";

    @NotNull
    private String apkUrl = "";

    @NotNull
    private String notificationContentTitle = "";

    @NotNull
    private String notificationContentText = "";

    @Nullable
    public final File getApkFile() {
        return this.apkFile;
    }

    @NotNull
    public final String getApkUrl() {
        return this.apkUrl;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getCurrentVersionCode() {
        return this.currentVersionCode;
    }

    @NotNull
    public final String getNotificationContentText() {
        return this.notificationContentText;
    }

    @NotNull
    public final String getNotificationContentTitle() {
        return this.notificationContentTitle;
    }

    public final int getNotificationDrawableId() {
        return this.notificationDrawableId;
    }

    public final boolean getShowNotification() {
        return this.showNotification;
    }

    @NotNull
    public final String getTargetVersionCode() {
        return this.targetVersionCode;
    }

    @NotNull
    public final String getTargetVersionName() {
        return this.targetVersionName;
    }

    public final int getUpApkCode() {
        return this.upApkCode;
    }

    public final boolean haveUpdate() {
        return OooO.OooO0O0(this.targetVersionCode) > OooO.OooO0O0(this.currentVersionCode);
    }

    public final void setApkFile(@Nullable File file) {
        this.apkFile = file;
    }

    public final void setApkUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.apkUrl = str;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setCurrentVersionCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentVersionCode = str;
    }

    public final void setModel(@Nullable String content, @Nullable String currentVersionCode, @Nullable String targetVersionCode, int upApkCode, @Nullable String apkUrl) {
        if (content == null) {
            content = "";
        }
        this.content = content;
        if (currentVersionCode == null) {
            currentVersionCode = "";
        }
        this.currentVersionCode = currentVersionCode;
        if (targetVersionCode == null) {
            targetVersionCode = "";
        }
        this.targetVersionCode = targetVersionCode;
        this.upApkCode = upApkCode;
        if (apkUrl == null) {
            apkUrl = "";
        }
        this.apkUrl = apkUrl;
    }

    public final void setNotificationContentText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notificationContentText = str;
    }

    public final void setNotificationContentTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.notificationContentTitle = str;
    }

    public final void setNotificationDrawableId(int i) {
        this.notificationDrawableId = i;
    }

    public final void setNotificationInfo(int notificationDrawableId, @Nullable String notificationContentTitle, @Nullable String notificationContentText) {
        this.notificationDrawableId = notificationDrawableId;
        if (notificationContentTitle == null) {
            notificationContentTitle = "";
        }
        this.notificationContentTitle = notificationContentTitle;
        if (notificationContentText == null) {
            notificationContentText = "";
        }
        this.notificationContentText = notificationContentText;
    }

    public final void setShowNotification(boolean z) {
        this.showNotification = z;
    }

    public final void setTargetVersionCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetVersionCode = str;
    }

    public final void setTargetVersionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetVersionName = str;
    }

    public final void setUpApkCode(int i) {
        this.upApkCode = i;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("UpdateAppModel(currentVersionCode='");
        sbOooO0o0.append(this.currentVersionCode);
        sbOooO0o0.append("', upApkCode=");
        sbOooO0o0.append(this.upApkCode);
        sbOooO0o0.append(", targetVersionCode='");
        sbOooO0o0.append(this.targetVersionCode);
        sbOooO0o0.append("', targetVersionName='");
        sbOooO0o0.append(this.targetVersionName);
        sbOooO0o0.append("', content='");
        sbOooO0o0.append(this.content);
        sbOooO0o0.append("', apkUrl='");
        sbOooO0o0.append(this.apkUrl);
        sbOooO0o0.append("', apkFile=");
        sbOooO0o0.append(this.apkFile);
        sbOooO0o0.append(", showNotification=");
        sbOooO0o0.append(this.showNotification);
        sbOooO0o0.append(", notificationDrawableId=");
        sbOooO0o0.append(this.notificationDrawableId);
        sbOooO0o0.append(", notificationContentTitle='");
        sbOooO0o0.append(this.notificationContentTitle);
        sbOooO0o0.append("', notificationContentText='");
        return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.notificationContentText, "')");
    }
}
