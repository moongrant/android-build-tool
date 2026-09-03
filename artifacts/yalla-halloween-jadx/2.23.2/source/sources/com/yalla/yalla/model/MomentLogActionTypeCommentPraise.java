package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.apm.netdetector.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/MomentLogActionTypeCommentPraise;", "Lcom/yalla/yalla/model/MomentLogActionTypeBase;", "object_userid", "", "discoveryid", "comment_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComment_id", "()Ljava/lang/String;", "setComment_id", "(Ljava/lang/String;)V", "getDiscoveryid", "setDiscoveryid", "getObject_userid", "setObject_userid", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MomentLogActionTypeCommentPraise extends MomentLogActionTypeBase {
    public static final int $stable = 8;

    @NotNull
    private String comment_id;

    @NotNull
    private String discoveryid;

    @NotNull
    private String object_userid;

    public MomentLogActionTypeCommentPraise() {
        this(null, null, null, 7, null);
    }

    @NotNull
    public final String getComment_id() {
        return this.comment_id;
    }

    @NotNull
    public final String getDiscoveryid() {
        return this.discoveryid;
    }

    @NotNull
    public final String getObject_userid() {
        return this.object_userid;
    }

    public final void setComment_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.comment_id = str;
    }

    public final void setDiscoveryid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.discoveryid = str;
    }

    public final void setObject_userid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.object_userid = str;
    }

    public MomentLogActionTypeCommentPraise(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        OooO00o.OooO00o(str, "object_userid", str2, "discoveryid", str3, "comment_id");
        this.object_userid = str;
        this.discoveryid = str2;
        this.comment_id = str3;
    }

    public /* synthetic */ MomentLogActionTypeCommentPraise(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
