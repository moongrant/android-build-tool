package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/model/UserVoiceLogJsonValue;", "", "()V", "logTime", "", "getLogTime", "()Ljava/lang/String;", "setLogTime", "(Ljava/lang/String;)V", ContributionFragment.ARG_1, "getRoomId", "setRoomId", "timeVoice", "getTimeVoice", "setTimeVoice", "userId", "getUserId", "setUserId", "toJson", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UserVoiceLogJsonValue {
    public static final int $stable = 8;

    @NotNull
    private String userId = "";

    @NotNull
    private String roomId = "";

    @NotNull
    private String logTime = "";

    @NotNull
    private String timeVoice = "";

    @NotNull
    public final String getLogTime() {
        return this.logTime;
    }

    @NotNull
    public final String getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getTimeVoice() {
        return this.timeVoice;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final void setLogTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logTime = str;
    }

    public final void setRoomId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.roomId = str;
    }

    public final void setTimeVoice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeVoice = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public final String toJson() {
        String strOooO0OO = oOOO00.OooO0OO(this);
        Intrinsics.checkNotNullExpressionValue(strOooO0OO, "toJson(...)");
        return strOooO0OO;
    }
}
