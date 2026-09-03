package o0000OO0;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO0O0 f27424OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f27425OooO0O0;

    public OooO00o(o00OO0O0 o00oo0o1, long j) {
        this.f27424OooO00o = o00oo0o1;
        this.f27425OooO0O0 = j;
    }

    @Override // o0000OO0.o0OO00O
    public final long OooO00o(@NotNull o0000O0O.Oooo0 anchorBounds, @NotNull LayoutDirection layoutDirection, long j) {
        Intrinsics.checkNotNullParameter(anchorBounds, "anchorBounds");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        long jOooO00o = o0000O0O.Oooo000.OooO00o(0, 0);
        long jOooO00o2 = this.f27424OooO00o.OooO00o(0L, o0000O0O.o0OoOo0.OooO00o(anchorBounds.f27319OooO0OO - anchorBounds.f27317OooO00o, anchorBounds.f27320OooO0Oo - anchorBounds.f27318OooO0O0), layoutDirection);
        long jOooO00o3 = this.f27424OooO00o.OooO00o(0L, o0000O0O.o0OoOo0.OooO00o((int) (j >> 32), o0000O0O.o000oOoO.OooO0O0(j)), layoutDirection);
        long jOooO00o4 = o0000O0O.Oooo000.OooO00o(anchorBounds.f27317OooO00o, anchorBounds.f27318OooO0O0);
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        long jOooO00o5 = p027Oooo0o.o00oO0o.OooO00o(jOooO00o4, o0000O0O.OooOo.OooO0OO(jOooO00o), ((int) (jOooO00o >> 32)) + ((int) (jOooO00o4 >> 32)));
        long jOooO00o6 = p027Oooo0o.o00oO0o.OooO00o(jOooO00o2, o0000O0O.OooOo.OooO0OO(jOooO00o5), ((int) (jOooO00o5 >> 32)) + ((int) (jOooO00o2 >> 32)));
        long jOooO00o7 = o0000O0O.Oooo000.OooO00o((int) (jOooO00o3 >> 32), o0000O0O.OooOo.OooO0OO(jOooO00o3));
        long jOooO00o8 = o0000O0O.Oooo000.OooO00o(((int) (jOooO00o6 >> 32)) - ((int) (jOooO00o7 >> 32)), o0000O0O.OooOo.OooO0OO(jOooO00o6) - o0000O0O.OooOo.OooO0OO(jOooO00o7));
        long j2 = this.f27425OooO0O0;
        long jOooO00o9 = o0000O0O.Oooo000.OooO00o(((int) (j2 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1), o0000O0O.OooOo.OooO0OO(j2));
        return p027Oooo0o.o00oO0o.OooO00o(jOooO00o9, o0000O0O.OooOo.OooO0OO(jOooO00o8), ((int) (jOooO00o8 >> 32)) + ((int) (jOooO00o9 >> 32)));
    }
}
