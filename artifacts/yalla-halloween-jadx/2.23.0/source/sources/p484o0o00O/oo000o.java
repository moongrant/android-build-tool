package p484o0o00O;

import android.view.View;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f47754OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(MomentReplyHeaderView momentReplyHeaderView) {
        super(1);
        this.f47754OooO0Oo = momentReplyHeaderView;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        boolean z;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentReplyHeaderView momentReplyHeaderView = this.f47754OooO0Oo;
        MomentCommentDetailModel momentCommentDetailModel = momentReplyHeaderView.f26456OooO0oo;
        if (momentCommentDetailModel != null) {
            z = momentCommentDetailModel.isHide();
        }
        if (!z) {
            MomentReplyActivity activity = momentReplyHeaderView.getActivity();
            int i = MomentReplyActivity.f26149OooOoO;
            activity.OooOooO(0L);
        }
        return Unit.INSTANCE;
    }
}
