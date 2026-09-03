package com.common.support.apm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/common/support/apm/model/AccessKeyModel;", "", "()V", "accessKey", "", "getAccessKey", "()Ljava/lang/String;", "setAccessKey", "(Ljava/lang/String;)V", "clientId", "getClientId", "setClientId", "clientName", "getClientName", "setClientName", "platform", "getPlatform", "setPlatform", "secretKey", "getSecretKey", "setSecretKey", "apm_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AccessKeyModel {

    @NotNull
    private String clientId = "";

    @NotNull
    private String clientName = "";

    @NotNull
    private String platform = "";

    @NotNull
    private String accessKey = "";

    @NotNull
    private String secretKey = "";

    @NotNull
    public final String getAccessKey() {
        return this.accessKey;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @NotNull
    public final String getSecretKey() {
        return this.secretKey;
    }

    public final void setAccessKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessKey = str;
    }

    public final void setClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientId = str;
    }

    public final void setClientName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientName = str;
    }

    public final void setPlatform(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final void setSecretKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secretKey = str;
    }
}
