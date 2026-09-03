package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoO00O extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f6618Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<p100o000oOoO.oOO00O, Integer, Unit> f6619Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0OoO00O(WrappedComposition wrappedComposition, Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> function2) {
        super(2);
        this.f6618Oooo0o = wrappedComposition;
        this.f6619Oooo0oO = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            o0O0O00.OooO00o(this.f6618Oooo0o.f6342Oooo0o, this.f6619Oooo0oO, ooo00o2, 8);
        }
        return Unit.INSTANCE;
    }
}
