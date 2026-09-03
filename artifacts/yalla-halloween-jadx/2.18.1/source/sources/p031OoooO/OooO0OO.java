package p031OoooO;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O00O;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.oOO00O;
import p145o00Oo0.o00000O0;
import p145o00Oo0.o00000OO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0O00O f2550OooO0O0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o0O00O f2553OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f2549OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final float f2551OooO0OO = 64;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final float f2552OooO0Oo = 36;

    static {
        float f = 16;
        float f2 = 8;
        f2550OooO0O0 = new o0O00O(f, f2, f, f2);
        f2553OooO0o0 = new o0O00O(f2, f2, f2, f2);
    }

    @Composable
    @NotNull
    public final OooO0O0 OooO00o(long j, long j2, long j3, long j4, @Nullable oOO00O ooo00o, int i, int i2) {
        long jOooO0Oo;
        ooo00o.OooO0o0(1870371134);
        long jOooO0Oo2 = (i2 & 1) != 0 ? ((OooOOO) ooo00o.OooOO0o(OooOOOO.f2586OooO00o)).OooO0Oo() : j;
        long jOooO00o = (i2 & 2) != 0 ? OooOOOO.OooO00o(jOooO0Oo2, ooo00o) : j2;
        if ((i2 & 4) != 0) {
            o0O0O0o0<OooOOO> o0o0o0o0 = OooOOOO.f2586OooO00o;
            jOooO0Oo = o00000OO.OooO0Oo(o00000O0.OooO0OO(((OooOOO) ooo00o.OooOO0o(o0o0o0o0)).OooO0OO(), 0.12f), ((OooOOO) ooo00o.OooOO0o(o0o0o0o0)).OooO0o());
        } else {
            jOooO0Oo = j3;
        }
        Oooo0 oooo0 = new Oooo0(jOooO0Oo2, jOooO00o, jOooO0Oo, (i2 & 8) != 0 ? o00000O0.OooO0OO(((OooOOO) ooo00o.OooOO0o(OooOOOO.f2586OooO00o)).OooO0OO(), OooOo00.OooO0O0(ooo00o, 6)) : j4);
        ooo00o.Oooo0o0();
        return oooo0;
    }
}
