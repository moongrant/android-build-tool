package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 extends Lambda implements Function3<p048OoooooO.o00OOOO0, p100o000oOoO.oOO00O, Integer, p048OoooooO.o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<o0O0O00.Oooo000, Unit> f578Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000O0O0(Function1<? super o0O0O00.Oooo000, Unit> function1) {
        super(3);
        this.f578Oooo0o = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final p048OoooooO.o00OOOO0 invoke(p048OoooooO.o00OOOO0 o00oooo1, p100o000oOoO.oOO00O ooo00o, Integer num) {
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        Oooo000.o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, 1176407768);
        Function1<o0O0O00.Oooo000, Unit> function1 = this.f578Oooo0o;
        ooo00o2.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o2.Oooo0oo(function1);
        Object objOooO0o = ooo00o2.OooO0o();
        if (zOooo0oo || objOooO0o == o000oOoO.oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o000OO00(function1);
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o000OO00 o000oo01 = (o000OO00) objOooO0o;
        ooo00o2.Oooo0o0();
        return o000oo01;
    }
}
