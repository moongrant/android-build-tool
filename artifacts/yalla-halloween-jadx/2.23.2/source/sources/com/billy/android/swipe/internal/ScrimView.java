package com.billy.android.swipe.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.billy.android.swipe.OooO;

/* JADX INFO: loaded from: classes2.dex */
public class ScrimView extends View {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Paint f12909OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f12910OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f12911OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f12912OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f12913OooO0oo;

    public ScrimView(Context context) {
        super(context);
        this.f12911OooO0o0 = new Rect();
        new Rect();
        this.f12913OooO0oo = Integer.MIN_VALUE;
        Paint paint = new Paint();
        this.f12909OooO0Oo = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        paint2.setDither(true);
        paint2.setAntiAlias(true);
    }

    public int getShadowColor() {
        return this.f12913OooO0oo;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f12910OooO0o != 0) {
            canvas.drawRect(this.f12911OooO0o0, this.f12909OooO0Oo);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.f12911OooO0o0;
        rect.right = i;
        rect.bottom = i2;
    }

    public void setProgress(float f) {
        OooO.OooO00o oooO00o = OooO.f12886OooO00o;
        this.f12909OooO0Oo.setColor((((int) (this.f12912OooO0oO * Math.max(0.0f, Math.min(f, 1.0f)))) << 24) | (this.f12910OooO0o & 16777215));
    }

    public void setScrimColor(int i) {
        this.f12910OooO0o = i;
        this.f12912OooO0oO = (i & (-16777216)) >>> 24;
    }
}
