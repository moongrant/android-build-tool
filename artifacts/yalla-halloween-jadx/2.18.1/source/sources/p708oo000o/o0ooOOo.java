package p708oo000o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function4<Float, Float, oOO00O, Integer, Unit> f53254Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f53255Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0ooOOo(Function4<? super Float, ? super Float, ? super oOO00O, ? super Integer, Unit> function4, o00oO0o o00oo0o2) {
        super(2);
        this.f53254Oooo0o = function4;
        this.f53255Oooo0oO = o00oo0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            this.f53254Oooo0o.invoke(Float.valueOf(this.f53255Oooo0oO.f53218OoooO.f53200OooO0oO), Float.valueOf(this.f53255Oooo0oO.f53218OoooO.f53201OooO0oo), ooo00o2, 0);
        }
        return Unit.INSTANCE;
    }
}
