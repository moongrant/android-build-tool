package o000000O;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.jctools.util.Pow2;
import p028Oooo0oO.o0O00o0;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View f33862OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33863OooO0OO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public p413o0Oo0oo.Oooo000[] f33869OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public p413o0Oo0oo.OooOo f33870OooOO0O;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int[] f33874OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public double[] f33875OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String[] f33876OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public double[] f33877OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int[] f33878OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public HashMap<String, o000000.OooO> f33879OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public HashMap<String, o000000.OooO0OO> f33884OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public HashMap<String, o000000.OooO0o> f33885OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooOo00[] f33886OooOoOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Rect f33861OooO00o = new Rect();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f33864OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33866OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OoOo0 f33865OooO0o = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OoOo0 f33867OooO0oO = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo f33868OooO0oo = new OooOo();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOo f33860OooO = new OooOo();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33871OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f33873OooOOO0 = 0.0f;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33872OooOOO = 1.0f;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final float[] f33881OooOo00 = new float[4];

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ArrayList<o0OoOo0> f33880OooOo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final float[] f33882OooOo0O = new float[1];

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ArrayList<OooO0o> f33883OooOo0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f33888OooOoo0 = -1;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f33887OooOoo = -1;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f33889OooOooO = null;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f33890OooOooo = -1;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f33891Oooo000 = Float.NaN;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Interpolator f33892Oooo00O = null;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f33893Oooo00o = false;

    public Oooo0(View view) {
        this.f33862OooO0O0 = view;
        this.f33863OooO0OO = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).getClass();
        }
    }

    public static void OooO0oO(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void OooO00o(OooO0o oooO0o) {
        this.f33883OooOo0o.add(oooO0o);
    }

    public final float OooO0O0(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f33872OooOOO;
            if (f3 != 1.0d) {
                float f4 = this.f33873OooOOO0;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        p413o0Oo0oo.Oooo0 oooo0 = this.f33865OooO0o.f33898OooO0Oo;
        float f5 = Float.NaN;
        for (o0OoOo0 o0oooo0 : this.f33880OooOo0) {
            p413o0Oo0oo.Oooo0 oooo1 = o0oooo0.f33898OooO0Oo;
            if (oooo1 != null) {
                float f6 = o0oooo0.f33899OooO0o;
                if (f6 < f) {
                    oooo0 = oooo1;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = o0oooo0.f33899OooO0o;
                }
            }
        }
        if (oooo0 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) oooo0.OooO00o(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) oooo0.OooO0O0(d);
            }
        }
        return f;
    }

    public final void OooO0OO(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f33869OooOO0[0].OooO0OO(d, dArr);
        this.f33869OooOO0[0].OooO0o(d, dArr2);
        float f = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.f33874OooOOOO;
        o0OoOo0 o0oooo0 = this.f33865OooO0o;
        float f2 = o0oooo0.f33902OooO0oo;
        float f3 = o0oooo0.f33897OooO;
        float f4 = o0oooo0.f33903OooOO0;
        float f5 = o0oooo0.f33904OooOO0O;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f9 = (float) dArr[i];
            float f10 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f9;
                f = f10;
            } else if (i2 == 2) {
                f3 = f9;
                f8 = f10;
            } else if (i2 == 3) {
                f4 = f9;
                f6 = f10;
            } else if (i2 == 4) {
                f5 = f9;
                f7 = f10;
            }
        }
        float f11 = 2.0f;
        float f12 = (f6 / 2.0f) + f;
        float fSin = (f7 / 2.0f) + f8;
        Oooo0 oooo0 = o0oooo0.f33909OooOOOo;
        if (oooo0 != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            oooo0.OooO0OO(d, fArr3, fArr4);
            float f13 = fArr3[0];
            float f14 = fArr3[1];
            float f15 = fArr4[0];
            float f16 = fArr4[1];
            double d2 = f2;
            double d3 = f3;
            float fSin2 = (float) (((Math.sin(d3) * d2) + ((double) f13)) - ((double) (f4 / 2.0f)));
            float fCos = (float) ((((double) f14) - (Math.cos(d3) * d2)) - ((double) (f5 / 2.0f)));
            double d4 = f15;
            double d5 = f;
            double d6 = f8;
            float fCos2 = (float) ((Math.cos(d3) * d6) + (Math.sin(d3) * d5) + d4);
            fSin = (float) ((Math.sin(d3) * d6) + (((double) f16) - (Math.cos(d3) * d5)));
            f3 = fCos;
            f12 = fCos2;
            f2 = fSin2;
            f11 = 2.0f;
        }
        fArr[0] = (f4 / f11) + f2 + 0.0f;
        fArr[1] = (f5 / f11) + f3 + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = fSin;
    }

    public final void OooO0Oo(float[] fArr, float f, float f2, float f3) {
        double[] dArr;
        float[] fArr2 = this.f33882OooOo0O;
        float fOooO0O0 = OooO0O0(f, fArr2);
        p413o0Oo0oo.Oooo000[] oooo000Arr = this.f33869OooOO0;
        o0OoOo0 o0oooo0 = this.f33865OooO0o;
        int i = 0;
        if (oooo000Arr == null) {
            o0OoOo0 o0oooo1 = this.f33867OooO0oO;
            float f4 = o0oooo1.f33902OooO0oo - o0oooo0.f33902OooO0oo;
            float f5 = o0oooo1.f33897OooO - o0oooo0.f33897OooO;
            float f6 = o0oooo1.f33903OooOO0 - o0oooo0.f33903OooOO0;
            float f7 = (o0oooo1.f33904OooOO0O - o0oooo0.f33904OooOO0O) + f5;
            fArr[0] = ((f6 + f4) * f2) + ((1.0f - f2) * f4);
            fArr[1] = (f7 * f3) + ((1.0f - f3) * f5);
            return;
        }
        double d = fOooO0O0;
        oooo000Arr[0].OooO0o(d, this.f33877OooOOo0);
        this.f33869OooOO0[0].OooO0OO(d, this.f33875OooOOOo);
        float f8 = fArr2[0];
        while (true) {
            dArr = this.f33877OooOOo0;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f8);
            i++;
        }
        p413o0Oo0oo.OooOo oooOo = this.f33870OooOO0O;
        if (oooOo == null) {
            int[] iArr = this.f33874OooOOOO;
            double[] dArr2 = this.f33875OooOOOo;
            o0oooo0.getClass();
            o0OoOo0.OooO0o0(f2, f3, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.f33875OooOOOo;
        if (dArr3.length > 0) {
            oooOo.OooO0OO(d, dArr3);
            this.f33870OooOO0O.OooO0o(d, this.f33877OooOOo0);
            int[] iArr2 = this.f33874OooOOOO;
            double[] dArr4 = this.f33877OooOOo0;
            double[] dArr5 = this.f33875OooOOOo;
            o0oooo0.getClass();
            o0OoOo0.OooO0o0(f2, f3, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final void OooO0o(o0OoOo0 o0oooo0) {
        o0oooo0.OooO0Oo((int) this.f33862OooO0O0.getX(), (int) this.f33862OooO0O0.getY(), this.f33862OooO0O0.getWidth(), this.f33862OooO0O0.getHeight());
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0324  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0o0(float f, long j, View view, p413o0Oo0oo.o000oOoO o000oooo2) {
        o000000.OooO.OooO0o oooO0o;
        boolean zOooO0o0;
        float f2;
        Oooo0 oooo0;
        boolean z;
        o0OoOo0 o0oooo0;
        double d;
        float f3;
        float f4;
        boolean z2;
        float f5;
        float fOooO0O0 = OooO0O0(f, null);
        int i = this.f33890OooOooo;
        float interpolation = 1.0f;
        if (i != -1) {
            float f6 = 1.0f / i;
            float fFloor = ((float) Math.floor(fOooO0O0 / f6)) * f6;
            float f7 = (fOooO0O0 % f6) / f6;
            if (!Float.isNaN(this.f33891Oooo000)) {
                f7 = (f7 + this.f33891Oooo000) % 1.0f;
            }
            Interpolator interpolator = this.f33892Oooo00O;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(f7);
            } else if (f7 <= 0.5d) {
                interpolation = 0.0f;
            }
            fOooO0O0 = (interpolation * f6) + fFloor;
        }
        float f8 = fOooO0O0;
        HashMap<String, o000000.OooO0o> map = this.f33885OooOoO0;
        if (map != null) {
            Iterator<o000000.OooO0o> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().OooO0Oo(view, f8);
            }
        }
        HashMap<String, o000000.OooO> map2 = this.f33879OooOo;
        if (map2 != null) {
            oooO0o = null;
            zOooO0o0 = false;
            for (o000000.OooO oooO : map2.values()) {
                if (oooO instanceof o000000.OooO.OooO0o) {
                    oooO0o = (o000000.OooO.OooO0o) oooO;
                } else {
                    zOooO0o0 |= oooO.OooO0o0(f8, j, view, o000oooo2);
                }
            }
        } else {
            oooO0o = null;
            zOooO0o0 = false;
        }
        p413o0Oo0oo.Oooo000[] oooo000Arr = this.f33869OooOO0;
        o0OoOo0 o0oooo1 = this.f33865OooO0o;
        if (oooo000Arr != null) {
            double d2 = f8;
            oooo000Arr[0].OooO0OO(d2, this.f33875OooOOOo);
            this.f33869OooOO0[0].OooO0o(d2, this.f33877OooOOo0);
            p413o0Oo0oo.OooOo oooOo = this.f33870OooOO0O;
            if (oooOo != null) {
                double[] dArr = this.f33875OooOOOo;
                if (dArr.length > 0) {
                    oooOo.OooO0OO(d2, dArr);
                    this.f33870OooOO0O.OooO0o(d2, this.f33877OooOOo0);
                }
            }
            if (this.f33893Oooo00o) {
                o0oooo0 = o0oooo1;
                d = d2;
                oooo0 = this;
            } else {
                int[] iArr = this.f33874OooOOOO;
                double[] dArr2 = this.f33875OooOOOo;
                double[] dArr3 = this.f33877OooOOo0;
                boolean z3 = this.f33864OooO0Oo;
                float f9 = o0oooo1.f33902OooO0oo;
                float f10 = o0oooo1.f33897OooO;
                float f11 = o0oooo1.f33903OooOO0;
                float f12 = o0oooo1.f33904OooOO0O;
                if (iArr.length != 0) {
                    f4 = f10;
                    if (o0oooo1.f33912OooOOoo.length <= iArr[iArr.length - 1]) {
                        int i2 = iArr[iArr.length - 1] + 1;
                        o0oooo1.f33912OooOOoo = new double[i2];
                        o0oooo1.f33913OooOo00 = new double[i2];
                    }
                } else {
                    f4 = f10;
                }
                Arrays.fill(o0oooo1.f33912OooOOoo, Double.NaN);
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    double[] dArr4 = o0oooo1.f33912OooOOoo;
                    int i4 = iArr[i3];
                    dArr4[i4] = dArr2[i3];
                    o0oooo1.f33913OooOo00[i4] = dArr3[i3];
                }
                float f13 = Float.NaN;
                float f14 = 0.0f;
                int i5 = 0;
                float f15 = f12;
                float f16 = 0.0f;
                float f17 = 0.0f;
                float f18 = f9;
                float f19 = 0.0f;
                float f20 = f11;
                float f21 = f4;
                while (true) {
                    double[] dArr5 = o0oooo1.f33912OooOOoo;
                    z2 = z3;
                    if (i5 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i5])) {
                        f5 = f13;
                    } else {
                        f5 = f13;
                        float f22 = (float) (Double.isNaN(o0oooo1.f33912OooOOoo[i5]) ? 0.0d : o0oooo1.f33912OooOOoo[i5] + 0.0d);
                        float f23 = (float) o0oooo1.f33913OooOo00[i5];
                        if (i5 == 1) {
                            f13 = f5;
                            f14 = f23;
                            f18 = f22;
                        } else if (i5 == 2) {
                            f19 = f23;
                            f21 = f22;
                        } else if (i5 == 3) {
                            f17 = f23;
                            f20 = f22;
                        } else if (i5 == 4) {
                            f16 = f23;
                            f15 = f22;
                        } else if (i5 == 5) {
                            f13 = f22;
                        }
                        i5++;
                        z3 = z2;
                    }
                    f13 = f5;
                    i5++;
                    z3 = z2;
                }
                float f24 = f13;
                Oooo0 oooo1 = o0oooo1.f33909OooOOOo;
                if (oooo1 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    oooo1.OooO0OO(d2, fArr, fArr2);
                    float f25 = fArr[0];
                    float f26 = fArr[1];
                    float f27 = fArr2[0];
                    float f28 = fArr2[1];
                    o0oooo0 = o0oooo1;
                    double d3 = f25;
                    double d4 = f18;
                    d = d2;
                    double d5 = f21;
                    float fSin = (float) (((Math.sin(d5) * d4) + d3) - ((double) (f20 / 2.0f)));
                    float fCos = (float) ((((double) f26) - (Math.cos(d5) * d4)) - ((double) (f15 / 2.0f)));
                    double d6 = f14;
                    double d7 = f19;
                    float fCos2 = (float) ((Math.cos(d5) * d4 * d7) + (Math.sin(d5) * d6) + ((double) f27));
                    float fSin2 = (float) ((Math.sin(d5) * d4 * d7) + (((double) f28) - (Math.cos(d5) * d6)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f24)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f24)));
                    }
                    f18 = fSin;
                    f21 = fCos;
                } else {
                    o0oooo0 = o0oooo1;
                    d = d2;
                    if (!Float.isNaN(f24)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2((f16 / 2.0f) + f19, (f17 / 2.0f) + f14)) + ((double) f24) + ((double) 0.0f)));
                    }
                }
                if (view instanceof OooO0OO) {
                    ((OooO0OO) view).OooO00o(f18, f21, f20 + f18, f21 + f15);
                } else {
                    float f29 = f18 + 0.5f;
                    int i6 = (int) f29;
                    float f30 = f21 + 0.5f;
                    int i7 = (int) f30;
                    int i8 = (int) (f29 + f20);
                    int i9 = (int) (f30 + f15);
                    int i10 = i8 - i6;
                    int i11 = i9 - i7;
                    if (((i10 == view.getMeasuredWidth() && i11 == view.getMeasuredHeight()) ? false : true) || z2) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(i11, Pow2.MAX_POW2));
                    }
                    view.layout(i6, i7, i8, i9);
                }
                oooo0 = this;
                oooo0.f33864OooO0Oo = false;
            }
            if (oooo0.f33887OooOoo != -1) {
                if (oooo0.f33889OooOooO == null) {
                    oooo0.f33889OooOooO = ((View) view.getParent()).findViewById(oooo0.f33887OooOoo);
                }
                View view2 = oooo0.f33889OooOooO;
                if (view2 != null) {
                    float bottom = (oooo0.f33889OooOooO.getBottom() + view2.getTop()) / 2.0f;
                    float right = (oooo0.f33889OooOooO.getRight() + oooo0.f33889OooOooO.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view.setPivotX(left);
                        view.setPivotY(top);
                    }
                }
            }
            HashMap<String, o000000.OooO0o> map3 = oooo0.f33885OooOoO0;
            if (map3 != null) {
                for (o000000.OooO0o oooO0o2 : map3.values()) {
                    if (oooO0o2 instanceof o000000.OooO0o.C0391OooO0o) {
                        double[] dArr6 = oooo0.f33877OooOOo0;
                        if (dArr6.length > 1) {
                            f3 = f8;
                            view.setRotation(((o000000.OooO0o.C0391OooO0o) oooO0o2).OooO00o(f3) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        } else {
                            f3 = f8;
                        }
                    } else {
                        f3 = f8;
                    }
                    f8 = f3;
                }
            }
            f2 = f8;
            if (oooO0o != 0) {
                double[] dArr7 = oooo0.f33877OooOOo0;
                view.setRotation(oooO0o.OooO0Oo(f2, j, view, o000oooo2) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                z = zOooO0o0 | oooO0o.f45332OooO0oo;
            } else {
                z = zOooO0o0;
            }
            int i12 = 1;
            while (true) {
                p413o0Oo0oo.Oooo000[] oooo000Arr2 = oooo0.f33869OooOO0;
                if (i12 >= oooo000Arr2.length) {
                    break;
                }
                p413o0Oo0oo.Oooo000 oooo000 = oooo000Arr2[i12];
                float[] fArr3 = oooo0.f33881OooOo00;
                oooo000.OooO0Oo(d, fArr3);
                o000000.OooO00o.OooO0O0(o0oooo0.f33911OooOOo0.get(oooo0.f33876OooOOo[i12 - 1]), view, fArr3);
                i12++;
            }
            OooOo oooOo2 = oooo0.f33868OooO0oo;
            if (oooOo2.f33825OooO0o0 == 0) {
                if (f2 <= 0.0f) {
                    view.setVisibility(oooOo2.f33824OooO0o);
                } else {
                    OooOo oooOo3 = oooo0.f33860OooO;
                    if (f2 >= 1.0f) {
                        view.setVisibility(oooOo3.f33824OooO0o);
                    } else if (oooOo3.f33824OooO0o != oooOo2.f33824OooO0o) {
                        view.setVisibility(0);
                    }
                }
            }
            if (oooo0.f33886OooOoOO != null) {
                int i13 = 0;
                while (true) {
                    OooOo00[] oooOo00Arr = oooo0.f33886OooOoOO;
                    if (i13 >= oooOo00Arr.length) {
                        break;
                    }
                    oooOo00Arr[i13].OooO0oo(view, f2);
                    i13++;
                }
            }
        } else {
            f2 = f8;
            boolean z4 = zOooO0o0;
            oooo0 = this;
            float f31 = o0oooo1.f33902OooO0oo;
            o0OoOo0 o0oooo2 = oooo0.f33867OooO0oO;
            float fOooO00o = OooOo.OooO0o.OooO00o(o0oooo2.f33902OooO0oo, f31, f2, f31);
            float f32 = o0oooo1.f33897OooO;
            float fOooO00o2 = OooOo.OooO0o.OooO00o(o0oooo2.f33897OooO, f32, f2, f32);
            float f33 = o0oooo1.f33903OooOO0;
            float f34 = o0oooo2.f33903OooOO0;
            float fOooO00o3 = OooOo.OooO0o.OooO00o(f34, f33, f2, f33);
            float f35 = o0oooo1.f33904OooOO0O;
            float f36 = o0oooo2.f33904OooOO0O;
            float f37 = fOooO00o + 0.5f;
            int i14 = (int) f37;
            float f38 = fOooO00o2 + 0.5f;
            int i15 = (int) f38;
            int i16 = (int) (f37 + fOooO00o3);
            int iOooO00o = (int) (f38 + OooOo.OooO0o.OooO00o(f36, f35, f2, f35));
            int i17 = i16 - i14;
            int i18 = iOooO00o - i15;
            if (f34 != f33 || f36 != f35 || oooo0.f33864OooO0Oo) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i17, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(i18, Pow2.MAX_POW2));
                oooo0.f33864OooO0Oo = false;
            }
            view.layout(i14, i15, i16, iOooO00o);
            z = z4;
        }
        HashMap<String, o000000.OooO0OO> map4 = oooo0.f33884OooOoO;
        if (map4 != null) {
            for (o000000.OooO0OO oooO0OO : map4.values()) {
                if (oooO0OO instanceof o000000.OooO0OO.OooO0o) {
                    double[] dArr8 = oooo0.f33877OooOOo0;
                    view.setRotation(((o000000.OooO0OO.OooO0o) oooO0OO).OooO00o(f2) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    oooO0OO.OooO0o0(view, f2);
                }
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:254:0x0603  */
    public final void OooO0oo(int i, int i2, long j) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Object obj;
        Object obj2;
        Object obj3;
        String str11;
        ArrayList<o0OoOo0> arrayList2;
        ArrayList<OooO0o> arrayList3;
        String str12;
        String str13;
        String str14;
        Object obj4;
        Object obj5;
        Object obj6;
        Oooo0 oooo0;
        String str15;
        Object obj7;
        String str16;
        Object obj8;
        String str17;
        Object obj9;
        String str18;
        String str19;
        String str20;
        String str21;
        o000000.OooO0OO oooO0OO;
        String str22;
        String str23;
        String str24;
        byte b;
        byte b2;
        byte b3;
        float f;
        float f2;
        HashMap<String, o000000.OooO0OO> map;
        String str25;
        String str26;
        String str27;
        String str28;
        byte b4;
        byte b5;
        byte b6;
        o000000.OooO0OO oooOO0O;
        o000000.OooO0OO oooO0O0;
        String str29;
        String str30;
        o0OoOo0 o0oooo0;
        String str31;
        double dOooO00o;
        String str32;
        ConstraintAttribute constraintAttribute;
        HashSet<String> hashSet3;
        ArrayList<OooO0o> arrayList4;
        HashMap<String, o000000.OooO> map2;
        String str33;
        Iterator<String> it;
        String str34;
        Object obj10;
        OooOOOO oooOOOO;
        Object obj11;
        Object obj12;
        Object obj13;
        byte b7;
        byte b8;
        byte b9;
        Iterator<String> it2;
        HashMap<String, Integer> map3;
        String str35;
        String str36;
        Object obj14;
        Object obj15;
        Object obj16;
        byte b10;
        byte b11;
        o000000.OooO oooOO0O2;
        Object obj17;
        o000000.OooO oooO0O1;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        HashSet<String> hashSet4;
        HashSet<String> hashSet5;
        String str37;
        String str38;
        String str39;
        String str40;
        Object obj18;
        String str41;
        ArrayList<o0OoOo0> arrayList5;
        Object obj19;
        byte b12;
        byte b13;
        o000000.OooO0o oooOOO;
        Object obj20;
        o000000.OooO0o oooO0o;
        ConstraintAttribute constraintAttribute3;
        String str42;
        String str43;
        Oooo0 oooo1 = this;
        new HashSet();
        HashSet<String> hashSet6 = new HashSet<>();
        HashSet<String> hashSet7 = new HashSet<>();
        HashSet<String> hashSet8 = new HashSet<>();
        HashMap<String, Integer> map4 = new HashMap<>();
        int i3 = oooo1.f33888OooOoo0;
        o0OoOo0 o0oooo1 = oooo1.f33865OooO0o;
        if (i3 != -1) {
            o0oooo1.f33907OooOOO0 = i3;
        }
        OooOo oooOo = oooo1.f33868OooO0oo;
        float f3 = oooOo.f33823OooO0Oo;
        OooOo oooOo2 = oooo1.f33860OooO;
        String str44 = "alpha";
        if (OooOo.OooO0OO(f3, oooOo2.f33823OooO0Oo)) {
            hashSet7.add("alpha");
        }
        String str45 = "elevation";
        if (OooOo.OooO0OO(oooOo.f33826OooO0oO, oooOo2.f33826OooO0oO)) {
            hashSet7.add("elevation");
        }
        int i4 = oooOo.f33824OooO0o;
        int i5 = oooOo2.f33824OooO0o;
        if (i4 != i5 && oooOo.f33825OooO0o0 == 0 && (i4 == 0 || i5 == 0)) {
            hashSet7.add("alpha");
        }
        String str46 = "rotation";
        if (OooOo.OooO0OO(oooOo.f33827OooO0oo, oooOo2.f33827OooO0oo)) {
            hashSet7.add("rotation");
        }
        if (!Float.isNaN(oooOo.f33835OooOOo) || !Float.isNaN(oooOo2.f33835OooOOo)) {
            hashSet7.add("transitionPathRotate");
        }
        String str47 = "progress";
        if (!Float.isNaN(oooOo.f33837OooOOoo) || !Float.isNaN(oooOo2.f33837OooOOoo)) {
            hashSet7.add("progress");
        }
        if (OooOo.OooO0OO(oooOo.f33822OooO, oooOo2.f33822OooO)) {
            hashSet7.add("rotationX");
        }
        if (OooOo.OooO0OO(oooOo.f33828OooOO0, oooOo2.f33828OooOO0)) {
            hashSet7.add("rotationY");
        }
        o0OoOo0 o0oooo2 = o0oooo1;
        if (OooOo.OooO0OO(oooOo.f33832OooOOO0, oooOo2.f33832OooOOO0)) {
            hashSet7.add("transformPivotX");
        }
        if (OooOo.OooO0OO(oooOo.f33831OooOOO, oooOo2.f33831OooOOO)) {
            hashSet7.add("transformPivotY");
        }
        String str48 = "scaleX";
        if (OooOo.OooO0OO(oooOo.f33829OooOO0O, oooOo2.f33829OooOO0O)) {
            hashSet7.add("scaleX");
        }
        Object obj21 = "rotationX";
        String str49 = "scaleY";
        if (OooOo.OooO0OO(oooOo.f33830OooOO0o, oooOo2.f33830OooOO0o)) {
            hashSet7.add("scaleY");
        }
        Object obj22 = "rotationY";
        if (OooOo.OooO0OO(oooOo.f33833OooOOOO, oooOo2.f33833OooOOOO)) {
            hashSet7.add("translationX");
        }
        Object obj23 = "translationX";
        String str50 = "translationY";
        if (OooOo.OooO0OO(oooOo.f33834OooOOOo, oooOo2.f33834OooOOOo)) {
            hashSet7.add("translationY");
        }
        String str51 = "translationZ";
        if (OooOo.OooO0OO(oooOo.f33836OooOOo0, oooOo2.f33836OooOOo0)) {
            hashSet7.add("translationZ");
        }
        ArrayList<OooO0o> arrayList6 = oooo1.f33883OooOo0o;
        ArrayList<o0OoOo0> arrayList7 = oooo1.f33880OooOo0;
        if (arrayList6 != null) {
            ArrayList arrayList8 = null;
            for (OooO0o oooO0o2 : arrayList6) {
                String str52 = str50;
                String str53 = str51;
                if (oooO0o2 instanceof OooOOO0) {
                    OooOOO0 oooOOO0 = (OooOOO0) oooO0o2;
                    str43 = str47;
                    str42 = str48;
                    o0OoOo0 o0oooo3 = new o0OoOo0(i, i2, oooOOO0, oooo1.f33865OooO0o, oooo1.f33867OooO0oO);
                    int iBinarySearch = Collections.binarySearch(arrayList7, o0oooo3);
                    if (iBinarySearch == 0) {
                        Log.e("MotionController", " KeyPath position \"" + o0oooo3.f33901OooO0oO + "\" outside of range");
                    }
                    arrayList7.add((-iBinarySearch) - 1, o0oooo3);
                    int i6 = oooOOO0.f33793OooO0o0;
                    if (i6 != -1) {
                        oooo1.f33866OooO0o0 = i6;
                    }
                } else {
                    str42 = str48;
                    str43 = str47;
                    str49 = str49;
                    if (oooO0o2 instanceof OooOO0) {
                        oooO0o2.OooO0Oo(hashSet8);
                    } else if (oooO0o2 instanceof OooOOOO) {
                        oooO0o2.OooO0Oo(hashSet6);
                    } else if (oooO0o2 instanceof OooOo00) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        ArrayList arrayList9 = arrayList8;
                        arrayList9.add((OooOo00) oooO0o2);
                        arrayList8 = arrayList9;
                    } else {
                        oooO0o2.OooO0o(map4);
                        oooO0o2.OooO0Oo(hashSet7);
                    }
                }
                str51 = str53;
                str50 = str52;
                str49 = str49;
                str47 = str43;
                str48 = str42;
            }
            str = str51;
            str2 = str48;
            str3 = str47;
            str4 = str49;
            str5 = str50;
            arrayList = arrayList8;
        } else {
            str = "translationZ";
            str2 = "scaleX";
            str3 = "progress";
            str4 = "scaleY";
            str5 = "translationY";
            arrayList = null;
        }
        if (arrayList != null) {
            oooo1.f33886OooOoOO = (OooOo00[]) arrayList.toArray(new OooOo00[0]);
        }
        String str54 = "waveOffset";
        String str55 = "CUSTOM,";
        if (hashSet7.isEmpty()) {
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            str6 = str;
            str7 = str4;
            str8 = str3;
            str9 = str2;
            str10 = "waveOffset";
            obj = obj23;
            obj2 = obj22;
            obj3 = obj21;
            str11 = str5;
            arrayList2 = arrayList7;
        } else {
            oooo1.f33885OooOoO0 = new HashMap<>();
            Iterator<String> it3 = hashSet7.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                if (next.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str56 = next.split(",")[1];
                    for (OooO0o oooO0o3 : arrayList6) {
                        HashSet<String> hashSet9 = hashSet8;
                        HashSet<String> hashSet10 = hashSet7;
                        HashMap<String, ConstraintAttribute> map5 = oooO0o3.f33770OooO0Oo;
                        if (map5 != null && (constraintAttribute3 = map5.get(str56)) != null) {
                            sparseArray.append(oooO0o3.f33767OooO00o, constraintAttribute3);
                        }
                        hashSet7 = hashSet10;
                        hashSet8 = hashSet9;
                    }
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    o000000.OooO0o.OooO0O0 oooO0O2 = new o000000.OooO0o.OooO0O0(next, sparseArray);
                    str = str;
                    str38 = str3;
                    str39 = str2;
                    str40 = str54;
                    str41 = str5;
                    arrayList5 = arrayList7;
                    oooO0o = oooO0O2;
                    str37 = str4;
                    obj18 = obj23;
                    obj19 = obj22;
                    obj20 = obj21;
                } else {
                    hashSet4 = hashSet7;
                    hashSet5 = hashSet8;
                    switch (next.hashCode()) {
                        case -1249320806:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj21 = obj21;
                            obj19 = obj22;
                            b12 = next.equals(obj21) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            Object obj24 = obj22;
                            if (next.equals(obj24)) {
                                obj19 = obj24;
                                obj21 = obj21;
                                b12 = 1;
                            } else {
                                obj19 = obj24;
                                obj21 = obj21;
                            }
                            break;
                        case -1225497657:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            Object obj25 = obj23;
                            if (next.equals(obj25)) {
                                obj18 = obj25;
                                b12 = 2;
                                obj19 = obj22;
                            } else {
                                obj18 = obj25;
                                obj19 = obj22;
                            }
                            break;
                        case -1225497656:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            str41 = str5;
                            if (next.equals(str41)) {
                                arrayList5 = arrayList7;
                                obj18 = obj23;
                                b12 = 3;
                                obj19 = obj22;
                            } else {
                                arrayList5 = arrayList7;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            break;
                        case -1225497655:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            if (next.equals(str)) {
                                str40 = str54;
                                obj18 = obj23;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                                obj19 = obj22;
                                b12 = 4;
                            } else {
                                str40 = str54;
                                obj18 = obj23;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj19 = obj22;
                            }
                            break;
                        case -1001078227:
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            obj18 = obj23;
                            if (next.equals(str38)) {
                                str = str;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                                b12 = 5;
                            } else {
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                            }
                            break;
                        case -908189618:
                            str37 = str4;
                            str39 = str2;
                            if (next.equals(str39)) {
                                obj18 = obj23;
                                str = str;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                                b12 = 6;
                                str38 = str3;
                            } else {
                                obj18 = obj23;
                                str38 = str3;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                            }
                            break;
                        case -908189617:
                            str37 = str4;
                            if (next.equals(str37)) {
                                obj18 = obj23;
                                str = str;
                                str38 = str3;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                                b12 = 7;
                                str39 = str2;
                            } else {
                                obj18 = obj23;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                obj19 = obj22;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                obj21 = obj21;
                            }
                            break;
                        case -797520672:
                            if (next.equals("waveVariesBy")) {
                                b13 = 8;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b12 = b13;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case -760884510:
                            if (next.equals("transformPivotX")) {
                                b13 = 9;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b12 = b13;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case -760884509:
                            if (next.equals("transformPivotY")) {
                                b13 = 10;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b12 = b13;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case -40300674:
                            if (next.equals("rotation")) {
                                b13 = 11;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b12 = b13;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                b13 = 12;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b12 = b13;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                b13 = 13;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b12 = b13;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                b13 = 14;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b12 = b13;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        case 156108012:
                            if (next.equals(str54)) {
                                b13 = 15;
                                str = str;
                                str38 = str3;
                                str39 = str2;
                                str40 = str54;
                                str41 = str5;
                                arrayList5 = arrayList7;
                                b12 = b13;
                                str37 = str4;
                                obj18 = obj23;
                                obj19 = obj22;
                            }
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                        default:
                            str = str;
                            str37 = str4;
                            str38 = str3;
                            str39 = str2;
                            str40 = str54;
                            obj18 = obj23;
                            str41 = str5;
                            arrayList5 = arrayList7;
                            obj19 = obj22;
                            break;
                    }
                    switch (b12) {
                        case 0:
                            oooOOO = new o000000.OooO0o.OooOOO();
                            break;
                        case 1:
                            oooOOO = new o000000.OooO0o.OooOOOO();
                            break;
                        case 2:
                            oooOOO = new o000000.OooO0o.Oooo000();
                            break;
                        case 3:
                            oooOOO = new o000000.OooO0o.Oooo0();
                            break;
                        case 4:
                            oooOOO = new o000000.OooO0o.o000oOoO();
                            break;
                        case 5:
                            oooOOO = new o000000.OooO0o.OooOO0O();
                            break;
                        case 6:
                            oooOOO = new o000000.OooO0o.OooOo00();
                            break;
                        case 7:
                            oooOOO = new o000000.OooO0o.OooOo();
                            break;
                        case 8:
                            oooOOO = new o000000.OooO0o.OooO00o();
                            break;
                        case 9:
                            oooOOO = new o000000.OooO0o.OooO();
                            break;
                        case 10:
                            oooOOO = new o000000.OooO0o.OooOO0();
                            break;
                        case 11:
                            oooOOO = new o000000.OooO0o.OooOOO0();
                            break;
                        case 12:
                            oooOOO = new o000000.OooO0o.OooO0OO();
                            break;
                        case 13:
                            oooOOO = new o000000.OooO0o.C0391OooO0o();
                            break;
                        case 14:
                            oooOOO = new o000000.OooO0o.OooO00o();
                            break;
                        case 15:
                            oooOOO = new o000000.OooO0o.OooO00o();
                            break;
                        default:
                            oooOOO = null;
                            break;
                    }
                    obj20 = obj21;
                    oooO0o = oooOOO;
                }
                if (oooO0o != null) {
                    oooO0o.f45348OooO0o0 = next;
                    oooo1.f33885OooOoO0.put(next, oooO0o);
                }
                str2 = str39;
                str3 = str38;
                str54 = str40;
                arrayList7 = arrayList5;
                it3 = it3;
                hashSet8 = hashSet5;
                str = str;
                str5 = str41;
                obj21 = obj20;
                obj22 = obj19;
                obj23 = obj18;
                str4 = str37;
                hashSet7 = hashSet4;
            }
            hashSet = hashSet7;
            hashSet2 = hashSet8;
            str6 = str;
            str7 = str4;
            str8 = str3;
            str9 = str2;
            str10 = str54;
            obj = obj23;
            obj2 = obj22;
            obj3 = obj21;
            str11 = str5;
            arrayList2 = arrayList7;
            if (arrayList6 != null) {
                for (OooO0o oooO0o4 : arrayList6) {
                    if (oooO0o4 instanceof OooO) {
                        oooO0o4.OooO00o(oooo1.f33885OooOoO0);
                    }
                }
            }
            oooo1.f33868OooO0oo.OooO00o(0, oooo1.f33885OooOoO0);
            oooo1.f33860OooO.OooO00o(100, oooo1.f33885OooOoO0);
            Iterator<String> it4 = oooo1.f33885OooOoO0.keySet().iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                int iIntValue = (!map4.containsKey(next2) || (num = map4.get(next2)) == null) ? 0 : num.intValue();
                Iterator<String> it5 = it4;
                o000000.OooO0o oooO0o5 = oooo1.f33885OooOoO0.get(next2);
                if (oooO0o5 != null) {
                    oooO0o5.OooO0OO(iIntValue);
                }
                it4 = it5;
            }
        }
        String str57 = "CUSTOM";
        if (hashSet6.isEmpty()) {
            arrayList3 = arrayList6;
            str12 = "CUSTOM";
            str13 = "CUSTOM,";
            str14 = str11;
            obj4 = obj3;
            obj5 = obj2;
            obj6 = obj;
            String str58 = str9;
            oooo0 = oooo1;
            str15 = str58;
        } else {
            if (oooo1.f33879OooOo == null) {
                oooo1.f33879OooOo = new HashMap<>();
            }
            Iterator<String> it6 = hashSet6.iterator();
            while (it6.hasNext()) {
                String next3 = it6.next();
                if (!oooo1.f33879OooOo.containsKey(next3)) {
                    if (!next3.startsWith(str55)) {
                        it2 = it6;
                        map3 = map4;
                        str35 = str55;
                        switch (next3.hashCode()) {
                            case -1249320806:
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                b10 = next3.equals(obj14) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                str36 = str11;
                                obj15 = obj2;
                                obj16 = obj;
                                if (next3.equals(obj15)) {
                                    b10 = 1;
                                    obj14 = obj3;
                                } else {
                                    obj14 = obj3;
                                }
                                break;
                            case -1225497657:
                                str36 = str11;
                                obj16 = obj;
                                if (next3.equals(obj16)) {
                                    b10 = 2;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                } else {
                                    obj14 = obj3;
                                    obj15 = obj2;
                                }
                                break;
                            case -1225497656:
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                if (next3.equals(str36)) {
                                    obj16 = obj;
                                    b10 = 3;
                                } else {
                                    obj16 = obj;
                                }
                                break;
                            case -1225497655:
                                if (next3.equals(str6)) {
                                    str36 = str11;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    b10 = 4;
                                } else {
                                    str36 = str11;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                }
                                break;
                            case -1001078227:
                                if (next3.equals(str8)) {
                                    b11 = 5;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str59 = str11;
                                    b10 = b11;
                                    str36 = str59;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case -908189618:
                                if (next3.equals(str9)) {
                                    b11 = 6;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str510 = str11;
                                    b10 = b11;
                                    str36 = str510;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case -908189617:
                                if (next3.equals(str7)) {
                                    b11 = 7;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str511 = str11;
                                    b10 = b11;
                                    str36 = str511;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case -40300674:
                                if (next3.equals("rotation")) {
                                    b11 = 8;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str512 = str11;
                                    b10 = b11;
                                    str36 = str512;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case -4379043:
                                if (next3.equals("elevation")) {
                                    b11 = 9;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str513 = str11;
                                    b10 = b11;
                                    str36 = str513;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case 37232917:
                                if (next3.equals("transitionPathRotate")) {
                                    b11 = 10;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str514 = str11;
                                    b10 = b11;
                                    str36 = str514;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            case 92909918:
                                if (next3.equals("alpha")) {
                                    b11 = 11;
                                    obj14 = obj3;
                                    obj15 = obj2;
                                    obj16 = obj;
                                    String str515 = str11;
                                    b10 = b11;
                                    str36 = str515;
                                }
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                            default:
                                str36 = str11;
                                obj14 = obj3;
                                obj15 = obj2;
                                obj16 = obj;
                                break;
                        }
                        switch (b10) {
                            case 0:
                                oooOO0O2 = new o000000.OooO.OooOO0O();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 1:
                                oooOO0O2 = new o000000.OooO.OooOOO0();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 2:
                                oooOO0O2 = new o000000.OooO.OooOo00();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 3:
                                oooOO0O2 = new o000000.OooO.OooOo();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 4:
                                oooOO0O2 = new o000000.OooO.Oooo000();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 5:
                                oooOO0O2 = new o000000.OooO.C0388OooO();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 6:
                                oooOO0O2 = new o000000.OooO.OooOOO();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 7:
                                oooOO0O2 = new o000000.OooO.OooOOOO();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 8:
                                oooOO0O2 = new o000000.OooO.OooOO0();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 9:
                                oooOO0O2 = new o000000.OooO.OooO0OO();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 10:
                                oooOO0O2 = new o000000.OooO.OooO0o();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            case 11:
                                oooOO0O2 = new o000000.OooO.OooO00o();
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = oooOO0O2;
                                oooO0O1.f45324OooO = j;
                                break;
                            default:
                                obj17 = obj16;
                                obj3 = obj14;
                                oooO0O1 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        it2 = it6;
                        String str60 = next3.split(",")[1];
                        for (OooO0o oooO0o6 : arrayList6) {
                            String str61 = str55;
                            HashMap<String, Integer> map6 = map4;
                            HashMap<String, ConstraintAttribute> map7 = oooO0o6.f33770OooO0Oo;
                            if (map7 != null && (constraintAttribute2 = map7.get(str60)) != null) {
                                sparseArray2.append(oooO0o6.f33767OooO00o, constraintAttribute2);
                            }
                            map4 = map6;
                            str55 = str61;
                        }
                        map3 = map4;
                        str35 = str55;
                        oooO0O1 = new o000000.OooO.OooO0O0(next3, sparseArray2);
                        str36 = str11;
                        obj15 = obj2;
                        obj17 = obj;
                    }
                    if (oooO0O1 != null) {
                        oooO0O1.f45329OooO0o = next3;
                        oooo1.f33879OooOo.put(next3, oooO0O1);
                    }
                    str9 = str9;
                    obj = obj17;
                    map4 = map3;
                    str11 = str36;
                    obj2 = obj15;
                    it6 = it2;
                    str55 = str35;
                }
            }
            HashMap<String, Integer> map8 = map4;
            str13 = str55;
            str14 = str11;
            Object obj26 = obj2;
            Object obj27 = obj;
            String str62 = str9;
            if (arrayList6 != null) {
                Iterator<OooO0o> it7 = arrayList6.iterator();
                while (it7.hasNext()) {
                    OooO0o next4 = it7.next();
                    if (next4 instanceof OooOOOO) {
                        OooOOOO oooOOOO2 = (OooOOOO) next4;
                        HashMap<String, o000000.OooO> map9 = oooo1.f33879OooOo;
                        oooOOOO2.getClass();
                        Iterator<String> it8 = map9.keySet().iterator();
                        while (it8.hasNext()) {
                            it7 = it7;
                            String next5 = it8.next();
                            o000000.OooO oooO = map9.get(next5);
                            if (oooO == null) {
                                arrayList4 = arrayList6;
                                map2 = map9;
                                str33 = str57;
                                it = it8;
                                str34 = str62;
                                obj10 = obj3;
                                oooOOOO = oooOOOO2;
                                obj11 = obj26;
                                obj12 = obj27;
                            } else if (!next5.startsWith(str57)) {
                                OooOOOO oooOOOO3 = oooOOOO2;
                                arrayList4 = arrayList6;
                                map2 = map9;
                                str33 = str57;
                                it = it8;
                                switch (next5.hashCode()) {
                                    case -1249320806:
                                        str34 = str62;
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        b7 = next5.equals(obj13) ? (byte) 0 : (byte) -1;
                                        break;
                                    case -1249320805:
                                        str34 = str62;
                                        obj12 = obj27;
                                        if (next5.equals(obj26)) {
                                            b8 = 1;
                                            b7 = b8;
                                            obj13 = obj3;
                                        }
                                        obj13 = obj3;
                                        break;
                                    case -1225497657:
                                        str34 = str62;
                                        obj12 = obj27;
                                        if (next5.equals(obj12)) {
                                            b8 = 2;
                                            b7 = b8;
                                            obj13 = obj3;
                                        }
                                        obj13 = obj3;
                                        break;
                                    case -1225497656:
                                        str34 = str62;
                                        if (next5.equals(str14)) {
                                            b9 = 3;
                                            b7 = b9;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                    case -1225497655:
                                        str34 = str62;
                                        if (next5.equals(str6)) {
                                            b9 = 4;
                                            b7 = b9;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                    case -1001078227:
                                        str34 = str62;
                                        if (next5.equals(str8)) {
                                            b9 = 5;
                                            b7 = b9;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                    case -908189618:
                                        str34 = str62;
                                        if (next5.equals(str34)) {
                                            b9 = 6;
                                            b7 = b9;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                    case -908189617:
                                        if (next5.equals(str7)) {
                                            b7 = 7;
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    case -40300674:
                                        if (next5.equals("rotation")) {
                                            str34 = str62;
                                            b9 = 8;
                                            b7 = b9;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    case -4379043:
                                        if (next5.equals("elevation")) {
                                            str34 = str62;
                                            b9 = 9;
                                            b7 = b9;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    case 37232917:
                                        if (next5.equals("transitionPathRotate")) {
                                            str34 = str62;
                                            b9 = 10;
                                            b7 = b9;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    case 92909918:
                                        if (next5.equals("alpha")) {
                                            str34 = str62;
                                            b9 = 11;
                                            b7 = b9;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        } else {
                                            str34 = str62;
                                            obj13 = obj3;
                                            obj12 = obj27;
                                        }
                                        break;
                                    default:
                                        str34 = str62;
                                        obj13 = obj3;
                                        obj12 = obj27;
                                        break;
                                }
                                switch (b7) {
                                    case 0:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33805OooO)) {
                                            oooO.OooO0O0(oooOOOO.f33805OooO, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 1:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33810OooOO0)) {
                                            oooO.OooO0O0(oooOOOO.f33810OooOO0, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 2:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33813OooOOO)) {
                                            oooO.OooO0O0(oooOOOO.f33813OooOOO, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 3:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33815OooOOOO)) {
                                            oooO.OooO0O0(oooOOOO.f33815OooOOOO, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 4:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33816OooOOOo)) {
                                            oooO.OooO0O0(oooOOOO.f33816OooOOOo, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 5:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33818OooOOo0)) {
                                            oooO.OooO0O0(oooOOOO.f33818OooOOo0, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 6:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33812OooOO0o)) {
                                            oooO.OooO0O0(oooOOOO.f33812OooOO0o, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 7:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33814OooOOO0)) {
                                            oooO.OooO0O0(oooOOOO.f33814OooOOO0, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 8:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33809OooO0oo)) {
                                            oooO.OooO0O0(oooOOOO.f33809OooO0oo, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 9:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33808OooO0oO)) {
                                            oooO.OooO0O0(oooOOOO.f33808OooO0oO, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 10:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        if (!Float.isNaN(oooOOOO.f33811OooOO0O)) {
                                            oooO.OooO0O0(oooOOOO.f33811OooOO0O, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    case 11:
                                        oooOOOO = oooOOOO3;
                                        if (Float.isNaN(oooOOOO.f33806OooO0o)) {
                                            obj10 = obj13;
                                            obj11 = obj26;
                                        } else {
                                            obj10 = obj13;
                                            obj11 = obj26;
                                            oooO.OooO0O0(oooOOOO.f33806OooO0o, oooOOOO.f33819OooOOoo, oooOOOO.f33820OooOo00, oooOOOO.f33767OooO00o, oooOOOO.f33817OooOOo);
                                        }
                                        break;
                                    default:
                                        obj10 = obj13;
                                        obj11 = obj26;
                                        oooOOOO = oooOOOO3;
                                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next5 + "\"");
                                        break;
                                }
                            } else {
                                HashMap<String, o000000.OooO> map10 = map9;
                                ConstraintAttribute constraintAttribute4 = oooOOOO2.f33770OooO0Oo.get(next5.substring(7));
                                if (constraintAttribute4 != null) {
                                    o000000.OooO.OooO0O0 oooO0O3 = (o000000.OooO.OooO0O0) oooO;
                                    Iterator<String> it9 = it8;
                                    int i7 = oooOOOO2.f33767OooO00o;
                                    String str63 = str57;
                                    float f4 = oooOOOO2.f33819OooOOoo;
                                    ArrayList<OooO0o> arrayList10 = arrayList6;
                                    int i8 = oooOOOO2.f33817OooOOo;
                                    float f5 = oooOOOO2.f33820OooOo00;
                                    oooO0O3.f33737OooOO0o.append(i7, constraintAttribute4);
                                    oooO0O3.f33739OooOOO0.append(i7, new float[]{f4, f5});
                                    oooO0O3.f45326OooO0O0 = Math.max(oooO0O3.f45326OooO0O0, i8);
                                    it8 = it9;
                                    map9 = map10;
                                    str57 = str63;
                                    arrayList6 = arrayList10;
                                    oooOOOO2 = oooOOOO2;
                                } else {
                                    map9 = map10;
                                }
                            }
                            it8 = it;
                            obj27 = obj12;
                            oooOOOO2 = oooOOOO;
                            obj26 = obj11;
                            map9 = map2;
                            str57 = str33;
                            arrayList6 = arrayList4;
                            obj3 = obj10;
                            str62 = str34;
                        }
                    }
                    it7 = it7;
                    obj27 = obj27;
                    obj26 = obj26;
                    str57 = str57;
                    arrayList6 = arrayList6;
                    obj3 = obj3;
                    str62 = str62;
                    oooo1 = this;
                }
            }
            arrayList3 = arrayList6;
            str12 = str57;
            str15 = str62;
            obj4 = obj3;
            obj6 = obj27;
            obj5 = obj26;
            oooo0 = this;
            for (String str64 : oooo0.f33879OooOo.keySet()) {
                HashMap<String, Integer> map11 = map8;
                oooo0.f33879OooOo.get(str64).OooO0OO(map11.containsKey(str64) ? map11.get(str64).intValue() : 0);
                map8 = map11;
            }
        }
        int size = arrayList2.size() + 2;
        o0OoOo0[] o0oooo0Arr = new o0OoOo0[size];
        o0oooo0Arr[0] = o0oooo2;
        o0oooo0Arr[size - 1] = oooo0.f33867OooO0oO;
        if (arrayList2.size() > 0 && oooo0.f33866OooO0o0 == -1) {
            oooo0.f33866OooO0o0 = 0;
        }
        Iterator<o0OoOo0> it10 = arrayList2.iterator();
        int i9 = 1;
        while (it10.hasNext()) {
            o0oooo0Arr[i9] = it10.next();
            i9++;
        }
        HashSet hashSet11 = new HashSet();
        Iterator<String> it11 = oooo0.f33867OooO0oO.f33911OooOOo0.keySet().iterator();
        while (it11.hasNext()) {
            String next6 = it11.next();
            Object obj28 = obj6;
            Iterator<String> it12 = it11;
            o0OoOo0 o0oooo4 = o0oooo2;
            if (o0oooo4.f33911OooOOo0.containsKey(next6)) {
                o0oooo2 = o0oooo4;
                hashSet3 = hashSet;
                if (!hashSet3.contains(str13 + next6)) {
                    hashSet11.add(next6);
                }
            } else {
                o0oooo2 = o0oooo4;
                hashSet3 = hashSet;
            }
            hashSet = hashSet3;
            obj6 = obj28;
            it11 = it12;
        }
        Object obj29 = obj6;
        String[] strArr = (String[]) hashSet11.toArray(new String[0]);
        oooo0.f33876OooOOo = strArr;
        oooo0.f33878OooOOoo = new int[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = oooo0.f33876OooOOo;
            if (i10 < strArr2.length) {
                String str65 = strArr2[i10];
                oooo0.f33878OooOOoo[i10] = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    if (o0oooo0Arr[i11].f33911OooOOo0.containsKey(str65) && (constraintAttribute = o0oooo0Arr[i11].f33911OooOOo0.get(str65)) != null) {
                        int[] iArr = oooo0.f33878OooOOoo;
                        iArr[i10] = constraintAttribute.OooO0OO() + iArr[i10];
                        break;
                    }
                }
                i10++;
            } else {
                boolean z = o0oooo0Arr[0].f33907OooOOO0 != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i12 = 1;
                while (i12 < size) {
                    String str66 = str14;
                    o0OoOo0 o0oooo5 = o0oooo0Arr[i12];
                    String str67 = str6;
                    o0OoOo0 o0oooo6 = o0oooo0Arr[i12 - 1];
                    String str68 = str15;
                    boolean zOooO0O0 = o0OoOo0.OooO0O0(o0oooo5.f33902OooO0oo, o0oooo6.f33902OooO0oo);
                    String str69 = str7;
                    boolean zOooO0O1 = o0OoOo0.OooO0O0(o0oooo5.f33897OooO, o0oooo6.f33897OooO);
                    zArr[0] = zArr[0] | o0OoOo0.OooO0O0(o0oooo5.f33901OooO0oO, o0oooo6.f33901OooO0oO);
                    boolean z2 = zOooO0O0 | zOooO0O1 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | o0OoOo0.OooO0O0(o0oooo5.f33903OooOO0, o0oooo6.f33903OooOO0);
                    zArr[4] = zArr[4] | o0OoOo0.OooO0O0(o0oooo5.f33904OooOO0O, o0oooo6.f33904OooOO0O);
                    i12++;
                    str14 = str66;
                    str8 = str8;
                    str6 = str67;
                    str15 = str68;
                    str7 = str69;
                    str46 = str46;
                    str45 = str45;
                }
                String str70 = str15;
                String str71 = str14;
                String str72 = str7;
                String str73 = str8;
                String str74 = str45;
                String str75 = str46;
                String str76 = str6;
                int i13 = 0;
                for (int i14 = 1; i14 < length; i14++) {
                    if (zArr[i14]) {
                        i13++;
                    }
                }
                oooo0.f33874OooOOOO = new int[i13];
                int iMax = Math.max(2, i13);
                oooo0.f33875OooOOOo = new double[iMax];
                oooo0.f33877OooOOo0 = new double[iMax];
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        oooo0.f33874OooOOOO[i15] = i16;
                        i15++;
                    }
                }
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, oooo0.f33874OooOOOO.length);
                double[] dArr2 = new double[size];
                for (int i17 = 0; i17 < size; i17++) {
                    o0OoOo0 o0oooo7 = o0oooo0Arr[i17];
                    double[] dArr3 = dArr[i17];
                    int[] iArr2 = oooo0.f33874OooOOOO;
                    float[] fArr = {o0oooo7.f33901OooO0oO, o0oooo7.f33902OooO0oo, o0oooo7.f33897OooO, o0oooo7.f33903OooOO0, o0oooo7.f33904OooOO0O, o0oooo7.f33905OooOO0o};
                    int i18 = 0;
                    for (int i19 : iArr2) {
                        if (i19 < 6) {
                            dArr3[i18] = fArr[i19];
                            i18++;
                        }
                    }
                    dArr2[i17] = o0oooo0Arr[i17].f33899OooO0o;
                }
                int i20 = 0;
                while (true) {
                    int[] iArr3 = oooo0.f33874OooOOOO;
                    if (i20 < iArr3.length) {
                        if (iArr3[i20] < 6) {
                            String strOooO0O0 = o0O00o0.OooO0O0(new StringBuilder(), o0OoOo0.f33896OooOo0[oooo0.f33874OooOOOO[i20]], " [");
                            for (int i21 = 0; i21 < size; i21++) {
                                StringBuilder sbOooO00o = o00OO.OooO00o(strOooO0O0);
                                sbOooO00o.append(dArr[i21][i20]);
                                strOooO0O0 = sbOooO00o.toString();
                            }
                        }
                        i20++;
                    } else {
                        oooo0.f33869OooOO0 = new p413o0Oo0oo.Oooo000[oooo0.f33876OooOOo.length + 1];
                        int i22 = 0;
                        while (true) {
                            String[] strArr3 = oooo0.f33876OooOOo;
                            if (i22 >= strArr3.length) {
                                String str77 = str44;
                                oooo0.f33869OooOO0[0] = p413o0Oo0oo.Oooo000.OooO00o(oooo0.f33866OooO0o0, dArr2, dArr);
                                if (o0oooo0Arr[0].f33907OooOOO0 != -1) {
                                    int[] iArr4 = new int[size];
                                    double[] dArr4 = new double[size];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
                                    for (int i23 = 0; i23 < size; i23++) {
                                        o0OoOo0 o0oooo8 = o0oooo0Arr[i23];
                                        iArr4[i23] = o0oooo8.f33907OooOOO0;
                                        dArr4[i23] = o0oooo8.f33899OooO0o;
                                        double[] dArr6 = dArr5[i23];
                                        dArr6[0] = o0oooo8.f33902OooO0oo;
                                        dArr6[1] = o0oooo8.f33897OooO;
                                    }
                                    oooo0.f33870OooOO0O = new p413o0Oo0oo.OooOo(iArr4, dArr4, dArr5);
                                }
                                oooo0.f33884OooOoO = new HashMap<>();
                                if (arrayList3 != null) {
                                    Iterator<String> it13 = hashSet2.iterator();
                                    float f6 = Float.NaN;
                                    while (it13.hasNext()) {
                                        String next7 = it13.next();
                                        str12 = str12;
                                        if (!next7.startsWith(str12)) {
                                            switch (next7.hashCode()) {
                                                case -1249320806:
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    obj5 = obj5;
                                                    b4 = next7.equals(obj4) ? (byte) 0 : (byte) -1;
                                                    break;
                                                case -1249320805:
                                                    it13 = it13;
                                                    Object obj30 = obj5;
                                                    obj29 = obj29;
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(obj30)) {
                                                        obj5 = obj30;
                                                        obj4 = obj4;
                                                        b4 = 1;
                                                    } else {
                                                        obj5 = obj30;
                                                        obj4 = obj4;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    obj29 = obj29;
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(obj29)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        b4 = 2;
                                                        obj5 = obj5;
                                                    } else {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -1225497656:
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    if (next7.equals(str25)) {
                                                        obj29 = obj29;
                                                        b4 = 3;
                                                        obj5 = obj5;
                                                    } else {
                                                        obj29 = obj29;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -1225497655:
                                                    str10 = str10;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    if (next7.equals(str76)) {
                                                        str25 = str71;
                                                        b4 = 4;
                                                        obj5 = obj5;
                                                    } else {
                                                        str25 = str71;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -1001078227:
                                                    str10 = str10;
                                                    str73 = str73;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(str73)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        b4 = 5;
                                                        str76 = str76;
                                                        obj5 = obj5;
                                                    }
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str76 = str76;
                                                    obj5 = obj5;
                                                    break;
                                                case -908189618:
                                                    str10 = str10;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(str26)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str76 = str76;
                                                        b4 = 6;
                                                        obj5 = obj5;
                                                        str73 = str73;
                                                    } else {
                                                        str73 = str73;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str76 = str76;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -908189617:
                                                    str10 = str10;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(str27)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        b4 = 7;
                                                        obj5 = obj5;
                                                        str26 = str70;
                                                    } else {
                                                        str26 = str70;
                                                        str73 = str73;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str76 = str76;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case -797520672:
                                                    str10 = str10;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals("waveVariesBy")) {
                                                        b5 = 8;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        b4 = b5;
                                                        obj5 = obj5;
                                                        str27 = str72;
                                                    }
                                                    str27 = str72;
                                                    str26 = str70;
                                                    str73 = str73;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str76 = str76;
                                                    obj5 = obj5;
                                                    break;
                                                case -40300674:
                                                    str10 = str10;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    if (next7.equals(str28)) {
                                                        b5 = 9;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        b4 = b5;
                                                        obj5 = obj5;
                                                        str27 = str72;
                                                    }
                                                    str27 = str72;
                                                    str26 = str70;
                                                    str73 = str73;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str76 = str76;
                                                    obj5 = obj5;
                                                    break;
                                                case -4379043:
                                                    str10 = str10;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    if (next7.equals(str74)) {
                                                        str28 = str75;
                                                        b4 = 10;
                                                        obj5 = obj5;
                                                    } else {
                                                        str28 = str75;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                case 37232917:
                                                    str10 = str10;
                                                    str77 = str77;
                                                    if (next7.equals("transitionPathRotate")) {
                                                        b6 = 11;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        str27 = str72;
                                                        str28 = str75;
                                                        b4 = b6;
                                                        obj5 = obj5;
                                                        str74 = str74;
                                                    }
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    obj5 = obj5;
                                                    break;
                                                case 92909918:
                                                    str10 = str10;
                                                    str77 = str77;
                                                    if (next7.equals(str77)) {
                                                        b6 = 12;
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        str27 = str72;
                                                        str28 = str75;
                                                        b4 = b6;
                                                        obj5 = obj5;
                                                        str74 = str74;
                                                    }
                                                    it13 = it13;
                                                    obj4 = obj4;
                                                    obj29 = obj29;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    obj5 = obj5;
                                                    break;
                                                case 156108012:
                                                    str10 = str10;
                                                    if (next7.equals(str10)) {
                                                        it13 = it13;
                                                        obj4 = obj4;
                                                        obj29 = obj29;
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        str27 = str72;
                                                        str28 = str75;
                                                        str74 = str74;
                                                        b4 = 13;
                                                        obj5 = obj5;
                                                        str77 = str77;
                                                    } else {
                                                        str25 = str71;
                                                        str73 = str73;
                                                        str76 = str76;
                                                        str26 = str70;
                                                        str27 = str72;
                                                        str28 = str75;
                                                        str74 = str74;
                                                        str77 = str77;
                                                        obj5 = obj5;
                                                    }
                                                    break;
                                                default:
                                                    str10 = str10;
                                                    str25 = str71;
                                                    str73 = str73;
                                                    str76 = str76;
                                                    str26 = str70;
                                                    str27 = str72;
                                                    str28 = str75;
                                                    str74 = str74;
                                                    str77 = str77;
                                                    obj5 = obj5;
                                                    break;
                                            }
                                            switch (b4) {
                                                case 0:
                                                    oooOO0O = new o000000.OooO0OO.OooOO0O();
                                                    o000000.OooO0OO oooO0OO2 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO2;
                                                    break;
                                                case 1:
                                                    oooOO0O = new o000000.OooO0OO.OooOOO0();
                                                    o000000.OooO0OO oooO0OO3 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO3;
                                                    break;
                                                case 2:
                                                    oooOO0O = new o000000.OooO0OO.OooOo00();
                                                    o000000.OooO0OO oooO0OO4 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO4;
                                                    break;
                                                case 3:
                                                    oooOO0O = new o000000.OooO0OO.OooOo();
                                                    o000000.OooO0OO oooO0OO5 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO5;
                                                    break;
                                                case 4:
                                                    oooOO0O = new o000000.OooO0OO.Oooo000();
                                                    o000000.OooO0OO oooO0OO6 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO6;
                                                    break;
                                                case 5:
                                                    oooOO0O = new o000000.OooO0OO.OooO();
                                                    o000000.OooO0OO oooO0OO7 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO7;
                                                    break;
                                                case 6:
                                                    oooOO0O = new o000000.OooO0OO.OooOOO();
                                                    o000000.OooO0OO oooO0OO8 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO8;
                                                    break;
                                                case 7:
                                                    oooOO0O = new o000000.OooO0OO.OooOOOO();
                                                    o000000.OooO0OO oooO0OO9 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO9;
                                                    break;
                                                case 8:
                                                    oooOO0O = new o000000.OooO0OO.OooO00o();
                                                    o000000.OooO0OO oooO0OO10 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO10;
                                                    break;
                                                case 9:
                                                    oooOO0O = new o000000.OooO0OO.OooOO0();
                                                    o000000.OooO0OO oooO0OO11 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO11;
                                                    break;
                                                case 10:
                                                    oooOO0O = new o000000.OooO0OO.C0390OooO0OO();
                                                    o000000.OooO0OO oooO0OO12 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO12;
                                                    break;
                                                case 11:
                                                    oooOO0O = new o000000.OooO0OO.OooO0o();
                                                    o000000.OooO0OO oooO0OO13 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO13;
                                                    break;
                                                case 12:
                                                    oooOO0O = new o000000.OooO0OO.OooO00o();
                                                    o000000.OooO0OO oooO0OO14 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO14;
                                                    break;
                                                case 13:
                                                    oooOO0O = new o000000.OooO0OO.OooO00o();
                                                    o000000.OooO0OO oooO0OO15 = oooOO0O;
                                                    obj4 = obj4;
                                                    oooO0O0 = oooO0OO15;
                                                    break;
                                                default:
                                                    obj4 = obj4;
                                                    oooO0O0 = null;
                                                    break;
                                            }
                                        } else {
                                            it13 = it13;
                                            oooO0O0 = new o000000.OooO0OO.OooO0O0();
                                            obj29 = obj29;
                                            str10 = str10;
                                            str25 = str71;
                                            str73 = str73;
                                            str76 = str76;
                                            str26 = str70;
                                            str27 = str72;
                                            str28 = str75;
                                            str74 = str74;
                                            str77 = str77;
                                            obj5 = obj5;
                                        }
                                        if (oooO0O0 == null) {
                                            str75 = str28;
                                            str72 = str27;
                                            str70 = str26;
                                            str71 = str25;
                                            obj29 = obj29;
                                        } else {
                                            Object obj31 = obj29;
                                            String str78 = str25;
                                            if ((oooO0O0.f45300OooO0o0 == 1) && Float.isNaN(f6)) {
                                                float[] fArr2 = new float[2];
                                                float f7 = 1.0f / 99;
                                                float fHypot = 0.0f;
                                                double d = 0.0d;
                                                double d2 = 0.0d;
                                                int i24 = 0;
                                                while (i24 < 100) {
                                                    float f8 = i24 * f7;
                                                    String str79 = str27;
                                                    String str80 = str26;
                                                    double d3 = f8;
                                                    o0OoOo0 o0oooo9 = o0oooo2;
                                                    p413o0Oo0oo.Oooo0 oooo2 = o0oooo9.f33898OooO0Oo;
                                                    float f9 = 0.0f;
                                                    float f10 = Float.NaN;
                                                    for (o0OoOo0 o0oooo10 : arrayList2) {
                                                        o0OoOo0 o0oooo11 = o0oooo9;
                                                        float f11 = f7;
                                                        p413o0Oo0oo.Oooo0 oooo3 = o0oooo10.f33898OooO0Oo;
                                                        if (oooo3 != null) {
                                                            float f12 = o0oooo10.f33899OooO0o;
                                                            if (f12 < f8) {
                                                                f9 = f12;
                                                                oooo2 = oooo3;
                                                            } else if (Float.isNaN(f10)) {
                                                                f10 = o0oooo10.f33899OooO0o;
                                                            }
                                                        }
                                                        o0oooo9 = o0oooo11;
                                                        f7 = f11;
                                                    }
                                                    o0OoOo0 o0oooo12 = o0oooo9;
                                                    float f13 = f7;
                                                    if (oooo2 != null) {
                                                        if (Float.isNaN(f10)) {
                                                            f10 = 1.0f;
                                                        }
                                                        float f14 = f10 - f9;
                                                        dOooO00o = (((float) oooo2.OooO00o((f8 - f9) / f14)) * f14) + f9;
                                                    } else {
                                                        dOooO00o = d3;
                                                    }
                                                    oooo0.f33869OooOO0[0].OooO0OO(dOooO00o, oooo0.f33875OooOOOo);
                                                    String str81 = str28;
                                                    oooo0.f33865OooO0o.OooO0OO(dOooO00o, oooo0.f33874OooOOOO, oooo0.f33875OooOOOo, fArr2, 0);
                                                    if (i24 > 0) {
                                                        fHypot = (float) (Math.hypot(d - ((double) fArr2[1]), d2 - ((double) fArr2[0])) + ((double) fHypot));
                                                    }
                                                    i24++;
                                                    d2 = fArr2[0];
                                                    d = fArr2[1];
                                                    str28 = str81;
                                                    str26 = str80;
                                                    o0oooo2 = o0oooo12;
                                                    f7 = f13;
                                                    str27 = str79;
                                                }
                                                str29 = str27;
                                                str30 = str26;
                                                o0oooo0 = o0oooo2;
                                                str31 = str28;
                                                f6 = fHypot;
                                            } else {
                                                str29 = str27;
                                                str30 = str26;
                                                o0oooo0 = o0oooo2;
                                                str31 = str28;
                                            }
                                            oooO0O0.f45296OooO0O0 = next7;
                                            oooo0.f33884OooOoO.put(next7, oooO0O0);
                                            str72 = str29;
                                            str75 = str31;
                                            str70 = str30;
                                            o0oooo2 = o0oooo0;
                                            str71 = str78;
                                            obj29 = obj31;
                                        }
                                    }
                                    String str82 = str10;
                                    String str83 = str12;
                                    String str84 = str73;
                                    String str85 = str76;
                                    String str86 = str70;
                                    String str87 = str72;
                                    String str88 = str75;
                                    String str89 = str74;
                                    String str90 = str77;
                                    Object obj32 = obj29;
                                    Object obj33 = obj5;
                                    String str91 = str71;
                                    Object obj34 = obj32;
                                    Iterator<OooO0o> it14 = arrayList3.iterator();
                                    while (it14.hasNext()) {
                                        OooO0o next8 = it14.next();
                                        if (next8 instanceof OooOO0) {
                                            OooOO0 oooOO1 = (OooOO0) next8;
                                            HashMap<String, o000000.OooO0OO> map12 = oooo0.f33884OooOoO;
                                            oooOO1.getClass();
                                            Iterator<String> it15 = map12.keySet().iterator();
                                            while (it15.hasNext()) {
                                                String next9 = it15.next();
                                                if (next9.startsWith(str83)) {
                                                    ConstraintAttribute constraintAttribute5 = oooOO1.f33770OooO0Oo.get(next9.substring(7));
                                                    if (constraintAttribute5 != null) {
                                                        if (constraintAttribute5.f4907OooO0OO == ConstraintAttribute.AttributeType.FLOAT_TYPE && (oooO0OO = map12.get(next9)) != null) {
                                                            int i25 = oooOO1.f33767OooO00o;
                                                            int i26 = oooOO1.f33772OooO0o;
                                                            String str92 = oooOO1.f33774OooO0oO;
                                                            int i27 = oooOO1.f33778OooOO0o;
                                                            oooO0OO.f45299OooO0o.add(new o0Oo0oo.o00O0O.OooO0O0(i25, oooOO1.f33775OooO0oo, oooOO1.f33771OooO, oooOO1.f33776OooOO0, constraintAttribute5.OooO00o()));
                                                            if (i27 != -1) {
                                                                oooO0OO.f45300OooO0o0 = i27;
                                                            }
                                                            oooO0OO.f45297OooO0OO = i26;
                                                            oooO0OO.OooO0OO(constraintAttribute5);
                                                            oooO0OO.f45298OooO0Oo = str92;
                                                        }
                                                        obj7 = obj4;
                                                        str16 = str91;
                                                        obj8 = obj33;
                                                        str17 = str85;
                                                        obj9 = obj34;
                                                        str18 = str83;
                                                        str19 = str86;
                                                        str87 = str87;
                                                        str20 = str88;
                                                        str21 = str84;
                                                        it14 = it14;
                                                        oooOO1 = oooOO1;
                                                        obj33 = obj8;
                                                        str83 = str18;
                                                        str84 = str21;
                                                        str86 = str19;
                                                        it15 = it15;
                                                        str82 = str82;
                                                        map12 = map12;
                                                        str87 = str87;
                                                        str88 = str20;
                                                        str89 = str89;
                                                        str90 = str90;
                                                        obj34 = obj9;
                                                        obj4 = obj7;
                                                        str85 = str17;
                                                        str91 = str16;
                                                    }
                                                } else {
                                                    it14 = it14;
                                                    HashMap<String, o000000.OooO0OO> map13 = map12;
                                                    String str93 = str83;
                                                    it15 = it15;
                                                    switch (next9.hashCode()) {
                                                        case -1249320806:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            b = next9.equals(obj7) ? (byte) 0 : (byte) -1;
                                                            break;
                                                        case -1249320805:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            if (next9.equals(obj8)) {
                                                                b = 1;
                                                                obj7 = obj4;
                                                            } else {
                                                                obj7 = obj4;
                                                            }
                                                            break;
                                                        case -1225497657:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str16 = str91;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            if (next9.equals(obj9)) {
                                                                b = 2;
                                                                obj7 = obj4;
                                                                obj8 = obj33;
                                                            } else {
                                                                obj7 = obj4;
                                                                obj8 = obj33;
                                                            }
                                                            break;
                                                        case -1225497656:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str16 = str91;
                                                            str22 = str85;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            obj7 = obj4;
                                                            obj8 = obj33;
                                                            if (next9.equals(str16)) {
                                                                obj9 = obj34;
                                                                b = 3;
                                                            } else {
                                                                obj9 = obj34;
                                                            }
                                                            break;
                                                        case -1225497655:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str22 = str85;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            if (next9.equals(str22)) {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                obj9 = obj34;
                                                                b = 4;
                                                            } else {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                obj9 = obj34;
                                                            }
                                                            break;
                                                        case -1001078227:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            if (next9.equals(str23)) {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                b = 5;
                                                            } else {
                                                                str22 = str85;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                obj9 = obj34;
                                                            }
                                                            break;
                                                        case -908189618:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            str24 = str86;
                                                            if (next9.equals(str24)) {
                                                                b = 6;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                            } else {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                            }
                                                            break;
                                                        case -908189617:
                                                            str87 = str87;
                                                            str20 = str88;
                                                            if (next9.equals(str87)) {
                                                                b = 7;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                            } else {
                                                                str24 = str86;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                            }
                                                            break;
                                                        case -40300674:
                                                            str20 = str88;
                                                            if (next9.equals(str20)) {
                                                                b2 = 8;
                                                                b = b2;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            } else {
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                            }
                                                            break;
                                                        case -4379043:
                                                            if (next9.equals(str89)) {
                                                                str20 = str88;
                                                                b2 = 9;
                                                                b = b2;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        case 37232917:
                                                            if (next9.equals("transitionPathRotate")) {
                                                                str20 = str88;
                                                                b2 = 10;
                                                                b = b2;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        case 92909918:
                                                            if (next9.equals(str90)) {
                                                                str20 = str88;
                                                                b2 = 11;
                                                                b = b2;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        case 156108012:
                                                            if (next9.equals(str82)) {
                                                                b3 = 12;
                                                                b2 = b3;
                                                                str20 = str88;
                                                                b = b2;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        case 1530034690:
                                                            if (next9.equals("wavePhase")) {
                                                                b3 = 13;
                                                                b2 = b3;
                                                                str20 = str88;
                                                                b = b2;
                                                                obj7 = obj4;
                                                                str16 = str91;
                                                                obj8 = obj33;
                                                                str22 = str85;
                                                                obj9 = obj34;
                                                                str23 = str84;
                                                                str24 = str86;
                                                                str87 = str87;
                                                            }
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                        default:
                                                            str20 = str88;
                                                            obj7 = obj4;
                                                            str16 = str91;
                                                            obj8 = obj33;
                                                            str22 = str85;
                                                            obj9 = obj34;
                                                            str23 = str84;
                                                            str24 = str86;
                                                            break;
                                                    }
                                                    switch (b) {
                                                        case 0:
                                                            f = oooOO1.f33784OooOOo0;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 1:
                                                            f = oooOO1.f33783OooOOo;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 2:
                                                            f = oooOO1.f33786OooOo0;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 3:
                                                            f = oooOO1.f33788OooOo0O;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 4:
                                                            f = oooOO1.f33789OooOo0o;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 5:
                                                            f = oooOO1.f33777OooOO0O;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 6:
                                                            f = oooOO1.f33785OooOOoo;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 7:
                                                            f = oooOO1.f33787OooOo00;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 8:
                                                            f = oooOO1.f33781OooOOOO;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 9:
                                                            f = oooOO1.f33779OooOOO;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 10:
                                                            f = oooOO1.f33782OooOOOo;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 11:
                                                            f = oooOO1.f33780OooOOO0;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 12:
                                                            f = oooOO1.f33771OooO;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        case 13:
                                                            f = oooOO1.f33776OooOO0;
                                                            str87 = str87;
                                                            f2 = f;
                                                            str18 = str93;
                                                            str20 = str20;
                                                            break;
                                                        default:
                                                            str18 = str93;
                                                            if (!next9.startsWith(str18)) {
                                                                Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(next9));
                                                            }
                                                            f2 = Float.NaN;
                                                            break;
                                                    }
                                                    if (Float.isNaN(f2)) {
                                                        map = map13;
                                                    } else {
                                                        map = map13;
                                                        o000000.OooO0OO oooO0OO16 = map.get(next9);
                                                        if (oooO0OO16 != null) {
                                                            int i28 = oooOO1.f33767OooO00o;
                                                            map12 = map;
                                                            int i29 = oooOO1.f33772OooO0o;
                                                            str19 = str24;
                                                            String str94 = oooOO1.f33774OooO0oO;
                                                            str21 = str23;
                                                            int i30 = oooOO1.f33778OooOO0o;
                                                            str17 = str22;
                                                            oooO0OO16.f45299OooO0o.add(new o0Oo0oo.o00O0O.OooO0O0(i28, oooOO1.f33775OooO0oo, oooOO1.f33771OooO, oooOO1.f33776OooOO0, f2));
                                                            if (i30 != -1) {
                                                                oooO0OO16.f45300OooO0o0 = i30;
                                                            }
                                                            oooO0OO16.f45297OooO0OO = i29;
                                                            oooO0OO16.f45298OooO0Oo = str94;
                                                            it14 = it14;
                                                            oooOO1 = oooOO1;
                                                            obj33 = obj8;
                                                            str83 = str18;
                                                            str84 = str21;
                                                            str86 = str19;
                                                            it15 = it15;
                                                            str82 = str82;
                                                            map12 = map12;
                                                            str87 = str87;
                                                            str88 = str20;
                                                            str89 = str89;
                                                            str90 = str90;
                                                            obj34 = obj9;
                                                            obj4 = obj7;
                                                            str85 = str17;
                                                            str91 = str16;
                                                        }
                                                    }
                                                    map12 = map;
                                                    str86 = str24;
                                                    str84 = str23;
                                                    str85 = str22;
                                                    str91 = str16;
                                                    obj33 = obj8;
                                                    obj4 = obj7;
                                                    str83 = str18;
                                                    it15 = it15;
                                                    str87 = str87;
                                                    str88 = str20;
                                                    it14 = it14;
                                                    obj34 = obj9;
                                                }
                                            }
                                        }
                                        oooo0 = this;
                                        it14 = it14;
                                        obj33 = obj33;
                                        str83 = str83;
                                        str84 = str84;
                                        str86 = str86;
                                        str82 = str82;
                                        str87 = str87;
                                        str88 = str88;
                                        str89 = str89;
                                        str90 = str90;
                                        obj34 = obj34;
                                        obj4 = obj4;
                                        str85 = str85;
                                        str91 = str91;
                                    }
                                    Iterator<o000000.OooO0OO> it16 = oooo0.f33884OooOoO.values().iterator();
                                    while (it16.hasNext()) {
                                        it16.next().OooO0Oo();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str95 = strArr3[i22];
                            int i31 = 0;
                            int i32 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i31 < size) {
                                if (o0oooo0Arr[i31].f33911OooOOo0.containsKey(str95)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[size];
                                        ConstraintAttribute constraintAttribute6 = o0oooo0Arr[i31].f33911OooOOo0.get(str95);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, constraintAttribute6 == null ? 0 : constraintAttribute6.OooO0OO());
                                    }
                                    o0OoOo0 o0oooo13 = o0oooo0Arr[i31];
                                    dArr7[i32] = o0oooo13.f33899OooO0o;
                                    double[] dArr9 = dArr8[i32];
                                    ConstraintAttribute constraintAttribute7 = o0oooo13.f33911OooOOo0.get(str95);
                                    if (constraintAttribute7 == null) {
                                        str32 = str44;
                                        dArr7 = dArr7;
                                        dArr8 = dArr8;
                                    } else {
                                        if (constraintAttribute7.OooO0OO() == 1) {
                                            dArr9[0] = constraintAttribute7.OooO00o();
                                        } else {
                                            int iOooO0OO = constraintAttribute7.OooO0OO();
                                            float[] fArr3 = new float[iOooO0OO];
                                            constraintAttribute7.OooO0O0(fArr3);
                                            int i33 = 0;
                                            int i34 = 0;
                                            while (i33 < iOooO0OO) {
                                                dArr9[i34] = fArr3[i33];
                                                i33++;
                                                i34++;
                                                iOooO0OO = iOooO0OO;
                                                str44 = str44;
                                                fArr3 = fArr3;
                                            }
                                        }
                                        str32 = str44;
                                    }
                                    i32++;
                                    dArr7 = dArr7;
                                    dArr8 = dArr8;
                                } else {
                                    str95 = str95;
                                    str32 = str44;
                                }
                                i31++;
                                str95 = str95;
                                str44 = str32;
                            }
                            i22++;
                            oooo0.f33869OooOO0[i22] = p413o0Oo0oo.Oooo000.OooO00o(oooo0.f33866OooO0o0, Arrays.copyOf(dArr7, i32), (double[][]) Arrays.copyOf(dArr8, i32));
                            str44 = str44;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        o0OoOo0 o0oooo0 = this.f33865OooO0o;
        sb.append(o0oooo0.f33902OooO0oo);
        sb.append(" y: ");
        sb.append(o0oooo0.f33897OooO);
        sb.append(" end: x: ");
        o0OoOo0 o0oooo1 = this.f33867OooO0oO;
        sb.append(o0oooo1.f33902OooO0oo);
        sb.append(" y: ");
        sb.append(o0oooo1.f33897OooO);
        return sb.toString();
    }
}
