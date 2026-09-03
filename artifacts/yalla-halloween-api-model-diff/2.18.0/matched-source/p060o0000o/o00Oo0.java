package p060o0000o;

import Oooo000.OooO00o;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.bz;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p057o0000Oo0.o00000;
import p057o0000Oo0.o000000;
import p057o0000Oo0.o000000O;
import p057o0000Oo0.o000OOo;
import p063o0000o0o.o0O0O00;
import p063o0000o0o.o0OO00O;
import p063o0000o0o.o0OOO0o;
import p063o0000o0o.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public View f27783OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f27784OooO0OO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o000000[] f27790OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o000OOo f27791OooOO0O;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int[] f27795OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public double[] f27796OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String[] f27797OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public double[] f27798OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int[] f27799OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public HashMap<String, o0O0O00> f27800OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public HashMap<String, o0OO00O> f27805OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public HashMap<String, oo0o0Oo> f27806OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public o000oOoO[] f27807OooOoOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Rect f27782OooO00o = new Rect();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f27785OooO0Oo = false;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f27787OooO0o0 = -1;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00oO0o f27786OooO0o = new o00oO0o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o00oO0o f27788OooO0oO = new o00oO0o();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0OoOo0 f27789OooO0oo = new o0OoOo0();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0OoOo0 f27781OooO = new o0OoOo0();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f27792OooOO0o = Float.NaN;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f27794OooOOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f27793OooOOO = 1.0f;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float[] f27802OooOo00 = new float[4];

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList<o00oO0o> f27801OooOo0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public float[] f27803OooOo0O = new float[1];

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public ArrayList<OooOOO0> f27804OooOo0o = new ArrayList<>();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f27809OooOoo0 = -1;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f27808OooOoo = -1;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f27810OooOooO = null;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f27811OooOooo = -1;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f27812Oooo000 = Float.NaN;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Interpolator f27813Oooo00O = null;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f27814Oooo00o = false;

    public o00Oo0(View view) {
        this.f27783OooO0O0 = view;
        this.f27784OooO0OO = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            Objects.requireNonNull((ConstraintLayout.LayoutParams) layoutParams);
        }
    }

    public final void OooO00o(OooOOO0 oooOOO0) {
        this.f27804OooOo0o.add(oooOOO0);
    }

    public final float OooO0O0(float f, float[] fArr) {
        float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f27793OooOOO;
            if (f3 != 1.0d) {
                float f4 = this.f27794OooOOO0;
                if (f < f4) {
                    f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        o000000O o000000o2 = this.f27786OooO0o.f27816Oooo;
        float f5 = Float.NaN;
        for (o00oO0o o00oo0o2 : this.f27801OooOo0) {
            o000000O o000000o3 = o00oo0o2.f27816Oooo;
            if (o000000o3 != null) {
                float f6 = o00oo0o2.f27818OoooO0;
                if (f6 < f) {
                    o000000o2 = o000000o3;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = o00oo0o2.f27818OoooO0;
                }
            }
        }
        if (o000000o2 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) o000000o2.OooO00o(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) o000000o2.OooO0O0(d);
            }
        }
        return f;
    }

    public final void OooO0OO(double d, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f27790OooOO0[0].OooO0OO(d, dArr);
        this.f27790OooOO0[0].OooO0o(d, dArr2);
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        Arrays.fill(fArr2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        o00oO0o o00oo0o2 = this.f27786OooO0o;
        int[] iArr = this.f27795OooOOOO;
        float f2 = o00oo0o2.f27817OoooO;
        float f3 = o00oo0o2.f27821OoooOO0;
        float f4 = o00oo0o2.f27832o000oOoO;
        float f5 = o00oo0o2.f27822OoooOOO;
        float f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (int i = 0; i < iArr.length; i++) {
            float f9 = (float) dArr[i];
            float f10 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f9;
                f = f10;
            } else if (i2 == 2) {
                f3 = f9;
                f6 = f10;
            } else if (i2 == 3) {
                f4 = f9;
                f7 = f10;
            } else if (i2 == 4) {
                f5 = f9;
                f8 = f10;
            }
        }
        float f11 = 2.0f;
        float f12 = (f7 / 2.0f) + f;
        float fSin = (f8 / 2.0f) + f6;
        o00Oo0 o00oo1 = o00oo0o2.f27827Ooooo00;
        if (o00oo1 != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            o00oo1.OooO0OO(d, fArr3, fArr4);
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
            double d6 = f6;
            float fCos2 = (float) ((Math.cos(d3) * d6) + (Math.sin(d3) * d5) + d4);
            fSin = (float) ((Math.sin(d3) * d6) + (((double) f16) - (Math.cos(d3) * d5)));
            f3 = fCos;
            f12 = fCos2;
            f2 = fSin2;
            f11 = 2.0f;
        }
        fArr[0] = (f4 / f11) + f2 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        fArr[1] = (f5 / f11) + f3 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        fArr2[0] = f12;
        fArr2[1] = fSin;
    }

    public final void OooO0Oo(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float fOooO0O0 = OooO0O0(f, this.f27803OooOo0O);
        o000000[] o000000VarArr = this.f27790OooOO0;
        int i = 0;
        if (o000000VarArr == null) {
            o00oO0o o00oo0o2 = this.f27788OooO0oO;
            float f4 = o00oo0o2.f27817OoooO;
            o00oO0o o00oo0o3 = this.f27786OooO0o;
            float f5 = f4 - o00oo0o3.f27817OoooO;
            float f6 = o00oo0o2.f27821OoooOO0 - o00oo0o3.f27821OoooOO0;
            float f7 = o00oo0o2.f27832o000oOoO - o00oo0o3.f27832o000oOoO;
            float f8 = (o00oo0o2.f27822OoooOOO - o00oo0o3.f27822OoooOOO) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            return;
        }
        double d = fOooO0O0;
        o000000VarArr[0].OooO0o(d, this.f27798OooOOo0);
        this.f27790OooOO0[0].OooO0OO(d, this.f27796OooOOOo);
        float f9 = this.f27803OooOo0O[0];
        while (true) {
            dArr = this.f27798OooOOo0;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        o000OOo o000ooo2 = this.f27791OooOO0O;
        if (o000ooo2 == null) {
            this.f27786OooO0o.OooO0o(f2, f3, fArr, this.f27795OooOOOO, dArr, this.f27796OooOOOo);
            return;
        }
        double[] dArr2 = this.f27796OooOOOo;
        if (dArr2.length > 0) {
            o000ooo2.OooO0OO(d, dArr2);
            this.f27791OooOO0O.OooO0o(d, this.f27798OooOOo0);
            this.f27786OooO0o.OooO0o(f2, f3, fArr, this.f27795OooOOOO, this.f27798OooOOo0, this.f27796OooOOOo);
        }
    }

    public final void OooO0o(o00oO0o o00oo0o2) {
        o00oo0o2.OooO0o0((int) this.f27783OooO0O0.getX(), (int) this.f27783OooO0O0.getY(), this.f27783OooO0O0.getWidth(), this.f27783OooO0O0.getHeight());
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0327  */
    public final boolean OooO0o0(View view, float f, long j, o00000 o00000Var) {
        boolean zOooO0o0;
        o0O0O00.OooO0o oooO0o;
        float f2;
        boolean z;
        float f3;
        double d;
        float f4;
        float f5;
        boolean z2;
        View view2 = view;
        float fOooO0O0 = OooO0O0(f, null);
        int i = this.f27811OooOooo;
        if (i != -1) {
            float f6 = 1.0f / i;
            float fFloor = ((float) Math.floor(fOooO0O0 / f6)) * f6;
            float f7 = (fOooO0O0 % f6) / f6;
            if (!Float.isNaN(this.f27812Oooo000)) {
                f7 = (f7 + this.f27812Oooo000) % 1.0f;
            }
            Interpolator interpolator = this.f27813Oooo00O;
            fOooO0O0 = ((interpolator != null ? interpolator.getInterpolation(f7) : ((double) f7) > 0.5d ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * f6) + fFloor;
        }
        float f8 = fOooO0O0;
        HashMap<String, oo0o0Oo> map = this.f27806OooOoO0;
        if (map != null) {
            Iterator<oo0o0Oo> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().OooO0o0(view2, f8);
            }
        }
        HashMap<String, o0O0O00> map2 = this.f27800OooOo;
        if (map2 != null) {
            oooO0o = null;
            zOooO0o0 = false;
            for (o0O0O00 o0o0o00 : map2.values()) {
                if (o0o0o00 instanceof o0O0O00.OooO0o) {
                    oooO0o = (o0O0O00.OooO0o) o0o0o00;
                } else {
                    zOooO0o0 |= o0o0o00.OooO0o0(view, f8, j, o00000Var);
                }
            }
        } else {
            zOooO0o0 = false;
            oooO0o = null;
        }
        o000000[] o000000VarArr = this.f27790OooOO0;
        if (o000000VarArr != null) {
            double d2 = f8;
            o000000VarArr[0].OooO0OO(d2, this.f27796OooOOOo);
            this.f27790OooOO0[0].OooO0o(d2, this.f27798OooOOo0);
            o000OOo o000ooo2 = this.f27791OooOO0O;
            if (o000ooo2 != null) {
                double[] dArr = this.f27796OooOOOo;
                if (dArr.length > 0) {
                    o000ooo2.OooO0OO(d2, dArr);
                    this.f27791OooOO0O.OooO0o(d2, this.f27798OooOOo0);
                }
            }
            if (this.f27814Oooo00o) {
                f3 = f8;
                d = d2;
            } else {
                o00oO0o o00oo0o2 = this.f27786OooO0o;
                int[] iArr = this.f27795OooOOOO;
                double[] dArr2 = this.f27796OooOOOo;
                double[] dArr3 = this.f27798OooOOo0;
                boolean z3 = this.f27785OooO0Oo;
                float f9 = o00oo0o2.f27817OoooO;
                float f10 = o00oo0o2.f27821OoooOO0;
                float f11 = o00oo0o2.f27832o000oOoO;
                float f12 = o00oo0o2.f27822OoooOOO;
                if (iArr.length != 0) {
                    f5 = f10;
                    if (o00oo0o2.f27830OooooOO.length <= iArr[iArr.length - 1]) {
                        int i2 = iArr[iArr.length - 1] + 1;
                        o00oo0o2.f27830OooooOO = new double[i2];
                        o00oo0o2.f27831OooooOo = new double[i2];
                    }
                } else {
                    f5 = f10;
                }
                float f13 = f11;
                Arrays.fill(o00oo0o2.f27830OooooOO, Double.NaN);
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    o00oo0o2.f27830OooooOO[iArr[i3]] = dArr2[i3];
                    o00oo0o2.f27831OooooOo[iArr[i3]] = dArr3[i3];
                }
                float f14 = Float.NaN;
                float f15 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                int i4 = 0;
                float f16 = f9;
                float f17 = f12;
                float f18 = f5;
                float f19 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                float f20 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                float f21 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                while (true) {
                    double[] dArr4 = o00oo0o2.f27830OooooOO;
                    f3 = f8;
                    if (i4 >= dArr4.length) {
                        break;
                    }
                    if (!Double.isNaN(dArr4[i4])) {
                        float f22 = (float) (Double.isNaN(o00oo0o2.f27830OooooOO[i4]) ? 0.0d : o00oo0o2.f27830OooooOO[i4] + 0.0d);
                        float f23 = (float) o00oo0o2.f27831OooooOo[i4];
                        if (i4 == 1) {
                            f15 = f23;
                            f16 = f22;
                        } else if (i4 == 2) {
                            f19 = f23;
                            f18 = f22;
                        } else if (i4 == 3) {
                            f20 = f23;
                            f13 = f22;
                        } else if (i4 == 4) {
                            f21 = f23;
                            f17 = f22;
                        } else if (i4 == 5) {
                            f14 = f22;
                        }
                    }
                    i4++;
                    f8 = f3;
                }
                o00Oo0 o00oo1 = o00oo0o2.f27827Ooooo00;
                if (o00oo1 != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    o00oo1.OooO0OO(d2, fArr, fArr2);
                    float f24 = fArr[0];
                    float f25 = fArr[1];
                    float f26 = fArr2[0];
                    float f27 = fArr2[1];
                    d = d2;
                    double d3 = f24;
                    double d4 = f16;
                    double d5 = f18;
                    float fSin = (float) (((Math.sin(d5) * d4) + d3) - ((double) (f13 / 2.0f)));
                    z2 = z3;
                    float fCos = (float) ((((double) f25) - (Math.cos(d5) * d4)) - ((double) (f17 / 2.0f)));
                    double d6 = f15;
                    double d7 = f19;
                    float fCos2 = (float) ((Math.cos(d5) * d4 * d7) + (Math.sin(d5) * d6) + ((double) f26));
                    float fSin2 = (float) ((Math.sin(d5) * d4 * d7) + (((double) f27) - (Math.cos(d5) * d6)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f14)) {
                        view2 = view;
                    } else {
                        float degrees = (float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f14));
                        view2 = view;
                        view2.setRotation(degrees);
                    }
                    f18 = fCos;
                    f16 = fSin;
                } else {
                    view2 = view;
                    z2 = z3;
                    d = d2;
                    if (!Float.isNaN(f14)) {
                        view2.setRotation((float) (Math.toDegrees(Math.atan2((f21 / 2.0f) + f19, (f20 / 2.0f) + f15)) + ((double) f14) + ((double) ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)));
                    }
                }
                if (view2 instanceof OooOO0O) {
                    ((OooOO0O) view2).OooO00o(f16, f18, f13 + f16, f18 + f17);
                } else {
                    float f28 = f16 + 0.5f;
                    int i5 = (int) f28;
                    float f29 = f18 + 0.5f;
                    int i6 = (int) f29;
                    int i7 = (int) (f28 + f13);
                    int i8 = (int) (f29 + f17);
                    int i9 = i7 - i5;
                    int i10 = i8 - i6;
                    if (((i9 == view.getMeasuredWidth() && i10 == view.getMeasuredHeight()) ? false : true) || z2) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                    }
                    view2.layout(i5, i6, i7, i8);
                }
                this.f27785OooO0Oo = false;
            }
            if (this.f27808OooOoo != -1) {
                if (this.f27810OooOooO == null) {
                    this.f27810OooOooO = ((View) view.getParent()).findViewById(this.f27808OooOoo);
                }
                View view3 = this.f27810OooOooO;
                if (view3 != null) {
                    float bottom = (this.f27810OooOooO.getBottom() + view3.getTop()) / 2.0f;
                    float right = (this.f27810OooOooO.getRight() + this.f27810OooOooO.getLeft()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left = right - view.getLeft();
                        float top = bottom - view.getTop();
                        view2.setPivotX(left);
                        view2.setPivotY(top);
                    }
                }
            }
            HashMap<String, oo0o0Oo> map3 = this.f27806OooOoO0;
            if (map3 != null) {
                for (oo0o0Oo oo0o0oo : map3.values()) {
                    if (oo0o0oo instanceof oo0o0Oo.OooO0o) {
                        double[] dArr5 = this.f27798OooOOo0;
                        if (dArr5.length > 1) {
                            f4 = f3;
                            view2.setRotation(((oo0o0Oo.OooO0o) oo0o0oo).OooO00o(f4) + ((float) Math.toDegrees(Math.atan2(dArr5[1], dArr5[0]))));
                        } else {
                            f4 = f3;
                        }
                    } else {
                        f4 = f3;
                    }
                    f3 = f4;
                }
            }
            f2 = f3;
            if (oooO0o != 0) {
                double[] dArr6 = this.f27798OooOOo0;
                view2.setRotation(oooO0o.OooO0Oo(f2, j, view, o00000Var) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                z = zOooO0o0 | oooO0o.f27642OooO0oo;
            } else {
                z = zOooO0o0;
            }
            int i11 = 1;
            while (true) {
                o000000[] o000000VarArr2 = this.f27790OooOO0;
                if (i11 >= o000000VarArr2.length) {
                    break;
                }
                o000000VarArr2[i11].OooO0Oo(d, this.f27802OooOo00);
                o0OOO0o.OooO0O0(this.f27786OooO0o.f27828Ooooo0o.get(this.f27797OooOOo[i11 - 1]), view2, this.f27802OooOo00);
                i11++;
            }
            o0OoOo0 o0oooo1 = this.f27789OooO0oo;
            if (o0oooo1.f27840OoooO00 == 0) {
                if (f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    view2.setVisibility(o0oooo1.f27839OoooO0);
                } else if (f2 >= 1.0f) {
                    view2.setVisibility(this.f27781OooO.f27839OoooO0);
                } else if (this.f27781OooO.f27839OoooO0 != o0oooo1.f27839OoooO0) {
                    view2.setVisibility(0);
                }
            }
            if (this.f27807OooOoOO != null) {
                int i12 = 0;
                while (true) {
                    o000oOoO[] o000ooooArr = this.f27807OooOoOO;
                    if (i12 >= o000ooooArr.length) {
                        break;
                    }
                    o000ooooArr[i12].OooO0oo(f2, view2);
                    i12++;
                }
            }
        } else {
            f2 = f8;
            boolean z4 = zOooO0o0;
            o00oO0o o00oo0o3 = this.f27786OooO0o;
            float f30 = o00oo0o3.f27817OoooO;
            o00oO0o o00oo0o4 = this.f27788OooO0oO;
            float fOooO00o = OooO00o.OooO00o(o00oo0o4.f27817OoooO, f30, f2, f30);
            float f31 = o00oo0o3.f27821OoooOO0;
            float fOooO00o2 = OooO00o.OooO00o(o00oo0o4.f27821OoooOO0, f31, f2, f31);
            float f32 = o00oo0o3.f27832o000oOoO;
            float f33 = o00oo0o4.f27832o000oOoO;
            float fOooO00o3 = OooO00o.OooO00o(f33, f32, f2, f32);
            float f34 = o00oo0o3.f27822OoooOOO;
            float f35 = o00oo0o4.f27822OoooOOO;
            float f36 = fOooO00o + 0.5f;
            int i13 = (int) f36;
            float f37 = fOooO00o2 + 0.5f;
            int i14 = (int) f37;
            int i15 = (int) (f36 + fOooO00o3);
            int iOooO00o = (int) (f37 + OooO00o.OooO00o(f35, f34, f2, f34));
            int i16 = i15 - i13;
            int i17 = iOooO00o - i14;
            if (f33 != f32 || f35 != f34 || this.f27785OooO0Oo) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
                this.f27785OooO0Oo = false;
            }
            view2.layout(i13, i14, i15, iOooO00o);
            z = z4;
        }
        HashMap<String, o0OO00O> map4 = this.f27805OooOoO;
        if (map4 != null) {
            for (o0OO00O o0oo00o2 : map4.values()) {
                if (o0oo00o2 instanceof o0OO00O.OooO0o) {
                    double[] dArr7 = this.f27798OooOOo0;
                    view2.setRotation(((o0OO00O.OooO0o) o0oo00o2).OooO00o(f2) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                } else {
                    o0oo00o2.OooO0o0(view2, f2);
                }
            }
        }
        return z;
    }

    public final void OooO0oO(Rect rect, Rect rect2, int i, int i2, int i3) {
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x028e A[PHI: r24
      0x028e: PHI (r24v36 java.lang.String) = 
      (r24v19 java.lang.String)
      (r24v28 java.lang.String)
      (r24v19 java.lang.String)
      (r24v19 java.lang.String)
      (r24v19 java.lang.String)
      (r24v19 java.lang.String)
      (r24v19 java.lang.String)
      (r24v19 java.lang.String)
     binds: [B:109:0x028b, B:145:0x03aa, B:136:0x035b, B:132:0x0337, B:128:0x0313, B:124:0x02f0, B:120:0x02cd, B:116:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x03aa A[PHI: r1
      0x03aa: PHI (r1v102 java.lang.String) = (r1v100 java.lang.String), (r1v103 java.lang.String) binds: [B:144:0x03a8, B:140:0x0381] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:560:0x1017 A[PHI: r3
      0x1017: PHI (r3v29 java.lang.String) = (r3v28 java.lang.String), (r3v30 java.lang.String) binds: [B:563:0x1046, B:559:0x1015] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooO0oo(int i, int i2, long j) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        HashSet<String> hashSet;
        HashSet<String> hashSet2;
        String str5;
        Object obj;
        Object obj2;
        String str6;
        String str7;
        String str8;
        String str9;
        Object obj3;
        Object obj4;
        Object obj5;
        String str10;
        o00Oo0 o00oo1;
        String str11;
        String str12;
        Object obj6;
        Object obj7;
        Object obj8;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        byte b;
        o0OO00O oooOO0O;
        o0OO00O oooO0O0;
        String str18;
        String str19;
        String str20;
        double dOooO00o;
        int i3;
        o00oO0o[] o00oo0oArr;
        ConstraintAttribute constraintAttribute;
        Object obj9;
        HashSet<String> hashSet3;
        String str21;
        Object obj10;
        Object obj11;
        byte b2;
        Object obj12;
        Object obj13;
        Iterator<String> it;
        String str22;
        Object obj14;
        Object obj15;
        Object obj16;
        byte b3;
        o0O0O00 oooOO0O2;
        ConstraintAttribute constraintAttribute2;
        Integer num;
        String str23;
        Object obj17;
        Object obj18;
        String str24;
        String str25;
        Object obj19;
        String str26;
        Object obj20;
        byte b4;
        String str27;
        oo0o0Oo oooOOO;
        Object obj21;
        oo0o0Oo oo0o0oo;
        ConstraintAttribute constraintAttribute3;
        String str28;
        String str29;
        o00Oo0 o00oo2 = this;
        new HashSet();
        HashSet<String> hashSet4 = new HashSet<>();
        HashSet<String> hashSet5 = new HashSet<>();
        HashSet<String> hashSet6 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i4 = o00oo2.f27809OooOoo0;
        if (i4 != -1) {
            o00oo2.f27786OooO0o.f27824OoooOo0 = i4;
        }
        o0OoOo0 o0oooo1 = o00oo2.f27789OooO0oo;
        o0OoOo0 o0oooo2 = o00oo2.f27781OooO;
        String str30 = "alpha";
        if (o0oooo1.OooO0Oo(o0oooo1.f27837Oooo, o0oooo2.f27837Oooo)) {
            hashSet5.add("alpha");
        }
        String str31 = "elevation";
        if (o0oooo1.OooO0Oo(o0oooo1.f27841OoooO0O, o0oooo2.f27841OoooO0O)) {
            hashSet5.add("elevation");
        }
        int i5 = o0oooo1.f27839OoooO0;
        int i6 = o0oooo2.f27839OoooO0;
        if (i5 != i6 && o0oooo1.f27840OoooO00 == 0 && (i5 == 0 || i6 == 0)) {
            hashSet5.add("alpha");
        }
        String str32 = "rotation";
        if (o0oooo1.OooO0Oo(o0oooo1.f27838OoooO, o0oooo2.f27838OoooO)) {
            hashSet5.add("rotation");
        }
        String str33 = "transitionPathRotate";
        if (!Float.isNaN(o0oooo1.f27850OooooO0) || !Float.isNaN(o0oooo2.f27850OooooO0)) {
            hashSet5.add("transitionPathRotate");
        }
        if (!Float.isNaN(o0oooo1.f27851OooooOO) || !Float.isNaN(o0oooo2.f27851OooooOO)) {
            hashSet5.add("progress");
        }
        if (o0oooo1.OooO0Oo(o0oooo1.f27842OoooOO0, o0oooo2.f27842OoooOO0)) {
            hashSet5.add("rotationX");
        }
        if (o0oooo1.OooO0Oo(o0oooo1.f27853o000oOoO, o0oooo2.f27853o000oOoO)) {
            hashSet5.add("rotationY");
        }
        String str34 = "transformPivotX";
        if (o0oooo1.OooO0Oo(o0oooo1.f27845OoooOo0, o0oooo2.f27845OoooOo0)) {
            hashSet5.add("transformPivotX");
        }
        Object obj22 = "rotationX";
        String str35 = "transformPivotY";
        if (o0oooo1.OooO0Oo(o0oooo1.f27846OoooOoO, o0oooo2.f27846OoooOoO)) {
            hashSet5.add("transformPivotY");
        }
        Object obj23 = "rotationY";
        if (o0oooo1.OooO0Oo(o0oooo1.f27843OoooOOO, o0oooo2.f27843OoooOOO)) {
            hashSet5.add("scaleX");
        }
        Object obj24 = "progress";
        String str36 = "scaleY";
        if (o0oooo1.OooO0Oo(o0oooo1.f27844OoooOOo, o0oooo2.f27844OoooOOo)) {
            hashSet5.add("scaleY");
        }
        Object obj25 = "scaleX";
        if (o0oooo1.OooO0Oo(o0oooo1.f27847OoooOoo, o0oooo2.f27847OoooOoo)) {
            hashSet5.add("translationX");
        }
        Object obj26 = "translationX";
        String str37 = "translationY";
        if (o0oooo1.OooO0Oo(o0oooo1.f27848Ooooo00, o0oooo2.f27848Ooooo00)) {
            hashSet5.add("translationY");
        }
        boolean zOooO0Oo = o0oooo1.OooO0Oo(o0oooo1.f27849Ooooo0o, o0oooo2.f27849Ooooo0o);
        String str38 = "translationZ";
        if (zOooO0Oo) {
            hashSet5.add("translationZ");
        }
        ArrayList<OooOOO0> arrayList2 = o00oo2.f27804OooOo0o;
        if (arrayList2 != null) {
            Iterator<OooOOO0> it2 = arrayList2.iterator();
            arrayList = null;
            while (it2.hasNext()) {
                Iterator<OooOOO0> it3 = it2;
                OooOOO0 next = it2.next();
                String str39 = str37;
                if (next instanceof OooOo) {
                    OooOo oooOo = (OooOo) next;
                    str28 = str38;
                    str29 = str36;
                    o00oO0o o00oo0o2 = new o00oO0o(i, i2, oooOo, o00oo2.f27786OooO0o, o00oo2.f27788OooO0oO);
                    int iBinarySearch = Collections.binarySearch(o00oo2.f27801OooOo0, o00oo0o2);
                    if (iBinarySearch == 0) {
                        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0(" KeyPath position \"");
                        sbOooO0O0.append(o00oo0o2.f27820OoooO0O);
                        sbOooO0O0.append("\" outside of range");
                        Log.e("MotionController", sbOooO0O0.toString());
                    }
                    o00oo2.f27801OooOo0.add((-iBinarySearch) - 1, o00oo0o2);
                    int i7 = oooOo.f27758OooO0o0;
                    if (i7 != -1) {
                        o00oo2.f27787OooO0o0 = i7;
                    }
                } else {
                    str28 = str38;
                    str34 = str34;
                    str29 = str36;
                    if (next instanceof OooOOOO) {
                        next.OooO0Oo(hashSet6);
                    } else if (next instanceof Oooo0) {
                        next.OooO0Oo(hashSet4);
                    } else if (next instanceof o000oOoO) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add((o000oOoO) next);
                    } else {
                        next.OooO0o(map);
                        next.OooO0Oo(hashSet5);
                    }
                }
                str37 = str39;
                it2 = it3;
                str34 = str34;
                str38 = str28;
                str36 = str29;
            }
            str = str38;
            str2 = str34;
            str3 = str36;
            str4 = str37;
        } else {
            str = "translationZ";
            str2 = "transformPivotX";
            str3 = "scaleY";
            str4 = "translationY";
            arrayList = null;
        }
        if (arrayList != null) {
            o00oo2.f27807OooOoOO = (o000oOoO[]) arrayList.toArray(new o000oOoO[0]);
        }
        String str40 = "waveOffset";
        String str41 = "waveVariesBy";
        String str42 = ",";
        String str43 = "CUSTOM,";
        if (hashSet5.isEmpty()) {
            hashSet = hashSet5;
            hashSet2 = hashSet6;
            str5 = ",";
            obj = obj24;
            obj2 = obj25;
            str6 = str4;
            str7 = str;
            str8 = str3;
            str9 = "waveVariesBy";
            obj3 = obj23;
            obj4 = obj22;
            obj5 = obj26;
            str10 = "waveOffset";
        } else {
            o00oo2.f27806OooOoO0 = new HashMap<>();
            Iterator<String> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                String next2 = it4.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str44 = next2.split(str42)[1];
                    Iterator<OooOOO0> it5 = o00oo2.f27804OooOo0o.iterator();
                    while (it5.hasNext()) {
                        Iterator<OooOOO0> it6 = it5;
                        OooOOO0 next3 = it5.next();
                        String str45 = str42;
                        HashMap<String, ConstraintAttribute> map2 = next3.f27707OooO0Oo;
                        if (map2 != null && (constraintAttribute3 = map2.get(str44)) != null) {
                            sparseArray.append(next3.f27704OooO00o, constraintAttribute3);
                        }
                        str42 = str45;
                        it5 = it6;
                    }
                    str23 = str42;
                    oo0o0Oo.OooO0O0 oooO0O1 = new oo0o0Oo.OooO0O0(next2, sparseArray);
                    obj17 = obj24;
                    obj18 = obj25;
                    str24 = str;
                    str35 = str35;
                    obj23 = obj23;
                    str4 = str4;
                    str41 = str41;
                    obj21 = obj22;
                    obj19 = obj26;
                    str26 = str40;
                    oo0o0oo = oooO0O1;
                    str25 = str3;
                } else {
                    str23 = str42;
                    switch (next2.hashCode()) {
                        case -1249320806:
                            obj17 = obj24;
                            obj18 = obj25;
                            str24 = str;
                            str25 = str3;
                            str35 = str35;
                            obj23 = obj23;
                            str4 = str4;
                            str41 = str41;
                            obj19 = obj26;
                            str26 = str40;
                            obj20 = obj22;
                            b4 = next2.equals(obj20) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            obj17 = obj24;
                            obj18 = obj25;
                            str24 = str;
                            str25 = str3;
                            str35 = str35;
                            str4 = str4;
                            str41 = str41;
                            obj19 = obj26;
                            str26 = str40;
                            Object obj27 = obj23;
                            if (next2.equals(obj27)) {
                                obj23 = obj27;
                                obj20 = obj22;
                                b4 = 1;
                            } else {
                                obj23 = obj27;
                                obj20 = obj22;
                            }
                            break;
                        case -1225497657:
                            obj17 = obj24;
                            obj18 = obj25;
                            str24 = str;
                            str25 = str3;
                            str35 = str35;
                            str4 = str4;
                            str41 = str41;
                            obj19 = obj26;
                            if (next2.equals(obj19)) {
                                str26 = str40;
                                obj20 = obj22;
                                obj23 = obj23;
                                b4 = 2;
                            } else {
                                str26 = str40;
                                obj20 = obj22;
                                obj23 = obj23;
                            }
                            break;
                        case -1225497656:
                            obj17 = obj24;
                            obj18 = obj25;
                            str24 = str;
                            str25 = str3;
                            str35 = str35;
                            str4 = str4;
                            if (next2.equals(str4)) {
                                str41 = str41;
                                obj23 = obj23;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 3;
                            } else {
                                obj23 = obj23;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -1225497655:
                            obj17 = obj24;
                            obj18 = obj25;
                            str24 = str;
                            str25 = str3;
                            if (next2.equals(str24)) {
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 4;
                            } else {
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -1001078227:
                            obj17 = obj24;
                            obj18 = obj25;
                            String str46 = str2;
                            str25 = str3;
                            if (next2.equals(obj17)) {
                                str2 = str46;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str24 = str;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 5;
                            } else {
                                str2 = str46;
                                str24 = str;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -908189618:
                            obj18 = obj25;
                            String str47 = str2;
                            str25 = str3;
                            if (next2.equals(obj18)) {
                                str2 = str47;
                                str35 = str35;
                                obj17 = obj24;
                                str4 = str4;
                                str24 = str;
                                str41 = str41;
                                obj23 = obj23;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 6;
                            } else {
                                str2 = str47;
                                str35 = str35;
                                obj17 = obj24;
                                str4 = str4;
                                str24 = str;
                                obj23 = obj23;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -908189617:
                            String str48 = str2;
                            str25 = str3;
                            if (next2.equals(str25)) {
                                str2 = str48;
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 7;
                            } else {
                                str2 = str48;
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -797520672:
                            str27 = str2;
                            if (next2.equals(str41)) {
                                str2 = str27;
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 8;
                            } else {
                                str2 = str27;
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -760884510:
                            str27 = str2;
                            if (next2.equals(str27)) {
                                str2 = str27;
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 9;
                            } else {
                                str2 = str27;
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -760884509:
                            if (next2.equals(str35)) {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 10;
                            } else {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -40300674:
                            if (next2.equals("rotation")) {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 11;
                            } else {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case -4379043:
                            if (next2.equals("elevation")) {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = 12;
                            } else {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case 37232917:
                            if (next2.equals("transitionPathRotate")) {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = bz.k;
                            } else {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case 92909918:
                            if (next2.equals("alpha")) {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = bz.l;
                            } else {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        case 156108012:
                            if (next2.equals(str40)) {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                str35 = str35;
                                obj23 = obj23;
                                str4 = str4;
                                str41 = str41;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                                b4 = bz.m;
                            } else {
                                obj17 = obj24;
                                obj18 = obj25;
                                str24 = str;
                                str25 = str3;
                                obj19 = obj26;
                                str26 = str40;
                                obj20 = obj22;
                            }
                            break;
                        default:
                            obj17 = obj24;
                            obj18 = obj25;
                            str24 = str;
                            str25 = str3;
                            obj19 = obj26;
                            str26 = str40;
                            obj20 = obj22;
                            break;
                    }
                    switch (b4) {
                        case 0:
                            oooOOO = new oo0o0Oo.OooOOO();
                            break;
                        case 1:
                            oooOOO = new oo0o0Oo.OooOOOO();
                            break;
                        case 2:
                            oooOOO = new oo0o0Oo.Oooo000();
                            break;
                        case 3:
                            oooOOO = new oo0o0Oo.Oooo0();
                            break;
                        case 4:
                            oooOOO = new oo0o0Oo.o000oOoO();
                            break;
                        case 5:
                            oooOOO = new oo0o0Oo.OooOO0O();
                            break;
                        case 6:
                            oooOOO = new oo0o0Oo.OooOo00();
                            break;
                        case 7:
                            oooOOO = new oo0o0Oo.OooOo();
                            break;
                        case 8:
                            oooOOO = new oo0o0Oo.OooO00o();
                            break;
                        case 9:
                            oooOOO = new oo0o0Oo.OooO();
                            break;
                        case 10:
                            oooOOO = new oo0o0Oo.OooOO0();
                            break;
                        case 11:
                            oooOOO = new oo0o0Oo.OooOOO0();
                            break;
                        case 12:
                            oooOOO = new oo0o0Oo.OooO0OO();
                            break;
                        case 13:
                            oooOOO = new oo0o0Oo.OooO0o();
                            break;
                        case 14:
                            oooOOO = new oo0o0Oo.OooO00o();
                            break;
                        case 15:
                            oooOOO = new oo0o0Oo.OooO00o();
                            break;
                        default:
                            oooOOO = null;
                            break;
                    }
                    obj21 = obj20;
                    oo0o0oo = oooOOO;
                }
                if (oo0o0oo != null) {
                    oo0o0oo.f27652OooO0o0 = next2;
                    o00oo2.f27806OooOoO0.put(next2, oo0o0oo);
                }
                str = str24;
                str3 = str25;
                str40 = str26;
                str41 = str41;
                hashSet5 = hashSet5;
                it4 = it4;
                str4 = str4;
                obj26 = obj19;
                obj22 = obj21;
                obj23 = obj23;
                str35 = str35;
                obj25 = obj18;
                obj24 = obj17;
                str42 = str23;
                hashSet6 = hashSet6;
            }
            hashSet = hashSet5;
            hashSet2 = hashSet6;
            str5 = str42;
            obj = obj24;
            obj2 = obj25;
            str6 = str4;
            str7 = str;
            str8 = str3;
            str9 = str41;
            obj3 = obj23;
            obj4 = obj22;
            obj5 = obj26;
            str10 = str40;
            ArrayList<OooOOO0> arrayList3 = o00oo2.f27804OooOo0o;
            if (arrayList3 != null) {
                for (OooOOO0 oooOOO0 : arrayList3) {
                    if (oooOOO0 instanceof OooOOO) {
                        oooOOO0.OooO00o(o00oo2.f27806OooOoO0);
                    }
                }
            }
            o00oo2.f27789OooO0oo.OooO00o(o00oo2.f27806OooOoO0, 0);
            o00oo2.f27781OooO.OooO00o(o00oo2.f27806OooOoO0, 100);
            Iterator<String> it7 = o00oo2.f27806OooOoO0.keySet().iterator();
            while (it7.hasNext()) {
                String next4 = it7.next();
                int iIntValue = (!map.containsKey(next4) || (num = map.get(next4)) == null) ? 0 : num.intValue();
                Iterator<String> it8 = it7;
                oo0o0Oo oo0o0oo2 = o00oo2.f27806OooOoO0.get(next4);
                if (oo0o0oo2 != null) {
                    oo0o0oo2.OooO0Oo(iIntValue);
                }
                it7 = it8;
            }
        }
        if (hashSet4.isEmpty()) {
            o00oo1 = o00oo2;
            str11 = "CUSTOM,";
            str12 = str6;
            obj6 = obj5;
            obj7 = obj4;
            obj8 = obj3;
        } else {
            if (o00oo2.f27800OooOo == null) {
                o00oo2.f27800OooOo = new HashMap<>();
            }
            Iterator<String> it9 = hashSet4.iterator();
            while (it9.hasNext()) {
                String next5 = it9.next();
                if (!o00oo2.f27800OooOo.containsKey(next5)) {
                    if (!next5.startsWith(str43)) {
                        it = it9;
                        str22 = str43;
                        switch (next5.hashCode()) {
                            case -1249320806:
                                obj14 = obj5;
                                obj15 = obj4;
                                obj16 = obj3;
                                b3 = next5.equals(obj15) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj14 = obj5;
                                obj16 = obj3;
                                if (next5.equals(obj16)) {
                                    obj15 = obj4;
                                    b3 = 1;
                                } else {
                                    obj15 = obj4;
                                }
                                break;
                            case -1225497657:
                                obj14 = obj5;
                                if (next5.equals(obj14)) {
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 2;
                                } else {
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case -1225497656:
                                if (next5.equals(str6)) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 3;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case -1225497655:
                                if (next5.equals(str7)) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 4;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case -1001078227:
                                if (next5.equals(obj)) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 5;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case -908189618:
                                if (next5.equals(obj2)) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 6;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case -908189617:
                                if (next5.equals(str8)) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 7;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case -40300674:
                                if (next5.equals("rotation")) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 8;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case -4379043:
                                if (next5.equals("elevation")) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 9;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case 37232917:
                                if (next5.equals("transitionPathRotate")) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 10;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            case 92909918:
                                if (next5.equals("alpha")) {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                    b3 = 11;
                                } else {
                                    obj14 = obj5;
                                    obj15 = obj4;
                                    obj16 = obj3;
                                }
                                break;
                            default:
                                obj14 = obj5;
                                obj15 = obj4;
                                obj16 = obj3;
                                break;
                        }
                        switch (b3) {
                            case 0:
                                oooOO0O2 = new o0O0O00.OooOO0O();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 1:
                                oooOO0O2 = new o0O0O00.OooOOO0();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 2:
                                oooOO0O2 = new o0O0O00.OooOo00();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 3:
                                oooOO0O2 = new o0O0O00.OooOo();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 4:
                                oooOO0O2 = new o0O0O00.Oooo000();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 5:
                                oooOO0O2 = new o0O0O00.OooO();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 6:
                                oooOO0O2 = new o0O0O00.OooOOO();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 7:
                                oooOO0O2 = new o0O0O00.OooOOOO();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 8:
                                oooOO0O2 = new o0O0O00.OooOO0();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 9:
                                oooOO0O2 = new o0O0O00.OooO0OO();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 10:
                                oooOO0O2 = new o0O0O00.OooO0o();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            case 11:
                                oooOO0O2 = new o0O0O00.OooO00o();
                                obj4 = obj15;
                                oooOO0O2.f27634OooO = j;
                                break;
                            default:
                                obj4 = obj15;
                                oooOO0O2 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it9;
                        String str49 = next5.split(str5)[1];
                        Iterator<OooOOO0> it10 = o00oo2.f27804OooOo0o.iterator();
                        while (it10.hasNext()) {
                            Iterator<OooOOO0> it11 = it10;
                            OooOOO0 next6 = it10.next();
                            String str50 = str43;
                            HashMap<String, ConstraintAttribute> map3 = next6.f27707OooO0Oo;
                            if (map3 != null && (constraintAttribute2 = map3.get(str49)) != null) {
                                sparseArray2.append(next6.f27704OooO00o, constraintAttribute2);
                            }
                            str43 = str50;
                            it10 = it11;
                        }
                        str22 = str43;
                        oooOO0O2 = new o0O0O00.OooO0O0(next5, sparseArray2);
                        obj14 = obj5;
                        obj16 = obj3;
                    }
                    if (oooOO0O2 != null) {
                        oooOO0O2.f27639OooO0o = next5;
                        o00oo2.f27800OooOo.put(next5, oooOO0O2);
                    }
                    obj3 = obj16;
                    str6 = str6;
                    str43 = str22;
                    obj5 = obj14;
                    it9 = it;
                }
            }
            str11 = str43;
            obj6 = obj5;
            Object obj28 = obj3;
            String str51 = str6;
            ArrayList<OooOOO0> arrayList4 = o00oo2.f27804OooOo0o;
            if (arrayList4 != null) {
                Iterator<OooOOO0> it12 = arrayList4.iterator();
                while (it12.hasNext()) {
                    OooOOO0 next7 = it12.next();
                    if (next7 instanceof Oooo0) {
                        Oooo0 oooo0 = (Oooo0) next7;
                        HashMap<String, o0O0O00> map4 = o00oo2.f27800OooOo;
                        Objects.requireNonNull(oooo0);
                        Iterator<String> it13 = map4.keySet().iterator();
                        while (it13.hasNext()) {
                            it12 = it12;
                            String next8 = it13.next();
                            o0O0O00 o0o0o00 = map4.get(next8);
                            if (o0o0o00 != null) {
                                HashMap<String, o0O0O00> map5 = map4;
                                if (next8.startsWith("CUSTOM")) {
                                    ConstraintAttribute constraintAttribute4 = oooo0.f27707OooO0Oo.get(next8.substring(7));
                                    if (constraintAttribute4 != null) {
                                        o0O0O00.OooO0O0 oooO0O2 = (o0O0O00.OooO0O0) o0o0o00;
                                        Iterator<String> it14 = it13;
                                        int i8 = oooo0.f27704OooO00o;
                                        HashMap<String, Integer> map6 = map;
                                        float f = oooo0.f27755OooOOoo;
                                        int i9 = oooo0.f27753OooOOo;
                                        Object obj29 = obj28;
                                        float f2 = oooo0.f27756OooOo00;
                                        oooO0O2.f27919OooOO0o.append(i8, constraintAttribute4);
                                        oooO0O2.f27921OooOOO0.append(i8, new float[]{f, f2});
                                        oooO0O2.f27636OooO0O0 = Math.max(oooO0O2.f27636OooO0O0, i9);
                                        it13 = it14;
                                        oooo0 = oooo0;
                                        map4 = map5;
                                        map = map6;
                                        obj28 = obj29;
                                    } else {
                                        map4 = map5;
                                    }
                                } else {
                                    HashMap<String, Integer> map7 = map;
                                    Object obj30 = obj28;
                                    Oooo0 oooo1 = oooo0;
                                    Iterator<String> it15 = it13;
                                    switch (next8.hashCode()) {
                                        case -1249320806:
                                            str21 = str51;
                                            obj10 = obj4;
                                            obj11 = obj30;
                                            b2 = next8.equals(obj10) ? (byte) 0 : (byte) -1;
                                            break;
                                        case -1249320805:
                                            str21 = str51;
                                            obj11 = obj30;
                                            if (next8.equals(obj11)) {
                                                obj10 = obj4;
                                                b2 = 1;
                                            } else {
                                                obj10 = obj4;
                                            }
                                            break;
                                        case -1225497657:
                                            str21 = str51;
                                            if (next8.equals(obj6)) {
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 2;
                                            } else {
                                                obj11 = obj30;
                                                obj10 = obj4;
                                            }
                                            break;
                                        case -1225497656:
                                            str21 = str51;
                                            if (next8.equals(str21)) {
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 3;
                                            } else {
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        case -1225497655:
                                            if (next8.equals(str7)) {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 4;
                                            } else {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        case -1001078227:
                                            if (next8.equals(obj)) {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 5;
                                            } else {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        case -908189618:
                                            if (next8.equals(obj2)) {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 6;
                                            } else {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        case -908189617:
                                            if (next8.equals(str8)) {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 7;
                                            } else {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        case -40300674:
                                            if (next8.equals("rotation")) {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 8;
                                            } else {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        case -4379043:
                                            if (next8.equals("elevation")) {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 9;
                                            } else {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        case 37232917:
                                            if (next8.equals("transitionPathRotate")) {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 10;
                                            } else {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        case 92909918:
                                            if (next8.equals("alpha")) {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                                b2 = 11;
                                            } else {
                                                str21 = str51;
                                                obj10 = obj4;
                                                obj11 = obj30;
                                            }
                                            break;
                                        default:
                                            str21 = str51;
                                            obj10 = obj4;
                                            obj11 = obj30;
                                            break;
                                    }
                                    switch (b2) {
                                        case 0:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27741OooO)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27741OooO, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 1:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27746OooOO0)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27746OooOO0, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 2:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27749OooOOO)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27749OooOOO, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 3:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27751OooOOOO)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27751OooOOOO, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 4:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27752OooOOOo)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27752OooOOOo, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 5:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27754OooOOo0)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27754OooOOo0, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 6:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27748OooOO0o)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27748OooOO0o, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 7:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27750OooOOO0)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27750OooOOO0, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 8:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27745OooO0oo)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27745OooO0oo, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 9:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27744OooO0oO)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27744OooO0oO, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 10:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            if (!Float.isNaN(oooo0.f27747OooOO0O)) {
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27747OooOO0O, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        case 11:
                                            oooo0 = oooo1;
                                            if (Float.isNaN(oooo0.f27742OooO0o)) {
                                                obj12 = obj11;
                                                obj13 = obj10;
                                            } else {
                                                obj13 = obj10;
                                                obj12 = obj11;
                                                o0o0o00.OooO0O0(oooo0.f27704OooO00o, oooo0.f27742OooO0o, oooo0.f27755OooOOoo, oooo0.f27753OooOOo, oooo0.f27756OooOo00);
                                            }
                                            break;
                                        default:
                                            oooo0 = oooo1;
                                            obj12 = obj11;
                                            obj13 = obj10;
                                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + next8 + "\"");
                                            break;
                                    }
                                    it13 = it15;
                                    obj28 = obj12;
                                    map4 = map5;
                                    map = map7;
                                    obj4 = obj13;
                                    str51 = str21;
                                }
                            }
                        }
                    }
                    it12 = it12;
                    obj28 = obj28;
                    map = map;
                    obj4 = obj4;
                    str51 = str51;
                    o00oo2 = this;
                }
            }
            HashMap<String, Integer> map8 = map;
            str12 = str51;
            obj7 = obj4;
            obj8 = obj28;
            o00oo1 = this;
            for (String str52 : o00oo1.f27800OooOo.keySet()) {
                HashMap<String, Integer> map9 = map8;
                o00oo1.f27800OooOo.get(str52).OooO0OO(map9.containsKey(str52) ? map9.get(str52).intValue() : 0);
                map8 = map9;
            }
        }
        int size = o00oo1.f27801OooOo0.size() + 2;
        o00oO0o[] o00oo0oArr2 = new o00oO0o[size];
        o00oo0oArr2[0] = o00oo1.f27786OooO0o;
        o00oo0oArr2[size - 1] = o00oo1.f27788OooO0oO;
        if (o00oo1.f27801OooOo0.size() > 0 && o00oo1.f27787OooO0o0 == -1) {
            o00oo1.f27787OooO0o0 = 0;
        }
        Iterator<o00oO0o> it16 = o00oo1.f27801OooOo0.iterator();
        int i10 = 1;
        while (it16.hasNext()) {
            o00oo0oArr2[i10] = it16.next();
            i10++;
        }
        HashSet hashSet7 = new HashSet();
        Iterator<String> it17 = o00oo1.f27788OooO0oO.f27828Ooooo0o.keySet().iterator();
        while (it17.hasNext()) {
            String next9 = it17.next();
            Iterator<String> it18 = it17;
            if (o00oo1.f27786OooO0o.f27828Ooooo0o.containsKey(next9)) {
                StringBuilder sb = new StringBuilder();
                obj9 = obj6;
                sb.append(str11);
                sb.append(next9);
                hashSet3 = hashSet;
                if (!hashSet3.contains(sb.toString())) {
                    hashSet7.add(next9);
                }
            } else {
                obj9 = obj6;
                hashSet3 = hashSet;
            }
            it17 = it18;
            hashSet = hashSet3;
            obj6 = obj9;
        }
        Object obj31 = obj6;
        String[] strArr = (String[]) hashSet7.toArray(new String[0]);
        o00oo1.f27797OooOOo = strArr;
        o00oo1.f27799OooOOoo = new int[strArr.length];
        int i11 = 0;
        while (true) {
            String[] strArr2 = o00oo1.f27797OooOOo;
            if (i11 < strArr2.length) {
                String str53 = strArr2[i11];
                o00oo1.f27799OooOOoo[i11] = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    if (o00oo0oArr2[i12].f27828Ooooo0o.containsKey(str53) && (constraintAttribute = o00oo0oArr2[i12].f27828Ooooo0o.get(str53)) != null) {
                        int[] iArr = o00oo1.f27799OooOOoo;
                        iArr[i11] = constraintAttribute.OooO0Oo() + iArr[i11];
                        break;
                    }
                }
                i11++;
            } else {
                boolean z = o00oo0oArr2[0].f27824OoooOo0 != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i13 = 1;
                while (i13 < size) {
                    String str54 = str12;
                    o00oO0o o00oo0o3 = o00oo0oArr2[i13];
                    String str55 = str7;
                    o00oO0o o00oo0o4 = o00oo0oArr2[i13 - 1];
                    Object obj32 = obj2;
                    boolean zOooO0O0 = o00oo0o3.OooO0O0(o00oo0o3.f27817OoooO, o00oo0o4.f27817OoooO);
                    String str56 = str8;
                    boolean zOooO0O1 = o00oo0o3.OooO0O0(o00oo0o3.f27821OoooOO0, o00oo0o4.f27821OoooOO0);
                    zArr[0] = zArr[0] | o00oo0o3.OooO0O0(o00oo0o3.f27820OoooO0O, o00oo0o4.f27820OoooO0O);
                    boolean z2 = zOooO0O1 | zOooO0O0 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | o00oo0o3.OooO0O0(o00oo0o3.f27832o000oOoO, o00oo0o4.f27832o000oOoO);
                    zArr[4] = o00oo0o3.OooO0O0(o00oo0o3.f27822OoooOOO, o00oo0o4.f27822OoooOOO) | zArr[4];
                    i13++;
                    str12 = str54;
                    obj = obj;
                    obj2 = obj32;
                    str32 = str32;
                    str31 = str31;
                    str7 = str55;
                    str8 = str56;
                }
                String str57 = str12;
                String str58 = str7;
                String str59 = str8;
                Object obj33 = obj2;
                Object obj34 = obj;
                String str60 = str31;
                String str61 = str32;
                int i14 = 0;
                for (int i15 = 1; i15 < length; i15++) {
                    if (zArr[i15]) {
                        i14++;
                    }
                }
                o00oo1.f27795OooOOOO = new int[i14];
                int iMax = Math.max(2, i14);
                o00oo1.f27796OooOOOo = new double[iMax];
                o00oo1.f27798OooOOo0 = new double[iMax];
                int i16 = 0;
                for (int i17 = 1; i17 < length; i17++) {
                    if (zArr[i17]) {
                        o00oo1.f27795OooOOOO[i16] = i17;
                        i16++;
                    }
                }
                char c = 0;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) double.class, size, o00oo1.f27795OooOOOO.length);
                double[] dArr2 = new double[size];
                int i18 = 0;
                while (i18 < size) {
                    o00oO0o o00oo0o5 = o00oo0oArr2[i18];
                    double[] dArr3 = dArr[i18];
                    float[] fArr = new float[6];
                    fArr[c] = o00oo0o5.f27820OoooO0O;
                    fArr[1] = o00oo0o5.f27817OoooO;
                    fArr[2] = o00oo0o5.f27821OoooOO0;
                    fArr[3] = o00oo0o5.f27832o000oOoO;
                    fArr[4] = o00oo0o5.f27822OoooOOO;
                    fArr[5] = o00oo0o5.f27823OoooOOo;
                    int i19 = 0;
                    int i20 = 0;
                    for (int[] iArr2 = o00oo1.f27795OooOOOO; i19 < iArr2.length; iArr2 = iArr2) {
                        if (iArr2[i19] < 6) {
                            dArr3[i20] = fArr[iArr2[i19]];
                            i20++;
                        }
                        i19++;
                        str33 = str33;
                    }
                    dArr2[i18] = o00oo0oArr2[i18].f27818OoooO0;
                    i18++;
                    c = 0;
                }
                String str62 = str33;
                int i21 = 0;
                while (true) {
                    int[] iArr3 = o00oo1.f27795OooOOOO;
                    if (i21 < iArr3.length) {
                        int i22 = iArr3[i21];
                        String[] strArr3 = o00oO0o.f27815Oooooo0;
                        if (i22 < 6) {
                            String strOooO00o = OooO00o.OooO00o.OooO00o(new StringBuilder(), strArr3[o00oo1.f27795OooOOOO[i21]], " [");
                            for (int i23 = 0; i23 < size; i23++) {
                                StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0(strOooO00o);
                                sbOooO0O1.append(dArr[i23][i21]);
                                strOooO00o = sbOooO0O1.toString();
                            }
                        }
                        i21++;
                    } else {
                        o00oo1.f27790OooOO0 = new o000000[o00oo1.f27797OooOOo.length + 1];
                        int i24 = 0;
                        while (true) {
                            String[] strArr4 = o00oo1.f27797OooOOo;
                            if (i24 >= strArr4.length) {
                                int i25 = size;
                                o00oO0o[] o00oo0oArr3 = o00oo0oArr2;
                                o00oo1.f27790OooOO0[0] = o000000.OooO00o(o00oo1.f27787OooO0o0, dArr2, dArr);
                                if (o00oo0oArr3[0].f27824OoooOo0 != -1) {
                                    int[] iArr4 = new int[i25];
                                    double[] dArr4 = new double[i25];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) double.class, i25, 2);
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        iArr4[i26] = o00oo0oArr3[i26].f27824OoooOo0;
                                        dArr4[i26] = o00oo0oArr3[i26].f27818OoooO0;
                                        dArr5[i26][0] = o00oo0oArr3[i26].f27817OoooO;
                                        dArr5[i26][1] = o00oo0oArr3[i26].f27821OoooOO0;
                                    }
                                    o00oo1.f27791OooOO0O = new o000OOo(iArr4, dArr4, dArr5);
                                }
                                float f3 = Float.NaN;
                                o00oo1.f27805OooOoO = new HashMap<>();
                                if (o00oo1.f27804OooOo0o != null) {
                                    Iterator<String> it19 = hashSet2.iterator();
                                    while (it19.hasNext()) {
                                        String next10 = it19.next();
                                        if (next10.startsWith("CUSTOM")) {
                                            it19 = it19;
                                            oooO0O0 = new o0OO00O.OooO0O0();
                                            str62 = str62;
                                            obj31 = obj31;
                                            str57 = str57;
                                            str10 = str10;
                                            str13 = str9;
                                            obj34 = obj34;
                                            obj33 = obj33;
                                            str14 = str61;
                                            str15 = str60;
                                            str16 = str58;
                                            str17 = str59;
                                        } else {
                                            switch (next10.hashCode()) {
                                                case -1249320806:
                                                    it19 = it19;
                                                    str62 = str62;
                                                    obj7 = obj7;
                                                    obj31 = obj31;
                                                    str57 = str57;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    obj34 = obj34;
                                                    obj33 = obj33;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str16 = str58;
                                                    str17 = str59;
                                                    b = next10.equals(obj7) ? (byte) 0 : (byte) -1;
                                                    break;
                                                case -1249320805:
                                                    it19 = it19;
                                                    str62 = str62;
                                                    Object obj35 = obj8;
                                                    obj31 = obj31;
                                                    str57 = str57;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    obj34 = obj34;
                                                    obj33 = obj33;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str16 = str58;
                                                    str17 = str59;
                                                    if (next10.equals(obj35)) {
                                                        b = 1;
                                                        obj8 = obj35;
                                                        obj7 = obj7;
                                                    } else {
                                                        obj8 = obj35;
                                                        obj7 = obj7;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    str62 = str62;
                                                    obj31 = obj31;
                                                    str57 = str57;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    obj34 = obj34;
                                                    obj33 = obj33;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str16 = str58;
                                                    str17 = str59;
                                                    if (next10.equals(obj31)) {
                                                        b = 2;
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                    } else {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                    }
                                                    break;
                                                case -1225497656:
                                                    str62 = str62;
                                                    str57 = str57;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    obj34 = obj34;
                                                    obj33 = obj33;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str16 = str58;
                                                    str17 = str59;
                                                    if (next10.equals(str57)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        b = 3;
                                                    } else {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                    }
                                                    break;
                                                case -1225497655:
                                                    str62 = str62;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    obj34 = obj34;
                                                    obj33 = obj33;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str16 = str58;
                                                    str17 = str59;
                                                    if (next10.equals(str16)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        b = 4;
                                                    } else {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                    }
                                                    break;
                                                case -1001078227:
                                                    str62 = str62;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    obj34 = obj34;
                                                    obj33 = obj33;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str17 = str59;
                                                    if (next10.equals(obj34)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str16 = str58;
                                                        b = 5;
                                                    } else {
                                                        str16 = str58;
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                    }
                                                    break;
                                                case -908189618:
                                                    str62 = str62;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    obj33 = obj33;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str17 = str59;
                                                    if (next10.equals(obj33)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        obj34 = obj34;
                                                        str16 = str58;
                                                        b = 6;
                                                    } else {
                                                        obj34 = obj34;
                                                        str16 = str58;
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                    }
                                                    break;
                                                case -908189617:
                                                    str62 = str62;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str17 = str59;
                                                    if (next10.equals(str17)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        obj34 = obj34;
                                                        obj33 = obj33;
                                                        str16 = str58;
                                                        b = 7;
                                                    } else {
                                                        obj33 = obj33;
                                                        obj34 = obj34;
                                                        str16 = str58;
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                    }
                                                    break;
                                                case -797520672:
                                                    str62 = str62;
                                                    str10 = str10;
                                                    str13 = str9;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    if (next10.equals(str13)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        obj34 = obj34;
                                                        obj33 = obj33;
                                                        str16 = str58;
                                                        str17 = str59;
                                                        b = 8;
                                                    } else {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str16 = str58;
                                                        str17 = str59;
                                                    }
                                                    break;
                                                case -40300674:
                                                    str62 = str62;
                                                    str10 = str10;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    if (next10.equals(str14)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str13 = str9;
                                                        obj34 = obj34;
                                                        obj33 = obj33;
                                                        str16 = str58;
                                                        str17 = str59;
                                                        b = 9;
                                                    } else {
                                                        str13 = str9;
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str16 = str58;
                                                        str17 = str59;
                                                    }
                                                    break;
                                                case -4379043:
                                                    str62 = str62;
                                                    str10 = str10;
                                                    str15 = str60;
                                                    if (next10.equals(str15)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str13 = str9;
                                                        obj34 = obj34;
                                                        obj33 = obj33;
                                                        str14 = str61;
                                                        str16 = str58;
                                                        str17 = str59;
                                                        b = 10;
                                                    } else {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str13 = str9;
                                                        str14 = str61;
                                                        str16 = str58;
                                                        str17 = str59;
                                                    }
                                                    break;
                                                case 37232917:
                                                    str62 = str62;
                                                    str10 = str10;
                                                    if (next10.equals(str62)) {
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str13 = str9;
                                                        obj34 = obj34;
                                                        obj33 = obj33;
                                                        str14 = str61;
                                                        str15 = str60;
                                                        str16 = str58;
                                                        str17 = str59;
                                                        b = 11;
                                                    } else {
                                                        str15 = str60;
                                                        it19 = it19;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str13 = str9;
                                                        str14 = str61;
                                                        str16 = str58;
                                                        str17 = str59;
                                                    }
                                                    break;
                                                case 92909918:
                                                    str10 = str10;
                                                    if (next10.equals(str30)) {
                                                        it19 = it19;
                                                        str62 = str62;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str13 = str9;
                                                        obj34 = obj34;
                                                        obj33 = obj33;
                                                        str14 = str61;
                                                        str15 = str60;
                                                        str16 = str58;
                                                        str17 = str59;
                                                        b = 12;
                                                    } else {
                                                        str13 = str9;
                                                        str14 = str61;
                                                        str15 = str60;
                                                        str16 = str58;
                                                        str17 = str59;
                                                    }
                                                    break;
                                                case 156108012:
                                                    str10 = str10;
                                                    if (next10.equals(str10)) {
                                                        it19 = it19;
                                                        str62 = str62;
                                                        obj7 = obj7;
                                                        obj31 = obj31;
                                                        str57 = str57;
                                                        str13 = str9;
                                                        obj34 = obj34;
                                                        obj33 = obj33;
                                                        str14 = str61;
                                                        str15 = str60;
                                                        str16 = str58;
                                                        str17 = str59;
                                                        b = bz.k;
                                                    } else {
                                                        str13 = str9;
                                                        str14 = str61;
                                                        str15 = str60;
                                                        str16 = str58;
                                                        str17 = str59;
                                                    }
                                                    break;
                                                default:
                                                    str10 = str10;
                                                    str13 = str9;
                                                    str14 = str61;
                                                    str15 = str60;
                                                    str16 = str58;
                                                    str17 = str59;
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                    oooOO0O = new o0OO00O.OooOO0O();
                                                    break;
                                                case 1:
                                                    oooOO0O = new o0OO00O.OooOOO0();
                                                    break;
                                                case 2:
                                                    oooOO0O = new o0OO00O.OooOo00();
                                                    break;
                                                case 3:
                                                    oooOO0O = new o0OO00O.OooOo();
                                                    break;
                                                case 4:
                                                    oooOO0O = new o0OO00O.Oooo000();
                                                    break;
                                                case 5:
                                                    oooOO0O = new o0OO00O.OooO();
                                                    break;
                                                case 6:
                                                    oooOO0O = new o0OO00O.OooOOO();
                                                    break;
                                                case 7:
                                                    oooOO0O = new o0OO00O.OooOOOO();
                                                    break;
                                                case 8:
                                                    oooOO0O = new o0OO00O.OooO00o();
                                                    break;
                                                case 9:
                                                    oooOO0O = new o0OO00O.OooOO0();
                                                    break;
                                                case 10:
                                                    oooOO0O = new o0OO00O.OooO0OO();
                                                    break;
                                                case 11:
                                                    oooOO0O = new o0OO00O.OooO0o();
                                                    break;
                                                case 12:
                                                    oooOO0O = new o0OO00O.OooO00o();
                                                    break;
                                                case 13:
                                                    oooOO0O = new o0OO00O.OooO00o();
                                                    break;
                                                default:
                                                    oooOO0O = null;
                                                    break;
                                            }
                                            obj7 = obj7;
                                            oooO0O0 = oooOO0O;
                                        }
                                        if (oooO0O0 == null) {
                                            str15 = str15;
                                            str14 = str14;
                                            str18 = str13;
                                            str19 = str30;
                                            str20 = str17;
                                        } else {
                                            if ((oooO0O0.f27591OooO0o0 == 1) && Float.isNaN(f3)) {
                                                float[] fArr2 = new float[2];
                                                float f4 = 1.0f / 99;
                                                double d = 0.0d;
                                                float fHypot = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                                double d2 = 0.0d;
                                                int i27 = 0;
                                                while (i27 < 100) {
                                                    float f5 = i27 * f4;
                                                    String str63 = str13;
                                                    String str64 = str30;
                                                    double d3 = f5;
                                                    float f6 = f4;
                                                    o000000O o000000o2 = o00oo1.f27786OooO0o.f27816Oooo;
                                                    Iterator<o00oO0o> it20 = o00oo1.f27801OooOo0.iterator();
                                                    float f7 = Float.NaN;
                                                    float f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                                    o000000O o000000o3 = o000000o2;
                                                    while (it20.hasNext()) {
                                                        o00oO0o next11 = it20.next();
                                                        Iterator<o00oO0o> it21 = it20;
                                                        o000000O o000000o4 = next11.f27816Oooo;
                                                        if (o000000o4 != null) {
                                                            float f9 = next11.f27818OoooO0;
                                                            if (f9 < f5) {
                                                                f8 = f9;
                                                                o000000o3 = o000000o4;
                                                            } else if (Float.isNaN(f7)) {
                                                                f7 = next11.f27818OoooO0;
                                                            }
                                                        }
                                                        it20 = it21;
                                                    }
                                                    if (o000000o3 != null) {
                                                        if (Float.isNaN(f7)) {
                                                            f7 = 1.0f;
                                                        }
                                                        float f10 = f7 - f8;
                                                        dOooO00o = (((float) o000000o3.OooO00o((f5 - f8) / f10)) * f10) + f8;
                                                    } else {
                                                        dOooO00o = d3;
                                                    }
                                                    o00oo1.f27790OooOO0[0].OooO0OO(dOooO00o, o00oo1.f27796OooOOOo);
                                                    String str65 = str17;
                                                    o00oo1.f27786OooO0o.OooO0Oo(dOooO00o, o00oo1.f27795OooOOOO, o00oo1.f27796OooOOOo, fArr2, 0);
                                                    if (i27 > 0) {
                                                        fHypot = (float) (Math.hypot(d - ((double) fArr2[1]), d2 - ((double) fArr2[0])) + ((double) fHypot));
                                                    }
                                                    i27++;
                                                    f4 = f6;
                                                    d2 = fArr2[0];
                                                    d = fArr2[1];
                                                    str30 = str64;
                                                    str13 = str63;
                                                    str17 = str65;
                                                }
                                                str18 = str13;
                                                str19 = str30;
                                                str20 = str17;
                                                f3 = fHypot;
                                            } else {
                                                str18 = str13;
                                                str19 = str30;
                                                str20 = str17;
                                            }
                                            oooO0O0.f27587OooO0O0 = next10;
                                            o00oo1.f27805OooOoO.put(next10, oooO0O0);
                                        }
                                        it19 = it19;
                                        obj33 = obj33;
                                        obj34 = obj34;
                                        str58 = str16;
                                        str57 = str57;
                                        obj31 = obj31;
                                        str60 = str15;
                                        str61 = str14;
                                        str30 = str19;
                                        str9 = str18;
                                        str59 = str20;
                                    }
                                    for (OooOOO0 oooOOO1 : o00oo1.f27804OooOo0o) {
                                        if (oooOOO1 instanceof OooOOOO) {
                                            ((OooOOOO) oooOOO1).OooO0oo(o00oo1.f27805OooOoO);
                                        }
                                    }
                                    Iterator<o0OO00O> it22 = o00oo1.f27805OooOoO.values().iterator();
                                    while (it22.hasNext()) {
                                        it22.next().OooO0Oo();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str66 = strArr4[i24];
                            int i28 = 0;
                            int i29 = 0;
                            double[] dArr6 = null;
                            double[][] dArr7 = null;
                            while (i28 < size) {
                                if (o00oo0oArr2[i28].f27828Ooooo0o.containsKey(str66)) {
                                    if (dArr7 == null) {
                                        dArr6 = new double[size];
                                        ConstraintAttribute constraintAttribute5 = o00oo0oArr2[i28].f27828Ooooo0o.get(str66);
                                        dArr7 = (double[][]) Array.newInstance((Class<?>) double.class, size, constraintAttribute5 == null ? 0 : constraintAttribute5.OooO0Oo());
                                    }
                                    dArr6[i29] = o00oo0oArr2[i28].f27818OoooO0;
                                    o00oO0o o00oo0o6 = o00oo0oArr2[i28];
                                    double[] dArr8 = dArr7[i29];
                                    ConstraintAttribute constraintAttribute6 = o00oo0o6.f27828Ooooo0o.get(str66);
                                    if (constraintAttribute6 == null) {
                                        i3 = size;
                                        o00oo0oArr = o00oo0oArr2;
                                        dArr6 = dArr6;
                                        dArr7 = dArr7;
                                    } else {
                                        if (constraintAttribute6.OooO0Oo() == 1) {
                                            dArr8[0] = constraintAttribute6.OooO00o();
                                        } else {
                                            int iOooO0Oo = constraintAttribute6.OooO0Oo();
                                            float[] fArr3 = new float[iOooO0Oo];
                                            constraintAttribute6.OooO0O0(fArr3);
                                            int i30 = 0;
                                            int i31 = 0;
                                            while (i30 < iOooO0Oo) {
                                                dArr8[i31] = fArr3[i30];
                                                i30++;
                                                iOooO0Oo = iOooO0Oo;
                                                i31++;
                                                size = size;
                                                o00oo0oArr2 = o00oo0oArr2;
                                            }
                                        }
                                        i3 = size;
                                        o00oo0oArr = o00oo0oArr2;
                                    }
                                    i29++;
                                    dArr6 = dArr6;
                                    dArr7 = dArr7;
                                } else {
                                    str66 = str66;
                                    i3 = size;
                                    o00oo0oArr = o00oo0oArr2;
                                }
                                i28++;
                                str66 = str66;
                                size = i3;
                                o00oo0oArr2 = o00oo0oArr;
                            }
                            i24++;
                            o00oo1.f27790OooOO0[i24] = o000000.OooO00o(o00oo1.f27787OooO0o0, Arrays.copyOf(dArr6, i29), (double[][]) Arrays.copyOf(dArr7, i29));
                            size = size;
                            o00oo0oArr2 = o00oo0oArr2;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0(" start: x: ");
        sbOooO0O0.append(this.f27786OooO0o.f27817OoooO);
        sbOooO0O0.append(" y: ");
        sbOooO0O0.append(this.f27786OooO0o.f27821OoooOO0);
        sbOooO0O0.append(" end: x: ");
        sbOooO0O0.append(this.f27788OooO0oO.f27817OoooO);
        sbOooO0O0.append(" y: ");
        sbOooO0O0.append(this.f27788OooO0oO.f27821OoooOO0);
        return sbOooO0O0.toString();
    }
}
