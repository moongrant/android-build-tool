package p029Oooo0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00o0 extends Lambda implements Function0<o00O0O0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function1<o00OOO00, Unit>> f2299Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<IntRange> f2300Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O00o0(oO0Oo<? extends Function1<? super o00OOO00, Unit>> oo0oo, o0O00OO<IntRange> o0o00oo2) {
        super(0);
        this.f2299Oooo0o = oo0oo;
        this.f2300Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o00O0O0 invoke() {
        o00OOO0 o00ooo1 = new o00OOO0();
        this.f2299Oooo0o.getValue().invoke(o00ooo1);
        return new o00O0O0(o00ooo1.f2350OooO00o, o00ooo1.f2351OooO0O0, this.f2300Oooo0oO.getValue());
    }
}
