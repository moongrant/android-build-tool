package o000000O;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements Comparable<o0OoOo0> {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String[] f33896OooOo0 = {"position", "x", "y", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "pathRotate"};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33897OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public p413o0Oo0oo.Oooo0 f33898OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f33899OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33900OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33901OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33902OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33903OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33904OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33905OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f33906OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f33907OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f33908OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Oooo0 f33909OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f33910OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final LinkedHashMap<String, ConstraintAttribute> f33911OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public double[] f33912OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public double[] f33913OooOo00;

    public o0OoOo0() {
        this.f33900OooO0o0 = 0;
        this.f33905OooOO0o = Float.NaN;
        this.f33907OooOOO0 = -1;
        this.f33906OooOOO = -1;
        this.f33908OooOOOO = Float.NaN;
        this.f33909OooOOOo = null;
        this.f33911OooOOo0 = new LinkedHashMap<>();
        this.f33910OooOOo = 0;
        this.f33912OooOOoo = new double[18];
        this.f33913OooOo00 = new double[18];
    }

    public static boolean OooO0O0(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public static void OooO0o0(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f4 = f7;
            } else if (i2 == 2) {
                f6 = f7;
            } else if (i2 == 3) {
                f3 = f7;
            } else if (i2 == 4) {
                f5 = f7;
            }
        }
        float f8 = f4 - ((0.0f * f3) / 2.0f);
        float f9 = f6 - ((0.0f * f5) / 2.0f);
        fArr[0] = (((f3 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f5 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    public final void OooO00o(androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o) {
        this.f33898OooO0Oo = p413o0Oo0oo.Oooo0.OooO0OO(oooO00o.f5058OooO0Oo.f5149OooO0Oo);
        androidx.constraintlayout.widget.OooO0O0.OooO0OO oooO0OO = oooO00o.f5058OooO0Oo;
        this.f33907OooOOO0 = oooO0OO.f5151OooO0o0;
        this.f33906OooOOO = oooO0OO.f5147OooO0O0;
        this.f33905OooOO0o = oooO0OO.f5153OooO0oo;
        this.f33900OooO0o0 = oooO0OO.f5150OooO0o;
        float f = oooO00o.f5057OooO0OO.f5162OooO0o0;
        this.f33908OooOOOO = oooO00o.f5060OooO0o0.f5103OooOoo;
        for (String str : oooO00o.f5061OooO0oO.keySet()) {
            ConstraintAttribute constraintAttribute = oooO00o.f5061OooO0oO.get(str);
            if (constraintAttribute != null) {
                int i = ConstraintAttribute.OooO00o.f4913OooO00o[constraintAttribute.f4907OooO0OO.ordinal()];
                if ((i == 1 || i == 2 || i == 3) ? false : true) {
                    this.f33911OooOOo0.put(str, constraintAttribute);
                }
            }
        }
    }

    public final void OooO0OO(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f33902OooO0oo;
        float fCos = this.f33897OooO;
        float f = this.f33903OooOO0;
        float f2 = this.f33904OooOO0O;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        Oooo0 oooo0 = this.f33909OooOOOo;
        if (oooo0 != null) {
            float[] fArr2 = new float[2];
            oooo0.OooO0OO(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) (((Math.sin(d4) * d3) + d2) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (Math.cos(d4) * d3)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f / 2.0f) + fSin + 0.0f;
        fArr[i + 1] = (f2 / 2.0f) + fCos + 0.0f;
    }

    public final void OooO0Oo(float f, float f2, float f3, float f4) {
        this.f33902OooO0oo = f;
        this.f33897OooO = f2;
        this.f33903OooOO0 = f3;
        this.f33904OooOO0O = f4;
    }

    public final void OooO0o(Oooo0 oooo0, o0OoOo0 o0oooo0) {
        double d = (((this.f33903OooOO0 / 2.0f) + this.f33902OooO0oo) - o0oooo0.f33902OooO0oo) - (o0oooo0.f33903OooOO0 / 2.0f);
        double d2 = (((this.f33904OooOO0O / 2.0f) + this.f33897OooO) - o0oooo0.f33897OooO) - (o0oooo0.f33904OooOO0O / 2.0f);
        this.f33909OooOOOo = oooo0;
        this.f33902OooO0oo = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f33908OooOOOO)) {
            this.f33897OooO = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f33897OooO = (float) Math.toRadians(this.f33908OooOOOO);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull o0OoOo0 o0oooo0) {
        return Float.compare(this.f33901OooO0oO, o0oooo0.f33901OooO0oO);
    }

    public o0OoOo0(int i, int i2, OooOOO0 oooOOO0, o0OoOo0 o0oooo0, o0OoOo0 o0oooo1) {
        float f;
        int i3;
        float fMin;
        float fOooO00o;
        this.f33900OooO0o0 = 0;
        this.f33905OooOO0o = Float.NaN;
        this.f33907OooOOO0 = -1;
        this.f33906OooOOO = -1;
        this.f33908OooOOOO = Float.NaN;
        this.f33909OooOOOo = null;
        this.f33911OooOOo0 = new LinkedHashMap<>();
        this.f33910OooOOo = 0;
        this.f33912OooOOoo = new double[18];
        this.f33913OooOo00 = new double[18];
        if (o0oooo0.f33906OooOOO != -1) {
            float f2 = oooOOO0.f33767OooO00o / 100.0f;
            this.f33899OooO0o = f2;
            this.f33900OooO0o0 = oooOOO0.f33797OooO0oo;
            this.f33910OooOOo = oooOOO0.f33803OooOOOO;
            float f3 = Float.isNaN(oooOOO0.f33794OooO) ? f2 : oooOOO0.f33794OooO;
            float f4 = Float.isNaN(oooOOO0.f33798OooOO0) ? f2 : oooOOO0.f33798OooOO0;
            float f5 = o0oooo1.f33903OooOO0;
            float f6 = o0oooo0.f33903OooOO0;
            float f7 = o0oooo1.f33904OooOO0O;
            float f8 = o0oooo0.f33904OooOO0O;
            this.f33901OooO0oO = this.f33899OooO0o;
            this.f33903OooOO0 = (int) (((f5 - f6) * f3) + f6);
            this.f33904OooOO0O = (int) (((f7 - f8) * f4) + f8);
            int i4 = oooOOO0.f33803OooOOOO;
            if (i4 == 1) {
                float f9 = Float.isNaN(oooOOO0.f33799OooOO0O) ? f2 : oooOOO0.f33799OooOO0O;
                float f10 = o0oooo1.f33902OooO0oo;
                float f11 = o0oooo0.f33902OooO0oo;
                this.f33902OooO0oo = OooOo.OooO0o.OooO00o(f10, f11, f9, f11);
                f2 = Float.isNaN(oooOOO0.f33800OooOO0o) ? f2 : oooOOO0.f33800OooOO0o;
                float f12 = o0oooo1.f33897OooO;
                float f13 = o0oooo0.f33897OooO;
                this.f33897OooO = OooOo.OooO0o.OooO00o(f12, f13, f2, f13);
            } else if (i4 != 2) {
                float f14 = Float.isNaN(oooOOO0.f33799OooOO0O) ? f2 : oooOOO0.f33799OooOO0O;
                float f15 = o0oooo1.f33902OooO0oo;
                float f16 = o0oooo0.f33902OooO0oo;
                this.f33902OooO0oo = OooOo.OooO0o.OooO00o(f15, f16, f14, f16);
                f2 = Float.isNaN(oooOOO0.f33800OooOO0o) ? f2 : oooOOO0.f33800OooOO0o;
                float f17 = o0oooo1.f33897OooO;
                float f18 = o0oooo0.f33897OooO;
                this.f33897OooO = OooOo.OooO0o.OooO00o(f17, f18, f2, f18);
            } else {
                if (Float.isNaN(oooOOO0.f33799OooOO0O)) {
                    float f19 = o0oooo1.f33902OooO0oo;
                    float f20 = o0oooo0.f33902OooO0oo;
                    fMin = OooOo.OooO0o.OooO00o(f19, f20, f2, f20);
                } else {
                    fMin = oooOOO0.f33799OooOO0O * Math.min(f4, f3);
                }
                this.f33902OooO0oo = fMin;
                if (Float.isNaN(oooOOO0.f33800OooOO0o)) {
                    float f21 = o0oooo1.f33897OooO;
                    float f22 = o0oooo0.f33897OooO;
                    fOooO00o = OooOo.OooO0o.OooO00o(f21, f22, f2, f22);
                } else {
                    fOooO00o = oooOOO0.f33800OooOO0o;
                }
                this.f33897OooO = fOooO00o;
            }
            this.f33906OooOOO = o0oooo0.f33906OooOOO;
            this.f33898OooO0Oo = p413o0Oo0oo.Oooo0.OooO0OO(oooOOO0.f33795OooO0o);
            this.f33907OooOOO0 = oooOOO0.f33796OooO0oO;
            return;
        }
        int i5 = oooOOO0.f33803OooOOOO;
        if (i5 == 1) {
            float f23 = oooOOO0.f33767OooO00o / 100.0f;
            this.f33899OooO0o = f23;
            this.f33900OooO0o0 = oooOOO0.f33797OooO0oo;
            float f24 = Float.isNaN(oooOOO0.f33794OooO) ? f23 : oooOOO0.f33794OooO;
            float f25 = Float.isNaN(oooOOO0.f33798OooOO0) ? f23 : oooOOO0.f33798OooOO0;
            float f26 = o0oooo1.f33903OooOO0 - o0oooo0.f33903OooOO0;
            float f27 = o0oooo1.f33904OooOO0O - o0oooo0.f33904OooOO0O;
            this.f33901OooO0oO = this.f33899OooO0o;
            f23 = Float.isNaN(oooOOO0.f33799OooOO0O) ? f23 : oooOOO0.f33799OooOO0O;
            float f28 = o0oooo0.f33902OooO0oo;
            float f29 = o0oooo0.f33903OooOO0;
            float f30 = o0oooo0.f33897OooO;
            float f31 = o0oooo0.f33904OooOO0O;
            float f32 = ((o0oooo1.f33903OooOO0 / 2.0f) + o0oooo1.f33902OooO0oo) - ((f29 / 2.0f) + f28);
            float f33 = ((o0oooo1.f33904OooOO0O / 2.0f) + o0oooo1.f33897OooO) - ((f31 / 2.0f) + f30);
            float f34 = f32 * f23;
            float f35 = f26 * f24;
            float f36 = f35 / 2.0f;
            this.f33902OooO0oo = (int) ((f28 + f34) - f36);
            float f37 = f23 * f33;
            float f38 = f27 * f25;
            float f39 = f38 / 2.0f;
            this.f33897OooO = (int) ((f30 + f37) - f39);
            this.f33903OooOO0 = (int) (f29 + f35);
            this.f33904OooOO0O = (int) (f31 + f38);
            float f40 = Float.isNaN(oooOOO0.f33800OooOO0o) ? 0.0f : oooOOO0.f33800OooOO0o;
            this.f33910OooOOo = 1;
            float f41 = (int) ((o0oooo0.f33902OooO0oo + f34) - f36);
            float f42 = (int) ((o0oooo0.f33897OooO + f37) - f39);
            this.f33902OooO0oo = f41 + ((-f33) * f40);
            this.f33897OooO = f42 + (f32 * f40);
            this.f33906OooOOO = this.f33906OooOOO;
            this.f33898OooO0Oo = p413o0Oo0oo.Oooo0.OooO0OO(oooOOO0.f33795OooO0o);
            this.f33907OooOOO0 = oooOOO0.f33796OooO0oO;
            return;
        }
        if (i5 != 2) {
            float f43 = oooOOO0.f33767OooO00o / 100.0f;
            this.f33899OooO0o = f43;
            this.f33900OooO0o0 = oooOOO0.f33797OooO0oo;
            float f44 = Float.isNaN(oooOOO0.f33794OooO) ? f43 : oooOOO0.f33794OooO;
            float f45 = Float.isNaN(oooOOO0.f33798OooOO0) ? f43 : oooOOO0.f33798OooOO0;
            float f46 = o0oooo1.f33903OooOO0;
            float f47 = o0oooo0.f33903OooOO0;
            float f48 = f46 - f47;
            float f49 = o0oooo1.f33904OooOO0O;
            float f50 = o0oooo0.f33904OooOO0O;
            float f51 = f49 - f50;
            this.f33901OooO0oO = this.f33899OooO0o;
            float f52 = o0oooo0.f33902OooO0oo;
            float f53 = o0oooo0.f33897OooO;
            float f54 = ((f46 / 2.0f) + o0oooo1.f33902OooO0oo) - ((f47 / 2.0f) + f52);
            float f55 = ((f49 / 2.0f) + o0oooo1.f33897OooO) - ((f50 / 2.0f) + f53);
            float f56 = f48 * f44;
            float f57 = f56 / 2.0f;
            this.f33902OooO0oo = (int) (((f54 * f43) + f52) - f57);
            float f58 = (f55 * f43) + f53;
            float f59 = f51 * f45;
            float f60 = f59 / 2.0f;
            this.f33897OooO = (int) (f58 - f60);
            this.f33903OooOO0 = (int) (f47 + f56);
            this.f33904OooOO0O = (int) (f50 + f59);
            float f61 = Float.isNaN(oooOOO0.f33799OooOO0O) ? f43 : oooOOO0.f33799OooOO0O;
            float f62 = Float.isNaN(oooOOO0.f33801OooOOO) ? 0.0f : oooOOO0.f33801OooOOO;
            f43 = Float.isNaN(oooOOO0.f33800OooOO0o) ? f43 : oooOOO0.f33800OooOO0o;
            if (Float.isNaN(oooOOO0.f33802OooOOO0)) {
                i3 = 0;
                f = 0.0f;
            } else {
                f = oooOOO0.f33802OooOOO0;
                i3 = 0;
            }
            this.f33910OooOOo = i3;
            this.f33902OooO0oo = (int) (((f * f55) + ((f61 * f54) + o0oooo0.f33902OooO0oo)) - f57);
            this.f33897OooO = (int) (((f55 * f43) + ((f54 * f62) + o0oooo0.f33897OooO)) - f60);
            this.f33898OooO0Oo = p413o0Oo0oo.Oooo0.OooO0OO(oooOOO0.f33795OooO0o);
            this.f33907OooOOO0 = oooOOO0.f33796OooO0oO;
            return;
        }
        float f63 = oooOOO0.f33767OooO00o / 100.0f;
        this.f33899OooO0o = f63;
        this.f33900OooO0o0 = oooOOO0.f33797OooO0oo;
        float f64 = Float.isNaN(oooOOO0.f33794OooO) ? f63 : oooOOO0.f33794OooO;
        float f65 = Float.isNaN(oooOOO0.f33798OooOO0) ? f63 : oooOOO0.f33798OooOO0;
        float f66 = o0oooo1.f33903OooOO0;
        float f67 = o0oooo0.f33903OooOO0;
        float f68 = f66 - f67;
        float f69 = o0oooo1.f33904OooOO0O;
        float f70 = o0oooo0.f33904OooOO0O;
        float f71 = f69 - f70;
        this.f33901OooO0oO = this.f33899OooO0o;
        float f72 = o0oooo0.f33902OooO0oo;
        float f73 = o0oooo0.f33897OooO;
        float f74 = (f66 / 2.0f) + o0oooo1.f33902OooO0oo;
        float f75 = (f69 / 2.0f) + o0oooo1.f33897OooO;
        float f76 = f68 * f64;
        this.f33902OooO0oo = (int) ((((f74 - ((f67 / 2.0f) + f72)) * f63) + f72) - (f76 / 2.0f));
        float f77 = f71 * f65;
        this.f33897OooO = (int) ((((f75 - ((f70 / 2.0f) + f73)) * f63) + f73) - (f77 / 2.0f));
        this.f33903OooOO0 = (int) (f67 + f76);
        this.f33904OooOO0O = (int) (f70 + f77);
        this.f33910OooOOo = 2;
        if (!Float.isNaN(oooOOO0.f33799OooOO0O)) {
            this.f33902OooO0oo = (int) (oooOOO0.f33799OooOO0O * ((int) (i - this.f33903OooOO0)));
        }
        if (!Float.isNaN(oooOOO0.f33800OooOO0o)) {
            this.f33897OooO = (int) (oooOOO0.f33800OooOO0o * ((int) (i2 - this.f33904OooOO0O)));
        }
        this.f33906OooOOO = this.f33906OooOOO;
        this.f33898OooO0Oo = p413o0Oo0oo.Oooo0.OooO0OO(oooOOO0.f33795OooO0o);
        this.f33907OooOOO0 = oooOOO0.f33796OooO0oO;
    }
}
