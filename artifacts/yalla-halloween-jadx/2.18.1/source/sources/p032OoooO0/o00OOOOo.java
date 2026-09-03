package p032OoooO0;

import Oooo000.o00oO0o;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import o00O0O.OooO;
import p026Oooo0OO.o000;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOOo extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<OooO, Unit> f3224Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000 f3225Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00OOOOo(Function1<? super OooO, Unit> function1, o000 o000Var) {
        super(3);
        this.f3224Oooo0o = function1;
        this.f3225Oooo0oO = o000Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        o00OOOO0 composed = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        num.intValue();
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        ooo00o2.OooO0o0(-102778667);
        ooo00o2.OooO0o0(773894976);
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o = ooo00o2.OooO0o();
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        if (objOooO0o == c0323OooO00o) {
            objOooO0o = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, ooo00o2), ooo00o2);
        }
        ooo00o2.Oooo0o0();
        CoroutineScope coroutineScope = ((o00OO0OO) objOooO0o).f29498Oooo0o;
        ooo00o2.Oooo0o0();
        ooo00o2.OooO0o0(-492369756);
        Object objOooO0o2 = ooo00o2.OooO0o();
        if (objOooO0o2 == c0323OooO00o) {
            objOooO0o2 = o0OOO00.OooO0Oo(null);
            ooo00o2.Oooo00o(objOooO0o2);
        }
        ooo00o2.Oooo0o0();
        o0O00OO o0o00oo2 = (o0O00OO) objOooO0o2;
        oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(this.f3224Oooo0o, ooo00o2);
        o000 o000Var = this.f3225Oooo0oO;
        o00Oo00.OooO0O0(o000Var, new o0o0Oo(o0o00oo2, o000Var), ooo00o2);
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        o000 o000Var2 = this.f3225Oooo0oO;
        o00OOOO0 o00oooo0OooO0O0 = SuspendingPointerInputFilterKt.OooO0O0(oooO00o, o000Var2, new o00OOOO0(coroutineScope, o0o00oo2, o000Var2, oo0ooOooO0o, null));
        ooo00o2.Oooo0o0();
        return o00oooo0OooO0O0;
    }
}
