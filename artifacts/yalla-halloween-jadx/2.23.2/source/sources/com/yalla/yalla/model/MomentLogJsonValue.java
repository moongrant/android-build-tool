package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0018\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/MomentLogJsonValue;", "", "()V", "action_info", "", "getAction_info", "()Ljava/lang/String;", "setAction_info", "(Ljava/lang/String;)V", "action_time", "getAction_time", "setAction_time", ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "getAction_type", "setAction_type", "agent_userid", "getAgent_userid", "setAgent_userid", "session_id", "getSession_id", "setSession_id", "source_page", "getSource_page", "setSource_page", "toJson", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentLogJsonValue {
    public static final int $stable = 8;

    @NotNull
    private String session_id = "";

    @NotNull
    private String agent_userid = "";

    @NotNull
    private String action_type = "";

    @NotNull
    private String source_page = "";

    @NotNull
    private String action_time = "";

    @NotNull
    private String action_info = "";

    @NotNull
    public final String getAction_info() {
        return this.action_info;
    }

    @NotNull
    public final String getAction_time() {
        return this.action_time;
    }

    @NotNull
    public final String getAction_type() {
        return this.action_type;
    }

    @NotNull
    public final String getAgent_userid() {
        return this.agent_userid;
    }

    @NotNull
    public final String getSession_id() {
        return this.session_id;
    }

    @NotNull
    public final String getSource_page() {
        return this.source_page;
    }

    public final void setAction_info(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action_info = str;
    }

    public final void setAction_time(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action_time = str;
    }

    public final void setAction_type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action_type = str;
    }

    public final void setAgent_userid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.agent_userid = str;
    }

    public final void setSession_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.session_id = str;
    }

    public final void setSource_page(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.source_page = str;
    }

    @NotNull
    public final String toJson() {
        String strOooO0OO = oOOO00.OooO0OO(this);
        Intrinsics.checkNotNullExpressionValue(strOooO0OO, "toJson(...)");
        return strOooO0OO;
    }
}
