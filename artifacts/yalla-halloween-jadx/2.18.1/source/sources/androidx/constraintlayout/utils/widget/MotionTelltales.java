package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.HashMap;
import p057o0000Oo0.o000;
import p057o0000Oo0.o000OOo;
import p060o0000o.o00Oo0;
import p060o0000o.o00Ooo;
import p060o0000o.o00oO0o;
import p063o0000o0o.o0OO00O;
import p063o0000o0o.oo0o0Oo;
import p065o0000oO0.o000O00;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public Paint f7470OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public MotionLayout f7471OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float[] f7472OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Matrix f7473OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f7474Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f7475Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f7476OooooO0;

    public MotionTelltales(Context context) {
        super(context);
        this.f7470OoooOOo = new Paint();
        this.f7472OoooOoO = new float[2];
        this.f7473OoooOoo = new Matrix();
        this.f7474Ooooo00 = 0;
        this.f7475Ooooo0o = -65281;
        this.f7476OooooO0 = 0.25f;
        OooO00o(context, null);
    }

    private void OooO00o(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000O00.MotionTelltales);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.MotionTelltales_telltales_tailColor) {
                    this.f7475Ooooo0o = typedArrayObtainStyledAttributes.getColor(index, this.f7475Ooooo0o);
                } else if (index == o000O00.MotionTelltales_telltales_velocityMode) {
                    this.f7474Ooooo00 = typedArrayObtainStyledAttributes.getInt(index, this.f7474Ooooo00);
                } else if (index == o000O00.MotionTelltales_telltales_tailScale) {
                    this.f7476OooooO0 = typedArrayObtainStyledAttributes.getFloat(index, this.f7476OooooO0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f7470OoooOOo.setColor(this.f7475Ooooo0o);
        this.f7470OoooOOo.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int i3;
        float[] fArr;
        float f2;
        double[] dArr;
        float f3;
        super.onDraw(canvas);
        getMatrix().invert(this.f7473OoooOoo);
        if (this.f7471OoooOo0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f7471OoooOo0 = (MotionLayout) parent;
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
            float f4 = fArr2[i5];
            int i6 = 0;
            while (i6 < i4) {
                float f5 = fArr2[i6];
                MotionLayout motionLayout = motionTelltales.f7471OoooOo0;
                float[] fArr3 = motionTelltales.f7472OoooOoO;
                int i7 = motionTelltales.f7474Ooooo00;
                float fOooO00o = motionLayout.f7147Oooo;
                float interpolation = motionLayout.f7160OoooOoo;
                if (motionLayout.f7149Oooo0oO != null) {
                    float fSignum = Math.signum(motionLayout.f7162Ooooo0o - interpolation);
                    float interpolation2 = motionLayout.f7149Oooo0oO.getInterpolation(motionLayout.f7160OoooOoo + 1.0E-5f);
                    interpolation = motionLayout.f7149Oooo0oO.getInterpolation(motionLayout.f7160OoooOoo);
                    fOooO00o = (((interpolation2 - interpolation) / 1.0E-5f) * fSignum) / motionLayout.f7158OoooOo0;
                }
                o00Ooo o00ooo2 = motionLayout.f7149Oooo0oO;
                if (o00ooo2 instanceof o00Ooo) {
                    fOooO00o = o00ooo2.OooO00o();
                }
                float f6 = fOooO00o;
                o00Oo0 o00oo1 = motionLayout.f7156OoooOOO.get(motionTelltales);
                if ((i7 & 1) == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float fOooO0O0 = o00oo1.OooO0O0(interpolation, o00oo1.f27783OooOo0O);
                    HashMap<String, oo0o0Oo> map = o00oo1.f27786OooOoO0;
                    oo0o0Oo oo0o0oo = map == null ? null : map.get("translationX");
                    HashMap<String, oo0o0Oo> map2 = o00oo1.f27786OooOoO0;
                    int i8 = i7;
                    oo0o0Oo oo0o0oo2 = map2 == null ? null : map2.get("translationY");
                    HashMap<String, oo0o0Oo> map3 = o00oo1.f27786OooOoO0;
                    i2 = i5;
                    oo0o0Oo oo0o0oo3 = map3 == null ? null : map3.get("rotation");
                    HashMap<String, oo0o0Oo> map4 = o00oo1.f27786OooOoO0;
                    i = width;
                    oo0o0Oo oo0o0oo4 = map4 == null ? null : map4.get("scaleX");
                    HashMap<String, oo0o0Oo> map5 = o00oo1.f27786OooOoO0;
                    f = f6;
                    oo0o0Oo oo0o0oo5 = map5 == null ? null : map5.get("scaleY");
                    HashMap<String, o0OO00O> map6 = o00oo1.f27785OooOoO;
                    o0OO00O o0oo00o2 = map6 == null ? null : map6.get("translationX");
                    HashMap<String, o0OO00O> map7 = o00oo1.f27785OooOoO;
                    o0OO00O o0oo00o3 = map7 == null ? null : map7.get("translationY");
                    HashMap<String, o0OO00O> map8 = o00oo1.f27785OooOoO;
                    o0OO00O o0oo00o4 = map8 == null ? null : map8.get("rotation");
                    HashMap<String, o0OO00O> map9 = o00oo1.f27785OooOoO;
                    o0OO00O o0oo00o5 = map9 == null ? null : map9.get("scaleX");
                    HashMap<String, o0OO00O> map10 = o00oo1.f27785OooOoO;
                    o0OO00O o0oo00o6 = map10 != null ? map10.get("scaleY") : null;
                    o000 o000Var = new o000();
                    float[] fArr4 = fArr3;
                    o000Var.f27550OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    o000Var.f27548OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    o000Var.f27547OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    o000Var.f27546OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    o000Var.f27545OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                    if (oo0o0oo3 != null) {
                        o000Var.f27550OooO0o0 = oo0o0oo3.OooO0O0(fOooO0O0);
                        o000Var.f27549OooO0o = oo0o0oo3.OooO00o(fOooO0O0);
                    }
                    if (oo0o0oo != null) {
                        o000Var.f27547OooO0OO = oo0o0oo.OooO0O0(fOooO0O0);
                    }
                    if (oo0o0oo2 != null) {
                        o000Var.f27548OooO0Oo = oo0o0oo2.OooO0O0(fOooO0O0);
                    }
                    if (oo0o0oo4 != null) {
                        o000Var.f27545OooO00o = oo0o0oo4.OooO0O0(fOooO0O0);
                    }
                    if (oo0o0oo5 != null) {
                        o000Var.f27546OooO0O0 = oo0o0oo5.OooO0O0(fOooO0O0);
                    }
                    if (o0oo00o4 != null) {
                        o000Var.f27550OooO0o0 = o0oo00o4.OooO0O0(fOooO0O0);
                    }
                    if (o0oo00o2 != null) {
                        o000Var.f27547OooO0OO = o0oo00o2.OooO0O0(fOooO0O0);
                    }
                    if (o0oo00o3 != null) {
                        o000Var.f27548OooO0Oo = o0oo00o3.OooO0O0(fOooO0O0);
                    }
                    if (o0oo00o5 != null) {
                        o000Var.f27545OooO00o = o0oo00o5.OooO0O0(fOooO0O0);
                    }
                    if (o0oo00o6 != null) {
                        o000Var.f27546OooO0O0 = o0oo00o6.OooO0O0(fOooO0O0);
                    }
                    o000OOo o000ooo2 = o00oo1.f27771OooOO0O;
                    if (o000ooo2 != null) {
                        double[] dArr2 = o00oo1.f27776OooOOOo;
                        if (dArr2.length > 0) {
                            double d = fOooO0O0;
                            o000ooo2.OooO0OO(d, dArr2);
                            o00oo1.f27771OooOO0O.OooO0o(d, o00oo1.f27778OooOOo0);
                            o00oo1.f27766OooO0o.OooO0o(f5, f4, fArr4, o00oo1.f27775OooOOOO, o00oo1.f27778OooOOo0, o00oo1.f27776OooOOOo);
                        }
                        o000Var.OooO00o(f5, f4, width2, height2, fArr4);
                        f3 = f5;
                    } else {
                        i6 = i6;
                        if (o00oo1.f27770OooOO0 != null) {
                            double dOooO0O0 = o00oo1.OooO0O0(fOooO0O0, o00oo1.f27783OooOo0O);
                            o00oo1.f27770OooOO0[0].OooO0o(dOooO0O0, o00oo1.f27778OooOOo0);
                            o00oo1.f27770OooOO0[0].OooO0OO(dOooO0O0, o00oo1.f27776OooOOOo);
                            float f7 = o00oo1.f27783OooOo0O[0];
                            int i9 = 0;
                            while (true) {
                                dArr = o00oo1.f27778OooOOo0;
                                if (i9 >= dArr.length) {
                                    break;
                                }
                                dArr[i9] = dArr[i9] * ((double) f7);
                                i9++;
                            }
                            i8 = i8;
                            fArr4 = fArr4;
                            f3 = f5;
                            o00oo1.f27766OooO0o.OooO0o(f5, f4, fArr4, o00oo1.f27775OooOOOO, dArr, o00oo1.f27776OooOOOo);
                            o000Var.OooO00o(f3, f4, width2, height2, fArr4);
                        } else {
                            o00oO0o o00oo0o2 = o00oo1.f27768OooO0oO;
                            float f8 = o00oo0o2.f27802OoooO00;
                            o00oO0o o00oo0o3 = o00oo1.f27766OooO0o;
                            o0OO00O o0oo00o7 = o0oo00o5;
                            float f9 = f8 - o00oo0o3.f27802OoooO00;
                            o0OO00O o0oo00o8 = o0oo00o3;
                            float f10 = o00oo0o2.f27801OoooO0 - o00oo0o3.f27801OoooO0;
                            o0OO00O o0oo00o9 = o0oo00o2;
                            float f11 = o00oo0o2.f27803OoooO0O - o00oo0o3.f27803OoooO0O;
                            float f12 = (o00oo0o2.f27800OoooO - o00oo0o3.f27800OoooO) + f10;
                            fArr4[0] = ((f11 + f9) * f5) + ((1.0f - f5) * f9);
                            fArr4[1] = (f12 * f4) + ((1.0f - f4) * f10);
                            o000Var.f27550OooO0o0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            o000Var.f27548OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            o000Var.f27547OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            o000Var.f27546OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            o000Var.f27545OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            if (oo0o0oo3 != null) {
                                o000Var.f27550OooO0o0 = oo0o0oo3.OooO0O0(fOooO0O0);
                                o000Var.f27549OooO0o = oo0o0oo3.OooO00o(fOooO0O0);
                            }
                            if (oo0o0oo != null) {
                                o000Var.f27547OooO0OO = oo0o0oo.OooO0O0(fOooO0O0);
                            }
                            if (oo0o0oo2 != null) {
                                o000Var.f27548OooO0Oo = oo0o0oo2.OooO0O0(fOooO0O0);
                            }
                            if (oo0o0oo4 != null) {
                                o000Var.f27545OooO00o = oo0o0oo4.OooO0O0(fOooO0O0);
                            }
                            if (oo0o0oo5 != null) {
                                o000Var.f27546OooO0O0 = oo0o0oo5.OooO0O0(fOooO0O0);
                            }
                            if (o0oo00o4 != null) {
                                o000Var.f27550OooO0o0 = o0oo00o4.OooO0O0(fOooO0O0);
                            }
                            if (o0oo00o9 != null) {
                                o000Var.f27547OooO0OO = o0oo00o9.OooO0O0(fOooO0O0);
                            }
                            if (o0oo00o8 != null) {
                                o000Var.f27548OooO0Oo = o0oo00o8.OooO0O0(fOooO0O0);
                            }
                            if (o0oo00o7 != null) {
                                o000Var.f27545OooO00o = o0oo00o7.OooO0O0(fOooO0O0);
                            }
                            if (o0oo00o6 != null) {
                                o000Var.f27546OooO0O0 = o0oo00o6.OooO0O0(fOooO0O0);
                            }
                            i3 = i8;
                            fArr = fArr4;
                            f2 = f5;
                            o000Var.OooO00o(f5, f4, width2, height2, fArr);
                        }
                    }
                    f2 = f3;
                    i3 = i8;
                    fArr = fArr4;
                } else {
                    i = width;
                    height = height;
                    f = f6;
                    fArr2 = fArr2;
                    i2 = i5;
                    i3 = i7;
                    fArr = fArr3;
                    f2 = f5;
                    i6 = i6;
                    o00oo1.OooO0Oo(interpolation, f2, f4, fArr);
                }
                if (i3 < 2) {
                    fArr[0] = fArr[0] * f;
                    fArr[1] = fArr[1] * f;
                }
                this.f7473OoooOoo.mapVectors(this.f7472OoooOoO);
                width = i;
                float f13 = width * f2;
                height = height;
                float f14 = height * f4;
                float[] fArr5 = this.f7472OoooOoO;
                float f15 = fArr5[0];
                float f16 = this.f7476OooooO0;
                float f17 = f14 - (fArr5[1] * f16);
                this.f7473OoooOoo.mapVectors(fArr5);
                canvas.drawLine(f13, f14, f13 - (f15 * f16), f17, this.f7470OoooOOo);
                i6++;
                motionTelltales = this;
                fArr2 = fArr2;
                i5 = i2;
                i4 = 5;
            }
            i5++;
            i4 = 5;
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f7409OoooO0 = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7470OoooOOo = new Paint();
        this.f7472OoooOoO = new float[2];
        this.f7473OoooOoo = new Matrix();
        this.f7474Ooooo00 = 0;
        this.f7475Ooooo0o = -65281;
        this.f7476OooooO0 = 0.25f;
        OooO00o(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7470OoooOOo = new Paint();
        this.f7472OoooOoO = new float[2];
        this.f7473OoooOoo = new Matrix();
        this.f7474Ooooo00 = 0;
        this.f7475Ooooo0o = -65281;
        this.f7476OooooO0 = 0.25f;
        OooO00o(context, attributeSet);
    }
}
