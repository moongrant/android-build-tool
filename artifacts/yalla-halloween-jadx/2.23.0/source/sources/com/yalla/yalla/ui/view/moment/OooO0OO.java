package com.yalla.yalla.ui.view.moment;

import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentItemView f31177OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(MomentDetailCommentItemView momentDetailCommentItemView) {
        super(0);
        this.f31177OooO0Oo = momentDetailCommentItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        MomentDetailCommentItemView momentDetailCommentItemView = this.f31177OooO0Oo;
        MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, fragment != null ? fragment.getActivity() : null, momentDetailCommentItemView.getItem().getUserid(), false, 12);
        return Unit.INSTANCE;
    }
}
