package com.yalla.yalla.ui.activity.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f26226OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(MomentDetailActivity momentDetailActivity) {
        super(0);
        this.f26226OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailActivity momentDetailActivity = this.f26226OooO0Oo;
        momentDetailActivity.getClass();
        momentDetailActivity.finish();
        return Unit.INSTANCE;
    }
}
