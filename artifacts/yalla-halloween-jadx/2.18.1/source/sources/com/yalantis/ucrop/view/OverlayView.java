package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.KotlinVersion;
import kotlin.ULong;
import p168o00Ooo0.OooOo;
import p400o0Oo0O.OooOO0;
import p460o0Ooo0O0.o0000O0O;
import p552o0oOO0Oo.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public class OverlayView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f20392Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final RectF f20393Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final RectF f20394Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f20395Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f20396OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f20397OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float[] f20398OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f20399OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float[] f20400OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f20401OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f20402OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f20403OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f20404OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public Path f20405OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public Paint f20406Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public Paint f20407Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public Paint f20408OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public Paint f20409OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f20410OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public float f20411Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public float f20412Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f20413OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f20414Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f20415o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f20416o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f20417o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public o000O00 f20418o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f20419o00o0O;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public int f20420o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f20421ooOO;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context) {
        this(context, null);
    }

    public final void OooO00o() {
        this.f20398OoooO00 = OooOo.OooO0OO(this.f20393Oooo0o);
        RectF rectF = this.f20393Oooo0o;
        rectF.centerX();
        rectF.centerY();
        this.f20400OoooOO0 = null;
        this.f20405OoooOoo.reset();
        this.f20405OoooOoo.addCircle(this.f20393Oooo0o.centerX(), this.f20393Oooo0o.centerY(), Math.min(this.f20393Oooo0o.width(), this.f20393Oooo0o.height()) / 2.0f, Path.Direction.CW);
    }

    @NonNull
    public RectF getCropViewRect() {
        return this.f20393Oooo0o;
    }

    public int getFreestyleCropMode() {
        return this.f20410OooooOo;
    }

    public o000O00 getOverlayViewChangeListener() {
        return this.f20418o00Ooo;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        if (this.f20402OoooOOo) {
            canvas.clipPath(this.f20405OoooOoo, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f20393Oooo0o, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f20403OoooOo0);
        canvas.restore();
        if (this.f20402OoooOOo) {
            canvas.drawCircle(this.f20393Oooo0o.centerX(), this.f20393Oooo0o.centerY(), Math.min(this.f20393Oooo0o.width(), this.f20393Oooo0o.height()) / 2.0f, this.f20406Ooooo00);
        }
        if (this.f20401OoooOOO) {
            if (this.f20400OoooOO0 == null && !this.f20393Oooo0o.isEmpty()) {
                this.f20400OoooOO0 = new float[(this.f20399OoooO0O * 4) + (this.f20397OoooO0 * 4)];
                int i = 0;
                for (int i2 = 0; i2 < this.f20397OoooO0; i2++) {
                    float[] fArr = this.f20400OoooOO0;
                    int i3 = i + 1;
                    RectF rectF = this.f20393Oooo0o;
                    fArr[i] = rectF.left;
                    int i4 = i3 + 1;
                    float f = i2 + 1.0f;
                    float fHeight = (f / (this.f20397OoooO0 + 1)) * rectF.height();
                    RectF rectF2 = this.f20393Oooo0o;
                    fArr[i3] = fHeight + rectF2.top;
                    float[] fArr2 = this.f20400OoooOO0;
                    int i5 = i4 + 1;
                    fArr2[i4] = rectF2.right;
                    i = i5 + 1;
                    fArr2[i5] = ((f / (this.f20397OoooO0 + 1)) * rectF2.height()) + this.f20393Oooo0o.top;
                }
                for (int i6 = 0; i6 < this.f20399OoooO0O; i6++) {
                    float[] fArr3 = this.f20400OoooOO0;
                    int i7 = i + 1;
                    float f2 = i6 + 1.0f;
                    float fWidth = (f2 / (this.f20399OoooO0O + 1)) * this.f20393Oooo0o.width();
                    RectF rectF3 = this.f20393Oooo0o;
                    fArr3[i] = fWidth + rectF3.left;
                    float[] fArr4 = this.f20400OoooOO0;
                    int i8 = i7 + 1;
                    fArr4[i7] = rectF3.top;
                    int i9 = i8 + 1;
                    float fWidth2 = (f2 / (this.f20399OoooO0O + 1)) * rectF3.width();
                    RectF rectF4 = this.f20393Oooo0o;
                    fArr4[i8] = fWidth2 + rectF4.left;
                    i = i9 + 1;
                    this.f20400OoooOO0[i9] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f20400OoooOO0;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f20407Ooooo0o);
            }
        }
        if (this.f20415o000oOoO) {
            canvas.drawRect(this.f20393Oooo0o, this.f20408OooooO0);
        }
        if (this.f20410OooooOo != 0) {
            canvas.save();
            this.f20394Oooo0oO.set(this.f20393Oooo0o);
            RectF rectF5 = this.f20394Oooo0oO;
            int i10 = this.f20421ooOO;
            rectF5.inset(i10, -i10);
            canvas.clipRect(this.f20394Oooo0oO, Region.Op.DIFFERENCE);
            this.f20394Oooo0oO.set(this.f20393Oooo0o);
            RectF rectF6 = this.f20394Oooo0oO;
            int i11 = this.f20421ooOO;
            rectF6.inset(-i11, i11);
            canvas.clipRect(this.f20394Oooo0oO, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f20393Oooo0o, this.f20409OooooOO);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f20395Oooo0oo = width - paddingLeft;
            this.f20392Oooo = height - paddingTop;
            if (this.f20419o00o0O) {
                this.f20419o00o0O = false;
                setTargetAspectRatio(this.f20396OoooO);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f20393Oooo0o.isEmpty() || this.f20410OooooOo == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
            double d = this.f20414Ooooooo;
            int i = -1;
            for (int i2 = 0; i2 < 8; i2 += 2) {
                double dSqrt = Math.sqrt(Math.pow(y - this.f20398OoooO00[i2 + 1], 2.0d) + Math.pow(x - this.f20398OoooO00[i2], 2.0d));
                if (dSqrt < d) {
                    i = i2 / 2;
                    d = dSqrt;
                }
            }
            int i3 = (this.f20410OooooOo == 1 && i < 0 && this.f20393Oooo0o.contains(x, y)) ? 4 : i;
            this.f20413OoooooO = i3;
            boolean z = i3 != -1;
            if (!z) {
                this.f20412Oooooo0 = -1.0f;
                this.f20411Oooooo = -1.0f;
            } else if (this.f20412Oooooo0 < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f20412Oooooo0 = x;
                this.f20411Oooooo = y;
            }
            return z;
        }
        if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) != 2 || motionEvent.getPointerCount() != 1 || this.f20413OoooooO == -1) {
            if ((motionEvent.getAction() & KotlinVersion.MAX_COMPONENT_VALUE) != 1) {
                return false;
            }
            this.f20412Oooooo0 = -1.0f;
            this.f20411Oooooo = -1.0f;
            this.f20413OoooooO = -1;
            o000O00 o000o01 = this.f20418o00Ooo;
            if (o000o01 == null) {
                return false;
            }
            ((o0000O0O) o000o01).f40439OooO00o.f20438Oooo0o.setCropRect(this.f20393Oooo0o);
            return false;
        }
        float fMin = Math.min(Math.max(x, getPaddingLeft()), getWidth() - getPaddingRight());
        float fMin2 = Math.min(Math.max(y, getPaddingTop()), getHeight() - getPaddingBottom());
        this.f20394Oooo0oO.set(this.f20393Oooo0o);
        int i4 = this.f20413OoooooO;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            this.f20394Oooo0oO.offset(fMin - this.f20412Oooooo0, fMin2 - this.f20411Oooooo);
                            if (this.f20394Oooo0oO.left > getLeft() && this.f20394Oooo0oO.top > getTop() && this.f20394Oooo0oO.right < getRight() && this.f20394Oooo0oO.bottom < getBottom()) {
                                this.f20393Oooo0o.set(this.f20394Oooo0oO);
                                OooO00o();
                                postInvalidate();
                            }
                        }
                        this.f20412Oooooo0 = fMin;
                        this.f20411Oooooo = fMin2;
                        return true;
                    }
                    if (this.f20417o00Oo0) {
                        RectF rectF = this.f20394Oooo0oO;
                        RectF rectF2 = this.f20393Oooo0o;
                        rectF.set(fMin, rectF2.top, rectF2.right, fMin2);
                    }
                } else if (this.f20417o00Oo0) {
                    RectF rectF3 = this.f20394Oooo0oO;
                    RectF rectF4 = this.f20393Oooo0o;
                    rectF3.set(rectF4.left, rectF4.top, fMin, fMin2);
                }
            } else if (this.f20417o00Oo0) {
                RectF rectF5 = this.f20394Oooo0oO;
                RectF rectF6 = this.f20393Oooo0o;
                rectF5.set(rectF6.left, fMin2, fMin, rectF6.bottom);
            }
        } else if (this.f20417o00Oo0) {
            RectF rectF7 = this.f20394Oooo0oO;
            RectF rectF8 = this.f20393Oooo0o;
            rectF7.set(fMin, fMin2, rectF8.right, rectF8.bottom);
        }
        boolean z2 = this.f20394Oooo0oO.height() >= ((float) this.f20420o0OoOo0);
        boolean z3 = this.f20394Oooo0oO.width() >= ((float) this.f20420o0OoOo0);
        RectF rectF9 = this.f20393Oooo0o;
        rectF9.set(z3 ? this.f20394Oooo0oO.left : rectF9.left, z2 ? this.f20394Oooo0oO.top : rectF9.top, z3 ? this.f20394Oooo0oO.right : rectF9.right, z2 ? this.f20394Oooo0oO.bottom : rectF9.bottom);
        if (z2 || z3) {
            OooO00o();
            postInvalidate();
        }
        this.f20412Oooooo0 = fMin;
        this.f20411Oooooo = fMin2;
        return true;
    }

    public void setCircleDimmedLayer(boolean z) {
        this.f20402OoooOOo = z;
    }

    public void setCropFrameColor(@ColorInt int i) {
        this.f20408OooooO0.setColor(i);
    }

    public void setCropFrameStrokeWidth(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f20408OooooO0.setStrokeWidth(i);
    }

    public void setCropGridColor(@ColorInt int i) {
        this.f20407Ooooo0o.setColor(i);
    }

    public void setCropGridColumnCount(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f20399OoooO0O = i;
        this.f20400OoooOO0 = null;
    }

    public void setCropGridRowCount(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f20397OoooO0 = i;
        this.f20400OoooOO0 = null;
    }

    public void setCropGridStrokeWidth(@IntRange(from = ULong.MIN_VALUE) int i) {
        this.f20407Ooooo0o.setStrokeWidth(i);
    }

    public void setDimmedBorderColor(@ColorInt int i) {
        this.f20404OoooOoO = i;
        Paint paint = this.f20406Ooooo00;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setDimmedColor(@ColorInt int i) {
        this.f20403OoooOo0 = i;
    }

    public void setDimmedStrokeWidth(int i) {
        this.f20416o00O0O = i;
        Paint paint = this.f20406Ooooo00;
        if (paint != null) {
            paint.setStrokeWidth(i);
        }
    }

    public void setDragFrame(boolean z) {
        this.f20417o00Oo0 = z;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.f20410OooooOo = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.f20410OooooOo = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(o000O00 o000o01) {
        this.f20418o00Ooo = o000o01;
    }

    public void setShowCropFrame(boolean z) {
        this.f20415o000oOoO = z;
    }

    public void setShowCropGrid(boolean z) {
        this.f20401OoooOOO = z;
    }

    public void setTargetAspectRatio(float f) {
        this.f20396OoooO = f;
        int i = this.f20395Oooo0oo;
        if (i <= 0) {
            this.f20419o00o0O = true;
            return;
        }
        int i2 = (int) (i / f);
        int i3 = this.f20392Oooo;
        if (i2 > i3) {
            int i4 = (int) (i3 * f);
            int i5 = (i - i4) / 2;
            this.f20393Oooo0o.set(getPaddingLeft() + i5, getPaddingTop(), getPaddingLeft() + i4 + i5, getPaddingTop() + this.f20392Oooo);
        } else {
            int i6 = (i3 - i2) / 2;
            this.f20393Oooo0o.set(getPaddingLeft(), getPaddingTop() + i6, getPaddingLeft() + this.f20395Oooo0oo, getPaddingTop() + i2 + i6);
        }
        o000O00 o000o01 = this.f20418o00Ooo;
        if (o000o01 != null) {
            ((o0000O0O) o000o01).f40439OooO00o.f20438Oooo0o.setCropRect(this.f20393Oooo0o);
        }
        OooO00o();
        postInvalidate();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20393Oooo0o = new RectF();
        this.f20394Oooo0oO = new RectF();
        this.f20400OoooOO0 = null;
        this.f20405OoooOoo = new Path();
        this.f20406Ooooo00 = new Paint(1);
        this.f20407Ooooo0o = new Paint(1);
        this.f20408OooooO0 = new Paint(1);
        this.f20409OooooOO = new Paint(1);
        this.f20410OooooOo = 0;
        this.f20412Oooooo0 = -1.0f;
        this.f20411Oooooo = -1.0f;
        this.f20413OoooooO = -1;
        this.f20416o00O0O = 1;
        this.f20417o00Oo0 = true;
        this.f20414Ooooooo = getResources().getDimensionPixelSize(OooOO0.ucrop_default_crop_rect_corner_touch_threshold);
        this.f20420o0OoOo0 = getResources().getDimensionPixelSize(OooOO0.ucrop_default_crop_rect_min_size);
        this.f20421ooOO = getResources().getDimensionPixelSize(OooOO0.ucrop_default_crop_rect_corner_touch_area_line_length);
    }
}
