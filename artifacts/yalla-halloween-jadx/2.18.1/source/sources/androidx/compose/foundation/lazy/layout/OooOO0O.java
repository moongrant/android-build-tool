package androidx.compose.foundation.lazy.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f5799Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOOO0.OooO00o f5800Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(OooOOO0 oooOOO0, OooOOO0.OooO00o oooO00o) {
        super(2);
        this.f5799Oooo0o = oooOOO0;
        this.f5800Oooo0oO = oooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        int iIntValue;
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            OooOOO oooOOOInvoke = this.f5799Oooo0o.f5802OooO0O0.invoke();
            Integer num2 = oooOOOInvoke.OooO0o().get(this.f5800Oooo0oO.f5806OooO00o);
            if (num2 != null) {
                this.f5800Oooo0oO.f5808OooO0OO.setValue(Integer.valueOf(num2.intValue()));
                iIntValue = num2.intValue();
            } else {
                iIntValue = ((Number) this.f5800Oooo0oO.f5808OooO0OO.getValue()).intValue();
            }
            ooo00o2.OooO0o0(-715769699);
            if (iIntValue < oooOOOInvoke.OooO0oo()) {
                Object objOooO00o = oooOOOInvoke.OooO00o(iIntValue);
                if (Intrinsics.areEqual(objOooO00o, this.f5800Oooo0oO.f5806OooO00o)) {
                    this.f5799Oooo0o.f5801OooO00o.OooO00o(objOooO00o, o00O0000.OooO00o(ooo00o2, -1238863364, new OooO0o(oooOOOInvoke, iIntValue)), ooo00o2, 568);
                }
            }
            ooo00o2.Oooo0o0();
            OooOOO0.OooO00o oooO00o = this.f5800Oooo0oO;
            o00Oo00.OooO0O0(oooO00o.f5806OooO00o, new OooOO0(oooO00o), ooo00o2);
        }
        return Unit.INSTANCE;
    }
}
