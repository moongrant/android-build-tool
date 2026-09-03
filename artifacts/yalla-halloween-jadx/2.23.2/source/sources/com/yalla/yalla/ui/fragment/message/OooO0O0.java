package com.yalla.yalla.ui.fragment.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageFragment f28045OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(MessageFragment messageFragment) {
        super(0);
        this.f28045OooO0Oo = messageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f28045OooO0Oo.getBinding().f44869OooO0OO.setCurrentItem(1);
        return Unit.INSTANCE;
    }
}
