package p139o00OOOo0;

import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0OO;
import p042Ooooo0o.o000O0O0;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p054o00000oo.oo0oOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31878Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f31879Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Unit> f31880Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f31881Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f31882OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public oo0o0Oo(String str, Function1<? super Integer, Unit> function1, int i, int i2, int i3) {
        super(3);
        this.f31879Oooo0o = str;
        this.f31880Oooo0oO = function1;
        this.f31881Oooo0oo = i;
        this.f31878Oooo = i2;
        this.f31882OoooO00 = i3;
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
        if ((iIntValue & 91) == 18 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            int i = this.f31881Oooo0oo;
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                String strValueOf = String.valueOf(i);
                int length = strValueOf.length();
                objOooO0o = o0OOO00.OooO0Oo(new oo0oOO0(strValueOf, o000O0O0.OooO00o(length, length), 4));
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo3 = (o0O00OO) objOooO0o;
            String strOooO00o = OooO0OO.OooO00o(R.string.Membership_fee, ooo00o2);
            String str = this.f31879Oooo0o;
            o000OOo0 o000ooo0OooO00o = o00O0000.OooO00o(ooo00o2, -2016543823, new o0Oo0oo(o0o00oo3, this.f31878Oooo, this.f31882OoooO00));
            Function1<Integer, Unit> function1 = this.f31880Oooo0oO;
            ooo00o2.OooO0o0(511388516);
            boolean zOooo0oo = ooo00o2.Oooo0oo(function1) | ooo00o2.Oooo0oo(o0o00oo3);
            Object objOooO0o2 = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = new o0OO00O(function1, o0o00oo3);
                ooo00o2.Oooo00o(objOooO0o2);
            }
            ooo00o2.Oooo0o0();
            o0O0oo0o.OooO0Oo(it, strOooO00o, str, o000ooo0OooO00o, false, false, null, null, null, false, null, false, (Function0) objOooO0o2, null, false, null, null, null, null, ooo00o2, (iIntValue & 14) | 3072, 0, 520176);
        }
        return Unit.INSTANCE;
    }
}
