package Oooo0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o extends Lambda implements Function1<p100o000oOoO.o00OOOO0, p100o000oOoO.o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<p026Oooo0OO.o000Oo0> f699Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f700Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(o0O00OO<p026Oooo0OO.o000Oo0> o0o00oo2, p026Oooo0OO.o000 o000Var) {
        super(1);
        this.f699Oooo0o = o0o00oo2;
        this.f700Oooo0oO = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final p100o000oOoO.o0o0Oo invoke(p100o000oOoO.o00OOOO0 o00oooo1) {
        p100o000oOoO.o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new oo000o(this.f699Oooo0o, this.f700Oooo0oO);
    }
}
