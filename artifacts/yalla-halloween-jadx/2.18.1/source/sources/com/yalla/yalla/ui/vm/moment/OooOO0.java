package com.yalla.yalla.ui.vm.moment;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaChatVM f25904Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(YallaChatVM yallaChatVM) {
        super(0);
        this.f25904Oooo0o = yallaChatVM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f25904Oooo0o.yallaChatLogin();
        return Unit.INSTANCE;
    }
}
