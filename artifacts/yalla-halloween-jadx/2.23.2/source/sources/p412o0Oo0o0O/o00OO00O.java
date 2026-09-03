package p412o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.data.db.table.MomentMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OO00O {
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(@NotNull MomentMessage momentMessage) {
        MomentMessage.MomentComment momentComment;
        Intrinsics.checkNotNullParameter(momentMessage, "momentMessage");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        if (l != null) {
            int type = momentMessage.getType();
            if (type == -6) {
                MomentMessage.CommentAt commentAt = momentMessage.getCommentAt();
                if (commentAt == null || commentAt.getMomentId() <= 0 || commentAt.getCommentId() <= 0) {
                    return;
                }
                o00Oo0.OooO00o().OooOo().OooO0O0(l.longValue(), commentAt.getUserId(), Long.valueOf(commentAt.getMomentId()), Long.valueOf(commentAt.getCommentId()));
                return;
            }
            if (type == -1) {
                MomentMessage.MomentPraise momentPraise = momentMessage.getMomentPraise();
                if (momentPraise == null || momentPraise.getMomentId() <= 0) {
                    return;
                }
                o00Oo0.OooO00o().OooOo().OooO0o(l.longValue(), momentPraise.getUserId(), momentPraise.getMomentId());
                return;
            }
            if (type != -4) {
                if (type == -3 && (momentComment = momentMessage.getMomentComment()) != null && momentComment.getMomentId() > 0 && momentComment.getCommentId() > 0) {
                    o00Oo0.OooO00o().OooOo().OooO(l.longValue(), momentComment.getUserId(), Long.valueOf(momentComment.getMomentId()), Long.valueOf(momentComment.getCommentId()));
                    return;
                }
                return;
            }
            MomentMessage.CommentReply commentReply = momentMessage.getCommentReply();
            if (commentReply == null || commentReply.getMomentId() <= 0 || commentReply.getCommentId() <= 0) {
                return;
            }
            o00Oo0.OooO00o().OooOo().OooOO0(l.longValue(), commentReply.getUserId(), Long.valueOf(commentReply.getMomentId()), Long.valueOf(commentReply.getCommentId()));
        }
    }
}
