package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.widget.NestedScrollView;
import com.facebook.internal.security.CertificateUtil;
import com.umeng.analytics.pro.bl;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import o000O0O0.o00O0O;
import p057o0000Oo0.o00000;
import p057o0000Oo0.o000000O;
import p057o0000Oo0.o0000O0;
import p057o0000Oo0.o000OOo;
import p060o0000o.o000oOoO;
import p060o0000o.o00Oo0;
import p060o0000o.o00Ooo;
import p060o0000o.o00oO0o;
import p060o0000o.o0OOO0o;
import p060o0000o.o0ooOOo;
import p060o0000o.oo000o;
import p063o0000o0o.o0OO00O;
import p063o0000o0o.o0Oo0oo;
import p063o0000o0o.oo0o0Oo;
import p065o0000oO0.o000O00;
import p065o0000oO0.o000O000;
import p065o0000oO0.o000O00O;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements o00O0O {

    /* JADX INFO: renamed from: o0000OOO, reason: collision with root package name */
    public static boolean f7146o0000OOO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f7147Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.OooO00o f7148Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00Ooo f7149Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Interpolator f7150Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f7151OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f7152OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f7153OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f7154OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f7155OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public HashMap<View, o00Oo0> f7156OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f7157OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f7158OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f7159OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f7160OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public long f7161Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public float f7162Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f7163OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f7164OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public OooOOOO f7165OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public OooOO0 f7166Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public int f7167Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f7168OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public o0Oo0oo f7169Ooooooo;

    /* JADX INFO: renamed from: o0000, reason: collision with root package name */
    public HashMap<View, Object> f7170o0000;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public int f7171o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f7172o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public int f7173o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public int f7174o000000o;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public int f7175o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public int f7176o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public int f7177o00000OO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public float f7178o00000Oo;

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public o00000 f7179o00000o0;

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public OooOOO f7180o00000oO;

    /* JADX INFO: renamed from: o00000oo, reason: collision with root package name */
    public Runnable f7181o00000oo;

    /* JADX INFO: renamed from: o0000O, reason: collision with root package name */
    public View f7182o0000O;

    /* JADX INFO: renamed from: o0000O0, reason: collision with root package name */
    public OooOO0O f7183o0000O0;

    /* JADX INFO: renamed from: o0000O00, reason: collision with root package name */
    public Rect f7184o0000O00;

    /* JADX INFO: renamed from: o0000O0O, reason: collision with root package name */
    public boolean f7185o0000O0O;

    /* JADX INFO: renamed from: o0000OO, reason: collision with root package name */
    public ArrayList<Integer> f7186o0000OO;

    /* JADX INFO: renamed from: o0000OO0, reason: collision with root package name */
    public Matrix f7187o0000OO0;

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public boolean f7188o0000Ooo;

    /* JADX INFO: renamed from: o0000oO, reason: collision with root package name */
    public OooOo00 f7189o0000oO;

    /* JADX INFO: renamed from: o0000oo, reason: collision with root package name */
    public boolean f7190o0000oo;

    /* JADX INFO: renamed from: o000OO, reason: collision with root package name */
    public RectF f7191o000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public float f7192o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f7193o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f7194o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public int f7195o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f7196o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public float f7197o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f7198o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public float f7199o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public float f7200o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public int f7201o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public long f7202o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public CopyOnWriteArrayList<OooOOOO> f7203o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f7204o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public OooO f7205o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public ArrayList<MotionHelper> f7206o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public ArrayList<MotionHelper> f7207o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public ArrayList<MotionHelper> f7208o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public long f7209oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public float f7210oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public p060o0000o.OooOO0 f7211ooOO;

    public class OooO extends o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f7212OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f7213OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f7214OooO0OO;

        public OooO() {
        }

        @Override // p060o0000o.o00Ooo
        public final float OooO00o() {
            return MotionLayout.this.f7147Oooo;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = this.f7212OooO00o;
            if (f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                float f3 = this.f7214OooO0OO;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                MotionLayout.this.f7147Oooo = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f7213OooO0O0;
            }
            float f4 = this.f7214OooO0OO;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            MotionLayout.this.f7147Oooo = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f7213OooO0O0;
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f7180o00000oO.OooO00o();
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f7217Oooo0o;

        public OooO0O0(View view) {
            this.f7217Oooo0o = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7217Oooo0o.setNestedScrollingEnabled(true);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f7180o00000oO.OooO00o();
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f7219OooO00o;

        static {
            int[] iArr = new int[OooOo00.values().length];
            f7219OooO00o = iArr;
            try {
                iArr[OooOo00.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7219OooO00o[OooOo00.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7219OooO00o[OooOo00.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7219OooO00o[OooOo00.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class OooOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Paint f7220OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float[] f7221OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int[] f7222OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float[] f7223OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Path f7224OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Paint f7225OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Paint f7226OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Paint f7227OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Paint f7228OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float[] f7229OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f7230OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Rect f7231OooOO0o = new Rect();

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f7233OooOOO0 = 1;

        public OooOO0() {
            Paint paint = new Paint();
            this.f7226OooO0o0 = paint;
            paint.setAntiAlias(true);
            this.f7226OooO0o0.setColor(-21965);
            this.f7226OooO0o0.setStrokeWidth(2.0f);
            this.f7226OooO0o0.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f7225OooO0o = paint2;
            paint2.setAntiAlias(true);
            this.f7225OooO0o.setColor(-2067046);
            this.f7225OooO0o.setStrokeWidth(2.0f);
            this.f7225OooO0o.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f7227OooO0oO = paint3;
            paint3.setAntiAlias(true);
            this.f7227OooO0oO.setColor(-13391360);
            this.f7227OooO0oO.setStrokeWidth(2.0f);
            this.f7227OooO0oO.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f7228OooO0oo = paint4;
            paint4.setAntiAlias(true);
            this.f7228OooO0oo.setColor(-13391360);
            this.f7228OooO0oo.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f7229OooOO0 = new float[8];
            Paint paint5 = new Paint();
            this.f7220OooO = paint5;
            paint5.setAntiAlias(true);
            this.f7227OooO0oO.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
            this.f7223OooO0OO = new float[100];
            this.f7222OooO0O0 = new int[50];
        }

        public final void OooO00o(Canvas canvas, int i, int i2, o00Oo0 o00oo1) {
            int width;
            int height;
            if (i == 4) {
                boolean z = false;
                boolean z2 = false;
                for (int i3 = 0; i3 < this.f7230OooOO0O; i3++) {
                    int[] iArr = this.f7222OooO0O0;
                    if (iArr[i3] == 1) {
                        z = true;
                    }
                    if (iArr[i3] == 0) {
                        z2 = true;
                    }
                }
                if (z) {
                    OooO0Oo(canvas);
                }
                if (z2) {
                    OooO0O0(canvas);
                }
            }
            if (i == 2) {
                OooO0Oo(canvas);
            }
            if (i == 3) {
                OooO0O0(canvas);
            }
            canvas.drawLines(this.f7221OooO00o, this.f7226OooO0o0);
            View view = o00oo1.f27763OooO0O0;
            if (view != null) {
                width = view.getWidth();
                height = o00oo1.f27763OooO0O0.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i4 = 1;
            while (i4 < i2 - 1) {
                if (i == 4 && this.f7222OooO0O0[i4 - 1] == 0) {
                    i4 = i4;
                } else {
                    float[] fArr = this.f7223OooO0OO;
                    int i5 = i4 * 2;
                    float f = fArr[i5];
                    float f2 = fArr[i5 + 1];
                    this.f7224OooO0Oo.reset();
                    this.f7224OooO0Oo.moveTo(f, f2 + 10.0f);
                    this.f7224OooO0Oo.lineTo(f + 10.0f, f2);
                    this.f7224OooO0Oo.lineTo(f, f2 - 10.0f);
                    this.f7224OooO0Oo.lineTo(f - 10.0f, f2);
                    this.f7224OooO0Oo.close();
                    int i6 = i4 - 1;
                    o00oo1.f27781OooOo0.get(i6);
                    if (i == 4) {
                        int[] iArr2 = this.f7222OooO0O0;
                        if (iArr2[i6] == 1) {
                            OooO0o0(canvas, f - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        } else if (iArr2[i6] == 0) {
                            OooO0OO(canvas, f - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        } else {
                            if (iArr2[i6] == 2) {
                                OooO0o(canvas, f - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, width, height);
                            }
                            canvas.drawPath(this.f7224OooO0Oo, this.f7220OooO);
                        }
                        canvas.drawPath(this.f7224OooO0Oo, this.f7220OooO);
                    } else {
                        f2 = f2;
                        f = f;
                        i4 = i4;
                    }
                    if (i == 2) {
                        OooO0o0(canvas, f - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    }
                    if (i == 3) {
                        OooO0OO(canvas, f - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    }
                    if (i == 6) {
                        OooO0o(canvas, f - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, width, height);
                    }
                    canvas.drawPath(this.f7224OooO0Oo, this.f7220OooO);
                }
                i4++;
            }
            float[] fArr2 = this.f7221OooO00o;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f7225OooO0o);
                float[] fArr3 = this.f7221OooO00o;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f7225OooO0o);
            }
        }

        public final void OooO0O0(Canvas canvas) {
            float[] fArr = this.f7221OooO00o;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f7227OooO0oO);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f7227OooO0oO);
        }

        public final void OooO0OO(Canvas canvas, float f, float f2) {
            float[] fArr = this.f7221OooO00o;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o0.append(((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            String string = sbOooO0o0.toString();
            OooO0oO(string, this.f7228OooO0oo);
            canvas.drawText(string, ((fMin2 / 2.0f) - (this.f7231OooOO0o.width() / 2)) + fMin, f2 - 20.0f, this.f7228OooO0oo);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f7227OooO0oO);
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o1.append(((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
            String string2 = sbOooO0o1.toString();
            OooO0oO(string2, this.f7228OooO0oo);
            canvas.drawText(string2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f7231OooOO0o.height() / 2)), this.f7228OooO0oo);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f7227OooO0oO);
        }

        public final void OooO0Oo(Canvas canvas) {
            float[] fArr = this.f7221OooO00o;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f7227OooO0oO);
        }

        public final void OooO0o(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o0.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i))) + 0.5d)) / 100.0f);
            String string = sbOooO0o0.toString();
            OooO0oO(string, this.f7228OooO0oo);
            canvas.drawText(string, ((f / 2.0f) - (this.f7231OooOO0o.width() / 2)) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2 - 20.0f, this.f7228OooO0oo);
            canvas.drawLine(f, f2, Math.min(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f), f2, this.f7227OooO0oO);
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o1.append(((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i2))) + 0.5d)) / 100.0f);
            String string2 = sbOooO0o1.toString();
            OooO0oO(string2, this.f7228OooO0oo);
            canvas.drawText(string2, f + 5.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE - ((f2 / 2.0f) - (this.f7231OooOO0o.height() / 2)), this.f7228OooO0oo);
            canvas.drawLine(f, f2, f, Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f), this.f7227OooO0oO);
        }

        public final void OooO0o0(Canvas canvas, float f, float f2) {
            float[] fArr = this.f7221OooO00o;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (fHypot * fHypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float fHypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
            sbOooO0o0.append(((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            String string = sbOooO0o0.toString();
            OooO0oO(string, this.f7228OooO0oo);
            canvas.drawTextOnPath(string, path, (fHypot2 / 2.0f) - (this.f7231OooOO0o.width() / 2), -20.0f, this.f7228OooO0oo);
            canvas.drawLine(f, f2, f10, f11, this.f7227OooO0oO);
        }

        public final void OooO0oO(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f7231OooOO0o);
        }
    }

    public class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.OooO0o f7234OooO00o = new androidx.constraintlayout.core.widgets.OooO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.OooO0o f7235OooO0O0 = new androidx.constraintlayout.core.widgets.OooO0o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public androidx.constraintlayout.widget.OooO00o f7236OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public androidx.constraintlayout.widget.OooO00o f7237OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f7238OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f7239OooO0o0;

        public OooOO0O() {
        }

        public final void OooO00o() {
            int i;
            Interpolator interpolatorLoadInterpolator;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f7156OoooOOO.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = MotionLayout.this.getChildAt(i2);
                o00Oo0 o00oo1 = new o00Oo0(childAt);
                int id = childAt.getId();
                iArr[i2] = id;
                sparseArray.put(id, o00oo1);
                MotionLayout.this.f7156OoooOOO.put(childAt, o00oo1);
            }
            int i3 = 0;
            while (i3 < childCount) {
                View childAt2 = MotionLayout.this.getChildAt(i3);
                o00Oo0 o00oo2 = MotionLayout.this.f7156OoooOOO.get(childAt2);
                if (o00oo2 == null) {
                    childCount = childCount;
                    sparseArray = sparseArray;
                    iArr = iArr;
                } else {
                    String str = " (";
                    String str2 = "no widget for  ";
                    String str3 = "MotionLayout";
                    if (this.f7236OooO0OO != null) {
                        ConstraintWidget constraintWidgetOooO0Oo = OooO0Oo(this.f7234OooO00o, childAt2);
                        if (constraintWidgetOooO0Oo != null) {
                            Rect rectOooO0O0 = MotionLayout.OooO0O0(MotionLayout.this, constraintWidgetOooO0Oo);
                            androidx.constraintlayout.widget.OooO00o oooO00o = this.f7236OooO0OO;
                            int width = MotionLayout.this.getWidth();
                            int height = MotionLayout.this.getHeight();
                            int i4 = oooO00o.f7596OooO0OO;
                            if (i4 != 0) {
                                i = i4;
                                o00oo2.OooO0oO(rectOooO0O0, o00oo2.f27762OooO00o, i, width, height);
                            } else {
                                i = i4;
                            }
                            o00oO0o o00oo0o2 = o00oo2.f27766OooO0o;
                            o00oo0o2.f27799Oooo0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            o00oo0o2.f27796Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            o00oo2.OooO0o(o00oo0o2);
                            o00oo2.f27766OooO0o.OooO0o0(rectOooO0O0.left, rectOooO0O0.top, rectOooO0O0.width(), rectOooO0O0.height());
                            androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00oOooO0oo = oooO00o.OooO0oo(o00oo2.f27764OooO0OO);
                            o00oo2.f27766OooO0o.OooO00o(c0043OooO00oOooO0oo);
                            o00oo2.f27772OooOO0o = c0043OooO00oOooO0oo.f7618OooO0Oo.f7712OooO0oO;
                            o00oo2.f27769OooO0oo.OooO0o0(rectOooO0O0, oooO00o, i, o00oo2.f27764OooO0OO);
                            o00oo2.f27788OooOoo = c0043OooO00oOooO0oo.f7619OooO0o.f7601OooO;
                            androidx.constraintlayout.widget.OooO00o.OooO0OO oooO0OO = c0043OooO00oOooO0oo.f7618OooO0Oo;
                            o00oo2.f27791OooOooo = oooO0OO.f7714OooOO0;
                            o00oo2.f27792Oooo000 = oooO0OO.f7705OooO;
                            Context context = o00oo2.f27763OooO0O0.getContext();
                            androidx.constraintlayout.widget.OooO00o.OooO0OO oooO0OO2 = c0043OooO00oOooO0oo.f7618OooO0Oo;
                            int i5 = oooO0OO2.f7716OooOO0o;
                            String str4 = oooO0OO2.f7715OooOO0O;
                            int i6 = oooO0OO2.f7717OooOOO0;
                            if (i5 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i6);
                            } else if (i5 == -1) {
                                interpolatorLoadInterpolator = new p060o0000o.o00O0O(o000000O.OooO0OO(str4));
                            } else if (i5 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i5 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i5 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i5 != 4) {
                                interpolatorLoadInterpolator = i5 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            o00oo2.f27793Oooo00O = interpolatorLoadInterpolator;
                        } else {
                            childCount = childCount;
                            sparseArray = sparseArray;
                            iArr = iArr;
                            str3 = "MotionLayout";
                            str2 = "no widget for  ";
                            str = " (";
                            if (MotionLayout.this.f7167Oooooo0 != 0) {
                                Log.e(str3, p060o0000o.OooO.OooO0O0() + str2 + p060o0000o.OooO.OooO0Oo(childAt2) + str + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        childCount = childCount;
                        sparseArray = sparseArray;
                        iArr = iArr;
                        str3 = "MotionLayout";
                        str2 = "no widget for  ";
                        str = " (";
                        Objects.requireNonNull(MotionLayout.this);
                    }
                    if (this.f7237OooO0Oo != null) {
                        ConstraintWidget constraintWidgetOooO0Oo2 = OooO0Oo(this.f7235OooO0O0, childAt2);
                        if (constraintWidgetOooO0Oo2 != null) {
                            Rect rectOooO0O1 = MotionLayout.OooO0O0(MotionLayout.this, constraintWidgetOooO0Oo2);
                            androidx.constraintlayout.widget.OooO00o oooO00o2 = this.f7237OooO0Oo;
                            int width2 = MotionLayout.this.getWidth();
                            int height2 = MotionLayout.this.getHeight();
                            int i7 = oooO00o2.f7596OooO0OO;
                            if (i7 != 0) {
                                o00oo2.OooO0oO(rectOooO0O1, o00oo2.f27762OooO00o, i7, width2, height2);
                                rectOooO0O1 = o00oo2.f27762OooO00o;
                            }
                            o00oO0o o00oo0o3 = o00oo2.f27768OooO0oO;
                            o00oo0o3.f27799Oooo0oo = 1.0f;
                            o00oo0o3.f27796Oooo = 1.0f;
                            o00oo2.OooO0o(o00oo0o3);
                            o00oo2.f27768OooO0oO.OooO0o0(rectOooO0O1.left, rectOooO0O1.top, rectOooO0O1.width(), rectOooO0O1.height());
                            o00oo2.f27768OooO0oO.OooO00o(oooO00o2.OooO0oo(o00oo2.f27764OooO0OO));
                            o00oo2.f27761OooO.OooO0o0(rectOooO0O1, oooO00o2, i7, o00oo2.f27764OooO0OO);
                        } else if (MotionLayout.this.f7167Oooooo0 != 0) {
                            Log.e(str3, p060o0000o.OooO.OooO0O0() + str2 + p060o0000o.OooO.OooO0Oo(childAt2) + str + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i3++;
                childCount = childCount;
                sparseArray = sparseArray;
                iArr = iArr;
            }
            SparseArray sparseArray2 = sparseArray;
            int[] iArr2 = iArr;
            int i8 = 0;
            while (i8 < childCount) {
                SparseArray sparseArray3 = sparseArray2;
                o00Oo0 o00oo3 = (o00Oo0) sparseArray3.get(iArr2[i8]);
                int i9 = o00oo3.f27766OooO0o.f27805OoooOOO;
                if (i9 != -1) {
                    o00Oo0 o00oo4 = (o00Oo0) sparseArray3.get(i9);
                    o00oo3.f27766OooO0o.OooO0oO(o00oo4, o00oo4.f27766OooO0o);
                    o00oo3.f27768OooO0oO.OooO0oO(o00oo4, o00oo4.f27768OooO0oO);
                }
                i8++;
                sparseArray2 = sparseArray3;
            }
        }

        public final void OooO0O0(int i, int i2) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f7152OoooO0 == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.f7235OooO0O0;
                androidx.constraintlayout.widget.OooO00o oooO00o = this.f7237OooO0Oo;
                motionLayout2.resolveSystem(oooO0o, optimizationLevel, (oooO00o == null || oooO00o.f7596OooO0OO == 0) ? i : i2, (oooO00o == null || oooO00o.f7596OooO0OO == 0) ? i2 : i);
                androidx.constraintlayout.widget.OooO00o oooO00o2 = this.f7236OooO0OO;
                if (oooO00o2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.f7234OooO00o;
                    int i3 = oooO00o2.f7596OooO0OO;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout3.resolveSystem(oooO0o2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.OooO00o oooO00o3 = this.f7236OooO0OO;
            if (oooO00o3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                androidx.constraintlayout.core.widgets.OooO0o oooO0o3 = this.f7234OooO00o;
                int i5 = oooO00o3.f7596OooO0OO;
                motionLayout4.resolveSystem(oooO0o3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            androidx.constraintlayout.core.widgets.OooO0o oooO0o4 = this.f7235OooO0O0;
            androidx.constraintlayout.widget.OooO00o oooO00o4 = this.f7237OooO0Oo;
            int i6 = (oooO00o4 == null || oooO00o4.f7596OooO0OO == 0) ? i : i2;
            if (oooO00o4 == null || oooO00o4.f7596OooO0OO == 0) {
                i = i2;
            }
            motionLayout5.resolveSystem(oooO0o4, optimizationLevel, i6, i);
        }

        public final void OooO0OO(androidx.constraintlayout.core.widgets.OooO0o oooO0o, androidx.constraintlayout.core.widgets.OooO0o oooO0o2) {
            ConstraintWidget oooOO0O;
            ArrayList<ConstraintWidget> arrayList = oooO0o.f27656o0OOO0o;
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(oooO0o, oooO0o2);
            oooO0o2.f27656o0OOO0o.clear();
            oooO0o2.OooOO0o(oooO0o, map);
            for (ConstraintWidget constraintWidget : arrayList) {
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o) {
                    oooOO0O = new androidx.constraintlayout.core.widgets.OooO00o();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooOO0) {
                    oooOO0O = new androidx.constraintlayout.core.widgets.OooOO0();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO) {
                    oooOO0O = new androidx.constraintlayout.core.widgets.OooO();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooOOO0) {
                    oooOO0O = new androidx.constraintlayout.core.widgets.OooOOO0();
                } else {
                    oooOO0O = constraintWidget instanceof p058o0000OoO.OooOO0 ? new p058o0000OoO.OooOO0O() : new ConstraintWidget();
                }
                oooO0o2.OooO0O0(oooOO0O);
                map.put(constraintWidget, oooOO0O);
            }
            for (ConstraintWidget constraintWidget2 : arrayList) {
                map.get(constraintWidget2).OooOO0o(constraintWidget2, map);
            }
        }

        public final ConstraintWidget OooO0Oo(androidx.constraintlayout.core.widgets.OooO0o oooO0o, View view) {
            if (oooO0o.f6960Ooooooo == view) {
                return oooO0o;
            }
            ArrayList<ConstraintWidget> arrayList = oooO0o.f27656o0OOO0o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                if (constraintWidget.f6960Ooooooo == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void OooO0o() {
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.f7151OoooO;
            int i2 = motionLayout.f7155OoooOO0;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout2 = MotionLayout.this;
            motionLayout2.f7175o00000O = mode;
            motionLayout2.f7177o00000OO = mode2;
            motionLayout2.getOptimizationLevel();
            OooO0O0(i, i2);
            int i3 = 0;
            boolean z = true;
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                OooO0O0(i, i2);
                MotionLayout.this.f7173o000000O = this.f7234OooO00o.OooOoO0();
                MotionLayout.this.f7174o000000o = this.f7234OooO00o.OooOOo();
                MotionLayout.this.f7171o00000 = this.f7235OooO0O0.OooOoO0();
                MotionLayout.this.f7176o00000O0 = this.f7235OooO0O0.OooOOo();
                MotionLayout motionLayout3 = MotionLayout.this;
                motionLayout3.f7172o000000 = (motionLayout3.f7173o000000O == motionLayout3.f7171o00000 && motionLayout3.f7174o000000o == motionLayout3.f7176o00000O0) ? false : true;
            }
            MotionLayout motionLayout4 = MotionLayout.this;
            int i4 = motionLayout4.f7173o000000O;
            int i5 = motionLayout4.f7174o000000o;
            int i6 = motionLayout4.f7175o00000O;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout4.f7178o00000Oo * (motionLayout4.f7171o00000 - i4)) + i4);
            }
            int i7 = motionLayout4.f7177o00000OO;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout4.f7178o00000Oo * (motionLayout4.f7176o00000O0 - i5)) + i5);
            }
            int i8 = i5;
            androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.f7234OooO00o;
            motionLayout4.resolveMeasuredDimension(i, i2, i4, i8, oooO0o.f7050o00000o0 || this.f7235OooO0O0.f7050o00000o0, oooO0o.f7054o0000Ooo || this.f7235OooO0O0.f7054o0000Ooo);
            MotionLayout motionLayout5 = MotionLayout.this;
            int childCount = motionLayout5.getChildCount();
            motionLayout5.f7183o0000O0.OooO00o();
            motionLayout5.f7164OooooOO = true;
            SparseArray sparseArray = new SparseArray();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = motionLayout5.getChildAt(i9);
                sparseArray.put(childAt.getId(), motionLayout5.f7156OoooOOO.get(childAt));
            }
            int width = motionLayout5.getWidth();
            int height = motionLayout5.getHeight();
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 = motionLayout5.f7148Oooo0o.f7251OooO0OO;
            int i10 = oooO0O0 != null ? oooO0O0.f7283OooOOOo : -1;
            if (i10 != -1) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    o00Oo0 o00oo1 = motionLayout5.f7156OoooOOO.get(motionLayout5.getChildAt(i11));
                    if (o00oo1 != null) {
                        o00oo1.f27789OooOoo0 = i10;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[motionLayout5.f7156OoooOOO.size()];
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                o00Oo0 o00oo2 = motionLayout5.f7156OoooOOO.get(motionLayout5.getChildAt(i13));
                int i14 = o00oo2.f27766OooO0o.f27805OoooOOO;
                if (i14 != -1) {
                    sparseBooleanArray.put(i14, true);
                    iArr[i12] = o00oo2.f27766OooO0o.f27805OoooOOO;
                    i12++;
                }
            }
            if (motionLayout5.f7208o0ooOoO != null) {
                for (int i15 = 0; i15 < i12; i15++) {
                    o00Oo0 o00oo3 = motionLayout5.f7156OoooOOO.get(motionLayout5.findViewById(iArr[i15]));
                    if (o00oo3 != null) {
                        motionLayout5.f7148Oooo0o.OooO0oO(o00oo3);
                    }
                }
                Iterator<MotionHelper> it = motionLayout5.f7208o0ooOoO.iterator();
                while (it.hasNext()) {
                    it.next().OooOo0(motionLayout5, motionLayout5.f7156OoooOOO);
                }
                for (int i16 = 0; i16 < i12; i16++) {
                    o00Oo0 o00oo4 = motionLayout5.f7156OoooOOO.get(motionLayout5.findViewById(iArr[i16]));
                    if (o00oo4 != null) {
                        o00oo4.OooO0oo(width, height, motionLayout5.getNanoTime());
                    }
                }
            } else {
                for (int i17 = 0; i17 < i12; i17++) {
                    o00Oo0 o00oo5 = motionLayout5.f7156OoooOOO.get(motionLayout5.findViewById(iArr[i17]));
                    if (o00oo5 != null) {
                        motionLayout5.f7148Oooo0o.OooO0oO(o00oo5);
                        o00oo5.OooO0oo(width, height, motionLayout5.getNanoTime());
                    }
                }
            }
            for (int i18 = 0; i18 < childCount; i18++) {
                View childAt2 = motionLayout5.getChildAt(i18);
                o00Oo0 o00oo6 = motionLayout5.f7156OoooOOO.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && o00oo6 != null) {
                    motionLayout5.f7148Oooo0o.OooO0oO(o00oo6);
                    o00oo6.OooO0oo(width, height, motionLayout5.getNanoTime());
                }
            }
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = motionLayout5.f7148Oooo0o.f7251OooO0OO;
            float f = oooO0O1 != null ? oooO0O1.f7268OooO : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                boolean z2 = ((double) f) < 0.0d;
                float fAbs = Math.abs(f);
                float fMin = Float.MAX_VALUE;
                float fMax = -3.4028235E38f;
                int i19 = 0;
                float fMin2 = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                while (true) {
                    if (i19 >= childCount) {
                        z = false;
                        break;
                    }
                    o00Oo0 o00oo7 = motionLayout5.f7156OoooOOO.get(motionLayout5.getChildAt(i19));
                    if (!Float.isNaN(o00oo7.f27772OooOO0o)) {
                        break;
                    }
                    o00oO0o o00oo0o2 = o00oo7.f27768OooO0oO;
                    float f2 = o00oo0o2.f27802OoooO00;
                    float f3 = o00oo0o2.f27801OoooO0;
                    float f4 = z2 ? f3 - f2 : f3 + f2;
                    fMin2 = Math.min(fMin2, f4);
                    fMax2 = Math.max(fMax2, f4);
                    i19++;
                }
                if (!z) {
                    while (i3 < childCount) {
                        o00Oo0 o00oo8 = motionLayout5.f7156OoooOOO.get(motionLayout5.getChildAt(i3));
                        o00oO0o o00oo0o3 = o00oo8.f27768OooO0oO;
                        float f5 = o00oo0o3.f27802OoooO00;
                        float f6 = o00oo0o3.f27801OoooO0;
                        float f7 = z2 ? f6 - f5 : f6 + f5;
                        o00oo8.f27773OooOOO = 1.0f / (1.0f - fAbs);
                        o00oo8.f27774OooOOO0 = fAbs - (((f7 - fMin2) * fAbs) / (fMax2 - fMin2));
                        i3++;
                    }
                    return;
                }
                for (int i20 = 0; i20 < childCount; i20++) {
                    o00Oo0 o00oo9 = motionLayout5.f7156OoooOOO.get(motionLayout5.getChildAt(i20));
                    if (!Float.isNaN(o00oo9.f27772OooOO0o)) {
                        fMin = Math.min(fMin, o00oo9.f27772OooOO0o);
                        fMax = Math.max(fMax, o00oo9.f27772OooOO0o);
                    }
                }
                while (i3 < childCount) {
                    o00Oo0 o00oo10 = motionLayout5.f7156OoooOOO.get(motionLayout5.getChildAt(i3));
                    if (!Float.isNaN(o00oo10.f27772OooOO0o)) {
                        o00oo10.f27773OooOOO = 1.0f / (1.0f - fAbs);
                        if (z2) {
                            o00oo10.f27774OooOOO0 = fAbs - (((fMax - o00oo10.f27772OooOO0o) / (fMax - fMin)) * fAbs);
                        } else {
                            o00oo10.f27774OooOOO0 = fAbs - (((o00oo10.f27772OooOO0o - fMin) * fAbs) / (fMax - fMin));
                        }
                    }
                    i3++;
                }
            }
        }

        public final void OooO0o0(androidx.constraintlayout.widget.OooO00o oooO00o, androidx.constraintlayout.widget.OooO00o oooO00o2) {
            this.f7236OooO0OO = oooO00o;
            this.f7237OooO0Oo = oooO00o2;
            this.f7234OooO00o = new androidx.constraintlayout.core.widgets.OooO0o();
            this.f7235OooO0O0 = new androidx.constraintlayout.core.widgets.OooO0o();
            androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.f7234OooO00o;
            MotionLayout motionLayout = MotionLayout.this;
            boolean z = MotionLayout.f7146o0000OOO;
            oooO0o.oo000o(motionLayout.mLayoutWidget.f7058o0O0O00);
            this.f7235OooO0O0.oo000o(MotionLayout.this.mLayoutWidget.f7058o0O0O00);
            this.f7234OooO00o.OooooOo();
            this.f7235OooO0O0.OooooOo();
            OooO0OO(MotionLayout.this.mLayoutWidget, this.f7234OooO00o);
            OooO0OO(MotionLayout.this.mLayoutWidget, this.f7235OooO0O0);
            if (MotionLayout.this.f7160OoooOoo > 0.5d) {
                if (oooO00o != null) {
                    OooO0oO(this.f7234OooO00o, oooO00o);
                }
                OooO0oO(this.f7235OooO0O0, oooO00o2);
            } else {
                OooO0oO(this.f7235OooO0O0, oooO00o2);
                if (oooO00o != null) {
                    OooO0oO(this.f7234OooO00o, oooO00o);
                }
            }
            this.f7234OooO00o.f7057o000OOo = MotionLayout.this.isRtl();
            this.f7234OooO00o.o00oO0O();
            this.f7235OooO0O0.f7057o000OOo = MotionLayout.this.isRtl();
            this.f7235OooO0O0.o00oO0O();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.f7234OooO00o;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    oooO0o2.o000oOoO(dimensionBehaviour);
                    this.f7235OooO0O0.o000oOoO(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.OooO0o oooO0o3 = this.f7234OooO00o;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    oooO0o3.OoooOoO(dimensionBehaviour2);
                    this.f7235OooO0O0.OoooOoO(dimensionBehaviour2);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0oO(androidx.constraintlayout.core.widgets.OooO0o oooO0o, androidx.constraintlayout.widget.OooO00o oooO00o) {
            androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o;
            androidx.constraintlayout.widget.OooO00o.C0043OooO00o c0043OooO00o2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, oooO0o);
            sparseArray.put(MotionLayout.this.getId(), oooO0o);
            if (oooO00o != null && oooO00o.f7596OooO0OO != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.f7235OooO0O0;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824);
                boolean z = MotionLayout.f7146o0000OOO;
                motionLayout.resolveSystem(oooO0o2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            for (ConstraintWidget constraintWidget : oooO0o.f27656o0OOO0o) {
                constraintWidget.f6974ooOO = true;
                sparseArray.put(((View) constraintWidget.f6960Ooooooo).getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : oooO0o.f27656o0OOO0o) {
                View view = (View) constraintWidget2.f6960Ooooooo;
                int id = view.getId();
                if (oooO00o.f7598OooO0o.containsKey(Integer.valueOf(id)) && (c0043OooO00o2 = oooO00o.f7598OooO0o.get(Integer.valueOf(id))) != null) {
                    c0043OooO00o2.OooO00o(layoutParams);
                }
                constraintWidget2.Ooooo00(oooO00o.OooO0oo(view.getId()).f7620OooO0o0.f7639OooO0OO);
                constraintWidget2.OoooOO0(oooO00o.OooO0oo(view.getId()).f7620OooO0o0.f7640OooO0Oo);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id2 = constraintHelper.getId();
                    if (oooO00o.f7598OooO0o.containsKey(Integer.valueOf(id2)) && (c0043OooO00o = oooO00o.f7598OooO0o.get(Integer.valueOf(id2))) != null && (constraintWidget2 instanceof p058o0000OoO.OooOO0O)) {
                        constraintHelper.OooOOOO(c0043OooO00o, (p058o0000OoO.OooOO0O) constraintWidget2, layoutParams, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).OooOo00();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout motionLayout2 = MotionLayout.this;
                boolean z2 = MotionLayout.f7146o0000OOO;
                motionLayout2.applyConstraintsFromLayoutParams(false, view, constraintWidget2, layoutParams, sparseArray);
                if (oooO00o.OooO0oo(view.getId()).f7617OooO0OO.f7720OooO0OO == 1) {
                    constraintWidget2.f6969o0OoOo0 = view.getVisibility();
                } else {
                    constraintWidget2.f6969o0OoOo0 = oooO00o.OooO0oo(view.getId()).f7617OooO0OO.f7719OooO0O0;
                }
            }
            for (ConstraintWidget constraintWidget3 : oooO0o.f27656o0OOO0o) {
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooOOO) {
                    ConstraintHelper constraintHelper2 = (ConstraintHelper) constraintWidget3.f6960Ooooooo;
                    p058o0000OoO.OooOO0 oooOO1 = (p058o0000OoO.OooOO0) constraintWidget3;
                    constraintHelper2.OooOOoo(oooOO1, sparseArray);
                    androidx.constraintlayout.core.widgets.OooOOO oooOOO = (androidx.constraintlayout.core.widgets.OooOOO) oooOO1;
                    for (int i = 0; i < oooOOO.f27655o0Oo0oo; i++) {
                        ConstraintWidget constraintWidget4 = oooOOO.f27654o0OOO0o[i];
                        if (constraintWidget4 != null) {
                            constraintWidget4.f6932Oooo0 = true;
                        }
                    }
                }
            }
        }
    }

    public class OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f7241OooO00o = Float.NaN;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f7242OooO0O0 = Float.NaN;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7243OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7244OooO0Oo = -1;

        public OooOOO() {
        }

        public final void OooO00o() {
            int i = this.f7243OooO0OO;
            if (i != -1 || this.f7244OooO0Oo != -1) {
                if (i == -1) {
                    MotionLayout.this.OooOoO0(this.f7244OooO0Oo);
                } else {
                    int i2 = this.f7244OooO0Oo;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.OooOo0O(i, i2);
                    }
                }
                MotionLayout.this.setState(OooOo00.SETUP);
            }
            if (Float.isNaN(this.f7242OooO0O0)) {
                if (Float.isNaN(this.f7241OooO00o)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f7241OooO00o);
                return;
            }
            MotionLayout motionLayout = MotionLayout.this;
            float f = this.f7241OooO00o;
            float f2 = this.f7242OooO0O0;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f);
                motionLayout.setState(OooOo00.MOVING);
                motionLayout.f7147Oooo = f2;
                if (f2 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    motionLayout.OooO0OO(f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f);
                } else if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f != 1.0f) {
                    motionLayout.OooO0OO(f <= 0.5f ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f);
                }
            } else {
                if (motionLayout.f7180o00000oO == null) {
                    motionLayout.f7180o00000oO = motionLayout.new OooOOO();
                }
                OooOOO oooOOO = motionLayout.f7180o00000oO;
                oooOOO.f7241OooO00o = f;
                oooOOO.f7242OooO0O0 = f2;
            }
            this.f7241OooO00o = Float.NaN;
            this.f7242OooO0O0 = Float.NaN;
            this.f7243OooO0OO = -1;
            this.f7244OooO0Oo = -1;
        }
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static OooOOO0 f7246OooO0O0 = new OooOOO0();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public VelocityTracker f7247OooO00o;

        public final void OooO00o(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.f7247OooO00o;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public final void OooO0O0(int i) {
            VelocityTracker velocityTracker = this.f7247OooO00o;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        public final float OooO0OO() {
            VelocityTracker velocityTracker = this.f7247OooO00o;
            return velocityTracker != null ? velocityTracker.getXVelocity() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        public final float OooO0Oo() {
            VelocityTracker velocityTracker = this.f7247OooO00o;
            return velocityTracker != null ? velocityTracker.getYVelocity() : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
    }

    public interface OooOOOO {
        void OooO00o(int i);

        void OooO0O0();

        void OooO0OO();

        void OooO0Oo();
    }

    public enum OooOo00 {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.f7150Oooo0oo = null;
        this.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7153OoooO00 = -1;
        this.f7152OoooO0 = -1;
        this.f7154OoooO0O = -1;
        this.f7151OoooO = 0;
        this.f7155OoooOO0 = 0;
        this.f7193o000oOoO = true;
        this.f7156OoooOOO = new HashMap<>();
        this.f7157OoooOOo = 0L;
        this.f7158OoooOo0 = 1.0f;
        this.f7159OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7162Ooooo0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7164OooooOO = false;
        this.f7167Oooooo0 = 0;
        this.f7168OoooooO = false;
        this.f7169Ooooooo = new o0Oo0oo();
        this.f7205o0OoOo0 = new OooO();
        this.f7196o00Ooo = false;
        this.f7198o00oO0O = false;
        this.f7206o0ooOO0 = null;
        this.f7207o0ooOOo = null;
        this.f7208o0ooOoO = null;
        this.f7203o0OOO0o = null;
        this.f7204o0Oo0oo = 0;
        this.f7202o0OO00O = -1L;
        this.f7210oo0o0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7201o0O0O00 = 0;
        this.f7192o000OOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7172o000000 = false;
        this.f7179o00000o0 = new o00000();
        this.f7188o0000Ooo = false;
        this.f7181o00000oo = null;
        this.f7170o0000 = new HashMap<>();
        this.f7184o0000O00 = new Rect();
        this.f7190o0000oo = false;
        this.f7189o0000oO = OooOo00.UNDEFINED;
        this.f7183o0000O0 = new OooOO0O();
        this.f7185o0000O0O = false;
        this.f7191o000OO = new RectF();
        this.f7182o0000O = null;
        this.f7187o0000OO0 = null;
        this.f7186o0000OO = new ArrayList<>();
        OooOOo(null);
    }

    public static Rect OooO0O0(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.f7184o0000O00.top = constraintWidget.OooOoOO();
        motionLayout.f7184o0000O00.left = constraintWidget.OooOoO();
        Rect rect = motionLayout.f7184o0000O00;
        int iOooOoO0 = constraintWidget.OooOoO0();
        Rect rect2 = motionLayout.f7184o0000O00;
        rect.right = iOooOoO0 + rect2.left;
        int iOooOOo = constraintWidget.OooOOo();
        Rect rect3 = motionLayout.f7184o0000O00;
        rect2.bottom = iOooOOo + rect3.top;
        return rect3;
    }

    public final androidx.constraintlayout.widget.OooO00o OooO(int i) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.OooO0O0(i);
    }

    public final void OooO0OO(float f) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null) {
            return;
        }
        float f2 = this.f7160OoooOoo;
        float f3 = this.f7159OoooOoO;
        if (f2 != f3 && this.f7163OooooO0) {
            this.f7160OoooOoo = f3;
        }
        float f4 = this.f7160OoooOoo;
        if (f4 == f) {
            return;
        }
        this.f7168OoooooO = false;
        this.f7162Ooooo0o = f;
        this.f7158OoooOo0 = oooO00o.OooO0OO() / 1000.0f;
        setProgress(this.f7162Ooooo0o);
        this.f7149Oooo0oO = null;
        this.f7150Oooo0oo = this.f7148Oooo0o.OooO0o();
        this.f7163OooooO0 = false;
        this.f7157OoooOOo = getNanoTime();
        this.f7164OooooOO = true;
        this.f7159OoooOoO = f4;
        this.f7160OoooOoo = f4;
        invalidate();
    }

    public final void OooO0Oo(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            o00Oo0 o00oo1 = this.f7156OoooOOO.get(getChildAt(i));
            if (o00oo1 != null && "button".equals(p060o0000o.OooO.OooO0Oo(o00oo1.f27763OooO0O0)) && o00oo1.f27787OooOoOO != null) {
                int i2 = 0;
                while (true) {
                    o000oOoO[] o000ooooArr = o00oo1.f27787OooOoOO;
                    if (i2 < o000ooooArr.length) {
                        o000ooooArr[i2].OooO0oo(z ? -100.0f : 100.0f, o00oo1.f27763OooO0O0);
                        i2++;
                    }
                }
            }
        }
    }

    public final void OooO0o() {
        CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList;
        if ((this.f7165OooooOo == null && ((copyOnWriteArrayList = this.f7203o0OOO0o) == null || copyOnWriteArrayList.isEmpty())) || this.f7192o000OOo == this.f7159OoooOoO) {
            return;
        }
        if (this.f7201o0O0O00 != -1) {
            OooOOOO oooOOOO = this.f7165OooooOo;
            if (oooOOOO != null) {
                oooOOOO.OooO0OO();
            }
            CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList2 = this.f7203o0OOO0o;
            if (copyOnWriteArrayList2 != null) {
                Iterator<OooOOOO> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().OooO0OO();
                }
            }
        }
        this.f7201o0O0O00 = -1;
        this.f7192o000OOo = this.f7159OoooOoO;
        OooOOOO oooOOOO2 = this.f7165OooooOo;
        if (oooOOOO2 != null) {
            oooOOOO2.OooO0O0();
        }
        CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList3 = this.f7203o0OOO0o;
        if (copyOnWriteArrayList3 != null) {
            Iterator<OooOOOO> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().OooO0O0();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:142:0x0223  */
    /* JADX WARN: Code duplicated, block: B:179:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:85:0x0138  */
    /* JADX WARN: Code duplicated, block: B:88:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0151  */
    /* JADX WARN: Code duplicated, block: B:92:0x0159  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170  */
    /* JADX WARN: Code duplicated, block: B:97:0x0180  */
    public final void OooO0o0(boolean z) {
        boolean z2;
        float interpolation;
        char c;
        int childCount;
        long nanoTime;
        Interpolator interpolator;
        float interpolation2;
        Interpolator interpolator2;
        int i;
        int i2;
        int i3;
        int i4;
        View childAt;
        o00Oo0 o00oo1;
        boolean z3;
        if (this.f7161Ooooo00 == -1) {
            this.f7161Ooooo00 = getNanoTime();
        }
        float f = this.f7160OoooOoo;
        if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f < 1.0f) {
            this.f7152OoooO0 = -1;
        }
        boolean z4 = false;
        if (this.f7198o00oO0O || (this.f7164OooooOO && (z || this.f7162Ooooo0o != f))) {
            float fSignum = Math.signum(this.f7162Ooooo0o - f);
            long nanoTime2 = getNanoTime();
            o00Ooo o00ooo2 = this.f7149Oooo0oO;
            float f2 = !(o00ooo2 instanceof o00Ooo) ? (((nanoTime2 - this.f7161Ooooo00) * fSignum) * 1.0E-9f) / this.f7158OoooOo0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float f3 = this.f7160OoooOoo + f2;
            if (this.f7163OooooO0) {
                f3 = this.f7162Ooooo0o;
            }
            if ((fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f3 < this.f7162Ooooo0o) && (fSignum > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f3 > this.f7162Ooooo0o)) {
                z2 = false;
            } else {
                f3 = this.f7162Ooooo0o;
                this.f7164OooooOO = false;
                z2 = true;
            }
            this.f7160OoooOoo = f3;
            this.f7159OoooOoO = f3;
            this.f7161Ooooo00 = nanoTime2;
            if (o00ooo2 == null || z2) {
                this.f7147Oooo = f2;
            } else {
                if (this.f7168OoooooO) {
                    interpolation = o00ooo2.getInterpolation((nanoTime2 - this.f7157OoooOOo) * 1.0E-9f);
                    o00Ooo o00ooo3 = this.f7149Oooo0oO;
                    o0Oo0oo o0oo0oo2 = this.f7169Ooooooo;
                    c = o00ooo3 == o0oo0oo2 ? o0oo0oo2.f27909OooO0OO.OooO00o() ? (char) 2 : (char) 1 : (char) 0;
                    this.f7160OoooOoo = interpolation;
                    this.f7161Ooooo00 = nanoTime2;
                    o00Ooo o00ooo4 = this.f7149Oooo0oO;
                    if (o00ooo4 instanceof o00Ooo) {
                        float fOooO00o = o00ooo4.OooO00o();
                        this.f7147Oooo = fOooO00o;
                        if (Math.abs(fOooO00o) * this.f7158OoooOo0 <= 1.0E-5f && c == 2) {
                            this.f7164OooooOO = false;
                        }
                        if (fOooO00o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation >= 1.0f) {
                            this.f7160OoooOoo = 1.0f;
                            this.f7164OooooOO = false;
                            interpolation = 1.0f;
                        }
                        if (fOooO00o < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            this.f7164OooooOO = false;
                            interpolation = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        }
                    }
                } else {
                    float interpolation3 = o00ooo2.getInterpolation(f3);
                    o00Ooo o00ooo5 = this.f7149Oooo0oO;
                    if (o00ooo5 instanceof o00Ooo) {
                        this.f7147Oooo = o00ooo5.OooO00o();
                    } else {
                        this.f7147Oooo = ((o00ooo5.getInterpolation(f3 + f2) - interpolation3) * fSignum) / f2;
                    }
                    f3 = interpolation3;
                }
                if (Math.abs(this.f7147Oooo) > 1.0E-5f) {
                    setState(OooOo00.MOVING);
                }
                if (c != 1) {
                    if ((fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation >= this.f7162Ooooo0o) || (fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation <= this.f7162Ooooo0o)) {
                        interpolation = this.f7162Ooooo0o;
                        this.f7164OooooOO = false;
                    }
                    if (interpolation < 1.0f || interpolation <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        this.f7164OooooOO = false;
                        setState(OooOo00.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f7198o00oO0O = false;
                nanoTime = getNanoTime();
                this.f7178o00000Oo = interpolation;
                interpolator = this.f7150Oooo0oo;
                if (interpolator == null) {
                    interpolation2 = interpolation;
                } else {
                    interpolation2 = interpolator.getInterpolation(interpolation);
                }
                interpolator2 = this.f7150Oooo0oo;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f7158OoooOo0) + interpolation);
                    this.f7147Oooo = interpolation4;
                    this.f7147Oooo = interpolation4 - this.f7150Oooo0oo.getInterpolation(interpolation);
                }
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    o00oo1 = this.f7156OoooOOO.get(childAt);
                    if (o00oo1 != null) {
                        this.f7198o00oO0O = o00oo1.OooO0o0(childAt, interpolation2, nanoTime, this.f7179o00000o0) | this.f7198o00oO0O;
                    }
                }
                boolean z5 = (fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation >= this.f7162Ooooo0o) || (fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation <= this.f7162Ooooo0o);
                if (!this.f7198o00oO0O && !this.f7164OooooOO && z5) {
                    setState(OooOo00.FINISHED);
                }
                if (this.f7172o000000) {
                    requestLayout();
                }
                this.f7198o00oO0O = (!z5) | this.f7198o00oO0O;
                if (interpolation <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (i4 = this.f7153OoooO00) != -1 && this.f7152OoooO0 != i4) {
                    this.f7152OoooO0 = i4;
                    this.f7148Oooo0o.OooO0O0(i4).OooO00o(this);
                    setState(OooOo00.FINISHED);
                    z4 = true;
                }
                if (interpolation >= 1.0d) {
                    i2 = this.f7152OoooO0;
                    i3 = this.f7154OoooO0O;
                    if (i2 != i3) {
                        this.f7152OoooO0 = i3;
                        this.f7148Oooo0o.OooO0O0(i3).OooO00o(this);
                        setState(OooOo00.FINISHED);
                        z4 = true;
                    }
                }
                if (!this.f7198o00oO0O || this.f7164OooooOO) {
                    invalidate();
                } else if ((fSignum > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation == 1.0f) || (fSignum < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    setState(OooOo00.FINISHED);
                }
                if (!this.f7198o00oO0O && !this.f7164OooooOO && ((fSignum > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation == 1.0f) || (fSignum < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) {
                    OooOOoo();
                }
            }
            interpolation = f3;
            c = 0;
            if (Math.abs(this.f7147Oooo) > 1.0E-5f) {
                setState(OooOo00.MOVING);
            }
            if (c != 1) {
                if (fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    interpolation = this.f7162Ooooo0o;
                    this.f7164OooooOO = false;
                } else {
                    interpolation = this.f7162Ooooo0o;
                    this.f7164OooooOO = false;
                }
                if (interpolation < 1.0f) {
                    this.f7164OooooOO = false;
                    setState(OooOo00.FINISHED);
                } else {
                    this.f7164OooooOO = false;
                    setState(OooOo00.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f7198o00oO0O = false;
            nanoTime = getNanoTime();
            this.f7178o00000Oo = interpolation;
            interpolator = this.f7150Oooo0oo;
            if (interpolator == null) {
                interpolation2 = interpolation;
            } else {
                interpolation2 = interpolator.getInterpolation(interpolation);
            }
            interpolator2 = this.f7150Oooo0oo;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f7158OoooOo0) + interpolation);
                this.f7147Oooo = interpolation5;
                this.f7147Oooo = interpolation5 - this.f7150Oooo0oo.getInterpolation(interpolation);
            }
            while (i < childCount) {
                childAt = getChildAt(i);
                o00oo1 = this.f7156OoooOOO.get(childAt);
                if (o00oo1 != null) {
                    this.f7198o00oO0O = o00oo1.OooO0o0(childAt, interpolation2, nanoTime, this.f7179o00000o0) | this.f7198o00oO0O;
                }
            }
            if (fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            }
            if (!this.f7198o00oO0O) {
                setState(OooOo00.FINISHED);
            }
            if (this.f7172o000000) {
                requestLayout();
            }
            this.f7198o00oO0O = (!z5) | this.f7198o00oO0O;
            if (interpolation <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f7152OoooO0 = i4;
                this.f7148Oooo0o.OooO0O0(i4).OooO00o(this);
                setState(OooOo00.FINISHED);
                z4 = true;
            }
            if (interpolation >= 1.0d) {
                i2 = this.f7152OoooO0;
                i3 = this.f7154OoooO0O;
                if (i2 != i3) {
                    this.f7152OoooO0 = i3;
                    this.f7148Oooo0o.OooO0O0(i3).OooO00o(this);
                    setState(OooOo00.FINISHED);
                    z4 = true;
                }
            }
            if (this.f7198o00oO0O) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f7198o00oO0O) {
                OooOOoo();
            }
        }
        float f4 = this.f7160OoooOoo;
        if (f4 < 1.0f) {
            if (f4 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                int i5 = this.f7152OoooO0;
                int i6 = this.f7153OoooO00;
                z3 = i5 == i6 ? z4 : true;
                this.f7152OoooO0 = i6;
            }
            this.f7185o0000O0O |= z4;
            if (z4 && !this.f7188o0000Ooo) {
                requestLayout();
            }
            this.f7159OoooOoO = this.f7160OoooOoo;
        }
        int i7 = this.f7152OoooO0;
        int i8 = this.f7154OoooO0O;
        z3 = i7 == i8 ? z4 : true;
        this.f7152OoooO0 = i8;
        z4 = z3;
        this.f7185o0000O0O |= z4;
        if (z4) {
            requestLayout();
        }
        this.f7159OoooOoO = this.f7160OoooOoo;
    }

    public final void OooO0oO() {
        int iIntValue;
        CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList;
        if ((this.f7165OooooOo != null || ((copyOnWriteArrayList = this.f7203o0OOO0o) != null && !copyOnWriteArrayList.isEmpty())) && this.f7201o0O0O00 == -1) {
            this.f7201o0O0O00 = this.f7152OoooO0;
            if (this.f7186o0000OO.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.f7186o0000OO;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i = this.f7152OoooO0;
            if (iIntValue != i && i != -1) {
                this.f7186o0000OO.add(Integer.valueOf(i));
            }
        }
        OooOo00();
        Runnable runnable = this.f7181o00000oo;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void OooO0oo(int i, float f, float f2, float f3, float[] fArr) {
        HashMap<View, o00Oo0> map = this.f7156OoooOOO;
        View viewById = getViewById(i);
        o00Oo0 o00oo1 = map.get(viewById);
        if (o00oo1 != null) {
            o00oo1.OooO0Oo(f, f2, f3, fArr);
            viewById.getY();
            return;
        }
        Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? android.support.v4.media.OooO00o.OooO00o("", i) : viewById.getContext().getResources().getResourceName(i)));
    }

    @Override // o000O0O0.o00O0O
    public final void OooOO0(@NonNull View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f7196o00Ooo || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f7196o00Ooo = false;
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOO0O(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // o000O0O0.o0OoOo0
    public final boolean OooOO0o(@NonNull View view, @NonNull View view2, int i, int i2) {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        return (oooO00o == null || (oooO0O0 = oooO00o.f7251OooO0OO) == null || (oooO0O1 = oooO0O0.f7279OooOO0o) == null || (oooO0O1.f7314OooOo0o & 2) != 0) ? false : true;
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO(@NonNull View view, int i) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o != null) {
            float f = this.f7199o00oO0o;
            float f2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                return;
            }
            float f3 = this.f7197o00o0O / f;
            float f4 = this.f7200o00ooo / f;
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = oooO00o.f7251OooO0OO;
            if (oooO0O1 == null || (oooO0O0 = oooO0O1.f7279OooOO0o) == null) {
                return;
            }
            oooO0O0.f7304OooOOO0 = false;
            float progress = oooO0O0.f7307OooOOo.getProgress();
            oooO0O0.f7307OooOOo.OooO0oo(oooO0O0.f7295OooO0Oo, progress, oooO0O0.f7299OooO0oo, oooO0O0.f7298OooO0oO, oooO0O0.f7303OooOOO);
            float f5 = oooO0O0.f7301OooOO0O;
            float[] fArr = oooO0O0.f7303OooOOO;
            float f6 = fArr[0];
            float f7 = oooO0O0.f7302OooOO0o;
            float f8 = fArr[1];
            float f9 = f5 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? (f3 * f5) / fArr[0] : (f4 * f7) / fArr[1];
            if (!Float.isNaN(f9)) {
                progress += f9 / 3.0f;
            }
            if (progress != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                boolean z = progress != 1.0f;
                int i2 = oooO0O0.f7294OooO0OO;
                if ((i2 != 3) && z) {
                    MotionLayout motionLayout = oooO0O0.f7307OooOOo;
                    if (progress >= 0.5d) {
                        f2 = 1.0f;
                    }
                    motionLayout.OooOo0o(i2, f2, f9);
                }
            }
        }
    }

    @Override // o000O0O0.o0OoOo0
    public final void OooOOO0(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.f7209oo000o = getNanoTime();
        this.f7199o00oO0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7197o00o0O = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7200o00ooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // o000O0O0.o0OoOo0
    public final void OooOOOO(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        boolean z;
        ?? r1;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        float f;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O2;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O3;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O4;
        int i4;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null || (oooO0O0 = oooO00o.f7251OooO0OO) == null || !((z = !oooO0O0.f7282OooOOOO))) {
            return;
        }
        int i5 = -1;
        if (!z || (oooO0O4 = oooO0O0.f7279OooOO0o) == null || (i4 = oooO0O4.f7297OooO0o0) == -1 || view.getId() == i4) {
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O5 = oooO00o.f7251OooO0OO;
            if ((oooO0O5 == null || (oooO0O3 = oooO0O5.f7279OooOO0o) == null) ? false : oooO0O3.f7311OooOo0) {
                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O6 = oooO0O0.f7279OooOO0o;
                if (oooO0O6 != null && (oooO0O6.f7314OooOo0o & 4) != 0) {
                    i5 = i2;
                }
                float f2 = this.f7159OoooOoO;
                if ((f2 == 1.0f || f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O7 = oooO0O0.f7279OooOO0o;
            if (oooO0O7 != null && (oooO0O7.f7314OooOo0o & 1) != 0) {
                float f3 = i;
                float f4 = i2;
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O8 = oooO00o.f7251OooO0OO;
                if (oooO0O8 == null || (oooO0O2 = oooO0O8.f7279OooOO0o) == null) {
                    f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    oooO0O2.f7307OooOOo.OooO0oo(oooO0O2.f7295OooO0Oo, oooO0O2.f7307OooOOo.getProgress(), oooO0O2.f7299OooO0oo, oooO0O2.f7298OooO0oO, oooO0O2.f7303OooOOO);
                    float f5 = oooO0O2.f7301OooOO0O;
                    if (f5 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                        float[] fArr = oooO0O2.f7303OooOOO;
                        if (fArr[0] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            fArr[0] = 1.0E-7f;
                        }
                        f = (f3 * f5) / fArr[0];
                    } else {
                        float[] fArr2 = oooO0O2.f7303OooOOO;
                        if (fArr2[1] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            fArr2[1] = 1.0E-7f;
                        }
                        f = (f4 * oooO0O2.f7302OooOO0o) / fArr2[1];
                    }
                }
                float f6 = this.f7160OoooOoo;
                if ((f6 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) || (f6 >= 1.0f && f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new OooO0O0(view));
                    return;
                }
            }
            float f7 = this.f7159OoooOoO;
            long nanoTime = getNanoTime();
            float f8 = i;
            this.f7197o00o0O = f8;
            float f9 = i2;
            this.f7200o00ooo = f9;
            this.f7199o00oO0o = (float) ((nanoTime - this.f7209oo000o) * 1.0E-9d);
            this.f7209oo000o = nanoTime;
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O9 = oooO00o.f7251OooO0OO;
            if (oooO0O9 != null && (oooO0O1 = oooO0O9.f7279OooOO0o) != null) {
                float progress = oooO0O1.f7307OooOOo.getProgress();
                if (!oooO0O1.f7304OooOOO0) {
                    oooO0O1.f7304OooOOO0 = true;
                    oooO0O1.f7307OooOOo.setProgress(progress);
                }
                oooO0O1.f7307OooOOo.OooO0oo(oooO0O1.f7295OooO0Oo, progress, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                float f10 = oooO0O1.f7301OooOO0O;
                float[] fArr3 = oooO0O1.f7303OooOOO;
                if (Math.abs((oooO0O1.f7302OooOO0o * fArr3[1]) + (f10 * fArr3[0])) < 0.01d) {
                    float[] fArr4 = oooO0O1.f7303OooOOO;
                    fArr4[0] = 0.01f;
                    fArr4[1] = 0.01f;
                }
                float f11 = oooO0O1.f7301OooOO0O;
                float fMax = Math.max(Math.min(progress + (f11 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? (f8 * f11) / oooO0O1.f7303OooOOO[0] : (f9 * oooO0O1.f7302OooOO0o) / oooO0O1.f7303OooOOO[1]), 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                if (fMax != oooO0O1.f7307OooOOo.getProgress()) {
                    oooO0O1.f7307OooOOo.setProgress(fMax);
                }
            }
            if (f7 != this.f7159OoooOoO) {
                iArr[0] = i;
                r1 = 1;
                iArr[1] = i2;
            } else {
                r1 = 1;
            }
            OooO0o0(false);
            if (iArr[0] == 0 && iArr[r1] == 0) {
                return;
            }
            this.f7196o00Ooo = r1;
        }
    }

    public final androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 OooOOOo(int i) {
        for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 : this.f7148Oooo0o.f7252OooO0Oo) {
            if (oooO0O0.f7269OooO00o == i) {
                return oooO0O0;
            }
        }
        return null;
    }

    public final void OooOOo(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o;
        f7146o0000OOO = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o000O00.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == o000O00.MotionLayout_layoutDescription) {
                    this.f7148Oooo0o = new androidx.constraintlayout.motion.widget.OooO00o(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == o000O00.MotionLayout_currentState) {
                    this.f7152OoooO0 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == o000O00.MotionLayout_motionProgress) {
                    this.f7162Ooooo0o = typedArrayObtainStyledAttributes.getFloat(index, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                    this.f7164OooooOO = true;
                } else if (index == o000O00.MotionLayout_applyMotionScene) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == o000O00.MotionLayout_showPaths) {
                    if (this.f7167Oooooo0 == 0) {
                        this.f7167Oooooo0 = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == o000O00.MotionLayout_motionDebug) {
                    this.f7167Oooooo0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f7148Oooo0o == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f7148Oooo0o = null;
            }
        }
        if (this.f7167Oooooo0 != 0) {
            androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f7148Oooo0o;
            if (oooO00o2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iOooO = oooO00o2.OooO();
                androidx.constraintlayout.motion.widget.OooO00o oooO00o3 = this.f7148Oooo0o;
                androidx.constraintlayout.widget.OooO00o oooO00oOooO0O0 = oooO00o3.OooO0O0(oooO00o3.OooO());
                String strOooO0OO = p060o0000o.OooO.OooO0OO(getContext(), iOooO);
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("CHECK: ", strOooO0OO, " ALL VIEWS SHOULD HAVE ID's ");
                        sbOooO0OO.append(childAt.getClass().getName());
                        sbOooO0OO.append(" does not!");
                        Log.w("MotionLayout", sbOooO0OO.toString());
                    }
                    if (oooO00oOooO0O0.OooO(id) == null) {
                        StringBuilder sbOooO0OO2 = OooO0o.OooO0o.OooO0OO("CHECK: ", strOooO0OO, " NO CONSTRAINTS for ");
                        sbOooO0OO2.append(p060o0000o.OooO.OooO0Oo(childAt));
                        Log.w("MotionLayout", sbOooO0OO2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) oooO00oOooO0O0.f7598OooO0o.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = numArr[i3].intValue();
                }
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    String strOooO0OO2 = p060o0000o.OooO.OooO0OO(getContext(), i5);
                    if (findViewById(iArr[i4]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strOooO0OO + " NO View matches id " + strOooO0OO2);
                    }
                    if (oooO00oOooO0O0.OooO0oo(i5).f7620OooO0o0.f7640OooO0Oo == -1) {
                        Log.w("MotionLayout", oo000o.OooO00o("CHECK: ", strOooO0OO, "(", strOooO0OO2, ") no LAYOUT_HEIGHT"));
                    }
                    if (oooO00oOooO0O0.OooO0oo(i5).f7620OooO0o0.f7639OooO0OO == -1) {
                        Log.w("MotionLayout", oo000o.OooO00o("CHECK: ", strOooO0OO, "(", strOooO0OO2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 : this.f7148Oooo0o.f7252OooO0Oo) {
                    if (oooO0O0 == this.f7148Oooo0o.f7251OooO0OO) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (oooO0O0.f7272OooO0Oo == oooO0O0.f7271OooO0OO) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i6 = oooO0O0.f7272OooO0Oo;
                    int i7 = oooO0O0.f7271OooO0OO;
                    String strOooO0OO3 = p060o0000o.OooO.OooO0OO(getContext(), i6);
                    String strOooO0OO4 = p060o0000o.OooO.OooO0OO(getContext(), i7);
                    if (sparseIntArray.get(i6) == i7) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strOooO0OO3 + "->" + strOooO0OO4);
                    }
                    if (sparseIntArray2.get(i7) == i6) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strOooO0OO3 + "->" + strOooO0OO4);
                    }
                    sparseIntArray.put(i6, i7);
                    sparseIntArray2.put(i7, i6);
                    if (this.f7148Oooo0o.OooO0O0(i6) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strOooO0OO3);
                    }
                    if (this.f7148Oooo0o.OooO0O0(i7) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strOooO0OO3);
                    }
                }
            }
        }
        if (this.f7152OoooO0 != -1 || (oooO00o = this.f7148Oooo0o) == null) {
            return;
        }
        this.f7152OoooO0 = oooO00o.OooO();
        this.f7153OoooO00 = this.f7148Oooo0o.OooO();
        this.f7154OoooO0O = this.f7148Oooo0o.OooO0Oo();
    }

    public final boolean OooOOo0(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        boolean zOnTouchEvent;
        if (!(view instanceof ViewGroup)) {
            z = false;
            break;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                z = false;
                break;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (OooOOo0((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), childAt, motionEvent)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            this.f7191o000OO.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if (motionEvent.getAction() != 0 || this.f7191o000OO.contains(motionEvent.getX(), motionEvent.getY())) {
                float f3 = -f;
                float f4 = -f2;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f3, f4);
                    zOnTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f3, -f4);
                } else {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(f3, f4);
                    if (this.f7187o0000OO0 == null) {
                        this.f7187o0000OO0 = new Matrix();
                    }
                    matrix.invert(this.f7187o0000OO0);
                    motionEventObtain.transform(this.f7187o0000OO0);
                    zOnTouchEvent = view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zOnTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void OooOOoo() {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        View viewFindViewById;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null) {
            return;
        }
        if (oooO00o.OooO00o(this, this.f7152OoooO0)) {
            requestLayout();
            return;
        }
        int i = this.f7152OoooO0;
        if (i != -1) {
            androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f7148Oooo0o;
            for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O2 : oooO00o2.f7252OooO0Oo) {
                if (oooO0O2.f7281OooOOO0.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0.ViewOnClickListenerC0042OooO00o> it = oooO0O2.f7281OooOOO0.iterator();
                    while (it.hasNext()) {
                        it.next().OooO0O0(this);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O3 : oooO00o2.f7253OooO0o) {
                if (oooO0O3.f7281OooOOO0.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0.ViewOnClickListenerC0042OooO00o> it2 = oooO0O3.f7281OooOOO0.iterator();
                    while (it2.hasNext()) {
                        it2.next().OooO0O0(this);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O4 : oooO00o2.f7252OooO0Oo) {
                if (oooO0O4.f7281OooOOO0.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0.ViewOnClickListenerC0042OooO00o> it3 = oooO0O4.f7281OooOOO0.iterator();
                    while (it3.hasNext()) {
                        it3.next().OooO00o(this, i, oooO0O4);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O5 : oooO00o2.f7253OooO0o) {
                if (oooO0O5.f7281OooOOO0.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0.ViewOnClickListenerC0042OooO00o> it4 = oooO0O5.f7281OooOOO0.iterator();
                    while (it4.hasNext()) {
                        it4.next().OooO00o(this, i, oooO0O5);
                    }
                }
            }
        }
        if (!this.f7148Oooo0o.OooOOo0() || (oooO0O0 = this.f7148Oooo0o.f7251OooO0OO) == null || (oooO0O1 = oooO0O0.f7279OooOO0o) == null) {
            return;
        }
        int i2 = oooO0O1.f7295OooO0Oo;
        if (i2 != -1) {
            viewFindViewById = oooO0O1.f7307OooOOo.findViewById(i2);
            if (viewFindViewById == null) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("cannot find TouchAnchorId @id/");
                sbOooO0o0.append(p060o0000o.OooO.OooO0OO(oooO0O1.f7307OooOOo.getContext(), oooO0O1.f7295OooO0Oo));
                Log.e("TouchResponse", sbOooO0o0.toString());
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new o0ooOOo());
            nestedScrollView.setOnScrollChangeListener(new o0OOO0o());
        }
    }

    public final void OooOo() {
        OooO0OO(1.0f);
        this.f7181o00000oo = null;
    }

    public final void OooOo0() {
        this.f7183o0000O0.OooO0o();
        invalidate();
    }

    public final void OooOo00() {
        CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList;
        if (this.f7165OooooOo == null && ((copyOnWriteArrayList = this.f7203o0OOO0o) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        for (Integer num : this.f7186o0000OO) {
            OooOOOO oooOOOO = this.f7165OooooOo;
            if (oooOOOO != null) {
                oooOOOO.OooO00o(num.intValue());
            }
            CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList2 = this.f7203o0OOO0o;
            if (copyOnWriteArrayList2 != null) {
                Iterator<OooOOOO> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o(num.intValue());
                }
            }
        }
        this.f7186o0000OO.clear();
    }

    public final void OooOo0O(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f7180o00000oO == null) {
                this.f7180o00000oO = new OooOOO();
            }
            OooOOO oooOOO = this.f7180o00000oO;
            oooOOO.f7243OooO0OO = i;
            oooOOO.f7244OooO0Oo = i2;
            return;
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o != null) {
            this.f7153OoooO00 = i;
            this.f7154OoooO0O = i2;
            oooO00o.OooOOOo(i, i2);
            this.f7183o0000O0.OooO0o0(this.f7148Oooo0o.OooO0O0(i), this.f7148Oooo0o.OooO0O0(i2));
            OooOo0();
            this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0126  */
    /* JADX WARN: Code duplicated, block: B:74:0x0130  */
    /* JADX WARN: Code duplicated, block: B:79:0x013a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    public final void OooOo0o(int i, float f, float f2) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        int i2;
        o0Oo0oo o0oo0oo2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O2;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O3;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O4;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O5;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O6;
        float f7;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O7;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O8;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O9;
        float f8 = f;
        if (this.f7148Oooo0o == null || this.f7160OoooOoo == f8) {
            return;
        }
        boolean z = true;
        this.f7168OoooooO = true;
        this.f7157OoooOOo = getNanoTime();
        float fOooO0OO = this.f7148Oooo0o.OooO0OO() / 1000.0f;
        this.f7158OoooOo0 = fOooO0OO;
        this.f7162Ooooo0o = f8;
        this.f7164OooooOO = true;
        if (i == 0 || i == 1 || i == 2) {
            if (i != 1 || i == 7) {
                f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else if (i == 2 || i == 6) {
                f8 = 1.0f;
            }
            oooO00o = this.f7148Oooo0o;
            oooO0O0 = oooO00o.f7251OooO0OO;
            if (oooO0O0 != null || (oooO0O8 = oooO0O0.f7279OooOO0o) == null) {
                i2 = 0;
            } else {
                i2 = oooO0O8.f7320OooOooO;
            }
            if (i2 == 0) {
                o0Oo0oo o0oo0oo3 = this.f7169Ooooooo;
                float f9 = this.f7160OoooOoo;
                float fOooO0oo = oooO00o.OooO0oo();
                oooO0O6 = this.f7148Oooo0o.f7251OooO0OO;
                if (oooO0O6 != null || (oooO0O7 = oooO0O6.f7279OooOO0o) == null) {
                    f7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f7 = oooO0O7.f7309OooOOoo;
                }
                o0oo0oo3.OooO0O0(f9, f8, f2, fOooO0OO, fOooO0oo, f7);
            } else {
                o0oo0oo2 = this.f7169Ooooooo;
                float f10 = this.f7160OoooOoo;
                if (oooO0O0 != null || (oooO0O5 = oooO0O0.f7279OooOO0o) == null) {
                    f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f3 = oooO0O5.f7315OooOoO;
                }
                if (oooO0O0 != null || (oooO0O4 = oooO0O0.f7279OooOO0o) == null) {
                    f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f4 = oooO0O4.f7317OooOoOO;
                }
                if (oooO0O0 != null || (oooO0O3 = oooO0O0.f7279OooOO0o) == null) {
                    f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f5 = oooO0O3.f7316OooOoO0;
                }
                if (oooO0O0 != null || (oooO0O2 = oooO0O0.f7279OooOO0o) == null) {
                    f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f6 = oooO0O2.f7319OooOoo0;
                }
                if (oooO0O0 != null || (oooO0O1 = oooO0O0.f7279OooOO0o) == null) {
                    i3 = 0;
                } else {
                    i3 = oooO0O1.f7318OooOoo;
                }
                if (o0oo0oo2.f27908OooO0O0 == null) {
                    o0oo0oo2.f27908OooO0O0 = new o0000O0();
                }
                o0000O0 o0000o1 = o0oo0oo2.f27908OooO0O0;
                o0oo0oo2.f27909OooO0OO = o0000o1;
                o0000o1.f27605OooO0OO = f8;
                o0000o1.f27603OooO00o = f5;
                o0000o1.f27608OooO0o0 = f10;
                o0000o1.f27604OooO0O0 = f4;
                o0000o1.f27609OooO0oO = f3;
                o0000o1.f27610OooO0oo = f6;
                o0000o1.f27602OooO = i3;
                o0000o1.f27606OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            int i4 = this.f7152OoooO0;
            this.f7162Ooooo0o = f8;
            this.f7152OoooO0 = i4;
            this.f7149Oooo0oO = this.f7169Ooooooo;
        } else if (i == 4) {
            OooO oooO = this.f7205o0OoOo0;
            float f11 = this.f7160OoooOoo;
            float fOooO0oo2 = this.f7148Oooo0o.OooO0oo();
            oooO.f7212OooO00o = f2;
            oooO.f7213OooO0O0 = f11;
            oooO.f7214OooO0OO = fOooO0oo2;
            this.f7149Oooo0oO = this.f7205o0OoOo0;
        } else if (i == 5) {
            float f12 = this.f7160OoooOoo;
            float fOooO0oo3 = this.f7148Oooo0o.OooO0oo();
            if (f2 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                float f13 = f2 / fOooO0oo3;
                if (((f2 * f13) - (((fOooO0oo3 * f13) * f13) / 2.0f)) + f12 <= 1.0f) {
                    z = false;
                }
            } else {
                float f14 = (-f2) / fOooO0oo3;
                if ((((fOooO0oo3 * f14) * f14) / 2.0f) + (f2 * f14) + f12 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    z = false;
                }
            }
            if (z) {
                OooO oooO2 = this.f7205o0OoOo0;
                float f15 = this.f7160OoooOoo;
                float fOooO0oo4 = this.f7148Oooo0o.OooO0oo();
                oooO2.f7212OooO00o = f2;
                oooO2.f7213OooO0O0 = f15;
                oooO2.f7214OooO0OO = fOooO0oo4;
                this.f7149Oooo0oO = this.f7205o0OoOo0;
            } else {
                o0Oo0oo o0oo0oo4 = this.f7169Ooooooo;
                float f16 = this.f7160OoooOoo;
                float f17 = this.f7158OoooOo0;
                float fOooO0oo5 = this.f7148Oooo0o.OooO0oo();
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O10 = this.f7148Oooo0o.f7251OooO0OO;
                o0oo0oo4.OooO0O0(f16, f, f2, f17, fOooO0oo5, (oooO0O10 == null || (oooO0O9 = oooO0O10.f7279OooOO0o) == null) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : oooO0O9.f7309OooOOoo);
                this.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                int i5 = this.f7152OoooO0;
                this.f7162Ooooo0o = f8;
                this.f7152OoooO0 = i5;
                this.f7149Oooo0oO = this.f7169Ooooooo;
            }
        } else if (i == 6 || i == 7) {
            if (i != 1) {
                f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else {
                f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            oooO00o = this.f7148Oooo0o;
            oooO0O0 = oooO00o.f7251OooO0OO;
            if (oooO0O0 != null) {
                i2 = 0;
            } else {
                i2 = 0;
            }
            if (i2 == 0) {
                o0Oo0oo o0oo0oo5 = this.f7169Ooooooo;
                float f18 = this.f7160OoooOoo;
                float fOooO0oo6 = oooO00o.OooO0oo();
                oooO0O6 = this.f7148Oooo0o.f7251OooO0OO;
                if (oooO0O6 != null) {
                    f7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f7 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                o0oo0oo5.OooO0O0(f18, f8, f2, fOooO0OO, fOooO0oo6, f7);
            } else {
                o0oo0oo2 = this.f7169Ooooooo;
                float f19 = this.f7160OoooOoo;
                if (oooO0O0 != null) {
                    f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (oooO0O0 != null) {
                    f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (oooO0O0 != null) {
                    f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (oooO0O0 != null) {
                    f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                } else {
                    f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                }
                if (oooO0O0 != null) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
                if (o0oo0oo2.f27908OooO0O0 == null) {
                    o0oo0oo2.f27908OooO0O0 = new o0000O0();
                }
                o0000O0 o0000o2 = o0oo0oo2.f27908OooO0O0;
                o0oo0oo2.f27909OooO0OO = o0000o2;
                o0000o2.f27605OooO0OO = f8;
                o0000o2.f27603OooO00o = f5;
                o0000o2.f27608OooO0o0 = f19;
                o0000o2.f27604OooO0O0 = f4;
                o0000o2.f27609OooO0oO = f3;
                o0000o2.f27610OooO0oo = f6;
                o0000o2.f27602OooO = i3;
                o0000o2.f27606OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
            int i6 = this.f7152OoooO0;
            this.f7162Ooooo0o = f8;
            this.f7152OoooO0 = i6;
            this.f7149Oooo0oO = this.f7169Ooooooo;
        }
        this.f7163OooooO0 = false;
        this.f7157OoooOOo = getNanoTime();
        invalidate();
    }

    public final void OooOoO(int i, int i2) {
        if (isAttachedToWindow()) {
            OooOoOO(i, i2);
            return;
        }
        if (this.f7180o00000oO == null) {
            this.f7180o00000oO = new OooOOO();
        }
        this.f7180o00000oO.f7244OooO0Oo = i;
    }

    public final void OooOoO0(int i) {
        if (isAttachedToWindow()) {
            OooOoOO(i, -1);
            return;
        }
        if (this.f7180o00000oO == null) {
            this.f7180o00000oO = new OooOOO();
        }
        this.f7180o00000oO.f7244OooO0Oo = i;
    }

    public final void OooOoOO(int i, int i2) {
        o000O00O o000o00o2;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o != null && (o000o00o2 = oooO00o.f7250OooO0O0) != null) {
            int i3 = this.f7152OoooO0;
            float f = -1;
            o000O00O.OooO00o oooO00o2 = o000o00o2.f27931OooO0O0.get(i);
            if (oooO00o2 == null) {
                i3 = i;
            } else if (f != -1.0f && f != -1.0f) {
                Iterator<o000O00O.OooO0O0> it = oooO00o2.f27933OooO0O0.iterator();
                o000O00O.OooO0O0 oooO0O0 = null;
                while (true) {
                    if (!it.hasNext()) {
                        if (oooO0O0 != null) {
                            i3 = oooO0O0.f27939OooO0o0;
                            break;
                        } else {
                            i3 = oooO00o2.f27934OooO0OO;
                            break;
                        }
                    }
                    o000O00O.OooO0O0 next = it.next();
                    if (next.OooO00o(f, f)) {
                        if (i3 == next.f27939OooO0o0) {
                            break;
                        } else {
                            oooO0O0 = next;
                        }
                    }
                }
            } else if (oooO00o2.f27934OooO0OO != i3) {
                Iterator<o000O00O.OooO0O0> it2 = oooO00o2.f27933OooO0O0.iterator();
                do {
                    if (!it2.hasNext()) {
                        i3 = oooO00o2.f27934OooO0OO;
                        break;
                    }
                } while (i3 != it2.next().f27939OooO0o0);
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i4 = this.f7152OoooO0;
        if (i4 == i) {
            return;
        }
        if (this.f7153OoooO00 == i) {
            OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            if (i2 > 0) {
                this.f7158OoooOo0 = i2 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f7154OoooO0O == i) {
            OooO0OO(1.0f);
            if (i2 > 0) {
                this.f7158OoooOo0 = i2 / 1000.0f;
                return;
            }
            return;
        }
        this.f7154OoooO0O = i;
        if (i4 != -1) {
            OooOo0O(i4, i);
            OooO0OO(1.0f);
            this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            OooOo();
            if (i2 > 0) {
                this.f7158OoooOo0 = i2 / 1000.0f;
                return;
            }
            return;
        }
        this.f7168OoooooO = false;
        this.f7162Ooooo0o = 1.0f;
        this.f7159OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7161Ooooo00 = getNanoTime();
        this.f7157OoooOOo = getNanoTime();
        this.f7163OooooO0 = false;
        this.f7149Oooo0oO = null;
        if (i2 == -1) {
            this.f7158OoooOo0 = this.f7148Oooo0o.OooO0OO() / 1000.0f;
        }
        this.f7153OoooO00 = -1;
        this.f7148Oooo0o.OooOOOo(-1, this.f7154OoooO0O);
        SparseArray sparseArray = new SparseArray();
        if (i2 == 0) {
            this.f7158OoooOo0 = this.f7148Oooo0o.OooO0OO() / 1000.0f;
        } else if (i2 > 0) {
            this.f7158OoooOo0 = i2 / 1000.0f;
        }
        int childCount = getChildCount();
        this.f7156OoooOOO.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            this.f7156OoooOOO.put(childAt, new o00Oo0(childAt));
            sparseArray.put(childAt.getId(), this.f7156OoooOOO.get(childAt));
        }
        this.f7164OooooOO = true;
        this.f7183o0000O0.OooO0o0(null, this.f7148Oooo0o.OooO0O0(i));
        OooOo0();
        this.f7183o0000O0.OooO00o();
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            o00Oo0 o00oo1 = this.f7156OoooOOO.get(childAt2);
            if (o00oo1 != null) {
                o00oO0o o00oo0o2 = o00oo1.f27766OooO0o;
                o00oo0o2.f27799Oooo0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                o00oo0o2.f27796Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                o00oo0o2.OooO0o0(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                o00oo1.f27769OooO0oo.OooO0o(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f7208o0ooOoO != null) {
            for (int i7 = 0; i7 < childCount; i7++) {
                o00Oo0 o00oo2 = this.f7156OoooOOO.get(getChildAt(i7));
                if (o00oo2 != null) {
                    this.f7148Oooo0o.OooO0oO(o00oo2);
                }
            }
            Iterator<MotionHelper> it3 = this.f7208o0ooOoO.iterator();
            while (it3.hasNext()) {
                it3.next().OooOo0(this, this.f7156OoooOOO);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                o00Oo0 o00oo3 = this.f7156OoooOOO.get(getChildAt(i8));
                if (o00oo3 != null) {
                    o00oo3.OooO0oo(width, height, getNanoTime());
                }
            }
        } else {
            for (int i9 = 0; i9 < childCount; i9++) {
                o00Oo0 o00oo4 = this.f7156OoooOOO.get(getChildAt(i9));
                if (o00oo4 != null) {
                    this.f7148Oooo0o.OooO0oO(o00oo4);
                    o00oo4.OooO0oo(width, height, getNanoTime());
                }
            }
        }
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = this.f7148Oooo0o.f7251OooO0OO;
        float f2 = oooO0O1 != null ? oooO0O1.f7268OooO : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (f2 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i10 = 0; i10 < childCount; i10++) {
                o00oO0o o00oo0o3 = this.f7156OoooOOO.get(getChildAt(i10)).f27768OooO0oO;
                float f3 = o00oo0o3.f27801OoooO0 + o00oo0o3.f27802OoooO00;
                fMin = Math.min(fMin, f3);
                fMax = Math.max(fMax, f3);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                o00Oo0 o00oo5 = this.f7156OoooOOO.get(getChildAt(i11));
                o00oO0o o00oo0o4 = o00oo5.f27768OooO0oO;
                float f4 = o00oo0o4.f27802OoooO00;
                float f5 = o00oo0o4.f27801OoooO0;
                o00oo5.f27773OooOOO = 1.0f / (1.0f - f2);
                o00oo5.f27774OooOOO0 = f2 - ((((f4 + f5) - fMin) * f2) / (fMax - fMin));
            }
        }
        this.f7159OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7164OooooOO = true;
        invalidate();
    }

    public final void OooOoo(int i, View... viewArr) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        androidx.constraintlayout.motion.widget.OooO0o oooO0o = oooO00o.f7265OooOOo0;
        Objects.requireNonNull(oooO0o);
        ArrayList arrayList = new ArrayList();
        androidx.constraintlayout.motion.widget.OooO0OO oooO0OO = null;
        for (androidx.constraintlayout.motion.widget.OooO0OO oooO0OO2 : oooO0o.f7356OooO0O0) {
            if (oooO0OO2.f7322OooO00o == i) {
                for (View view : viewArr) {
                    if (oooO0OO2.OooO0O0(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    int currentState = oooO0o.f7355OooO00o.getCurrentState();
                    if (oooO0OO2.f7327OooO0o0 == 2) {
                        oooO0OO2.OooO00o(oooO0o, oooO0o.f7355OooO00o, currentState, null, viewArr2);
                    } else if (currentState == -1) {
                        String str = oooO0o.f7358OooO0Oo;
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("No support for ViewTransition within transition yet. Currently: ");
                        sbOooO0o0.append(oooO0o.f7355OooO00o.toString());
                        Log.w(str, sbOooO0o0.toString());
                    } else {
                        androidx.constraintlayout.widget.OooO00o oooO00oOooO = oooO0o.f7355OooO00o.OooO(currentState);
                        if (oooO00oOooO != null) {
                            oooO0OO2.OooO00o(oooO0o, oooO0o.f7355OooO00o, currentState, oooO00oOooO, viewArr2);
                        }
                    }
                    arrayList.clear();
                }
                oooO0OO = oooO0OO2;
            }
        }
        if (oooO0OO == null) {
            Log.e(oooO0o.f7358OooO0Oo, " Could not find ViewTransition");
        }
    }

    public final void OooOoo0(int i, androidx.constraintlayout.widget.OooO00o oooO00o) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f7148Oooo0o;
        if (oooO00o2 != null) {
            oooO00o2.f7255OooO0oO.put(i, oooO00o);
        }
        this.f7183o0000O0.OooO0o0(this.f7148Oooo0o.OooO0O0(this.f7153OoooO00), this.f7148Oooo0o.OooO0O0(this.f7154OoooO0O));
        OooOo0();
        if (this.f7152OoooO0 == i) {
            oooO00o.OooO0O0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02fb A[PHI: r2
      0x02fb: PHI (r2v28 float) = (r2v27 float), (r2v35 float) binds: [B:108:0x02d9, B:113:0x02e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:185:0x0523  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Iterator<o00Oo0> it;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        double dOooO00o;
        o0OO00O o0oo00o2;
        androidx.constraintlayout.motion.widget.OooO0o oooO0o;
        ArrayList<androidx.constraintlayout.motion.widget.OooO0OO.OooO00o> arrayList;
        MotionLayout motionLayout = this;
        Canvas canvas2 = canvas;
        ArrayList<MotionHelper> arrayList2 = motionLayout.f7208o0ooOoO;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
        char c = 0;
        motionLayout.OooO0o0(false);
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = motionLayout.f7148Oooo0o;
        if (oooO00o != null && (oooO0o = oooO00o.f7265OooOOo0) != null && (arrayList = oooO0o.f7360OooO0o0) != null) {
            Iterator<androidx.constraintlayout.motion.widget.OooO0OO.OooO00o> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                it3.next().OooO00o();
            }
            oooO0o.f7360OooO0o0.removeAll(oooO0o.f7359OooO0o);
            oooO0o.f7359OooO0o.clear();
            if (oooO0o.f7360OooO0o0.isEmpty()) {
                oooO0o.f7360OooO0o0 = null;
            }
        }
        super.dispatchDraw(canvas);
        if (motionLayout.f7148Oooo0o == null) {
            return;
        }
        if ((motionLayout.f7167Oooooo0 & 1) == 1 && !isInEditMode()) {
            motionLayout.f7204o0Oo0oo++;
            long nanoTime = getNanoTime();
            long j = motionLayout.f7202o0OO00O;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    motionLayout.f7210oo0o0Oo = ((int) ((motionLayout.f7204o0Oo0oo / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    motionLayout.f7204o0Oo0oo = 0;
                    motionLayout.f7202o0OO00O = nanoTime;
                }
            } else {
                motionLayout.f7202o0OO00O = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(motionLayout.f7210oo0o0Oo + " fps " + p060o0000o.OooO.OooO0o0(motionLayout, motionLayout.f7153OoooO00) + " -> ");
            sbOooO0o0.append(p060o0000o.OooO.OooO0o0(motionLayout, motionLayout.f7154OoooO0O));
            sbOooO0o0.append(" (progress: ");
            sbOooO0o0.append(progress);
            sbOooO0o0.append(" ) state=");
            int i6 = motionLayout.f7152OoooO0;
            sbOooO0o0.append(i6 == -1 ? "undefined" : p060o0000o.OooO.OooO0o0(motionLayout, i6));
            String string = sbOooO0o0.toString();
            paint.setColor(-16777216);
            canvas2.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas2.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (motionLayout.f7167Oooooo0 <= 1) {
            motionLayout = this;
        } else {
            if (motionLayout.f7166Oooooo == null) {
                motionLayout.f7166Oooooo = motionLayout.new OooOO0();
            }
            OooOO0 oooOO1 = motionLayout.f7166Oooooo;
            HashMap<View, o00Oo0> map = motionLayout.f7156OoooOOO;
            int iOooO0OO = motionLayout.f7148Oooo0o.OooO0OO();
            int i7 = motionLayout.f7167Oooooo0;
            Objects.requireNonNull(oooOO1);
            if (map == null) {
                motionLayout = this;
            } else if (map.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i7 & 1) == 2) {
                    String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f7154OoooO0O) + CertificateUtil.DELIMITER + MotionLayout.this.getProgress();
                    canvas2.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, oooOO1.f7228OooO0oo);
                    canvas2.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, oooOO1.f7226OooO0o0);
                }
                Iterator<o00Oo0> it4 = map.values().iterator();
                Canvas canvas3 = canvas2;
                while (it4.hasNext()) {
                    o00Oo0 next = it4.next();
                    int iMax = next.f27766OooO0o.f27798Oooo0oO;
                    Iterator<o00oO0o> it5 = next.f27781OooOo0.iterator();
                    while (it5.hasNext()) {
                        iMax = Math.max(iMax, it5.next().f27798Oooo0oO);
                    }
                    int iMax2 = Math.max(iMax, next.f27768OooO0oO.f27798Oooo0oO);
                    if (i7 > 0 && iMax2 == 0) {
                        iMax2 = 1;
                    }
                    if (iMax2 != 0) {
                        float[] fArr = oooOO1.f7223OooO0OO;
                        int[] iArr = oooOO1.f7222OooO0O0;
                        if (fArr != null) {
                            double[] dArrOooO0oO = next.f27770OooOO0[c].OooO0oO();
                            if (iArr != null) {
                                Iterator<o00oO0o> it6 = next.f27781OooOo0.iterator();
                                int i8 = 0;
                                while (it6.hasNext()) {
                                    iArr[i8] = it6.next().f27809OoooOoo;
                                    i8++;
                                }
                            }
                            int i9 = 0;
                            int i10 = 0;
                            while (i9 < dArrOooO0oO.length) {
                                next.f27770OooOO0[c].OooO0OO(dArrOooO0oO[i9], next.f27776OooOOOo);
                                next.f27766OooO0o.OooO0Oo(dArrOooO0oO[i9], next.f27775OooOOOO, next.f27776OooOOOo, fArr, i10);
                                i10 += 2;
                                i9++;
                                dArrOooO0oO = dArrOooO0oO;
                                it4 = it4;
                                c = 0;
                            }
                            it = it4;
                            i = i10 / 2;
                        } else {
                            it = it4;
                            i = 0;
                        }
                        oooOO1.f7230OooOO0O = i;
                        if (iMax2 >= 1) {
                            int i11 = iOooO0OO / 16;
                            float[] fArr2 = oooOO1.f7221OooO00o;
                            if (fArr2 == null || fArr2.length != i11 * 2) {
                                oooOO1.f7221OooO00o = new float[i11 * 2];
                                oooOO1.f7224OooO0Oo = new Path();
                            }
                            float f = oooOO1.f7233OooOOO0;
                            canvas3.translate(f, f);
                            oooOO1.f7226OooO0o0.setColor(1996488704);
                            oooOO1.f7220OooO.setColor(1996488704);
                            oooOO1.f7225OooO0o.setColor(1996488704);
                            oooOO1.f7227OooO0oO.setColor(1996488704);
                            float[] fArr3 = oooOO1.f7221OooO00o;
                            float f2 = 1.0f;
                            float f3 = 1.0f / (i11 - 1);
                            HashMap<String, oo0o0Oo> map2 = next.f27786OooOoO0;
                            oo0o0Oo oo0o0oo = map2 == null ? null : map2.get("translationX");
                            HashMap<String, oo0o0Oo> map3 = next.f27786OooOoO0;
                            oo0o0Oo oo0o0oo2 = map3 == null ? null : map3.get("translationY");
                            HashMap<String, o0OO00O> map4 = next.f27785OooOoO;
                            o0OO00O o0oo00o3 = map4 == null ? null : map4.get("translationX");
                            HashMap<String, o0OO00O> map5 = next.f27785OooOoO;
                            o0OO00O o0oo00o4 = map5 == null ? null : map5.get("translationY");
                            int i12 = 0;
                            while (i12 < i11) {
                                int i13 = i11;
                                float fMin = i12 * f3;
                                float f4 = f3;
                                float f5 = next.f27773OooOOO;
                                if (f5 != f2) {
                                    float f6 = next.f27774OooOOO0;
                                    if (fMin < f6) {
                                        fMin = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                    }
                                    if (fMin > f6) {
                                        i4 = iOooO0OO;
                                        i5 = i7;
                                        if (fMin < 1.0d) {
                                            fMin = Math.min((fMin - f6) * f5, 1.0f);
                                        }
                                    } else {
                                        i4 = iOooO0OO;
                                        i5 = i7;
                                    }
                                } else {
                                    i4 = iOooO0OO;
                                    i5 = i7;
                                }
                                double d = fMin;
                                o000000O o000000o2 = next.f27766OooO0o.f27797Oooo0o;
                                float f7 = Float.NaN;
                                float f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                for (o00oO0o o00oo0o2 : next.f27781OooOo0) {
                                    double d2 = d;
                                    o000000O o000000o3 = o00oo0o2.f27797Oooo0o;
                                    if (o000000o3 != null) {
                                        float f9 = o00oo0o2.f27799Oooo0oo;
                                        if (f9 < fMin) {
                                            f8 = f9;
                                            o000000o2 = o000000o3;
                                        } else if (Float.isNaN(f7)) {
                                            f7 = o00oo0o2.f27799Oooo0oo;
                                        }
                                    }
                                    d = d2;
                                }
                                double d3 = d;
                                if (o000000o2 != null) {
                                    if (Float.isNaN(f7)) {
                                        f7 = 1.0f;
                                    }
                                    float f10 = f7 - f8;
                                    dOooO00o = (((float) o000000o2.OooO00o((fMin - f8) / f10)) * f10) + f8;
                                } else {
                                    dOooO00o = d3;
                                }
                                next.f27770OooOO0[0].OooO0OO(dOooO00o, next.f27776OooOOOo);
                                o000OOo o000ooo2 = next.f27771OooOO0O;
                                if (o000ooo2 != null) {
                                    double[] dArr = next.f27776OooOOOo;
                                    o0oo00o2 = o0oo00o3;
                                    if (dArr.length > 0) {
                                        o000ooo2.OooO0OO(dOooO00o, dArr);
                                    }
                                } else {
                                    o0oo00o2 = o0oo00o3;
                                }
                                int i14 = i12 * 2;
                                int i15 = i12;
                                o0OO00O o0oo00o5 = o0oo00o2;
                                double d4 = dOooO00o;
                                o0OO00O o0oo00o6 = o0oo00o4;
                                oo0o0Oo oo0o0oo3 = oo0o0oo2;
                                oo0o0Oo oo0o0oo4 = oo0o0oo;
                                next.f27766OooO0o.OooO0Oo(d4, next.f27775OooOOOO, next.f27776OooOOOo, fArr3, i14);
                                if (o0oo00o5 != null) {
                                    fArr3[i14] = o0oo00o5.OooO00o(fMin) + fArr3[i14];
                                } else if (oo0o0oo4 != null) {
                                    fArr3[i14] = oo0o0oo4.OooO00o(fMin) + fArr3[i14];
                                }
                                if (o0oo00o6 != null) {
                                    int i16 = i14 + 1;
                                    fArr3[i16] = o0oo00o6.OooO00o(fMin) + fArr3[i16];
                                } else if (oo0o0oo3 != null) {
                                    int i17 = i14 + 1;
                                    fArr3[i17] = oo0o0oo3.OooO00o(fMin) + fArr3[i17];
                                }
                                i12 = i15 + 1;
                                f2 = 1.0f;
                                o0oo00o3 = o0oo00o5;
                                oo0o0oo2 = oo0o0oo3;
                                o0oo00o4 = o0oo00o6;
                                oo0o0oo = oo0o0oo4;
                                i11 = i13;
                                f3 = f4;
                                iOooO0OO = i4;
                                i7 = i5;
                            }
                            i2 = iOooO0OO;
                            i3 = i7;
                            oooOO1.OooO00o(canvas2, iMax2, oooOO1.f7230OooOO0O, next);
                            oooOO1.f7226OooO0o0.setColor(-21965);
                            oooOO1.f7225OooO0o.setColor(-2067046);
                            oooOO1.f7220OooO.setColor(-2067046);
                            oooOO1.f7227OooO0oO.setColor(-13391360);
                            float f11 = -oooOO1.f7233OooOOO0;
                            canvas2.translate(f11, f11);
                            oooOO1.OooO00o(canvas2, iMax2, oooOO1.f7230OooOO0O, next);
                            if (iMax2 == 5) {
                                oooOO1.f7224OooO0Oo.reset();
                                for (int i18 = 0; i18 <= 50; i18++) {
                                    float[] fArr4 = oooOO1.f7229OooOO0;
                                    next.f27770OooOO0[0].OooO0OO(next.OooO0O0(i18 / 50, null), next.f27776OooOOOo);
                                    o00oO0o o00oo0o3 = next.f27766OooO0o;
                                    int[] iArr2 = next.f27775OooOOOO;
                                    double[] dArr2 = next.f27776OooOOOo;
                                    float f12 = o00oo0o3.f27802OoooO00;
                                    float fCos = o00oo0o3.f27801OoooO0;
                                    float f13 = o00oo0o3.f27803OoooO0O;
                                    float f14 = o00oo0o3.f27800OoooO;
                                    for (int i19 = 0; i19 < iArr2.length; i19++) {
                                        float f15 = (float) dArr2[i19];
                                        int i20 = iArr2[i19];
                                        if (i20 == 1) {
                                            f12 = f15;
                                        } else if (i20 == 2) {
                                            fCos = f15;
                                        } else if (i20 == 3) {
                                            f13 = f15;
                                        } else if (i20 == 4) {
                                            f14 = f15;
                                        }
                                    }
                                    if (o00oo0o3.f27807OoooOo0 != null) {
                                        double d5 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                        double d6 = f12;
                                        double d7 = fCos;
                                        float fSin = (float) (((Math.sin(d7) * d6) + d5) - ((double) (f13 / 2.0f)));
                                        fCos = (float) ((d5 - (Math.cos(d7) * d6)) - ((double) (f14 / 2.0f)));
                                        f12 = fSin;
                                    }
                                    float f16 = f13 + f12;
                                    float f17 = f14 + fCos;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f18 = f12 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                    float f19 = fCos + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                    float f20 = f16 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                    float f21 = f17 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                    fArr4[0] = f18;
                                    fArr4[1] = f19;
                                    fArr4[2] = f20;
                                    fArr4[3] = f19;
                                    fArr4[4] = f20;
                                    fArr4[5] = f21;
                                    fArr4[6] = f18;
                                    fArr4[7] = f21;
                                    Path path = oooOO1.f7224OooO0Oo;
                                    float[] fArr5 = oooOO1.f7229OooOO0;
                                    path.moveTo(fArr5[0], fArr5[1]);
                                    Path path2 = oooOO1.f7224OooO0Oo;
                                    float[] fArr6 = oooOO1.f7229OooOO0;
                                    path2.lineTo(fArr6[2], fArr6[3]);
                                    Path path3 = oooOO1.f7224OooO0Oo;
                                    float[] fArr7 = oooOO1.f7229OooOO0;
                                    path3.lineTo(fArr7[4], fArr7[5]);
                                    Path path4 = oooOO1.f7224OooO0Oo;
                                    float[] fArr8 = oooOO1.f7229OooOO0;
                                    path4.lineTo(fArr8[6], fArr8[7]);
                                    oooOO1.f7224OooO0Oo.close();
                                }
                                oooOO1.f7226OooO0o0.setColor(1140850688);
                                canvas2 = canvas;
                                canvas2.translate(2.0f, 2.0f);
                                canvas2.drawPath(oooOO1.f7224OooO0Oo, oooOO1.f7226OooO0o0);
                                canvas2.translate(-2.0f, -2.0f);
                                oooOO1.f7226OooO0o0.setColor(bl.a);
                                canvas2.drawPath(oooOO1.f7224OooO0Oo, oooOO1.f7226OooO0o0);
                            }
                            canvas3 = canvas2;
                        } else {
                            i2 = iOooO0OO;
                            i3 = i7;
                        }
                        c = 0;
                        it4 = it;
                        iOooO0OO = i2;
                        i7 = i3;
                    }
                }
                canvas.restore();
                motionLayout = this;
            }
        }
        ArrayList<MotionHelper> arrayList3 = motionLayout.f7208o0ooOoO;
        if (arrayList3 != null) {
            Iterator<MotionHelper> it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                Objects.requireNonNull(it7.next());
            }
        }
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null) {
            return null;
        }
        int size = oooO00o.f7255OooO0oO.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = oooO00o.f7255OooO0oO.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f7152OoooO0;
    }

    public ArrayList<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.f7252OooO0Oo;
    }

    public p060o0000o.OooOO0 getDesignTool() {
        if (this.f7211ooOO == null) {
            this.f7211ooOO = new p060o0000o.OooOO0();
        }
        return this.f7211ooOO;
    }

    public int getEndState() {
        return this.f7154OoooO0O;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f7160OoooOoo;
    }

    public androidx.constraintlayout.motion.widget.OooO00o getScene() {
        return this.f7148Oooo0o;
    }

    public int getStartState() {
        return this.f7153OoooO00;
    }

    public float getTargetPosition() {
        return this.f7162Ooooo0o;
    }

    public Bundle getTransitionState() {
        if (this.f7180o00000oO == null) {
            this.f7180o00000oO = new OooOOO();
        }
        OooOOO oooOOO = this.f7180o00000oO;
        MotionLayout motionLayout = MotionLayout.this;
        oooOOO.f7244OooO0Oo = motionLayout.f7154OoooO0O;
        oooOOO.f7243OooO0OO = motionLayout.f7153OoooO00;
        oooOOO.f7242OooO0O0 = motionLayout.getVelocity();
        oooOOO.f7241OooO00o = MotionLayout.this.getProgress();
        OooOOO oooOOO2 = this.f7180o00000oO;
        Objects.requireNonNull(oooOOO2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", oooOOO2.f7241OooO00o);
        bundle.putFloat("motion.velocity", oooOOO2.f7242OooO0O0);
        bundle.putInt("motion.StartState", oooOOO2.f7243OooO0OO);
        bundle.putInt("motion.EndState", oooOOO2.f7244OooO0Oo);
        return bundle;
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o != null) {
            this.f7158OoooOo0 = oooO00o.OooO0OO() / 1000.0f;
        }
        return (long) (this.f7158OoooOo0 * 1000.0f);
    }

    public float getVelocity() {
        return this.f7147Oooo;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i) {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        if (i == 0) {
            this.f7148Oooo0o = null;
            return;
        }
        try {
            androidx.constraintlayout.motion.widget.OooO00o oooO00o = new androidx.constraintlayout.motion.widget.OooO00o(getContext(), this, i);
            this.f7148Oooo0o = oooO00o;
            if (this.f7152OoooO0 == -1) {
                this.f7152OoooO0 = oooO00o.OooO();
                this.f7153OoooO00 = this.f7148Oooo0o.OooO();
                this.f7154OoooO0O = this.f7148Oooo0o.OooO0Oo();
            }
            if (!isAttachedToWindow()) {
                this.f7148Oooo0o = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f7148Oooo0o;
                if (oooO00o2 != null) {
                    androidx.constraintlayout.widget.OooO00o oooO00oOooO0O0 = oooO00o2.OooO0O0(this.f7152OoooO0);
                    this.f7148Oooo0o.OooOOOO(this);
                    ArrayList<MotionHelper> arrayList = this.f7208o0ooOoO;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            Objects.requireNonNull(it.next());
                        }
                    }
                    if (oooO00oOooO0O0 != null) {
                        oooO00oOooO0O0.OooO0O0(this);
                    }
                    this.f7153OoooO00 = this.f7152OoooO0;
                }
                OooOOoo();
                OooOOO oooOOO = this.f7180o00000oO;
                if (oooOOO != null) {
                    if (this.f7190o0000oo) {
                        post(new OooO00o());
                        return;
                    } else {
                        oooOOO.OooO00o();
                        return;
                    }
                }
                androidx.constraintlayout.motion.widget.OooO00o oooO00o3 = this.f7148Oooo0o;
                if (oooO00o3 == null || (oooO0O0 = oooO00o3.f7251OooO0OO) == null || oooO0O0.f7280OooOOO != 4) {
                    return;
                }
                OooOo();
                setState(OooOo00.SETUP);
                setState(OooOo00.MOVING);
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        } catch (Exception e2) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o != null && (i = this.f7152OoooO0) != -1) {
            androidx.constraintlayout.widget.OooO00o oooO00oOooO0O0 = oooO00o.OooO0O0(i);
            this.f7148Oooo0o.OooOOOO(this);
            ArrayList<MotionHelper> arrayList = this.f7208o0ooOoO;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    Objects.requireNonNull(it.next());
                }
            }
            if (oooO00oOooO0O0 != null) {
                oooO00oOooO0O0.OooO0O0(this);
            }
            this.f7153OoooO00 = this.f7152OoooO0;
        }
        OooOOoo();
        OooOOO oooOOO = this.f7180o00000oO;
        if (oooOOO != null) {
            if (this.f7190o0000oo) {
                post(new OooO0OO());
                return;
            } else {
                oooOOO.OooO00o();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f7148Oooo0o;
        if (oooO00o2 == null || (oooO0O0 = oooO00o2.f7251OooO0OO) == null || oooO0O0.f7280OooOOO != 4) {
            return;
        }
        OooOo();
        setState(OooOo00.SETUP);
        setState(OooOo00.MOVING);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        int i;
        RectF rectFOooO0O0;
        int currentState;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o != null && this.f7193o000oOoO) {
            androidx.constraintlayout.motion.widget.OooO0o oooO0o = oooO00o.f7265OooOOo0;
            if (oooO0o != null && (currentState = oooO0o.f7355OooO00o.getCurrentState()) != -1) {
                if (oooO0o.f7357OooO0OO == null) {
                    oooO0o.f7357OooO0OO = new HashSet<>();
                    for (androidx.constraintlayout.motion.widget.OooO0OO oooO0OO : oooO0o.f7356OooO0O0) {
                        int childCount = oooO0o.f7355OooO00o.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = oooO0o.f7355OooO00o.getChildAt(i2);
                            if (oooO0OO.OooO0OO(childAt)) {
                                childAt.getId();
                                oooO0o.f7357OooO0OO.add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<androidx.constraintlayout.motion.widget.OooO0OO.OooO00o> arrayList = oooO0o.f7360OooO0o0;
                int i3 = 2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    for (androidx.constraintlayout.motion.widget.OooO0OO.OooO00o oooO00o2 : oooO0o.f7360OooO0o0) {
                        Objects.requireNonNull(oooO00o2);
                        if (action != 1) {
                            if (action == 2) {
                                oooO00o2.f7345OooO0OO.f27763OooO0O0.getHitRect(oooO00o2.f7353OooOO0o);
                                if (!oooO00o2.f7353OooOO0o.contains((int) x, (int) y) && !oooO00o2.f7350OooO0oo) {
                                    oooO00o2.OooO0O0();
                                }
                            }
                        } else if (!oooO00o2.f7350OooO0oo) {
                            oooO00o2.OooO0O0();
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    androidx.constraintlayout.widget.OooO00o oooO00oOooO = oooO0o.f7355OooO00o.OooO(currentState);
                    Iterator<androidx.constraintlayout.motion.widget.OooO0OO> it = oooO0o.f7356OooO0O0.iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.motion.widget.OooO0OO next = it.next();
                        int i4 = next.f7323OooO0O0;
                        if (i4 != 1 ? !(i4 != i3 ? !(i4 == 3 && action == 0) : action != 1) : action == 0) {
                            for (View view : oooO0o.f7357OooO0OO) {
                                if (next.OooO0OO(view)) {
                                    view.getHitRect(rect);
                                    if (rect.contains((int) x, (int) y)) {
                                        next.OooO00o(oooO0o, oooO0o.f7355OooO00o, currentState, oooO00oOooO, view);
                                    }
                                    next = next;
                                    i3 = 2;
                                }
                            }
                        }
                    }
                }
            }
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = this.f7148Oooo0o.f7251OooO0OO;
            if (oooO0O1 != null && (!oooO0O1.f7282OooOOOO) && (oooO0O0 = oooO0O1.f7279OooOO0o) != null && ((motionEvent.getAction() != 0 || (rectFOooO0O0 = oooO0O0.OooO0O0(this, new RectF())) == null || rectFOooO0O0.contains(motionEvent.getX(), motionEvent.getY())) && (i = oooO0O0.f7297OooO0o0) != -1)) {
                View view2 = this.f7182o0000O;
                if (view2 == null || view2.getId() != i) {
                    this.f7182o0000O = findViewById(i);
                }
                View view3 = this.f7182o0000O;
                if (view3 != null) {
                    this.f7191o000OO.set(view3.getLeft(), this.f7182o0000O.getTop(), this.f7182o0000O.getRight(), this.f7182o0000O.getBottom());
                    if (this.f7191o000OO.contains(motionEvent.getX(), motionEvent.getY()) && !OooOOo0(this.f7182o0000O.getLeft(), this.f7182o0000O.getTop(), this.f7182o0000O, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f7188o0000Ooo = true;
        try {
            if (this.f7148Oooo0o == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f7194o00O0O != i5 || this.f7195o00Oo0 != i6) {
                OooOo0();
                OooO0o0(true);
            }
            this.f7194o00O0O = i5;
            this.f7195o00Oo0 = i6;
        } finally {
            this.f7188o0000Ooo = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f7148Oooo0o == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f7151OoooO == i && this.f7155OoooOO0 == i2) ? false : true;
        if (this.f7185o0000O0O) {
            this.f7185o0000O0O = false;
            OooOOoo();
            OooOo00();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.f7151OoooO = i;
        this.f7155OoooOO0 = i2;
        int iOooO = this.f7148Oooo0o.OooO();
        int iOooO0Oo = this.f7148Oooo0o.OooO0Oo();
        if (!z3) {
            OooOO0O oooOO0O = this.f7183o0000O0;
            if (!((iOooO == oooOO0O.f7239OooO0o0 && iOooO0Oo == oooOO0O.f7238OooO0o) ? false : true)) {
                if (z3) {
                    super.onMeasure(i, i2);
                }
                z = true;
            } else if (this.f7153OoooO00 != -1) {
                super.onMeasure(i, i2);
                this.f7183o0000O0.OooO0o0(this.f7148Oooo0o.OooO0O0(iOooO), this.f7148Oooo0o.OooO0O0(iOooO0Oo));
                this.f7183o0000O0.OooO0o();
                OooOO0O oooOO0O2 = this.f7183o0000O0;
                oooOO0O2.f7239OooO0o0 = iOooO;
                oooOO0O2.f7238OooO0o = iOooO0Oo;
                z = false;
            } else {
                if (z3) {
                    super.onMeasure(i, i2);
                }
                z = true;
            }
        } else if (this.f7153OoooO00 != -1) {
            super.onMeasure(i, i2);
            this.f7183o0000O0.OooO0o0(this.f7148Oooo0o.OooO0O0(iOooO), this.f7148Oooo0o.OooO0O0(iOooO0Oo));
            this.f7183o0000O0.OooO0o();
            OooOO0O oooOO0O3 = this.f7183o0000O0;
            oooOO0O3.f7239OooO0o0 = iOooO;
            oooOO0O3.f7238OooO0o = iOooO0Oo;
            z = false;
        } else {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        }
        if (this.f7172o000000 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iOooOoO0 = this.mLayoutWidget.OooOoO0() + getPaddingRight() + getPaddingLeft();
            int iOooOOo = this.mLayoutWidget.OooOOo() + paddingBottom;
            int i3 = this.f7175o00000O;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.f7173o000000O;
                iOooOoO0 = (int) ((this.f7178o00000Oo * (this.f7171o00000 - i4)) + i4);
                requestLayout();
            }
            int i5 = this.f7177o00000OO;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.f7174o000000o;
                iOooOOo = (int) ((this.f7178o00000Oo * (this.f7176o00000O0 - i6)) + i6);
                requestLayout();
            }
            setMeasuredDimension(iOooOoO0, iOooOOo);
        }
        float fSignum = Math.signum(this.f7162Ooooo0o - this.f7160OoooOoo);
        long nanoTime = getNanoTime();
        o00Ooo o00ooo2 = this.f7149Oooo0oO;
        float interpolation = this.f7160OoooOoo + (!(o00ooo2 instanceof o0Oo0oo) ? (((nanoTime - this.f7161Ooooo00) * fSignum) * 1.0E-9f) / this.f7158OoooOo0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        if (this.f7163OooooO0) {
            interpolation = this.f7162Ooooo0o;
        }
        if ((fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || interpolation < this.f7162Ooooo0o) && (fSignum > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || interpolation > this.f7162Ooooo0o)) {
            z2 = false;
        } else {
            interpolation = this.f7162Ooooo0o;
        }
        if (o00ooo2 != null && !z2) {
            interpolation = this.f7168OoooooO ? o00ooo2.getInterpolation((nanoTime - this.f7157OoooOOo) * 1.0E-9f) : o00ooo2.getInterpolation(interpolation);
        }
        if ((fSignum > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation >= this.f7162Ooooo0o) || (fSignum <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && interpolation <= this.f7162Ooooo0o)) {
            interpolation = this.f7162Ooooo0o;
        }
        this.f7178o00000Oo = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f7150Oooo0oo;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            o00Oo0 o00oo1 = this.f7156OoooOOO.get(childAt);
            if (o00oo1 != null) {
                o00oo1.OooO0o0(childAt, interpolation, nanoTime2, this.f7179o00000o0);
            }
        }
        if (this.f7172o000000) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o != null) {
            boolean zIsRtl = isRtl();
            oooO00o.f7263OooOOOo = zIsRtl;
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = oooO00o.f7251OooO0OO;
            if (oooO0O1 == null || (oooO0O0 = oooO0O1.f7279OooOO0o) == null) {
                return;
            }
            oooO0O0.OooO0OO(zIsRtl);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0229  */
    /* JADX WARN: Code duplicated, block: B:108:0x022f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0233  */
    /* JADX WARN: Code duplicated, block: B:116:0x0246  */
    /* JADX WARN: Code duplicated, block: B:118:0x024f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0256  */
    /* JADX WARN: Code duplicated, block: B:123:0x025b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0278  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:134:0x0341  */
    /* JADX WARN: Code duplicated, block: B:135:0x0344  */
    /* JADX WARN: Code duplicated, block: B:137:0x034a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0355  */
    /* JADX WARN: Code duplicated, block: B:142:0x0359  */
    /* JADX WARN: Code duplicated, block: B:144:0x0363  */
    /* JADX WARN: Code duplicated, block: B:147:0x0370  */
    /* JADX WARN: Code duplicated, block: B:148:0x0395  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:153:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:157:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:161:0x0401  */
    /* JADX WARN: Code duplicated, block: B:163:0x0414  */
    /* JADX WARN: Code duplicated, block: B:165:0x0441  */
    /* JADX WARN: Code duplicated, block: B:166:0x0470  */
    /* JADX WARN: Code duplicated, block: B:168:0x0475  */
    /* JADX WARN: Code duplicated, block: B:170:0x04bb A[PHI: r10 r11
      0x04bb: PHI (r10v19 float) = (r10v10 float), (r10v28 float) binds: [B:167:0x0473, B:169:0x04b5] A[DONT_GENERATE, DONT_INLINE]
      0x04bb: PHI (r11v14 float) = (r11v4 float), (r11v19 float) binds: [B:167:0x0473, B:169:0x04b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:173:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:176:0x0516  */
    /* JADX WARN: Code duplicated, block: B:177:0x0526  */
    /* JADX WARN: Code duplicated, block: B:180:0x052c  */
    /* JADX WARN: Code duplicated, block: B:205:0x058e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0593  */
    /* JADX WARN: Code duplicated, block: B:209:0x0599  */
    /* JADX WARN: Code duplicated, block: B:210:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:211:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:213:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:215:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:218:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:220:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:222:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:224:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:227:0x0600  */
    /* JADX WARN: Code duplicated, block: B:228:0x061a  */
    /* JADX WARN: Code duplicated, block: B:231:0x065a  */
    /* JADX WARN: Code duplicated, block: B:232:0x0663  */
    /* JADX WARN: Code duplicated, block: B:235:0x066c  */
    /* JADX WARN: Code duplicated, block: B:236:0x0672  */
    /* JADX WARN: Code duplicated, block: B:239:0x0689  */
    /* JADX WARN: Code duplicated, block: B:242:0x0692  */
    /* JADX WARN: Code duplicated, block: B:245:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:247:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:249:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:251:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:252:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:256:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:257:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:259:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:261:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:263:0x0712  */
    /* JADX WARN: Code duplicated, block: B:264:0x072c  */
    /* JADX WARN: Code duplicated, block: B:267:0x075a  */
    /* JADX WARN: Code duplicated, block: B:268:0x075e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0768  */
    /* JADX WARN: Code duplicated, block: B:272:0x076e  */
    /* JADX WARN: Code duplicated, block: B:275:0x0774  */
    /* JADX WARN: Code duplicated, block: B:300:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:302:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:304:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:305:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:308:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:312:0x0806  */
    /* JADX WARN: Code duplicated, block: B:313:0x080d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0815  */
    /* JADX WARN: Code duplicated, block: B:78:0x016a  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        OooOOO0 oooOOO0;
        VelocityTracker velocityTracker;
        OooOOO0 oooOOO1;
        int i;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        OooOOO0 oooOOO2;
        int action;
        float fOooO0OO;
        float fOooO0Oo;
        float progress;
        int i2;
        char c;
        char c2;
        float f;
        float[] fArr;
        float fAbs;
        float f2;
        int i3;
        float rawY;
        float rawX;
        float progress2;
        int i4;
        char c3;
        char c4;
        float f3;
        float[] fArr2;
        char c5;
        char c6;
        float f4;
        float fMax;
        float progress3;
        boolean z;
        float fOooO0OO2;
        float fOooO0Oo2;
        float f5;
        int action2;
        float progress4;
        int i5;
        int i6;
        float right;
        float f6;
        int top;
        int bottom;
        int i7;
        float degrees;
        float f7;
        int i8;
        float width;
        float height;
        int i9;
        int i10;
        View viewFindViewById;
        float rawX2;
        float rawY2;
        double dAtan2;
        float fAtan2;
        float progress5;
        int i11;
        char c7;
        float fMax2;
        float progress6;
        boolean z2;
        MotionEvent motionEvent2;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O2;
        int iOooO00o;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O3;
        RectF rectFOooO00o;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null || !this.f7193o000oOoO || !oooO00o.OooOOo0()) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f7148Oooo0o;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O4 = oooO00o2.f7251OooO0OO;
        if (oooO0O4 != null && !(!oooO0O4.f7282OooOOOO)) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF = new RectF();
        if (oooO00o2.f7262OooOOOO == null) {
            Objects.requireNonNull(oooO00o2.f7249OooO00o);
            OooOOO0 oooOOO3 = OooOOO0.f7246OooO0O0;
            oooOOO3.f7247OooO00o = VelocityTracker.obtain();
            oooO00o2.f7262OooOOOO = oooOOO3;
        }
        oooO00o2.f7262OooOOOO.OooO00o(motionEvent);
        if (currentState != -1) {
            int action3 = motionEvent.getAction();
            if (action3 == 0) {
                oooO00o2.f7264OooOOo = motionEvent.getRawX();
                oooO00o2.f7266OooOOoo = motionEvent.getRawY();
                oooO00o2.f7259OooOO0o = motionEvent;
                oooO00o2.f7261OooOOO0 = false;
                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O5 = oooO00o2.f7251OooO0OO.f7279OooOO0o;
                if (oooO0O5 != null) {
                    RectF rectFOooO00o2 = oooO0O5.OooO00o(oooO00o2.f7249OooO00o, rectF);
                    if (rectFOooO00o2 == null || rectFOooO00o2.contains(oooO00o2.f7259OooOO0o.getX(), oooO00o2.f7259OooOO0o.getY())) {
                        RectF rectFOooO0O0 = oooO00o2.f7251OooO0OO.f7279OooOO0o.OooO0O0(oooO00o2.f7249OooO00o, rectF);
                        if (rectFOooO0O0 == null || rectFOooO0O0.contains(oooO00o2.f7259OooOO0o.getX(), oooO00o2.f7259OooOO0o.getY())) {
                            oooO00o2.f7260OooOOO = false;
                        } else {
                            oooO00o2.f7260OooOOO = true;
                        }
                        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O6 = oooO00o2.f7251OooO0OO.f7279OooOO0o;
                        float f8 = oooO00o2.f7264OooOOo;
                        float f9 = oooO00o2.f7266OooOOoo;
                        oooO0O6.f7306OooOOOo = f8;
                        oooO0O6.f7308OooOOo0 = f9;
                    } else {
                        oooO00o2.f7259OooOO0o = null;
                        oooO00o2.f7261OooOOO0 = true;
                    }
                }
            } else if (action3 == 2 && !oooO00o2.f7261OooOOO0) {
                float rawY3 = motionEvent.getRawY() - oooO00o2.f7266OooOOoo;
                float rawX3 = motionEvent.getRawX() - oooO00o2.f7264OooOOo;
                if ((rawX3 != 0.0d || rawY3 != 0.0d) && (motionEvent2 = oooO00o2.f7259OooOO0o) != null) {
                    if (currentState != -1) {
                        o000O00O o000o00o2 = oooO00o2.f7250OooO0O0;
                        if (o000o00o2 == null || (iOooO00o = o000o00o2.OooO00o(currentState)) == -1) {
                            iOooO00o = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O7 : oooO00o2.f7252OooO0Oo) {
                            if (oooO0O7.f7272OooO0Oo == iOooO00o || oooO0O7.f7271OooO0OO == iOooO00o) {
                                arrayList.add(oooO0O7);
                            }
                        }
                        RectF rectF2 = new RectF();
                        Iterator it = arrayList.iterator();
                        float f10 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                        oooO0O2 = null;
                        while (it.hasNext()) {
                            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O8 = (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0) it.next();
                            if (oooO0O8.f7282OooOOOO || (oooO0O3 = oooO0O8.f7279OooOO0o) == null) {
                                rectF2 = rectF2;
                                it = it;
                                rawY3 = rawY3;
                                rawX3 = rawX3;
                                motionEvent2 = motionEvent2;
                                oooO0O2 = oooO0O2;
                                oooO0O2 = oooO0O2;
                            } else {
                                oooO0O3.OooO0OO(oooO00o2.f7263OooOOOo);
                                RectF rectFOooO0O1 = oooO0O8.f7279OooOO0o.OooO0O0(oooO00o2.f7249OooO00o, rectF2);
                                if ((rectFOooO0O1 == null || rectFOooO0O1.contains(motionEvent2.getX(), motionEvent2.getY())) && ((rectFOooO00o = oooO0O8.f7279OooOO0o.OooO00o(oooO00o2.f7249OooO00o, rectF2)) == null || rectFOooO00o.contains(motionEvent2.getX(), motionEvent2.getY()))) {
                                    androidx.constraintlayout.motion.widget.OooO0O0 oooO0O9 = oooO0O8.f7279OooOO0o;
                                    float fAtan3 = (oooO0O9.f7302OooOO0o * rawY3) + (oooO0O9.f7301OooOO0O * rawX3);
                                    if (oooO0O9.f7300OooOO0) {
                                        float x = motionEvent2.getX();
                                        Objects.requireNonNull(oooO0O8.f7279OooOO0o);
                                        float f11 = x - 0.5f;
                                        float y = motionEvent2.getY();
                                        Objects.requireNonNull(oooO0O8.f7279OooOO0o);
                                        float f12 = y - 0.5f;
                                        fAtan3 = ((float) (Math.atan2(rawY3 + f12, rawX3 + f11) - Math.atan2(f11, f12))) * 10.0f;
                                    }
                                    float f13 = (oooO0O8.f7271OooO0OO == currentState ? -1.0f : 1.1f) * fAtan3;
                                    if (f13 > f10) {
                                        f10 = f13;
                                        oooO0O2 = oooO0O8;
                                    }
                                } else {
                                    rectF2 = rectF2;
                                    it = it;
                                    rawY3 = rawY3;
                                    rawX3 = rawX3;
                                    motionEvent2 = motionEvent2;
                                    oooO0O2 = oooO0O2;
                                }
                                oooO0O2 = oooO0O2;
                            }
                            motionEvent2 = motionEvent2;
                            rectF2 = rectF2;
                            it = it;
                            rawY3 = rawY3;
                            rawX3 = rawX3;
                        }
                    } else {
                        oooO0O2 = oooO00o2.f7251OooO0OO;
                    }
                    if (oooO0O2 != null) {
                        setTransition(oooO0O2);
                        RectF rectFOooO0O2 = oooO00o2.f7251OooO0OO.f7279OooOO0o.OooO0O0(oooO00o2.f7249OooO00o, rectF);
                        oooO00o2.f7260OooOOO = (rectFOooO0O2 == null || rectFOooO0O2.contains(oooO00o2.f7259OooOO0o.getX(), oooO00o2.f7259OooOO0o.getY())) ? false : true;
                        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O10 = oooO00o2.f7251OooO0OO.f7279OooOO0o;
                        float f14 = oooO00o2.f7264OooOOo;
                        float f15 = oooO00o2.f7266OooOOoo;
                        oooO0O10.f7306OooOOOo = f14;
                        oooO0O10.f7308OooOOo0 = f15;
                        oooO0O10.f7304OooOOO0 = false;
                    }
                    if (!oooO00o2.f7261OooOOO0) {
                        oooO0O0 = oooO00o2.f7251OooO0OO;
                        if (oooO0O0 != null) {
                            oooOOO2 = oooO00o2.f7262OooOOOO;
                            if (oooO0O1.f7300OooOO0) {
                                oooOOO2.OooO00o(motionEvent);
                                action2 = motionEvent.getAction();
                                if (action2 == 0) {
                                    oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                    oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                                    oooO0O1.f7304OooOOO0 = false;
                                } else if (action2 == 1) {
                                    oooO0O1.f7304OooOOO0 = false;
                                    oooOOO2.OooO0O0(16);
                                    float fOooO0OO3 = oooOOO2.OooO0OO();
                                    float fOooO0Oo3 = oooOOO2.OooO0Oo();
                                    progress4 = oooO0O1.f7307OooOOo.getProgress();
                                    float width2 = oooO0O1.f7307OooOOo.getWidth() / 2.0f;
                                    float height2 = oooO0O1.f7307OooOOo.getHeight() / 2.0f;
                                    i5 = oooO0O1.f7291OooO;
                                    if (i5 != -1) {
                                        View viewFindViewById2 = oooO0O1.f7307OooOOo.findViewById(i5);
                                        oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                        right = ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f) + oooO0O1.f7305OooOOOO[0];
                                        f6 = oooO0O1.f7305OooOOOO[1];
                                        top = viewFindViewById2.getTop();
                                        bottom = viewFindViewById2.getBottom();
                                    } else {
                                        i6 = oooO0O1.f7295OooO0Oo;
                                        if (i6 != -1) {
                                            MotionLayout motionLayout = oooO0O1.f7307OooOOo;
                                            View viewFindViewById3 = oooO0O1.f7307OooOOo.findViewById(motionLayout.f7156OoooOOO.get(motionLayout.findViewById(i6)).f27766OooO0o.f27805OoooOOO);
                                            oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                            right = ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f) + oooO0O1.f7305OooOOOO[0];
                                            f6 = oooO0O1.f7305OooOOOO[1];
                                            top = viewFindViewById3.getTop();
                                            bottom = viewFindViewById3.getBottom();
                                        } else {
                                            float rawX4 = motionEvent.getRawX() - width2;
                                            float rawY4 = motionEvent.getRawY() - height2;
                                            double degrees2 = Math.toDegrees(Math.atan2(rawY4, rawX4));
                                            i7 = oooO0O1.f7295OooO0Oo;
                                            if (i7 != -1) {
                                                oooO0O1.f7307OooOOo.OooO0oo(i7, progress4, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                                float[] fArr3 = oooO0O1.f7303OooOOO;
                                                fArr3[1] = (float) Math.toDegrees(fArr3[1]);
                                            } else {
                                                oooO0O1.f7303OooOOO[1] = 360.0f;
                                            }
                                            degrees = ((float) (Math.toDegrees(Math.atan2(fOooO0Oo3 + rawY4, fOooO0OO3 + rawX4)) - degrees2)) * 62.5f;
                                            if (Float.isNaN(degrees)) {
                                                f7 = progress4;
                                            } else {
                                                f7 = (((degrees * 3.0f) * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[1]) + progress4;
                                            }
                                            if (f7 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                                    oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                                } else {
                                                    oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                                }
                                            } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                            } else {
                                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                            }
                                        }
                                    }
                                    height2 = f6 + ((bottom + top) / 2.0f);
                                    width2 = right;
                                    float rawX5 = motionEvent.getRawX() - width2;
                                    float rawY5 = motionEvent.getRawY() - height2;
                                    double degrees3 = Math.toDegrees(Math.atan2(rawY5, rawX5));
                                    i7 = oooO0O1.f7295OooO0Oo;
                                    if (i7 != -1) {
                                        oooO0O1.f7307OooOOo.OooO0oo(i7, progress4, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                        float[] fArr4 = oooO0O1.f7303OooOOO;
                                        fArr4[1] = (float) Math.toDegrees(fArr4[1]);
                                    } else {
                                        oooO0O1.f7303OooOOO[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(fOooO0Oo3 + rawY5, fOooO0OO3 + rawX5)) - degrees3)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f7 = (((degrees * 3.0f) * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[1]) + progress4;
                                    } else {
                                        f7 = progress4;
                                    }
                                    if (f7 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                        } else {
                                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                        }
                                    } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                        oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                    } else {
                                        oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                    }
                                } else if (action2 == 2) {
                                    motionEvent.getRawY();
                                    motionEvent.getRawX();
                                    width = oooO0O1.f7307OooOOo.getWidth() / 2.0f;
                                    height = oooO0O1.f7307OooOOo.getHeight() / 2.0f;
                                    i9 = oooO0O1.f7291OooO;
                                    if (i9 != -1) {
                                        View viewFindViewById4 = oooO0O1.f7307OooOOo.findViewById(i9);
                                        oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                        float right2 = oooO0O1.f7305OooOOOO[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                        height = ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f) + oooO0O1.f7305OooOOOO[1];
                                        width = right2;
                                    } else {
                                        i10 = oooO0O1.f7295OooO0Oo;
                                        if (i10 != -1) {
                                            MotionLayout motionLayout2 = oooO0O1.f7307OooOOo;
                                            viewFindViewById = oooO0O1.f7307OooOOo.findViewById(motionLayout2.f7156OoooOOO.get(motionLayout2.findViewById(i10)).f27766OooO0o.f27805OoooOOO);
                                            if (viewFindViewById == null) {
                                                Log.e("TouchResponse", "could not find view to animate to");
                                            } else {
                                                oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                                width = oooO0O1.f7305OooOOOO[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                                height = oooO0O1.f7305OooOOOO[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                            }
                                        }
                                    }
                                    rawX2 = motionEvent.getRawX() - width;
                                    rawY2 = motionEvent.getRawY() - height;
                                    dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                                    fAtan2 = (float) (((dAtan2 - Math.atan2(oooO0O1.f7308OooOOo0 - height, oooO0O1.f7306OooOOOo - width)) * 180.0d) / 3.141592653589793d);
                                    if (fAtan2 > 330.0f) {
                                        fAtan2 -= 360.0f;
                                    } else if (fAtan2 < -330.0f) {
                                        fAtan2 += 360.0f;
                                    }
                                    if (Math.abs(fAtan2) <= 0.01d) {
                                        progress5 = oooO0O1.f7307OooOOo.getProgress();
                                        if (!oooO0O1.f7304OooOOO0) {
                                            oooO0O1.f7304OooOOO0 = true;
                                            oooO0O1.f7307OooOOo.setProgress(progress5);
                                        }
                                        i11 = oooO0O1.f7295OooO0Oo;
                                        if (i11 != -1) {
                                            oooO0O1.f7307OooOOo.OooO0oo(i11, progress5, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                            float[] fArr5 = oooO0O1.f7303OooOOO;
                                            c7 = 1;
                                            fArr5[1] = (float) Math.toDegrees(fArr5[1]);
                                        } else {
                                            c7 = 1;
                                            oooO0O1.f7303OooOOO[1] = 360.0f;
                                        }
                                        fMax2 = Math.max(Math.min(((fAtan2 * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[c7]) + progress5, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                        progress6 = oooO0O1.f7307OooOOo.getProgress();
                                        if (fMax2 != progress6) {
                                            if (progress6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                MotionLayout motionLayout3 = oooO0O1.f7307OooOOo;
                                                if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                motionLayout3.OooO0Oo(z2);
                                            } else {
                                                MotionLayout motionLayout4 = oooO0O1.f7307OooOOo;
                                                if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                motionLayout4.OooO0Oo(z2);
                                            }
                                            oooO0O1.f7307OooOOo.setProgress(fMax2);
                                            oooOOO2.OooO0O0(1000);
                                            float fOooO0OO4 = oooOOO2.OooO0OO();
                                            double dOooO0Oo = oooOOO2.OooO0Oo();
                                            double d = fOooO0OO4;
                                            oooO0O1.f7307OooOOo.f7147Oooo = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(dOooO0Oo, d) - dAtan2) * Math.hypot(dOooO0Oo, d)) / Math.hypot(rawX2, rawY2)));
                                        } else {
                                            oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                        }
                                        oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                        oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                                    } else {
                                        progress5 = oooO0O1.f7307OooOOo.getProgress();
                                        if (!oooO0O1.f7304OooOOO0) {
                                            oooO0O1.f7304OooOOO0 = true;
                                            oooO0O1.f7307OooOOo.setProgress(progress5);
                                        }
                                        i11 = oooO0O1.f7295OooO0Oo;
                                        if (i11 != -1) {
                                            oooO0O1.f7307OooOOo.OooO0oo(i11, progress5, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                            float[] fArr6 = oooO0O1.f7303OooOOO;
                                            c7 = 1;
                                            fArr6[1] = (float) Math.toDegrees(fArr6[1]);
                                        } else {
                                            c7 = 1;
                                            oooO0O1.f7303OooOOO[1] = 360.0f;
                                        }
                                        fMax2 = Math.max(Math.min(((fAtan2 * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[c7]) + progress5, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                        progress6 = oooO0O1.f7307OooOOo.getProgress();
                                        if (fMax2 != progress6) {
                                            if (progress6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                MotionLayout motionLayout5 = oooO0O1.f7307OooOOo;
                                                if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                motionLayout5.OooO0Oo(z2);
                                            } else {
                                                MotionLayout motionLayout6 = oooO0O1.f7307OooOOo;
                                                if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                motionLayout6.OooO0Oo(z2);
                                            }
                                            oooO0O1.f7307OooOOo.setProgress(fMax2);
                                            oooOOO2.OooO0O0(1000);
                                            float fOooO0OO5 = oooOOO2.OooO0OO();
                                            double dOooO0Oo2 = oooOOO2.OooO0Oo();
                                            double d2 = fOooO0OO5;
                                            oooO0O1.f7307OooOOo.f7147Oooo = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(dOooO0Oo2, d2) - dAtan2) * Math.hypot(dOooO0Oo2, d2)) / Math.hypot(rawX2, rawY2)));
                                        } else {
                                            oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                        }
                                        oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                        oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                                    }
                                }
                            } else {
                                oooOOO2.OooO00o(motionEvent);
                                action = motionEvent.getAction();
                                if (action == 0) {
                                    oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                    oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                                    oooO0O1.f7304OooOOO0 = false;
                                } else if (action == 1) {
                                    oooO0O1.f7304OooOOO0 = false;
                                    oooOOO2.OooO0O0(1000);
                                    fOooO0OO = oooOOO2.OooO0OO();
                                    fOooO0Oo = oooOOO2.OooO0Oo();
                                    progress = oooO0O1.f7307OooOOo.getProgress();
                                    i2 = oooO0O1.f7295OooO0Oo;
                                    if (i2 != -1) {
                                        oooO0O1.f7307OooOOo.OooO0oo(i2, progress, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                        c2 = 0;
                                        c = 1;
                                    } else {
                                        float fMin = Math.min(oooO0O1.f7307OooOOo.getWidth(), oooO0O1.f7307OooOOo.getHeight());
                                        float[] fArr7 = oooO0O1.f7303OooOOO;
                                        c = 1;
                                        fArr7[1] = oooO0O1.f7302OooOO0o * fMin;
                                        c2 = 0;
                                        fArr7[0] = fMin * oooO0O1.f7301OooOO0O;
                                    }
                                    f = oooO0O1.f7301OooOO0O;
                                    fArr = oooO0O1.f7303OooOOO;
                                    float f16 = fArr[c2];
                                    float f17 = fArr[c];
                                    if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        fAbs = fOooO0OO / fArr[c2];
                                    } else {
                                        fAbs = fOooO0Oo / fArr[c];
                                    }
                                    if (Float.isNaN(fAbs)) {
                                        f2 = progress;
                                    } else {
                                        f2 = (fAbs / 3.0f) + progress;
                                    }
                                    if (f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f2) {
                                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                        } else {
                                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                        }
                                    } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f2) {
                                        oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                    } else {
                                        oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                    }
                                } else if (action == 2) {
                                    rawY = motionEvent.getRawY() - oooO0O1.f7308OooOOo0;
                                    rawX = motionEvent.getRawX() - oooO0O1.f7306OooOOOo;
                                    if (Math.abs((oooO0O1.f7302OooOO0o * rawY) + (oooO0O1.f7301OooOO0O * rawX)) <= oooO0O1.f7310OooOo) {
                                        progress2 = oooO0O1.f7307OooOOo.getProgress();
                                        if (!oooO0O1.f7304OooOOO0) {
                                            oooO0O1.f7304OooOOO0 = true;
                                            oooO0O1.f7307OooOOo.setProgress(progress2);
                                        }
                                        i4 = oooO0O1.f7295OooO0Oo;
                                        if (i4 != -1) {
                                            oooO0O1.f7307OooOOo.OooO0oo(i4, progress2, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                            c4 = 0;
                                            c3 = 1;
                                        } else {
                                            float fMin2 = Math.min(oooO0O1.f7307OooOOo.getWidth(), oooO0O1.f7307OooOOo.getHeight());
                                            float[] fArr8 = oooO0O1.f7303OooOOO;
                                            c3 = 1;
                                            fArr8[1] = oooO0O1.f7302OooOO0o * fMin2;
                                            c4 = 0;
                                            fArr8[0] = fMin2 * oooO0O1.f7301OooOO0O;
                                        }
                                        f3 = oooO0O1.f7301OooOO0O;
                                        fArr2 = oooO0O1.f7303OooOOO;
                                        if (Math.abs(((oooO0O1.f7302OooOO0o * fArr2[c3]) + (f3 * fArr2[c4])) * oooO0O1.f7313OooOo0O) < 0.01d) {
                                            float[] fArr9 = oooO0O1.f7303OooOOO;
                                            c5 = 0;
                                            fArr9[0] = 0.01f;
                                            c6 = 1;
                                            fArr9[1] = 0.01f;
                                        } else {
                                            c5 = 0;
                                            c6 = 1;
                                        }
                                        if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            f4 = rawX / oooO0O1.f7303OooOOO[c5];
                                        } else {
                                            f4 = rawY / oooO0O1.f7303OooOOO[c6];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f4, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                        if (oooO0O1.f7294OooO0OO == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (oooO0O1.f7294OooO0OO == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = oooO0O1.f7307OooOOo.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                MotionLayout motionLayout7 = oooO0O1.f7307OooOOo;
                                                if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                motionLayout7.OooO0Oo(z);
                                            } else {
                                                MotionLayout motionLayout8 = oooO0O1.f7307OooOOo;
                                                if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                motionLayout8.OooO0Oo(z);
                                            }
                                            oooO0O1.f7307OooOOo.setProgress(fMax);
                                            oooOOO2.OooO0O0(1000);
                                            fOooO0OO2 = oooOOO2.OooO0OO();
                                            fOooO0Oo2 = oooOOO2.OooO0Oo();
                                            if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                f5 = fOooO0OO2 / oooO0O1.f7303OooOOO[0];
                                            } else {
                                                f5 = fOooO0Oo2 / oooO0O1.f7303OooOOO[1];
                                            }
                                            oooO0O1.f7307OooOOo.f7147Oooo = f5;
                                        } else {
                                            oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                        }
                                        oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                        oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                                    } else {
                                        progress2 = oooO0O1.f7307OooOOo.getProgress();
                                        if (!oooO0O1.f7304OooOOO0) {
                                            oooO0O1.f7304OooOOO0 = true;
                                            oooO0O1.f7307OooOOo.setProgress(progress2);
                                        }
                                        i4 = oooO0O1.f7295OooO0Oo;
                                        if (i4 != -1) {
                                            oooO0O1.f7307OooOOo.OooO0oo(i4, progress2, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                            c4 = 0;
                                            c3 = 1;
                                        } else {
                                            float fMin3 = Math.min(oooO0O1.f7307OooOOo.getWidth(), oooO0O1.f7307OooOOo.getHeight());
                                            float[] fArr10 = oooO0O1.f7303OooOOO;
                                            c3 = 1;
                                            fArr10[1] = oooO0O1.f7302OooOO0o * fMin3;
                                            c4 = 0;
                                            fArr10[0] = fMin3 * oooO0O1.f7301OooOO0O;
                                        }
                                        f3 = oooO0O1.f7301OooOO0O;
                                        fArr2 = oooO0O1.f7303OooOOO;
                                        if (Math.abs(((oooO0O1.f7302OooOO0o * fArr2[c3]) + (f3 * fArr2[c4])) * oooO0O1.f7313OooOo0O) < 0.01d) {
                                            float[] fArr11 = oooO0O1.f7303OooOOO;
                                            c5 = 0;
                                            fArr11[0] = 0.01f;
                                            c6 = 1;
                                            fArr11[1] = 0.01f;
                                        } else {
                                            c5 = 0;
                                            c6 = 1;
                                        }
                                        if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            f4 = rawX / oooO0O1.f7303OooOOO[c5];
                                        } else {
                                            f4 = rawY / oooO0O1.f7303OooOOO[c6];
                                        }
                                        fMax = Math.max(Math.min(progress2 + f4, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                        if (oooO0O1.f7294OooO0OO == 6) {
                                            fMax = Math.max(fMax, 0.01f);
                                        }
                                        if (oooO0O1.f7294OooO0OO == 7) {
                                            fMax = Math.min(fMax, 0.99f);
                                        }
                                        progress3 = oooO0O1.f7307OooOOo.getProgress();
                                        if (fMax != progress3) {
                                            if (progress3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                MotionLayout motionLayout9 = oooO0O1.f7307OooOOo;
                                                if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                motionLayout9.OooO0Oo(z);
                                            } else {
                                                MotionLayout motionLayout10 = oooO0O1.f7307OooOOo;
                                                if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                motionLayout10.OooO0Oo(z);
                                            }
                                            oooO0O1.f7307OooOOo.setProgress(fMax);
                                            oooOOO2.OooO0O0(1000);
                                            fOooO0OO2 = oooOOO2.OooO0OO();
                                            fOooO0Oo2 = oooOOO2.OooO0Oo();
                                            if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                                f5 = fOooO0OO2 / oooO0O1.f7303OooOOO[0];
                                            } else {
                                                f5 = fOooO0Oo2 / oooO0O1.f7303OooOOO[1];
                                            }
                                            oooO0O1.f7307OooOOo.f7147Oooo = f5;
                                        } else {
                                            oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                        }
                                        oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                        oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                                    }
                                }
                            }
                        }
                        oooO00o2.f7264OooOOo = motionEvent.getRawX();
                        oooO00o2.f7266OooOOoo = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            velocityTracker = oooOOO0.f7247OooO00o;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                oooOOO1 = null;
                                oooOOO0.f7247OooO00o = null;
                            } else {
                                oooOOO1 = null;
                            }
                            oooO00o2.f7262OooOOOO = oooOOO1;
                            i = this.f7152OoooO0;
                            if (i != -1) {
                                oooO00o2.OooO00o(this, i);
                            }
                        }
                    }
                }
            } else if (!oooO00o2.f7261OooOOO0) {
                oooO0O0 = oooO00o2.f7251OooO0OO;
                if (oooO0O0 != null) {
                    oooOOO2 = oooO00o2.f7262OooOOOO;
                    if (oooO0O1.f7300OooOO0) {
                        oooOOO2.OooO00o(motionEvent);
                        action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                            oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                            oooO0O1.f7304OooOOO0 = false;
                        } else if (action2 == 1) {
                            oooO0O1.f7304OooOOO0 = false;
                            oooOOO2.OooO0O0(16);
                            float fOooO0OO6 = oooOOO2.OooO0OO();
                            float fOooO0Oo4 = oooOOO2.OooO0Oo();
                            progress4 = oooO0O1.f7307OooOOo.getProgress();
                            float width3 = oooO0O1.f7307OooOOo.getWidth() / 2.0f;
                            float height3 = oooO0O1.f7307OooOOo.getHeight() / 2.0f;
                            i5 = oooO0O1.f7291OooO;
                            if (i5 != -1) {
                                View viewFindViewById5 = oooO0O1.f7307OooOOo.findViewById(i5);
                                oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                right = ((viewFindViewById5.getRight() + viewFindViewById5.getLeft()) / 2.0f) + oooO0O1.f7305OooOOOO[0];
                                f6 = oooO0O1.f7305OooOOOO[1];
                                top = viewFindViewById5.getTop();
                                bottom = viewFindViewById5.getBottom();
                            } else {
                                i6 = oooO0O1.f7295OooO0Oo;
                                if (i6 != -1) {
                                    MotionLayout motionLayout11 = oooO0O1.f7307OooOOo;
                                    View viewFindViewById6 = oooO0O1.f7307OooOOo.findViewById(motionLayout11.f7156OoooOOO.get(motionLayout11.findViewById(i6)).f27766OooO0o.f27805OoooOOO);
                                    oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                    right = ((viewFindViewById6.getRight() + viewFindViewById6.getLeft()) / 2.0f) + oooO0O1.f7305OooOOOO[0];
                                    f6 = oooO0O1.f7305OooOOOO[1];
                                    top = viewFindViewById6.getTop();
                                    bottom = viewFindViewById6.getBottom();
                                } else {
                                    float rawX6 = motionEvent.getRawX() - width3;
                                    float rawY6 = motionEvent.getRawY() - height3;
                                    double degrees4 = Math.toDegrees(Math.atan2(rawY6, rawX6));
                                    i7 = oooO0O1.f7295OooO0Oo;
                                    if (i7 != -1) {
                                        oooO0O1.f7307OooOOo.OooO0oo(i7, progress4, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                        float[] fArr12 = oooO0O1.f7303OooOOO;
                                        fArr12[1] = (float) Math.toDegrees(fArr12[1]);
                                    } else {
                                        oooO0O1.f7303OooOOO[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(fOooO0Oo4 + rawY6, fOooO0OO6 + rawX6)) - degrees4)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f7 = (((degrees * 3.0f) * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[1]) + progress4;
                                    } else {
                                        f7 = progress4;
                                    }
                                    if (f7 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                        } else {
                                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                        }
                                    } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                        oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                    } else {
                                        oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                    }
                                }
                            }
                            height3 = f6 + ((bottom + top) / 2.0f);
                            width3 = right;
                            float rawX7 = motionEvent.getRawX() - width3;
                            float rawY7 = motionEvent.getRawY() - height3;
                            double degrees5 = Math.toDegrees(Math.atan2(rawY7, rawX7));
                            i7 = oooO0O1.f7295OooO0Oo;
                            if (i7 != -1) {
                                oooO0O1.f7307OooOOo.OooO0oo(i7, progress4, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                float[] fArr13 = oooO0O1.f7303OooOOO;
                                fArr13[1] = (float) Math.toDegrees(fArr13[1]);
                            } else {
                                oooO0O1.f7303OooOOO[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(fOooO0Oo4 + rawY7, fOooO0OO6 + rawX7)) - degrees5)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f7 = (((degrees * 3.0f) * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[1]) + progress4;
                            } else {
                                f7 = progress4;
                            }
                            if (f7 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                    oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                } else {
                                    oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                }
                            } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                            } else {
                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            width = oooO0O1.f7307OooOOo.getWidth() / 2.0f;
                            height = oooO0O1.f7307OooOOo.getHeight() / 2.0f;
                            i9 = oooO0O1.f7291OooO;
                            if (i9 != -1) {
                                View viewFindViewById7 = oooO0O1.f7307OooOOo.findViewById(i9);
                                oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                float right3 = oooO0O1.f7305OooOOOO[0] + ((viewFindViewById7.getRight() + viewFindViewById7.getLeft()) / 2.0f);
                                height = ((viewFindViewById7.getBottom() + viewFindViewById7.getTop()) / 2.0f) + oooO0O1.f7305OooOOOO[1];
                                width = right3;
                            } else {
                                i10 = oooO0O1.f7295OooO0Oo;
                                if (i10 != -1) {
                                    MotionLayout motionLayout12 = oooO0O1.f7307OooOOo;
                                    viewFindViewById = oooO0O1.f7307OooOOo.findViewById(motionLayout12.f7156OoooOOO.get(motionLayout12.findViewById(i10)).f27766OooO0o.f27805OoooOOO);
                                    if (viewFindViewById == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                        width = oooO0O1.f7305OooOOOO[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                        height = oooO0O1.f7305OooOOOO[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                    }
                                }
                            }
                            rawX2 = motionEvent.getRawX() - width;
                            rawY2 = motionEvent.getRawY() - height;
                            dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                            fAtan2 = (float) (((dAtan2 - Math.atan2(oooO0O1.f7308OooOOo0 - height, oooO0O1.f7306OooOOOo - width)) * 180.0d) / 3.141592653589793d);
                            if (fAtan2 > 330.0f) {
                                fAtan2 -= 360.0f;
                            } else if (fAtan2 < -330.0f) {
                                fAtan2 += 360.0f;
                            }
                            if (Math.abs(fAtan2) <= 0.01d) {
                                progress5 = oooO0O1.f7307OooOOo.getProgress();
                                if (!oooO0O1.f7304OooOOO0) {
                                    oooO0O1.f7304OooOOO0 = true;
                                    oooO0O1.f7307OooOOo.setProgress(progress5);
                                }
                                i11 = oooO0O1.f7295OooO0Oo;
                                if (i11 != -1) {
                                    oooO0O1.f7307OooOOo.OooO0oo(i11, progress5, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                    float[] fArr14 = oooO0O1.f7303OooOOO;
                                    c7 = 1;
                                    fArr14[1] = (float) Math.toDegrees(fArr14[1]);
                                } else {
                                    c7 = 1;
                                    oooO0O1.f7303OooOOO[1] = 360.0f;
                                }
                                fMax2 = Math.max(Math.min(((fAtan2 * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[c7]) + progress5, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                progress6 = oooO0O1.f7307OooOOo.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        MotionLayout motionLayout13 = oooO0O1.f7307OooOOo;
                                        if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout13.OooO0Oo(z2);
                                    } else {
                                        MotionLayout motionLayout14 = oooO0O1.f7307OooOOo;
                                        if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout14.OooO0Oo(z2);
                                    }
                                    oooO0O1.f7307OooOOo.setProgress(fMax2);
                                    oooOOO2.OooO0O0(1000);
                                    float fOooO0OO7 = oooOOO2.OooO0OO();
                                    double dOooO0Oo3 = oooOOO2.OooO0Oo();
                                    double d3 = fOooO0OO7;
                                    oooO0O1.f7307OooOOo.f7147Oooo = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(dOooO0Oo3, d3) - dAtan2) * Math.hypot(dOooO0Oo3, d3)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                }
                                oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                            } else {
                                progress5 = oooO0O1.f7307OooOOo.getProgress();
                                if (!oooO0O1.f7304OooOOO0) {
                                    oooO0O1.f7304OooOOO0 = true;
                                    oooO0O1.f7307OooOOo.setProgress(progress5);
                                }
                                i11 = oooO0O1.f7295OooO0Oo;
                                if (i11 != -1) {
                                    oooO0O1.f7307OooOOo.OooO0oo(i11, progress5, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                    float[] fArr15 = oooO0O1.f7303OooOOO;
                                    c7 = 1;
                                    fArr15[1] = (float) Math.toDegrees(fArr15[1]);
                                } else {
                                    c7 = 1;
                                    oooO0O1.f7303OooOOO[1] = 360.0f;
                                }
                                fMax2 = Math.max(Math.min(((fAtan2 * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[c7]) + progress5, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                progress6 = oooO0O1.f7307OooOOo.getProgress();
                                if (fMax2 != progress6) {
                                    if (progress6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        MotionLayout motionLayout15 = oooO0O1.f7307OooOOo;
                                        if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout15.OooO0Oo(z2);
                                    } else {
                                        MotionLayout motionLayout16 = oooO0O1.f7307OooOOo;
                                        if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        motionLayout16.OooO0Oo(z2);
                                    }
                                    oooO0O1.f7307OooOOo.setProgress(fMax2);
                                    oooOOO2.OooO0O0(1000);
                                    float fOooO0OO8 = oooOOO2.OooO0OO();
                                    double dOooO0Oo4 = oooOOO2.OooO0Oo();
                                    double d4 = fOooO0OO8;
                                    oooO0O1.f7307OooOOo.f7147Oooo = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(dOooO0Oo4, d4) - dAtan2) * Math.hypot(dOooO0Oo4, d4)) / Math.hypot(rawX2, rawY2)));
                                } else {
                                    oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                }
                                oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                            }
                        }
                    } else {
                        oooOOO2.OooO00o(motionEvent);
                        action = motionEvent.getAction();
                        if (action == 0) {
                            oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                            oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                            oooO0O1.f7304OooOOO0 = false;
                        } else if (action == 1) {
                            oooO0O1.f7304OooOOO0 = false;
                            oooOOO2.OooO0O0(1000);
                            fOooO0OO = oooOOO2.OooO0OO();
                            fOooO0Oo = oooOOO2.OooO0Oo();
                            progress = oooO0O1.f7307OooOOo.getProgress();
                            i2 = oooO0O1.f7295OooO0Oo;
                            if (i2 != -1) {
                                oooO0O1.f7307OooOOo.OooO0oo(i2, progress, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                c2 = 0;
                                c = 1;
                            } else {
                                float fMin4 = Math.min(oooO0O1.f7307OooOOo.getWidth(), oooO0O1.f7307OooOOo.getHeight());
                                float[] fArr16 = oooO0O1.f7303OooOOO;
                                c = 1;
                                fArr16[1] = oooO0O1.f7302OooOO0o * fMin4;
                                c2 = 0;
                                fArr16[0] = fMin4 * oooO0O1.f7301OooOO0O;
                            }
                            f = oooO0O1.f7301OooOO0O;
                            fArr = oooO0O1.f7303OooOOO;
                            float f18 = fArr[c2];
                            float f19 = fArr[c];
                            if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                fAbs = fOooO0OO / fArr[c2];
                            } else {
                                fAbs = fOooO0Oo / fArr[c];
                            }
                            if (Float.isNaN(fAbs)) {
                                f2 = (fAbs / 3.0f) + progress;
                            } else {
                                f2 = progress;
                            }
                            if (f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f2) {
                                    oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                } else {
                                    oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                }
                            } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f2) {
                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                            } else {
                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                            }
                        } else if (action == 2) {
                            rawY = motionEvent.getRawY() - oooO0O1.f7308OooOOo0;
                            rawX = motionEvent.getRawX() - oooO0O1.f7306OooOOOo;
                            if (Math.abs((oooO0O1.f7302OooOO0o * rawY) + (oooO0O1.f7301OooOO0O * rawX)) <= oooO0O1.f7310OooOo) {
                                progress2 = oooO0O1.f7307OooOOo.getProgress();
                                if (!oooO0O1.f7304OooOOO0) {
                                    oooO0O1.f7304OooOOO0 = true;
                                    oooO0O1.f7307OooOOo.setProgress(progress2);
                                }
                                i4 = oooO0O1.f7295OooO0Oo;
                                if (i4 != -1) {
                                    oooO0O1.f7307OooOOo.OooO0oo(i4, progress2, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                    c4 = 0;
                                    c3 = 1;
                                } else {
                                    float fMin5 = Math.min(oooO0O1.f7307OooOOo.getWidth(), oooO0O1.f7307OooOOo.getHeight());
                                    float[] fArr17 = oooO0O1.f7303OooOOO;
                                    c3 = 1;
                                    fArr17[1] = oooO0O1.f7302OooOO0o * fMin5;
                                    c4 = 0;
                                    fArr17[0] = fMin5 * oooO0O1.f7301OooOO0O;
                                }
                                f3 = oooO0O1.f7301OooOO0O;
                                fArr2 = oooO0O1.f7303OooOOO;
                                if (Math.abs(((oooO0O1.f7302OooOO0o * fArr2[c3]) + (f3 * fArr2[c4])) * oooO0O1.f7313OooOo0O) < 0.01d) {
                                    float[] fArr18 = oooO0O1.f7303OooOOO;
                                    c5 = 0;
                                    fArr18[0] = 0.01f;
                                    c6 = 1;
                                    fArr18[1] = 0.01f;
                                } else {
                                    c5 = 0;
                                    c6 = 1;
                                }
                                if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    f4 = rawX / oooO0O1.f7303OooOOO[c5];
                                } else {
                                    f4 = rawY / oooO0O1.f7303OooOOO[c6];
                                }
                                fMax = Math.max(Math.min(progress2 + f4, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                if (oooO0O1.f7294OooO0OO == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (oooO0O1.f7294OooO0OO == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = oooO0O1.f7307OooOOo.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        MotionLayout motionLayout17 = oooO0O1.f7307OooOOo;
                                        if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        motionLayout17.OooO0Oo(z);
                                    } else {
                                        MotionLayout motionLayout18 = oooO0O1.f7307OooOOo;
                                        if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        motionLayout18.OooO0Oo(z);
                                    }
                                    oooO0O1.f7307OooOOo.setProgress(fMax);
                                    oooOOO2.OooO0O0(1000);
                                    fOooO0OO2 = oooOOO2.OooO0OO();
                                    fOooO0Oo2 = oooOOO2.OooO0Oo();
                                    if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        f5 = fOooO0OO2 / oooO0O1.f7303OooOOO[0];
                                    } else {
                                        f5 = fOooO0Oo2 / oooO0O1.f7303OooOOO[1];
                                    }
                                    oooO0O1.f7307OooOOo.f7147Oooo = f5;
                                } else {
                                    oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                }
                                oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                            } else {
                                progress2 = oooO0O1.f7307OooOOo.getProgress();
                                if (!oooO0O1.f7304OooOOO0) {
                                    oooO0O1.f7304OooOOO0 = true;
                                    oooO0O1.f7307OooOOo.setProgress(progress2);
                                }
                                i4 = oooO0O1.f7295OooO0Oo;
                                if (i4 != -1) {
                                    oooO0O1.f7307OooOOo.OooO0oo(i4, progress2, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                    c4 = 0;
                                    c3 = 1;
                                } else {
                                    float fMin6 = Math.min(oooO0O1.f7307OooOOo.getWidth(), oooO0O1.f7307OooOOo.getHeight());
                                    float[] fArr19 = oooO0O1.f7303OooOOO;
                                    c3 = 1;
                                    fArr19[1] = oooO0O1.f7302OooOO0o * fMin6;
                                    c4 = 0;
                                    fArr19[0] = fMin6 * oooO0O1.f7301OooOO0O;
                                }
                                f3 = oooO0O1.f7301OooOO0O;
                                fArr2 = oooO0O1.f7303OooOOO;
                                if (Math.abs(((oooO0O1.f7302OooOO0o * fArr2[c3]) + (f3 * fArr2[c4])) * oooO0O1.f7313OooOo0O) < 0.01d) {
                                    float[] fArr110 = oooO0O1.f7303OooOOO;
                                    c5 = 0;
                                    fArr110[0] = 0.01f;
                                    c6 = 1;
                                    fArr110[1] = 0.01f;
                                } else {
                                    c5 = 0;
                                    c6 = 1;
                                }
                                if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    f4 = rawX / oooO0O1.f7303OooOOO[c5];
                                } else {
                                    f4 = rawY / oooO0O1.f7303OooOOO[c6];
                                }
                                fMax = Math.max(Math.min(progress2 + f4, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                if (oooO0O1.f7294OooO0OO == 6) {
                                    fMax = Math.max(fMax, 0.01f);
                                }
                                if (oooO0O1.f7294OooO0OO == 7) {
                                    fMax = Math.min(fMax, 0.99f);
                                }
                                progress3 = oooO0O1.f7307OooOOo.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        MotionLayout motionLayout19 = oooO0O1.f7307OooOOo;
                                        if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        motionLayout19.OooO0Oo(z);
                                    } else {
                                        MotionLayout motionLayout110 = oooO0O1.f7307OooOOo;
                                        if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        motionLayout110.OooO0Oo(z);
                                    }
                                    oooO0O1.f7307OooOOo.setProgress(fMax);
                                    oooOOO2.OooO0O0(1000);
                                    fOooO0OO2 = oooOOO2.OooO0OO();
                                    fOooO0Oo2 = oooOOO2.OooO0Oo();
                                    if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        f5 = fOooO0OO2 / oooO0O1.f7303OooOOO[0];
                                    } else {
                                        f5 = fOooO0Oo2 / oooO0O1.f7303OooOOO[1];
                                    }
                                    oooO0O1.f7307OooOOo.f7147Oooo = f5;
                                } else {
                                    oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                }
                                oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                                oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                            }
                        }
                    }
                }
                oooO00o2.f7264OooOOo = motionEvent.getRawX();
                oooO00o2.f7266OooOOoo = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    velocityTracker = oooOOO0.f7247OooO00o;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        oooOOO1 = null;
                        oooOOO0.f7247OooO00o = null;
                    } else {
                        oooOOO1 = null;
                    }
                    oooO00o2.f7262OooOOOO = oooOOO1;
                    i = this.f7152OoooO0;
                    if (i != -1) {
                        oooO00o2.OooO00o(this, i);
                    }
                }
            }
        } else if (!oooO00o2.f7261OooOOO0) {
            oooO0O0 = oooO00o2.f7251OooO0OO;
            if (oooO0O0 != null && (oooO0O1 = oooO0O0.f7279OooOO0o) != null && !oooO00o2.f7260OooOOO) {
                oooOOO2 = oooO00o2.f7262OooOOOO;
                if (oooO0O1.f7300OooOO0) {
                    oooOOO2.OooO00o(motionEvent);
                    action2 = motionEvent.getAction();
                    if (action2 == 0) {
                        oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                        oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                        oooO0O1.f7304OooOOO0 = false;
                    } else if (action2 == 1) {
                        oooO0O1.f7304OooOOO0 = false;
                        oooOOO2.OooO0O0(16);
                        float fOooO0OO9 = oooOOO2.OooO0OO();
                        float fOooO0Oo5 = oooOOO2.OooO0Oo();
                        progress4 = oooO0O1.f7307OooOOo.getProgress();
                        float width4 = oooO0O1.f7307OooOOo.getWidth() / 2.0f;
                        float height4 = oooO0O1.f7307OooOOo.getHeight() / 2.0f;
                        i5 = oooO0O1.f7291OooO;
                        if (i5 != -1) {
                            View viewFindViewById8 = oooO0O1.f7307OooOOo.findViewById(i5);
                            oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                            right = ((viewFindViewById8.getRight() + viewFindViewById8.getLeft()) / 2.0f) + oooO0O1.f7305OooOOOO[0];
                            f6 = oooO0O1.f7305OooOOOO[1];
                            top = viewFindViewById8.getTop();
                            bottom = viewFindViewById8.getBottom();
                        } else {
                            i6 = oooO0O1.f7295OooO0Oo;
                            if (i6 != -1) {
                                MotionLayout motionLayout111 = oooO0O1.f7307OooOOo;
                                View viewFindViewById9 = oooO0O1.f7307OooOOo.findViewById(motionLayout111.f7156OoooOOO.get(motionLayout111.findViewById(i6)).f27766OooO0o.f27805OoooOOO);
                                oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                right = ((viewFindViewById9.getRight() + viewFindViewById9.getLeft()) / 2.0f) + oooO0O1.f7305OooOOOO[0];
                                f6 = oooO0O1.f7305OooOOOO[1];
                                top = viewFindViewById9.getTop();
                                bottom = viewFindViewById9.getBottom();
                            } else {
                                float rawX8 = motionEvent.getRawX() - width4;
                                float rawY8 = motionEvent.getRawY() - height4;
                                double degrees6 = Math.toDegrees(Math.atan2(rawY8, rawX8));
                                i7 = oooO0O1.f7295OooO0Oo;
                                if (i7 != -1) {
                                    oooO0O1.f7307OooOOo.OooO0oo(i7, progress4, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                    float[] fArr111 = oooO0O1.f7303OooOOO;
                                    fArr111[1] = (float) Math.toDegrees(fArr111[1]);
                                } else {
                                    oooO0O1.f7303OooOOO[1] = 360.0f;
                                }
                                degrees = ((float) (Math.toDegrees(Math.atan2(fOooO0Oo5 + rawY8, fOooO0OO9 + rawX8)) - degrees6)) * 62.5f;
                                if (Float.isNaN(degrees)) {
                                    f7 = (((degrees * 3.0f) * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[1]) + progress4;
                                } else {
                                    f7 = progress4;
                                }
                                if (f7 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f7 != 1.0f && (i8 = oooO0O1.f7294OooO0OO) != 3) {
                                    float fAbs2 = (degrees * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[1];
                                    float f20 = ((double) f7) < 0.5d ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f;
                                    if (i8 == 6) {
                                        if (progress4 + fAbs2 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                            fAbs2 = Math.abs(fAbs2);
                                        }
                                        f20 = 1.0f;
                                    }
                                    if (oooO0O1.f7294OooO0OO == 7) {
                                        if (progress4 + fAbs2 > 1.0f) {
                                            fAbs2 = -Math.abs(fAbs2);
                                        }
                                        f20 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                    }
                                    oooO0O1.f7307OooOOo.OooOo0o(oooO0O1.f7294OooO0OO, f20, fAbs2 * 3.0f);
                                    if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE >= progress4 || 1.0f <= progress4) {
                                        oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                    }
                                } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7 || 1.0f <= f7) {
                                    oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                                }
                            }
                        }
                        height4 = f6 + ((bottom + top) / 2.0f);
                        width4 = right;
                        float rawX9 = motionEvent.getRawX() - width4;
                        float rawY9 = motionEvent.getRawY() - height4;
                        double degrees7 = Math.toDegrees(Math.atan2(rawY9, rawX9));
                        i7 = oooO0O1.f7295OooO0Oo;
                        if (i7 != -1) {
                            oooO0O1.f7307OooOOo.OooO0oo(i7, progress4, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                            float[] fArr112 = oooO0O1.f7303OooOOO;
                            fArr112[1] = (float) Math.toDegrees(fArr112[1]);
                        } else {
                            oooO0O1.f7303OooOOO[1] = 360.0f;
                        }
                        degrees = ((float) (Math.toDegrees(Math.atan2(fOooO0Oo5 + rawY9, fOooO0OO9 + rawX9)) - degrees7)) * 62.5f;
                        if (Float.isNaN(degrees)) {
                            f7 = (((degrees * 3.0f) * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[1]) + progress4;
                        } else {
                            f7 = progress4;
                        }
                        if (f7 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                            } else {
                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                            }
                        } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f7) {
                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                        } else {
                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                        }
                    } else if (action2 == 2) {
                        motionEvent.getRawY();
                        motionEvent.getRawX();
                        width = oooO0O1.f7307OooOOo.getWidth() / 2.0f;
                        height = oooO0O1.f7307OooOOo.getHeight() / 2.0f;
                        i9 = oooO0O1.f7291OooO;
                        if (i9 != -1) {
                            View viewFindViewById10 = oooO0O1.f7307OooOOo.findViewById(i9);
                            oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                            float right4 = oooO0O1.f7305OooOOOO[0] + ((viewFindViewById10.getRight() + viewFindViewById10.getLeft()) / 2.0f);
                            height = ((viewFindViewById10.getBottom() + viewFindViewById10.getTop()) / 2.0f) + oooO0O1.f7305OooOOOO[1];
                            width = right4;
                        } else {
                            i10 = oooO0O1.f7295OooO0Oo;
                            if (i10 != -1) {
                                MotionLayout motionLayout112 = oooO0O1.f7307OooOOo;
                                viewFindViewById = oooO0O1.f7307OooOOo.findViewById(motionLayout112.f7156OoooOOO.get(motionLayout112.findViewById(i10)).f27766OooO0o.f27805OoooOOO);
                                if (viewFindViewById == null) {
                                    Log.e("TouchResponse", "could not find view to animate to");
                                } else {
                                    oooO0O1.f7307OooOOo.getLocationOnScreen(oooO0O1.f7305OooOOOO);
                                    width = oooO0O1.f7305OooOOOO[0] + ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f);
                                    height = oooO0O1.f7305OooOOOO[1] + ((viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f);
                                }
                            }
                        }
                        rawX2 = motionEvent.getRawX() - width;
                        rawY2 = motionEvent.getRawY() - height;
                        dAtan2 = Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width);
                        fAtan2 = (float) (((dAtan2 - Math.atan2(oooO0O1.f7308OooOOo0 - height, oooO0O1.f7306OooOOOo - width)) * 180.0d) / 3.141592653589793d);
                        if (fAtan2 > 330.0f) {
                            fAtan2 -= 360.0f;
                        } else if (fAtan2 < -330.0f) {
                            fAtan2 += 360.0f;
                        }
                        if (Math.abs(fAtan2) <= 0.01d || oooO0O1.f7304OooOOO0) {
                            progress5 = oooO0O1.f7307OooOOo.getProgress();
                            if (!oooO0O1.f7304OooOOO0) {
                                oooO0O1.f7304OooOOO0 = true;
                                oooO0O1.f7307OooOOo.setProgress(progress5);
                            }
                            i11 = oooO0O1.f7295OooO0Oo;
                            if (i11 != -1) {
                                oooO0O1.f7307OooOOo.OooO0oo(i11, progress5, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                float[] fArr113 = oooO0O1.f7303OooOOO;
                                c7 = 1;
                                fArr113[1] = (float) Math.toDegrees(fArr113[1]);
                            } else {
                                c7 = 1;
                                oooO0O1.f7303OooOOO[1] = 360.0f;
                            }
                            fMax2 = Math.max(Math.min(((fAtan2 * oooO0O1.f7313OooOo0O) / oooO0O1.f7303OooOOO[c7]) + progress5, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                            progress6 = oooO0O1.f7307OooOOo.getProgress();
                            if (fMax2 != progress6) {
                                if (progress6 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || progress6 == 1.0f) {
                                    MotionLayout motionLayout113 = oooO0O1.f7307OooOOo;
                                    if (progress6 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    motionLayout113.OooO0Oo(z2);
                                }
                                oooO0O1.f7307OooOOo.setProgress(fMax2);
                                oooOOO2.OooO0O0(1000);
                                float fOooO0OO10 = oooOOO2.OooO0OO();
                                double dOooO0Oo5 = oooOOO2.OooO0Oo();
                                double d5 = fOooO0OO10;
                                oooO0O1.f7307OooOOo.f7147Oooo = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(dOooO0Oo5, d5) - dAtan2) * Math.hypot(dOooO0Oo5, d5)) / Math.hypot(rawX2, rawY2)));
                            } else {
                                oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            }
                            oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                            oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                        }
                    }
                } else {
                    oooOOO2.OooO00o(motionEvent);
                    action = motionEvent.getAction();
                    if (action == 0) {
                        oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                        oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                        oooO0O1.f7304OooOOO0 = false;
                    } else if (action == 1) {
                        oooO0O1.f7304OooOOO0 = false;
                        oooOOO2.OooO0O0(1000);
                        fOooO0OO = oooOOO2.OooO0OO();
                        fOooO0Oo = oooOOO2.OooO0Oo();
                        progress = oooO0O1.f7307OooOOo.getProgress();
                        i2 = oooO0O1.f7295OooO0Oo;
                        if (i2 != -1) {
                            oooO0O1.f7307OooOOo.OooO0oo(i2, progress, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                            c2 = 0;
                            c = 1;
                        } else {
                            float fMin7 = Math.min(oooO0O1.f7307OooOOo.getWidth(), oooO0O1.f7307OooOOo.getHeight());
                            float[] fArr114 = oooO0O1.f7303OooOOO;
                            c = 1;
                            fArr114[1] = oooO0O1.f7302OooOO0o * fMin7;
                            c2 = 0;
                            fArr114[0] = fMin7 * oooO0O1.f7301OooOO0O;
                        }
                        f = oooO0O1.f7301OooOO0O;
                        fArr = oooO0O1.f7303OooOOO;
                        float f110 = fArr[c2];
                        float f111 = fArr[c];
                        if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                            fAbs = fOooO0OO / fArr[c2];
                        } else {
                            fAbs = fOooO0Oo / fArr[c];
                        }
                        if (Float.isNaN(fAbs)) {
                            f2 = (fAbs / 3.0f) + progress;
                        } else {
                            f2 = progress;
                        }
                        if (f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 != 1.0f && (i3 = oooO0O1.f7294OooO0OO) != 3) {
                            float f21 = ((double) f2) < 0.5d ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : 1.0f;
                            if (i3 == 6) {
                                if (progress + fAbs < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    fAbs = Math.abs(fAbs);
                                }
                                f21 = 1.0f;
                            }
                            if (oooO0O1.f7294OooO0OO == 7) {
                                if (progress + fAbs > 1.0f) {
                                    fAbs = -Math.abs(fAbs);
                                }
                                f21 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            }
                            oooO0O1.f7307OooOOo.OooOo0o(oooO0O1.f7294OooO0OO, f21, fAbs);
                            if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE >= progress || 1.0f <= progress) {
                                oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                            }
                        } else if (ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE < f2 || 1.0f <= f2) {
                            oooO0O1.f7307OooOOo.setState(OooOo00.FINISHED);
                        }
                    } else if (action == 2) {
                        rawY = motionEvent.getRawY() - oooO0O1.f7308OooOOo0;
                        rawX = motionEvent.getRawX() - oooO0O1.f7306OooOOOo;
                        if (Math.abs((oooO0O1.f7302OooOO0o * rawY) + (oooO0O1.f7301OooOO0O * rawX)) <= oooO0O1.f7310OooOo || oooO0O1.f7304OooOOO0) {
                            progress2 = oooO0O1.f7307OooOOo.getProgress();
                            if (!oooO0O1.f7304OooOOO0) {
                                oooO0O1.f7304OooOOO0 = true;
                                oooO0O1.f7307OooOOo.setProgress(progress2);
                            }
                            i4 = oooO0O1.f7295OooO0Oo;
                            if (i4 != -1) {
                                oooO0O1.f7307OooOOo.OooO0oo(i4, progress2, oooO0O1.f7299OooO0oo, oooO0O1.f7298OooO0oO, oooO0O1.f7303OooOOO);
                                c4 = 0;
                                c3 = 1;
                            } else {
                                float fMin8 = Math.min(oooO0O1.f7307OooOOo.getWidth(), oooO0O1.f7307OooOOo.getHeight());
                                float[] fArr115 = oooO0O1.f7303OooOOO;
                                c3 = 1;
                                fArr115[1] = oooO0O1.f7302OooOO0o * fMin8;
                                c4 = 0;
                                fArr115[0] = fMin8 * oooO0O1.f7301OooOO0O;
                            }
                            f3 = oooO0O1.f7301OooOO0O;
                            fArr2 = oooO0O1.f7303OooOOO;
                            if (Math.abs(((oooO0O1.f7302OooOO0o * fArr2[c3]) + (f3 * fArr2[c4])) * oooO0O1.f7313OooOo0O) < 0.01d) {
                                float[] fArr116 = oooO0O1.f7303OooOOO;
                                c5 = 0;
                                fArr116[0] = 0.01f;
                                c6 = 1;
                                fArr116[1] = 0.01f;
                            } else {
                                c5 = 0;
                                c6 = 1;
                            }
                            if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                f4 = rawX / oooO0O1.f7303OooOOO[c5];
                            } else {
                                f4 = rawY / oooO0O1.f7303OooOOO[c6];
                            }
                            fMax = Math.max(Math.min(progress2 + f4, 1.0f), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                            if (oooO0O1.f7294OooO0OO == 6) {
                                fMax = Math.max(fMax, 0.01f);
                            }
                            if (oooO0O1.f7294OooO0OO == 7) {
                                fMax = Math.min(fMax, 0.99f);
                            }
                            progress3 = oooO0O1.f7307OooOOo.getProgress();
                            if (fMax != progress3) {
                                if (progress3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || progress3 == 1.0f) {
                                    MotionLayout motionLayout114 = oooO0O1.f7307OooOOo;
                                    if (progress3 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    motionLayout114.OooO0Oo(z);
                                }
                                oooO0O1.f7307OooOOo.setProgress(fMax);
                                oooOOO2.OooO0O0(1000);
                                fOooO0OO2 = oooOOO2.OooO0OO();
                                fOooO0Oo2 = oooOOO2.OooO0Oo();
                                if (oooO0O1.f7301OooOO0O != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    f5 = fOooO0OO2 / oooO0O1.f7303OooOOO[0];
                                } else {
                                    f5 = fOooO0Oo2 / oooO0O1.f7303OooOOO[1];
                                }
                                oooO0O1.f7307OooOOo.f7147Oooo = f5;
                            } else {
                                oooO0O1.f7307OooOOo.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            }
                            oooO0O1.f7306OooOOOo = motionEvent.getRawX();
                            oooO0O1.f7308OooOOo0 = motionEvent.getRawY();
                        }
                    }
                }
            }
            oooO00o2.f7264OooOOo = motionEvent.getRawX();
            oooO00o2.f7266OooOOoo = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (oooOOO0 = oooO00o2.f7262OooOOOO) != null) {
                velocityTracker = oooOOO0.f7247OooO00o;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    oooOOO1 = null;
                    oooOOO0.f7247OooO00o = null;
                } else {
                    oooOOO1 = null;
                }
                oooO00o2.f7262OooOOOO = oooOOO1;
                i = this.f7152OoooO0;
                if (i != -1) {
                    oooO00o2.OooO00o(this, i);
                }
            }
        }
        if (this.f7148Oooo0o.f7251OooO0OO.OooO00o(4)) {
            return this.f7148Oooo0o.f7251OooO0OO.f7279OooOO0o.f7304OooOOO0;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f7203o0OOO0o == null) {
                this.f7203o0OOO0o = new CopyOnWriteArrayList<>();
            }
            this.f7203o0OOO0o.add(motionHelper);
            if (motionHelper.f7142OoooOO0) {
                if (this.f7206o0ooOO0 == null) {
                    this.f7206o0ooOO0 = new ArrayList<>();
                }
                this.f7206o0ooOO0.add(motionHelper);
            }
            if (motionHelper.f7145o000oOoO) {
                if (this.f7207o0ooOOo == null) {
                    this.f7207o0ooOOo = new ArrayList<>();
                }
                this.f7207o0ooOOo.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f7208o0ooOoO == null) {
                    this.f7208o0ooOoO = new ArrayList<>();
                }
                this.f7208o0ooOoO.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f7206o0ooOO0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f7207o0ooOOo;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        if (!this.f7172o000000 && this.f7152OoooO0 == -1 && (oooO00o = this.f7148Oooo0o) != null && (oooO0O0 = oooO00o.f7251OooO0OO) != null) {
            int i = oooO0O0.f7285OooOOo0;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    this.f7156OoooOOO.get(getChildAt(i2)).f27765OooO0Oo = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.f7167Oooooo0 = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f7190o0000oo = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f7193o000oOoO = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f7148Oooo0o != null) {
            setState(OooOo00.MOVING);
            Interpolator interpolatorOooO0o = this.f7148Oooo0o.OooO0o();
            if (interpolatorOooO0o != null) {
                setProgress(interpolatorOooO0o.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f7207o0ooOOo;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f7207o0ooOOo.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f7206o0ooOO0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f7206o0ooOO0.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f7180o00000oO == null) {
                this.f7180o00000oO = new OooOOO();
            }
            this.f7180o00000oO.f7241OooO00o = f;
            return;
        }
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            if (this.f7160OoooOoo == 1.0f && this.f7152OoooO0 == this.f7154OoooO0O) {
                setState(OooOo00.MOVING);
            }
            this.f7152OoooO0 = this.f7153OoooO00;
            if (this.f7160OoooOoo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                setState(OooOo00.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f7160OoooOoo == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && this.f7152OoooO0 == this.f7153OoooO00) {
                setState(OooOo00.MOVING);
            }
            this.f7152OoooO0 = this.f7154OoooO0O;
            if (this.f7160OoooOoo == 1.0f) {
                setState(OooOo00.FINISHED);
            }
        } else {
            this.f7152OoooO0 = -1;
            setState(OooOo00.MOVING);
        }
        if (this.f7148Oooo0o == null) {
            return;
        }
        this.f7163OooooO0 = true;
        this.f7162Ooooo0o = f;
        this.f7159OoooOoO = f;
        this.f7161Ooooo00 = -1L;
        this.f7157OoooOOo = -1L;
        this.f7149Oooo0oO = null;
        this.f7164OooooOO = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.OooO00o oooO00o) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        this.f7148Oooo0o = oooO00o;
        boolean zIsRtl = isRtl();
        oooO00o.f7263OooOOOo = zIsRtl;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = oooO00o.f7251OooO0OO;
        if (oooO0O1 != null && (oooO0O0 = oooO0O1.f7279OooOO0o) != null) {
            oooO0O0.OooO0OO(zIsRtl);
        }
        OooOo0();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.f7152OoooO0 = i;
            return;
        }
        if (this.f7180o00000oO == null) {
            this.f7180o00000oO = new OooOOO();
        }
        OooOOO oooOOO = this.f7180o00000oO;
        oooOOO.f7243OooO0OO = i;
        oooOOO.f7244OooO0Oo = i;
    }

    public void setState(OooOo00 oooOo00) {
        OooOo00 oooOo01 = OooOo00.FINISHED;
        if (oooOo00 == oooOo01 && this.f7152OoooO0 == -1) {
            return;
        }
        OooOo00 oooOo02 = this.f7189o0000oO;
        this.f7189o0000oO = oooOo00;
        OooOo00 oooOo03 = OooOo00.MOVING;
        if (oooOo02 == oooOo03 && oooOo00 == oooOo03) {
            OooO0o();
        }
        int i = OooO0o.f7219OooO00o[oooOo02.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && oooOo00 == oooOo01) {
                OooO0oO();
                return;
            }
            return;
        }
        if (oooOo00 == oooOo03) {
            OooO0o();
        }
        if (oooOo00 == oooOo01) {
            OooO0oO();
        }
    }

    public void setTransition(int i) {
        if (this.f7148Oooo0o != null) {
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOOo = OooOOOo(i);
            this.f7153OoooO00 = oooO0O0OooOOOo.f7272OooO0Oo;
            this.f7154OoooO0O = oooO0O0OooOOOo.f7271OooO0OO;
            if (!isAttachedToWindow()) {
                if (this.f7180o00000oO == null) {
                    this.f7180o00000oO = new OooOOO();
                }
                OooOOO oooOOO = this.f7180o00000oO;
                oooOOO.f7243OooO0OO = this.f7153OoooO00;
                oooOOO.f7244OooO0Oo = this.f7154OoooO0O;
                return;
            }
            float f = Float.NaN;
            int i2 = this.f7152OoooO0;
            if (i2 == this.f7153OoooO00) {
                f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            } else if (i2 == this.f7154OoooO0O) {
                f = 1.0f;
            }
            androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
            oooO00o.f7251OooO0OO = oooO0O0OooOOOo;
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0 = oooO0O0OooOOOo.f7279OooOO0o;
            if (oooO0O0 != null) {
                oooO0O0.OooO0OO(oooO00o.f7263OooOOOo);
            }
            this.f7183o0000O0.OooO0o0(this.f7148Oooo0o.OooO0O0(this.f7153OoooO00), this.f7148Oooo0o.OooO0O0(this.f7154OoooO0O));
            OooOo0();
            if (this.f7160OoooOoo != f) {
                if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    OooO0Oo(true);
                    this.f7148Oooo0o.OooO0O0(this.f7153OoooO00).OooO0O0(this);
                } else if (f == 1.0f) {
                    OooO0Oo(false);
                    this.f7148Oooo0o.OooO0O0(this.f7154OoooO0O).OooO0O0(this);
                }
            }
            this.f7160OoooOoo = Float.isNaN(f) ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
                return;
            }
            Log.v("MotionLayout", p060o0000o.OooO.OooO0O0() + " transitionToStart ");
            OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
    }

    public void setTransitionDuration(int i) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 = oooO00o.f7251OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.f7276OooO0oo = Math.max(i, 8);
        } else {
            oooO00o.f7257OooOO0 = i;
        }
    }

    public void setTransitionListener(OooOOOO oooOOOO) {
        this.f7165OooooOo = oooOOOO;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f7180o00000oO == null) {
            this.f7180o00000oO = new OooOOO();
        }
        OooOOO oooOOO = this.f7180o00000oO;
        Objects.requireNonNull(oooOOO);
        oooOOO.f7241OooO00o = bundle.getFloat("motion.progress");
        oooOOO.f7242OooO0O0 = bundle.getFloat("motion.velocity");
        oooOOO.f7243OooO0OO = bundle.getInt("motion.StartState");
        oooOOO.f7244OooO0Oo = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f7180o00000oO.OooO00o();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return p060o0000o.OooO.OooO0OO(context, this.f7153OoooO00) + "->" + p060o0000o.OooO.OooO0OO(context, this.f7154OoooO0O) + " (pos:" + this.f7160OoooOoo + " Dpos/Dt:" + this.f7147Oooo;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i, int i2, int i3) {
        setState(OooOo00.SETUP);
        this.f7152OoooO0 = i;
        this.f7153OoooO00 = -1;
        this.f7154OoooO0O = -1;
        o000O000 o000o001 = this.mConstraintLayoutSpec;
        if (o000o001 != null) {
            o000o001.OooO0O0(i, i2, i3);
            return;
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        if (oooO00o != null) {
            oooO00o.OooO0O0(i).OooO0O0(this);
        }
    }

    public void setTransition(androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f7148Oooo0o;
        oooO00o.f7251OooO0OO = oooO0O0;
        if (oooO0O0 != null && (oooO0O1 = oooO0O0.f7279OooOO0o) != null) {
            oooO0O1.OooO0OO(oooO00o.f7263OooOOOo);
        }
        setState(OooOo00.SETUP);
        if (this.f7152OoooO0 == this.f7148Oooo0o.OooO0Oo()) {
            this.f7160OoooOoo = 1.0f;
            this.f7159OoooOoO = 1.0f;
            this.f7162Ooooo0o = 1.0f;
        } else {
            this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7159OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f7162Ooooo0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        this.f7161Ooooo00 = oooO0O0.OooO00o(1) ? -1L : getNanoTime();
        int iOooO = this.f7148Oooo0o.OooO();
        int iOooO0Oo = this.f7148Oooo0o.OooO0Oo();
        if (iOooO == this.f7153OoooO00 && iOooO0Oo == this.f7154OoooO0O) {
            return;
        }
        this.f7153OoooO00 = iOooO;
        this.f7154OoooO0O = iOooO0Oo;
        this.f7148Oooo0o.OooOOOo(iOooO, iOooO0Oo);
        this.f7183o0000O0.OooO0o0(this.f7148Oooo0o.OooO0O0(this.f7153OoooO00), this.f7148Oooo0o.OooO0O0(this.f7154OoooO0O));
        OooOO0O oooOO0O = this.f7183o0000O0;
        int i = this.f7153OoooO00;
        int i2 = this.f7154OoooO0O;
        oooOO0O.f7239OooO0o0 = i;
        oooOO0O.f7238OooO0o = i2;
        oooOO0O.OooO0o();
        OooOo0();
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7150Oooo0oo = null;
        this.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7153OoooO00 = -1;
        this.f7152OoooO0 = -1;
        this.f7154OoooO0O = -1;
        this.f7151OoooO = 0;
        this.f7155OoooOO0 = 0;
        this.f7193o000oOoO = true;
        this.f7156OoooOOO = new HashMap<>();
        this.f7157OoooOOo = 0L;
        this.f7158OoooOo0 = 1.0f;
        this.f7159OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7162Ooooo0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7164OooooOO = false;
        this.f7167Oooooo0 = 0;
        this.f7168OoooooO = false;
        this.f7169Ooooooo = new o0Oo0oo();
        this.f7205o0OoOo0 = new OooO();
        this.f7196o00Ooo = false;
        this.f7198o00oO0O = false;
        this.f7206o0ooOO0 = null;
        this.f7207o0ooOOo = null;
        this.f7208o0ooOoO = null;
        this.f7203o0OOO0o = null;
        this.f7204o0Oo0oo = 0;
        this.f7202o0OO00O = -1L;
        this.f7210oo0o0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7201o0O0O00 = 0;
        this.f7192o000OOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7172o000000 = false;
        this.f7179o00000o0 = new o00000();
        this.f7188o0000Ooo = false;
        this.f7181o00000oo = null;
        this.f7170o0000 = new HashMap<>();
        this.f7184o0000O00 = new Rect();
        this.f7190o0000oo = false;
        this.f7189o0000oO = OooOo00.UNDEFINED;
        this.f7183o0000O0 = new OooOO0O();
        this.f7185o0000O0O = false;
        this.f7191o000OO = new RectF();
        this.f7182o0000O = null;
        this.f7187o0000OO0 = null;
        this.f7186o0000OO = new ArrayList<>();
        OooOOo(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7150Oooo0oo = null;
        this.f7147Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7153OoooO00 = -1;
        this.f7152OoooO0 = -1;
        this.f7154OoooO0O = -1;
        this.f7151OoooO = 0;
        this.f7155OoooOO0 = 0;
        this.f7193o000oOoO = true;
        this.f7156OoooOOO = new HashMap<>();
        this.f7157OoooOOo = 0L;
        this.f7158OoooOo0 = 1.0f;
        this.f7159OoooOoO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7160OoooOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7162Ooooo0o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7164OooooOO = false;
        this.f7167Oooooo0 = 0;
        this.f7168OoooooO = false;
        this.f7169Ooooooo = new o0Oo0oo();
        this.f7205o0OoOo0 = new OooO();
        this.f7196o00Ooo = false;
        this.f7198o00oO0O = false;
        this.f7206o0ooOO0 = null;
        this.f7207o0ooOOo = null;
        this.f7208o0ooOoO = null;
        this.f7203o0OOO0o = null;
        this.f7204o0Oo0oo = 0;
        this.f7202o0OO00O = -1L;
        this.f7210oo0o0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7201o0O0O00 = 0;
        this.f7192o000OOo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f7172o000000 = false;
        this.f7179o00000o0 = new o00000();
        this.f7188o0000Ooo = false;
        this.f7181o00000oo = null;
        this.f7170o0000 = new HashMap<>();
        this.f7184o0000O00 = new Rect();
        this.f7190o0000oo = false;
        this.f7189o0000oO = OooOo00.UNDEFINED;
        this.f7183o0000O0 = new OooOO0O();
        this.f7185o0000O0O = false;
        this.f7191o000OO = new RectF();
        this.f7182o0000O = null;
        this.f7187o0000OO0 = null;
        this.f7186o0000OO = new ArrayList<>();
        OooOOo(attributeSet);
    }
}
