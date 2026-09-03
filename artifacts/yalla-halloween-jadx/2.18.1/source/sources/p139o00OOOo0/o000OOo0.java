package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo0 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f31796Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f31797Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f31798Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(int i, String str, String str2) {
        super(3);
        this.f31796Oooo0o = i;
        this.f31797Oooo0oO = str;
        this.f31798Oooo0oo = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
        o0O00OO<Boolean> it = o0o00oo2;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= ooo00o2.Oooo0oo(it) ? 4 : 2;
        }
        int i = iIntValue;
        if ((i & 91) == 18 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            o0O0oo0o.OooO0Oo(it, null, null, o00O0000.OooO00o(ooo00o2, -1325928855, new o000O(this.f31796Oooo0o, this.f31797Oooo0oO, this.f31798Oooo0oo)), false, false, null, null, null, false, null, false, o000OO00.f31790Oooo0o, null, false, null, null, null, null, ooo00o2, (i & 14) | 199680, 384, 520150);
        }
        return Unit.INSTANCE;
    }
}
