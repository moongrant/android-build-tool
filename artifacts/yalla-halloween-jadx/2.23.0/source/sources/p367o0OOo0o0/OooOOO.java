package p367o0OOo0o0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOO extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f43967OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOOOO oooOOOO) {
        super(2);
        this.f43967OooO0Oo = oooOOOO;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        Function2<? super Boolean, ? super Integer, Unit> function2;
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        OooOOOO oooOOOO = this.f43967OooO0Oo;
        if (zBooleanValue) {
            oooOOOO.f43969OooO00o.OooO00o(iIntValue);
            if (oooOOOO.f43973OooO0o == 0 && (function2 = oooOOOO.f43972OooO0Oo) != null) {
                function2.invoke(Boolean.TRUE, Integer.valueOf(iIntValue));
            }
            Function2<? super Boolean, ? super Integer, Unit> function3 = oooOOOO.f43971OooO0OO;
            if (function3 != null) {
                function3.invoke(Boolean.TRUE, Integer.valueOf(iIntValue));
            }
            oooOOOO.f43973OooO0o = 1;
        } else if (oooOOOO.f43975OooO0oO) {
            oooOOOO.OooO0Oo(iIntValue);
        } else {
            oooOOOO.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
