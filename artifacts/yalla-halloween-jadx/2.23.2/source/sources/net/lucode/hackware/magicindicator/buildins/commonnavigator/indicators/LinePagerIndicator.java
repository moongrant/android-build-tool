package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import OooO0OO.OooO00o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o0OO0.OooO0o;
import p633o0ooO0Oo.o0O00;
import p634o0ooO0o.o0OOO0;
import p636o0ooO0oO.o0O00o00;
import p637o0ooO0oo.o0O0O0O;

/* JADX INFO: loaded from: classes5.dex */
public class LinePagerIndicator extends View implements o0O00o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33140OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Interpolator f33142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Interpolator f33143OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33144OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33145OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33146OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33147OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Paint f33148OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public List<Integer> f33149OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public List<o0O0O0O> f33150OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final RectF f33151OooOOOO;

    public LinePagerIndicator(Context context) {
        super(context);
        this.f33143OooO0o0 = new LinearInterpolator();
        this.f33142OooO0o = new LinearInterpolator();
        this.f33151OooOOOO = new RectF();
        Paint paint = new Paint(1);
        this.f33148OooOO0o = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33145OooO0oo = OooO0o.OooO0O0(context, 3.0d);
        this.f33146OooOO0 = OooO0o.OooO0O0(context, 10.0d);
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO00o() {
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0O0(ArrayList arrayList) {
        this.f33150OooOOO0 = arrayList;
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0OO(int i, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2;
        List<o0O0O0O> list = this.f33150OooOOO0;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Integer> list2 = this.f33149OooOOO;
        if (list2 != null && list2.size() > 0) {
            this.f33148OooOO0o.setColor(o0OOO0.OooO00o(this.f33149OooOOO.get(Math.abs(i) % this.f33149OooOOO.size()).intValue(), f, this.f33149OooOOO.get(Math.abs(i + 1) % this.f33149OooOOO.size()).intValue()));
        }
        o0O0O0O o0o0o0oOooO00o = o0O00.OooO00o(i, this.f33150OooOOO0);
        o0O0O0O o0o0o0oOooO00o2 = o0O00.OooO00o(i + 1, this.f33150OooOOO0);
        int i3 = this.f33141OooO0Oo;
        if (i3 != 0) {
            if (i3 == 1) {
                float f7 = o0o0o0oOooO00o.f57705OooO0o0;
                f6 = this.f33140OooO;
                f4 = f7 + f6;
                f5 = o0o0o0oOooO00o2.f57705OooO0o0 + f6;
                f2 = o0o0o0oOooO00o.f57706OooO0oO - f6;
                i2 = o0o0o0oOooO00o2.f57706OooO0oO;
            } else {
                int i4 = o0o0o0oOooO00o.f57700OooO00o;
                float f8 = i4;
                float f9 = o0o0o0oOooO00o.f57702OooO0OO - i4;
                float f10 = this.f33146OooOO0;
                float f11 = ((f9 - f10) / 2.0f) + f8;
                int i5 = o0o0o0oOooO00o2.f57700OooO00o;
                float f12 = i5;
                float f13 = o0o0o0oOooO00o2.f57702OooO0OO - i5;
                float f14 = ((f13 - f10) / 2.0f) + f12;
                f2 = ((f9 + f10) / 2.0f) + f8;
                f3 = ((f13 + f10) / 2.0f) + f12;
                f4 = f11;
                f5 = f14;
            }
            RectF rectF = this.f33151OooOOOO;
            rectF.left = (this.f33143OooO0o0.getInterpolation(f) * (f5 - f4)) + f4;
            rectF.right = (this.f33142OooO0o.getInterpolation(f) * (f3 - f2)) + f2;
            rectF.top = (getHeight() - this.f33145OooO0oo) - this.f33144OooO0oO;
            rectF.bottom = getHeight() - this.f33144OooO0oO;
            invalidate();
        }
        float f15 = o0o0o0oOooO00o.f57700OooO00o;
        f6 = this.f33140OooO;
        f4 = f15 + f6;
        f5 = o0o0o0oOooO00o2.f57700OooO00o + f6;
        f2 = o0o0o0oOooO00o.f57702OooO0OO - f6;
        i2 = o0o0o0oOooO00o2.f57702OooO0OO;
        f3 = i2 - f6;
        RectF rectF2 = this.f33151OooOOOO;
        rectF2.left = (this.f33143OooO0o0.getInterpolation(f) * (f5 - f4)) + f4;
        rectF2.right = (this.f33142OooO0o.getInterpolation(f) * (f3 - f2)) + f2;
        rectF2.top = (getHeight() - this.f33145OooO0oo) - this.f33144OooO0oO;
        rectF2.bottom = getHeight() - this.f33144OooO0oO;
        invalidate();
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0Oo() {
    }

    public List<Integer> getColors() {
        return this.f33149OooOOO;
    }

    public Interpolator getEndInterpolator() {
        return this.f33142OooO0o;
    }

    public float getLineHeight() {
        return this.f33145OooO0oo;
    }

    public float getLineWidth() {
        return this.f33146OooOO0;
    }

    public int getMode() {
        return this.f33141OooO0Oo;
    }

    public Paint getPaint() {
        return this.f33148OooOO0o;
    }

    public float getRoundRadius() {
        return this.f33147OooOO0O;
    }

    public Interpolator getStartInterpolator() {
        return this.f33143OooO0o0;
    }

    public float getXOffset() {
        return this.f33140OooO;
    }

    public float getYOffset() {
        return this.f33144OooO0oO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.f33151OooOOOO;
        float f = this.f33147OooOO0O;
        canvas.drawRoundRect(rectF, f, f, this.f33148OooOO0o);
    }

    public void setColors(Integer... numArr) {
        this.f33149OooOOO = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f33142OooO0o = interpolator;
        if (interpolator == null) {
            this.f33142OooO0o = new LinearInterpolator();
        }
    }

    public void setLineHeight(float f) {
        this.f33145OooO0oo = f;
    }

    public void setLineWidth(float f) {
        this.f33146OooOO0 = f;
    }

    public void setMode(int i) {
        if (i != 2 && i != 0 && i != 1) {
            throw new IllegalArgumentException(OooO00o.OooO00o("mode ", i, " not supported."));
        }
        this.f33141OooO0Oo = i;
    }

    public void setRoundRadius(float f) {
        this.f33147OooOO0O = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f33143OooO0o0 = interpolator;
        if (interpolator == null) {
            this.f33143OooO0o0 = new LinearInterpolator();
        }
    }

    public void setXOffset(float f) {
        this.f33140OooO = f;
    }

    public void setYOffset(float f) {
        this.f33144OooO0oO = f;
    }
}
