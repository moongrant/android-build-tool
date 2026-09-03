package com.yalla.yalla.ui.fragment.moment;

import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingVM f28267OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(MomentFollowingVM momentFollowingVM) {
        super(0);
        this.f28267OooO0Oo = momentFollowingVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentFollowingVM momentFollowingVM = this.f28267OooO0Oo;
        momentFollowingVM.getContentState().setValue(ContentState.Loading);
        MomentFollowingVM.loadFollowingMomentList$default(momentFollowingVM, false, 1, null);
        return Unit.INSTANCE;
    }
}
