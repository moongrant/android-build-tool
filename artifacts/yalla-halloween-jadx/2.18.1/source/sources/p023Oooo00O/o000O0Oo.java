package p023Oooo00O;

import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f1072Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000Oo0.OooO00o<Object, Object> f1073Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o000Oo0 o000oo1, o000Oo0.OooO00o<Object, Object> oooO00o) {
        super(1);
        this.f1072Oooo0o = o000oo1;
        this.f1073Oooo0oO = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        o000Oo0 o000oo1 = this.f1072Oooo0o;
        o000Oo0.OooO00o<Object, Object> animation = this.f1073Oooo0oO;
        Objects.requireNonNull(o000oo1);
        Intrinsics.checkNotNullParameter(animation, "animation");
        o000oo1.f1089OooO00o.OooO0O0(animation);
        o000oo1.f1090OooO0O0.setValue(Boolean.TRUE);
        return new o000O0(this.f1072Oooo0o, this.f1073Oooo0oO);
    }
}
