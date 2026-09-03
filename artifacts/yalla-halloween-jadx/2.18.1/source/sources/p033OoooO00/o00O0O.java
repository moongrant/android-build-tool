package p033OoooO00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f3431OooO00o = OooO00o();

    @NotNull
    public static final o0OoOo0 OooO00o() {
        OooOo corner = Oooo000.OooO00o(50);
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new o0OoOo0(corner, corner, corner, corner);
    }

    public static o0OoOo0 OooO0O0() {
        return new o0OoOo0(Oooo000.OooO00o(0), Oooo000.OooO00o(50), Oooo000.OooO00o(50), Oooo000.OooO00o(0));
    }

    @NotNull
    public static final o0OoOo0 OooO0OO(float f) {
        OooOo corner = Oooo000.OooO0O0(f);
        Intrinsics.checkNotNullParameter(corner, "corner");
        return new o0OoOo0(corner, corner, corner, corner);
    }

    @NotNull
    public static final o0OoOo0 OooO0Oo(float f, float f2, float f3, float f4) {
        return new o0OoOo0(Oooo000.OooO0O0(f), Oooo000.OooO0O0(f2), Oooo000.OooO0O0(f3), Oooo000.OooO0O0(f4));
    }

    public static o0OoOo0 OooO0o0(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return OooO0Oo(f, f2, f3, f4);
    }
}
