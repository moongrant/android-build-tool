package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/EnterRoomLogJsonValue;", "", "()V", "expoList", "", "getExpoList", "()Ljava/lang/String;", "setExpoList", "(Ljava/lang/String;)V", "expoTime", "getExpoTime", "setExpoTime", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "sessionId", "getSessionId", "setSessionId", "sourcePage", "getSourcePage", "setSourcePage", "userId", "getUserId", "setUserId", "toJson", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EnterRoomLogJsonValue {
    public static final int $stable = 8;

    @NotNull
    private String userId = "";

    @NotNull
    private String roomId = "";

    @NotNull
    private String sourcePage = "";

    @NotNull
    private String expoList = "";

    @NotNull
    private String expoTime = "";

    @NotNull
    private String sessionId = "";

    @NotNull
    public final String getExpoList() {
        return this.expoList;
    }

    @NotNull
    public final String getExpoTime() {
        return this.expoTime;
    }

    @NotNull
    public final String getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getSourcePage() {
        return this.sourcePage;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setExpoList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expoList = str;
    }

    public final void setExpoTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.expoTime = str;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomId = str;
    }

    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setSourcePage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sourcePage = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public final String toJson() {
        String strOooO0OO = oOo00OO0.OooO0OO(this);
        Intrinsics.checkNotNullExpressionValue(strOooO0OO, "toJson(this)");
        return strOooO0OO;
    }
}
