package p248o00oo0o0;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import p240o00oo0.o000000;
import p424o0OoO0Oo.o00OO0OO;
import p424o0OoO0Oo.o00OOO00;
import p428o0OoO0oo.o00OOOOo;
import p430o0OoOO00.o00oO0o;
import p629o0ooO00O.o00000O0;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o0O00O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00 implements o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f40210OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f40211OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Object f40212OooO0OO;

    public o00O00(o00000O0 o00000o1) {
        o000OO o000oo2 = o000OO.OooO00o.f40193OooO00o;
        o0000OO0 o0000oo1 = o0000OO0.OooO00o.f40172OooO00o;
        this.f40210OooO00o = o00000o1;
        this.f40211OooO0O0 = o000oo2;
        this.f40212OooO0OO = o0000oo1;
    }

    public final void OooO00o(o00OOOOo o00ooooo2) {
        o00oO0o o00oo0o2 = (o00oO0o) this.f40210OooO00o;
        this.f40211OooO0O0 = o00oo0o2.OooO00o(o00oo0o2.OooO0OO(o00oo0o2.OooO0O0(), o00ooooo2));
        this.f40212OooO0OO = o00OOO00.OooO0O0().f46736OooO00o.OooO0O0((o0O00O0o) this.f40211OooO0O0);
        int i = o00oo0o2.f46835OooO0Oo;
        o00OOO00 o00ooo00OooO0O0 = o00OOO00.OooO0O0();
        o00ooo00OooO0O0.getClass();
        FirebasePerfOkHttpClient.enqueue((o00OO) this.f40212OooO0OO, new o00OO0OO(o00ooo00OooO0O0, o00ooooo2, o00oo0o2.f46835OooO0Oo));
    }

    @Override // p629o0ooO00O.o00000O0
    public final Object get() {
        return new o00O000o((Context) ((o00000O0) this.f40210OooO00o).get(), (String) ((o00000O0) this.f40211OooO0O0).get(), ((Integer) ((o00000O0) this.f40212OooO0OO).get()).intValue());
    }

    public o00O00(o00oO0o o00oo0o2) {
        this.f40210OooO00o = o00oo0o2;
    }
}
