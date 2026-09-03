package com.yalla.yalla.ui.view.moment;

import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f31178OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(MomentReplyItemView momentReplyItemView) {
        super(0);
        this.f31178OooO0Oo = momentReplyItemView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
        MomentReplyItemView momentReplyItemView = this.f31178OooO0Oo;
        MomentReplyActivity activity = momentReplyItemView.getActivity();
        MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
        UserInfoActivity.OooO00o.OooO0OO(oooO00o, activity, String.valueOf(momentReplyModel != null ? Long.valueOf(momentReplyModel.getUserid()) : null), false, 12);
        return Unit.INSTANCE;
    }
}
