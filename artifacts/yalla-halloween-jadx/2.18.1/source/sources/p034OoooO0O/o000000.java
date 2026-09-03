package p034OoooO0O;

import Oooo000.o0000O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooO;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o000O00;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function0<OooO> f3471Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function1<Function0<OooO>, o00OOOO0> f3472Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000000(Function0<OooO> function0, Function1<? super Function0<OooO>, ? extends o00OOOO0> function1) {
        super(3);
        this.f3471Oooo0o = function0;
        this.f3472Oooo0oO = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, 759876635);
        Function0<OooO> function0 = this.f3471Oooo0o;
        Object objOooO0O0 = o000O00.OooO0O0(ooo00o2, -1589795249, -492369756);
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0O0 == c0323OooO00o) {
            objOooO0O0 = o0OOO00.OooO0O0(function0);
            ooo00o2.Oooo00o(objOooO0O0);
        }
        ooo00o2.Oooo0o0();
        oO0Oo oo0oo = (oO0Oo) objOooO0O0;
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = new Oooo0(new OooO(((OooO) oo0oo.getValue()).f30395OooO00o), o0O0O00.f3553OooO0O0, new OooO(o0O0O00.f3554OooO0OO));
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        Oooo0 oooo0 = (Oooo0) objOooO0o;
        o00Oo00.OooO0o0(Unit.INSTANCE, new o000000O(oo0oo, oooo0, null), ooo00o2);
        oO0Oo oo0oo2 = oooo0.f1004OooO0OO;
        ooo00o2.Oooo0o0();
        o00OOOO0 o00oooo0Invoke = this.f3472Oooo0oO.invoke(new o000OOo(oo0oo2));
        ooo00o2.Oooo0o0();
        return o00oooo0Invoke;
    }
}
