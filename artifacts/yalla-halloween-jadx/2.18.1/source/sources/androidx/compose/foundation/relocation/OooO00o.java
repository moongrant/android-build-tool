package androidx.compose.foundation.relocation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p030Oooo0oo.o0O0O0O;
import p030Oooo0oo.o0O0O0Oo;
import p030Oooo0oo.o0O0oo0o;
import p030Oooo0oo.o0oO0O0o;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0O0O f5853Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0O0Oo f5854Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(o0O0O0O o0o0o0o, o0O0O0Oo o0o0o0oo) {
        super(1);
        this.f5853Oooo0o = o0o0o0o;
        this.f5854Oooo0oO = o0o0o0oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        ((o0oO0O0o) this.f5853Oooo0o).f2535OooO00o.OooO0O0(this.f5854Oooo0oO);
        return new o0O0oo0o(this.f5853Oooo0o, this.f5854Oooo0oO);
    }
}
