package p371o0OOo0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f43167OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(oo000o oo000oVar) {
        super(2);
        this.f43167OooO0Oo = oo000oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        Function2<? super Boolean, ? super Integer, Unit> function2;
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        oo000o oo000oVar = this.f43167OooO0Oo;
        if (zBooleanValue) {
            oo000oVar.f43181OooO00o.OooO00o(iIntValue);
            if (oo000oVar.f43185OooO0o == 0 && (function2 = oo000oVar.f43184OooO0Oo) != null) {
                function2.invoke(Boolean.TRUE, Integer.valueOf(iIntValue));
            }
            Function2<? super Boolean, ? super Integer, Unit> function3 = oo000oVar.f43183OooO0OO;
            if (function3 != null) {
                function3.invoke(Boolean.TRUE, Integer.valueOf(iIntValue));
            }
            oo000oVar.f43185OooO0o = 1;
        } else if (oo000oVar.f43187OooO0oO) {
            oo000oVar.OooO0Oo(iIntValue);
        } else {
            oo000oVar.OooO0O0();
        }
        return Unit.INSTANCE;
    }
}
