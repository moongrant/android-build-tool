package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.OooO;
import java.util.HashMap;
import o000000.OooO0OO;
import o000000.OooO0o;
import o000000O.Oooo0;
import o000000O.o000oOoO;
import o000000O.o0OoOo0;
import p413o0Oo0oo.OooOo;
import p413o0Oo0oo.o000OOo;
import p413o0Oo0oo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Paint f4895OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public MotionLayout f4896OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Matrix f4897OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final float[] f4898OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f4899OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public float f4900OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f4901OooOo00;

    public MotionTelltales(Context context) {
        super(context);
        this.f4895OooOOOO = new Paint();
        this.f4898OooOOo0 = new float[2];
        this.f4897OooOOo = new Matrix();
        this.f4899OooOOoo = 0;
        this.f4901OooOo00 = -65281;
        this.f4900OooOo0 = 0.25f;
        OooO00o(context, null);
    }

    private void OooO00o(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO.MotionTelltales);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == OooO.MotionTelltales_telltales_tailColor) {
                    this.f4901OooOo00 = typedArrayObtainStyledAttributes.getColor(index, this.f4901OooOo00);
                } else if (index == OooO.MotionTelltales_telltales_velocityMode) {
                    this.f4899OooOOoo = typedArrayObtainStyledAttributes.getInt(index, this.f4899OooOOoo);
                } else if (index == OooO.MotionTelltales_telltales_tailScale) {
                    this.f4900OooOo0 = typedArrayObtainStyledAttributes.getFloat(index, this.f4900OooOo0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.f4901OooOo00;
        Paint paint = this.f4895OooOOOO;
        paint.setColor(i2);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        double[] dArr;
        super.onDraw(canvas);
        Matrix matrix = getMatrix();
        Matrix matrix2 = this.f4897OooOOo;
        matrix.invert(matrix2);
        if (this.f4896OooOOOo == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f4896OooOOOo = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i4 = 5;
        float[] fArr2 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        MotionTelltales motionTelltales = this;
        int i5 = 0;
        while (i5 < i4) {
            float f = fArr2[i5];
            int i6 = 0;
            while (i6 < i4) {
                float f2 = fArr2[i6];
                MotionLayout motionLayout = motionTelltales.f4896OooOOOo;
                float[] fArr3 = motionTelltales.f4898OooOOo0;
                int i7 = motionTelltales.f4899OooOOoo;
                float fOooO00o = motionLayout.f4577OooO0oO;
                float f3 = motionLayout.f4586OooOOo;
                if (motionLayout.f4576OooO0o0 != null) {
                    float fSignum = Math.signum(motionLayout.f4591OooOo00 - f3);
                    float interpolation = motionLayout.f4576OooO0o0.getInterpolation(motionLayout.f4586OooOOo + 1.0E-5f);
                    float interpolation2 = motionLayout.f4576OooO0o0.getInterpolation(motionLayout.f4586OooOOo);
                    fOooO00o = (((interpolation - interpolation2) / 1.0E-5f) * fSignum) / motionLayout.f4585OooOOOo;
                    f3 = interpolation2;
                }
                o000oOoO o000oooo2 = motionLayout.f4576OooO0o0;
                if (o000oooo2 instanceof o000oOoO) {
                    fOooO00o = o000oooo2.OooO00o();
                }
                float f4 = fOooO00o;
                Oooo0 oooo0 = motionLayout.f4582OooOOO.get(motionTelltales);
                if ((i7 & 1) == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float[] fArr4 = oooo0.f33882OooOo0O;
                    float fOooO0O0 = oooo0.OooO0O0(f3, fArr4);
                    HashMap<String, OooO0o> map = oooo0.f33885OooOoO0;
                    OooO0o oooO0o = map == null ? null : map.get("translationX");
                    HashMap<String, OooO0o> map2 = oooo0.f33885OooOoO0;
                    i2 = i5;
                    OooO0o oooO0o2 = map2 == null ? null : map2.get("translationY");
                    HashMap<String, OooO0o> map3 = oooo0.f33885OooOoO0;
                    i = width;
                    OooO0o oooO0o3 = map3 == null ? null : map3.get("rotation");
                    HashMap<String, OooO0o> map4 = oooo0.f33885OooOoO0;
                    OooO0o oooO0o4 = map4 == null ? null : map4.get("scaleX");
                    HashMap<String, OooO0o> map5 = oooo0.f33885OooOoO0;
                    OooO0o oooO0o5 = map5 == null ? null : map5.get("scaleY");
                    HashMap<String, OooO0OO> map6 = oooo0.f33884OooOoO;
                    OooO0OO oooO0OO = map6 == null ? null : map6.get("translationX");
                    HashMap<String, OooO0OO> map7 = oooo0.f33884OooOoO;
                    OooO0OO oooO0OO2 = map7 == null ? null : map7.get("translationY");
                    HashMap<String, OooO0OO> map8 = oooo0.f33884OooOoO;
                    OooO0OO oooO0OO3 = map8 == null ? null : map8.get("rotation");
                    HashMap<String, OooO0OO> map9 = oooo0.f33884OooOoO;
                    OooO0OO oooO0OO4 = map9 == null ? null : map9.get("scaleX");
                    HashMap<String, OooO0OO> map10 = oooo0.f33884OooOoO;
                    OooO0OO oooO0OO5 = map10 != null ? map10.get("scaleY") : null;
                    o000OOo o000ooo2 = new o000OOo();
                    o000ooo2.f45293OooO0o0 = 0.0f;
                    o000ooo2.f45291OooO0Oo = 0.0f;
                    o000ooo2.f45290OooO0OO = 0.0f;
                    o000ooo2.f45289OooO0O0 = 0.0f;
                    o000ooo2.f45288OooO00o = 0.0f;
                    if (oooO0o3 != null) {
                        o000ooo2.f45293OooO0o0 = (float) oooO0o3.f45344OooO00o.OooO0o0(fOooO0O0);
                        o000ooo2.f45292OooO0o = oooO0o3.OooO00o(fOooO0O0);
                    }
                    if (oooO0o != null) {
                        o000ooo2.f45290OooO0OO = (float) oooO0o.f45344OooO00o.OooO0o0(fOooO0O0);
                    }
                    if (oooO0o2 != null) {
                        o000ooo2.f45291OooO0Oo = (float) oooO0o2.f45344OooO00o.OooO0o0(fOooO0O0);
                    }
                    if (oooO0o4 != null) {
                        o000ooo2.f45288OooO00o = (float) oooO0o4.f45344OooO00o.OooO0o0(fOooO0O0);
                    }
                    if (oooO0o5 != null) {
                        o000ooo2.f45289OooO0O0 = (float) oooO0o5.f45344OooO00o.OooO0o0(fOooO0O0);
                    }
                    if (oooO0OO3 != null) {
                        o000ooo2.f45293OooO0o0 = oooO0OO3.OooO0O0(fOooO0O0);
                    }
                    if (oooO0OO != null) {
                        o000ooo2.f45290OooO0OO = oooO0OO.OooO0O0(fOooO0O0);
                    }
                    o00O0O o00o0o2 = oooO0OO2;
                    if (oooO0OO2 != null) {
                        o000ooo2.f45291OooO0Oo = o00o0o2.OooO0O0(fOooO0O0);
                    }
                    if (oooO0OO4 != null) {
                        o000ooo2.f45288OooO00o = oooO0OO4.OooO0O0(fOooO0O0);
                    }
                    if (oooO0OO5 != null) {
                        o000ooo2.f45289OooO0O0 = oooO0OO5.OooO0O0(fOooO0O0);
                    }
                    OooOo oooOo = oooo0.f33870OooOO0O;
                    o0OoOo0 o0oooo0 = oooo0.f33865OooO0o;
                    if (oooOo != null) {
                        double[] dArr2 = oooo0.f33875OooOOOo;
                        if (dArr2.length > 0) {
                            double d = fOooO0O0;
                            oooOo.OooO0OO(d, dArr2);
                            oooo0.f33870OooOO0O.OooO0o(d, oooo0.f33877OooOOo0);
                            int[] iArr = oooo0.f33874OooOOOO;
                            double[] dArr3 = oooo0.f33877OooOOo0;
                            double[] dArr4 = oooo0.f33875OooOOOo;
                            o0oooo0.getClass();
                            o0OoOo0.OooO0o0(f2, f, fArr3, iArr, dArr3, dArr4);
                        }
                        o000ooo2.OooO00o(f2, f, width2, height2, r19);
                        i3 = i7;
                        fArr = fArr3;
                    } else {
                        i3 = i7;
                        i6 = i6;
                        if (oooo0.f33869OooOO0 != null) {
                            double dOooO0O0 = oooo0.OooO0O0(fOooO0O0, fArr4);
                            oooo0.f33869OooOO0[0].OooO0o(dOooO0O0, oooo0.f33877OooOOo0);
                            oooo0.f33869OooOO0[0].OooO0OO(dOooO0O0, oooo0.f33875OooOOOo);
                            float f5 = fArr4[0];
                            int i8 = 0;
                            while (true) {
                                dArr = oooo0.f33877OooOOo0;
                                if (i8 >= dArr.length) {
                                    break;
                                }
                                dArr[i8] = dArr[i8] * ((double) f5);
                                i8++;
                            }
                            int[] iArr2 = oooo0.f33874OooOOOO;
                            double[] dArr5 = oooo0.f33875OooOOOo;
                            o0oooo0.getClass();
                            fArr = fArr3;
                            o0OoOo0.OooO0o0(f2, f, fArr3, iArr2, dArr, dArr5);
                            o000ooo2.OooO00o(f2, f, width2, height2, fArr);
                        } else {
                            o0OoOo0 o0oooo1 = oooo0.f33867OooO0oO;
                            OooO0OO oooO0OO6 = oooO0OO4;
                            float f6 = o0oooo1.f33902OooO0oo - o0oooo0.f33902OooO0oo;
                            float f7 = o0oooo1.f33897OooO - o0oooo0.f33897OooO;
                            OooO0OO oooO0OO7 = oooO0OO;
                            float f8 = o0oooo1.f33903OooOO0 - o0oooo0.f33903OooOO0;
                            float f9 = (o0oooo1.f33904OooOO0O - o0oooo0.f33904OooOO0O) + f7;
                            fArr3[0] = ((f8 + f6) * f2) + ((1.0f - f2) * f6);
                            fArr3[1] = (f9 * f) + ((1.0f - f) * f7);
                            o000ooo2.f45293OooO0o0 = 0.0f;
                            o000ooo2.f45291OooO0Oo = 0.0f;
                            o000ooo2.f45290OooO0OO = 0.0f;
                            o000ooo2.f45289OooO0O0 = 0.0f;
                            o000ooo2.f45288OooO00o = 0.0f;
                            if (oooO0o3 != null) {
                                o000ooo2.f45293OooO0o0 = (float) oooO0o3.f45344OooO00o.OooO0o0(fOooO0O0);
                                o000ooo2.f45292OooO0o = oooO0o3.OooO00o(fOooO0O0);
                            }
                            if (oooO0o != null) {
                                o000ooo2.f45290OooO0OO = (float) oooO0o.f45344OooO00o.OooO0o0(fOooO0O0);
                            }
                            if (oooO0o2 != null) {
                                o000ooo2.f45291OooO0Oo = (float) oooO0o2.f45344OooO00o.OooO0o0(fOooO0O0);
                            }
                            if (oooO0o4 != null) {
                                o000ooo2.f45288OooO00o = (float) oooO0o4.f45344OooO00o.OooO0o0(fOooO0O0);
                            }
                            if (oooO0o5 != null) {
                                o000ooo2.f45289OooO0O0 = (float) oooO0o5.f45344OooO00o.OooO0o0(fOooO0O0);
                            }
                            if (oooO0OO3 != null) {
                                o000ooo2.f45293OooO0o0 = oooO0OO3.OooO0O0(fOooO0O0);
                            }
                            if (oooO0OO7 != null) {
                                o000ooo2.f45290OooO0OO = oooO0OO7.OooO0O0(fOooO0O0);
                            }
                            if (o00o0o2 != null) {
                                o000ooo2.f45291OooO0Oo = o00o0o2.OooO0O0(fOooO0O0);
                            }
                            if (oooO0OO6 != null) {
                                o000ooo2.f45288OooO00o = oooO0OO6.OooO0O0(fOooO0O0);
                            }
                            if (oooO0OO5 != null) {
                                o000ooo2.f45289OooO0O0 = oooO0OO5.OooO0O0(fOooO0O0);
                            }
                            fArr = fArr3;
                            o000ooo2.OooO00o(f2, f, width2, height2, fArr);
                        }
                    }
                } else {
                    i = width;
                    matrix2 = matrix2;
                    height = height;
                    f4 = f4;
                    i2 = i5;
                    i3 = i7;
                    fArr = fArr3;
                    f2 = f2;
                    i6 = i6;
                    oooo0.OooO0Oo(fArr, f3, f2, f);
                }
                if (i3 < 2) {
                    fArr[0] = fArr[0] * f4;
                    fArr[1] = fArr[1] * f4;
                }
                float[] fArr5 = this.f4898OooOOo0;
                matrix2 = matrix2;
                matrix2.mapVectors(fArr5);
                int i9 = i;
                float f10 = i9 * f2;
                int i10 = height;
                float f11 = i10 * f;
                float f12 = fArr5[0];
                float f13 = this.f4900OooOo0;
                float f14 = f11 - (fArr5[1] * f13);
                matrix2.mapVectors(fArr5);
                canvas.drawLine(f10, f11, f10 - (f12 * f13), f14, this.f4895OooOOOO);
                i6++;
                motionTelltales = this;
                width = i9;
                height = i10;
                fArr2 = fArr2;
                i5 = i2;
                i4 = 5;
            }
            i5++;
            height = height;
            fArr2 = fArr2;
            i4 = 5;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f4829OooO = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4895OooOOOO = new Paint();
        this.f4898OooOOo0 = new float[2];
        this.f4897OooOOo = new Matrix();
        this.f4899OooOOoo = 0;
        this.f4901OooOo00 = -65281;
        this.f4900OooOo0 = 0.25f;
        OooO00o(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4895OooOOOO = new Paint();
        this.f4898OooOOo0 = new float[2];
        this.f4897OooOOo = new Matrix();
        this.f4899OooOOoo = 0;
        this.f4901OooOo00 = -65281;
        this.f4900OooOo0 = 0.25f;
        OooO00o(context, attributeSet);
    }
}
