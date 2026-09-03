package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.OooO00o;
import java.util.ArrayList;
import java.util.List;
import o0OO0.OooO0o;
import p633o0ooO0Oo.o0O00;
import p636o0ooO0oO.o0O00o00;
import p637o0ooO0oo.o0O0O0O;

/* JADX INFO: loaded from: classes5.dex */
public class TriangularPagerIndicator extends View implements o0O00o00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33158OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<o0O0O0O> f33159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Paint f33161OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f33162OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33163OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f33164OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33165OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Path f33166OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33167OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Interpolator f33168OooOOO0;

    public TriangularPagerIndicator(Context context) {
        super(context);
        this.f33166OooOO0o = new Path();
        this.f33168OooOOO0 = new LinearInterpolator();
        Paint paint = new Paint(1);
        this.f33161OooO0o0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33160OooO0o = OooO0o.OooO0O0(context, 3.0d);
        this.f33158OooO = OooO0o.OooO0O0(context, 14.0d);
        this.f33163OooO0oo = OooO0o.OooO0O0(context, 8.0d);
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO00o() {
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0O0(ArrayList arrayList) {
        this.f33159OooO0Oo = arrayList;
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0OO(int i, float f) {
        List<o0O0O0O> list = this.f33159OooO0Oo;
        if (list == null || list.isEmpty()) {
            return;
        }
        o0O0O0O o0o0o0oOooO00o = o0O00.OooO00o(i, this.f33159OooO0Oo);
        o0O0O0O o0o0o0oOooO00o2 = o0O00.OooO00o(i + 1, this.f33159OooO0Oo);
        int i2 = o0o0o0oOooO00o.f57700OooO00o;
        float fOooO00o = OooO00o.OooO00o(o0o0o0oOooO00o.f57702OooO0OO, i2, 2, i2);
        int i3 = o0o0o0oOooO00o2.f57700OooO00o;
        this.f33167OooOOO = (this.f33168OooOOO0.getInterpolation(f) * (OooO00o.OooO00o(o0o0o0oOooO00o2.f57702OooO0OO, i3, 2, i3) - fOooO00o)) + fOooO00o;
        invalidate();
    }

    @Override // p636o0ooO0oO.o0O00o00
    public final void OooO0Oo() {
    }

    public int getLineColor() {
        return this.f33162OooO0oO;
    }

    public int getLineHeight() {
        return this.f33160OooO0o;
    }

    public Interpolator getStartInterpolator() {
        return this.f33168OooOOO0;
    }

    public int getTriangleHeight() {
        return this.f33163OooO0oo;
    }

    public int getTriangleWidth() {
        return this.f33158OooO;
    }

    public float getYOffset() {
        return this.f33165OooOO0O;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f33161OooO0o0.setColor(this.f33162OooO0oO);
        if (this.f33164OooOO0) {
            canvas.drawRect(0.0f, (getHeight() - this.f33165OooOO0O) - this.f33163OooO0oo, getWidth(), ((getHeight() - this.f33165OooOO0O) - this.f33163OooO0oo) + this.f33160OooO0o, this.f33161OooO0o0);
        } else {
            canvas.drawRect(0.0f, (getHeight() - this.f33160OooO0o) - this.f33165OooOO0O, getWidth(), getHeight() - this.f33165OooOO0O, this.f33161OooO0o0);
        }
        Path path = this.f33166OooOO0o;
        path.reset();
        if (this.f33164OooOO0) {
            path.moveTo(this.f33167OooOOO - (this.f33158OooO / 2), (getHeight() - this.f33165OooOO0O) - this.f33163OooO0oo);
            path.lineTo(this.f33167OooOOO, getHeight() - this.f33165OooOO0O);
            path.lineTo(this.f33167OooOOO + (this.f33158OooO / 2), (getHeight() - this.f33165OooOO0O) - this.f33163OooO0oo);
        } else {
            path.moveTo(this.f33167OooOOO - (this.f33158OooO / 2), getHeight() - this.f33165OooOO0O);
            path.lineTo(this.f33167OooOOO, (getHeight() - this.f33163OooO0oo) - this.f33165OooOO0O);
            path.lineTo(this.f33167OooOOO + (this.f33158OooO / 2), getHeight() - this.f33165OooOO0O);
        }
        path.close();
        canvas.drawPath(path, this.f33161OooO0o0);
    }

    public void setLineColor(int i) {
        this.f33162OooO0oO = i;
    }

    public void setLineHeight(int i) {
        this.f33160OooO0o = i;
    }

    public void setReverse(boolean z) {
        this.f33164OooOO0 = z;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f33168OooOOO0 = interpolator;
        if (interpolator == null) {
            this.f33168OooOOO0 = new LinearInterpolator();
        }
    }

    public void setTriangleHeight(int i) {
        this.f33163OooO0oo = i;
    }

    public void setTriangleWidth(int i) {
        this.f33158OooO = i;
    }

    public void setYOffset(float f) {
        this.f33165OooOO0O = f;
    }
}
