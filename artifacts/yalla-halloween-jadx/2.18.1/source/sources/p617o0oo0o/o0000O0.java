package p617o0oo0o;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p579o0oOoOOo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0 extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O000 f48481Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(o000O000 o000o001) {
        super(3);
        this.f48481Oooo0o = o000o001;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
        o0O00OO<Boolean> it = o0o00oo2;
        oOO00O ooo00o2 = ooo00o;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            k0.f45988OooO00o.OooO00o(o000O000.OooO00o(this.f48481Oooo0o).getHalfDialogWebPageInfo(), new o0000oo(this.f48481Oooo0o), ooo00o2, 392);
        }
        return Unit.INSTANCE;
    }
}
