package net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.OooO00o;
import com.android.billingclient.api.o0Oo0oo;
import java.util.ArrayList;
import java.util.List;
import p628o0ooO0O.oo000o;
import p631o0ooO0Oo.o00O000;
import p633o0ooO0o0.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public class TriangularPagerIndicator extends View implements o00O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33691OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<o0000O00> f33692OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33693OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Paint f33694OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f33695OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33696OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f33697OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33698OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Path f33699OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f33700OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Interpolator f33701OooOOO0;

    public TriangularPagerIndicator(Context context) {
        super(context);
        this.f33699OooOO0o = new Path();
        this.f33701OooOOO0 = new LinearInterpolator();
        Paint paint = new Paint(1);
        this.f33694OooO0o0 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33693OooO0o = o0Oo0oo.OooO00o(context, 3.0d);
        this.f33691OooO = o0Oo0oo.OooO00o(context, 14.0d);
        this.f33696OooO0oo = o0Oo0oo.OooO00o(context, 8.0d);
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO00o() {
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0O0(ArrayList arrayList) {
        this.f33692OooO0Oo = arrayList;
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0OO(int i, float f) {
        List<o0000O00> list = this.f33692OooO0Oo;
        if (list == null || list.isEmpty()) {
            return;
        }
        o0000O00 o0000o00OooO00o = oo000o.OooO00o(i, this.f33692OooO0Oo);
        o0000O00 o0000o00OooO00o2 = oo000o.OooO00o(i + 1, this.f33692OooO0Oo);
        int i2 = o0000o00OooO00o.f57126OooO00o;
        float fOooO00o = OooO00o.OooO00o(o0000o00OooO00o.f57128OooO0OO, i2, 2, i2);
        int i3 = o0000o00OooO00o2.f57126OooO00o;
        this.f33700OooOOO = (this.f33701OooOOO0.getInterpolation(f) * (OooO00o.OooO00o(o0000o00OooO00o2.f57128OooO0OO, i3, 2, i3) - fOooO00o)) + fOooO00o;
        invalidate();
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0Oo() {
    }

    public int getLineColor() {
        return this.f33695OooO0oO;
    }

    public int getLineHeight() {
        return this.f33693OooO0o;
    }

    public Interpolator getStartInterpolator() {
        return this.f33701OooOOO0;
    }

    public int getTriangleHeight() {
        return this.f33696OooO0oo;
    }

    public int getTriangleWidth() {
        return this.f33691OooO;
    }

    public float getYOffset() {
        return this.f33698OooOO0O;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f33694OooO0o0.setColor(this.f33695OooO0oO);
        if (this.f33697OooOO0) {
            canvas.drawRect(0.0f, (getHeight() - this.f33698OooOO0O) - this.f33696OooO0oo, getWidth(), ((getHeight() - this.f33698OooOO0O) - this.f33696OooO0oo) + this.f33693OooO0o, this.f33694OooO0o0);
        } else {
            canvas.drawRect(0.0f, (getHeight() - this.f33693OooO0o) - this.f33698OooOO0O, getWidth(), getHeight() - this.f33698OooOO0O, this.f33694OooO0o0);
        }
        Path path = this.f33699OooOO0o;
        path.reset();
        if (this.f33697OooOO0) {
            path.moveTo(this.f33700OooOOO - (this.f33691OooO / 2), (getHeight() - this.f33698OooOO0O) - this.f33696OooO0oo);
            path.lineTo(this.f33700OooOOO, getHeight() - this.f33698OooOO0O);
            path.lineTo(this.f33700OooOOO + (this.f33691OooO / 2), (getHeight() - this.f33698OooOO0O) - this.f33696OooO0oo);
        } else {
            path.moveTo(this.f33700OooOOO - (this.f33691OooO / 2), getHeight() - this.f33698OooOO0O);
            path.lineTo(this.f33700OooOOO, (getHeight() - this.f33696OooO0oo) - this.f33698OooOO0O);
            path.lineTo(this.f33700OooOOO + (this.f33691OooO / 2), getHeight() - this.f33698OooOO0O);
        }
        path.close();
        canvas.drawPath(path, this.f33694OooO0o0);
    }

    public void setLineColor(int i) {
        this.f33695OooO0oO = i;
    }

    public void setLineHeight(int i) {
        this.f33693OooO0o = i;
    }

    public void setReverse(boolean z) {
        this.f33697OooOO0 = z;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f33701OooOOO0 = interpolator;
        if (interpolator == null) {
            this.f33701OooOOO0 = new LinearInterpolator();
        }
    }

    public void setTriangleHeight(int i) {
        this.f33696OooO0oo = i;
    }

    public void setTriangleWidth(int i) {
        this.f33691OooO = i;
    }

    public void setYOffset(float f) {
        this.f33698OooOO0O = f;
    }
}
