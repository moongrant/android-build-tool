package p286o0O0O0oO;

import com.google.android.datatransport.Priority;
import java.util.Objects;
import o0O0O0Oo.OooO;
import o0O0O0Oo.OooO00o;
import o0O0O0Oo.OooO0O0;
import o0O0O0Oo.OooO0OO;
import o0O0O0Oo.OooO0o;
import o0O0O0Oo.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00<T> implements OooO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OO00O f35497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f35498OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f35499OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o<T, byte[]> f35500OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000OOo f35501OooO0o0;

    public o0O0O00(o0OO00O o0oo00o2, String str, OooO0O0 oooO0O0, OooO0o<T, byte[]> oooO0o, o000OOo o000ooo2) {
        this.f35497OooO00o = o0oo00o2;
        this.f35498OooO0O0 = str;
        this.f35499OooO0OO = oooO0O0;
        this.f35500OooO0Oo = oooO0o;
        this.f35501OooO0o0 = o000ooo2;
    }

    public final void OooO00o(OooO0OO<T> oooO0OO, OooOO0O oooOO0O) {
        o000OOo o000ooo2 = this.f35501OooO0o0;
        o0OO00O o0oo00o2 = this.f35497OooO00o;
        Objects.requireNonNull(o0oo00o2, "Null transportContext");
        String str = this.f35498OooO0O0;
        Objects.requireNonNull(str, "Null transportName");
        OooO0o<T, byte[]> oooO0o = this.f35500OooO0Oo;
        Objects.requireNonNull(oooO0o, "Null transformer");
        OooO0O0 oooO0O0 = this.f35499OooO0OO;
        Objects.requireNonNull(oooO0O0, "Null encoding");
        o000000 o000000Var = (o000000) o000ooo2;
        o0O0OOO0.OooO oooO = o000000Var.f35468OooO0OO;
        OooO00o oooO00o = (OooO00o) oooO0OO;
        Priority priority = oooO00o.f35381OooO0O0;
        o0OO00O.OooO00o OooO00o2 = o0OO00O.OooO00o();
        OooO00o2.OooO00o(o0oo00o2.OooO0O0());
        o0OoOo0.OooO00o oooO00o2 = (o0OoOo0.OooO00o) OooO00o2;
        Objects.requireNonNull(priority, "Null priority");
        oooO00o2.f35510OooO0OO = priority;
        oooO00o2.f35509OooO0O0 = o0oo00o2.OooO0OO();
        o0OO00O o0oo00oOooO0O0 = oooO00o2.OooO0O0();
        oo000o.OooO00o OooO00o3 = oo000o.OooO00o();
        OooO00o3.OooO0o0(o000000Var.f35466OooO00o.getTime());
        OooO00o3.OooO0oO(o000000Var.f35467OooO0O0.getTime());
        o000oOoO.OooO0O0 oooO0O1 = (o000oOoO.OooO0O0) OooO00o3;
        oooO0O1.f35476OooO00o = str;
        oooO0O1.f35478OooO0OO = new o00Ooo(oooO0O0, oooO0o.apply(oooO00o.f35380OooO00o));
        oooO0O1.f35477OooO0O0 = null;
        oooO.OooO00o(o0oo00oOooO0O0, oooO0O1.OooO0OO(), oooOO0O);
    }
}
