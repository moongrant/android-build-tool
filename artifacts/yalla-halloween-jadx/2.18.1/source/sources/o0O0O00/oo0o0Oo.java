package o0O0O00;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o.OooO00o f35325Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<oOO00O, Integer, Unit> f35326Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo0o0Oo(o0OOO0o.OooO00o oooO00o, Function2<? super oOO00O, ? super Integer, Unit> function2) {
        super(2);
        this.f35325Oooo0o = oooO00o;
        this.f35326Oooo0oO = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            boolean zBooleanValue = ((Boolean) this.f35325Oooo0o.f35315OooO0o0.getValue()).booleanValue();
            Function2<oOO00O, Integer, Unit> function2 = this.f35326Oooo0oO;
            ooo00o2.OooOOOO(Boolean.valueOf(zBooleanValue));
            boolean zOooO0OO = ooo00o2.OooO0OO(zBooleanValue);
            if (zBooleanValue) {
                function2.invoke(ooo00o2, 0);
            } else {
                ooo00o2.OooOOOo(zOooO0OO);
            }
            ooo00o2.OooO0Oo();
        }
        return Unit.INSTANCE;
    }
}
