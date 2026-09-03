package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Arrays;
import java.util.List;
import p387o0OOoo0o.oo0oOO0;
import p418o0Oo0oo.oo000o;
import p653o0ooOooo.lj;
import p655o0ooo0.o00O0OO0;
import p657o0ooo00o.oO0O000;

/* JADX INFO: loaded from: classes3.dex */
public class BezierPagerIndicator extends View implements oO0O000 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f26452Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List<o00O0OO0> f26453Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f26454Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f26455Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f26456OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f26457OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f26458OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public float f26459OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public Paint f26460OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public List<Integer> f26461OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public Interpolator f26462OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public Interpolator f26463OoooOo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Path f26464o000oOoO;

    public BezierPagerIndicator(Context context) {
        super(context);
        this.f26464o000oOoO = new Path();
        this.f26462OoooOOo = new AccelerateInterpolator();
        this.f26463OoooOo0 = new DecelerateInterpolator();
        Paint paint = new Paint(1);
        this.f26460OoooOO0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f26459OoooO0O = oo000o.OooO00o(context, 3.5d);
        this.f26456OoooO = oo000o.OooO00o(context, 2.0d);
        this.f26457OoooO0 = oo000o.OooO00o(context, 1.5d);
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO00o() {
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0O0(List<o00O0OO0> list) {
        this.f26453Oooo0o = list;
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0OO(int i, float f) {
        List<o00O0OO0> list = this.f26453Oooo0o;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Integer> list2 = this.f26461OoooOOO;
        if (list2 != null && list2.size() > 0) {
            this.f26460OoooOO0.setColor(oo0oOO0.OooO0O0(f, this.f26461OoooOOO.get(Math.abs(i) % this.f26461OoooOOO.size()).intValue(), this.f26461OoooOOO.get(Math.abs(i + 1) % this.f26461OoooOOO.size()).intValue()));
        }
        o00O0OO0 o00o0oo0OooO00o = lj.OooO00o(this.f26453Oooo0o, i);
        o00O0OO0 o00o0oo0OooO00o2 = lj.OooO00o(this.f26453Oooo0o, i + 1);
        int i2 = o00o0oo0OooO00o.f51172OooO00o;
        float f2 = ((o00o0oo0OooO00o.f51174OooO0OO - i2) / 2) + i2;
        int i3 = o00o0oo0OooO00o2.f51172OooO00o;
        float f3 = (((o00o0oo0OooO00o2.f51174OooO0OO - i3) / 2) + i3) - f2;
        this.f26455Oooo0oo = (this.f26462OoooOOo.getInterpolation(f) * f3) + f2;
        this.f26458OoooO00 = (this.f26463OoooOo0.getInterpolation(f) * f3) + f2;
        float f4 = this.f26459OoooO0O;
        this.f26454Oooo0oO = (this.f26463OoooOo0.getInterpolation(f) * (this.f26456OoooO - f4)) + f4;
        float f5 = this.f26456OoooO;
        this.f26452Oooo = (this.f26462OoooOOo.getInterpolation(f) * (this.f26459OoooO0O - f5)) + f5;
        invalidate();
    }

    @Override // p657o0ooo00o.oO0O000
    public final void OooO0Oo() {
    }

    public float getMaxCircleRadius() {
        return this.f26459OoooO0O;
    }

    public float getMinCircleRadius() {
        return this.f26456OoooO;
    }

    public float getYOffset() {
        return this.f26457OoooO0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(this.f26455Oooo0oo, (getHeight() - this.f26457OoooO0) - this.f26459OoooO0O, this.f26454Oooo0oO, this.f26460OoooOO0);
        canvas.drawCircle(this.f26458OoooO00, (getHeight() - this.f26457OoooO0) - this.f26459OoooO0O, this.f26452Oooo, this.f26460OoooOO0);
        this.f26464o000oOoO.reset();
        float height = (getHeight() - this.f26457OoooO0) - this.f26459OoooO0O;
        this.f26464o000oOoO.moveTo(this.f26458OoooO00, height);
        this.f26464o000oOoO.lineTo(this.f26458OoooO00, height - this.f26452Oooo);
        Path path = this.f26464o000oOoO;
        float f = this.f26458OoooO00;
        float f2 = this.f26455Oooo0oo;
        path.quadTo(((f2 - f) / 2.0f) + f, height, f2, height - this.f26454Oooo0oO);
        this.f26464o000oOoO.lineTo(this.f26455Oooo0oo, this.f26454Oooo0oO + height);
        Path path2 = this.f26464o000oOoO;
        float f3 = this.f26458OoooO00;
        path2.quadTo(((this.f26455Oooo0oo - f3) / 2.0f) + f3, height, f3, this.f26452Oooo + height);
        this.f26464o000oOoO.close();
        canvas.drawPath(this.f26464o000oOoO, this.f26460OoooOO0);
    }

    public void setColors(Integer... numArr) {
        this.f26461OoooOOO = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f26463OoooOo0 = interpolator;
        if (interpolator == null) {
            this.f26463OoooOo0 = new DecelerateInterpolator();
        }
    }

    public void setMaxCircleRadius(float f) {
        this.f26459OoooO0O = f;
    }

    public void setMinCircleRadius(float f) {
        this.f26456OoooO = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f26462OoooOOo = interpolator;
        if (interpolator == null) {
            this.f26462OoooOOo = new AccelerateInterpolator();
        }
    }

    public void setYOffset(float f) {
        this.f26457OoooO0 = f;
    }
}
