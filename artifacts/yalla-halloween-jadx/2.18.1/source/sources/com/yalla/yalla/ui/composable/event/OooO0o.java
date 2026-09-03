package com.yalla.yalla.ui.composable.event;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f23723Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(o0O00OO<Boolean> o0o00oo2) {
        super(0);
        this.f23723Oooo0o = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Room_explore_Everts_subscribe_check");
        this.f23723Oooo0o.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
