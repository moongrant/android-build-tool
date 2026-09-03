package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;
import p418o0Oo0oo.oo000o;
import p653o0ooOooo.lj;
import p655o0ooo0.o00O0OO0;
import p657o0ooo00o.oO0O000;

/* JADX INFO: loaded from: classes3.dex */
public class WrapPagerIndicator extends View implements oO0O000 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f26494Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f26495Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f26496Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f26497Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Paint f26498OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public Interpolator f26499OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Interpolator f26500OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public List<o00O0OO0> f26501OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public RectF f26502OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f26503o000oOoO;

    public WrapPagerIndicator(Context context) {
        super(context);
        this.f26500OoooO00 = new LinearInterpolator();
        this.f26499OoooO0 = new LinearInterpolator();
        this.f26502OoooOO0 = new RectF();
        Paint paint = new Paint(1);
        this.f26498OoooO = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f26495Oooo0o = oo000o.OooO00o(context, 6.0d);
        this.f26496Oooo0oO = oo000o.OooO00o(context, 10.0d);
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO00o() {
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0O0(List<o00O0OO0> list) {
        this.f26501OoooO0O = list;
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0OO(int i, float f) {
        List<o00O0OO0> list = this.f26501OoooO0O;
        if (list == null || list.isEmpty()) {
            return;
        }
        o00O0OO0 o00o0oo0OooO00o = lj.OooO00o(this.f26501OoooO0O, i);
        o00O0OO0 o00o0oo0OooO00o2 = lj.OooO00o(this.f26501OoooO0O, i + 1);
        RectF rectF = this.f26502OoooOO0;
        int i2 = o00o0oo0OooO00o.f51177OooO0o0;
        rectF.left = (this.f26499OoooO0.getInterpolation(f) * (o00o0oo0OooO00o2.f51177OooO0o0 - i2)) + (i2 - this.f26496Oooo0oO);
        RectF rectF2 = this.f26502OoooOO0;
        rectF2.top = o00o0oo0OooO00o.f51176OooO0o - this.f26495Oooo0o;
        int i3 = o00o0oo0OooO00o.f51178OooO0oO;
        rectF2.right = (this.f26500OoooO00.getInterpolation(f) * (o00o0oo0OooO00o2.f51178OooO0oO - i3)) + this.f26496Oooo0oO + i3;
        RectF rectF3 = this.f26502OoooOO0;
        rectF3.bottom = o00o0oo0OooO00o.f51179OooO0oo + this.f26495Oooo0o;
        if (!this.f26503o000oOoO) {
            this.f26494Oooo = rectF3.height() / 2.0f;
        }
        invalidate();
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0Oo() {
    }

    public Interpolator getEndInterpolator() {
        return this.f26499OoooO0;
    }

    public int getFillColor() {
        return this.f26497Oooo0oo;
    }

    public int getHorizontalPadding() {
        return this.f26496Oooo0oO;
    }

    public Paint getPaint() {
        return this.f26498OoooO;
    }

    public float getRoundRadius() {
        return this.f26494Oooo;
    }

    public Interpolator getStartInterpolator() {
        return this.f26500OoooO00;
    }

    public int getVerticalPadding() {
        return this.f26495Oooo0o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f26498OoooO.setColor(this.f26497Oooo0oo);
        RectF rectF = this.f26502OoooOO0;
        float f = this.f26494Oooo;
        canvas.drawRoundRect(rectF, f, f, this.f26498OoooO);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f26499OoooO0 = interpolator;
        if (interpolator == null) {
            this.f26499OoooO0 = new LinearInterpolator();
        }
    }

    public void setFillColor(int i) {
        this.f26497Oooo0oo = i;
    }

    public void setHorizontalPadding(int i) {
        this.f26496Oooo0oO = i;
    }

    public void setRoundRadius(float f) {
        this.f26494Oooo = f;
        this.f26503o000oOoO = true;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f26500OoooO00 = interpolator;
        if (interpolator == null) {
            this.f26500OoooO00 = new LinearInterpolator();
        }
    }

    public void setVerticalPadding(int i) {
        this.f26495Oooo0o = i;
    }
}
