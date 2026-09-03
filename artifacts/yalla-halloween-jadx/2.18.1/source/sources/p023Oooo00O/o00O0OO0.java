package p023Oooo00O;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO0 extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo00o<Object> f1168Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo00o<Object>.OooO00o<Object, Object> f1169Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO0(oo00o<Object> oo00oVar, oo00o<Object>.OooO00o<Object, Object> oooO00o) {
        super(1);
        this.f1168Oooo0o = oo00oVar;
        this.f1169Oooo0oO = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new o00O0O0O(this.f1168Oooo0o, this.f1169Oooo0oO);
    }
}
