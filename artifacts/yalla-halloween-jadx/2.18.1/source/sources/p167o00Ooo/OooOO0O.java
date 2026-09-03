package p167o00Ooo;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {
    public static OooO OooO00o(OooO oooO) {
        o0OoOo0 whitePoint = OooOo00.f32597OooO0O0;
        OooO0OO.OooO00o adaptation = OooO0OO.f32559OooO0O0;
        Intrinsics.checkNotNullParameter(oooO, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        long j = oooO.f32557OooO0O0;
        OooO0o.OooO00o oooO00o = OooO0o.f32561OooO00o;
        OooO0o.OooO00o oooO00o2 = OooO0o.f32561OooO00o;
        if (!OooO0o.OooO00o(j, OooO0o.f32562OooO0O0)) {
            return oooO;
        }
        Oooo0 colorSpace = (Oooo0) oooO;
        if (OooO0OO(colorSpace.f32604OooO0Oo, whitePoint)) {
            return oooO;
        }
        float[] transform = OooO0o(OooO0O0(adaptation.f32560OooO00o, colorSpace.f32604OooO0Oo.OooO00o(), whitePoint.OooO00o()), colorSpace.f32603OooO);
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        return new Oooo0(colorSpace.f32556OooO00o, colorSpace.f32608OooO0oo, whitePoint, transform, colorSpace.f32610OooOO0O, colorSpace.f32613OooOOO0, colorSpace.f32606OooO0o0, colorSpace.f32605OooO0o, colorSpace.f32607OooO0oO, -1);
    }

    @NotNull
    public static final float[] OooO0O0(@NotNull float[] matrix, @NotNull float[] srcWhitePoint, @NotNull float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        OooO0oo(matrix, srcWhitePoint);
        OooO0oo(matrix, dstWhitePoint);
        return OooO0o(OooO0o0(matrix), OooO0oO(new float[]{dstWhitePoint[0] / srcWhitePoint[0], dstWhitePoint[1] / srcWhitePoint[1], dstWhitePoint[2] / srcWhitePoint[2]}, matrix));
    }

    public static final boolean OooO0OO(@NotNull o0OoOo0 a, @NotNull o0OoOo0 b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        if (a == b) {
            return true;
        }
        return Math.abs(a.f32635OooO00o - b.f32635OooO00o) < 0.001f && Math.abs(a.f32636OooO0O0 - b.f32636OooO0O0) < 0.001f;
    }

    public static OooOOOO OooO0Oo(OooO source, OooO destination, int i) {
        if ((i & 1) != 0) {
            OooOOO0 oooOOO0 = OooOOO0.f32567OooO00o;
            destination = OooOOO0.f32570OooO0Oo;
        }
        Intrinsics.checkNotNullParameter(source, "$this$connect");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source == destination) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new OooOOO(source);
        }
        long j = source.f32557OooO0O0;
        OooO0o.OooO00o oooO00o = OooO0o.f32561OooO00o;
        OooO0o.OooO00o oooO00o2 = OooO0o.f32561OooO00o;
        long j2 = OooO0o.f32562OooO0O0;
        return (OooO0o.OooO00o(j, j2) && OooO0o.OooO00o(destination.f32557OooO0O0, j2)) ? new OooOOOO.OooO00o((Oooo0) source, (Oooo0) destination, 0) : new OooOOOO(source, destination, 0);
    }

    @NotNull
    public static final float[] OooO0o(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return new float[]{(lhs[6] * rhs[2]) + (lhs[3] * rhs[1]) + (lhs[0] * rhs[0]), (lhs[7] * rhs[2]) + (lhs[4] * rhs[1]) + (lhs[1] * rhs[0]), (lhs[8] * rhs[2]) + (lhs[5] * rhs[1]) + (lhs[2] * rhs[0]), (lhs[6] * rhs[5]) + (lhs[3] * rhs[4]) + (lhs[0] * rhs[3]), (lhs[7] * rhs[5]) + (lhs[4] * rhs[4]) + (lhs[1] * rhs[3]), (lhs[8] * rhs[5]) + (lhs[5] * rhs[4]) + (lhs[2] * rhs[3]), (lhs[6] * rhs[8]) + (lhs[3] * rhs[7]) + (lhs[0] * rhs[6]), (lhs[7] * rhs[8]) + (lhs[4] * rhs[7]) + (lhs[1] * rhs[6]), (lhs[8] * rhs[8]) + (lhs[5] * rhs[7]) + (lhs[2] * rhs[6])};
    }

    @NotNull
    public static final float[] OooO0o0(@NotNull float[] m) {
        Intrinsics.checkNotNullParameter(m, "m");
        float f = m[0];
        float f2 = m[3];
        float f3 = m[6];
        float f4 = m[1];
        float f5 = m[4];
        float f6 = m[7];
        float f7 = m[2];
        float f8 = m[5];
        float f9 = m[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr = new float[m.length];
        fArr[0] = f10 / f13;
        fArr[1] = f11 / f13;
        fArr[2] = f12 / f13;
        fArr[3] = OooOO0.OooO00o(f2, f9, f3 * f8, f13);
        fArr[4] = OooOO0.OooO00o(f3, f7, f9 * f, f13);
        fArr[5] = OooOO0.OooO00o(f8, f, f7 * f2, f13);
        fArr[6] = OooOO0.OooO00o(f3, f5, f2 * f6, f13);
        fArr[7] = OooOO0.OooO00o(f6, f, f3 * f4, f13);
        fArr[8] = OooOO0.OooO00o(f2, f4, f * f5, f13);
        return fArr;
    }

    @NotNull
    public static final float[] OooO0oO(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        return new float[]{lhs[0] * rhs[0], lhs[1] * rhs[1], lhs[2] * rhs[2], lhs[0] * rhs[3], lhs[1] * rhs[4], lhs[2] * rhs[5], lhs[0] * rhs[6], lhs[1] * rhs[7], lhs[2] * rhs[8]};
    }

    @NotNull
    public static final float[] OooO0oo(@NotNull float[] lhs, @NotNull float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f = rhs[0];
        float f2 = rhs[1];
        float f3 = rhs[2];
        rhs[0] = (lhs[6] * f3) + (lhs[3] * f2) + (lhs[0] * f);
        rhs[1] = (lhs[7] * f3) + (lhs[4] * f2) + (lhs[1] * f);
        rhs[2] = (lhs[8] * f3) + (lhs[5] * f2) + (lhs[2] * f);
        return rhs;
    }
}
