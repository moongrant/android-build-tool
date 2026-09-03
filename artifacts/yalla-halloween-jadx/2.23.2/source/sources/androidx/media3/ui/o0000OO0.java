package androidx.media3.ui;

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

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public CharSequence f9806OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f9807OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f9808OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f9809OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f9810OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TextPaint f9811OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f9812OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Paint f9813OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Paint f9814OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f9815OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public Bitmap f9816OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f9817OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f9818OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f9819OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f9820OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f9821OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f9822OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f9823OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f9824OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f9825OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f9826OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f9827OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f9828OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f9829OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f9830OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f9831OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f9832OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f9833OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f9834OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f9835OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public StaticLayout f9836OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public int f9837Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public StaticLayout f9838Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f9839Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f9840Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public Rect f9841Oooo0O0;

    public o0000OO0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f9812OooO0o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f9810OooO0Oo = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f9807OooO00o = fRound;
        this.f9808OooO0O0 = fRound;
        this.f9809OooO0OO = fRound;
        TextPaint textPaint = new TextPaint();
        this.f9811OooO0o = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f9813OooO0oO = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f9814OooO0oo = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void OooO00o(Canvas canvas, boolean z) {
        if (!z) {
            this.f9841Oooo0O0.getClass();
            this.f9816OooOO0O.getClass();
            canvas.drawBitmap(this.f9816OooOO0O, (Rect) null, this.f9841Oooo0O0, this.f9814OooO0oo);
            return;
        }
        StaticLayout staticLayout = this.f9836OooOooo;
        StaticLayout staticLayout2 = this.f9838Oooo000;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f9839Oooo00O, this.f9840Oooo00o);
        if (Color.alpha(this.f9826OooOo0) > 0) {
            Paint paint = this.f9813OooO0oO;
            paint.setColor(this.f9826OooOo0);
            canvas.drawRect(-this.f9837Oooo0, 0.0f, staticLayout.getWidth() + this.f9837Oooo0, staticLayout.getHeight(), paint);
        }
        int i = this.f9829OooOo0o;
        TextPaint textPaint = this.f9811OooO0o;
        if (i == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f9807OooO00o);
            textPaint.setColor(this.f9828OooOo0O);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f = this.f9808OooO0O0;
            if (i == 2) {
                float f2 = this.f9809OooO0OO;
                textPaint.setShadowLayer(f, f2, f2, this.f9828OooOo0O);
            } else if (i == 3 || i == 4) {
                boolean z2 = i == 3;
                int i2 = z2 ? -1 : this.f9828OooOo0O;
                int i3 = z2 ? this.f9828OooOo0O : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f9824OooOOoo);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i2);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f, f3, f3, i3);
            }
        }
        textPaint.setColor(this.f9824OooOOoo);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}
