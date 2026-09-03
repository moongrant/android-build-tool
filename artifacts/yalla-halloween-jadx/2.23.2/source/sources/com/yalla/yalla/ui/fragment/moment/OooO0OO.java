package com.yalla.yalla.ui.fragment.moment;

import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingVM f28271OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(MomentFollowingVM momentFollowingVM) {
        super(0);
        this.f28271OooO0Oo = momentFollowingVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentFollowingVM.loadFollowingMomentList$default(this.f28271OooO0Oo, false, 1, null);
        return Unit.INSTANCE;
    }
}
