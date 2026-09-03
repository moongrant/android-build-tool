package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailLikeFragment f28317OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(MomentDetailLikeFragment momentDetailLikeFragment) {
        super(0);
        this.f28317OooO0Oo = momentDetailLikeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f28317OooO0Oo.loadData(true, false);
        return Unit.INSTANCE;
    }
}
