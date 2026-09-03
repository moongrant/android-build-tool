package com.google.android.exoplayer2.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public CharSequence f14082OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f14083OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f14084OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f14085OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f14086OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TextPaint f14087OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f14088OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Paint f14089OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f14090OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f14091OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Bitmap f14092OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f14093OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f14094OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f14095OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f14096OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f14097OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f14098OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f14099OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f14100OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f14101OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f14102OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f14103OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f14104OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f14105OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f14106OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f14107OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f14108OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f14109OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f14110OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f14111OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public StaticLayout f14112OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f14113Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public StaticLayout f14114Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f14115Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f14116Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public Rect f14117Oooo0O0;

    public o0000O00(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f14088OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14086OooO0Oo = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f14083OooO00o = fRound;
        this.f14084OooO0O0 = fRound;
        this.f14085OooO0OO = fRound;
        TextPaint textPaint = new TextPaint();
        this.f14087OooO0o = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f14089OooO0oO = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f14090OooO0oo = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void OooO00o(Canvas canvas, boolean z) {
        if (!z) {
            this.f14117Oooo0O0.getClass();
            this.f14092OooOO0O.getClass();
            canvas.drawBitmap(this.f14092OooOO0O, (Rect) null, this.f14117Oooo0O0, this.f14090OooO0oo);
            return;
        }
        StaticLayout staticLayout = this.f14112OooOooo;
        StaticLayout staticLayout2 = this.f14114Oooo000;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f14115Oooo00O, this.f14116Oooo00o);
        if (Color.alpha(this.f14102OooOo0) > 0) {
            Paint paint = this.f14089OooO0oO;
            paint.setColor(this.f14102OooOo0);
            canvas.drawRect(-this.f14113Oooo0, 0.0f, staticLayout.getWidth() + this.f14113Oooo0, staticLayout.getHeight(), paint);
        }
        int i = this.f14105OooOo0o;
        TextPaint textPaint = this.f14087OooO0o;
        if (i == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f14083OooO00o);
            textPaint.setColor(this.f14104OooOo0O);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f = this.f14084OooO0O0;
            if (i == 2) {
                float f2 = this.f14085OooO0OO;
                textPaint.setShadowLayer(f, f2, f2, this.f14104OooOo0O);
            } else if (i == 3 || i == 4) {
                boolean z2 = i == 3;
                int i2 = z2 ? -1 : this.f14104OooOo0O;
                int i3 = z2 ? this.f14104OooOo0O : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f14100OooOOoo);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i2);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f, f3, f3, i3);
            }
        }
        textPaint.setColor(this.f14100OooOOoo);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}
