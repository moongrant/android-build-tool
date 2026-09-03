package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/MomentLogActionTypeCommentReply;", "Lcom/yalla/yalla/model/MomentLogActionTypeBase;", "object_userid", "", "discoveryid", "commentid", "reply_content", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCommentid", "()Ljava/lang/String;", "setCommentid", "(Ljava/lang/String;)V", "getDiscoveryid", "setDiscoveryid", "getObject_userid", "setObject_userid", "getReply_content", "setReply_content", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentLogActionTypeCommentReply extends MomentLogActionTypeBase {
    public static final int $stable = 8;

    @NotNull
    private String commentid;

    @NotNull
    private String discoveryid;

    @NotNull
    private String object_userid;

    @NotNull
    private String reply_content;

    public MomentLogActionTypeCommentReply() {
        this(null, null, null, null, 15, null);
    }

    @NotNull
    public final String getCommentid() {
        return this.commentid;
    }

    @NotNull
    public final String getDiscoveryid() {
        return this.discoveryid;
    }

    @NotNull
    public final String getObject_userid() {
        return this.object_userid;
    }

    @NotNull
    public final String getReply_content() {
        return this.reply_content;
    }

    public final void setCommentid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.commentid = str;
    }

    public final void setDiscoveryid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.discoveryid = str;
    }

    public final void setObject_userid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.object_userid = str;
    }

    public final void setReply_content(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.reply_content = str;
    }

    public MomentLogActionTypeCommentReply(@NotNull String object_userid, @NotNull String discoveryid, @NotNull String commentid, @NotNull String reply_content) {
        Intrinsics.checkNotNullParameter(object_userid, "object_userid");
        Intrinsics.checkNotNullParameter(discoveryid, "discoveryid");
        Intrinsics.checkNotNullParameter(commentid, "commentid");
        Intrinsics.checkNotNullParameter(reply_content, "reply_content");
        this.object_userid = object_userid;
        this.discoveryid = discoveryid;
        this.commentid = commentid;
        this.reply_content = reply_content;
    }

    public /* synthetic */ MomentLogActionTypeCommentReply(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
