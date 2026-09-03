package com.yalla.yalla.model;

import Oooo000.o000O0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p516o0o0O000.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010$\u001a\u00020%J\u001e\u0010&\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003J&\u0010'\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\u0000J\u0006\u0010*\u001a\u00020\u0003J\b\u0010+\u001a\u00020\u0003H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\u0004R\u001a\u0010!\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u0006,"}, d2 = {"Lcom/yalla/yalla/model/MomentSendCommentModel;", "Ljava/io/Serializable;", "dyIdStr", "", "(Ljava/lang/String;)V", "cid", "getCid", "()Ljava/lang/String;", "setCid", "content", "Lcom/yalla/yalla/model/MomentSendContentModel;", "getContent", "()Lcom/yalla/yalla/model/MomentSendContentModel;", "setContent", "(Lcom/yalla/yalla/model/MomentSendContentModel;)V", "dyid", "getDyid", "setDyid", "localId", "", "getLocalId", "()J", "setLocalId", "(J)V", "localParentCid", "getLocalParentCid", "setLocalParentCid", "parentUserId", "getParentUserId", "setParentUserId", "parentUserName", "getParentUserName", "setParentUserName", "replyId", "getReplyId", "setReplyId", "cleanComment", "", "setComment", "setCommentSon", "setSendPostCommentModel", "sendPostCommentModel", "toJSONString", "toString", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentSendCommentModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private String cid;

    @Nullable
    private MomentSendContentModel content;

    @NotNull
    private String dyid;
    private long localId;
    private long localParentCid;

    @Nullable
    private String parentUserId;

    @Nullable
    private String parentUserName;
    private long replyId;

    public MomentSendCommentModel(@NotNull String dyIdStr) {
        Intrinsics.checkNotNullParameter(dyIdStr, "dyIdStr");
        this.dyid = dyIdStr;
    }

    public final void cleanComment() {
        this.cid = "";
        this.parentUserId = "";
        this.parentUserName = "";
        this.localId = 0L;
    }

    @Nullable
    public final String getCid() {
        return this.cid;
    }

    @Nullable
    public final MomentSendContentModel getContent() {
        return this.content;
    }

    @NotNull
    public final String getDyid() {
        return this.dyid;
    }

    public final long getLocalId() {
        return this.localId;
    }

    public final long getLocalParentCid() {
        return this.localParentCid;
    }

    @Nullable
    public final String getParentUserId() {
        return this.parentUserId;
    }

    @Nullable
    public final String getParentUserName() {
        return this.parentUserName;
    }

    public final long getReplyId() {
        return this.replyId;
    }

    public final void setCid(@Nullable String str) {
        this.cid = str;
    }

    public final void setComment(@NotNull String cid, @NotNull String parentUserId, @NotNull String parentUserName) {
        com.facebook.OooO00o.OooO0O0(cid, "cid", parentUserId, "parentUserId", parentUserName, "parentUserName");
        this.cid = cid;
        this.parentUserId = parentUserId;
        this.parentUserName = parentUserName;
    }

    public final void setCommentSon(@NotNull String cid, @NotNull String parentUserId, @NotNull String parentUserName, long localParentCid) {
        com.facebook.OooO00o.OooO0O0(cid, "cid", parentUserId, "parentUserId", parentUserName, "parentUserName");
        this.cid = cid;
        this.parentUserId = parentUserId;
        this.parentUserName = parentUserName;
        this.localParentCid = localParentCid;
    }

    public final void setContent(@Nullable MomentSendContentModel momentSendContentModel) {
        this.content = momentSendContentModel;
    }

    public final void setDyid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dyid = str;
    }

    public final void setLocalId(long j) {
        this.localId = j;
    }

    public final void setLocalParentCid(long j) {
        this.localParentCid = j;
    }

    public final void setParentUserId(@Nullable String str) {
        this.parentUserId = str;
    }

    public final void setParentUserName(@Nullable String str) {
        this.parentUserName = str;
    }

    public final void setReplyId(long j) {
        this.replyId = j;
    }

    public final void setSendPostCommentModel(@NotNull MomentSendCommentModel sendPostCommentModel) {
        Intrinsics.checkNotNullParameter(sendPostCommentModel, "sendPostCommentModel");
        this.dyid = sendPostCommentModel.dyid;
        this.cid = sendPostCommentModel.cid;
        this.content = sendPostCommentModel.content;
        this.parentUserId = sendPostCommentModel.parentUserId;
        this.parentUserName = sendPostCommentModel.parentUserName;
        this.replyId = sendPostCommentModel.replyId;
        this.localParentCid = sendPostCommentModel.localParentCid;
        this.localId = sendPostCommentModel.localId;
    }

    @NotNull
    public final String toJSONString() {
        return o0Oo0oo.OooO0O0(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("MomentSendCommentModel(dyid='");
        sbOooO0o0.append(this.dyid);
        sbOooO0o0.append("', content=");
        sbOooO0o0.append(this.content);
        sbOooO0o0.append(", cid=");
        sbOooO0o0.append(this.cid);
        sbOooO0o0.append(", parentUserId=");
        sbOooO0o0.append(this.parentUserId);
        sbOooO0o0.append(", parentUserName=");
        sbOooO0o0.append(this.parentUserName);
        sbOooO0o0.append(", replyId=");
        sbOooO0o0.append(this.replyId);
        sbOooO0o0.append(", localId=");
        sbOooO0o0.append(this.localId);
        sbOooO0o0.append(", localParentCid=");
        return o000O0.OooO0O0(sbOooO0o0, this.localParentCid, ')');
    }
}
