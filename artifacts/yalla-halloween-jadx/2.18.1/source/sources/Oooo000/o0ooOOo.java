package Oooo000;

import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends Lambda implements Function3<o00OOOO0, p100o000oOoO.oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function2<o0000O0O.o000oOoO, o0000O0O.o000oOoO, Unit> f996Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> f997Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0ooOOo(Function2<? super o0000O0O.o000oOoO, ? super o0000O0O.o000oOoO, Unit> function2, p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> o0000o0o2) {
        super(3);
        this.f996Oooo0o = function2;
        this.f997Oooo0oO = o0000o0o2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, p100o000oOoO.oOO00O ooo00o, Integer num) {
        o00OOOO0 composed = o00oooo1;
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        ooo00o2.OooO0o0(-843180607);
        ooo00o2.OooO0o0(773894976);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        o000oOoO.oOO00O.OooO00o.C0323OooO00o c0323OooO00o = o000oOoO.oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, ooo00o2), ooo00o2);
        }
        ooo00o2.Oooo0o0();
        CoroutineScope coroutineScope = ((o00OO0OO) objOooO0o).f29498Oooo0o;
        ooo00o2.Oooo0o0();
        p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> o0000o0o2 = this.f997Oooo0oO;
        ooo00o2.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o2.Oooo0oo(coroutineScope);
        Object objOooO0o2 = ooo00o2.OooO0o();
        if (zOooo0oo || objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = new o000OOo0(o0000o0o2, coroutineScope);
            ooo00o2.Oooo00o(objOooO0o2);
        }
        ooo00o2.Oooo0o0();
        o000OOo0 o000ooo1 = (o000OOo0) objOooO0o2;
        o000ooo1.f889Oooo0oo = this.f996Oooo0o;
        o00OOOO0 o00oooo0OooOOoo = p442o0OoOo0.Oooo000.OooO0O0(composed).OooOOoo(o000ooo1);
        ooo00o2.Oooo0o0();
        return o00oooo0OooOOoo;
    }
}
