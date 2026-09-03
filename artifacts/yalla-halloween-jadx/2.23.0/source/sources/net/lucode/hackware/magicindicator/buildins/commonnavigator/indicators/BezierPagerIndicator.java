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
import com.android.billingclient.api.o0Oo0oo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o00O0.OooO0o;
import p628o0ooO0O.oo000o;
import p631o0ooO0Oo.o00O000;
import p633o0ooO0o0.o0000O00;

/* JADX INFO: loaded from: classes5.dex */
public class BezierPagerIndicator extends View implements o00O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f33660OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public List<o0000O00> f33661OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f33662OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f33663OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f33664OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f33665OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f33666OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f33667OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Paint f33668OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public List<Integer> f33669OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Path f33670OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Interpolator f33671OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Interpolator f33672OooOOOo;

    public BezierPagerIndicator(Context context) {
        super(context);
        this.f33670OooOOO0 = new Path();
        this.f33671OooOOOO = new AccelerateInterpolator();
        this.f33672OooOOOo = new DecelerateInterpolator();
        Paint paint = new Paint(1);
        this.f33668OooOO0o = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f33666OooOO0 = o0Oo0oo.OooO00o(context, 3.5d);
        this.f33667OooOO0O = o0Oo0oo.OooO00o(context, 2.0d);
        this.f33660OooO = o0Oo0oo.OooO00o(context, 1.5d);
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO00o() {
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0O0(ArrayList arrayList) {
        this.f33661OooO0Oo = arrayList;
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0OO(int i, float f) {
        List<o0000O00> list = this.f33661OooO0Oo;
        if (list == null || list.isEmpty()) {
            return;
        }
        List<Integer> list2 = this.f33669OooOOO;
        if (list2 != null && list2.size() > 0) {
            this.f33668OooOO0o.setColor(OooO0o.OooO0OO(this.f33669OooOOO.get(Math.abs(i) % this.f33669OooOOO.size()).intValue(), f, this.f33669OooOOO.get(Math.abs(i + 1) % this.f33669OooOOO.size()).intValue()));
        }
        o0000O00 o0000o00OooO00o = oo000o.OooO00o(i, this.f33661OooO0Oo);
        o0000O00 o0000o00OooO00o2 = oo000o.OooO00o(i + 1, this.f33661OooO0Oo);
        int i2 = o0000o00OooO00o.f57126OooO00o;
        float fOooO00o = OooO00o.OooO00o(o0000o00OooO00o.f57128OooO0OO, i2, 2, i2);
        int i3 = o0000o00OooO00o2.f57126OooO00o;
        float fOooO00o2 = OooO00o.OooO00o(o0000o00OooO00o2.f57128OooO0OO, i3, 2, i3) - fOooO00o;
        this.f33662OooO0o = (this.f33671OooOOOO.getInterpolation(f) * fOooO00o2) + fOooO00o;
        this.f33665OooO0oo = (this.f33672OooOOOo.getInterpolation(f) * fOooO00o2) + fOooO00o;
        float f2 = this.f33666OooOO0;
        this.f33663OooO0o0 = (this.f33672OooOOOo.getInterpolation(f) * (this.f33667OooOO0O - f2)) + f2;
        float f3 = this.f33667OooOO0O;
        this.f33664OooO0oO = (this.f33671OooOOOO.getInterpolation(f) * (this.f33666OooOO0 - f3)) + f3;
        invalidate();
    }

    @Override // p631o0ooO0Oo.o00O000
    public final void OooO0Oo() {
    }

    public float getMaxCircleRadius() {
        return this.f33666OooOO0;
    }

    public float getMinCircleRadius() {
        return this.f33667OooOO0O;
    }

    public float getYOffset() {
        return this.f33660OooO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(this.f33662OooO0o, (getHeight() - this.f33660OooO) - this.f33666OooOO0, this.f33663OooO0o0, this.f33668OooOO0o);
        canvas.drawCircle(this.f33665OooO0oo, (getHeight() - this.f33660OooO) - this.f33666OooOO0, this.f33664OooO0oO, this.f33668OooOO0o);
        Path path = this.f33670OooOOO0;
        path.reset();
        float height = (getHeight() - this.f33660OooO) - this.f33666OooOO0;
        path.moveTo(this.f33665OooO0oo, height);
        path.lineTo(this.f33665OooO0oo, height - this.f33664OooO0oO);
        float f = this.f33665OooO0oo;
        float f2 = this.f33662OooO0o;
        path.quadTo(((f2 - f) / 2.0f) + f, height, f2, height - this.f33663OooO0o0);
        path.lineTo(this.f33662OooO0o, this.f33663OooO0o0 + height);
        float f3 = this.f33665OooO0oo;
        path.quadTo(((this.f33662OooO0o - f3) / 2.0f) + f3, height, f3, this.f33664OooO0oO + height);
        path.close();
        canvas.drawPath(path, this.f33668OooOO0o);
    }

    public void setColors(Integer... numArr) {
        this.f33669OooOOO = Arrays.asList(numArr);
    }

    public void setEndInterpolator(Interpolator interpolator) {
        this.f33672OooOOOo = interpolator;
        if (interpolator == null) {
            this.f33672OooOOOo = new DecelerateInterpolator();
        }
    }

    public void setMaxCircleRadius(float f) {
        this.f33666OooOO0 = f;
    }

    public void setMinCircleRadius(float f) {
        this.f33667OooOO0O = f;
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f33671OooOOOO = interpolator;
        if (interpolator == null) {
            this.f33671OooOOOO = new AccelerateInterpolator();
        }
    }

    public void setYOffset(float f) {
        this.f33660OooO = f;
    }
}
