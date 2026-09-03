package androidx.compose.foundation;

import Oooo0.o000OOo0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p026Oooo0OO.o000;
import p026Oooo0OO.o0000O0;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o0000O0> f5605Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000 f5606Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(o0O00OO<o0000O0> o0o00oo2, o000 o000Var) {
        super(1);
        this.f5605Oooo0o = o0o00oo2;
        this.f5606Oooo0oO = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new o000OOo0(this.f5605Oooo0o, this.f5606Oooo0oO);
    }
}
