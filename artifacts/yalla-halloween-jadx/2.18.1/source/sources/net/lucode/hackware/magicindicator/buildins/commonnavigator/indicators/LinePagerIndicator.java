package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import OooO0O0.OooO00o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.List;
import p387o0OOoo0o.oo0oOO0;
import p418o0Oo0oo.oo000o;
import p653o0ooOooo.lj;
import p655o0ooo0.o00O0OO0;
import p657o0ooo00o.oO0O000;

/* JADX INFO: loaded from: classes3.dex */
public class LinePagerIndicator extends View implements oO0O000 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f26465Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f26466Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Interpolator f26467Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Interpolator f26468Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f26469OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f26470OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f26471OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f26472OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Paint f26473OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public List<Integer> f26474OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public RectF f26475OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public List<o00O0OO0> f26476o000oOoO;

    public LinePagerIndicator(Context context) {
        super(context);
        this.f26467Oooo0oO = new LinearInterpolator();
        this.f26468Oooo0oo = new LinearInterpolator();
        this.f26475OoooOOo = new RectF();
        Paint paint = new Paint(1);
        this.f26473OoooOO0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f26471OoooO00 = oo000o.OooO00o(context, 3.0d);
        this.f26472OoooO0O = oo000o.OooO00o(context, 10.0d);
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO00o() {
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0O0(List<o00O0OO0> list) {
        this.f26476o000oOoO = list;
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0OO(int i, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        List<o00O0OO0> list = this.f26476o000oOoO;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Integer> list2 = this.f26474OoooOOO;
        if (list2 != null && list2.size() > 0) {
            this.f26473OoooOO0.setColor(oo0oOO0.OooO0O0(f, this.f26474OoooOOO.get(Math.abs(i) % this.f26474OoooOOO.size()).intValue(), this.f26474OoooOOO.get(Math.abs(i + 1) % this.f26474OoooOOO.size()).intValue()));
        }
        o00O0OO0 o00o0oo0OooO00o = lj.OooO00o(this.f26476o000oOoO, i);
        o00O0OO0 o00o0oo0OooO00o2 = lj.OooO00o(this.f26476o000oOoO, i + 1);
        int i3 = this.f26466Oooo0o;
        if (i3 != 0) {
            if (i3 == 1) {
                float f7 = o00o0oo0OooO00o.f51177OooO0o0;
                f6 = this.f26470OoooO0;
                f4 = f7 + f6;
                f5 = o00o0oo0OooO00o2.f51177OooO0o0 + f6;
                f2 = o00o0oo0OooO00o.f51178OooO0oO - f6;
                i2 = o00o0oo0OooO00o2.f51178OooO0oO;
            } else {
                int i4 = o00o0oo0OooO00o.f51172OooO00o;
                float f8 = i4;
                float f9 = o00o0oo0OooO00o.f51174OooO0OO - i4;
                float f10 = this.f26472OoooO0O;
                float f11 = ((f9 - f10) / 2.0f) + f8;
                int i5 = o00o0oo0OooO00o2.f51172OooO00o;
                float f12 = i5;
                float f13 = o00o0oo0OooO00o2.f51174OooO0OO - i5;
                float f14 = ((f13 - f10) / 2.0f) + f12;
                f2 = ((f9 + f10) / 2.0f) + f8;
                f3 = ((f13 + f10) / 2.0f) + f12;
                f4 = f11;
                f5 = f14;
            }
            this.f26475OoooOOo.left = (this.f26467Oooo0oO.getInterpolation(f) * (f5 - f4)) + f4;
            this.f26475OoooOOo.right = (this.f26468Oooo0oo.getInterpolation(f) * (f3 - f2)) + f2;
            this.f26475OoooOOo.top = (getHeight() - this.f26471OoooO00) - this.f26465Oooo;
            this.f26475OoooOOo.bottom = getHeight() - this.f26465Oooo;
            invalidate();
        }
        float f15 = o00o0oo0OooO00o.f51172OooO00o;
        f6 = this.f26470OoooO0;
        f4 = f15 + f6;
        f5 = o00o0oo0OooO00o2.f51172OooO00o + f6;
        f2 = o00o0oo0OooO00o.f51174OooO0OO - f6;
        i2 = o00o0oo0OooO00o2.f51174OooO0OO;
        f3 = i2 - f6;
        this.f26475OoooOOo.left = (this.f26467Oooo0oO.getInterpolation(f) * (f5 - f4)) + f4;
        this.f26475OoooOOo.right = (this.f26468Oooo0oo.getInterpolation(f) * (f3 - f2)) + f2;
        this.f26475OoooOOo.top = (getHeight() - this.f26471OoooO00) - this.f26465Oooo;
        this.f26475OoooOOo.bottom = getHeight() - this.f26465Oooo;
        invalidate();
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0Oo() {
    }

    public List<Integer> getColors() {
        return this.f26474OoooOOO;
    }

    public Interpolator getEndInterpolator() {
        return this.f26468Oooo0oo;
    }

    public float getLineHeight() {
        return this.f26471OoooO00;
    }

    public float getLineWidth() {
        return this.f26472OoooO0O;
    }

    public int getMode() {
        return this.f26466Oooo0o;
    }

    public Paint getPaint() {
        return this.f26473OoooOO0;
    }

    public float getRoundRadius() {
        return this.f26469OoooO;
    }

    public Interpolator getStartInterpolator() {
        return this.f26467Oooo0oO;
    }

    public float getXOffset() {
        return this.f26470OoooO0;
    }

    public float getYOffset() {
        return this.f26465Oooo;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f26475OoooOOo;
        float f = this.f26469OoooO;
        canvas.drawRoundRect(rectF, f, f, this.f26473OoooOO0);
    }

    public void setColors(Integer... numArr) {
        this.f26474OoooOOO = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f26468Oooo0oo = interpolator;
        if (interpolator == null) {
            this.f26468Oooo0oo = new LinearInterpolator();
        }
    }

    public void setLineHeight(float f) {
        this.f26471OoooO00 = f;
    }

    public void setLineWidth(float f) {
        this.f26472OoooO0O = f;
    }

    public void setMode(int i) {
        if (i != 2 && i != 0 && i != 1) {
            throw new IllegalArgumentException(OooO00o.OooO00o("mode ", i, " not supported."));
        }
        this.f26466Oooo0o = i;
    }

    public void setRoundRadius(float f) {
        this.f26469OoooO = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f26467Oooo0oO = interpolator;
        if (interpolator == null) {
            this.f26467Oooo0oO = new LinearInterpolator();
        }
    }

    public void setXOffset(float f) {
        this.f26470OoooO0 = f;
    }

    public void setYOffset(float f) {
        this.f26465Oooo = f;
    }
}
