package com.yalla.yalla.ui.fragment.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailCommentFragment f28307OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(MomentDetailCommentFragment momentDetailCommentFragment) {
        super(0);
        this.f28307OooO0Oo = momentDetailCommentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentDetailCommentFragment.loadData$default(this.f28307OooO0Oo, true, false, false, 4, null);
        return Unit.INSTANCE;
    }
}
