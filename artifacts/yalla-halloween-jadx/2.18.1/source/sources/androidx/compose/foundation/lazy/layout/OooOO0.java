package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00OOOO0;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends Lambda implements Function1<o00OOOO0, o0o0Oo> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0.OooO00o f5798Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(OooOOO0.OooO00o oooO00o) {
        super(1);
        this.f5798Oooo0o = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o0o0Oo invoke(o00OOOO0 o00oooo1) {
        o00OOOO0 DisposableEffect = o00oooo1;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new OooO(this.f5798Oooo0o);
    }
}
