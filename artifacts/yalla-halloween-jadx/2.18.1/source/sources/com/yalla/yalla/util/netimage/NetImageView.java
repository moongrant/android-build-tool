package com.yalla.yalla.util.netimage;

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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p444o0OoOo0O.o0O0OO0;

/* JADX INFO: loaded from: classes3.dex */
public class NetImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Context f26274Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f26275OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f26276OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f26277OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f26278OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public int f26279OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f26280OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f26281OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f26282OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public PorterDuffXfermode f26283OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f26284OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f26285Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f26286Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public float f26287OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public float[] f26288OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public float[] f26289OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public RectF f26290Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public RectF f26291Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public Paint f26292OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public Path f26293Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f26294o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public Path f26295o0OoOo0;

    public NetImageView(Context context) {
        this(context, null);
    }

    public final void OooO(int i, int i2, int i3, int i4) {
        boolean z = this.f26274Oooo.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f26294o000oOoO = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        this.f26280OoooOOO = i;
        this.f26281OoooOOo = z ? i4 : i3;
        if (!z) {
            i3 = i4;
        }
        this.f26282OoooOo0 = i3;
        OooO0oO();
        OooO0Oo(true);
    }

    public final void OooO0OO() {
        if (this.f26277OoooO00) {
            return;
        }
        int i = 0;
        if (this.f26279OoooOO0 <= 0) {
            float[] fArr = this.f26288OooooOO;
            int i2 = this.f26294o000oOoO;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.f26280OoooOOO;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.f26282OoooOo0;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.f26281OoooOOo;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.f26289OooooOo;
            int i6 = this.f26278OoooO0O;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.f26288OooooOO;
            if (i >= fArr3.length) {
                return;
            }
            float fAbs = this.f26279OoooOO0 - (this.f26278OoooO0O / 2.0f);
            if (fAbs <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                fAbs = Math.abs(fAbs);
            }
            fArr3[i] = fAbs;
            if (this.f26284OoooOoo) {
                this.f26289OooooOo[i] = this.f26279OoooOO0 - this.f26278OoooO0O;
            } else {
                this.f26289OooooOo[i] = this.f26279OoooOO0;
            }
            i++;
        }
    }

    public final void OooO0Oo(boolean z) {
        if (z) {
            this.f26279OoooOO0 = 0;
        }
        OooO0OO();
        OooO0o();
        invalidate();
    }

    public final void OooO0o() {
        if (this.f26277OoooO00) {
            return;
        }
        RectF rectF = this.f26290Oooooo;
        int i = this.f26278OoooO0O;
        rectF.set(i / 2.0f, i / 2.0f, this.f26285Ooooo00 - (i / 2.0f), this.f26286Ooooo0o - (i / 2.0f));
    }

    public final void OooO0o0(int i, int i2) {
        this.f26293Ooooooo.reset();
        this.f26292OoooooO.setStrokeWidth(i);
        this.f26292OoooooO.setColor(i2);
        this.f26292OoooooO.setStyle(Paint.Style.STROKE);
    }

    public final void OooO0oO() {
        if (!this.f26277OoooO00) {
            if (!this.f26284OoooOoo) {
                this.f26291Oooooo0.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f26285Ooooo00, this.f26286Ooooo0o);
                return;
            }
            RectF rectF = this.f26291Oooooo0;
            int i = this.f26278OoooO0O;
            rectF.set(i + 0, i + 0, this.f26285Ooooo00 - i, this.f26286Ooooo0o - i);
            return;
        }
        float fMin = Math.min(this.f26285Ooooo00, this.f26286Ooooo0o) / 2.0f;
        this.f26287OooooO0 = fMin;
        if (!this.f26284OoooOoo) {
            RectF rectF2 = this.f26291Oooooo0;
            int i2 = this.f26285Ooooo00;
            int i3 = this.f26286Ooooo0o;
            rectF2.set((i2 / 2.0f) - fMin, (i3 / 2.0f) - fMin, (i2 / 2.0f) + fMin, (i3 / 2.0f) + fMin);
            return;
        }
        RectF rectF3 = this.f26291Oooooo0;
        int i4 = this.f26285Ooooo00;
        int i5 = this.f26278OoooO0O;
        int i6 = this.f26286Ooooo0o;
        rectF3.set(((i4 / 2.0f) - fMin) + i5, ((i6 / 2.0f) - fMin) + i5, ((i4 / 2.0f) + fMin) - i5, ((i6 / 2.0f) + fMin) - i5);
    }

    public final void OooO0oo(boolean z) {
        OooO0oO();
        if (this.f26277OoooO00 == z) {
            return;
        }
        this.f26277OoooO00 = z;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.f26291Oooooo0, null, 31);
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f26292OoooooO.reset();
        this.f26293Ooooooo.reset();
        if (!this.f26277OoooO00) {
            this.f26293Ooooooo.addRoundRect(this.f26291Oooooo0, this.f26289OooooOo, Path.Direction.CCW);
        } else if (this.f26284OoooOoo) {
            this.f26293Ooooooo.addCircle(this.f26285Ooooo00 / 2.0f, this.f26286Ooooo0o / 2.0f, this.f26287OooooO0 - this.f26278OoooO0O, Path.Direction.CCW);
        } else {
            this.f26293Ooooooo.addCircle(this.f26285Ooooo00 / 2.0f, this.f26286Ooooo0o / 2.0f, this.f26287OooooO0, Path.Direction.CCW);
        }
        this.f26292OoooooO.setAntiAlias(true);
        this.f26292OoooooO.setStyle(Paint.Style.FILL);
        this.f26292OoooooO.setXfermode(this.f26283OoooOoO);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.f26293Ooooooo, this.f26292OoooooO);
        } else {
            this.f26295o0OoOo0.reset();
            this.f26295o0OoOo0.addRect(this.f26291Oooooo0, Path.Direction.CCW);
            this.f26295o0OoOo0.op(this.f26293Ooooooo, Path.Op.DIFFERENCE);
            canvas.drawPath(this.f26295o0OoOo0, this.f26292OoooooO);
        }
        this.f26292OoooooO.setXfermode(null);
        canvas.restore();
        if (this.f26277OoooO00) {
            int i = this.f26278OoooO0O;
            if (i > 0) {
                int i2 = this.f26275OoooO;
                float f = this.f26287OooooO0 - (i / 2);
                OooO0o0(i, i2);
                this.f26293Ooooooo.addCircle(this.f26285Ooooo00 / 2.0f, this.f26286Ooooo0o / 2.0f, f, Path.Direction.CCW);
                canvas.drawPath(this.f26293Ooooooo, this.f26292OoooooO);
                return;
            }
            return;
        }
        int i3 = this.f26278OoooO0O;
        if (i3 > 0) {
            int i4 = this.f26275OoooO;
            RectF rectF = this.f26290Oooooo;
            float[] fArr = this.f26288OooooOO;
            OooO0o0(i3, i4);
            this.f26293Ooooooo.addRoundRect(rectF, fArr, Path.Direction.CCW);
            canvas.drawPath(this.f26293Ooooooo, this.f26292OoooooO);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f26276OoooO0) {
            setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
            i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
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
        this.f26285Ooooo00 = i;
        this.f26286Ooooo0o = i2;
        OooO0o();
        OooO0oO();
    }

    public void setBordTrimSrc(boolean z) {
        this.f26284OoooOoo = z;
    }

    public void setBorderColor(@ColorInt int i) {
        this.f26275OoooO = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f26278OoooO0O = i;
        OooO0oO();
        OooO0Oo(false);
    }

    public void setCornerRadius(int i) {
        this.f26279OoooOO0 = i;
        OooO0oO();
        OooO0Oo(false);
    }

    public NetImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26275OoooO = -1;
        this.f26274Oooo = context;
        this.f26288OooooOO = new float[8];
        this.f26289OooooOo = new float[8];
        this.f26290Oooooo = new RectF();
        this.f26291Oooooo0 = new RectF();
        this.f26292OoooooO = new Paint();
        this.f26293Ooooooo = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.f26283OoooOoO = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.f26283OoooOoO = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f26295o0OoOo0 = new Path();
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0O0OO0.NetImageView);
        this.f26279OoooOO0 = typedArrayObtainStyledAttributes.getInteger(4, 0);
        this.f26294o000oOoO = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f26280OoooOOO = typedArrayObtainStyledAttributes.getInteger(3, 0);
        this.f26281OoooOOo = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f26282OoooOo0 = typedArrayObtainStyledAttributes.getInteger(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        OooO0OO();
    }
}
