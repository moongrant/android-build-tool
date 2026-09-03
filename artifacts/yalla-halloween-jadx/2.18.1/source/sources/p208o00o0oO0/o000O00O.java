package p208o00o0oO0;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00O implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ImageView f33310OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public GestureDetector f33314OoooOO0;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public o000OO f33320Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public o0000OO0 f33321Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public o0000O f33322OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public o000Oo0 f33323OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public View.OnClickListener f33324OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public o000 f33325Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public View.OnLongClickListener f33326Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public o000O000 f33327OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public o000O0o f33328Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o0000O0 f33329o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public OooOO0 f33333o0OoOo0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public AccelerateDecelerateInterpolator f33307Oooo0o = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f33308Oooo0oO = 200;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f33309Oooo0oo = 1.0f;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f33306Oooo = 1.75f;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f33312OoooO00 = 3.0f;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f33311OoooO0 = true;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f33313OoooO0O = false;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final Matrix f33315OoooOOO = new Matrix();

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final Matrix f33316OoooOOo = new Matrix();

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final Matrix f33317OoooOo0 = new Matrix();

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final RectF f33318OoooOoO = new RectF();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final float[] f33319OoooOoo = new float[9];

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f33334ooOO = 2;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f33330o00O0O = true;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public ImageView.ScaleType f33331o00Oo0 = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public OooO00o f33332o00Ooo = new OooO00o();

    public class OooO implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final float f33335Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final float f33336Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final float f33337Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final long f33338Oooo0oo = System.currentTimeMillis();

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final float f33340OoooO00;

        public OooO(float f, float f2, float f3, float f4) {
            this.f33336Oooo0o = f3;
            this.f33337Oooo0oO = f4;
            this.f33335Oooo = f;
            this.f33340OoooO00 = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float interpolation = o000O00O.this.f33307Oooo0o.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f33338Oooo0oo) * 1.0f) / o000O00O.this.f33308Oooo0oO));
            float f = this.f33335Oooo;
            o000O00O.this.f33332o00Ooo.OooO00o(Oooo000.OooO00o.OooO00o(this.f33340OoooO00, f, interpolation, f) / o000O00O.this.OooO0oo(), this.f33336Oooo0o, this.f33337Oooo0oO);
            if (interpolation < 1.0f) {
                o000O00O.this.f33310OoooO.postOnAnimation(this);
            }
        }
    }

    public class OooO00o implements o0000O0O {
        public OooO00o() {
        }

        public final void OooO00o(float f, float f2, float f3) {
            float fOooO0oo = o000O00O.this.OooO0oo();
            o000O00O o000o00o2 = o000O00O.this;
            if (fOooO0oo < o000o00o2.f33312OoooO00 || f < 1.0f) {
                float fOooO0oo2 = o000o00o2.OooO0oo();
                o000O00O o000o00o3 = o000O00O.this;
                if (fOooO0oo2 > o000o00o3.f33309Oooo0oo || f > 1.0f) {
                    o000 o000Var = o000o00o3.f33325Oooooo;
                    if (o000Var != null) {
                        o000Var.OooO00o();
                    }
                    o000O00O.this.f33317OoooOo0.postScale(f, f, f2, f3);
                    o000O00O.this.OooO00o();
                }
            }
        }
    }

    public class OooO0O0 extends GestureDetector.SimpleOnGestureListener {
        public OooO0O0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            o000O00O o000o00o2 = o000O00O.this;
            if (o000o00o2.f33327OoooooO == null || o000o00o2.OooO0oo() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent.getPointerCount() > 1) {
                return false;
            }
            return o000O00O.this.f33327OoooooO.OooO00o();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            o000O00O o000o00o2 = o000O00O.this;
            View.OnLongClickListener onLongClickListener = o000o00o2.f33326Oooooo0;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(o000o00o2.f33310OoooO);
            }
        }
    }

    public class OooO0OO implements GestureDetector.OnDoubleTapListener {
        public OooO0OO() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029 A[Catch: ArrayIndexOutOfBoundsException -> 0x002e, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002e, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001f, B:10:0x0025, B:11:0x0029), top: B:15:0x0001 }] */
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fOooO0oo = o000O00O.this.OooO0oo();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                o000O00O o000o00o2 = o000O00O.this;
                float f = o000o00o2.f33306Oooo;
                if (fOooO0oo < f) {
                    o000o00o2.OooOO0O(f, x, y, true);
                } else if (fOooO0oo >= f) {
                    float f2 = o000o00o2.f33312OoooO00;
                    if (fOooO0oo < f2) {
                        o000o00o2.OooOO0O(f2, x, y, true);
                    } else {
                        o000o00o2.OooOO0O(o000o00o2.f33309Oooo0oo, x, y, true);
                    }
                } else {
                    o000o00o2.OooOO0O(o000o00o2.f33309Oooo0oo, x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            o000O00O o000o00o2 = o000O00O.this;
            View.OnClickListener onClickListener = o000o00o2.f33324OooooOo;
            if (onClickListener != null) {
                onClickListener.onClick(o000o00o2.f33310OoooO);
            }
            RectF rectFOooO0OO = o000O00O.this.OooO0OO();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            o000Oo0 o000oo1 = o000O00O.this.f33323OooooOO;
            if (o000oo1 != null) {
                o000oo1.OooO00o();
            }
            if (rectFOooO0OO == null) {
                return false;
            }
            if (!rectFOooO0OO.contains(x, y)) {
                o0000O o0000o2 = o000O00O.this.f33322OooooO0;
                if (o0000o2 == null) {
                    return false;
                }
                o0000o2.OooO00o();
                return false;
            }
            rectFOooO0OO.width();
            rectFOooO0OO.height();
            o0000OO0 o0000oo1 = o000O00O.this.f33321Ooooo0o;
            if (o0000oo1 == null) {
                return true;
            }
            o0000oo1.OooO00o();
            return true;
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f33344OooO00o;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f33344OooO00o = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33344OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33344OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33344OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final OverScroller f33346Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f33347Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f33348Oooo0oo;

        public OooOO0(Context context) {
            this.f33346Oooo0o = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f33346Oooo0o.isFinished() && this.f33346Oooo0o.computeScrollOffset()) {
                int currX = this.f33346Oooo0o.getCurrX();
                int currY = this.f33346Oooo0o.getCurrY();
                o000O00O.this.f33317OoooOo0.postTranslate(this.f33347Oooo0oO - currX, this.f33348Oooo0oo - currY);
                o000O00O.this.OooO00o();
                this.f33347Oooo0oO = currX;
                this.f33348Oooo0oo = currY;
                o000O00O.this.f33310OoooO.postOnAnimation(this);
            }
        }
    }

    public o000O00O(ImageView imageView) {
        this.f33310OoooO = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f33329o000oOoO = new o0000O0(imageView.getContext(), this.f33332o00Ooo);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new OooO0O0());
        this.f33314OoooOO0 = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new OooO0OO());
    }

    public final void OooO() {
        this.f33317OoooOo0.reset();
        this.f33317OoooOo0.postRotate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        OooO00o();
        OooOO0(OooO0o0());
        OooO0O0();
    }

    public final void OooO00o() {
        if (OooO0O0()) {
            OooOO0(OooO0o0());
        }
    }

    public final boolean OooO0O0() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF rectFOooO0Oo = OooO0Oo(OooO0o0());
        if (rectFOooO0Oo == null) {
            return false;
        }
        float fHeight = rectFOooO0Oo.height();
        float fWidth = rectFOooO0Oo.width();
        float fOooO0o = OooO0o(this.f33310OoooO);
        float f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (fHeight <= fOooO0o) {
            int i = OooO0o.f33344OooO00o[this.f33331o00Oo0.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    fOooO0o = (fOooO0o - fHeight) / 2.0f;
                    f2 = rectFOooO0Oo.top;
                } else {
                    fOooO0o -= fHeight;
                    f2 = rectFOooO0Oo.top;
                }
            } else {
                f = rectFOooO0Oo.top;
                f3 = -f;
            }
        } else {
            f = rectFOooO0Oo.top;
            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                f3 = -f;
            } else {
                f2 = rectFOooO0Oo.bottom;
                f3 = f2 < fOooO0o ? fOooO0o - f2 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            }
        }
        float fOooO0oO = OooO0oO(this.f33310OoooO);
        if (fWidth <= fOooO0oO) {
            int i2 = OooO0o.f33344OooO00o[this.f33331o00Oo0.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f4 = (fOooO0oO - fWidth) / 2.0f;
                    f5 = rectFOooO0Oo.left;
                } else {
                    f4 = fOooO0oO - fWidth;
                    f5 = rectFOooO0Oo.left;
                }
                f6 = f4 - f5;
            } else {
                f6 = -rectFOooO0Oo.left;
            }
            this.f33334ooOO = 2;
        } else {
            float f7 = rectFOooO0Oo.left;
            if (f7 > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f33334ooOO = 0;
                f6 = -f7;
            } else {
                float f8 = rectFOooO0Oo.right;
                if (f8 < fOooO0oO) {
                    f6 = fOooO0oO - f8;
                    this.f33334ooOO = 1;
                } else {
                    this.f33334ooOO = -1;
                }
            }
        }
        this.f33317OoooOo0.postTranslate(f6, f3);
        return true;
    }

    public final RectF OooO0OO() {
        OooO0O0();
        return OooO0Oo(OooO0o0());
    }

    public final RectF OooO0Oo(Matrix matrix) {
        Drawable drawable = this.f33310OoooO.getDrawable();
        if (drawable == null) {
            return null;
        }
        this.f33318OoooOoO.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.f33318OoooOoO);
        return this.f33318OoooOoO;
    }

    public final int OooO0o(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final Matrix OooO0o0() {
        this.f33316OoooOOo.set(this.f33315OoooOOO);
        this.f33316OoooOOo.postConcat(this.f33317OoooOo0);
        return this.f33316OoooOOo;
    }

    public final int OooO0oO(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public final float OooO0oo() {
        this.f33317OoooOo0.getValues(this.f33319OoooOoo);
        float fPow = (float) Math.pow(this.f33319OoooOoo[0], 2.0d);
        this.f33317OoooOo0.getValues(this.f33319OoooOoo);
        return (float) Math.sqrt(fPow + ((float) Math.pow(this.f33319OoooOoo[3], 2.0d)));
    }

    public final void OooOO0(Matrix matrix) {
        this.f33310OoooO.setImageMatrix(matrix);
        if (this.f33320Ooooo00 == null || OooO0Oo(matrix) == null) {
            return;
        }
        this.f33320Ooooo00.OooO00o();
    }

    public final void OooOO0O(float f, float f2, float f3, boolean z) {
        if (f < this.f33309Oooo0oo || f > this.f33312OoooO00) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f33310OoooO.post(new OooO(OooO0oo(), f, f2, f3));
        } else {
            this.f33317OoooOo0.setScale(f, f, f2, f3);
            OooO00o();
        }
    }

    public final void OooOO0o() {
        if (this.f33330o00O0O) {
            OooOOO0(this.f33310OoooO.getDrawable());
        } else {
            OooO();
        }
    }

    public final void OooOOO0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fOooO0oO = OooO0oO(this.f33310OoooO);
        float fOooO0o = OooO0o(this.f33310OoooO);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f33315OoooOOO.reset();
        float f = intrinsicWidth;
        float f2 = fOooO0oO / f;
        float f3 = intrinsicHeight;
        float f4 = fOooO0o / f3;
        ImageView.ScaleType scaleType = this.f33331o00Oo0;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f33315OoooOOO.postTranslate((fOooO0oO - f) / 2.0f, (fOooO0o - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            this.f33315OoooOOO.postScale(fMax, fMax);
            this.f33315OoooOOO.postTranslate(p167o00Ooo.OooOO0.OooO00o(f, fMax, fOooO0oO, 2.0f), (fOooO0o - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            this.f33315OoooOOO.postScale(fMin, fMin);
            this.f33315OoooOOO.postTranslate(p167o00Ooo.OooOO0.OooO00o(f, fMin, fOooO0oO, 2.0f), (fOooO0o - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, f3);
            RectF rectF2 = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fOooO0oO, fOooO0o);
            if (((int) ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) % 180 != 0) {
                rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f3, f);
            }
            int i = OooO0o.f33344OooO00o[this.f33331o00Oo0.ordinal()];
            if (i == 1) {
                this.f33315OoooOOO.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                this.f33315OoooOOO.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                this.f33315OoooOOO.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                this.f33315OoooOOO.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        OooO();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        OooOOO0(this.f33310OoooO.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        o0000O0 o0000o1;
        boolean z2;
        GestureDetector gestureDetector;
        boolean zOooO0OO;
        boolean z3;
        boolean z4;
        boolean z5;
        RectF rectFOooO0OO;
        boolean z6 = false;
        if (!this.f33330o00O0O) {
            return false;
        }
        if (!(((ImageView) view).getDrawable() != null)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (OooO0oo() < this.f33309Oooo0oo) {
                    RectF rectFOooO0OO2 = OooO0OO();
                    if (rectFOooO0OO2 != null) {
                        view.post(new OooO(OooO0oo(), this.f33309Oooo0oo, rectFOooO0OO2.centerX(), rectFOooO0OO2.centerY()));
                        z = true;
                    }
                } else if (OooO0oo() > this.f33312OoooO00 && (rectFOooO0OO = OooO0OO()) != null) {
                    view.post(new OooO(OooO0oo(), this.f33312OoooO00, rectFOooO0OO.centerX(), rectFOooO0OO.centerY()));
                    z = true;
                }
            }
            o0000o1 = this.f33329o000oOoO;
            if (o0000o1 != null) {
                zOooO0OO = o0000o1.OooO0OO();
                o0000O0 o0000o2 = this.f33329o000oOoO;
                z3 = o0000o2.f33300OooO0o0;
                try {
                    o0000o2.f33297OooO0OO.onTouchEvent(motionEvent);
                    o0000o2.OooO0Oo(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                if (!zOooO0OO || this.f33329o000oOoO.OooO0OO()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 || this.f33329o000oOoO.f33300OooO0o0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z4 && z5) {
                    z6 = true;
                }
                this.f33313OoooO0O = z6;
                z2 = true;
            } else {
                z2 = z;
            }
            gestureDetector = this.f33314OoooOO0;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        OooOO0 oooOO1 = this.f33333o0OoOo0;
        if (oooOO1 != null) {
            oooOO1.f33346Oooo0o.forceFinished(true);
            this.f33333o0OoOo0 = null;
        }
        z = false;
        o0000o1 = this.f33329o000oOoO;
        if (o0000o1 != null) {
            zOooO0OO = o0000o1.OooO0OO();
            o0000O0 o0000o3 = this.f33329o000oOoO;
            z3 = o0000o3.f33300OooO0o0;
            o0000o3.f33297OooO0OO.onTouchEvent(motionEvent);
            o0000o3.OooO0Oo(motionEvent);
            if (zOooO0OO) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z3) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z4) {
                z6 = true;
            }
            this.f33313OoooO0O = z6;
            z2 = true;
        } else {
            z2 = z;
        }
        gestureDetector = this.f33314OoooOO0;
        return gestureDetector == null ? z2 : z2;
    }
}
