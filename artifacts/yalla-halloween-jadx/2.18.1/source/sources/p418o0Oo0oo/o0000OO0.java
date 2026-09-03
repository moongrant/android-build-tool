package p418o0Oo0oo;

import Oooo000.o0000O00;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00OOOOo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SpreadBuilder;
import o0000O0O.OooO;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object[] f39688Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<o00000, Continuation<? super Unit>, Object> f39689Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000OO0(Object[] objArr, Function2<? super o00000, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super(3);
        this.f39688Oooo0o = objArr;
        this.f39689Oooo0oO = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, 664422852);
        OooO oooO = (OooO) ooo00o2.OooOO0o(o000.f6356OooO0o0);
        o00OOOOo o00ooooo2 = (o00OOOOo) ooo00o2.OooOO0o(o000.f6364OooOOOO);
        ooo00o2.OooO0o0(1157296644);
        boolean zOooo0oo = ooo00o2.Oooo0oo(oooO);
        Object objOooO0o = ooo00o2.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o000OO(o00ooooo2, oooO);
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        Object[] objArr = this.f39688Oooo0o;
        Function2<o00000, Continuation<? super Unit>, Object> function2 = this.f39689Oooo0oO;
        o000OO o000oo2 = (o000OO) objOooO0o;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(o000oo2);
        spreadBuilder.addSpread(objArr);
        o00Oo00.OooO0o(spreadBuilder.toArray(new Object[spreadBuilder.size()]), new o0000O(o000oo2, function2, null), ooo00o2);
        ooo00o2.Oooo0o0();
        return o000oo2;
    }
}
