package com.common.support.apm.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/common/support/apm/model/TokenModel;", "", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "expiresIn", "getExpiresIn", "setExpiresIn", "refreshToken", "getRefreshToken", "setRefreshToken", "tokenType", "getTokenType", "setTokenType", "apm_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TokenModel {

    @NotNull
    private String accessToken = "";

    @NotNull
    private String expiresIn = "";

    @NotNull
    private String tokenType = "";

    @NotNull
    private String refreshToken = "";

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getExpiresIn() {
        return this.expiresIn;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @NotNull
    public final String getTokenType() {
        return this.tokenType;
    }

    public final void setAccessToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.accessToken = str;
    }

    public final void setExpiresIn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expiresIn = str;
    }

    public final void setRefreshToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.refreshToken = str;
    }

    public final void setTokenType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenType = str;
    }
}
