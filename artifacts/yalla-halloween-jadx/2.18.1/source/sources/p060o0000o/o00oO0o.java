package p060o0000o;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.OooO00o;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.LinkedHashMap;
import p057o0000Oo0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o implements Comparable<o00oO0o> {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static String[] f27795OooooO0 = {"position", "x", "y", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "pathRotate"};

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f27796Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o000000O f27797Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f27798Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f27799Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f27800OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f27801OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f27802OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f27803OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f27804OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f27805OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public float f27806OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public o00Oo0 f27807OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public LinkedHashMap<String, ConstraintAttribute> f27808OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f27809OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public double[] f27810Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public double[] f27811Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f27812o000oOoO;

    public o00oO0o() {
        this.f27798Oooo0oO = 0;
        this.f27804OoooOO0 = Float.NaN;
        this.f27812o000oOoO = -1;
        this.f27805OoooOOO = -1;
        this.f27806OoooOOo = Float.NaN;
        this.f27807OoooOo0 = null;
        this.f27808OoooOoO = new LinkedHashMap<>();
        this.f27809OoooOoo = 0;
        this.f27810Ooooo00 = new double[18];
        this.f27811Ooooo0o = new double[18];
    }

    public final void OooO00o(OooO00o.C0043OooO00o c0043OooO00o) {
        this.f27797Oooo0o = o000000O.OooO0OO(c0043OooO00o.f7618OooO0Oo.f7709OooO0Oo);
        OooO00o.OooO0OO oooO0OO = c0043OooO00o.f7618OooO0Oo;
        this.f27812o000oOoO = oooO0OO.f7711OooO0o0;
        this.f27805OoooOOO = oooO0OO.f7707OooO0O0;
        this.f27804OoooOO0 = oooO0OO.f7713OooO0oo;
        this.f27798Oooo0oO = oooO0OO.f7710OooO0o;
        int i = oooO0OO.f7708OooO0OO;
        float f = c0043OooO00o.f7617OooO0OO.f7722OooO0o0;
        this.f27806OoooOOo = c0043OooO00o.f7620OooO0o0.f7663OooOoo;
        for (String str : c0043OooO00o.f7621OooO0oO.keySet()) {
            ConstraintAttribute constraintAttribute = c0043OooO00o.f7621OooO0oO.get(str);
            if (constraintAttribute != null && constraintAttribute.OooO0OO()) {
                this.f27808OoooOoO.put(str, constraintAttribute);
            }
        }
    }

    public final boolean OooO0O0(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public final void OooO0Oo(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f27802OoooO00;
        float fCos = this.f27801OoooO0;
        float f = this.f27803OoooO0O;
        float f2 = this.f27800OoooO;
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
        o00Oo0 o00oo1 = this.f27807OoooOo0;
        if (o00oo1 != null) {
            float[] fArr2 = new float[2];
            o00oo1.OooO0OO(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) (((Math.sin(d4) * d3) + d2) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (Math.cos(d4) * d3)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f / 2.0f) + fSin + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        fArr[i + 1] = (f2 / 2.0f) + fCos + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final void OooO0o(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE * f4) / 2.0f);
        float f9 = f5 - ((ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final void OooO0o0(float f, float f2, float f3, float f4) {
        this.f27802OoooO00 = f;
        this.f27801OoooO0 = f2;
        this.f27803OoooO0O = f3;
        this.f27800OoooO = f4;
    }

    public final void OooO0oO(o00Oo0 o00oo1, o00oO0o o00oo0o2) {
        double d = (((this.f27803OoooO0O / 2.0f) + this.f27802OoooO00) - o00oo0o2.f27802OoooO00) - (o00oo0o2.f27803OoooO0O / 2.0f);
        double d2 = (((this.f27800OoooO / 2.0f) + this.f27801OoooO0) - o00oo0o2.f27801OoooO0) - (o00oo0o2.f27800OoooO / 2.0f);
        this.f27807OoooOo0 = o00oo1;
        this.f27802OoooO00 = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f27806OoooOOo)) {
            this.f27801OoooO0 = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f27801OoooO0 = (float) Math.toRadians(this.f27806OoooOOo);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull o00oO0o o00oo0o2) {
        return Float.compare(this.f27796Oooo, o00oo0o2.f27796Oooo);
    }

    public o00oO0o(int i, int i2, OooOo oooOo, o00oO0o o00oo0o2, o00oO0o o00oo0o3) {
        float f;
        int i3;
        float fMin;
        float fOooO00o;
        this.f27798Oooo0oO = 0;
        this.f27804OoooOO0 = Float.NaN;
        this.f27812o000oOoO = -1;
        this.f27805OoooOOO = -1;
        this.f27806OoooOOo = Float.NaN;
        this.f27807OoooOo0 = null;
        this.f27808OoooOoO = new LinkedHashMap<>();
        this.f27809OoooOoo = 0;
        this.f27810Ooooo00 = new double[18];
        this.f27811Ooooo0o = new double[18];
        if (o00oo0o2.f27805OoooOOO != -1) {
            float f2 = oooOo.f27684OooO00o / 100.0f;
            this.f27799Oooo0oo = f2;
            this.f27798Oooo0oO = oooOo.f27711OooO0oo;
            this.f27809OoooOoo = oooOo.f27717OooOOOO;
            float f3 = Float.isNaN(oooOo.f27708OooO) ? f2 : oooOo.f27708OooO;
            float f4 = Float.isNaN(oooOo.f27712OooOO0) ? f2 : oooOo.f27712OooOO0;
            float f5 = o00oo0o3.f27803OoooO0O;
            float f6 = o00oo0o2.f27803OoooO0O;
            float f7 = o00oo0o3.f27800OoooO;
            float f8 = o00oo0o2.f27800OoooO;
            this.f27796Oooo = this.f27799Oooo0oo;
            this.f27803OoooO0O = (int) (((f5 - f6) * f3) + f6);
            this.f27800OoooO = (int) (((f7 - f8) * f4) + f8);
            int i4 = oooOo.f27717OooOOOO;
            if (i4 == 1) {
                float f9 = Float.isNaN(oooOo.f27713OooOO0O) ? f2 : oooOo.f27713OooOO0O;
                float f10 = o00oo0o3.f27802OoooO00;
                float f11 = o00oo0o2.f27802OoooO00;
                this.f27802OoooO00 = Oooo000.OooO00o.OooO00o(f10, f11, f9, f11);
                f2 = Float.isNaN(oooOo.f27714OooOO0o) ? f2 : oooOo.f27714OooOO0o;
                float f12 = o00oo0o3.f27801OoooO0;
                float f13 = o00oo0o2.f27801OoooO0;
                this.f27801OoooO0 = Oooo000.OooO00o.OooO00o(f12, f13, f2, f13);
            } else if (i4 != 2) {
                float f14 = Float.isNaN(oooOo.f27713OooOO0O) ? f2 : oooOo.f27713OooOO0O;
                float f15 = o00oo0o3.f27802OoooO00;
                float f16 = o00oo0o2.f27802OoooO00;
                this.f27802OoooO00 = Oooo000.OooO00o.OooO00o(f15, f16, f14, f16);
                f2 = Float.isNaN(oooOo.f27714OooOO0o) ? f2 : oooOo.f27714OooOO0o;
                float f17 = o00oo0o3.f27801OoooO0;
                float f18 = o00oo0o2.f27801OoooO0;
                this.f27801OoooO0 = Oooo000.OooO00o.OooO00o(f17, f18, f2, f18);
            } else {
                if (Float.isNaN(oooOo.f27713OooOO0O)) {
                    float f19 = o00oo0o3.f27802OoooO00;
                    float f20 = o00oo0o2.f27802OoooO00;
                    fMin = Oooo000.OooO00o.OooO00o(f19, f20, f2, f20);
                } else {
                    fMin = oooOo.f27713OooOO0O * Math.min(f4, f3);
                }
                this.f27802OoooO00 = fMin;
                if (Float.isNaN(oooOo.f27714OooOO0o)) {
                    float f21 = o00oo0o3.f27801OoooO0;
                    float f22 = o00oo0o2.f27801OoooO0;
                    fOooO00o = Oooo000.OooO00o.OooO00o(f21, f22, f2, f22);
                } else {
                    fOooO00o = oooOo.f27714OooOO0o;
                }
                this.f27801OoooO0 = fOooO00o;
            }
            this.f27805OoooOOO = o00oo0o2.f27805OoooOOO;
            this.f27797Oooo0o = o000000O.OooO0OO(oooOo.f27709OooO0o);
            this.f27812o000oOoO = oooOo.f27710OooO0oO;
            return;
        }
        int i5 = oooOo.f27717OooOOOO;
        if (i5 == 1) {
            float f23 = oooOo.f27684OooO00o / 100.0f;
            this.f27799Oooo0oo = f23;
            this.f27798Oooo0oO = oooOo.f27711OooO0oo;
            float f24 = Float.isNaN(oooOo.f27708OooO) ? f23 : oooOo.f27708OooO;
            float f25 = Float.isNaN(oooOo.f27712OooOO0) ? f23 : oooOo.f27712OooOO0;
            float f26 = o00oo0o3.f27803OoooO0O - o00oo0o2.f27803OoooO0O;
            float f27 = o00oo0o3.f27800OoooO - o00oo0o2.f27800OoooO;
            this.f27796Oooo = this.f27799Oooo0oo;
            f23 = Float.isNaN(oooOo.f27713OooOO0O) ? f23 : oooOo.f27713OooOO0O;
            float f28 = o00oo0o2.f27802OoooO00;
            float f29 = o00oo0o2.f27803OoooO0O;
            float f30 = o00oo0o2.f27801OoooO0;
            float f31 = o00oo0o2.f27800OoooO;
            float f32 = ((o00oo0o3.f27803OoooO0O / 2.0f) + o00oo0o3.f27802OoooO00) - ((f29 / 2.0f) + f28);
            float f33 = ((o00oo0o3.f27800OoooO / 2.0f) + o00oo0o3.f27801OoooO0) - ((f31 / 2.0f) + f30);
            float f34 = f32 * f23;
            float f35 = f26 * f24;
            float f36 = f35 / 2.0f;
            this.f27802OoooO00 = (int) ((f28 + f34) - f36);
            float f37 = f23 * f33;
            float f38 = f27 * f25;
            float f39 = f38 / 2.0f;
            this.f27801OoooO0 = (int) ((f30 + f37) - f39);
            this.f27803OoooO0O = (int) (f29 + f35);
            this.f27800OoooO = (int) (f31 + f38);
            float f40 = Float.isNaN(oooOo.f27714OooOO0o) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : oooOo.f27714OooOO0o;
            this.f27809OoooOoo = 1;
            float f41 = (int) ((o00oo0o2.f27802OoooO00 + f34) - f36);
            float f42 = (int) ((o00oo0o2.f27801OoooO0 + f37) - f39);
            this.f27802OoooO00 = f41 + ((-f33) * f40);
            this.f27801OoooO0 = f42 + (f32 * f40);
            this.f27805OoooOOO = this.f27805OoooOOO;
            this.f27797Oooo0o = o000000O.OooO0OO(oooOo.f27709OooO0o);
            this.f27812o000oOoO = oooOo.f27710OooO0oO;
            return;
        }
        if (i5 != 2) {
            float f43 = oooOo.f27684OooO00o / 100.0f;
            this.f27799Oooo0oo = f43;
            this.f27798Oooo0oO = oooOo.f27711OooO0oo;
            float f44 = Float.isNaN(oooOo.f27708OooO) ? f43 : oooOo.f27708OooO;
            float f45 = Float.isNaN(oooOo.f27712OooOO0) ? f43 : oooOo.f27712OooOO0;
            float f46 = o00oo0o3.f27803OoooO0O;
            float f47 = o00oo0o2.f27803OoooO0O;
            float f48 = f46 - f47;
            float f49 = o00oo0o3.f27800OoooO;
            float f50 = o00oo0o2.f27800OoooO;
            float f51 = f49 - f50;
            this.f27796Oooo = this.f27799Oooo0oo;
            float f52 = o00oo0o2.f27802OoooO00;
            float f53 = o00oo0o2.f27801OoooO0;
            float f54 = ((f46 / 2.0f) + o00oo0o3.f27802OoooO00) - ((f47 / 2.0f) + f52);
            float f55 = ((f49 / 2.0f) + o00oo0o3.f27801OoooO0) - ((f50 / 2.0f) + f53);
            float f56 = f48 * f44;
            float f57 = f56 / 2.0f;
            this.f27802OoooO00 = (int) (((f54 * f43) + f52) - f57);
            float f58 = (f55 * f43) + f53;
            float f59 = f51 * f45;
            float f60 = f59 / 2.0f;
            this.f27801OoooO0 = (int) (f58 - f60);
            this.f27803OoooO0O = (int) (f47 + f56);
            this.f27800OoooO = (int) (f50 + f59);
            float f61 = Float.isNaN(oooOo.f27713OooOO0O) ? f43 : oooOo.f27713OooOO0O;
            float f62 = Float.isNaN(oooOo.f27715OooOOO) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : oooOo.f27715OooOOO;
            f43 = Float.isNaN(oooOo.f27714OooOO0o) ? f43 : oooOo.f27714OooOO0o;
            if (Float.isNaN(oooOo.f27716OooOOO0)) {
                i3 = 0;
                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else {
                f = oooOo.f27716OooOOO0;
                i3 = 0;
            }
            this.f27809OoooOoo = i3;
            this.f27802OoooO00 = (int) (((f * f55) + ((f61 * f54) + o00oo0o2.f27802OoooO00)) - f57);
            this.f27801OoooO0 = (int) (((f55 * f43) + ((f54 * f62) + o00oo0o2.f27801OoooO0)) - f60);
            this.f27797Oooo0o = o000000O.OooO0OO(oooOo.f27709OooO0o);
            this.f27812o000oOoO = oooOo.f27710OooO0oO;
            return;
        }
        float f63 = oooOo.f27684OooO00o / 100.0f;
        this.f27799Oooo0oo = f63;
        this.f27798Oooo0oO = oooOo.f27711OooO0oo;
        float f64 = Float.isNaN(oooOo.f27708OooO) ? f63 : oooOo.f27708OooO;
        float f65 = Float.isNaN(oooOo.f27712OooOO0) ? f63 : oooOo.f27712OooOO0;
        float f66 = o00oo0o3.f27803OoooO0O;
        float f67 = o00oo0o2.f27803OoooO0O;
        float f68 = f66 - f67;
        float f69 = o00oo0o3.f27800OoooO;
        float f70 = o00oo0o2.f27800OoooO;
        float f71 = f69 - f70;
        this.f27796Oooo = this.f27799Oooo0oo;
        float f72 = o00oo0o2.f27802OoooO00;
        float f73 = o00oo0o2.f27801OoooO0;
        float f74 = (f66 / 2.0f) + o00oo0o3.f27802OoooO00;
        float f75 = (f69 / 2.0f) + o00oo0o3.f27801OoooO0;
        float f76 = f68 * f64;
        this.f27802OoooO00 = (int) ((((f74 - ((f67 / 2.0f) + f72)) * f63) + f72) - (f76 / 2.0f));
        float f77 = f71 * f65;
        this.f27801OoooO0 = (int) ((((f75 - ((f70 / 2.0f) + f73)) * f63) + f73) - (f77 / 2.0f));
        this.f27803OoooO0O = (int) (f67 + f76);
        this.f27800OoooO = (int) (f70 + f77);
        this.f27809OoooOoo = 2;
        if (!Float.isNaN(oooOo.f27713OooOO0O)) {
            this.f27802OoooO00 = (int) (oooOo.f27713OooOO0O * ((int) (i - this.f27803OoooO0O)));
        }
        if (!Float.isNaN(oooOo.f27714OooOO0o)) {
            this.f27801OoooO0 = (int) (oooOo.f27714OooOO0o * ((int) (i2 - this.f27800OoooO)));
        }
        this.f27805OoooOOO = this.f27805OoooOOO;
        this.f27797Oooo0o = o000000O.OooO0OO(oooOo.f27709OooO0o);
        this.f27812o000oOoO = oooOo.f27710OooO0oO;
    }
}
