package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
import o0OO0.OooO0o;
import p633o0ooO0Oo.o0O00;
import p636o0ooO0oO.o0O00o00;
import p637o0ooO0oo.o0O0O0O;

/* JADX INFO: loaded from: classes5.dex */
public class WrapPagerIndicator extends View implements o0O00o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Interpolator f33169OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33170OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33171OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33172OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33173OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Interpolator f33174OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public List<o0O0O0O> f33175OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Paint f33176OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final RectF f33177OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f33178OooOOO0;

    public WrapPagerIndicator(Context context) {
        super(context);
        this.f33174OooO0oo = new LinearInterpolator();
        this.f33169OooO = new LinearInterpolator();
        this.f33177OooOO0o = new RectF();
        Paint paint = new Paint(1);
        this.f33176OooOO0O = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33170OooO0Oo = OooO0o.OooO0O0(context, 6.0d);
        this.f33172OooO0o0 = OooO0o.OooO0O0(context, 10.0d);
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO00o() {
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0O0(ArrayList arrayList) {
        this.f33175OooOO0 = arrayList;
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0OO(int i, float f) {
        List<o0O0O0O> list = this.f33175OooOO0;
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0O0O o0o0o0oOooO00o = o0O00.OooO00o(i, this.f33175OooOO0);
        o0O0O0O o0o0o0oOooO00o2 = o0O00.OooO00o(i + 1, this.f33175OooOO0);
        RectF rectF = this.f33177OooOO0o;
        int i2 = o0o0o0oOooO00o.f57705OooO0o0;
        rectF.left = (this.f33169OooO.getInterpolation(f) * (o0o0o0oOooO00o2.f57705OooO0o0 - i2)) + (i2 - this.f33172OooO0o0);
        rectF.top = o0o0o0oOooO00o.f57704OooO0o - this.f33170OooO0Oo;
        int i3 = o0o0o0oOooO00o.f57706OooO0oO;
        rectF.right = (this.f33174OooO0oo.getInterpolation(f) * (o0o0o0oOooO00o2.f57706OooO0oO - i3)) + this.f33172OooO0o0 + i3;
        rectF.bottom = o0o0o0oOooO00o.f57707OooO0oo + this.f33170OooO0Oo;
        if (!this.f33178OooOOO0) {
            this.f33173OooO0oO = rectF.height() / 2.0f;
        }
        invalidate();
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0Oo() {
    }

    public Interpolator getEndInterpolator() {
        return this.f33169OooO;
    }

    public int getFillColor() {
        return this.f33171OooO0o;
    }

    public int getHorizontalPadding() {
        return this.f33172OooO0o0;
    }

    public Paint getPaint() {
        return this.f33176OooOO0O;
    }

    public float getRoundRadius() {
        return this.f33173OooO0oO;
    }

    public Interpolator getStartInterpolator() {
        return this.f33174OooO0oo;
    }

    public int getVerticalPadding() {
        return this.f33170OooO0Oo;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f33176OooOO0O.setColor(this.f33171OooO0o);
        RectF rectF = this.f33177OooOO0o;
        float f = this.f33173OooO0oO;
        canvas.drawRoundRect(rectF, f, f, this.f33176OooOO0O);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f33169OooO = interpolator;
        if (interpolator == null) {
            this.f33169OooO = new LinearInterpolator();
        }
    }

    public void setFillColor(int i) {
        this.f33171OooO0o = i;
    }

    public void setHorizontalPadding(int i) {
        this.f33172OooO0o0 = i;
    }

    public void setRoundRadius(float f) {
        this.f33173OooO0oO = f;
        this.f33178OooOOO0 = true;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f33174OooO0oo = interpolator;
        if (interpolator == null) {
            this.f33174OooO0oo = new LinearInterpolator();
        }
    }

    public void setVerticalPadding(int i) {
        this.f33170OooO0Oo = i;
    }
}
