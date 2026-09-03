package com.yalla.netimage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import org.jctools.util.Pow2;
import p368o0OOo0Oo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public class NetImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f22112OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f22113OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f22114OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f22115OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f22116OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f22117OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f22118OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f22119OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f22120OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final PorterDuffXfermode f22121OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f22122OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f22123OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f22124OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f22125OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f22126OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final float[] f22127OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Path f22128OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final RectF f22129OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final float[] f22130OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final RectF f22131OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Paint f22132OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Path f22133OooOoO0;

    public NetImageView(Context context) {
        this(context, null);
    }

    public final void OooO0OO() {
        if (this.f22115OooO0o0) {
            return;
        }
        int i = this.f22112OooO;
        float[] fArr = this.f22127OooOOoo;
        float[] fArr2 = this.f22130OooOo00;
        if (i > 0) {
            for (int i2 = 0; i2 < fArr.length; i2++) {
                float fAbs = this.f22112OooO - (this.f22116OooO0oO / 2.0f);
                if (fAbs <= 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                fArr[i2] = fAbs;
                if (this.f22123OooOOOO) {
                    fArr2[i2] = this.f22112OooO - this.f22116OooO0oO;
                } else {
                    fArr2[i2] = this.f22112OooO;
                }
            }
            return;
        }
        int i3 = this.f22118OooOO0;
        float f = i3;
        fArr[1] = f;
        fArr[0] = f;
        int i4 = this.f22119OooOO0O;
        float f2 = i4;
        fArr[3] = f2;
        fArr[2] = f2;
        int i5 = this.f22122OooOOO0;
        float f3 = i5;
        fArr[5] = f3;
        fArr[4] = f3;
        int i6 = this.f22120OooOO0o;
        float f4 = i6;
        fArr[7] = f4;
        fArr[6] = f4;
        int i7 = this.f22116OooO0oO;
        float f5 = i3 - (i7 / 2.0f);
        fArr2[1] = f5;
        fArr2[0] = f5;
        float f6 = i4 - (i7 / 2.0f);
        fArr2[3] = f6;
        fArr2[2] = f6;
        float f7 = i5 - (i7 / 2.0f);
        fArr2[5] = f7;
        fArr2[4] = f7;
        float f8 = i6 - (i7 / 2.0f);
        fArr2[7] = f8;
        fArr2[6] = f8;
    }

    public final void OooO0Oo() {
        if (this.f22115OooO0o0) {
            return;
        }
        int i = this.f22116OooO0oO;
        this.f22131OooOo0O.set(i / 2.0f, i / 2.0f, this.f22124OooOOOo - (i / 2.0f), this.f22126OooOOo0 - (i / 2.0f));
    }

    public final void OooO0o(int i, int i2, int i3, int i4) {
        boolean z = this.f22113OooO0Oo.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f22118OooOO0 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        this.f22119OooOO0O = i;
        this.f22120OooOO0o = z ? i4 : i3;
        if (!z) {
            i3 = i4;
        }
        this.f22122OooOOO0 = i3;
        OooO0o0();
        this.f22112OooO = 0;
        OooO0OO();
        OooO0Oo();
        invalidate();
    }

    public final void OooO0o0() {
        boolean z = this.f22115OooO0o0;
        RectF rectF = this.f22129OooOo0;
        if (!z) {
            if (!this.f22123OooOOOO) {
                rectF.set(0.0f, 0.0f, this.f22124OooOOOo, this.f22126OooOOo0);
                return;
            } else {
                int i = this.f22116OooO0oO;
                rectF.set(i + 0, i + 0, this.f22124OooOOOo - i, this.f22126OooOOo0 - i);
                return;
            }
        }
        float fMin = Math.min(this.f22124OooOOOo, this.f22126OooOOo0) / 2.0f;
        this.f22125OooOOo = fMin;
        if (!this.f22123OooOOOO) {
            int i2 = this.f22124OooOOOo;
            int i3 = this.f22126OooOOo0;
            rectF.set((i2 / 2.0f) - fMin, (i3 / 2.0f) - fMin, (i2 / 2.0f) + fMin, (i3 / 2.0f) + fMin);
        } else {
            int i4 = this.f22124OooOOOo;
            int i5 = this.f22116OooO0oO;
            int i6 = this.f22126OooOOo0;
            rectF.set(((i4 / 2.0f) - fMin) + i5, ((i6 / 2.0f) - fMin) + i5, ((i4 / 2.0f) + fMin) - i5, ((i6 / 2.0f) + fMin) - i5);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f22129OooOo0;
        canvas.saveLayer(rectF, null, 31);
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Paint paint = this.f22132OooOo0o;
        paint.reset();
        Path path = this.f22128OooOo;
        path.reset();
        if (!this.f22115OooO0o0) {
            path.addRoundRect(rectF, this.f22130OooOo00, Path.Direction.CCW);
        } else if (this.f22123OooOOOO) {
            path.addCircle(this.f22124OooOOOo / 2.0f, this.f22126OooOOo0 / 2.0f, this.f22125OooOOo - this.f22116OooO0oO, Path.Direction.CCW);
        } else {
            path.addCircle(this.f22124OooOOOo / 2.0f, this.f22126OooOOo0 / 2.0f, this.f22125OooOOo, Path.Direction.CCW);
        }
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(this.f22121OooOOO);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(path, paint);
        } else {
            Path path2 = this.f22133OooOoO0;
            path2.reset();
            path2.addRect(rectF, Path.Direction.CCW);
            path2.op(path, Path.Op.DIFFERENCE);
            canvas.drawPath(path2, paint);
        }
        paint.setXfermode(null);
        canvas.restore();
        if (this.f22115OooO0o0) {
            int i = this.f22116OooO0oO;
            if (i > 0) {
                int i2 = this.f22117OooO0oo;
                float f = this.f22125OooOOo - (i / 2);
                path.reset();
                paint.setStrokeWidth(i);
                paint.setColor(i2);
                paint.setStyle(Paint.Style.STROKE);
                path.addCircle(this.f22124OooOOOo / 2.0f, this.f22126OooOOo0 / 2.0f, f, Path.Direction.CCW);
                canvas.drawPath(path, paint);
                return;
            }
            return;
        }
        int i3 = this.f22116OooO0oO;
        if (i3 > 0) {
            int i4 = this.f22117OooO0oo;
            RectF rectF2 = this.f22131OooOo0O;
            path.reset();
            paint.setStrokeWidth(i3);
            paint.setColor(i4);
            paint.setStyle(Paint.Style.STROKE);
            path.addRoundRect(rectF2, this.f22127OooOOoo, Path.Direction.CCW);
            canvas.drawPath(path, paint);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f22114OooO0o) {
            setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
            i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), Pow2.MAX_POW2);
            i2 = i;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f22124OooOOOo = i;
        this.f22126OooOOo0 = i2;
        OooO0Oo();
        OooO0o0();
    }

    public void setBordTrimSrc(boolean z) {
        this.f22123OooOOOO = z;
    }

    public void setBorderColor(@ColorInt int i) {
        this.f22117OooO0oo = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f22116OooO0oO = i;
        OooO0o0();
        OooO0OO();
        OooO0Oo();
        invalidate();
    }

    public void setCornerRadius(int i) {
        this.f22112OooO = i;
        OooO0o0();
        OooO0OO();
        OooO0Oo();
        invalidate();
    }

    public NetImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22117OooO0oo = -1;
        this.f22113OooO0Oo = context;
        this.f22127OooOOoo = new float[8];
        this.f22130OooOo00 = new float[8];
        this.f22131OooOo0O = new RectF();
        this.f22129OooOo0 = new RectF();
        this.f22132OooOo0o = new Paint();
        this.f22128OooOo = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f22121OooOOO = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f22121OooOOO = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f22133OooOoO0 = new Path();
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000oOoO.NetImageView);
        this.f22112OooO = typedArrayObtainStyledAttributes.getInteger(o000oOoO.NetImageView_corner_Radius, 0);
        this.f22118OooOO0 = typedArrayObtainStyledAttributes.getInteger(o000oOoO.NetImageView_cornerTopLeftRadius, 0);
        this.f22119OooOO0O = typedArrayObtainStyledAttributes.getInteger(o000oOoO.NetImageView_cornerTopRightRadius, 0);
        this.f22120OooOO0o = typedArrayObtainStyledAttributes.getInteger(o000oOoO.NetImageView_cornerBottomLeftRadius, 0);
        this.f22122OooOOO0 = typedArrayObtainStyledAttributes.getInteger(o000oOoO.NetImageView_cornerBottomRightRadius, 0);
        typedArrayObtainStyledAttributes.recycle();
        OooO0OO();
    }
}
