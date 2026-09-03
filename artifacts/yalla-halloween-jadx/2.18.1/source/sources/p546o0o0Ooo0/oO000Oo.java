package p546o0o0Ooo0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p497o0o00Oo.OooOOO0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f44377Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000Oo(o0O00OO<Boolean> o0o00oo2) {
        super(0);
        this.f44377Oooo0o = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i;
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        if (oooO00o.OooO00o().OooOOo0()) {
            i = 1;
        } else {
            i = oooO00o.OooO00o().OooOOOO() ? 2 : 3;
        }
        OooOo.OooO0OO("102233", MapsKt.mapOf(new Pair("userType", Integer.valueOf(i))));
        if (oO000Oo0.OooO0O0(this.f44377Oooo0o)) {
            o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
            oooO0o.OooOO0O();
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            OooOOO0.OooO0o0().OooOo0O();
            oooO0o.OooOO0o();
            OooOOO0.OooO0o0().OooOo0o();
        } else {
            o00O.OooO0o.f43216OooO00o.OooOO0o();
            OooOOO0 oooOOO1 = OooOOO0.f41180OooO00o;
            OooOOO0.OooO0o0().OooOo0o();
        }
        o00O.OooO0o oooO0o2 = o00O.OooO0o.f43216OooO00o;
        o00O.OooO0o.f43215OooO.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
