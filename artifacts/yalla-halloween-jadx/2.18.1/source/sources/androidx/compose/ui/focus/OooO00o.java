package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p710ooOO.o0000oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Lambda implements Function1<o0000oo, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o0000oo> f6007Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<o0000oo, Unit> f6008Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(o0O00OO<o0000oo> o0o00oo2, Function1<? super o0000oo, Unit> function1) {
        super(1);
        this.f6007Oooo0o = o0o00oo2;
        this.f6008Oooo0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000oo o0000ooVar) {
        o0000oo it = o0000ooVar;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!Intrinsics.areEqual(this.f6007Oooo0o.getValue(), it)) {
            this.f6007Oooo0o.setValue(it);
            this.f6008Oooo0oO.invoke(it);
        }
        return Unit.INSTANCE;
    }
}
