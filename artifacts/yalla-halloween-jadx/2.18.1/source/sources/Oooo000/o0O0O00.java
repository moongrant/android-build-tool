package Oooo000;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.oo0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Function1<p167o00Ooo.OooO, o00OO0O0<p145o00Oo0.o00000O0, p023Oooo00O.oo0o0Oo>> f979OooO00o = OooO00o.f982Oooo0o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final float[] f980OooO0O0 = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final float[] f981OooO0OO = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    public static final class OooO00o extends Lambda implements Function1<p167o00Ooo.OooO, o00OO0O0<p145o00Oo0.o00000O0, p023Oooo00O.oo0o0Oo>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f982Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final o00OO0O0<p145o00Oo0.o00000O0, p023Oooo00O.oo0o0Oo> invoke(p167o00Ooo.OooO oooO) {
            p167o00Ooo.OooO colorSpace = oooO;
            Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
            return oo0O.OooO00o(o0OO00O.f985Oooo0o, new oo0o0Oo(colorSpace));
        }
    }

    public static final float OooO00o(int i, float f, float f2, float f3, float[] fArr) {
        return (f3 * fArr[i + 6]) + (f2 * fArr[i + 3]) + (f * fArr[i]);
    }
}
