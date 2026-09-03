package p023Oooo00O;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo00o<Object> f1166Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo00o<Object>.OooO0o<Object, Object> f1167Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0OO(oo00o<Object> oo00oVar, oo00o<Object>.OooO0o<Object, Object> oooO0o) {
        super(1);
        this.f1166Oooo0o = oo00oVar;
        this.f1167Oooo0oO = oooO0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        oo00o<Object> oo00oVar = this.f1166Oooo0o;
        oo00o<Object>.OooO0o<?, ?> animation = this.f1167Oooo0oO;
        Objects.requireNonNull(oo00oVar);
        Intrinsics.checkNotNullParameter(animation, "animation");
        oo00oVar.f1251OooO0oo.add(animation);
        return new oo0o0O0(this.f1166Oooo0o, this.f1167Oooo0oO);
    }
}
