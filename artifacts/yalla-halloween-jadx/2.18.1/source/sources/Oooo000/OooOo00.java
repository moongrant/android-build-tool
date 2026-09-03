package Oooo000;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.o00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends Lambda implements Function3<o00Ooo, p100o000oOoO.oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f812Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000oOoO<Object> f813Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f814Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function4<o00Ooo, Object, p100o000oOoO.oOO00O, Integer, Unit> f815Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00OO0OO<Object> f816OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OooOo00(o000oOoO<Object> o000oooo2, Object obj, Function4<? super o00Ooo, Object, ? super p100o000oOoO.oOO00O, ? super Integer, Unit> function4, int i, o00OO0OO<Object> o00oo0oo) {
        super(3);
        this.f813Oooo0o = o000oooo2;
        this.f814Oooo0oO = obj;
        this.f815Oooo0oo = function4;
        this.f812Oooo = i;
        this.f816OoooO00 = o00oo0oo;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o00Ooo o00ooo2, p100o000oOoO.oOO00O ooo00o, Integer num) {
        o00Ooo AnimatedVisibility = o00ooo2;
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if ((iIntValue & 14) == 0) {
            iIntValue |= ooo00o2.Oooo0oo(AnimatedVisibility) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            o00Oo00.OooO0O0(AnimatedVisibility, new OooOOOO(this.f816OoooO00, this.f814Oooo0oO, this.f813Oooo0o), ooo00o2);
            this.f813Oooo0o.f912OooO0Oo.put(this.f814Oooo0oO, ((oo000o) AnimatedVisibility).f999OooO00o);
            this.f815Oooo0oo.invoke(AnimatedVisibility, this.f814Oooo0oO, ooo00o2, Integer.valueOf((iIntValue & 14) | ((this.f812Oooo >> 9) & 896)));
        }
        return Unit.INSTANCE;
    }
}
