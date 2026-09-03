package p032OoooO0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p026Oooo0OO.o000;
import p026Oooo0OO.o000Oo0;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0o0Oo extends Lambda implements Function1<o00OOOO0, p100o000oOoO.o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o000Oo0> f3379Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000 f3380Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(o0O00OO<o000Oo0> o0o00oo2, o000 o000Var) {
        super(1);
        this.f3379Oooo0o = o0o00oo2;
        this.f3380Oooo0oO = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final p100o000oOoO.o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new o00OOO0O(this.f3379Oooo0o, this.f3380Oooo0oO);
    }
}
