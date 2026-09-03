package com.yalla.yalla.ui.vm.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaChatVM f32356OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(YallaChatVM yallaChatVM) {
        super(0);
        this.f32356OooO0Oo = yallaChatVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f32356OooO0Oo.yallaChatLogin();
        return Unit.INSTANCE;
    }
}
