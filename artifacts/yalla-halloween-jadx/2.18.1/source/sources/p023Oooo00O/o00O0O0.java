package p023Oooo00O;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O0 extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo00o<Object> f1160Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo00o<Object> f1161Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(oo00o<Object> oo00oVar, oo00o<Object> oo00oVar2) {
        super(1);
        this.f1160Oooo0o = oo00oVar;
        this.f1161Oooo0oO = oo00oVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        oo00o<Object> oo00oVar = this.f1160Oooo0o;
        oo00o<?> transition = this.f1161Oooo0oO;
        Objects.requireNonNull(oo00oVar);
        Intrinsics.checkNotNullParameter(transition, "transition");
        oo00oVar.f1243OooO.add(transition);
        return new o00O0O00(this.f1160Oooo0o, this.f1161Oooo0oO);
    }
}
