package p139o00OOOo0;

import com.weieyu.yalla.R;
import com.yalla.yalla.model.GifListJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00000.OooO0OO;
import p043OooooO0.o000OOo0;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0O0 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f31876Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ GifListJson f31877Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0O0(Function0<Unit> function0, GifListJson gifListJson) {
        super(3);
        this.f31876Oooo0o = function0;
        this.f31877Oooo0oO = gifListJson;
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
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = p100o000oOoO.oo0o0O0.f29705OooO00o;
            String strOooO00o = OooO0OO.OooO00o(R.string.Pay, ooo00o2);
            o000OOo0 o000ooo0OooO00o = o00O0000.OooO00o(ooo00o2, -296563234, new o00O0O0(this.f31877Oooo0oO));
            Function0<Unit> function0 = this.f31876Oooo0o;
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o2.Oooo0oo(function0);
            Object objOooO0o = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o00O0O0O(function0);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0O0oo0o.OooO0Oo(it, null, null, o000ooo0OooO00o, false, false, null, null, strOooO00o, false, null, false, (Function0) objOooO0o, null, false, null, o00O0OO0.f31838Oooo0o, null, null, ooo00o2, (iIntValue & 14) | 3072, 1572864, 454390);
        }
        return Unit.INSTANCE;
    }
}
