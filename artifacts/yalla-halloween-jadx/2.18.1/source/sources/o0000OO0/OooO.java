package o0000OO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function2<oOO00O, Integer, Unit>> f27423Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooO(oO0Oo<? extends Function2<? super oOO00O, ? super Integer, Unit>> oo0oo) {
        super(2);
        this.f27423Oooo0o = oo0oo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            this.f27423Oooo0o.getValue().invoke(ooo00o2, 0);
        }
        return Unit.INSTANCE;
    }
}
