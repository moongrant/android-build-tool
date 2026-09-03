package com.yalla.yalla.model;

import androidx.compose.compiler.plugins.kotlin.lower.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/KeyInfo;", "", "keyId", "", "secret", "secretiv", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKeyId", "()Ljava/lang/String;", "setKeyId", "(Ljava/lang/String;)V", "getSecret", "setSecret", "getSecretiv", "setSecretiv", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyInfo {
    public static final int $stable = 8;

    @NotNull
    private String keyId;

    @NotNull
    private String secret;

    @NotNull
    private String secretiv;

    public KeyInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        OooO0OO.OooO00o(str, "keyId", str2, "secret", str3, "secretiv");
        this.keyId = str;
        this.secret = str2;
        this.secretiv = str3;
    }

    @NotNull
    public final String getKeyId() {
        return this.keyId;
    }

    @NotNull
    public final String getSecret() {
        return this.secret;
    }

    @NotNull
    public final String getSecretiv() {
        return this.secretiv;
    }

    public final void setKeyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.keyId = str;
    }

    public final void setSecret(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secret = str;
    }

    public final void setSecretiv(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secretiv = str;
    }

    public /* synthetic */ KeyInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3);
    }
}
