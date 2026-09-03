package com.yalla.yalla.model.moment;

import OooO0OO.OooO0O0;
import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.db.table.UserInfo;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010-\u001a\u00020.J\u0006\u0010/\u001a\u00020.J&\u00100\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003J&\u00101\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u0000J\u0006\u00104\u001a\u00020\u0003J\b\u00105\u001a\u00020\u0003H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0004R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\u0004R\u001a\u0010*\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017¨\u00067"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", "Ljava/io/Serializable;", "dyIdStr", "", "(Ljava/lang/String;)V", "cid", "getCid", "()Ljava/lang/String;", "setCid", "content", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "getContent", "()Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "setContent", "(Lcom/yalla/yalla/model/moment/MomentSendContentModel;)V", "dyid", "getDyid", "setDyid", "localId", "", "getLocalId", "()J", "setLocalId", "(J)V", "localParentCid", "getLocalParentCid", "setLocalParentCid", "localSessionId", "getLocalSessionId", "setLocalSessionId", "localSourcesId", "getLocalSourcesId", "()Ljava/lang/Long;", "setLocalSourcesId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "parentUserId", "getParentUserId", "setParentUserId", "parentUserName", "getParentUserName", "setParentUserName", "replyId", "getReplyId", "setReplyId", "cleanComment", "", "setComment", "setReply", "setReplySon", "setSendPostCommentModel", "sendPostCommentModel", "toJSONString", "toString", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MomentSendCommentModel implements Serializable {

    @Nullable
    private String cid;

    @Nullable
    private MomentSendContentModel content;

    @NotNull
    private String dyid;
    private long localId;
    private long localParentCid;

    @Nullable
    private String localSessionId;

    @Nullable
    private Long localSourcesId;

    @Nullable
    private String parentUserId;

    @Nullable
    private String parentUserName;
    private long replyId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentSendCommentModel$Companion;", "", "()V", "initSendContent", "Lcom/yalla/yalla/model/moment/MomentSendCommentModel;", "moment", "Lcom/yalla/yalla/model/moment/MomentDetailModel;", "comment", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "reply", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "user", "Lcom/yalla/yalla/data/db/table/UserInfo;", "sendContent", "Lcom/yalla/yalla/model/moment/MomentSendContentModel;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MomentSendCommentModel initSendContent(@NotNull MomentDetailModel moment, @Nullable MomentCommentDetailModel comment, @Nullable MomentReplyModel reply, @Nullable UserInfo user, @Nullable MomentSendContentModel sendContent) {
            Intrinsics.checkNotNullParameter(moment, "moment");
            MomentSendCommentModel momentSendCommentModel = new MomentSendCommentModel(o0OoOo0.OooOOO0("", Long.valueOf(moment.getId())));
            momentSendCommentModel.setLocalSessionId(moment.getSessionId());
            momentSendCommentModel.setLocalSourcesId(Long.valueOf(moment.getSourcesId()));
            momentSendCommentModel.setContent(sendContent);
            if (reply != null) {
                momentSendCommentModel.setReplySon(o0OoOo0.OooOOO0("", comment != null ? Long.valueOf(comment.getId()) : null), o0OoOo0.OooOOO0("", user != null ? Long.valueOf(user.getUserId()) : null), o0OoOo0.OooOOO(user != null ? user.getUserName() : null, ""), o0OoOo0.OooOO0(reply != null ? Long.valueOf(reply.getId()) : null));
            } else {
                if (comment != null) {
                    MomentSendCommentModel.setReply$default(momentSendCommentModel, o0OoOo0.OooOOO0("", comment != null ? Long.valueOf(comment.getId()) : null), null, null, 6, null);
                } else {
                    momentSendCommentModel.setComment();
                }
            }
            OooOOO0.OooO0o("WRM 添加 initSendContent \nmodel = ".concat(OooOO0.OooO00o(momentSendCommentModel)));
            return momentSendCommentModel;
        }
    }

    public MomentSendCommentModel(@NotNull String dyIdStr) {
        Intrinsics.checkNotNullParameter(dyIdStr, "dyIdStr");
        this.dyid = "";
        this.localSessionId = "";
        this.localSourcesId = 0L;
        this.dyid = dyIdStr;
    }

    public static /* synthetic */ void setReply$default(MomentSendCommentModel momentSendCommentModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        momentSendCommentModel.setReply(str, str2, str3);
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
    public final String getLocalSessionId() {
        return this.localSessionId;
    }

    @Nullable
    public final Long getLocalSourcesId() {
        return this.localSourcesId;
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

    public final void setComment() {
        this.cid = null;
        this.parentUserId = null;
        this.parentUserName = null;
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

    public final void setLocalSessionId(@Nullable String str) {
        this.localSessionId = str;
    }

    public final void setLocalSourcesId(@Nullable Long l) {
        this.localSourcesId = l;
    }

    public final void setParentUserId(@Nullable String str) {
        this.parentUserId = str;
    }

    public final void setParentUserName(@Nullable String str) {
        this.parentUserName = str;
    }

    public final void setReply(@NotNull String cid, @Nullable String parentUserId, @Nullable String parentUserName) {
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.cid = cid;
        this.parentUserId = parentUserId;
        this.parentUserName = parentUserName;
    }

    public final void setReplyId(long j) {
        this.replyId = j;
    }

    public final void setReplySon(@NotNull String cid, @NotNull String parentUserId, @NotNull String parentUserName, long localParentCid) {
        OooO0OO.OooO00o(cid, "cid", parentUserId, "parentUserId", parentUserName, "parentUserName");
        this.cid = cid;
        this.parentUserId = parentUserId;
        this.parentUserName = parentUserName;
        this.localParentCid = localParentCid;
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
        return OooOO0.OooO00o(this);
    }

    @NotNull
    public String toString() {
        String str = this.dyid;
        String str2 = this.localSessionId;
        Long l = this.localSourcesId;
        MomentSendContentModel momentSendContentModel = this.content;
        String str3 = this.cid;
        String str4 = this.parentUserId;
        String str5 = this.parentUserName;
        long j = this.replyId;
        long j2 = this.localId;
        long j3 = this.localParentCid;
        StringBuilder sbOooO0OO = OooO0o.OooO0OO("MomentSendCommentModel(dyid='", str, "', localSessionId=", str2, ", localSourcesId=");
        sbOooO0OO.append(l);
        sbOooO0OO.append(", content=");
        sbOooO0OO.append(momentSendContentModel);
        sbOooO0OO.append(", cid=");
        OooO0O0.OooO00o(sbOooO0OO, str3, ", parentUserId=", str4, ", parentUserName=");
        sbOooO0OO.append(str5);
        sbOooO0OO.append(", replyId=");
        sbOooO0OO.append(j);
        o000Oo0.OooO0O0.OooO00o(sbOooO0OO, ", localId=", j2, ", localParentCid=");
        return android.support.v4.media.session.OooO0o.OooO0O0(sbOooO0OO, j3, ")");
    }
}
