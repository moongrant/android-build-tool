package com.yalla.yalla.ui.composable.event;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f23721Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(o0O00OO<Boolean> o0o00oo2) {
        super(1);
        this.f23721Oooo0o = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.f23721Oooo0o.setValue(bool);
        return Unit.INSTANCE;
    }
}
