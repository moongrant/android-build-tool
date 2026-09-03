package p492o0o00OO0;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p522o0o0O0oO.oO000O0;
import p583o0oOoo00.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0o0O0 extends Lambda implements Function1<oO000O0, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f49544OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(MomentReplyActivity momentReplyActivity) {
        super(1);
        this.f49544OooO0Oo = momentReplyActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oO000O0 oo000o0) {
        oO000O0 it = oo000o0;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentReplyActivity momentReplyActivity = this.f49544OooO0Oo;
        MomentDetailModel currentMomentDetail = momentReplyActivity.OooOoO().getCurrentMomentDetail();
        Long lValueOf = currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null;
        MomentCommentDetailModel currentComment = momentReplyActivity.OooOoO().getCurrentComment();
        Long lValueOf2 = currentComment != null ? Long.valueOf(currentComment.getId()) : null;
        Long currentReplyId = momentReplyActivity.OooOoO().getCurrentReplyId();
        HashMap<String, oO000O0> map = oo0o0Oo.f56691OooO00o;
        oo0o0Oo.OooO0O0(lValueOf, lValueOf2, currentReplyId, it);
        return Unit.INSTANCE;
    }
}
