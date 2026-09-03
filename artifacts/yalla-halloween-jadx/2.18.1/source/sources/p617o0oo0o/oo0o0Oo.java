package p617o0oo0o;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o0O0O0O.OooO0o;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo extends Lambda implements Function4<OooO0o, Integer, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function3<Integer, oOO00O, Integer, Unit> f48583Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f48584Oooo0oO = 905970096;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f48585Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(Function3 function3, int i) {
        super(4);
        this.f48583Oooo0o = function3;
        this.f48585Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(OooO0o oooO0o, Integer num, oOO00O ooo00o, Integer num2) {
        OooO0o HorizontalPager = oooO0o;
        int iIntValue = num.intValue();
        oOO00O ooo00o2 = ooo00o;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= ooo00o2.OooO(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            this.f48583Oooo0o.invoke(Integer.valueOf(o000000O.OooO0O0(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, this.f48585Oooo0oo, iIntValue)), ooo00o2, Integer.valueOf((this.f48584Oooo0oO >> 21) & 112));
        }
        return Unit.INSTANCE;
    }
}
