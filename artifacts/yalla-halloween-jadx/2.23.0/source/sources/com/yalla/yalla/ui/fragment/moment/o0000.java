package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailGiftFragment f28826OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(MomentDetailGiftFragment momentDetailGiftFragment) {
        super(0);
        this.f28826OooO0Oo = momentDetailGiftFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailGiftFragment.loadData$default(this.f28826OooO0Oo, true, false, false, 4, null);
        return Unit.INSTANCE;
    }
}
