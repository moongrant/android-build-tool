package com.billy.android.swipe.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p209o00o0oOO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public class ScrimView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f12338Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Paint f12339Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Rect f12340Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f12341Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f12342OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Paint f12343OoooO00;

    public ScrimView(Context context) {
        super(context);
        this.f12340Oooo0oO = new Rect();
        new Rect();
        this.f12342OoooO0 = Integer.MIN_VALUE;
        Paint paint = new Paint();
        this.f12339Oooo0o = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f12343OoooO00 = paint2;
        paint2.setDither(true);
        this.f12343OoooO00.setAntiAlias(true);
    }

    public int getShadowColor() {
        return this.f12342OoooO0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f12341Oooo0oo != 0) {
            canvas.drawRect(this.f12340Oooo0oO, this.f12339Oooo0o);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = this.f12340Oooo0oO;
        rect.right = i;
        rect.bottom = i2;
    }

    public void setProgress(float f) {
        oOO00O.OooO00o oooO00o = oOO00O.f33368OooO00o;
        this.f12339Oooo0o.setColor((((int) (this.f12338Oooo * Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Math.min(f, 1.0f)))) << 24) | (this.f12341Oooo0oo & 16777215));
    }

    public void setScrimColor(int i) {
        this.f12341Oooo0oo = i;
        this.f12338Oooo = (i & (-16777216)) >>> 24;
    }
}
