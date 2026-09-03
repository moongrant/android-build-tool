package p139o00OOOo0;

import com.weieyu.yalla.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o000O0O0;
import p257o00ooOO0.o0O0oo0o;

/* JADX INFO: loaded from: classes.dex */
public final class o00 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f31732Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(Function0<Unit> function0) {
        super(3);
        this.f31732Oooo0o = function0;
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
            String strOooO0OO = o000O0O0.OooO0OO(R.string.Confirm);
            o0OoOo0 o0oooo1 = o0OoOo0.f31858OooO00o;
            o0O0oo0o.OooO0Oo(it, null, null, o0OoOo0.f31859OooO0O0, true, false, null, null, strOooO0OO, false, null, false, this.f31732Oooo0o, null, false, null, null, null, null, ooo00o2, (i & 14) | 224256, 0, 519878);
        }
        return Unit.INSTANCE;
    }
}
