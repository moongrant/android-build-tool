package p167o00Ooo;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO f32590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO f32591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final float[] f32592OooO0OO;

    public static final class OooO00o extends OooOOOO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Oooo0 f32593OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final float[] f32594OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Oooo0 f32595OooO0o0;

        public OooO00o(Oooo0 oooo0, Oooo0 oooo1, int i) {
            float[] fArrOooO0o;
            super(oooo0, oooo1);
            this.f32593OooO0Oo = oooo0;
            this.f32595OooO0o0 = oooo1;
            if (OooOO0O.OooO0OO(oooo0.f32604OooO0Oo, oooo1.f32604OooO0Oo)) {
                fArrOooO0o = OooOO0O.OooO0o(oooo1.f32609OooOO0, oooo0.f32603OooO);
            } else {
                float[] fArrOooO0o2 = oooo0.f32603OooO;
                float[] fArrOooO0o0 = oooo1.f32609OooOO0;
                float[] fArrOooO00o = oooo0.f32604OooO0Oo.OooO00o();
                float[] fArrOooO00o2 = oooo1.f32604OooO0Oo.OooO00o();
                o0OoOo0 o0oooo1 = oooo0.f32604OooO0Oo;
                o0OoOo0 o0oooo2 = OooOo00.f32597OooO0O0;
                if (!OooOO0O.OooO0OO(o0oooo1, o0oooo2)) {
                    float[] fArr = OooO0OO.f32559OooO0O0.f32560OooO00o;
                    float[] fArrCopyOf = Arrays.copyOf(OooOo00.f32600OooO0o0, 3);
                    Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
                    fArrOooO0o2 = OooOO0O.OooO0o(OooOO0O.OooO0O0(fArr, fArrOooO00o, fArrCopyOf), oooo0.f32603OooO);
                }
                if (!OooOO0O.OooO0OO(oooo1.f32604OooO0Oo, o0oooo2)) {
                    float[] fArr2 = OooO0OO.f32559OooO0O0.f32560OooO00o;
                    float[] fArrCopyOf2 = Arrays.copyOf(OooOo00.f32600OooO0o0, 3);
                    Intrinsics.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(this, size)");
                    fArrOooO0o0 = OooOO0O.OooO0o0(OooOO0O.OooO0o(OooOO0O.OooO0O0(fArr2, fArrOooO00o2, fArrCopyOf2), oooo1.f32603OooO));
                }
                fArrOooO0o = OooOO0O.OooO0o(fArrOooO0o0, i == 3 ? OooOO0O.OooO0oO(new float[]{fArrOooO00o[0] / fArrOooO00o2[0], fArrOooO00o[1] / fArrOooO00o2[1], fArrOooO00o[2] / fArrOooO00o2[2]}, fArrOooO0o2) : fArrOooO0o2);
            }
            this.f32594OooO0o = fArrOooO0o;
        }

        @Override // p167o00Ooo.OooOOOO
        @NotNull
        public final float[] OooO00o(@NotNull float[] v) {
            Intrinsics.checkNotNullParameter(v, "v");
            v[0] = (float) ((Number) this.f32593OooO0Oo.f32612OooOOO.invoke(Double.valueOf(v[0]))).doubleValue();
            v[1] = (float) ((Number) this.f32593OooO0Oo.f32612OooOOO.invoke(Double.valueOf(v[1]))).doubleValue();
            v[2] = (float) ((Number) this.f32593OooO0Oo.f32612OooOOO.invoke(Double.valueOf(v[2]))).doubleValue();
            OooOO0O.OooO0oo(this.f32594OooO0o, v);
            v[0] = (float) ((Number) this.f32595OooO0o0.f32611OooOO0o.invoke(Double.valueOf(v[0]))).doubleValue();
            v[1] = (float) ((Number) this.f32595OooO0o0.f32611OooOO0o.invoke(Double.valueOf(v[1]))).doubleValue();
            v[2] = (float) ((Number) this.f32595OooO0o0.f32611OooOO0o.invoke(Double.valueOf(v[2]))).doubleValue();
            return v;
        }
    }

    public OooOOOO(OooO oooO, OooO oooO2) {
        this.f32590OooO00o = oooO;
        this.f32591OooO0O0 = oooO2;
        this.f32592OooO0OO = null;
    }

    @NotNull
    public float[] OooO00o(@NotNull float[] v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float[] fArrOooO0o0 = this.f32590OooO00o.OooO0o0(v);
        float[] fArr = this.f32592OooO0OO;
        if (fArr != null) {
            fArrOooO0o0[0] = fArrOooO0o0[0] * fArr[0];
            fArrOooO0o0[1] = fArrOooO0o0[1] * fArr[1];
            fArrOooO0o0[2] = fArrOooO0o0[2] * fArr[2];
        }
        return this.f32591OooO0O0.OooO00o(fArrOooO0o0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public OooOOOO(OooO oooO, OooO oooO2, int i) {
        float[] fArr;
        long j = oooO.f32557OooO0O0;
        OooO0o.OooO00o oooO00o = OooO0o.f32561OooO00o;
        OooO0o.OooO00o oooO00o2 = OooO0o.f32561OooO00o;
        long j2 = OooO0o.f32562OooO0O0;
        OooO oooOOooO00o = OooO0o.OooO00o(j, j2) ? OooOO0O.OooO00o(oooO) : oooO;
        OooO oooOOooO00o2 = OooO0o.OooO00o(oooO2.f32557OooO0O0, j2) ? OooOO0O.OooO00o(oooO2) : oooO2;
        if (i == 3) {
            boolean zOooO00o = OooO0o.OooO00o(oooO.f32557OooO0O0, j2);
            boolean zOooO00o2 = OooO0o.OooO00o(oooO2.f32557OooO0O0, j2);
            if (!(zOooO00o && zOooO00o2) && (zOooO00o || zOooO00o2)) {
                Oooo0 oooo0 = (Oooo0) (zOooO00o ? oooO : oooO2);
                float[] fArrOooO00o = zOooO00o ? oooo0.f32604OooO0Oo.OooO00o() : OooOo00.f32600OooO0o0;
                float[] fArrOooO00o2 = zOooO00o2 ? oooo0.f32604OooO0Oo.OooO00o() : OooOo00.f32600OooO0o0;
                fArr = new float[]{fArrOooO00o[0] / fArrOooO00o2[0], fArrOooO00o[1] / fArrOooO00o2[1], fArrOooO00o[2] / fArrOooO00o2[2]};
            } else {
                fArr = null;
            }
        } else {
            fArr = null;
        }
        this.f32590OooO00o = oooOOooO00o;
        this.f32591OooO0O0 = oooOOooO00o2;
        this.f32592OooO0OO = fArr;
    }
}
