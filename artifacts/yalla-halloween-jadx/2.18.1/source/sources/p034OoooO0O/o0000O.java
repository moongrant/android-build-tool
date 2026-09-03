package p034OoooO0O;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import o0000O0O.OooOo00;
import o0000O0O.o000oOoO;
import o0000O0O.o0OoOo0;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O extends Lambda implements Function1<OooOo00, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO f3488Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o000oOoO> f3489Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(OooO oooO, o0O00OO<o000oOoO> o0o00oo2) {
        super(1);
        this.f3488Oooo0o = oooO;
        this.f3489Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(OooOo00 oooOo00) {
        long j = oooOo00.f27316OooO00o;
        o0O00OO<o000oOoO> o0o00oo2 = this.f3489Oooo0oO;
        OooO oooO = this.f3488Oooo0o;
        o0o00oo2.setValue(new o000oOoO(o0OoOo0.OooO00o(oooO.OoooooO(OooOo00.OooO0O0(j)), oooO.OoooooO(OooOo00.OooO00o(j)))));
        return Unit.INSTANCE;
    }
}
