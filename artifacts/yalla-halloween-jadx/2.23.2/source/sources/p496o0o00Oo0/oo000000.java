package p496o0o00Oo0;

import android.view.View;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.activity.moment.postDetailCommentSonList.MomentReplyHeaderView;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyHeaderView f49676OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000000(MomentReplyHeaderView momentReplyHeaderView) {
        super(1);
        this.f49676OooO0Oo = momentReplyHeaderView;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        boolean z;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        MomentReplyHeaderView momentReplyHeaderView = this.f49676OooO0Oo;
        MomentCommentDetailModel momentCommentDetailModel = momentReplyHeaderView.f26004OooO0oo;
        if (momentCommentDetailModel != null) {
            z = momentCommentDetailModel.isHide();
        }
        if (!z) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            MomentReplyActivity activity = momentReplyHeaderView.getActivity();
            MomentCommentDetailModel momentCommentDetailModel2 = momentReplyHeaderView.f26004OooO0oo;
            UserInfoActivity.OooO00o.OooO0OO(oooO00o, activity, momentCommentDetailModel2 != null ? momentCommentDetailModel2.getUserid() : null, false, 12);
        }
        return Unit.INSTANCE;
    }
}
