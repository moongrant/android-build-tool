package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/model/ApkUpResultModel;", "Ljava/io/Serializable;", "()V", "appUrl", "", "getAppUrl", "()Ljava/lang/String;", "setAppUrl", "(Ljava/lang/String;)V", "appVersion", "getAppVersion", "setAppVersion", "build", "", "getBuild", "()I", "setBuild", "(I)V", "content", "getContent", "setContent", "isForce", "", "()Z", "setForce", "(Z)V", "isUpdate", "setUpdate", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ApkUpResultModel implements Serializable {
    public static final int $stable = 8;
    private int build;
    private boolean isForce;
    private boolean isUpdate;

    @SerializedName(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION)
    @NotNull
    private String appVersion = "";

    @NotNull
    private String appUrl = "";

    @NotNull
    private String content = "";

    @NotNull
    public final String getAppUrl() {
        return this.appUrl;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    public final int getBuild() {
        return this.build;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: isForce, reason: from getter */
    public final boolean getIsForce() {
        return this.isForce;
    }

    /* JADX INFO: renamed from: isUpdate, reason: from getter */
    public final boolean getIsUpdate() {
        return this.isUpdate;
    }

    public final void setAppUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appUrl = str;
    }

    public final void setAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setBuild(int i) {
        this.build = i;
    }

    public final void setContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final void setForce(boolean z) {
        this.isForce = z;
    }

    public final void setUpdate(boolean z) {
        this.isUpdate = z;
    }
}
