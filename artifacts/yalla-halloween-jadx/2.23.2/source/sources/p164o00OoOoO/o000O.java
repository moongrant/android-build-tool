package p164o00OoOoO;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ImageView f38126OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final GestureDetector f38127OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000 f38129OooOOO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public View.OnClickListener f38134OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public OooOO0 f38136OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public View.OnLongClickListener f38137OooOo00;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO00o f38140OooOoO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f38120OooO0Oo = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f38122OooO0o0 = 200;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f38121OooO0o = 1.0f;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f38123OooO0oO = 1.75f;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f38124OooO0oo = 3.0f;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f38119OooO = true;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f38125OooOO0 = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Matrix f38128OooOOO = new Matrix();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Matrix f38130OooOOOO = new Matrix();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Matrix f38131OooOOOo = new Matrix();

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final RectF f38133OooOOo0 = new RectF();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final float[] f38132OooOOo = new float[9];

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f38138OooOo0O = 2;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f38139OooOo0o = true;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ImageView.ScaleType f38135OooOo = ImageView.ScaleType.FIT_CENTER;

    public class OooO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float f38142OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f38143OooO0o = System.currentTimeMillis();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final float f38144OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f38145OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f38146OooO0oo;

        public OooO(float f, float f2, float f3, float f4) {
            this.f38142OooO0Oo = f3;
            this.f38144OooO0o0 = f4;
            this.f38145OooO0oO = f;
            this.f38146OooO0oo = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.f38143OooO0o) * 1.0f;
            o000O o000o = o000O.this;
            float interpolation = o000o.f38120OooO0Oo.getInterpolation(Math.min(1.0f, fCurrentTimeMillis / o000o.f38122OooO0o0));
            float f = this.f38146OooO0oo;
            float f2 = this.f38145OooO0oO;
            o000o.f38140OooOoO0.OooO00o(OooOo.OooO0o.OooO00o(f, f2, interpolation, f2) / o000o.OooO0o(), this.f38142OooO0Oo, this.f38144OooO0o0);
            if (interpolation < 1.0f) {
                o000o.f38126OooOO0O.postOnAnimation(this);
            }
        }
    }

    public class OooO00o implements o000O000 {
        public OooO00o() {
        }

        public final void OooO00o(float f, float f2, float f3) {
            o000O o000o = o000O.this;
            if (o000o.OooO0o() < o000o.f38124OooO0oo || f < 1.0f) {
                if (o000o.OooO0o() > o000o.f38121OooO0o || f > 1.0f) {
                    o000o.getClass();
                    o000o.f38131OooOOOo.postScale(f, f, f2, f3);
                    o000o.OooO00o();
                }
            }
        }
    }

    public class OooO0O0 extends GestureDetector.SimpleOnGestureListener {
        public OooO0O0() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            o000O.this.getClass();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            o000O o000o = o000O.this;
            View.OnLongClickListener onLongClickListener = o000o.f38137OooOo00;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(o000o.f38126OooOO0O);
            }
        }
    }

    public class OooO0OO implements GestureDetector.OnDoubleTapListener {
        public OooO0OO() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027 A[Catch: ArrayIndexOutOfBoundsException -> 0x002c, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x002c, blocks: (B:3:0x0003, B:5:0x0015, B:8:0x001d, B:10:0x0023, B:11:0x0027), top: B:15:0x0003 }] */
        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            o000O o000o = o000O.this;
            try {
                float fOooO0o = o000o.OooO0o();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float f = o000o.f38123OooO0oO;
                if (fOooO0o < f) {
                    o000o.OooO0oO(f, x, y, true);
                } else if (fOooO0o >= f) {
                    float f2 = o000o.f38124OooO0oo;
                    if (fOooO0o < f2) {
                        o000o.OooO0oO(f2, x, y, true);
                    } else {
                        o000o.OooO0oO(o000o.f38121OooO0o, x, y, true);
                    }
                } else {
                    o000o.OooO0oO(o000o.f38121OooO0o, x, y, true);
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
            o000O o000o = o000O.this;
            View.OnClickListener onClickListener = o000o.f38134OooOOoo;
            if (onClickListener != null) {
                onClickListener.onClick(o000o.f38126OooOO0O);
            }
            RectF rectFOooO0OO = o000o.OooO0OO();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            o000o.getClass();
            if (rectFOooO0OO == null) {
                return false;
            }
            if (!rectFOooO0OO.contains(x, y)) {
                o000o.getClass();
                return false;
            }
            rectFOooO0OO.width();
            rectFOooO0OO.height();
            o000o.getClass();
            return true;
        }
    }

    public static /* synthetic */ class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f38150OooO00o;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f38150OooO00o = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38150OooO00o[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38150OooO00o[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38150OooO00o[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OverScroller f38151OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f38152OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f38153OooO0o0;

        public OooOO0(Context context) {
            this.f38151OooO0Oo = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller = this.f38151OooO0Oo;
            if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                o000O o000o = o000O.this;
                o000o.f38131OooOOOo.postTranslate(this.f38153OooO0o0 - currX, this.f38152OooO0o - currY);
                o000o.OooO00o();
                this.f38153OooO0o0 = currX;
                this.f38152OooO0o = currY;
                o000o.f38126OooOO0O.postOnAnimation(this);
            }
        }
    }

    public o000O(ImageView imageView) {
        OooO00o oooO00o = new OooO00o();
        this.f38140OooOoO0 = oooO00o;
        this.f38126OooOO0O = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f38129OooOOO0 = new o000(imageView.getContext(), oooO00o);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new OooO0O0());
        this.f38127OooOO0o = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new OooO0OO());
    }

    public final void OooO(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        ImageView imageView = this.f38126OooOO0O;
        float width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        float height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f38128OooOOO;
        matrix.reset();
        float f = intrinsicWidth;
        float f2 = width / f;
        float f3 = intrinsicHeight;
        float f4 = height / f3;
        ImageView.ScaleType scaleType = this.f38135OooOo;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f) / 2.0f, (height - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f2, f4);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((width - (f * fMax)) / 2.0f, (height - (f3 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f2, f4));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((width - (f * fMin)) / 2.0f, (height - (f3 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = OooO0o.f38150OooO00o[this.f38135OooOo.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f38131OooOOOo;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        OooO00o();
        imageView.setImageMatrix(OooO0o0());
        OooO0O0();
    }

    public final void OooO00o() {
        if (OooO0O0()) {
            this.f38126OooOO0O.setImageMatrix(OooO0o0());
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
        ImageView imageView = this.f38126OooOO0O;
        float height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        float f6 = 0.0f;
        if (fHeight <= height) {
            int i = OooO0o.f38150OooO00o[this.f38135OooOo.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    height = (height - fHeight) / 2.0f;
                    f2 = rectFOooO0Oo.top;
                } else {
                    height -= fHeight;
                    f2 = rectFOooO0Oo.top;
                }
            } else {
                f = rectFOooO0Oo.top;
                f3 = -f;
            }
        } else {
            f = rectFOooO0Oo.top;
            if (f > 0.0f) {
                f3 = -f;
            } else {
                f2 = rectFOooO0Oo.bottom;
                f3 = f2 < height ? height - f2 : 0.0f;
            }
        }
        float width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        if (fWidth <= width) {
            int i2 = OooO0o.f38150OooO00o[this.f38135OooOo.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f4 = (width - fWidth) / 2.0f;
                    f5 = rectFOooO0Oo.left;
                } else {
                    f4 = width - fWidth;
                    f5 = rectFOooO0Oo.left;
                }
                f6 = f4 - f5;
            } else {
                f6 = -rectFOooO0Oo.left;
            }
            this.f38138OooOo0O = 2;
        } else {
            float f7 = rectFOooO0Oo.left;
            if (f7 > 0.0f) {
                this.f38138OooOo0O = 0;
                f6 = -f7;
            } else {
                float f8 = rectFOooO0Oo.right;
                if (f8 < width) {
                    f6 = width - f8;
                    this.f38138OooOo0O = 1;
                } else {
                    this.f38138OooOo0O = -1;
                }
            }
        }
        this.f38131OooOOOo.postTranslate(f6, f3);
        return true;
    }

    public final RectF OooO0OO() {
        OooO0O0();
        return OooO0Oo(OooO0o0());
    }

    public final RectF OooO0Oo(Matrix matrix) {
        Drawable drawable = this.f38126OooOO0O.getDrawable();
        if (drawable == null) {
            return null;
        }
        RectF rectF = this.f38133OooOOo0;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(rectF);
        return rectF;
    }

    public final float OooO0o() {
        Matrix matrix = this.f38131OooOOOo;
        float[] fArr = this.f38132OooOOo;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final Matrix OooO0o0() {
        Matrix matrix = this.f38130OooOOOO;
        matrix.set(this.f38128OooOOO);
        matrix.postConcat(this.f38131OooOOOo);
        return matrix;
    }

    public final void OooO0oO(float f, float f2, float f3, boolean z) {
        if (f < this.f38121OooO0o || f > this.f38124OooO0oo) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f38126OooOO0O.post(new OooO(OooO0o(), f, f2, f3));
        } else {
            this.f38131OooOOOo.setScale(f, f, f2, f3);
            OooO00o();
        }
    }

    public final void OooO0oo() {
        boolean z = this.f38139OooOo0o;
        ImageView imageView = this.f38126OooOO0O;
        if (z) {
            OooO(imageView.getDrawable());
            return;
        }
        Matrix matrix = this.f38131OooOOOo;
        matrix.reset();
        matrix.postRotate(0.0f);
        OooO00o();
        imageView.setImageMatrix(OooO0o0());
        OooO0O0();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        OooO(this.f38126OooOO0O.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        o000 o000Var;
        boolean z2;
        GestureDetector gestureDetector;
        ScaleGestureDetector scaleGestureDetector;
        boolean zIsInProgress;
        boolean z3;
        boolean z4;
        boolean z5;
        RectF rectFOooO0OO;
        boolean z6 = false;
        if (!this.f38139OooOo0o) {
            return false;
        }
        if (!(((ImageView) view).getDrawable() != null)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                if (OooO0o() < this.f38121OooO0o) {
                    RectF rectFOooO0OO2 = OooO0OO();
                    if (rectFOooO0OO2 != null) {
                        view.post(new OooO(OooO0o(), this.f38121OooO0o, rectFOooO0OO2.centerX(), rectFOooO0OO2.centerY()));
                        z = true;
                    }
                } else if (OooO0o() > this.f38124OooO0oo && (rectFOooO0OO = OooO0OO()) != null) {
                    view.post(new OooO(OooO0o(), this.f38124OooO0oo, rectFOooO0OO.centerX(), rectFOooO0OO.centerY()));
                    z = true;
                }
            }
            o000Var = this.f38129OooOOO0;
            if (o000Var != null) {
                scaleGestureDetector = o000Var.f38111OooO0OO;
                zIsInProgress = scaleGestureDetector.isInProgress();
                z3 = o000Var.f38114OooO0o0;
                try {
                    scaleGestureDetector.onTouchEvent(motionEvent);
                    o000Var.OooO00o(motionEvent);
                } catch (IllegalArgumentException unused) {
                }
                if (!zIsInProgress || scaleGestureDetector.isInProgress()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z3 || o000Var.f38114OooO0o0) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z4 && z5) {
                    z6 = true;
                }
                this.f38125OooOO0 = z6;
                z2 = true;
            } else {
                z2 = z;
            }
            gestureDetector = this.f38127OooOO0o;
            if (gestureDetector == null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
        }
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        OooOO0 oooOO1 = this.f38136OooOo0;
        if (oooOO1 != null) {
            oooOO1.f38151OooO0Oo.forceFinished(true);
            this.f38136OooOo0 = null;
        }
        z = false;
        o000Var = this.f38129OooOOO0;
        if (o000Var != null) {
            scaleGestureDetector = o000Var.f38111OooO0OO;
            zIsInProgress = scaleGestureDetector.isInProgress();
            z3 = o000Var.f38114OooO0o0;
            scaleGestureDetector.onTouchEvent(motionEvent);
            o000Var.OooO00o(motionEvent);
            if (zIsInProgress) {
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
            this.f38125OooOO0 = z6;
            z2 = true;
        } else {
            z2 = z;
        }
        gestureDetector = this.f38127OooOO0o;
        return gestureDetector == null ? z2 : z2;
    }
}
