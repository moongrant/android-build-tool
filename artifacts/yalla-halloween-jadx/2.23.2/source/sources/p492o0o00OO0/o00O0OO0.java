package p492o0o00OO0;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p522o0o0O0oO.oO000O0;
import p583o0oOoo00.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 extends Lambda implements Function0<oO000O0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49168OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(MomentReplyActivity momentReplyActivity) {
        super(0);
        this.f49168OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final oO000O0 invoke() {
        MomentReplyActivity momentReplyActivity = this.f49168OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        Long lValueOf = currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null;
        MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
        Long lValueOf2 = currentComment != null ? Long.valueOf(currentComment.getId()) : null;
        Long currentReplyId = momentReplyActivity.OooOoO().getCurrentReplyId();
        HashMap<String, oO000O0> map = oo0o0Oo.f56691OooO00o;
        return oo0o0Oo.OooO00o(lValueOf, lValueOf2, currentReplyId);
    }
}
