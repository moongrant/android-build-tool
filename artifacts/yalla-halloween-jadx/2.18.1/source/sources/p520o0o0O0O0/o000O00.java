package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.db.table.MomentMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000O00 {
    public static final void OooO00o(@NotNull MomentMessage momentMessage) {
        MomentMessage.MomentComment momentComment;
        Intrinsics.checkNotNullParameter(momentMessage, "momentMessage");
        Long value = OooOOO.f41216OooO00o.OooOo().getValue();
        if (value != null) {
            int type = momentMessage.getType();
            if (type == -6) {
                MomentMessage.CommentAt commentAt = momentMessage.getCommentAt();
                if (commentAt == null || commentAt.getMomentId() <= 0 || commentAt.getCommentId() <= 0) {
                    return;
                }
                OooO0OO.OooO00o().OooOoO0().OooO0oO(value.longValue(), commentAt.getUserId(), Long.valueOf(commentAt.getMomentId()), Long.valueOf(commentAt.getCommentId()));
                return;
            }
            if (type == -1) {
                MomentMessage.MomentPraise momentPraise = momentMessage.getMomentPraise();
                if (momentPraise == null || momentPraise.getMomentId() <= 0) {
                    return;
                }
                OooO0OO.OooO00o().OooOoO0().OooO00o(value.longValue(), momentPraise.getUserId(), momentPraise.getMomentId());
                return;
            }
            if (type != -4) {
                if (type == -3 && (momentComment = momentMessage.getMomentComment()) != null && momentComment.getMomentId() > 0 && momentComment.getCommentId() > 0) {
                    OooO0OO.OooO00o().OooOoO0().OooO0o(value.longValue(), momentComment.getUserId(), Long.valueOf(momentComment.getMomentId()), Long.valueOf(momentComment.getCommentId()));
                    return;
                }
                return;
            }
            MomentMessage.CommentReply commentReply = momentMessage.getCommentReply();
            if (commentReply == null || commentReply.getMomentId() <= 0 || commentReply.getCommentId() <= 0) {
                return;
            }
            OooO0OO.OooO00o().OooOoO0().OooO(value.longValue(), commentReply.getUserId(), Long.valueOf(commentReply.getMomentId()), Long.valueOf(commentReply.getCommentId()));
        }
    }
}
