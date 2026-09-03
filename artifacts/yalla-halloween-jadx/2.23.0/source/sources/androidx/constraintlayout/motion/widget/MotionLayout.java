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
import androidx.core.view.o0O0O00;
import androidx.core.widget.NestedScrollView;
import com.facebook.internal.security.CertificateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o000000O.OooOo;
import o000000O.Oooo0;
import o000000O.Oooo000;
import o000000O.o000oOoO;
import o000000O.o00O0O;
import o000000O.o00Oo0;
import o000000O.o0OoOo0;
import org.jctools.util.Pow2;
import p023Oooo00o.oO00Oo00;
import p039OoooOoo.o00OO;
import p413o0Oo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements o0O0O00 {

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public static boolean f4572o00o0O;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f4573OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public androidx.constraintlayout.motion.widget.OooO00o f4574OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Interpolator f4575OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000oOoO f4576OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f4577OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f4578OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f4579OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f4580OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f4581OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final HashMap<View, Oooo0> f4582OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f4583OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f4584OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f4585OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f4586OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f4587OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f4588OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f4589OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f4590OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f4591OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f4592OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOOOO f4593OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f4594OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooOO0 f4595OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final o000000.OooO0O0 f4596OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public o000000O.OooO0O0 f4597OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final OooO f4598OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f4599OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f4600OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f4601Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f4602Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f4603Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public float f4604Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public float f4605Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public float f4606Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f4607Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ArrayList<MotionHelper> f4608Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public ArrayList<MotionHelper> f4609Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public ArrayList<MotionHelper> f4610Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public CopyOnWriteArrayList<OooOOOO> f4611Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f4612OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f4613OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f4614OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f4615OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f4616OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f4617OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f4618OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f4619OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f4620OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f4621OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f4622Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final p413o0Oo0oo.o000oOoO f4623Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f4624OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public OooOOO f4625OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public Runnable f4626OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public boolean f4627Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final Rect f4628Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public OooOo00 f4629OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public final OooOO0O f4630Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f4631o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public View f4632o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public Matrix f4633o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final ArrayList<Integer> f4634o00Ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f4635o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final RectF f4636ooOO;

    public class OooO extends o000oOoO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f4637OooO00o = 0.0f;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f4638OooO0O0 = 0.0f;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f4639OooO0OO;

        public OooO() {
        }

        @Override // o000000O.o000oOoO
        public final float OooO00o() {
            return MotionLayout.this.f4577OooO0oO;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = this.f4637OooO00o;
            MotionLayout motionLayout = MotionLayout.this;
            if (f2 > 0.0f) {
                float f3 = this.f4639OooO0OO;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                motionLayout.f4577OooO0oO = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.f4638OooO0O0;
            }
            float f4 = this.f4639OooO0OO;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            motionLayout.f4577OooO0oO = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.f4638OooO0O0;
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f4625OooooOO.OooO00o();
        }
    }

    public class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f4642OooO0Oo;

        public OooO0O0(View view) {
            this.f4642OooO0Oo = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4642OooO0Oo.setNestedScrollingEnabled(true);
        }
    }

    public class OooO0OO implements Runnable {
        public OooO0OO() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.f4625OooooOO.OooO00o();
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f4644OooO00o;

        static {
            int[] iArr = new int[OooOo00.values().length];
            f4644OooO00o = iArr;
            try {
                iArr[OooOo00.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4644OooO00o[OooOo00.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4644OooO00o[OooOo00.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4644OooO00o[OooOo00.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class OooOO0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final Paint f4645OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float[] f4646OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f4647OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float[] f4648OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Path f4649OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Paint f4650OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Paint f4651OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Paint f4652OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final Paint f4653OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final float[] f4654OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public int f4655OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final Rect f4656OooOO0o = new Rect();

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final int f4658OooOOO0 = 1;

        public OooOO0() {
            Paint paint = new Paint();
            this.f4651OooO0o0 = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f4650OooO0o = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f4652OooO0oO = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f4653OooO0oo = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f4654OooOO0 = new float[8];
            Paint paint5 = new Paint();
            this.f4645OooO = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f4648OooO0OO = new float[100];
            this.f4647OooO0O0 = new int[50];
        }

        public final void OooO00o(Canvas canvas, int i, int i2, Oooo0 oooo0) {
            int width;
            int height;
            Paint paint = this.f4652OooO0oO;
            int[] iArr = this.f4647OooO0O0;
            int i3 = 4;
            if (i == 4) {
                boolean z = false;
                boolean z2 = false;
                for (int i4 = 0; i4 < this.f4655OooOO0O; i4++) {
                    int i5 = iArr[i4];
                    if (i5 == 1) {
                        z = true;
                    }
                    if (i5 == 0) {
                        z2 = true;
                    }
                }
                if (z) {
                    float[] fArr = this.f4646OooO00o;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
                }
                if (z2) {
                    OooO0O0(canvas);
                }
            }
            if (i == 2) {
                float[] fArr2 = this.f4646OooO00o;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], paint);
            }
            if (i == 3) {
                OooO0O0(canvas);
            }
            canvas.drawLines(this.f4646OooO00o, this.f4651OooO0o0);
            View view = oooo0.f33862OooO0O0;
            if (view != null) {
                width = view.getWidth();
                height = oooo0.f33862OooO0O0.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            int i6 = 1;
            while (i6 < i2 - 1) {
                if (i == i3 && iArr[i6 - 1] == 0) {
                    i6 = i6;
                } else {
                    int i7 = i6 * 2;
                    float[] fArr3 = this.f4648OooO0OO;
                    float f = fArr3[i7];
                    float f2 = fArr3[i7 + 1];
                    this.f4649OooO0Oo.reset();
                    this.f4649OooO0Oo.moveTo(f, f2 + 10.0f);
                    this.f4649OooO0Oo.lineTo(f + 10.0f, f2);
                    this.f4649OooO0Oo.lineTo(f, f2 - 10.0f);
                    this.f4649OooO0Oo.lineTo(f - 10.0f, f2);
                    this.f4649OooO0Oo.close();
                    int i8 = i6 - 1;
                    oooo0.f33880OooOo0.get(i8);
                    Paint paint2 = this.f4645OooO;
                    if (i == i3) {
                        int i9 = iArr[i8];
                        if (i9 == 1) {
                            OooO0Oo(canvas, f - 0.0f, f2 - 0.0f);
                        } else if (i9 == 0) {
                            OooO0OO(canvas, f - 0.0f, f2 - 0.0f);
                        } else {
                            if (i9 == 2) {
                                OooO0o0(canvas, f - 0.0f, f2 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f4649OooO0Oo, paint2);
                        }
                        canvas.drawPath(this.f4649OooO0Oo, paint2);
                    } else {
                        paint2 = paint2;
                        f2 = f2;
                        f = f;
                        i6 = i6;
                    }
                    if (i == 2) {
                        OooO0Oo(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (i == 3) {
                        OooO0OO(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (i == 6) {
                        OooO0o0(canvas, f - 0.0f, f2 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f4649OooO0Oo, paint2);
                }
                i6++;
                i3 = 4;
            }
            float[] fArr4 = this.f4646OooO00o;
            if (fArr4.length > 1) {
                float f3 = fArr4[0];
                float f4 = fArr4[1];
                Paint paint3 = this.f4650OooO0o;
                canvas.drawCircle(f3, f4, 8.0f, paint3);
                float[] fArr5 = this.f4646OooO00o;
                canvas.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint3);
            }
        }

        public final void OooO0O0(Canvas canvas) {
            float[] fArr = this.f4646OooO00o;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float fMin = Math.min(f, f3);
            float fMax = Math.max(f2, f4);
            float fMax2 = Math.max(f, f3);
            float fMax3 = Math.max(f2, f4);
            Paint paint = this.f4652OooO0oO;
            canvas.drawLine(fMin, fMax, fMax2, fMax3, paint);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
        }

        public final void OooO0OO(Canvas canvas, float f, float f2) {
            float[] fArr = this.f4646OooO00o;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float fMin = Math.min(f3, f5);
            float fMax = Math.max(f4, f6);
            float fMin2 = f - Math.min(f3, f5);
            float fMax2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            Paint paint = this.f4653OooO0oo;
            OooO0o(paint, str);
            Rect rect = this.f4656OooOO0o;
            canvas.drawText(str, ((fMin2 / 2.0f) - (rect.width() / 2)) + fMin, f2 - 20.0f, paint);
            float fMin3 = Math.min(f3, f5);
            Paint paint2 = this.f4652OooO0oO;
            canvas.drawLine(f, f2, fMin3, f2, paint2);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d)) / 100.0f);
            OooO0o(paint, str2);
            canvas.drawText(str2, f + 5.0f, fMax - ((fMax2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
        }

        public final void OooO0Oo(Canvas canvas, float f, float f2) {
            float[] fArr = this.f4646OooO00o;
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
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            Paint paint = this.f4653OooO0oo;
            OooO0o(paint, str);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f4656OooOO0o.width() / 2), -20.0f, paint);
            canvas.drawLine(f, f2, f10, f11, this.f4652OooO0oO);
        }

        public final void OooO0o(Paint paint, String str) {
            paint.getTextBounds(str, 0, str.length(), this.f4656OooOO0o);
        }

        public final void OooO0o0(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sb = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb.append(((int) (((double) (((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i))) + 0.5d)) / 100.0f);
            String string = sb.toString();
            Paint paint = this.f4653OooO0oo;
            OooO0o(paint, string);
            Rect rect = this.f4656OooOO0o;
            canvas.drawText(string, ((f / 2.0f) - (rect.width() / 2)) + 0.0f, f2 - 20.0f, paint);
            float fMin = Math.min(0.0f, 1.0f);
            Paint paint2 = this.f4652OooO0oO;
            canvas.drawLine(f, f2, fMin, f2, paint2);
            String str = "" + (((int) (((double) (((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2))) + 0.5d)) / 100.0f);
            OooO0o(paint, str);
            canvas.drawText(str, f + 5.0f, 0.0f - ((f2 / 2.0f) - (rect.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), paint2);
        }
    }

    public class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.OooO0o f4659OooO00o = new androidx.constraintlayout.core.widgets.OooO0o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public androidx.constraintlayout.core.widgets.OooO0o f4660OooO0O0 = new androidx.constraintlayout.core.widgets.OooO0o();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public androidx.constraintlayout.widget.OooO0O0 f4661OooO0OO = null;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public androidx.constraintlayout.widget.OooO0O0 f4662OooO0Oo = null;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f4663OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f4664OooO0o0;

        public OooOO0O() {
        }

        public static void OooO0OO(androidx.constraintlayout.core.widgets.OooO0o oooO0o, androidx.constraintlayout.core.widgets.OooO0o oooO0o2) {
            ConstraintWidget oooO0O0;
            ArrayList<ConstraintWidget> arrayList = oooO0o.f60905o0OOO0o;
            HashMap<ConstraintWidget, ConstraintWidget> map = new HashMap<>();
            map.put(oooO0o, oooO0o2);
            oooO0o2.f60905o0OOO0o.clear();
            oooO0o2.OooOO0O(oooO0o, map);
            for (ConstraintWidget constraintWidget : arrayList) {
                if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO00o) {
                    oooO0O0 = new androidx.constraintlayout.core.widgets.OooO00o();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooOO0) {
                    oooO0O0 = new androidx.constraintlayout.core.widgets.OooOO0();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooO) {
                    oooO0O0 = new androidx.constraintlayout.core.widgets.OooO();
                } else if (constraintWidget instanceof androidx.constraintlayout.core.widgets.OooOOO0) {
                    oooO0O0 = new androidx.constraintlayout.core.widgets.OooOOO0();
                } else {
                    oooO0O0 = constraintWidget instanceof oo0o0Oo.OooO00o ? new oo0o0Oo.OooO0O0() : new ConstraintWidget();
                }
                oooO0o2.OooO00o(oooO0O0);
                map.put(constraintWidget, oooO0O0);
            }
            for (ConstraintWidget constraintWidget2 : arrayList) {
                map.get(constraintWidget2).OooOO0O(constraintWidget2, map);
            }
        }

        public static ConstraintWidget OooO0Oo(androidx.constraintlayout.core.widgets.OooO0o oooO0o, View view) {
            if (oooO0o.f4394Ooooooo == view) {
                return oooO0o;
            }
            ArrayList<ConstraintWidget> arrayList = oooO0o.f60905o0OOO0o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                if (constraintWidget.f4394Ooooooo == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void OooO00o() {
            int i;
            HashMap<View, Oooo0> map;
            SparseArray sparseArray;
            int[] iArr;
            int i2;
            Rect rect;
            Rect rect2;
            Interpolator interpolatorLoadInterpolator;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            HashMap<View, Oooo0> map2 = motionLayout.f4582OooOOO;
            map2.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                Oooo0 oooo0 = new Oooo0(childAt);
                int id = childAt.getId();
                iArr2[i3] = id;
                sparseArray2.put(id, oooo0);
                map2.put(childAt, oooo0);
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt2 = motionLayout.getChildAt(i4);
                Oooo0 oooo1 = map2.get(childAt2);
                if (oooo1 == null) {
                    i = childCount;
                    map = map2;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                } else {
                    androidx.constraintlayout.widget.OooO0O0 oooO0O0 = this.f4661OooO0OO;
                    Rect rect3 = oooo1.f33861OooO00o;
                    if (oooO0O0 != null) {
                        ConstraintWidget constraintWidgetOooO0Oo = OooO0Oo(this.f4659OooO00o, childAt2);
                        if (constraintWidgetOooO0Oo != null) {
                            Rect rectOooO0O0 = MotionLayout.OooO0O0(motionLayout, constraintWidgetOooO0Oo);
                            androidx.constraintlayout.widget.OooO0O0 oooO0O1 = this.f4661OooO0OO;
                            map = map2;
                            int width = motionLayout.getWidth();
                            sparseArray = sparseArray2;
                            int height = motionLayout.getHeight();
                            iArr = iArr2;
                            int i5 = oooO0O1.f5036OooO0OO;
                            if (i5 != 0) {
                                Oooo0.OooO0oO(rectOooO0O0, rect3, i5, width, height);
                            }
                            o0OoOo0 o0oooo0 = oooo1.f33865OooO0o;
                            o0oooo0.f33899OooO0o = 0.0f;
                            o0oooo0.f33901OooO0oO = 0.0f;
                            oooo1.OooO0o(o0oooo0);
                            i = childCount;
                            i2 = i4;
                            rect = rect3;
                            o0oooo0.OooO0Oo(rectOooO0O0.left, rectOooO0O0.top, rectOooO0O0.width(), rectOooO0O0.height());
                            androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00oOooO0oo = oooO0O1.OooO0oo(oooo1.f33863OooO0OO);
                            o0oooo0.OooO00o(oooO00oOooO0oo);
                            androidx.constraintlayout.widget.OooO0O0.OooO0OO oooO0OO = oooO00oOooO0oo.f5058OooO0Oo;
                            oooo1.f33871OooOO0o = oooO0OO.f5152OooO0oO;
                            oooo1.f33868OooO0oo.OooO0Oo(rectOooO0O0, oooO0O1, i5, oooo1.f33863OooO0OO);
                            oooo1.f33887OooOoo = oooO00oOooO0oo.f5059OooO0o.f5041OooO;
                            oooo1.f33890OooOooo = oooO0OO.f5154OooOO0;
                            oooo1.f33891Oooo000 = oooO0OO.f5145OooO;
                            Context context = oooo1.f33862OooO0O0.getContext();
                            int i6 = oooO0OO.f5156OooOO0o;
                            String str = oooO0OO.f5155OooOO0O;
                            int i7 = oooO0OO.f5157OooOOO0;
                            if (i6 == -2) {
                                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i7);
                            } else if (i6 == -1) {
                                interpolatorLoadInterpolator = new Oooo000(p413o0Oo0oo.Oooo0.OooO0OO(str));
                            } else if (i6 == 0) {
                                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                            } else if (i6 == 1) {
                                interpolatorLoadInterpolator = new AccelerateInterpolator();
                            } else if (i6 == 2) {
                                interpolatorLoadInterpolator = new DecelerateInterpolator();
                            } else if (i6 != 4) {
                                interpolatorLoadInterpolator = i6 != 5 ? null : new OvershootInterpolator();
                            } else {
                                interpolatorLoadInterpolator = new BounceInterpolator();
                            }
                            oooo1.f33892Oooo00O = interpolatorLoadInterpolator;
                        } else {
                            i = childCount;
                            map = map2;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i2 = i4;
                            rect = rect3;
                            if (motionLayout.f4589OooOo != 0) {
                                Log.e("MotionLayout", o000000O.OooO00o.OooO0O0() + "no widget for  " + o000000O.OooO00o.OooO0Oo(childAt2) + " (" + childAt2.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i = childCount;
                        map = map2;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        rect = rect3;
                    }
                    if (this.f4662OooO0Oo != null) {
                        ConstraintWidget constraintWidgetOooO0Oo2 = OooO0Oo(this.f4660OooO0O0, childAt2);
                        if (constraintWidgetOooO0Oo2 != null) {
                            Rect rectOooO0O1 = MotionLayout.OooO0O0(motionLayout, constraintWidgetOooO0Oo2);
                            androidx.constraintlayout.widget.OooO0O0 oooO0O2 = this.f4662OooO0Oo;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            int i8 = oooO0O2.f5036OooO0OO;
                            if (i8 != 0) {
                                Rect rect4 = rect;
                                Oooo0.OooO0oO(rectOooO0O1, rect4, i8, width2, height2);
                                rect2 = rect4;
                            } else {
                                rect2 = rectOooO0O1;
                            }
                            o0OoOo0 o0oooo1 = oooo1.f33867OooO0oO;
                            o0oooo1.f33899OooO0o = 1.0f;
                            o0oooo1.f33901OooO0oO = 1.0f;
                            oooo1.OooO0o(o0oooo1);
                            o0oooo1.OooO0Oo(rect2.left, rect2.top, rect2.width(), rect2.height());
                            o0oooo1.OooO00o(oooO0O2.OooO0oo(oooo1.f33863OooO0OO));
                            oooo1.f33860OooO.OooO0Oo(rect2, oooO0O2, i8, oooo1.f33863OooO0OO);
                        } else if (motionLayout.f4589OooOo != 0) {
                            Log.e("MotionLayout", o000000O.OooO00o.OooO0O0() + "no widget for  " + o000000O.OooO00o.OooO0Oo(childAt2) + " (" + childAt2.getClass().getName() + ")");
                        }
                    }
                }
                i4 = i2 + 1;
                map2 = map;
                sparseArray2 = sparseArray;
                iArr2 = iArr;
                childCount = i;
            }
            SparseArray sparseArray3 = sparseArray2;
            int[] iArr3 = iArr2;
            int i9 = childCount;
            int i10 = 0;
            while (i10 < i9) {
                SparseArray sparseArray4 = sparseArray3;
                Oooo0 oooo2 = (Oooo0) sparseArray4.get(iArr3[i10]);
                int i11 = oooo2.f33865OooO0o.f33906OooOOO;
                if (i11 != -1) {
                    Oooo0 oooo3 = (Oooo0) sparseArray4.get(i11);
                    oooo2.f33865OooO0o.OooO0o(oooo3, oooo3.f33865OooO0o);
                    oooo2.f33867OooO0oO.OooO0o(oooo3, oooo3.f33867OooO0oO);
                }
                i10++;
                sparseArray3 = sparseArray4;
            }
        }

        public final void OooO0O0(int i, int i2) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.f4573OooO == motionLayout.getStartState()) {
                androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.f4660OooO0O0;
                androidx.constraintlayout.widget.OooO0O0 oooO0O0 = this.f4662OooO0Oo;
                motionLayout.resolveSystem(oooO0o, optimizationLevel, (oooO0O0 == null || oooO0O0.f5036OooO0OO == 0) ? i : i2, (oooO0O0 == null || oooO0O0.f5036OooO0OO == 0) ? i2 : i);
                androidx.constraintlayout.widget.OooO0O0 oooO0O1 = this.f4661OooO0OO;
                if (oooO0O1 != null) {
                    androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.f4659OooO00o;
                    int i3 = oooO0O1.f5036OooO0OO;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout.resolveSystem(oooO0o2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.OooO0O0 oooO0O2 = this.f4661OooO0OO;
            if (oooO0O2 != null) {
                androidx.constraintlayout.core.widgets.OooO0o oooO0o3 = this.f4659OooO00o;
                int i5 = oooO0O2.f5036OooO0OO;
                motionLayout.resolveSystem(oooO0o3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            androidx.constraintlayout.core.widgets.OooO0o oooO0o4 = this.f4660OooO0O0;
            androidx.constraintlayout.widget.OooO0O0 oooO0O3 = this.f4662OooO0Oo;
            int i6 = (oooO0O3 == null || oooO0O3.f5036OooO0OO == 0) ? i : i2;
            if (oooO0O3 == null || oooO0O3.f5036OooO0OO == 0) {
                i = i2;
            }
            motionLayout.resolveSystem(oooO0o4, optimizationLevel, i6, i);
        }

        public final void OooO0o() {
            HashMap<View, Oooo0> map;
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.f4580OooOO0O;
            int i2 = motionLayout.f4581OooOO0o;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            motionLayout.f4620OoooOoO = mode;
            motionLayout.f4621OoooOoo = mode2;
            motionLayout.getOptimizationLevel();
            OooO0O0(i, i2);
            int i3 = 0;
            boolean z = true;
            if (((motionLayout.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                OooO0O0(i, i2);
                motionLayout.f4631o000oOoO = this.f4659OooO00o.OooOo0O();
                motionLayout.f4617OoooOOO = this.f4659OooO00o.OooOOOo();
                motionLayout.f4618OoooOOo = this.f4660OooO0O0.OooOo0O();
                int iOooOOOo = this.f4660OooO0O0.OooOOOo();
                motionLayout.f4619OoooOo0 = iOooOOOo;
                motionLayout.f4616OoooOO0 = (motionLayout.f4631o000oOoO == motionLayout.f4618OoooOOo && motionLayout.f4617OoooOOO == iOooOOOo) ? false : true;
            }
            int i4 = motionLayout.f4631o000oOoO;
            int i5 = motionLayout.f4617OoooOOO;
            int i6 = motionLayout.f4620OoooOoO;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout.f4622Ooooo00 * (motionLayout.f4618OoooOOo - i4)) + i4);
            }
            int i7 = i4;
            int i8 = motionLayout.f4621OoooOoo;
            int i9 = (i8 == Integer.MIN_VALUE || i8 == 0) ? (int) ((motionLayout.f4622Ooooo00 * (motionLayout.f4619OoooOo0 - i5)) + i5) : i5;
            androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.f4659OooO00o;
            motionLayout.resolveMeasuredDimension(i, i2, i7, i9, oooO0o.f4484o00000o0 || this.f4660OooO0O0.f4484o00000o0, oooO0o.f4488o0000Ooo || this.f4660OooO0O0.f4488o0000Ooo);
            int childCount = motionLayout.getChildCount();
            motionLayout.f4630Ooooooo.OooO00o();
            motionLayout.f4592OooOo0O = true;
            SparseArray sparseArray = new SparseArray();
            int i10 = 0;
            while (true) {
                map = motionLayout.f4582OooOOO;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = motionLayout.getChildAt(i10);
                sparseArray.put(childAt.getId(), map.get(childAt));
                i10++;
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 = motionLayout.f4574OooO0Oo.f4676OooO0OO;
            int i11 = oooO0O0 != null ? oooO0O0.f4708OooOOOo : -1;
            if (i11 != -1) {
                for (int i12 = 0; i12 < childCount; i12++) {
                    Oooo0 oooo0 = map.get(motionLayout.getChildAt(i12));
                    if (oooo0 != null) {
                        oooo0.f33888OooOoo0 = i11;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[map.size()];
            int i13 = 0;
            for (int i14 = 0; i14 < childCount; i14++) {
                Oooo0 oooo1 = map.get(motionLayout.getChildAt(i14));
                int i15 = oooo1.f33865OooO0o.f33906OooOOO;
                if (i15 != -1) {
                    sparseBooleanArray.put(i15, true);
                    iArr[i13] = oooo1.f33865OooO0o.f33906OooOOO;
                    i13++;
                }
            }
            if (motionLayout.f4610Oooo0oO != null) {
                for (int i16 = 0; i16 < i13; i16++) {
                    Oooo0 oooo2 = map.get(motionLayout.findViewById(iArr[i16]));
                    if (oooo2 != null) {
                        motionLayout.f4574OooO0Oo.OooO0o(oooo2);
                    }
                }
                Iterator<MotionHelper> it = motionLayout.f4610Oooo0oO.iterator();
                while (it.hasNext()) {
                    it.next().OooOo0(motionLayout, map);
                }
                for (int i17 = 0; i17 < i13; i17++) {
                    Oooo0 oooo3 = map.get(motionLayout.findViewById(iArr[i17]));
                    if (oooo3 != null) {
                        oooo3.OooO0oo(width, height, motionLayout.getNanoTime());
                    }
                }
            } else {
                for (int i18 = 0; i18 < i13; i18++) {
                    Oooo0 oooo4 = map.get(motionLayout.findViewById(iArr[i18]));
                    if (oooo4 != null) {
                        motionLayout.f4574OooO0Oo.OooO0o(oooo4);
                        oooo4.OooO0oo(width, height, motionLayout.getNanoTime());
                    }
                }
            }
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt2 = motionLayout.getChildAt(i19);
                Oooo0 oooo5 = map.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && oooo5 != null) {
                    motionLayout.f4574OooO0Oo.OooO0o(oooo5);
                    oooo5.OooO0oo(width, height, motionLayout.getNanoTime());
                }
            }
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = motionLayout.f4574OooO0Oo.f4676OooO0OO;
            float f = oooO0O1 != null ? oooO0O1.f4693OooO : 0.0f;
            if (f != 0.0f) {
                boolean z2 = ((double) f) < 0.0d;
                float fAbs = Math.abs(f);
                float fMax = -3.4028235E38f;
                float fMin = Float.MAX_VALUE;
                float fMax2 = -3.4028235E38f;
                float fMin2 = Float.MAX_VALUE;
                int i20 = 0;
                while (true) {
                    if (i20 >= childCount) {
                        z = false;
                        break;
                    }
                    Oooo0 oooo6 = map.get(motionLayout.getChildAt(i20));
                    if (!Float.isNaN(oooo6.f33871OooOO0o)) {
                        break;
                    }
                    o0OoOo0 o0oooo0 = oooo6.f33867OooO0oO;
                    float f2 = o0oooo0.f33902OooO0oo;
                    float f3 = o0oooo0.f33897OooO;
                    float f4 = z2 ? f3 - f2 : f3 + f2;
                    fMin2 = Math.min(fMin2, f4);
                    fMax2 = Math.max(fMax2, f4);
                    i20++;
                }
                if (!z) {
                    while (i3 < childCount) {
                        Oooo0 oooo7 = map.get(motionLayout.getChildAt(i3));
                        o0OoOo0 o0oooo1 = oooo7.f33867OooO0oO;
                        float f5 = o0oooo1.f33902OooO0oo;
                        float f6 = o0oooo1.f33897OooO;
                        float f7 = z2 ? f6 - f5 : f6 + f5;
                        oooo7.f33872OooOOO = 1.0f / (1.0f - fAbs);
                        oooo7.f33873OooOOO0 = fAbs - (((f7 - fMin2) * fAbs) / (fMax2 - fMin2));
                        i3++;
                    }
                    return;
                }
                for (int i21 = 0; i21 < childCount; i21++) {
                    Oooo0 oooo8 = map.get(motionLayout.getChildAt(i21));
                    if (!Float.isNaN(oooo8.f33871OooOO0o)) {
                        fMin = Math.min(fMin, oooo8.f33871OooOO0o);
                        fMax = Math.max(fMax, oooo8.f33871OooOO0o);
                    }
                }
                while (i3 < childCount) {
                    Oooo0 oooo9 = map.get(motionLayout.getChildAt(i3));
                    if (!Float.isNaN(oooo9.f33871OooOO0o)) {
                        oooo9.f33872OooOOO = 1.0f / (1.0f - fAbs);
                        if (z2) {
                            oooo9.f33873OooOOO0 = fAbs - (((fMax - oooo9.f33871OooOO0o) / (fMax - fMin)) * fAbs);
                        } else {
                            oooo9.f33873OooOOO0 = fAbs - (((oooo9.f33871OooOO0o - fMin) * fAbs) / (fMax - fMin));
                        }
                    }
                    i3++;
                }
            }
        }

        public final void OooO0o0(androidx.constraintlayout.widget.OooO0O0 oooO0O0, androidx.constraintlayout.widget.OooO0O0 oooO0O1) {
            this.f4661OooO0OO = oooO0O0;
            this.f4662OooO0Oo = oooO0O1;
            this.f4659OooO00o = new androidx.constraintlayout.core.widgets.OooO0o();
            this.f4660OooO0O0 = new androidx.constraintlayout.core.widgets.OooO0o();
            androidx.constraintlayout.core.widgets.OooO0o oooO0o = this.f4659OooO00o;
            MotionLayout motionLayout = MotionLayout.this;
            o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O0 = ((ConstraintLayout) motionLayout).mLayoutWidget.f4492o0O0O00;
            oooO0o.f4492o0O0O00 = interfaceC0449OooO0O0;
            oooO0o.f4493o0OO00O.f41840OooO0o = interfaceC0449OooO0O0;
            androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.f4660OooO0O0;
            o0O0O00.OooO0O0.InterfaceC0449OooO0O0 interfaceC0449OooO0O1 = ((ConstraintLayout) motionLayout).mLayoutWidget.f4492o0O0O00;
            oooO0o2.f4492o0O0O00 = interfaceC0449OooO0O1;
            oooO0o2.f4493o0OO00O.f41840OooO0o = interfaceC0449OooO0O1;
            this.f4659OooO00o.f60905o0OOO0o.clear();
            this.f4660OooO0O0.f60905o0OOO0o.clear();
            OooO0OO(((ConstraintLayout) motionLayout).mLayoutWidget, this.f4659OooO00o);
            OooO0OO(((ConstraintLayout) motionLayout).mLayoutWidget, this.f4660OooO0O0);
            if (motionLayout.f4586OooOOo > 0.5d) {
                if (oooO0O0 != null) {
                    OooO0oO(this.f4659OooO00o, oooO0O0);
                }
                OooO0oO(this.f4660OooO0O0, oooO0O1);
            } else {
                OooO0oO(this.f4660OooO0O0, oooO0O1);
                if (oooO0O0 != null) {
                    OooO0oO(this.f4659OooO00o, oooO0O0);
                }
            }
            this.f4659OooO00o.f4491o000OOo = motionLayout.isRtl();
            androidx.constraintlayout.core.widgets.OooO0o oooO0o3 = this.f4659OooO00o;
            oooO0o3.f4494o0Oo0oo.OooO0OO(oooO0o3);
            this.f4660OooO0O0.f4491o000OOo = motionLayout.isRtl();
            androidx.constraintlayout.core.widgets.OooO0o oooO0o4 = this.f4660OooO0O0;
            oooO0o4.f4494o0Oo0oo.OooO0OO(oooO0o4);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.OooO0o oooO0o5 = this.f4659OooO00o;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    oooO0o5.OoooO0(dimensionBehaviour);
                    this.f4660OooO0O0.OoooO0(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.OooO0o oooO0o6 = this.f4659OooO00o;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    oooO0o6.OoooO(dimensionBehaviour2);
                    this.f4660OooO0O0.OoooO(dimensionBehaviour2);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO0oO(androidx.constraintlayout.core.widgets.OooO0o oooO0o, androidx.constraintlayout.widget.OooO0O0 oooO0O0) {
            androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o;
            androidx.constraintlayout.widget.OooO0O0.OooO00o oooO00o2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, oooO0o);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), oooO0o);
            if (oooO0O0 != null && oooO0O0.f5036OooO0OO != 0) {
                androidx.constraintlayout.core.widgets.OooO0o oooO0o2 = this.f4660OooO0O0;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), Pow2.MAX_POW2);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), Pow2.MAX_POW2);
                boolean z = MotionLayout.f4572o00o0O;
                motionLayout.resolveSystem(oooO0o2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            for (ConstraintWidget constraintWidget : oooO0o.f60905o0OOO0o) {
                constraintWidget.f4408ooOO = true;
                sparseArray.put(((View) constraintWidget.f4394Ooooooo).getId(), constraintWidget);
            }
            for (ConstraintWidget constraintWidget2 : oooO0o.f60905o0OOO0o) {
                View view = (View) constraintWidget2.f4394Ooooooo;
                int id = view.getId();
                HashMap<Integer, androidx.constraintlayout.widget.OooO0O0.OooO00o> map = oooO0O0.f5038OooO0o;
                if (map.containsKey(Integer.valueOf(id)) && (oooO00o2 = map.get(Integer.valueOf(id))) != null) {
                    oooO00o2.OooO00o(layoutParams);
                }
                constraintWidget2.o000oOoO(oooO0O0.OooO0oo(view.getId()).f5060OooO0o0.f5079OooO0OO);
                constraintWidget2.OoooO00(oooO0O0.OooO0oo(view.getId()).f5060OooO0o0.f5080OooO0Oo);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id2 = constraintHelper.getId();
                    HashMap<Integer, androidx.constraintlayout.widget.OooO0O0.OooO00o> map2 = oooO0O0.f5038OooO0o;
                    if (map2.containsKey(Integer.valueOf(id2)) && (oooO00o = map2.get(Integer.valueOf(id2))) != null && (constraintWidget2 instanceof oo0o0Oo.OooO0O0)) {
                        constraintHelper.OooOOOO(oooO00o, (oo0o0Oo.OooO0O0) constraintWidget2, layoutParams, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).OooOo00();
                    }
                }
                layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
                MotionLayout motionLayout2 = MotionLayout.this;
                boolean z2 = MotionLayout.f4572o00o0O;
                motionLayout2.applyConstraintsFromLayoutParams(false, view, constraintWidget2, layoutParams, sparseArray);
                if (oooO0O0.OooO0oo(view.getId()).f5057OooO0OO.f5160OooO0OO == 1) {
                    constraintWidget2.f4403o0OoOo0 = view.getVisibility();
                } else {
                    constraintWidget2.f4403o0OoOo0 = oooO0O0.OooO0oo(view.getId()).f5057OooO0OO.f5159OooO0O0;
                }
            }
            for (ConstraintWidget constraintWidget3 : oooO0o.f60905o0OOO0o) {
                if (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.OooOOO) {
                    ConstraintHelper constraintHelper2 = (ConstraintHelper) constraintWidget3.f4394Ooooooo;
                    oo0o0Oo.OooO00o oooO00o3 = (oo0o0Oo.OooO00o) constraintWidget3;
                    constraintHelper2.OooOOoo(oooO00o3, sparseArray);
                    androidx.constraintlayout.core.widgets.OooOOO oooOOO = (androidx.constraintlayout.core.widgets.OooOOO) oooO00o3;
                    for (int i = 0; i < oooOOO.f60904o0Oo0oo; i++) {
                        ConstraintWidget constraintWidget4 = oooOOO.f60903o0OOO0o[i];
                        if (constraintWidget4 != null) {
                            constraintWidget4.f4366Oooo0 = true;
                        }
                    }
                }
            }
        }
    }

    public class OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f4666OooO00o = Float.NaN;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f4667OooO0O0 = Float.NaN;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f4668OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f4669OooO0Oo = -1;

        public OooOOO() {
        }

        public final void OooO00o() {
            int i = this.f4668OooO0OO;
            MotionLayout motionLayout = MotionLayout.this;
            if (i != -1 || this.f4669OooO0Oo != -1) {
                if (i == -1) {
                    int i2 = this.f4669OooO0Oo;
                    if (motionLayout.isAttachedToWindow()) {
                        motionLayout.OooOo0O(i2, -1);
                    } else {
                        if (motionLayout.f4625OooooOO == null) {
                            motionLayout.f4625OooooOO = motionLayout.new OooOOO();
                        }
                        motionLayout.f4625OooooOO.f4669OooO0Oo = i2;
                    }
                } else {
                    int i3 = this.f4669OooO0Oo;
                    if (i3 == -1) {
                        motionLayout.setState(i, -1, -1);
                    } else {
                        motionLayout.OooOOoo(i, i3);
                    }
                }
                motionLayout.setState(OooOo00.SETUP);
            }
            if (Float.isNaN(this.f4667OooO0O0)) {
                if (Float.isNaN(this.f4666OooO00o)) {
                    return;
                }
                motionLayout.setProgress(this.f4666OooO00o);
                return;
            }
            float f = this.f4666OooO00o;
            float f2 = this.f4667OooO0O0;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f);
                motionLayout.setState(OooOo00.MOVING);
                motionLayout.f4577OooO0oO = f2;
                if (f2 != 0.0f) {
                    motionLayout.OooO0oO(f2 > 0.0f ? 1.0f : 0.0f);
                } else if (f != 0.0f && f != 1.0f) {
                    motionLayout.OooO0oO(f > 0.5f ? 1.0f : 0.0f);
                }
            } else {
                if (motionLayout.f4625OooooOO == null) {
                    motionLayout.f4625OooooOO = motionLayout.new OooOOO();
                }
                OooOOO oooOOO = motionLayout.f4625OooooOO;
                oooOOO.f4666OooO00o = f;
                oooOOO.f4667OooO0O0 = f2;
            }
            this.f4666OooO00o = Float.NaN;
            this.f4667OooO0O0 = Float.NaN;
            this.f4668OooO0OO = -1;
            this.f4669OooO0Oo = -1;
        }
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooOOO0 f4671OooO0O0 = new OooOOO0();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public VelocityTracker f4672OooO00o;
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
        this.f4575OooO0o = null;
        this.f4577OooO0oO = 0.0f;
        this.f4578OooO0oo = -1;
        this.f4573OooO = -1;
        this.f4579OooOO0 = -1;
        this.f4580OooOO0O = 0;
        this.f4581OooOO0o = 0;
        this.f4583OooOOO0 = true;
        this.f4582OooOOO = new HashMap<>();
        this.f4584OooOOOO = 0L;
        this.f4585OooOOOo = 1.0f;
        this.f4587OooOOo0 = 0.0f;
        this.f4586OooOOo = 0.0f;
        this.f4591OooOo00 = 0.0f;
        this.f4592OooOo0O = false;
        this.f4589OooOo = 0;
        this.f4594OooOoO = false;
        this.f4596OooOoOO = new o000000.OooO0O0();
        this.f4598OooOoo0 = new OooO();
        this.f4603Oooo000 = false;
        this.f4607Oooo0OO = false;
        this.f4609Oooo0o0 = null;
        this.f4608Oooo0o = null;
        this.f4610Oooo0oO = null;
        this.f4611Oooo0oo = null;
        this.f4601Oooo = 0;
        this.f4614OoooO00 = -1L;
        this.f4613OoooO0 = 0.0f;
        this.f4615OoooO0O = 0;
        this.f4612OoooO = 0.0f;
        this.f4616OoooOO0 = false;
        this.f4623Ooooo0o = new p413o0Oo0oo.o000oOoO();
        this.f4624OooooO0 = false;
        this.f4626OooooOo = null;
        new HashMap();
        this.f4628Oooooo0 = new Rect();
        this.f4627Oooooo = false;
        this.f4629OoooooO = OooOo00.UNDEFINED;
        this.f4630Ooooooo = new OooOO0O();
        this.f4635o0OoOo0 = false;
        this.f4636ooOO = new RectF();
        this.f4632o00O0O = null;
        this.f4633o00Oo0 = null;
        this.f4634o00Ooo = new ArrayList<>();
        OooOOOO(null);
    }

    public static Rect OooO0O0(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        motionLayout.getClass();
        int iOooOo = constraintWidget.OooOo();
        Rect rect = motionLayout.f4628Oooooo0;
        rect.top = iOooOo;
        rect.left = constraintWidget.OooOo0o();
        rect.right = constraintWidget.OooOo0O() + rect.left;
        rect.bottom = constraintWidget.OooOOOo() + rect.top;
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:126:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:142:0x021e  */
    /* JADX WARN: Code duplicated, block: B:179:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0114  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x014d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0155  */
    /* JADX WARN: Code duplicated, block: B:95:0x016c  */
    /* JADX WARN: Code duplicated, block: B:97:0x017c  */
    public final void OooO(boolean z) {
        boolean z2;
        char c;
        float interpolation;
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
        Oooo0 oooo0;
        boolean z3;
        if (this.f4588OooOOoo == -1) {
            this.f4588OooOOoo = getNanoTime();
        }
        float f = this.f4586OooOOo;
        if (f > 0.0f && f < 1.0f) {
            this.f4573OooO = -1;
        }
        boolean z4 = false;
        if (this.f4607Oooo0OO || (this.f4592OooOo0O && (z || this.f4591OooOo00 != f))) {
            float fSignum = Math.signum(this.f4591OooOo00 - f);
            long nanoTime2 = getNanoTime();
            o000oOoO o000oooo2 = this.f4576OooO0o0;
            float f2 = !(o000oooo2 instanceof o000oOoO) ? (((nanoTime2 - this.f4588OooOOoo) * fSignum) * 1.0E-9f) / this.f4585OooOOOo : 0.0f;
            float f3 = this.f4586OooOOo + f2;
            if (this.f4590OooOo0) {
                f3 = this.f4591OooOo00;
            }
            if ((fSignum <= 0.0f || f3 < this.f4591OooOo00) && (fSignum > 0.0f || f3 > this.f4591OooOo00)) {
                z2 = false;
            } else {
                f3 = this.f4591OooOo00;
                this.f4592OooOo0O = false;
                z2 = true;
            }
            this.f4586OooOOo = f3;
            this.f4587OooOOo0 = f3;
            this.f4588OooOOoo = nanoTime2;
            if (o000oooo2 == null || z2) {
                this.f4577OooO0oO = f2;
            } else {
                if (this.f4594OooOoO) {
                    interpolation = o000oooo2.getInterpolation((nanoTime2 - this.f4584OooOOOO) * 1.0E-9f);
                    o000oOoO o000oooo3 = this.f4576OooO0o0;
                    o000000.OooO0O0 oooO0O0 = this.f4596OooOoOO;
                    c = o000oooo3 == oooO0O0 ? oooO0O0.f33744OooO0OO.OooO0O0() ? (char) 2 : (char) 1 : (char) 0;
                    this.f4586OooOOo = interpolation;
                    this.f4588OooOOoo = nanoTime2;
                    o000oOoO o000oooo4 = this.f4576OooO0o0;
                    if (o000oooo4 instanceof o000oOoO) {
                        float fOooO00o = o000oooo4.OooO00o();
                        this.f4577OooO0oO = fOooO00o;
                        if (Math.abs(fOooO00o) * this.f4585OooOOOo <= 1.0E-5f && c == 2) {
                            this.f4592OooOo0O = false;
                        }
                        if (fOooO00o > 0.0f && interpolation >= 1.0f) {
                            this.f4586OooOOo = 1.0f;
                            this.f4592OooOo0O = false;
                            interpolation = 1.0f;
                        }
                        if (fOooO00o < 0.0f && interpolation <= 0.0f) {
                            this.f4586OooOOo = 0.0f;
                            this.f4592OooOo0O = false;
                            interpolation = 0.0f;
                        }
                    }
                } else {
                    float interpolation3 = o000oooo2.getInterpolation(f3);
                    o000oOoO o000oooo5 = this.f4576OooO0o0;
                    if (o000oooo5 instanceof o000oOoO) {
                        this.f4577OooO0oO = o000oooo5.OooO00o();
                    } else {
                        this.f4577OooO0oO = ((o000oooo5.getInterpolation(f3 + f2) - interpolation3) * fSignum) / f2;
                    }
                    f3 = interpolation3;
                }
                if (Math.abs(this.f4577OooO0oO) > 1.0E-5f) {
                    setState(OooOo00.MOVING);
                }
                if (c != 1) {
                    if ((fSignum <= 0.0f && interpolation >= this.f4591OooOo00) || (fSignum <= 0.0f && interpolation <= this.f4591OooOo00)) {
                        interpolation = this.f4591OooOo00;
                        this.f4592OooOo0O = false;
                    }
                    if (interpolation < 1.0f || interpolation <= 0.0f) {
                        this.f4592OooOo0O = false;
                        setState(OooOo00.FINISHED);
                    }
                }
                childCount = getChildCount();
                this.f4607Oooo0OO = false;
                nanoTime = getNanoTime();
                this.f4622Ooooo00 = interpolation;
                interpolator = this.f4575OooO0o;
                if (interpolator == null) {
                    interpolation2 = interpolation;
                } else {
                    interpolation2 = interpolator.getInterpolation(interpolation);
                }
                interpolator2 = this.f4575OooO0o;
                if (interpolator2 != null) {
                    float interpolation4 = interpolator2.getInterpolation((fSignum / this.f4585OooOOOo) + interpolation);
                    this.f4577OooO0oO = interpolation4;
                    this.f4577OooO0oO = interpolation4 - this.f4575OooO0o.getInterpolation(interpolation);
                }
                for (i = 0; i < childCount; i++) {
                    childAt = getChildAt(i);
                    oooo0 = this.f4582OooOOO.get(childAt);
                    if (oooo0 != null) {
                        this.f4607Oooo0OO = oooo0.OooO0o0(interpolation2, nanoTime, childAt, this.f4623Ooooo0o) | this.f4607Oooo0OO;
                    }
                }
                boolean z5 = (fSignum <= 0.0f && interpolation >= this.f4591OooOo00) || (fSignum <= 0.0f && interpolation <= this.f4591OooOo00);
                if (!this.f4607Oooo0OO && !this.f4592OooOo0O && z5) {
                    setState(OooOo00.FINISHED);
                }
                if (this.f4616OoooOO0) {
                    requestLayout();
                }
                this.f4607Oooo0OO = (!z5) | this.f4607Oooo0OO;
                if (interpolation <= 0.0f && (i4 = this.f4578OooO0oo) != -1 && this.f4573OooO != i4) {
                    this.f4573OooO = i4;
                    this.f4574OooO0Oo.OooO0O0(i4).OooO00o(this);
                    setState(OooOo00.FINISHED);
                    z4 = true;
                }
                if (interpolation >= 1.0d) {
                    i2 = this.f4573OooO;
                    i3 = this.f4579OooOO0;
                    if (i2 != i3) {
                        this.f4573OooO = i3;
                        this.f4574OooO0Oo.OooO0O0(i3).OooO00o(this);
                        setState(OooOo00.FINISHED);
                        z4 = true;
                    }
                }
                if (!this.f4607Oooo0OO || this.f4592OooOo0O) {
                    invalidate();
                } else if ((fSignum > 0.0f && interpolation == 1.0f) || (fSignum < 0.0f && interpolation == 0.0f)) {
                    setState(OooOo00.FINISHED);
                }
                if (!this.f4607Oooo0OO && !this.f4592OooOo0O && ((fSignum > 0.0f && interpolation == 1.0f) || (fSignum < 0.0f && interpolation == 0.0f))) {
                    OooOOOo();
                }
            }
            c = 0;
            interpolation = f3;
            if (Math.abs(this.f4577OooO0oO) > 1.0E-5f) {
                setState(OooOo00.MOVING);
            }
            if (c != 1) {
                if (fSignum <= 0.0f) {
                    interpolation = this.f4591OooOo00;
                    this.f4592OooOo0O = false;
                } else {
                    interpolation = this.f4591OooOo00;
                    this.f4592OooOo0O = false;
                }
                if (interpolation < 1.0f) {
                    this.f4592OooOo0O = false;
                    setState(OooOo00.FINISHED);
                } else {
                    this.f4592OooOo0O = false;
                    setState(OooOo00.FINISHED);
                }
            }
            childCount = getChildCount();
            this.f4607Oooo0OO = false;
            nanoTime = getNanoTime();
            this.f4622Ooooo00 = interpolation;
            interpolator = this.f4575OooO0o;
            if (interpolator == null) {
                interpolation2 = interpolation;
            } else {
                interpolation2 = interpolator.getInterpolation(interpolation);
            }
            interpolator2 = this.f4575OooO0o;
            if (interpolator2 != null) {
                float interpolation5 = interpolator2.getInterpolation((fSignum / this.f4585OooOOOo) + interpolation);
                this.f4577OooO0oO = interpolation5;
                this.f4577OooO0oO = interpolation5 - this.f4575OooO0o.getInterpolation(interpolation);
            }
            while (i < childCount) {
                childAt = getChildAt(i);
                oooo0 = this.f4582OooOOO.get(childAt);
                if (oooo0 != null) {
                    this.f4607Oooo0OO = oooo0.OooO0o0(interpolation2, nanoTime, childAt, this.f4623Ooooo0o) | this.f4607Oooo0OO;
                }
            }
            if (fSignum <= 0.0f) {
            }
            if (!this.f4607Oooo0OO) {
                setState(OooOo00.FINISHED);
            }
            if (this.f4616OoooOO0) {
                requestLayout();
            }
            this.f4607Oooo0OO = (!z5) | this.f4607Oooo0OO;
            if (interpolation <= 0.0f) {
                this.f4573OooO = i4;
                this.f4574OooO0Oo.OooO0O0(i4).OooO00o(this);
                setState(OooOo00.FINISHED);
                z4 = true;
            }
            if (interpolation >= 1.0d) {
                i2 = this.f4573OooO;
                i3 = this.f4579OooOO0;
                if (i2 != i3) {
                    this.f4573OooO = i3;
                    this.f4574OooO0Oo.OooO0O0(i3).OooO00o(this);
                    setState(OooOo00.FINISHED);
                    z4 = true;
                }
            }
            if (this.f4607Oooo0OO) {
                invalidate();
            } else {
                invalidate();
            }
            if (!this.f4607Oooo0OO) {
                OooOOOo();
            }
        }
        float f4 = this.f4586OooOOo;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                int i5 = this.f4573OooO;
                int i6 = this.f4578OooO0oo;
                z3 = i5 == i6 ? z4 : true;
                this.f4573OooO = i6;
            }
            this.f4635o0OoOo0 |= z4;
            if (z4 && !this.f4624OooooO0) {
                requestLayout();
            }
            this.f4587OooOOo0 = this.f4586OooOOo;
        }
        int i7 = this.f4573OooO;
        int i8 = this.f4579OooOO0;
        z3 = i7 == i8 ? z4 : true;
        this.f4573OooO = i8;
        z4 = z3;
        this.f4635o0OoOo0 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f4587OooOOo0 = this.f4586OooOOo;
    }

    public final void OooO0oO(float f) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null) {
            return;
        }
        float f2 = this.f4586OooOOo;
        float f3 = this.f4587OooOOo0;
        if (f2 != f3 && this.f4590OooOo0) {
            this.f4586OooOOo = f3;
        }
        float f4 = this.f4586OooOOo;
        if (f4 == f) {
            return;
        }
        this.f4594OooOoO = false;
        this.f4591OooOo00 = f;
        this.f4585OooOOOo = oooO00o.OooO0OO() / 1000.0f;
        setProgress(this.f4591OooOo00);
        this.f4576OooO0o0 = null;
        this.f4575OooO0o = this.f4574OooO0Oo.OooO0o0();
        this.f4590OooOo0 = false;
        this.f4584OooOOOO = getNanoTime();
        this.f4592OooOo0O = true;
        this.f4587OooOOo0 = f4;
        this.f4586OooOOo = f4;
        invalidate();
    }

    public final void OooO0oo(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            Oooo0 oooo0 = this.f4582OooOOO.get(getChildAt(i));
            if (oooo0 != null && "button".equals(o000000O.OooO00o.OooO0Oo(oooo0.f33862OooO0O0)) && oooo0.f33886OooOoOO != null) {
                int i2 = 0;
                while (true) {
                    o000000O.OooOo00[] oooOo00Arr = oooo0.f33886OooOoOO;
                    if (i2 < oooOo00Arr.length) {
                        oooOo00Arr[i2].OooO0oo(oooo0.f33862OooO0O0, z ? -100.0f : 100.0f);
                        i2++;
                    }
                }
            }
        }
    }

    public final void OooOO0() {
        CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList;
        if ((this.f4593OooOo0o == null && ((copyOnWriteArrayList = this.f4611Oooo0oo) == null || copyOnWriteArrayList.isEmpty())) || this.f4612OoooO == this.f4587OooOOo0) {
            return;
        }
        if (this.f4615OoooO0O != -1) {
            OooOOOO oooOOOO = this.f4593OooOo0o;
            if (oooOOOO != null) {
                oooOOOO.OooO0Oo();
            }
            CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList2 = this.f4611Oooo0oo;
            if (copyOnWriteArrayList2 != null) {
                Iterator<OooOOOO> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().OooO0Oo();
                }
            }
        }
        this.f4615OoooO0O = -1;
        this.f4612OoooO = this.f4587OooOOo0;
        OooOOOO oooOOOO2 = this.f4593OooOo0o;
        if (oooOOOO2 != null) {
            oooOOOO2.OooO0OO();
        }
        CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList3 = this.f4611Oooo0oo;
        if (copyOnWriteArrayList3 != null) {
            Iterator<OooOOOO> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().OooO0OO();
            }
        }
    }

    public final void OooOO0O() {
        CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList;
        if ((this.f4593OooOo0o != null || ((copyOnWriteArrayList = this.f4611Oooo0oo) != null && !copyOnWriteArrayList.isEmpty())) && this.f4615OoooO0O == -1) {
            this.f4615OoooO0O = this.f4573OooO;
            ArrayList<Integer> arrayList = this.f4634o00Ooo;
            int iIntValue = !arrayList.isEmpty() ? arrayList.get(arrayList.size() - 1).intValue() : -1;
            int i = this.f4573OooO;
            if (iIntValue != i && i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        OooOOo0();
        Runnable runnable = this.f4626OooooOo;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void OooOO0o(int i, float f, float f2, float f3, float[] fArr) {
        View viewById = getViewById(i);
        Oooo0 oooo0 = this.f4582OooOOO.get(viewById);
        if (oooo0 != null) {
            oooo0.OooO0Oo(fArr, f, f2, f3);
            viewById.getY();
        } else {
            Log.w("MotionLayout", "WARNING could not find view id " + (viewById == null ? android.support.v4.media.OooO00o.OooO00o("", i) : viewById.getContext().getResources().getResourceName(i)));
        }
    }

    public final boolean OooOOO(float f, float f2, MotionEvent motionEvent, View view) {
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
            if (OooOOO((childAt.getLeft() + f) - view.getScrollX(), (childAt.getTop() + f2) - view.getScrollY(), motionEvent, childAt)) {
                z = true;
                break;
            }
            childCount--;
        }
        if (!z) {
            float right = (view.getRight() + f) - view.getLeft();
            float bottom = (view.getBottom() + f2) - view.getTop();
            RectF rectF = this.f4636ooOO;
            rectF.set(f, f2, right, bottom);
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
                    if (this.f4633o00Oo0 == null) {
                        this.f4633o00Oo0 = new Matrix();
                    }
                    matrix.invert(this.f4633o00Oo0);
                    motionEventObtain.transform(this.f4633o00Oo0);
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

    public final androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 OooOOO0(int i) {
        for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 : this.f4574OooO0Oo.f4677OooO0Oo) {
            if (oooO0O0.f4694OooO00o == i) {
                return oooO0O0;
            }
        }
        return null;
    }

    public final void OooOOOO(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o;
        f4572o00o0O = isInEditMode();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.MotionLayout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.OooO.MotionLayout_layoutDescription) {
                    this.f4574OooO0Oo = new androidx.constraintlayout.motion.widget.OooO00o(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == androidx.constraintlayout.widget.OooO.MotionLayout_currentState) {
                    this.f4573OooO = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionLayout_motionProgress) {
                    this.f4591OooOo00 = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.f4592OooOo0O = true;
                } else if (index == androidx.constraintlayout.widget.OooO.MotionLayout_applyMotionScene) {
                    z = typedArrayObtainStyledAttributes.getBoolean(index, z);
                } else if (index == androidx.constraintlayout.widget.OooO.MotionLayout_showPaths) {
                    if (this.f4589OooOo == 0) {
                        this.f4589OooOo = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == androidx.constraintlayout.widget.OooO.MotionLayout_motionDebug) {
                    this.f4589OooOo = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.f4574OooO0Oo == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f4574OooO0Oo = null;
            }
        }
        if (this.f4589OooOo != 0) {
            androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f4574OooO0Oo;
            if (oooO00o2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int iOooO0oo = oooO00o2.OooO0oo();
                androidx.constraintlayout.motion.widget.OooO00o oooO00o3 = this.f4574OooO0Oo;
                androidx.constraintlayout.widget.OooO0O0 OooO0O1 = oooO00o3.OooO0O0(oooO00o3.OooO0oo());
                String strOooO0OO = o000000O.OooO00o.OooO0OO(iOooO0oo, getContext());
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    int id = childAt.getId();
                    if (id == -1) {
                        StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o("CHECK: ", strOooO0OO, " ALL VIEWS SHOULD HAVE ID's ");
                        sbOooO00o.append(childAt.getClass().getName());
                        sbOooO00o.append(" does not!");
                        Log.w("MotionLayout", sbOooO00o.toString());
                    }
                    if (OooO0O1.OooO(id) == null) {
                        StringBuilder sbOooO00o2 = p004OooO0oO.o0OoOo0.OooO00o("CHECK: ", strOooO0OO, " NO CONSTRAINTS for ");
                        sbOooO00o2.append(o000000O.OooO00o.OooO0Oo(childAt));
                        Log.w("MotionLayout", sbOooO00o2.toString());
                    }
                }
                Integer[] numArr = (Integer[]) OooO0O1.f5038OooO0o.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = numArr[i3].intValue();
                }
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr[i4];
                    String strOooO0OO2 = o000000O.OooO00o.OooO0OO(i5, getContext());
                    if (findViewById(iArr[i4]) == null) {
                        Log.w("MotionLayout", "CHECK: " + strOooO0OO + " NO View matches id " + strOooO0OO2);
                    }
                    if (OooO0O1.OooO0oo(i5).f5060OooO0o0.f5080OooO0Oo == -1) {
                        Log.w("MotionLayout", oO00Oo00.OooO00o("CHECK: ", strOooO0OO, "(", strOooO0OO2, ") no LAYOUT_HEIGHT"));
                    }
                    if (OooO0O1.OooO0oo(i5).f5060OooO0o0.f5079OooO0OO == -1) {
                        Log.w("MotionLayout", oO00Oo00.OooO00o("CHECK: ", strOooO0OO, "(", strOooO0OO2, ") no LAYOUT_HEIGHT"));
                    }
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 : this.f4574OooO0Oo.f4677OooO0Oo) {
                    if (oooO0O0 == this.f4574OooO0Oo.f4676OooO0OO) {
                        Log.v("MotionLayout", "CHECK: CURRENT");
                    }
                    if (oooO0O0.f4697OooO0Oo == oooO0O0.f4696OooO0OO) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i6 = oooO0O0.f4697OooO0Oo;
                    int i7 = oooO0O0.f4696OooO0OO;
                    String strOooO0OO3 = o000000O.OooO00o.OooO0OO(i6, getContext());
                    String strOooO0OO4 = o000000O.OooO00o.OooO0OO(i7, getContext());
                    if (sparseIntArray.get(i6) == i7) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + strOooO0OO3 + "->" + strOooO0OO4);
                    }
                    if (sparseIntArray2.get(i7) == i6) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + strOooO0OO3 + "->" + strOooO0OO4);
                    }
                    sparseIntArray.put(i6, i7);
                    sparseIntArray2.put(i7, i6);
                    if (this.f4574OooO0Oo.OooO0O0(i6) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + strOooO0OO3);
                    }
                    if (this.f4574OooO0Oo.OooO0O0(i7) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + strOooO0OO3);
                    }
                }
            }
        }
        if (this.f4573OooO != -1 || (oooO00o = this.f4574OooO0Oo) == null) {
            return;
        }
        this.f4573OooO = oooO00o.OooO0oo();
        this.f4578OooO0oo = this.f4574OooO0Oo.OooO0oo();
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = this.f4574OooO0Oo.f4676OooO0OO;
        this.f4579OooOO0 = oooO0O1 != null ? oooO0O1.f4696OooO0OO : -1;
    }

    public final void OooOOOo() {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        View viewFindViewById;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null) {
            return;
        }
        if (oooO00o.OooO00o(this.f4573OooO, this)) {
            requestLayout();
            return;
        }
        int i = this.f4573OooO;
        if (i != -1) {
            androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f4574OooO0Oo;
            ArrayList<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0> arrayList = oooO00o2.f4677OooO0Oo;
            for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O2 : arrayList) {
                if (oooO0O2.f4706OooOOO0.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0.ViewOnClickListenerC0114OooO00o> it = oooO0O2.f4706OooOOO0.iterator();
                    while (it.hasNext()) {
                        it.next().OooO0O0(this);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0> arrayList2 = oooO00o2.f4678OooO0o;
            for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O3 : arrayList2) {
                if (oooO0O3.f4706OooOOO0.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0.ViewOnClickListenerC0114OooO00o> it2 = oooO0O3.f4706OooOOO0.iterator();
                    while (it2.hasNext()) {
                        it2.next().OooO0O0(this);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O4 : arrayList) {
                if (oooO0O4.f4706OooOOO0.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0.ViewOnClickListenerC0114OooO00o> it3 = oooO0O4.f4706OooOOO0.iterator();
                    while (it3.hasNext()) {
                        it3.next().OooO00o(this, i, oooO0O4);
                    }
                }
            }
            for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O5 : arrayList2) {
                if (oooO0O5.f4706OooOOO0.size() > 0) {
                    Iterator<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0.ViewOnClickListenerC0114OooO00o> it4 = oooO0O5.f4706OooOOO0.iterator();
                    while (it4.hasNext()) {
                        it4.next().OooO00o(this, i, oooO0O5);
                    }
                }
            }
        }
        if (!this.f4574OooO0Oo.OooOOOo() || (oooO0O0 = this.f4574OooO0Oo.f4676OooO0OO) == null || (oooO0O1 = oooO0O0.f4704OooOO0o) == null) {
            return;
        }
        int i2 = oooO0O1.f4720OooO0Oo;
        if (i2 != -1) {
            MotionLayout motionLayout = oooO0O1.f4732OooOOo;
            viewFindViewById = motionLayout.findViewById(i2);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + o000000O.OooO00o.OooO0OO(oooO0O1.f4720OooO0Oo, motionLayout.getContext()));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new o00O0O());
            nestedScrollView.setOnScrollChangeListener(new o00Oo0());
        }
    }

    public final void OooOOo() {
        this.f4630Ooooooo.OooO0o();
        invalidate();
    }

    public final void OooOOo0() {
        CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList;
        if (this.f4593OooOo0o == null && ((copyOnWriteArrayList = this.f4611Oooo0oo) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.f4634o00Ooo;
        for (Integer num : arrayList) {
            OooOOOO oooOOOO = this.f4593OooOo0o;
            if (oooOOOO != null) {
                oooOOOO.OooO00o(num.intValue());
            }
            CopyOnWriteArrayList<OooOOOO> copyOnWriteArrayList2 = this.f4611Oooo0oo;
            if (copyOnWriteArrayList2 != null) {
                Iterator<OooOOOO> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().OooO00o(num.intValue());
                }
            }
        }
        arrayList.clear();
    }

    public final void OooOOoo(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.f4625OooooOO == null) {
                this.f4625OooooOO = new OooOOO();
            }
            OooOOO oooOOO = this.f4625OooooOO;
            oooOOO.f4668OooO0OO = i;
            oooOOO.f4669OooO0Oo = i2;
            return;
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o != null) {
            this.f4578OooO0oo = i;
            this.f4579OooOO0 = i2;
            oooO00o.OooOOOO(i, i2);
            this.f4630Ooooooo.OooO0o0(this.f4574OooO0Oo.OooO0O0(i), this.f4574OooO0Oo.OooO0O0(i2));
            OooOOo();
            this.f4586OooOOo = 0.0f;
            OooO0oO(0.0f);
        }
    }

    public final void OooOo(int i, View... viewArr) {
        String str;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        androidx.constraintlayout.motion.widget.OooO0o oooO0o = oooO00o.f4690OooOOo0;
        oooO0o.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.constraintlayout.motion.widget.OooO0OO> it = oooO0o.f4781OooO0O0.iterator();
        androidx.constraintlayout.motion.widget.OooO0OO oooO0OO = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            str = oooO0o.f4783OooO0Oo;
            if (!zHasNext) {
                break;
            }
            androidx.constraintlayout.motion.widget.OooO0OO next = it.next();
            if (next.f4747OooO00o == i) {
                for (View view : viewArr) {
                    if (next.OooO0O0(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = oooO0o.f4780OooO00o;
                    int currentState = motionLayout.getCurrentState();
                    if (next.f4752OooO0o0 == 2) {
                        next.OooO00o(oooO0o, oooO0o.f4780OooO00o, currentState, null, viewArr2);
                    } else if (currentState == -1) {
                        Log.w(str, "No support for ViewTransition within transition yet. Currently: " + motionLayout.toString());
                    } else {
                        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = motionLayout.f4574OooO0Oo;
                        androidx.constraintlayout.widget.OooO0O0 OooO0O1 = oooO00o2 == null ? null : oooO00o2.OooO0O0(currentState);
                        if (OooO0O1 != null) {
                            next.OooO00o(oooO0o, oooO0o.f4780OooO00o, currentState, OooO0O1, viewArr2);
                        }
                    }
                    arrayList.clear();
                }
                oooO0OO = next;
            }
        }
        if (oooO0OO == null) {
            Log.e(str, " Could not find ViewTransition");
        }
    }

    public final void OooOo0() {
        OooO0oO(1.0f);
        this.f4626OooooOo = null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:64:0x010d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x012b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135  */
    /* JADX WARN: Code duplicated, block: B:87:0x013a  */
    public final void OooOo00(float f, float f2, int i) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        int i2;
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
        if (this.f4574OooO0Oo == null || this.f4586OooOOo == f8) {
            return;
        }
        boolean z = true;
        this.f4594OooOoO = true;
        this.f4584OooOOOO = getNanoTime();
        float fOooO0OO = this.f4574OooO0Oo.OooO0OO() / 1000.0f;
        this.f4585OooOOOo = fOooO0OO;
        this.f4591OooOo00 = f8;
        this.f4592OooOo0O = true;
        o000000.OooO0O0 oooO0O10 = this.f4596OooOoOO;
        if (i == 0 || i == 1 || i == 2) {
            if (i != 1 || i == 7) {
                f8 = 0.0f;
            } else if (i == 2 || i == 6) {
                f8 = 1.0f;
            }
            oooO00o = this.f4574OooO0Oo;
            oooO0O0 = oooO00o.f4676OooO0OO;
            if (oooO0O0 != null || (oooO0O8 = oooO0O0.f4704OooOO0o) == null) {
                i2 = 0;
            } else {
                i2 = oooO0O8.f4745OooOooO;
            }
            if (i2 == 0) {
                float f9 = this.f4586OooOOo;
                float fOooO0oO = oooO00o.OooO0oO();
                oooO0O6 = this.f4574OooO0Oo.f4676OooO0OO;
                if (oooO0O6 != null || (oooO0O7 = oooO0O6.f4704OooOO0o) == null) {
                    f7 = 0.0f;
                } else {
                    f7 = oooO0O7.f4734OooOOoo;
                }
                oooO0O10.OooO0O0(f9, f8, f2, fOooO0OO, fOooO0oO, f7);
            } else {
                float f10 = this.f4586OooOOo;
                if (oooO0O0 != null || (oooO0O5 = oooO0O0.f4704OooOO0o) == null) {
                    f3 = 0.0f;
                } else {
                    f3 = oooO0O5.f4740OooOoO;
                }
                if (oooO0O0 != null || (oooO0O4 = oooO0O0.f4704OooOO0o) == null) {
                    f4 = 0.0f;
                } else {
                    f4 = oooO0O4.f4742OooOoOO;
                }
                if (oooO0O0 != null || (oooO0O3 = oooO0O0.f4704OooOO0o) == null) {
                    f5 = 0.0f;
                } else {
                    f5 = oooO0O3.f4741OooOoO0;
                }
                if (oooO0O0 != null || (oooO0O2 = oooO0O0.f4704OooOO0o) == null) {
                    f6 = 0.0f;
                } else {
                    f6 = oooO0O2.f4744OooOoo0;
                }
                if (oooO0O0 != null || (oooO0O1 = oooO0O0.f4704OooOO0o) == null) {
                    i3 = 0;
                } else {
                    i3 = oooO0O1.f4743OooOoo;
                }
                if (oooO0O10.f33743OooO0O0 == null) {
                    oooO0O10.f33743OooO0O0 = new o0OOO0o();
                }
                o0OOO0o o0ooo0o2 = oooO0O10.f33743OooO0O0;
                oooO0O10.f33744OooO0OO = o0ooo0o2;
                o0ooo0o2.f45337OooO0OO = f8;
                o0ooo0o2.f45335OooO00o = f5;
                o0ooo0o2.f45340OooO0o0 = f10;
                o0ooo0o2.f45336OooO0O0 = f4;
                o0ooo0o2.f45341OooO0oO = f3;
                o0ooo0o2.f45342OooO0oo = f6;
                o0ooo0o2.f45334OooO = i3;
                o0ooo0o2.f45338OooO0Oo = 0.0f;
            }
            int i4 = this.f4573OooO;
            this.f4591OooOo00 = f8;
            this.f4573OooO = i4;
            this.f4576OooO0o0 = oooO0O10;
        } else {
            OooO oooO = this.f4598OooOoo0;
            if (i == 4) {
                float f11 = this.f4586OooOOo;
                float fOooO0oO2 = this.f4574OooO0Oo.OooO0oO();
                oooO.f4637OooO00o = f2;
                oooO.f4638OooO0O0 = f11;
                oooO.f4639OooO0OO = fOooO0oO2;
                this.f4576OooO0o0 = oooO;
            } else if (i == 5) {
                float f12 = this.f4586OooOOo;
                float fOooO0oO3 = this.f4574OooO0Oo.OooO0oO();
                if (f2 > 0.0f) {
                    float f13 = f2 / fOooO0oO3;
                    if (((f2 * f13) - (((fOooO0oO3 * f13) * f13) / 2.0f)) + f12 <= 1.0f) {
                        z = false;
                    }
                } else {
                    float f14 = (-f2) / fOooO0oO3;
                    if ((((fOooO0oO3 * f14) * f14) / 2.0f) + (f2 * f14) + f12 >= 0.0f) {
                        z = false;
                    }
                }
                if (z) {
                    float f15 = this.f4586OooOOo;
                    float fOooO0oO4 = this.f4574OooO0Oo.OooO0oO();
                    oooO.f4637OooO00o = f2;
                    oooO.f4638OooO0O0 = f15;
                    oooO.f4639OooO0OO = fOooO0oO4;
                    this.f4576OooO0o0 = oooO;
                } else {
                    o000000.OooO0O0 oooO0O11 = this.f4596OooOoOO;
                    float f16 = this.f4586OooOOo;
                    float f17 = this.f4585OooOOOo;
                    float fOooO0oO5 = this.f4574OooO0Oo.OooO0oO();
                    androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O12 = this.f4574OooO0Oo.f4676OooO0OO;
                    oooO0O11.OooO0O0(f16, f, f2, f17, fOooO0oO5, (oooO0O12 == null || (oooO0O9 = oooO0O12.f4704OooOO0o) == null) ? 0.0f : oooO0O9.f4734OooOOoo);
                    this.f4577OooO0oO = 0.0f;
                    int i5 = this.f4573OooO;
                    this.f4591OooOo00 = f8;
                    this.f4573OooO = i5;
                    this.f4576OooO0o0 = oooO0O10;
                }
            } else if (i == 6 || i == 7) {
                if (i != 1) {
                    f8 = 0.0f;
                } else {
                    f8 = 0.0f;
                }
                oooO00o = this.f4574OooO0Oo;
                oooO0O0 = oooO00o.f4676OooO0OO;
                if (oooO0O0 != null) {
                    i2 = 0;
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    float f18 = this.f4586OooOOo;
                    float fOooO0oO6 = oooO00o.OooO0oO();
                    oooO0O6 = this.f4574OooO0Oo.f4676OooO0OO;
                    if (oooO0O6 != null) {
                        f7 = 0.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    oooO0O10.OooO0O0(f18, f8, f2, fOooO0OO, fOooO0oO6, f7);
                } else {
                    float f19 = this.f4586OooOOo;
                    if (oooO0O0 != null) {
                        f3 = 0.0f;
                    } else {
                        f3 = 0.0f;
                    }
                    if (oooO0O0 != null) {
                        f4 = 0.0f;
                    } else {
                        f4 = 0.0f;
                    }
                    if (oooO0O0 != null) {
                        f5 = 0.0f;
                    } else {
                        f5 = 0.0f;
                    }
                    if (oooO0O0 != null) {
                        f6 = 0.0f;
                    } else {
                        f6 = 0.0f;
                    }
                    if (oooO0O0 != null) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                    }
                    if (oooO0O10.f33743OooO0O0 == null) {
                        oooO0O10.f33743OooO0O0 = new o0OOO0o();
                    }
                    o0OOO0o o0ooo0o3 = oooO0O10.f33743OooO0O0;
                    oooO0O10.f33744OooO0OO = o0ooo0o3;
                    o0ooo0o3.f45337OooO0OO = f8;
                    o0ooo0o3.f45335OooO00o = f5;
                    o0ooo0o3.f45340OooO0o0 = f19;
                    o0ooo0o3.f45336OooO0O0 = f4;
                    o0ooo0o3.f45341OooO0oO = f3;
                    o0ooo0o3.f45342OooO0oo = f6;
                    o0ooo0o3.f45334OooO = i3;
                    o0ooo0o3.f45338OooO0Oo = 0.0f;
                }
                int i6 = this.f4573OooO;
                this.f4591OooOo00 = f8;
                this.f4573OooO = i6;
                this.f4576OooO0o0 = oooO0O10;
            }
        }
        this.f4590OooOo0 = false;
        this.f4584OooOOOO = getNanoTime();
        invalidate();
    }

    public final void OooOo0O(int i, int i2) {
        androidx.constraintlayout.widget.OooOO0O oooOO0O;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o != null && (oooOO0O = oooO00o.f4675OooO0O0) != null) {
            int i3 = this.f4573OooO;
            float f = -1;
            androidx.constraintlayout.widget.OooOO0O.OooO00o oooO00o2 = oooOO0O.f5165OooO0O0.get(i);
            if (oooO00o2 != null) {
                ArrayList<androidx.constraintlayout.widget.OooOO0O.OooO0O0> arrayList = oooO00o2.f5167OooO0O0;
                int i4 = oooO00o2.f5168OooO0OO;
                if (f != -1.0f && f != -1.0f) {
                    Iterator<androidx.constraintlayout.widget.OooOO0O.OooO0O0> it = arrayList.iterator();
                    androidx.constraintlayout.widget.OooOO0O.OooO0O0 oooO0O0 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            if (oooO0O0 != null) {
                                i3 = oooO0O0.f5173OooO0o0;
                                break;
                            } else {
                                i3 = i4;
                                break;
                            }
                        }
                        androidx.constraintlayout.widget.OooOO0O.OooO0O0 next = it.next();
                        if (next.OooO00o(f, f)) {
                            if (i3 == next.f5173OooO0o0) {
                                break;
                            } else {
                                oooO0O0 = next;
                            }
                        }
                    }
                } else if (i4 != i3) {
                    Iterator<androidx.constraintlayout.widget.OooOO0O.OooO0O0> it2 = arrayList.iterator();
                    do {
                        if (!it2.hasNext()) {
                            i3 = i4;
                            break;
                        }
                    } while (i3 != it2.next().f5173OooO0o0);
                }
            } else {
                i3 = i;
            }
            if (i3 != -1) {
                i = i3;
            }
        }
        int i5 = this.f4573OooO;
        if (i5 == i) {
            return;
        }
        if (this.f4578OooO0oo == i) {
            OooO0oO(0.0f);
            if (i2 > 0) {
                this.f4585OooOOOo = i2 / 1000.0f;
                return;
            }
            return;
        }
        if (this.f4579OooOO0 == i) {
            OooO0oO(1.0f);
            if (i2 > 0) {
                this.f4585OooOOOo = i2 / 1000.0f;
                return;
            }
            return;
        }
        this.f4579OooOO0 = i;
        if (i5 != -1) {
            OooOOoo(i5, i);
            OooO0oO(1.0f);
            this.f4586OooOOo = 0.0f;
            OooOo0();
            if (i2 > 0) {
                this.f4585OooOOOo = i2 / 1000.0f;
                return;
            }
            return;
        }
        this.f4594OooOoO = false;
        this.f4591OooOo00 = 1.0f;
        this.f4587OooOOo0 = 0.0f;
        this.f4586OooOOo = 0.0f;
        this.f4588OooOOoo = getNanoTime();
        this.f4584OooOOOO = getNanoTime();
        this.f4590OooOo0 = false;
        this.f4576OooO0o0 = null;
        if (i2 == -1) {
            this.f4585OooOOOo = this.f4574OooO0Oo.OooO0OO() / 1000.0f;
        }
        this.f4578OooO0oo = -1;
        this.f4574OooO0Oo.OooOOOO(-1, this.f4579OooOO0);
        SparseArray sparseArray = new SparseArray();
        if (i2 == 0) {
            this.f4585OooOOOo = this.f4574OooO0Oo.OooO0OO() / 1000.0f;
        } else if (i2 > 0) {
            this.f4585OooOOOo = i2 / 1000.0f;
        }
        int childCount = getChildCount();
        HashMap<View, Oooo0> map = this.f4582OooOOO;
        map.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            map.put(childAt, new Oooo0(childAt));
            sparseArray.put(childAt.getId(), map.get(childAt));
        }
        this.f4592OooOo0O = true;
        androidx.constraintlayout.widget.OooO0O0 OooO0O1 = this.f4574OooO0Oo.OooO0O0(i);
        OooOO0O oooOO0O2 = this.f4630Ooooooo;
        oooOO0O2.OooO0o0(null, OooO0O1);
        OooOOo();
        oooOO0O2.OooO00o();
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            Oooo0 oooo0 = map.get(childAt2);
            if (oooo0 != null) {
                o0OoOo0 o0oooo0 = oooo0.f33865OooO0o;
                o0oooo0.f33899OooO0o = 0.0f;
                o0oooo0.f33901OooO0oO = 0.0f;
                o0oooo0.OooO0Oo(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                OooOo oooOo = oooo0.f33868OooO0oo;
                oooOo.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                oooOo.OooO0O0(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (this.f4610Oooo0oO != null) {
            for (int i8 = 0; i8 < childCount; i8++) {
                Oooo0 oooo1 = map.get(getChildAt(i8));
                if (oooo1 != null) {
                    this.f4574OooO0Oo.OooO0o(oooo1);
                }
            }
            Iterator<MotionHelper> it3 = this.f4610Oooo0oO.iterator();
            while (it3.hasNext()) {
                it3.next().OooOo0(this, map);
            }
            for (int i9 = 0; i9 < childCount; i9++) {
                Oooo0 oooo2 = map.get(getChildAt(i9));
                if (oooo2 != null) {
                    oooo2.OooO0oo(width, height, getNanoTime());
                }
            }
        } else {
            for (int i10 = 0; i10 < childCount; i10++) {
                Oooo0 oooo3 = map.get(getChildAt(i10));
                if (oooo3 != null) {
                    this.f4574OooO0Oo.OooO0o(oooo3);
                    oooo3.OooO0oo(width, height, getNanoTime());
                }
            }
        }
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = this.f4574OooO0Oo.f4676OooO0OO;
        float f2 = oooO0O1 != null ? oooO0O1.f4693OooO : 0.0f;
        if (f2 != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i11 = 0; i11 < childCount; i11++) {
                o0OoOo0 o0oooo1 = map.get(getChildAt(i11)).f33867OooO0oO;
                float f3 = o0oooo1.f33897OooO + o0oooo1.f33902OooO0oo;
                fMin = Math.min(fMin, f3);
                fMax = Math.max(fMax, f3);
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                Oooo0 oooo4 = map.get(getChildAt(i12));
                o0OoOo0 o0oooo2 = oooo4.f33867OooO0oO;
                float f4 = o0oooo2.f33902OooO0oo;
                float f5 = o0oooo2.f33897OooO;
                oooo4.f33872OooOOO = 1.0f / (1.0f - f2);
                oooo4.f33873OooOOO0 = f2 - ((((f4 + f5) - fMin) * f2) / (fMax - fMin));
            }
        }
        this.f4587OooOOo0 = 0.0f;
        this.f4586OooOOo = 0.0f;
        this.f4592OooOo0O = true;
        invalidate();
    }

    public final void OooOo0o(int i, androidx.constraintlayout.widget.OooO0O0 oooO0O0) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o != null) {
            oooO00o.f4680OooO0oO.put(i, oooO0O0);
        }
        this.f4630Ooooooo.OooO0o0(this.f4574OooO0Oo.OooO0O0(this.f4578OooO0oo), this.f4574OooO0Oo.OooO0O0(this.f4579OooOO0));
        OooOOo();
        if (this.f4573OooO == i) {
            oooO0O0.OooO0O0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0516  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        OooOO0 oooOO1;
        Iterator<Oooo0> it;
        int i;
        int i2;
        Canvas canvas2;
        OooOO0 oooOO2;
        int i3;
        o0OoOo0 o0oooo0;
        int i4;
        int i5;
        Paint paint;
        Paint paint2;
        double dOooO00o;
        androidx.constraintlayout.motion.widget.OooO0o oooO0o;
        ArrayList<androidx.constraintlayout.motion.widget.OooO0OO.OooO00o> arrayList;
        MotionLayout motionLayout = this;
        Canvas canvas3 = canvas;
        ArrayList<MotionHelper> arrayList2 = motionLayout.f4610Oooo0oO;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
        int i6 = 0;
        motionLayout.OooO(false);
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = motionLayout.f4574OooO0Oo;
        if (oooO00o != null && (oooO0o = oooO00o.f4690OooOOo0) != null && (arrayList = oooO0o.f4785OooO0o0) != null) {
            Iterator<androidx.constraintlayout.motion.widget.OooO0OO.OooO00o> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                it3.next().OooO00o();
            }
            ArrayList<androidx.constraintlayout.motion.widget.OooO0OO.OooO00o> arrayList3 = oooO0o.f4785OooO0o0;
            ArrayList<androidx.constraintlayout.motion.widget.OooO0OO.OooO00o> arrayList4 = oooO0o.f4784OooO0o;
            arrayList3.removeAll(arrayList4);
            arrayList4.clear();
            if (oooO0o.f4785OooO0o0.isEmpty()) {
                oooO0o.f4785OooO0o0 = null;
            }
        }
        super.dispatchDraw(canvas);
        if (motionLayout.f4574OooO0Oo == null) {
            return;
        }
        int i7 = 1;
        if ((motionLayout.f4589OooOo & 1) == 1 && !isInEditMode()) {
            motionLayout.f4601Oooo++;
            long nanoTime = getNanoTime();
            long j = motionLayout.f4614OoooO00;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    motionLayout.f4613OoooO0 = ((int) ((motionLayout.f4601Oooo / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    motionLayout.f4601Oooo = 0;
                    motionLayout.f4614OoooO00 = nanoTime;
                }
            } else {
                motionLayout.f4614OoooO00 = nanoTime;
            }
            Paint paint3 = new Paint();
            paint3.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sbOooO00o = o00OO.OooO00o(motionLayout.f4613OoooO0 + " fps " + o000000O.OooO00o.OooO0o0(motionLayout.f4578OooO0oo, motionLayout) + " -> ");
            sbOooO00o.append(o000000O.OooO00o.OooO0o0(motionLayout.f4579OooOO0, motionLayout));
            sbOooO00o.append(" (progress: ");
            sbOooO00o.append(progress);
            sbOooO00o.append(" ) state=");
            int i8 = motionLayout.f4573OooO;
            sbOooO00o.append(i8 == -1 ? "undefined" : o000000O.OooO00o.OooO0o0(i8, motionLayout));
            String string = sbOooO00o.toString();
            paint3.setColor(-16777216);
            canvas3.drawText(string, 11.0f, getHeight() - 29, paint3);
            paint3.setColor(-7864184);
            canvas3.drawText(string, 10.0f, getHeight() - 30, paint3);
        }
        if (motionLayout.f4589OooOo <= 1) {
            motionLayout = this;
        } else {
            if (motionLayout.f4595OooOoO0 == null) {
                motionLayout.f4595OooOoO0 = motionLayout.new OooOO0();
            }
            OooOO0 oooOO3 = motionLayout.f4595OooOoO0;
            HashMap<View, Oooo0> map = motionLayout.f4582OooOOO;
            int iOooO0OO = motionLayout.f4574OooO0Oo.OooO0OO();
            int i9 = motionLayout.f4589OooOo;
            oooOO3.getClass();
            if (map == null) {
                motionLayout = this;
            } else if (map.size() != 0) {
                canvas.save();
                MotionLayout motionLayout2 = MotionLayout.this;
                boolean zIsInEditMode = motionLayout2.isInEditMode();
                Paint paint4 = oooOO3.f4651OooO0o0;
                if (!zIsInEditMode && (i9 & 1) == 2) {
                    String str = motionLayout2.getContext().getResources().getResourceName(motionLayout2.f4579OooOO0) + CertificateUtil.DELIMITER + motionLayout2.getProgress();
                    canvas3.drawText(str, 10.0f, motionLayout2.getHeight() - 30, oooOO3.f4653OooO0oo);
                    canvas3.drawText(str, 11.0f, motionLayout2.getHeight() - 29, paint4);
                }
                Iterator<Oooo0> it4 = map.values().iterator();
                Canvas canvas4 = canvas3;
                OooOO0 oooOO4 = oooOO3;
                while (it4.hasNext()) {
                    Oooo0 next = it4.next();
                    int iMax = next.f33865OooO0o.f33900OooO0o0;
                    ArrayList<o0OoOo0> arrayList5 = next.f33880OooOo0;
                    Iterator<o0OoOo0> it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        iMax = Math.max(iMax, it5.next().f33900OooO0o0);
                    }
                    int iMax2 = Math.max(iMax, next.f33867OooO0oO.f33900OooO0o0);
                    if (i9 > 0 && iMax2 == 0) {
                        iMax2 = i7;
                    }
                    if (iMax2 != 0) {
                        float[] fArr = oooOO4.f4648OooO0OO;
                        if (fArr != null) {
                            int[] iArr = oooOO4.f4647OooO0O0;
                            if (iArr != null) {
                                Iterator<o0OoOo0> it6 = arrayList5.iterator();
                                while (it6.hasNext()) {
                                    iArr[i6] = it6.next().f33910OooOOo;
                                    i6++;
                                    it4 = it4;
                                }
                            }
                            it = it4;
                            int i10 = 0;
                            int i11 = 0;
                            for (double[] dArrOooO0oO = next.f33869OooOO0[i6].OooO0oO(); i10 < dArrOooO0oO.length; dArrOooO0oO = dArrOooO0oO) {
                                next.f33869OooOO0[0].OooO0OO(dArrOooO0oO[i10], next.f33875OooOOOo);
                                next.f33865OooO0o.OooO0OO(dArrOooO0oO[i10], next.f33874OooOOOO, next.f33875OooOOOo, fArr, i11);
                                i11 += 2;
                                i10++;
                                i9 = i9;
                                oooOO3 = oooOO3;
                            }
                            oooOO1 = oooOO3;
                            i = i9;
                            i2 = i11 / 2;
                        } else {
                            oooOO1 = oooOO3;
                            it = it4;
                            i = i9;
                            i2 = 0;
                        }
                        oooOO4.f4655OooOO0O = i2;
                        if (iMax2 >= 1) {
                            int i12 = iOooO0OO / 16;
                            float[] fArr2 = oooOO4.f4646OooO00o;
                            if (fArr2 == null || fArr2.length != i12 * 2) {
                                oooOO4.f4646OooO00o = new float[i12 * 2];
                                oooOO4.f4649OooO0Oo = new Path();
                            }
                            int i13 = oooOO4.f4658OooOOO0;
                            float f = i13;
                            canvas4.translate(f, f);
                            paint4.setColor(1996488704);
                            Paint paint5 = oooOO4.f4645OooO;
                            paint5.setColor(1996488704);
                            Paint paint6 = oooOO4.f4650OooO0o;
                            paint6.setColor(1996488704);
                            Paint paint7 = oooOO4.f4652OooO0oO;
                            paint7.setColor(1996488704);
                            float[] fArr3 = oooOO4.f4646OooO00o;
                            float f2 = 1.0f / (i12 - 1);
                            HashMap<String, o000000.OooO0o> map2 = next.f33885OooOoO0;
                            o000000.OooO0o oooO0o2 = map2 == null ? null : map2.get("translationX");
                            HashMap<String, o000000.OooO0o> map3 = next.f33885OooOoO0;
                            o000000.OooO0o oooO0o3 = map3 == null ? null : map3.get("translationY");
                            HashMap<String, o000000.OooO0OO> map4 = next.f33884OooOoO;
                            o000000.OooO0OO oooO0OO = map4 == null ? null : map4.get("translationX");
                            HashMap<String, o000000.OooO0OO> map5 = next.f33884OooOoO;
                            o000000.OooO0OO oooO0OO2 = map5 == null ? null : map5.get("translationY");
                            int i14 = 0;
                            while (true) {
                                float f3 = Float.NaN;
                                o000000.OooO0o oooO0o4 = oooO0o3;
                                o0oooo0 = next.f33865OooO0o;
                                if (i14 >= i12) {
                                    break;
                                }
                                int i15 = i12;
                                float fMin = i14 * f2;
                                float f4 = f2;
                                float f5 = next.f33872OooOOO;
                                if (f5 != 1.0f) {
                                    i5 = i13;
                                    float f6 = next.f33873OooOOO0;
                                    if (fMin < f6) {
                                        fMin = 0.0f;
                                    }
                                    paint = paint5;
                                    paint2 = paint6;
                                    if (fMin > f6 && fMin < 1.0d) {
                                        fMin = Math.min((fMin - f6) * f5, 1.0f);
                                    }
                                } else {
                                    i5 = i13;
                                    paint = paint5;
                                    paint2 = paint6;
                                }
                                double d = fMin;
                                p413o0Oo0oo.Oooo0 oooo0 = o0oooo0.f33898OooO0Oo;
                                float f7 = 0.0f;
                                for (o0OoOo0 o0oooo1 : arrayList5) {
                                    double d2 = d;
                                    p413o0Oo0oo.Oooo0 oooo1 = o0oooo1.f33898OooO0Oo;
                                    if (oooo1 != null) {
                                        float f8 = o0oooo1.f33899OooO0o;
                                        if (f8 < fMin) {
                                            f7 = f8;
                                            oooo0 = oooo1;
                                        } else if (Float.isNaN(f3)) {
                                            f3 = o0oooo1.f33899OooO0o;
                                        }
                                    }
                                    d = d2;
                                }
                                double d3 = d;
                                if (oooo0 != null) {
                                    if (Float.isNaN(f3)) {
                                        f3 = 1.0f;
                                    }
                                    float f9 = f3 - f7;
                                    dOooO00o = (((float) oooo0.OooO00o((fMin - f7) / f9)) * f9) + f7;
                                } else {
                                    dOooO00o = d3;
                                }
                                next.f33869OooOO0[0].OooO0OO(dOooO00o, next.f33875OooOOOo);
                                p413o0Oo0oo.OooOo oooOo = next.f33870OooOO0O;
                                if (oooOo != null) {
                                    double[] dArr = next.f33875OooOOOo;
                                    if (dArr.length > 0) {
                                        oooOo.OooO0OO(dOooO00o, dArr);
                                    }
                                }
                                int i16 = i14 * 2;
                                ArrayList<o0OoOo0> arrayList6 = arrayList5;
                                int i17 = i14;
                                next.f33865OooO0o.OooO0OO(dOooO00o, next.f33874OooOOOO, next.f33875OooOOOo, fArr3, i16);
                                if (oooO0OO != null) {
                                    fArr3[i16] = oooO0OO.OooO00o(fMin) + fArr3[i16];
                                } else if (oooO0o2 != null) {
                                    fArr3[i16] = oooO0o2.OooO00o(fMin) + fArr3[i16];
                                }
                                if (oooO0OO2 != null) {
                                    int i18 = i16 + 1;
                                    fArr3[i18] = oooO0OO2.OooO00o(fMin) + fArr3[i18];
                                } else if (oooO0o4 != null) {
                                    int i19 = i16 + 1;
                                    fArr3[i19] = oooO0o4.OooO00o(fMin) + fArr3[i19];
                                }
                                i14 = i17 + 1;
                                oooO0o3 = oooO0o4;
                                i12 = i15;
                                f2 = f4;
                                i13 = i5;
                                paint5 = paint;
                                paint6 = paint2;
                                arrayList5 = arrayList6;
                            }
                            int i20 = i13;
                            oooOO2 = oooOO1;
                            canvas2 = canvas;
                            oooOO2.OooO00o(canvas2, iMax2, oooOO2.f4655OooOO0O, next);
                            paint4.setColor(-21965);
                            paint6.setColor(-2067046);
                            paint5.setColor(-2067046);
                            paint7.setColor(-13391360);
                            float f10 = -i20;
                            canvas2.translate(f10, f10);
                            oooOO2.OooO00o(canvas2, iMax2, oooOO2.f4655OooOO0O, next);
                            if (iMax2 == 5) {
                                oooOO2.f4649OooO0Oo.reset();
                                int i21 = 0;
                                while (i21 <= 50) {
                                    next.f33869OooOO0[0].OooO0OO(next.OooO0O0(i21 / 50, null), next.f33875OooOOOo);
                                    int[] iArr2 = next.f33874OooOOOO;
                                    double[] dArr2 = next.f33875OooOOOo;
                                    float f11 = o0oooo0.f33902OooO0oo;
                                    float fCos = o0oooo0.f33897OooO;
                                    float f12 = o0oooo0.f33903OooOO0;
                                    float f13 = o0oooo0.f33904OooOO0O;
                                    int i22 = 0;
                                    while (i22 < iArr2.length) {
                                        Oooo0 oooo2 = next;
                                        float f14 = (float) dArr2[i22];
                                        int i23 = iArr2[i22];
                                        if (i23 == 1) {
                                            f11 = f14;
                                        } else if (i23 == 2) {
                                            fCos = f14;
                                        } else if (i23 == 3) {
                                            f12 = f14;
                                        } else if (i23 == 4) {
                                            f13 = f14;
                                        }
                                        i22++;
                                        next = oooo2;
                                    }
                                    Oooo0 oooo3 = next;
                                    if (o0oooo0.f33909OooOOOo != null) {
                                        double d4 = 0.0f;
                                        double d5 = f11;
                                        double d6 = fCos;
                                        float fSin = (float) (((Math.sin(d6) * d5) + d4) - ((double) (f12 / 2.0f)));
                                        fCos = (float) ((d4 - (Math.cos(d6) * d5)) - ((double) (f13 / 2.0f)));
                                        f11 = fSin;
                                    }
                                    float f15 = f12 + f11;
                                    float f16 = f13 + fCos;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f17 = f11 + 0.0f;
                                    float f18 = fCos + 0.0f;
                                    float f19 = f15 + 0.0f;
                                    float f20 = f16 + 0.0f;
                                    float[] fArr4 = oooOO2.f4654OooOO0;
                                    fArr4[0] = f17;
                                    fArr4[1] = f18;
                                    fArr4[2] = f19;
                                    fArr4[3] = f18;
                                    fArr4[4] = f19;
                                    fArr4[5] = f20;
                                    fArr4[6] = f17;
                                    fArr4[7] = f20;
                                    oooOO2.f4649OooO0Oo.moveTo(f17, f18);
                                    oooOO2.f4649OooO0Oo.lineTo(fArr4[2], fArr4[3]);
                                    oooOO2.f4649OooO0Oo.lineTo(fArr4[4], fArr4[5]);
                                    oooOO2.f4649OooO0Oo.lineTo(fArr4[6], fArr4[7]);
                                    oooOO2.f4649OooO0Oo.close();
                                    i21++;
                                    o0oooo0 = o0oooo0;
                                    next = oooo3;
                                }
                                i3 = 0;
                                i4 = 1;
                                paint4.setColor(1140850688);
                                canvas2.translate(2.0f, 2.0f);
                                canvas2.drawPath(oooOO2.f4649OooO0Oo, paint4);
                                canvas2.translate(-2.0f, -2.0f);
                                paint4.setColor(-65536);
                                canvas2.drawPath(oooOO2.f4649OooO0Oo, paint4);
                            } else {
                                i3 = 0;
                                i4 = 1;
                            }
                            oooOO4 = oooOO2;
                            canvas4 = canvas2;
                            i7 = i4;
                        } else {
                            canvas2 = canvas;
                            oooOO2 = oooOO1;
                            i7 = 1;
                            i3 = 0;
                        }
                        oooOO3 = oooOO2;
                        canvas3 = canvas2;
                        it4 = it;
                        i9 = i;
                        iOooO0OO = iOooO0OO;
                        i6 = i3;
                    }
                }
                canvas.restore();
                motionLayout = this;
            }
        }
        ArrayList<MotionHelper> arrayList7 = motionLayout.f4610Oooo0oO;
        if (arrayList7 != null) {
            Iterator<MotionHelper> it7 = arrayList7.iterator();
            while (it7.hasNext()) {
                it7.next().getClass();
            }
        }
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.OooO0O0> sparseArray = oooO00o.f4680OooO0oO;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f4573OooO;
    }

    public ArrayList<androidx.constraintlayout.motion.widget.OooO00o.OooO0O0> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null) {
            return null;
        }
        return oooO00o.f4677OooO0Oo;
    }

    public o000000O.OooO0O0 getDesignTool() {
        if (this.f4597OooOoo == null) {
            this.f4597OooOoo = new o000000O.OooO0O0();
        }
        return this.f4597OooOoo;
    }

    public int getEndState() {
        return this.f4579OooOO0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f4586OooOOo;
    }

    public androidx.constraintlayout.motion.widget.OooO00o getScene() {
        return this.f4574OooO0Oo;
    }

    public int getStartState() {
        return this.f4578OooO0oo;
    }

    public float getTargetPosition() {
        return this.f4591OooOo00;
    }

    public Bundle getTransitionState() {
        if (this.f4625OooooOO == null) {
            this.f4625OooooOO = new OooOOO();
        }
        OooOOO oooOOO = this.f4625OooooOO;
        MotionLayout motionLayout = MotionLayout.this;
        oooOOO.f4669OooO0Oo = motionLayout.f4579OooOO0;
        oooOOO.f4668OooO0OO = motionLayout.f4578OooO0oo;
        oooOOO.f4667OooO0O0 = motionLayout.getVelocity();
        oooOOO.f4666OooO00o = motionLayout.getProgress();
        OooOOO oooOOO2 = this.f4625OooooOO;
        oooOOO2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", oooOOO2.f4666OooO00o);
        bundle.putFloat("motion.velocity", oooOOO2.f4667OooO0O0);
        bundle.putInt("motion.StartState", oooOOO2.f4668OooO0OO);
        bundle.putInt("motion.EndState", oooOOO2.f4669OooO0Oo);
        return bundle;
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o != null) {
            this.f4585OooOOOo = oooO00o.OooO0OO() / 1000.0f;
        }
        return (long) (this.f4585OooOOOo * 1000.0f);
    }

    public float getVelocity() {
        return this.f4577OooO0oO;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i) {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        if (i == 0) {
            this.f4574OooO0Oo = null;
            return;
        }
        try {
            androidx.constraintlayout.motion.widget.OooO00o oooO00o = new androidx.constraintlayout.motion.widget.OooO00o(getContext(), this, i);
            this.f4574OooO0Oo = oooO00o;
            int i2 = -1;
            if (this.f4573OooO == -1) {
                this.f4573OooO = oooO00o.OooO0oo();
                this.f4578OooO0oo = this.f4574OooO0Oo.OooO0oo();
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = this.f4574OooO0Oo.f4676OooO0OO;
                if (oooO0O1 != null) {
                    i2 = oooO0O1.f4696OooO0OO;
                }
                this.f4579OooOO0 = i2;
            }
            if (!isAttachedToWindow()) {
                this.f4574OooO0Oo = null;
                return;
            }
            try {
                Display display = getDisplay();
                if (display != null) {
                    display.getRotation();
                }
                androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f4574OooO0Oo;
                if (oooO00o2 != null) {
                    androidx.constraintlayout.widget.OooO0O0 OooO0O1 = oooO00o2.OooO0O0(this.f4573OooO);
                    this.f4574OooO0Oo.OooOOO(this);
                    ArrayList<MotionHelper> arrayList = this.f4610Oooo0oO;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().getClass();
                        }
                    }
                    if (OooO0O1 != null) {
                        OooO0O1.OooO0O0(this);
                    }
                    this.f4578OooO0oo = this.f4573OooO;
                }
                OooOOOo();
                OooOOO oooOOO = this.f4625OooooOO;
                if (oooOOO != null) {
                    if (this.f4627Oooooo) {
                        post(new OooO00o());
                        return;
                    } else {
                        oooOOO.OooO00o();
                        return;
                    }
                }
                androidx.constraintlayout.motion.widget.OooO00o oooO00o3 = this.f4574OooO0Oo;
                if (oooO00o3 == null || (oooO0O0 = oooO00o3.f4676OooO0OO) == null || oooO0O0.f4705OooOOO != 4) {
                    return;
                }
                OooOo0();
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
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o != null && (i = this.f4573OooO) != -1) {
            androidx.constraintlayout.widget.OooO0O0 OooO0O1 = oooO00o.OooO0O0(i);
            this.f4574OooO0Oo.OooOOO(this);
            ArrayList<MotionHelper> arrayList = this.f4610Oooo0oO;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
            if (OooO0O1 != null) {
                OooO0O1.OooO0O0(this);
            }
            this.f4578OooO0oo = this.f4573OooO;
        }
        OooOOOo();
        OooOOO oooOOO = this.f4625OooooOO;
        if (oooOOO != null) {
            if (this.f4627Oooooo) {
                post(new OooO0OO());
                return;
            } else {
                oooOOO.OooO00o();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f4574OooO0Oo;
        if (oooO00o2 == null || (oooO0O0 = oooO00o2.f4676OooO0OO) == null || oooO0O0.f4705OooOOO != 4) {
            return;
        }
        OooOo0();
        setState(OooOo00.SETUP);
        setState(OooOo00.MOVING);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        int i;
        RectF rectFOooO0O0;
        MotionLayout motionLayout;
        int currentState;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null || !this.f4583OooOOO0) {
            return false;
        }
        androidx.constraintlayout.motion.widget.OooO0o oooO0o = oooO00o.f4690OooOOo0;
        if (oooO0o != null && (currentState = (motionLayout = oooO0o.f4780OooO00o).getCurrentState()) != -1) {
            HashSet<View> hashSet = oooO0o.f4782OooO0OO;
            ArrayList<androidx.constraintlayout.motion.widget.OooO0OO> arrayList = oooO0o.f4781OooO0O0;
            if (hashSet == null) {
                oooO0o.f4782OooO0OO = new HashSet<>();
                for (androidx.constraintlayout.motion.widget.OooO0OO oooO0OO : arrayList) {
                    int childCount = motionLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = motionLayout.getChildAt(i2);
                        if (oooO0OO.OooO0OO(childAt)) {
                            childAt.getId();
                            oooO0o.f4782OooO0OO.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<androidx.constraintlayout.motion.widget.OooO0OO.OooO00o> arrayList2 = oooO0o.f4785OooO0o0;
            int i3 = 2;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (androidx.constraintlayout.motion.widget.OooO0OO.OooO00o oooO00o2 : oooO0o.f4785OooO0o0) {
                    if (action != 1) {
                        if (action != 2) {
                            oooO00o2.getClass();
                        } else {
                            View view = oooO00o2.f4770OooO0OO.f33862OooO0O0;
                            Rect rect2 = oooO00o2.f4778OooOO0o;
                            view.getHitRect(rect2);
                            if (!rect2.contains((int) x, (int) y) && !oooO00o2.f4775OooO0oo) {
                                oooO00o2.OooO0O0();
                            }
                        }
                    } else if (!oooO00o2.f4775OooO0oo) {
                        oooO00o2.OooO0O0();
                    }
                }
            }
            if (action == 0 || action == 1) {
                androidx.constraintlayout.motion.widget.OooO00o oooO00o3 = motionLayout.f4574OooO0Oo;
                androidx.constraintlayout.widget.OooO0O0 OooO0O1 = oooO00o3 == null ? null : oooO00o3.OooO0O0(currentState);
                Iterator<androidx.constraintlayout.motion.widget.OooO0OO> it = arrayList.iterator();
                while (it.hasNext()) {
                    androidx.constraintlayout.motion.widget.OooO0OO next = it.next();
                    int i4 = next.f4748OooO0O0;
                    if (i4 != 1 ? !(i4 != i3 ? !(i4 == 3 && action == 0) : action != 1) : action == 0) {
                        for (View view2 : oooO0o.f4782OooO0OO) {
                            if (next.OooO0OO(view2)) {
                                view2.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    next.OooO00o(oooO0o, oooO0o.f4780OooO00o, currentState, OooO0O1, view2);
                                }
                                next = next;
                                i3 = i3;
                            }
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = this.f4574OooO0Oo.f4676OooO0OO;
        if (oooO0O1 == null || !(!oooO0O1.f4707OooOOOO) || (oooO0O0 = oooO0O1.f4704OooOO0o) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (rectFOooO0O0 = oooO0O0.OooO0O0(this, new RectF())) != null && !rectFOooO0O0.contains(motionEvent.getX(), motionEvent.getY())) || (i = oooO0O0.f4722OooO0o0) == -1) {
            return false;
        }
        View view3 = this.f4632o00O0O;
        if (view3 == null || view3.getId() != i) {
            this.f4632o00O0O = findViewById(i);
        }
        View view4 = this.f4632o00O0O;
        if (view4 == null) {
            return false;
        }
        RectF rectF = this.f4636ooOO;
        rectF.set(view4.getLeft(), this.f4632o00O0O.getTop(), this.f4632o00O0O.getRight(), this.f4632o00O0O.getBottom());
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || OooOOO(this.f4632o00O0O.getLeft(), this.f4632o00O0O.getTop(), motionEvent, this.f4632o00O0O)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f4624OooooO0 = true;
        try {
            if (this.f4574OooO0Oo == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f4599OooOooO != i5 || this.f4600OooOooo != i6) {
                OooOOo();
                OooO(true);
            }
            this.f4599OooOooO = i5;
            this.f4600OooOooo = i6;
        } finally {
            this.f4624OooooO0 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f4574OooO0Oo == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f4580OooOO0O == i && this.f4581OooOO0o == i2) ? false : true;
        if (this.f4635o0OoOo0) {
            this.f4635o0OoOo0 = false;
            OooOOOo();
            OooOOo0();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.f4580OooOO0O = i;
        this.f4581OooOO0o = i2;
        int iOooO0oo = this.f4574OooO0Oo.OooO0oo();
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 = this.f4574OooO0Oo.f4676OooO0OO;
        int i3 = oooO0O0 == null ? -1 : oooO0O0.f4696OooO0OO;
        OooOO0O oooOO0O = this.f4630Ooooooo;
        if (!z3) {
            if (!((iOooO0oo == oooOO0O.f4664OooO0o0 && i3 == oooOO0O.f4663OooO0o) ? false : true)) {
                if (z3) {
                    super.onMeasure(i, i2);
                }
                z = true;
            } else if (this.f4578OooO0oo != -1) {
                super.onMeasure(i, i2);
                oooOO0O.OooO0o0(this.f4574OooO0Oo.OooO0O0(iOooO0oo), this.f4574OooO0Oo.OooO0O0(i3));
                oooOO0O.OooO0o();
                oooOO0O.f4664OooO0o0 = iOooO0oo;
                oooOO0O.f4663OooO0o = i3;
                z = false;
            } else {
                if (z3) {
                    super.onMeasure(i, i2);
                }
                z = true;
            }
        } else if (this.f4578OooO0oo != -1) {
            super.onMeasure(i, i2);
            oooOO0O.OooO0o0(this.f4574OooO0Oo.OooO0O0(iOooO0oo), this.f4574OooO0Oo.OooO0O0(i3));
            oooOO0O.OooO0o();
            oooOO0O.f4664OooO0o0 = iOooO0oo;
            oooOO0O.f4663OooO0o = i3;
            z = false;
        } else {
            if (z3) {
                super.onMeasure(i, i2);
            }
            z = true;
        }
        if (this.f4616OoooOO0 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int iOooOo0O = this.mLayoutWidget.OooOo0O() + getPaddingRight() + getPaddingLeft();
            int iOooOOOo = this.mLayoutWidget.OooOOOo() + paddingBottom;
            int i4 = this.f4620OoooOoO;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                int i5 = this.f4631o000oOoO;
                iOooOo0O = (int) ((this.f4622Ooooo00 * (this.f4618OoooOOo - i5)) + i5);
                requestLayout();
            }
            int i6 = this.f4621OoooOoo;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                int i7 = this.f4617OoooOOO;
                iOooOOOo = (int) ((this.f4622Ooooo00 * (this.f4619OoooOo0 - i7)) + i7);
                requestLayout();
            }
            setMeasuredDimension(iOooOo0O, iOooOOOo);
        }
        float fSignum = Math.signum(this.f4591OooOo00 - this.f4586OooOOo);
        long nanoTime = getNanoTime();
        o000oOoO o000oooo2 = this.f4576OooO0o0;
        float interpolation = this.f4586OooOOo + (!(o000oooo2 instanceof o000000.OooO0O0) ? (((nanoTime - this.f4588OooOOoo) * fSignum) * 1.0E-9f) / this.f4585OooOOOo : 0.0f);
        if (this.f4590OooOo0) {
            interpolation = this.f4591OooOo00;
        }
        if ((fSignum <= 0.0f || interpolation < this.f4591OooOo00) && (fSignum > 0.0f || interpolation > this.f4591OooOo00)) {
            z2 = false;
        } else {
            interpolation = this.f4591OooOo00;
        }
        if (o000oooo2 != null && !z2) {
            interpolation = this.f4594OooOoO ? o000oooo2.getInterpolation((nanoTime - this.f4584OooOOOO) * 1.0E-9f) : o000oooo2.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.f4591OooOo00) || (fSignum <= 0.0f && interpolation <= this.f4591OooOo00)) {
            interpolation = this.f4591OooOo00;
        }
        this.f4622Ooooo00 = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.f4575OooO0o;
        if (interpolator != null) {
            interpolation = interpolator.getInterpolation(interpolation);
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            Oooo0 oooo0 = this.f4582OooOOO.get(childAt);
            if (oooo0 != null) {
                oooo0.OooO0o0(interpolation, nanoTime2, childAt, this.f4623Ooooo0o);
            }
        }
        if (this.f4616OoooOO0) {
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

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        boolean z;
        ?? r1;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        float f;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O2;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O3;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O4;
        int i4;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null || (oooO0O0 = oooO00o.f4676OooO0OO) == null || !((z = !oooO0O0.f4707OooOOOO))) {
            return;
        }
        int i5 = -1;
        if (!z || (oooO0O4 = oooO0O0.f4704OooOO0o) == null || (i4 = oooO0O4.f4722OooO0o0) == -1 || view.getId() == i4) {
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O5 = oooO00o.f4676OooO0OO;
            if ((oooO0O5 == null || (oooO0O3 = oooO0O5.f4704OooOO0o) == null) ? false : oooO0O3.f4736OooOo0) {
                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O6 = oooO0O0.f4704OooOO0o;
                if (oooO0O6 != null && (oooO0O6.f4739OooOo0o & 4) != 0) {
                    i5 = i2;
                }
                float f2 = this.f4587OooOOo0;
                if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O7 = oooO0O0.f4704OooOO0o;
            if (oooO0O7 != null && (oooO0O7.f4739OooOo0o & 1) != 0) {
                float f3 = i;
                float f4 = i2;
                androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O8 = oooO00o.f4676OooO0OO;
                if (oooO0O8 == null || (oooO0O2 = oooO0O8.f4704OooOO0o) == null) {
                    f = 0.0f;
                } else {
                    oooO0O2.f4732OooOOo.OooOO0o(oooO0O2.f4720OooO0Oo, oooO0O2.f4732OooOOo.getProgress(), oooO0O2.f4724OooO0oo, oooO0O2.f4723OooO0oO, oooO0O2.f4728OooOOO);
                    float f5 = oooO0O2.f4726OooOO0O;
                    float[] fArr = oooO0O2.f4728OooOOO;
                    if (f5 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f = (f3 * f5) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f = (f4 * oooO0O2.f4727OooOO0o) / fArr[1];
                    }
                }
                float f6 = this.f4586OooOOo;
                if ((f6 <= 0.0f && f < 0.0f) || (f6 >= 1.0f && f > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new OooO0O0(view));
                    return;
                }
            }
            float f7 = this.f4587OooOOo0;
            long nanoTime = getNanoTime();
            float f8 = i;
            this.f4604Oooo00O = f8;
            float f9 = i2;
            this.f4605Oooo00o = f9;
            this.f4606Oooo0O0 = (float) ((nanoTime - this.f4602Oooo0) * 1.0E-9d);
            this.f4602Oooo0 = nanoTime;
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O9 = oooO00o.f4676OooO0OO;
            if (oooO0O9 != null && (oooO0O1 = oooO0O9.f4704OooOO0o) != null) {
                MotionLayout motionLayout = oooO0O1.f4732OooOOo;
                float progress = motionLayout.getProgress();
                if (!oooO0O1.f4729OooOOO0) {
                    oooO0O1.f4729OooOOO0 = true;
                    motionLayout.setProgress(progress);
                }
                oooO0O1.f4732OooOOo.OooOO0o(oooO0O1.f4720OooO0Oo, progress, oooO0O1.f4724OooO0oo, oooO0O1.f4723OooO0oO, oooO0O1.f4728OooOOO);
                float f10 = oooO0O1.f4726OooOO0O;
                float[] fArr2 = oooO0O1.f4728OooOOO;
                if (Math.abs((oooO0O1.f4727OooOO0o * fArr2[1]) + (f10 * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = oooO0O1.f4726OooOO0O;
                float fMax = Math.max(Math.min(progress + (f11 != 0.0f ? (f8 * f11) / fArr2[0] : (f9 * oooO0O1.f4727OooOO0o) / fArr2[1]), 1.0f), 0.0f);
                if (fMax != motionLayout.getProgress()) {
                    motionLayout.setProgress(fMax);
                }
            }
            if (f7 != this.f4587OooOOo0) {
                iArr[0] = i;
                r1 = 1;
                iArr[1] = i2;
            } else {
                r1 = 1;
            }
            OooO(false);
            if (iArr[0] == 0 && iArr[r1] == 0) {
                return;
            }
            this.f4603Oooo000 = r1;
        }
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.f4602Oooo0 = getNanoTime();
        this.f4606Oooo0O0 = 0.0f;
        this.f4604Oooo00O = 0.0f;
        this.f4605Oooo00o = 0.0f;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o != null) {
            boolean zIsRtl = isRtl();
            oooO00o.f4688OooOOOo = zIsRtl;
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = oooO00o.f4676OooO0OO;
            if (oooO0O1 == null || (oooO0O0 = oooO0O1.f4704OooOO0o) == null) {
                return;
            }
            oooO0O0.OooO0OO(zIsRtl);
        }
    }

    @Override // androidx.core.view.oo0o0Oo
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        return (oooO00o == null || (oooO0O0 = oooO00o.f4676OooO0OO) == null || (oooO0O1 = oooO0O0.f4704OooOO0o) == null || (oooO0O1.f4739OooOo0o & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.oo0o0Oo
    public final void onStopNestedScroll(@NonNull View view, int i) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o != null) {
            float f = this.f4606Oooo0O0;
            if (f == 0.0f) {
                return;
            }
            float f2 = this.f4604Oooo00O / f;
            float f3 = this.f4605Oooo00o / f;
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = oooO00o.f4676OooO0OO;
            if (oooO0O1 == null || (oooO0O0 = oooO0O1.f4704OooOO0o) == null) {
                return;
            }
            oooO0O0.f4729OooOOO0 = false;
            MotionLayout motionLayout = oooO0O0.f4732OooOOo;
            float progress = motionLayout.getProgress();
            oooO0O0.f4732OooOOo.OooOO0o(oooO0O0.f4720OooO0Oo, progress, oooO0O0.f4724OooO0oo, oooO0O0.f4723OooO0oO, oooO0O0.f4728OooOOO);
            float f4 = oooO0O0.f4726OooOO0O;
            float[] fArr = oooO0O0.f4728OooOOO;
            float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * oooO0O0.f4727OooOO0o) / fArr[1];
            if (!Float.isNaN(f5)) {
                progress += f5 / 3.0f;
            }
            if (progress != 0.0f) {
                boolean z = progress != 1.0f;
                int i2 = oooO0O0.f4719OooO0OO;
                if ((i2 != 3) && z) {
                    motionLayout.OooOo00(((double) progress) >= 0.5d ? 1.0f : 0.0f, f5, i2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x023a  */
    /* JADX WARN: Code duplicated, block: B:114:0x023e  */
    /* JADX WARN: Code duplicated, block: B:200:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:201:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:204:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:205:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:233:0x055c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0561  */
    /* JADX WARN: Code duplicated, block: B:237:0x0567  */
    /* JADX WARN: Code duplicated, block: B:240:0x057e  */
    /* JADX WARN: Code duplicated, block: B:362:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:371:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x0108 A[PHI: r20
      0x0108: PHI (r20v5 java.util.Iterator) = (r20v6 java.util.Iterator), (r20v7 java.util.Iterator) binds: [B:69:0x0106, B:63:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0;
        boolean z;
        MotionLayout motionLayout;
        OooOOO0 oooOOO0;
        OooOOO0 oooOOO1;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        char c;
        char c2;
        int i;
        char c3;
        char c4;
        char c5;
        float right;
        float f;
        int top;
        int bottom;
        int i2;
        float degrees;
        float f2;
        int i3;
        char c6;
        MotionEvent motionEvent2;
        RectF rectF;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O2;
        int iOooO00o;
        Iterator it;
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O3;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null || !this.f4583OooOOO0 || !oooO00o.OooOOOo()) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f4574OooO0Oo;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O4 = oooO00o2.f4676OooO0OO;
        if (oooO0O4 != null && !(!oooO0O4.f4707OooOOOO)) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        RectF rectF2 = new RectF();
        OooOOO0 oooOOO2 = oooO00o2.f4687OooOOOO;
        MotionLayout motionLayout2 = oooO00o2.f4674OooO00o;
        if (oooOOO2 == null) {
            motionLayout2.getClass();
            OooOOO0 oooOOO3 = OooOOO0.f4671OooO0O0;
            oooOOO3.f4672OooO00o = VelocityTracker.obtain();
            oooO00o2.f4687OooOOOO = oooOOO3;
        }
        VelocityTracker velocityTracker = oooO00o2.f4687OooOOOO.f4672OooO00o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                oooO00o2.f4689OooOOo = motionEvent.getRawX();
                oooO00o2.f4691OooOOoo = motionEvent.getRawY();
                oooO00o2.f4684OooOO0o = motionEvent;
                oooO00o2.f4686OooOOO0 = false;
                androidx.constraintlayout.motion.widget.OooO0O0 oooO0O5 = oooO00o2.f4676OooO0OO.f4704OooOO0o;
                if (oooO0O5 != null) {
                    RectF rectFOooO00o = oooO0O5.OooO00o(motionLayout2, rectF2);
                    if (rectFOooO00o == null || rectFOooO00o.contains(oooO00o2.f4684OooOO0o.getX(), oooO00o2.f4684OooOO0o.getY())) {
                        RectF rectFOooO0O0 = oooO00o2.f4676OooO0OO.f4704OooOO0o.OooO0O0(motionLayout2, rectF2);
                        if (rectFOooO0O0 == null || rectFOooO0O0.contains(oooO00o2.f4684OooOO0o.getX(), oooO00o2.f4684OooOO0o.getY())) {
                            oooO00o2.f4685OooOOO = false;
                        } else {
                            oooO00o2.f4685OooOOO = true;
                        }
                        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O6 = oooO00o2.f4676OooO0OO.f4704OooOO0o;
                        float f3 = oooO00o2.f4689OooOOo;
                        float f4 = oooO00o2.f4691OooOOoo;
                        oooO0O6.f4731OooOOOo = f3;
                        oooO0O6.f4733OooOOo0 = f4;
                    } else {
                        oooO00o2.f4684OooOO0o = null;
                        oooO00o2.f4686OooOOO0 = true;
                    }
                }
            } else if (action == 2 && !oooO00o2.f4686OooOOO0) {
                float rawY = motionEvent.getRawY() - oooO00o2.f4691OooOOoo;
                float rawX = motionEvent.getRawX() - oooO00o2.f4689OooOOo;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = oooO00o2.f4684OooOO0o) != null) {
                    if (currentState != -1) {
                        androidx.constraintlayout.widget.OooOO0O oooOO0O = oooO00o2.f4675OooO0O0;
                        if (oooOO0O == null || (iOooO00o = oooOO0O.OooO00o(currentState)) == -1) {
                            iOooO00o = currentState;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O7 : oooO00o2.f4677OooO0Oo) {
                            if (oooO0O7.f4697OooO0Oo == iOooO00o || oooO0O7.f4696OooO0OO == iOooO00o) {
                                arrayList.add(oooO0O7);
                            }
                        }
                        RectF rectF3 = new RectF();
                        Iterator it2 = arrayList.iterator();
                        float f5 = 0.0f;
                        oooO0O2 = null;
                        while (it2.hasNext()) {
                            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O8 = (androidx.constraintlayout.motion.widget.OooO00o.OooO0O0) it2.next();
                            if (oooO0O8.f4707OooOOOO || (oooO0O3 = oooO0O8.f4704OooOO0o) == null) {
                                rectF3 = rectF3;
                                it = it2;
                                oooO0O2 = oooO0O2;
                                rawY = rawY;
                                rawX = rawX;
                                motionEvent2 = motionEvent2;
                                rectF2 = rectF2;
                            } else {
                                oooO0O3.OooO0OO(oooO00o2.f4688OooOOOo);
                                RectF rectFOooO0O1 = oooO0O8.f4704OooOO0o.OooO0O0(motionLayout2, rectF3);
                                if (rectFOooO0O1 != null) {
                                    it = it2;
                                    if (!rectFOooO0O1.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                        rectF3 = rectF3;
                                        rectF2 = rectF2;
                                        oooO0O2 = oooO0O2;
                                        rawY = rawY;
                                        rawX = rawX;
                                        motionEvent2 = motionEvent2;
                                    }
                                    rectF2 = rectF2;
                                    rawX = rawX;
                                    it2 = it;
                                    rectF3 = rectF3;
                                    rawY = rawY;
                                    motionEvent2 = motionEvent2;
                                } else {
                                    it = it2;
                                }
                                RectF rectFOooO00o2 = oooO0O8.f4704OooOO0o.OooO00o(motionLayout2, rectF3);
                                if (rectFOooO00o2 == null || rectFOooO00o2.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                    androidx.constraintlayout.motion.widget.OooO0O0 oooO0O9 = oooO0O8.f4704OooOO0o;
                                    float fAtan2 = (oooO0O9.f4727OooOO0o * rawY) + (oooO0O9.f4726OooOO0O * rawX);
                                    if (oooO0O9.f4725OooOO0) {
                                        float x = motionEvent2.getX();
                                        oooO0O8.f4704OooOO0o.getClass();
                                        float f6 = x - 0.5f;
                                        float y = motionEvent2.getY();
                                        oooO0O8.f4704OooOO0o.getClass();
                                        float f7 = y - 0.5f;
                                        fAtan2 = ((float) (Math.atan2(rawY + f7, rawX + f6) - Math.atan2(f6, f7))) * 10.0f;
                                    }
                                    float f8 = (oooO0O8.f4696OooO0OO == currentState ? -1.0f : 1.1f) * fAtan2;
                                    if (f8 > f5) {
                                        f5 = f8;
                                        oooO0O2 = oooO0O8;
                                    }
                                    rectF2 = rectF2;
                                    rawX = rawX;
                                    it2 = it;
                                    rectF3 = rectF3;
                                    rawY = rawY;
                                    motionEvent2 = motionEvent2;
                                } else {
                                    rectF3 = rectF3;
                                    rectF2 = rectF2;
                                    oooO0O2 = oooO0O2;
                                    rawY = rawY;
                                    rawX = rawX;
                                    motionEvent2 = motionEvent2;
                                }
                            }
                            oooO0O2 = oooO0O2;
                            rectF2 = rectF2;
                            rawX = rawX;
                            it2 = it;
                            rectF3 = rectF3;
                            rawY = rawY;
                            motionEvent2 = motionEvent2;
                        }
                        rectF = rectF2;
                    } else {
                        rectF = rectF2;
                        oooO0O2 = oooO00o2.f4676OooO0OO;
                    }
                    if (oooO0O2 != null) {
                        setTransition(oooO0O2);
                        RectF rectFOooO0O2 = oooO00o2.f4676OooO0OO.f4704OooOO0o.OooO0O0(motionLayout2, rectF);
                        oooO00o2.f4685OooOOO = (rectFOooO0O2 == null || rectFOooO0O2.contains(oooO00o2.f4684OooOO0o.getX(), oooO00o2.f4684OooOO0o.getY())) ? false : true;
                        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O10 = oooO00o2.f4676OooO0OO.f4704OooOO0o;
                        float f9 = oooO00o2.f4689OooOOo;
                        float f10 = oooO00o2.f4691OooOOoo;
                        oooO0O10.f4731OooOOOo = f9;
                        oooO0O10.f4733OooOOo0 = f10;
                        oooO0O10.f4729OooOOO0 = false;
                    }
                    if (oooO00o2.f4686OooOOO0) {
                        oooO0O0 = oooO00o2.f4676OooO0OO;
                        if (oooO0O0 != null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        oooO00o2.f4689OooOOo = motionEvent.getRawX();
                        oooO00o2.f4691OooOOoo = motionEvent.getRawY();
                        if (motionEvent.getAction() == 1) {
                            motionLayout = this;
                        } else {
                            motionLayout = this;
                        }
                    }
                }
            } else if (oooO00o2.f4686OooOOO0) {
                oooO0O0 = oooO00o2.f4676OooO0OO;
                if (oooO0O0 != null) {
                    z = false;
                } else {
                    z = false;
                }
                oooO00o2.f4689OooOOo = motionEvent.getRawX();
                oooO00o2.f4691OooOOoo = motionEvent.getRawY();
                if (motionEvent.getAction() == 1) {
                    motionLayout = this;
                } else {
                    motionLayout = this;
                }
            }
            motionLayout = this;
            z = false;
        } else if (oooO00o2.f4686OooOOO0) {
            motionLayout = this;
            z = false;
        } else {
            oooO0O0 = oooO00o2.f4676OooO0OO;
            if (oooO0O0 != null || (oooO0O1 = oooO0O0.f4704OooOO0o) == null || oooO00o2.f4685OooOOO) {
                z = false;
            } else {
                OooOOO0 oooOOO4 = oooO00o2.f4687OooOOOO;
                boolean z2 = oooO0O1.f4725OooOO0;
                float[] fArr = oooO0O1.f4728OooOOO;
                MotionLayout motionLayout3 = oooO0O1.f4732OooOOo;
                if (z2) {
                    VelocityTracker velocityTracker2 = oooOOO4.f4672OooO00o;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 != 0) {
                        int[] iArr = oooO0O1.f4730OooOOOO;
                        if (action2 == 1) {
                            oooO0O1.f4729OooOOO0 = false;
                            VelocityTracker velocityTracker3 = oooOOO4.f4672OooO00o;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker4 = oooOOO4.f4672OooO00o;
                            float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker5 = oooOOO4.f4672OooO00o;
                            float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f;
                            float progress = motionLayout3.getProgress();
                            float width = motionLayout3.getWidth() / 2.0f;
                            float height = motionLayout3.getHeight() / 2.0f;
                            int i4 = oooO0O1.f4716OooO;
                            if (i4 != -1) {
                                View viewFindViewById = motionLayout3.findViewById(i4);
                                motionLayout3.getLocationOnScreen(iArr);
                                right = ((viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f) + iArr[0];
                                f = iArr[1];
                                top = viewFindViewById.getTop();
                                bottom = viewFindViewById.getBottom();
                            } else {
                                int i5 = oooO0O1.f4720OooO0Oo;
                                if (i5 != -1) {
                                    View viewFindViewById2 = motionLayout3.findViewById(motionLayout3.f4582OooOOO.get(motionLayout3.findViewById(i5)).f33865OooO0o.f33906OooOOO);
                                    motionLayout3.getLocationOnScreen(iArr);
                                    right = ((viewFindViewById2.getRight() + viewFindViewById2.getLeft()) / 2.0f) + iArr[0];
                                    f = iArr[1];
                                    top = viewFindViewById2.getTop();
                                    bottom = viewFindViewById2.getBottom();
                                } else {
                                    float rawX2 = motionEvent.getRawX() - width;
                                    float rawY2 = motionEvent.getRawY() - height;
                                    double degrees2 = Math.toDegrees(Math.atan2(rawY2, rawX2));
                                    i2 = oooO0O1.f4720OooO0Oo;
                                    if (i2 != -1) {
                                        oooO0O1.f4732OooOOo.OooOO0o(i2, progress, oooO0O1.f4724OooO0oo, oooO0O1.f4723OooO0oO, oooO0O1.f4728OooOOO);
                                        fArr[1] = (float) Math.toDegrees(fArr[1]);
                                    } else {
                                        fArr[1] = 360.0f;
                                    }
                                    degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity + rawY2, xVelocity + rawX2)) - degrees2)) * 62.5f;
                                    if (Float.isNaN(degrees)) {
                                        f2 = progress;
                                    } else {
                                        f2 = (((degrees * 3.0f) * oooO0O1.f4738OooOo0O) / fArr[1]) + progress;
                                    }
                                    if (f2 == 0.0f && f2 != 1.0f && (i3 = oooO0O1.f4719OooO0OO) != 3) {
                                        float fAbs = (degrees * oooO0O1.f4738OooOo0O) / fArr[1];
                                        float f11 = ((double) f2) < 0.5d ? 0.0f : 1.0f;
                                        if (i3 == 6) {
                                            if (progress + fAbs < 0.0f) {
                                                fAbs = Math.abs(fAbs);
                                            }
                                            f11 = 1.0f;
                                        }
                                        if (oooO0O1.f4719OooO0OO == 7) {
                                            if (progress + fAbs > 1.0f) {
                                                fAbs = -Math.abs(fAbs);
                                            }
                                            f11 = 0.0f;
                                        }
                                        motionLayout3.OooOo00(f11, fAbs * 3.0f, oooO0O1.f4719OooO0OO);
                                        if (0.0f >= progress || 1.0f <= progress) {
                                            motionLayout3.setState(OooOo00.FINISHED);
                                        }
                                    } else if (0.0f < f2 || 1.0f <= f2) {
                                        motionLayout3.setState(OooOo00.FINISHED);
                                    }
                                }
                            }
                            height = ((bottom + top) / 2.0f) + f;
                            width = right;
                            float rawX3 = motionEvent.getRawX() - width;
                            float rawY3 = motionEvent.getRawY() - height;
                            double degrees3 = Math.toDegrees(Math.atan2(rawY3, rawX3));
                            i2 = oooO0O1.f4720OooO0Oo;
                            if (i2 != -1) {
                                oooO0O1.f4732OooOOo.OooOO0o(i2, progress, oooO0O1.f4724OooO0oo, oooO0O1.f4723OooO0oO, oooO0O1.f4728OooOOO);
                                fArr[1] = (float) Math.toDegrees(fArr[1]);
                            } else {
                                fArr[1] = 360.0f;
                            }
                            degrees = ((float) (Math.toDegrees(Math.atan2(yVelocity + rawY3, xVelocity + rawX3)) - degrees3)) * 62.5f;
                            if (Float.isNaN(degrees)) {
                                f2 = (((degrees * 3.0f) * oooO0O1.f4738OooOo0O) / fArr[1]) + progress;
                            } else {
                                f2 = progress;
                            }
                            if (f2 == 0.0f) {
                                if (0.0f < f2) {
                                    motionLayout3.setState(OooOo00.FINISHED);
                                } else {
                                    motionLayout3.setState(OooOo00.FINISHED);
                                }
                            } else if (0.0f < f2) {
                                motionLayout3.setState(OooOo00.FINISHED);
                            } else {
                                motionLayout3.setState(OooOo00.FINISHED);
                            }
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            float width2 = motionLayout3.getWidth() / 2.0f;
                            float height2 = motionLayout3.getHeight() / 2.0f;
                            int i6 = oooO0O1.f4716OooO;
                            if (i6 != -1) {
                                View viewFindViewById3 = motionLayout3.findViewById(i6);
                                motionLayout3.getLocationOnScreen(iArr);
                                float right2 = iArr[0] + ((viewFindViewById3.getRight() + viewFindViewById3.getLeft()) / 2.0f);
                                height2 = ((viewFindViewById3.getBottom() + viewFindViewById3.getTop()) / 2.0f) + iArr[1];
                                width2 = right2;
                            } else {
                                int i7 = oooO0O1.f4720OooO0Oo;
                                if (i7 != -1) {
                                    View viewFindViewById4 = motionLayout3.findViewById(motionLayout3.f4582OooOOO.get(motionLayout3.findViewById(i7)).f33865OooO0o.f33906OooOOO);
                                    if (viewFindViewById4 == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout3.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((viewFindViewById4.getRight() + viewFindViewById4.getLeft()) / 2.0f);
                                        height2 = ((viewFindViewById4.getBottom() + viewFindViewById4.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                            }
                            float rawX4 = motionEvent.getRawX() - width2;
                            float rawY4 = motionEvent.getRawY() - height2;
                            double dAtan2 = Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2);
                            float fAtan3 = (float) (((dAtan2 - Math.atan2(oooO0O1.f4733OooOOo0 - height2, oooO0O1.f4731OooOOOo - width2)) * 180.0d) / 3.141592653589793d);
                            if (fAtan3 > 330.0f) {
                                fAtan3 -= 360.0f;
                            } else if (fAtan3 < -330.0f) {
                                fAtan3 += 360.0f;
                            }
                            if (Math.abs(fAtan3) > 0.01d || oooO0O1.f4729OooOOO0) {
                                float progress2 = motionLayout3.getProgress();
                                if (!oooO0O1.f4729OooOOO0) {
                                    oooO0O1.f4729OooOOO0 = true;
                                    motionLayout3.setProgress(progress2);
                                }
                                int i8 = oooO0O1.f4720OooO0Oo;
                                if (i8 != -1) {
                                    oooO0O1.f4732OooOOo.OooOO0o(i8, progress2, oooO0O1.f4724OooO0oo, oooO0O1.f4723OooO0oO, oooO0O1.f4728OooOOO);
                                    c6 = 1;
                                    fArr[1] = (float) Math.toDegrees(fArr[1]);
                                } else {
                                    c6 = 1;
                                    fArr[1] = 360.0f;
                                }
                                float fMax = Math.max(Math.min(((fAtan3 * oooO0O1.f4738OooOo0O) / fArr[c6]) + progress2, 1.0f), 0.0f);
                                float progress3 = motionLayout3.getProgress();
                                if (fMax != progress3) {
                                    if (progress3 == 0.0f || progress3 == 1.0f) {
                                        motionLayout3.OooO0oo(progress3 == 0.0f);
                                    }
                                    motionLayout3.setProgress(fMax);
                                    VelocityTracker velocityTracker6 = oooOOO4.f4672OooO00o;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(1000);
                                    }
                                    VelocityTracker velocityTracker7 = oooOOO4.f4672OooO00o;
                                    float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker8 = oooOOO4.f4672OooO00o;
                                    double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : 0.0f;
                                    double d = xVelocity2;
                                    motionLayout3.f4577OooO0oO = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d) - dAtan2) * Math.hypot(yVelocity2, d)) / Math.hypot(rawX4, rawY4)));
                                } else {
                                    motionLayout3.f4577OooO0oO = 0.0f;
                                }
                                oooO0O1.f4731OooOOOo = motionEvent.getRawX();
                                oooO0O1.f4733OooOOo0 = motionEvent.getRawY();
                            }
                        }
                    } else {
                        oooO0O1.f4731OooOOOo = motionEvent.getRawX();
                        oooO0O1.f4733OooOOo0 = motionEvent.getRawY();
                        oooO0O1.f4729OooOOO0 = false;
                    }
                } else {
                    VelocityTracker velocityTracker9 = oooOOO4.f4672OooO00o;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    int action3 = motionEvent.getAction();
                    if (action3 == 0) {
                        oooO0O1.f4731OooOOOo = motionEvent.getRawX();
                        oooO0O1.f4733OooOOo0 = motionEvent.getRawY();
                        z = false;
                        oooO0O1.f4729OooOOO0 = false;
                    } else if (action3 == 1) {
                        oooO0O1.f4729OooOOO0 = false;
                        VelocityTracker velocityTracker10 = oooOOO4.f4672OooO00o;
                        if (velocityTracker10 != null) {
                            velocityTracker10.computeCurrentVelocity(1000);
                        }
                        VelocityTracker velocityTracker11 = oooOOO4.f4672OooO00o;
                        float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : 0.0f;
                        VelocityTracker velocityTracker12 = oooOOO4.f4672OooO00o;
                        float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : 0.0f;
                        float progress4 = motionLayout3.getProgress();
                        int i9 = oooO0O1.f4720OooO0Oo;
                        if (i9 != -1) {
                            oooO0O1.f4732OooOOo.OooOO0o(i9, progress4, oooO0O1.f4724OooO0oo, oooO0O1.f4723OooO0oO, oooO0O1.f4728OooOOO);
                            c2 = 0;
                            c = 1;
                        } else {
                            float fMin = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                            c = 1;
                            fArr[1] = oooO0O1.f4727OooOO0o * fMin;
                            c2 = 0;
                            fArr[0] = fMin * oooO0O1.f4726OooOO0O;
                        }
                        float fAbs2 = oooO0O1.f4726OooOO0O != 0.0f ? xVelocity3 / fArr[c2] : yVelocity3 / fArr[c];
                        float f12 = !Float.isNaN(fAbs2) ? (fAbs2 / 3.0f) + progress4 : progress4;
                        if (f12 != 0.0f && f12 != 1.0f && (i = oooO0O1.f4719OooO0OO) != 3) {
                            float f13 = ((double) f12) < 0.5d ? 0.0f : 1.0f;
                            if (i == 6) {
                                if (progress4 + fAbs2 < 0.0f) {
                                    fAbs2 = Math.abs(fAbs2);
                                }
                                f13 = 1.0f;
                            }
                            if (oooO0O1.f4719OooO0OO == 7) {
                                if (progress4 + fAbs2 > 1.0f) {
                                    fAbs2 = -Math.abs(fAbs2);
                                }
                                f13 = 0.0f;
                            }
                            motionLayout3.OooOo00(f13, fAbs2, oooO0O1.f4719OooO0OO);
                            if (0.0f >= progress4 || 1.0f <= progress4) {
                                motionLayout3.setState(OooOo00.FINISHED);
                            }
                        } else if (0.0f >= f12 || 1.0f <= f12) {
                            motionLayout3.setState(OooOo00.FINISHED);
                        }
                    } else if (action3 == 2) {
                        float rawY5 = motionEvent.getRawY() - oooO0O1.f4733OooOOo0;
                        float rawX5 = motionEvent.getRawX() - oooO0O1.f4731OooOOOo;
                        if (Math.abs((oooO0O1.f4727OooOO0o * rawY5) + (oooO0O1.f4726OooOO0O * rawX5)) > oooO0O1.f4735OooOo || oooO0O1.f4729OooOOO0) {
                            float progress5 = motionLayout3.getProgress();
                            if (!oooO0O1.f4729OooOOO0) {
                                oooO0O1.f4729OooOOO0 = true;
                                motionLayout3.setProgress(progress5);
                            }
                            int i10 = oooO0O1.f4720OooO0Oo;
                            if (i10 != -1) {
                                oooO0O1.f4732OooOOo.OooOO0o(i10, progress5, oooO0O1.f4724OooO0oo, oooO0O1.f4723OooO0oO, oooO0O1.f4728OooOOO);
                                c4 = 0;
                                c3 = 1;
                            } else {
                                float fMin2 = Math.min(motionLayout3.getWidth(), motionLayout3.getHeight());
                                c3 = 1;
                                fArr[1] = oooO0O1.f4727OooOO0o * fMin2;
                                c4 = 0;
                                fArr[0] = fMin2 * oooO0O1.f4726OooOO0O;
                            }
                            if (Math.abs(((oooO0O1.f4727OooOO0o * fArr[c3]) + (oooO0O1.f4726OooOO0O * fArr[c4])) * oooO0O1.f4738OooOo0O) < 0.01d) {
                                c5 = 0;
                                fArr[0] = 0.01f;
                                fArr[c3] = 0.01f;
                            } else {
                                c5 = 0;
                            }
                            float fMax2 = Math.max(Math.min(progress5 + (oooO0O1.f4726OooOO0O != 0.0f ? rawX5 / fArr[c5] : rawY5 / fArr[c3]), 1.0f), 0.0f);
                            if (oooO0O1.f4719OooO0OO == 6) {
                                fMax2 = Math.max(fMax2, 0.01f);
                            }
                            if (oooO0O1.f4719OooO0OO == 7) {
                                fMax2 = Math.min(fMax2, 0.99f);
                            }
                            float progress6 = motionLayout3.getProgress();
                            if (fMax2 != progress6) {
                                if (progress6 == 0.0f || progress6 == 1.0f) {
                                    motionLayout3.OooO0oo(progress6 == 0.0f);
                                }
                                motionLayout3.setProgress(fMax2);
                                VelocityTracker velocityTracker13 = oooOOO4.f4672OooO00o;
                                if (velocityTracker13 != null) {
                                    velocityTracker13.computeCurrentVelocity(1000);
                                }
                                VelocityTracker velocityTracker14 = oooOOO4.f4672OooO00o;
                                float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : 0.0f;
                                VelocityTracker velocityTracker15 = oooOOO4.f4672OooO00o;
                                motionLayout3.f4577OooO0oO = oooO0O1.f4726OooOO0O != 0.0f ? xVelocity4 / fArr[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : 0.0f) / fArr[1];
                            } else {
                                motionLayout3.f4577OooO0oO = 0.0f;
                            }
                            oooO0O1.f4731OooOOOo = motionEvent.getRawX();
                            oooO0O1.f4733OooOOo0 = motionEvent.getRawY();
                        }
                    }
                }
                z = false;
            }
            oooO00o2.f4689OooOOo = motionEvent.getRawX();
            oooO00o2.f4691OooOOoo = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 || (oooOOO0 = oooO00o2.f4687OooOOOO) == null) {
                motionLayout = this;
            } else {
                VelocityTracker velocityTracker16 = oooOOO0.f4672OooO00o;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    oooOOO1 = null;
                    oooOOO0.f4672OooO00o = null;
                } else {
                    oooOOO1 = null;
                }
                oooO00o2.f4687OooOOOO = oooOOO1;
                motionLayout = this;
                int i11 = motionLayout.f4573OooO;
                if (i11 != -1) {
                    oooO00o2.OooO00o(i11, motionLayout);
                }
            }
        }
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O11 = motionLayout.f4574OooO0Oo.f4676OooO0OO;
        if ((oooO0O11.f4709OooOOo & 4) != 0 ? true : z) {
            return oooO0O11.f4704OooOO0o.f4729OooOOO0;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f4611Oooo0oo == null) {
                this.f4611Oooo0oo = new CopyOnWriteArrayList<>();
            }
            this.f4611Oooo0oo.add(motionHelper);
            if (motionHelper.f4568OooOO0o) {
                if (this.f4609Oooo0o0 == null) {
                    this.f4609Oooo0o0 = new ArrayList<>();
                }
                this.f4609Oooo0o0.add(motionHelper);
            }
            if (motionHelper.f4570OooOOO0) {
                if (this.f4608Oooo0o == null) {
                    this.f4608Oooo0o = new ArrayList<>();
                }
                this.f4608Oooo0o.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f4610Oooo0oO == null) {
                    this.f4610Oooo0oO = new ArrayList<>();
                }
                this.f4610Oooo0oO.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f4609Oooo0o0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f4608Oooo0o;
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
        if (!this.f4616OoooOO0 && this.f4573OooO == -1 && (oooO00o = this.f4574OooO0Oo) != null && (oooO0O0 = oooO00o.f4676OooO0OO) != null) {
            int i = oooO0O0.f4710OooOOo0;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    this.f4582OooOOO.get(getChildAt(i2)).f33864OooO0Oo = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.f4589OooOo = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.f4627Oooooo = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.f4583OooOOO0 = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.f4574OooO0Oo != null) {
            setState(OooOo00.MOVING);
            Interpolator interpolatorOooO0o0 = this.f4574OooO0Oo.OooO0o0();
            if (interpolatorOooO0o0 != null) {
                setProgress(interpolatorOooO0o0.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f4608Oooo0o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4608Oooo0o.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f4609Oooo0o0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f4609Oooo0o0.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f < 0.0f || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.f4625OooooOO == null) {
                this.f4625OooooOO = new OooOOO();
            }
            this.f4625OooooOO.f4666OooO00o = f;
            return;
        }
        if (f <= 0.0f) {
            if (this.f4586OooOOo == 1.0f && this.f4573OooO == this.f4579OooOO0) {
                setState(OooOo00.MOVING);
            }
            this.f4573OooO = this.f4578OooO0oo;
            if (this.f4586OooOOo == 0.0f) {
                setState(OooOo00.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.f4586OooOOo == 0.0f && this.f4573OooO == this.f4578OooO0oo) {
                setState(OooOo00.MOVING);
            }
            this.f4573OooO = this.f4579OooOO0;
            if (this.f4586OooOOo == 1.0f) {
                setState(OooOo00.FINISHED);
            }
        } else {
            this.f4573OooO = -1;
            setState(OooOo00.MOVING);
        }
        if (this.f4574OooO0Oo == null) {
            return;
        }
        this.f4590OooOo0 = true;
        this.f4591OooOo00 = f;
        this.f4587OooOOo0 = f;
        this.f4588OooOOoo = -1L;
        this.f4584OooOOOO = -1L;
        this.f4576OooO0o0 = null;
        this.f4592OooOo0O = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.OooO00o oooO00o) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0;
        this.f4574OooO0Oo = oooO00o;
        boolean zIsRtl = isRtl();
        oooO00o.f4688OooOOOo = zIsRtl;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O1 = oooO00o.f4676OooO0OO;
        if (oooO0O1 != null && (oooO0O0 = oooO0O1.f4704OooOO0o) != null) {
            oooO0O0.OooO0OO(zIsRtl);
        }
        OooOOo();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.f4573OooO = i;
            return;
        }
        if (this.f4625OooooOO == null) {
            this.f4625OooooOO = new OooOOO();
        }
        OooOOO oooOOO = this.f4625OooooOO;
        oooOOO.f4668OooO0OO = i;
        oooOOO.f4669OooO0Oo = i;
    }

    public void setState(OooOo00 oooOo00) {
        OooOo00 oooOo01 = OooOo00.FINISHED;
        if (oooOo00 == oooOo01 && this.f4573OooO == -1) {
            return;
        }
        OooOo00 oooOo02 = this.f4629OoooooO;
        this.f4629OoooooO = oooOo00;
        OooOo00 oooOo03 = OooOo00.MOVING;
        if (oooOo02 == oooOo03 && oooOo00 == oooOo03) {
            OooOO0();
        }
        int i = OooO0o.f4644OooO00o[oooOo02.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && oooOo00 == oooOo01) {
                OooOO0O();
                return;
            }
            return;
        }
        if (oooOo00 == oooOo03) {
            OooOO0();
        }
        if (oooOo00 == oooOo01) {
            OooOO0O();
        }
    }

    public void setTransition(int i) {
        float f;
        if (this.f4574OooO0Oo != null) {
            androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0OooOOO0 = OooOOO0(i);
            this.f4578OooO0oo = oooO0O0OooOOO0.f4697OooO0Oo;
            this.f4579OooOO0 = oooO0O0OooOOO0.f4696OooO0OO;
            if (!isAttachedToWindow()) {
                if (this.f4625OooooOO == null) {
                    this.f4625OooooOO = new OooOOO();
                }
                OooOOO oooOOO = this.f4625OooooOO;
                oooOOO.f4668OooO0OO = this.f4578OooO0oo;
                oooOOO.f4669OooO0Oo = this.f4579OooOO0;
                return;
            }
            int i2 = this.f4573OooO;
            if (i2 == this.f4578OooO0oo) {
                f = 0.0f;
            } else {
                f = i2 == this.f4579OooOO0 ? 1.0f : Float.NaN;
            }
            androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
            oooO00o.f4676OooO0OO = oooO0O0OooOOO0;
            androidx.constraintlayout.motion.widget.OooO0O0 oooO0O0 = oooO0O0OooOOO0.f4704OooOO0o;
            if (oooO0O0 != null) {
                oooO0O0.OooO0OO(oooO00o.f4688OooOOOo);
            }
            this.f4630Ooooooo.OooO0o0(this.f4574OooO0Oo.OooO0O0(this.f4578OooO0oo), this.f4574OooO0Oo.OooO0O0(this.f4579OooOO0));
            OooOOo();
            if (this.f4586OooOOo != f) {
                if (f == 0.0f) {
                    OooO0oo(true);
                    this.f4574OooO0Oo.OooO0O0(this.f4578OooO0oo).OooO0O0(this);
                } else if (f == 1.0f) {
                    OooO0oo(false);
                    this.f4574OooO0Oo.OooO0O0(this.f4579OooOO0).OooO0O0(this);
                }
            }
            this.f4586OooOOo = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
                return;
            }
            Log.v("MotionLayout", o000000O.OooO00o.OooO0O0() + " transitionToStart ");
            OooO0oO(0.0f);
        }
    }

    public void setTransitionDuration(int i) {
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        if (oooO00o == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0 = oooO00o.f4676OooO0OO;
        if (oooO0O0 != null) {
            oooO0O0.f4701OooO0oo = Math.max(i, 8);
        } else {
            oooO00o.f4682OooOO0 = i;
        }
    }

    public void setTransitionListener(OooOOOO oooOOOO) {
        this.f4593OooOo0o = oooOOOO;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.f4625OooooOO == null) {
            this.f4625OooooOO = new OooOOO();
        }
        OooOOO oooOOO = this.f4625OooooOO;
        oooOOO.getClass();
        oooOOO.f4666OooO00o = bundle.getFloat("motion.progress");
        oooOOO.f4667OooO0O0 = bundle.getFloat("motion.velocity");
        oooOOO.f4668OooO0OO = bundle.getInt("motion.StartState");
        oooOOO.f4669OooO0Oo = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.f4625OooooOO.OooO00o();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return o000000O.OooO00o.OooO0OO(this.f4578OooO0oo, context) + "->" + o000000O.OooO00o.OooO0OO(this.f4579OooOO0, context) + " (pos:" + this.f4586OooOOo + " Dpos/Dt:" + this.f4577OooO0oO;
    }

    @Override // androidx.core.view.o0O0O00
    public final void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f4603Oooo000 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f4603Oooo000 = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i, int i2, int i3) {
        setState(OooOo00.SETUP);
        this.f4573OooO = i;
        this.f4578OooO0oo = -1;
        this.f4579OooOO0 = -1;
        androidx.constraintlayout.widget.OooO00o oooO00o = this.mConstraintLayoutSpec;
        if (oooO00o != null) {
            oooO00o.OooO0O0(i2, i3, i);
            return;
        }
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f4574OooO0Oo;
        if (oooO00o2 != null) {
            oooO00o2.OooO0O0(i).OooO0O0(this);
        }
    }

    public void setTransition(androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O0) {
        androidx.constraintlayout.motion.widget.OooO0O0 oooO0O1;
        androidx.constraintlayout.motion.widget.OooO00o oooO00o = this.f4574OooO0Oo;
        oooO00o.f4676OooO0OO = oooO0O0;
        if (oooO0O0 != null && (oooO0O1 = oooO0O0.f4704OooOO0o) != null) {
            oooO0O1.OooO0OO(oooO00o.f4688OooOOOo);
        }
        setState(OooOo00.SETUP);
        int i = this.f4573OooO;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O2 = this.f4574OooO0Oo.f4676OooO0OO;
        if (i == (oooO0O2 == null ? -1 : oooO0O2.f4696OooO0OO)) {
            this.f4586OooOOo = 1.0f;
            this.f4587OooOOo0 = 1.0f;
            this.f4591OooOo00 = 1.0f;
        } else {
            this.f4586OooOOo = 0.0f;
            this.f4587OooOOo0 = 0.0f;
            this.f4591OooOo00 = 0.0f;
        }
        this.f4588OooOOoo = (oooO0O0.f4709OooOOo & 1) != 0 ? -1L : getNanoTime();
        int iOooO0oo = this.f4574OooO0Oo.OooO0oo();
        androidx.constraintlayout.motion.widget.OooO00o oooO00o2 = this.f4574OooO0Oo;
        androidx.constraintlayout.motion.widget.OooO00o.OooO0O0 oooO0O3 = oooO00o2.f4676OooO0OO;
        int i2 = oooO0O3 != null ? oooO0O3.f4696OooO0OO : -1;
        if (iOooO0oo == this.f4578OooO0oo && i2 == this.f4579OooOO0) {
            return;
        }
        this.f4578OooO0oo = iOooO0oo;
        this.f4579OooOO0 = i2;
        oooO00o2.OooOOOO(iOooO0oo, i2);
        androidx.constraintlayout.widget.OooO0O0 OooO0O1 = this.f4574OooO0Oo.OooO0O0(this.f4578OooO0oo);
        androidx.constraintlayout.widget.OooO0O0 OooO0O2 = this.f4574OooO0Oo.OooO0O0(this.f4579OooOO0);
        OooOO0O oooOO0O = this.f4630Ooooooo;
        oooOO0O.OooO0o0(OooO0O1, OooO0O2);
        int i3 = this.f4578OooO0oo;
        int i4 = this.f4579OooOO0;
        oooOO0O.f4664OooO0o0 = i3;
        oooOO0O.f4663OooO0o = i4;
        oooOO0O.OooO0o();
        OooOOo();
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4575OooO0o = null;
        this.f4577OooO0oO = 0.0f;
        this.f4578OooO0oo = -1;
        this.f4573OooO = -1;
        this.f4579OooOO0 = -1;
        this.f4580OooOO0O = 0;
        this.f4581OooOO0o = 0;
        this.f4583OooOOO0 = true;
        this.f4582OooOOO = new HashMap<>();
        this.f4584OooOOOO = 0L;
        this.f4585OooOOOo = 1.0f;
        this.f4587OooOOo0 = 0.0f;
        this.f4586OooOOo = 0.0f;
        this.f4591OooOo00 = 0.0f;
        this.f4592OooOo0O = false;
        this.f4589OooOo = 0;
        this.f4594OooOoO = false;
        this.f4596OooOoOO = new o000000.OooO0O0();
        this.f4598OooOoo0 = new OooO();
        this.f4603Oooo000 = false;
        this.f4607Oooo0OO = false;
        this.f4609Oooo0o0 = null;
        this.f4608Oooo0o = null;
        this.f4610Oooo0oO = null;
        this.f4611Oooo0oo = null;
        this.f4601Oooo = 0;
        this.f4614OoooO00 = -1L;
        this.f4613OoooO0 = 0.0f;
        this.f4615OoooO0O = 0;
        this.f4612OoooO = 0.0f;
        this.f4616OoooOO0 = false;
        this.f4623Ooooo0o = new p413o0Oo0oo.o000oOoO();
        this.f4624OooooO0 = false;
        this.f4626OooooOo = null;
        new HashMap();
        this.f4628Oooooo0 = new Rect();
        this.f4627Oooooo = false;
        this.f4629OoooooO = OooOo00.UNDEFINED;
        this.f4630Ooooooo = new OooOO0O();
        this.f4635o0OoOo0 = false;
        this.f4636ooOO = new RectF();
        this.f4632o00O0O = null;
        this.f4633o00Oo0 = null;
        this.f4634o00Ooo = new ArrayList<>();
        OooOOOO(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4575OooO0o = null;
        this.f4577OooO0oO = 0.0f;
        this.f4578OooO0oo = -1;
        this.f4573OooO = -1;
        this.f4579OooOO0 = -1;
        this.f4580OooOO0O = 0;
        this.f4581OooOO0o = 0;
        this.f4583OooOOO0 = true;
        this.f4582OooOOO = new HashMap<>();
        this.f4584OooOOOO = 0L;
        this.f4585OooOOOo = 1.0f;
        this.f4587OooOOo0 = 0.0f;
        this.f4586OooOOo = 0.0f;
        this.f4591OooOo00 = 0.0f;
        this.f4592OooOo0O = false;
        this.f4589OooOo = 0;
        this.f4594OooOoO = false;
        this.f4596OooOoOO = new o000000.OooO0O0();
        this.f4598OooOoo0 = new OooO();
        this.f4603Oooo000 = false;
        this.f4607Oooo0OO = false;
        this.f4609Oooo0o0 = null;
        this.f4608Oooo0o = null;
        this.f4610Oooo0oO = null;
        this.f4611Oooo0oo = null;
        this.f4601Oooo = 0;
        this.f4614OoooO00 = -1L;
        this.f4613OoooO0 = 0.0f;
        this.f4615OoooO0O = 0;
        this.f4612OoooO = 0.0f;
        this.f4616OoooOO0 = false;
        this.f4623Ooooo0o = new p413o0Oo0oo.o000oOoO();
        this.f4624OooooO0 = false;
        this.f4626OooooOo = null;
        new HashMap();
        this.f4628Oooooo0 = new Rect();
        this.f4627Oooooo = false;
        this.f4629OoooooO = OooOo00.UNDEFINED;
        this.f4630Ooooooo = new OooOO0O();
        this.f4635o0OoOo0 = false;
        this.f4636ooOO = new RectF();
        this.f4632o00O0O = null;
        this.f4633o00Oo0 = null;
        this.f4634o00Ooo = new ArrayList<>();
        OooOOOO(attributeSet);
    }
}
