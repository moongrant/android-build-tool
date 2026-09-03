package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.OooO00o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o0OO0.OooO0o;
import p633o0ooO0Oo.o0O00;
import p634o0ooO0o.o0OOO0;
import p636o0ooO0oO.o0O00o00;
import p637o0ooO0oo.o0O0O0O;

/* JADX INFO: loaded from: classes5.dex */
public class BezierPagerIndicator extends View implements o0O00o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33127OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<o0O0O0O> f33128OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f33129OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f33130OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33131OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33132OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33133OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33134OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Paint f33135OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public List<Integer> f33136OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Path f33137OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Interpolator f33138OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Interpolator f33139OooOOOo;

    public BezierPagerIndicator(Context context) {
        super(context);
        this.f33137OooOOO0 = new Path();
        this.f33138OooOOOO = new AccelerateInterpolator();
        this.f33139OooOOOo = new DecelerateInterpolator();
        Paint paint = new Paint(1);
        this.f33135OooOO0o = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33133OooOO0 = OooO0o.OooO0O0(context, 3.5d);
        this.f33134OooOO0O = OooO0o.OooO0O0(context, 2.0d);
        this.f33127OooO = OooO0o.OooO0O0(context, 1.5d);
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO00o() {
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0O0(ArrayList arrayList) {
        this.f33128OooO0Oo = arrayList;
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0OO(int i, float f) {
        List<o0O0O0O> list = this.f33128OooO0Oo;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Integer> list2 = this.f33136OooOOO;
        if (list2 != null && list2.size() > 0) {
            this.f33135OooOO0o.setColor(o0OOO0.OooO00o(this.f33136OooOOO.get(Math.abs(i) % this.f33136OooOOO.size()).intValue(), f, this.f33136OooOOO.get(Math.abs(i + 1) % this.f33136OooOOO.size()).intValue()));
        }
        o0O0O0O o0o0o0oOooO00o = o0O00.OooO00o(i, this.f33128OooO0Oo);
        o0O0O0O o0o0o0oOooO00o2 = o0O00.OooO00o(i + 1, this.f33128OooO0Oo);
        int i2 = o0o0o0oOooO00o.f57700OooO00o;
        float fOooO00o = OooO00o.OooO00o(o0o0o0oOooO00o.f57702OooO0OO, i2, 2, i2);
        int i3 = o0o0o0oOooO00o2.f57700OooO00o;
        float fOooO00o2 = OooO00o.OooO00o(o0o0o0oOooO00o2.f57702OooO0OO, i3, 2, i3) - fOooO00o;
        this.f33129OooO0o = (this.f33138OooOOOO.getInterpolation(f) * fOooO00o2) + fOooO00o;
        this.f33132OooO0oo = (this.f33139OooOOOo.getInterpolation(f) * fOooO00o2) + fOooO00o;
        float f2 = this.f33133OooOO0;
        this.f33130OooO0o0 = (this.f33139OooOOOo.getInterpolation(f) * (this.f33134OooOO0O - f2)) + f2;
        float f3 = this.f33134OooOO0O;
        this.f33131OooO0oO = (this.f33138OooOOOO.getInterpolation(f) * (this.f33133OooOO0 - f3)) + f3;
        invalidate();
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0Oo() {
    }

    public float getMaxCircleRadius() {
        return this.f33133OooOO0;
    }

    public float getMinCircleRadius() {
        return this.f33134OooOO0O;
    }

    public float getYOffset() {
        return this.f33127OooO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(this.f33129OooO0o, (getHeight() - this.f33127OooO) - this.f33133OooOO0, this.f33130OooO0o0, this.f33135OooOO0o);
        canvas.drawCircle(this.f33132OooO0oo, (getHeight() - this.f33127OooO) - this.f33133OooOO0, this.f33131OooO0oO, this.f33135OooOO0o);
        Path path = this.f33137OooOOO0;
        path.reset();
        float height = (getHeight() - this.f33127OooO) - this.f33133OooOO0;
        path.moveTo(this.f33132OooO0oo, height);
        path.lineTo(this.f33132OooO0oo, height - this.f33131OooO0oO);
        float f = this.f33132OooO0oo;
        float f2 = this.f33129OooO0o;
        path.quadTo(((f2 - f) / 2.0f) + f, height, f2, height - this.f33130OooO0o0);
        path.lineTo(this.f33129OooO0o, this.f33130OooO0o0 + height);
        float f3 = this.f33132OooO0oo;
        path.quadTo(((this.f33129OooO0o - f3) / 2.0f) + f3, height, f3, this.f33131OooO0oO + height);
        path.close();
        canvas.drawPath(path, this.f33135OooOO0o);
    }

    public void setColors(Integer... numArr) {
        this.f33136OooOOO = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f33139OooOOOo = interpolator;
        if (interpolator == null) {
            this.f33139OooOOOo = new DecelerateInterpolator();
        }
    }

    public void setMaxCircleRadius(float f) {
        this.f33133OooOO0 = f;
    }

    public void setMinCircleRadius(float f) {
        this.f33134OooOO0O = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f33138OooOOOO = interpolator;
        if (interpolator == null) {
            this.f33138OooOOOO = new AccelerateInterpolator();
        }
    }

    public void setYOffset(float f) {
        this.f33127OooO = f;
    }
}
