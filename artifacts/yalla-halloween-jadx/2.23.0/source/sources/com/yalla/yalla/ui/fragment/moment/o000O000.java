package com.yalla.yalla.ui.fragment.moment;

import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.ui.vm.moment.MomentFeaturedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFeaturedVM f28852OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O000(MomentFeaturedVM momentFeaturedVM) {
        super(0);
        this.f28852OooO0Oo = momentFeaturedVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentFeaturedVM momentFeaturedVM = this.f28852OooO0Oo;
        momentFeaturedVM.getContentState().setValue(ContentState.Loading);
        MomentFeaturedVM.loadFeaturedMomentList$default(momentFeaturedVM, false, 1, null);
        return Unit.INSTANCE;
    }
}
