package p485o0o00O0;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p402o0Oo0OOO.o000O;
import p534o0o0Oo00.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0oOO0 extends Lambda implements Function0<o000oOoO> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f48227OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(MomentReplyActivity momentReplyActivity) {
        super(0);
        this.f48227OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o000oOoO invoke() {
        MomentReplyActivity momentReplyActivity = this.f48227OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        Long lValueOf = currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null;
        MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
        Long lValueOf2 = currentComment != null ? Long.valueOf(currentComment.getId()) : null;
        Long currentReplyId = momentReplyActivity.OooOoO().getCurrentReplyId();
        HashMap<String, o000oOoO> map = o000O.f44463OooO00o;
        return o000O.OooO00o(lValueOf, lValueOf2, currentReplyId);
    }
}
