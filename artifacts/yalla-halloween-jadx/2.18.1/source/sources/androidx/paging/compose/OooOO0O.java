package androidx.paging.compose;

import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000oOoO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lambda implements Function4<o000oOoO, Integer, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function5<o000oOoO, Integer, Object, oOO00O, Integer, Unit> f8809Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<Object> f8810Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(Function5<? super o000oOoO, ? super Integer, Object, ? super oOO00O, ? super Integer, Unit> function5, OooO0OO<Object> oooO0OO) {
        super(4);
        this.f8809Oooo0o = function5;
        this.f8810Oooo0oO = oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o000oOoO o000oooo2, Integer num, oOO00O ooo00o, Integer num2) {
        int i;
        o000oOoO items = o000oooo2;
        int iIntValue = num.intValue();
        oOO00O ooo00o2 = ooo00o;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((iIntValue2 & 14) == 0) {
            i = (ooo00o2.Oooo0oo(items) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i |= ooo00o2.OooO(iIntValue) ? 32 : 16;
        }
        if ((i & 731) == 146 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            this.f8809Oooo0o.invoke(items, Integer.valueOf(iIntValue), this.f8810Oooo0oO.OooO0O0(iIntValue), ooo00o2, Integer.valueOf((i & 14) | (i & 112)));
        }
        return Unit.INSTANCE;
    }
}
