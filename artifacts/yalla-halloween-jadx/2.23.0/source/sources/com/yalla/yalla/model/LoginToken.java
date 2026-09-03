package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/LoginToken;", "", "()V", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "tokenActivity", "getTokenActivity", "setTokenActivity", "tokenChat", "getTokenChat", "setTokenChat", "tokenRoom", "getTokenRoom", "setTokenRoom", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoginToken {
    public static final int $stable = 8;

    @NotNull
    private String token = "";

    @SerializedName("token_room")
    @NotNull
    private String tokenRoom = "";

    @SerializedName("token_activity")
    @NotNull
    private String tokenActivity = "";

    @SerializedName("token_chat")
    @NotNull
    private String tokenChat = "";

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getTokenActivity() {
        return this.tokenActivity;
    }

    @NotNull
    public final String getTokenChat() {
        return this.tokenChat;
    }

    @NotNull
    public final String getTokenRoom() {
        return this.tokenRoom;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final void setTokenActivity(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenActivity = str;
    }

    public final void setTokenChat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenChat = str;
    }

    public final void setTokenRoom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tokenRoom = str;
    }
}
