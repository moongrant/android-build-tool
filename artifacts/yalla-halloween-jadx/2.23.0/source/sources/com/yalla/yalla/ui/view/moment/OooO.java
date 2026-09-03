package com.yalla.yalla.ui.view.moment;

import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentReplyItemView f31173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentReplyModel f31174OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel) {
        super(0);
        this.f31173OooO0Oo = momentReplyItemView;
        this.f31174OooO0o0 = momentReplyModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentReplyActivity activity = this.f31173OooO0Oo.getActivity();
        if (activity != null) {
            int i = MomentReplyActivity.f26149OooOoO;
            activity.OooOoo(this.f31174OooO0o0, 0L);
        }
        return Unit.INSTANCE;
    }
}
