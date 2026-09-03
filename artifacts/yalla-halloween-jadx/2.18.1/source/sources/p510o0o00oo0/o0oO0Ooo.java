package p510o0o00oo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O00o0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oO0Ooo extends Lambda implements Function3<o00O00o0, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function3<o00O00o0, oOO00O, Integer, Unit> f42030Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f42031Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0oO0Ooo(Function3<? super o00O00o0, ? super oOO00O, ? super Integer, Unit> function3, int i) {
        super(3);
        this.f42030Oooo0o = function3;
        this.f42031Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00O00o0 o00o00o1, oOO00O ooo00o, Integer num) {
        o00O00o0 EasyContentState = o00o00o1;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(EasyContentState, "$this$EasyContentState");
        if ((iIntValue & 14) == 0) {
            iIntValue |= ooo00o2.Oooo0oo(EasyContentState) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            this.f42030Oooo0o.invoke(EasyContentState, ooo00o2, Integer.valueOf((iIntValue & 14) | ((this.f42031Oooo0oO >> 12) & 112)));
        }
        return Unit.INSTANCE;
    }
}
