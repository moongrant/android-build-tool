package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.billingclient.api.o0Oo0oo;
import java.util.ArrayList;
import java.util.List;
import p628o0ooO0O.oo000o;
import p631o0ooO0Oo.o00O000;
import p633o0ooO0o0.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public class WrapPagerIndicator extends View implements o00O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Interpolator f33702OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33703OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33704OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33705OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33706OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Interpolator f33707OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public List<o0000O00> f33708OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public Paint f33709OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final RectF f33710OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f33711OooOOO0;

    public WrapPagerIndicator(Context context) {
        super(context);
        this.f33707OooO0oo = new LinearInterpolator();
        this.f33702OooO = new LinearInterpolator();
        this.f33710OooOO0o = new RectF();
        Paint paint = new Paint(1);
        this.f33709OooOO0O = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33703OooO0Oo = o0Oo0oo.OooO00o(context, 6.0d);
        this.f33705OooO0o0 = o0Oo0oo.OooO00o(context, 10.0d);
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO00o() {
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0O0(ArrayList arrayList) {
        this.f33708OooOO0 = arrayList;
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0OO(int i, float f) {
        List<o0000O00> list = this.f33708OooOO0;
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000O00 o0000o00OooO00o = oo000o.OooO00o(i, this.f33708OooOO0);
        o0000O00 o0000o00OooO00o2 = oo000o.OooO00o(i + 1, this.f33708OooOO0);
        RectF rectF = this.f33710OooOO0o;
        int i2 = o0000o00OooO00o.f57131OooO0o0;
        rectF.left = (this.f33702OooO.getInterpolation(f) * (o0000o00OooO00o2.f57131OooO0o0 - i2)) + (i2 - this.f33705OooO0o0);
        rectF.top = o0000o00OooO00o.f57130OooO0o - this.f33703OooO0Oo;
        int i3 = o0000o00OooO00o.f57132OooO0oO;
        rectF.right = (this.f33707OooO0oo.getInterpolation(f) * (o0000o00OooO00o2.f57132OooO0oO - i3)) + this.f33705OooO0o0 + i3;
        rectF.bottom = o0000o00OooO00o.f57133OooO0oo + this.f33703OooO0Oo;
        if (!this.f33711OooOOO0) {
            this.f33706OooO0oO = rectF.height() / 2.0f;
        }
        invalidate();
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0Oo() {
    }

    public Interpolator getEndInterpolator() {
        return this.f33702OooO;
    }

    public int getFillColor() {
        return this.f33704OooO0o;
    }

    public int getHorizontalPadding() {
        return this.f33705OooO0o0;
    }

    public Paint getPaint() {
        return this.f33709OooOO0O;
    }

    public float getRoundRadius() {
        return this.f33706OooO0oO;
    }

    public Interpolator getStartInterpolator() {
        return this.f33707OooO0oo;
    }

    public int getVerticalPadding() {
        return this.f33703OooO0Oo;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f33709OooOO0O.setColor(this.f33704OooO0o);
        RectF rectF = this.f33710OooOO0o;
        float f = this.f33706OooO0oO;
        canvas.drawRoundRect(rectF, f, f, this.f33709OooOO0O);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f33702OooO = interpolator;
        if (interpolator == null) {
            this.f33702OooO = new LinearInterpolator();
        }
    }

    public void setFillColor(int i) {
        this.f33704OooO0o = i;
    }

    public void setHorizontalPadding(int i) {
        this.f33705OooO0o0 = i;
    }

    public void setRoundRadius(float f) {
        this.f33706OooO0oO = f;
        this.f33711OooOOO0 = true;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f33707OooO0oo = interpolator;
        if (interpolator == null) {
            this.f33707OooO0oo = new LinearInterpolator();
        }
    }

    public void setVerticalPadding(int i) {
        this.f33703OooO0Oo = i;
    }
}
