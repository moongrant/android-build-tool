package net.lucode.hackware.magicindicator.buildins.circlenavigator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;
import p418o0Oo0oo.oo000o;
import p656o0ooo000.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public class CircleNavigator extends View implements Oooo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f26418Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f26419Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f26420Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f26421Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public Paint f26422OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f26423OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f26424OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public Interpolator f26425OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public List<PointF> f26426OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f26427OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO00o f26428OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public float f26429OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public float f26430OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f26431OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f26432Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public float f26433o000oOoO;

    public interface OooO00o {
        void OooO00o();
    }

    public CircleNavigator(Context context) {
        super(context);
        this.f26425OoooO0O = new LinearInterpolator();
        this.f26422OoooO = new Paint(1);
        this.f26426OoooOO0 = new ArrayList();
        this.f26432Ooooo00 = true;
        this.f26431OoooOoo = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f26419Oooo0o = oo000o.OooO00o(context, 3.0d);
        this.f26418Oooo = oo000o.OooO00o(context, 8.0d);
        this.f26421Oooo0oo = oo000o.OooO00o(context, 1.0d);
    }

    @Override // p656o0ooo000.Oooo0
    public final void OooO00o() {
    }

    @Override // p656o0ooo000.Oooo0
    public final void OooO0O0() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    public final void OooO0OO() {
        this.f26426OoooOO0.clear();
        if (this.f26423OoooO0 > 0) {
            int height = (int) ((getHeight() / 2.0f) + 0.5f);
            int i = this.f26419Oooo0o;
            int i2 = (i * 2) + this.f26418Oooo;
            int paddingLeft = getPaddingLeft() + i + ((int) ((this.f26421Oooo0oo / 2.0f) + 0.5f));
            for (int i3 = 0; i3 < this.f26423OoooO0; i3++) {
                this.f26426OoooOO0.add(new PointF(paddingLeft, height));
                paddingLeft += i2;
            }
            this.f26433o000oOoO = ((PointF) this.f26426OoooOO0.get(this.f26424OoooO00)).x;
        }
    }

    public OooO00o getCircleClickListener() {
        return this.f26428OoooOOo;
    }

    public int getCircleColor() {
        return this.f26420Oooo0oO;
    }

    public int getCircleCount() {
        return this.f26423OoooO0;
    }

    public int getCircleSpacing() {
        return this.f26418Oooo;
    }

    public int getRadius() {
        return this.f26419Oooo0o;
    }

    public Interpolator getStartInterpolator() {
        return this.f26425OoooO0O;
    }

    public int getStrokeWidth() {
        return this.f26421Oooo0oo;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.f26422OoooO.setColor(this.f26420Oooo0oO);
        this.f26422OoooO.setStyle(Paint.Style.STROKE);
        this.f26422OoooO.setStrokeWidth(this.f26421Oooo0oo);
        int size = this.f26426OoooOO0.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) this.f26426OoooOO0.get(i);
            canvas.drawCircle(pointF.x, pointF.y, this.f26419Oooo0o, this.f26422OoooO);
        }
        this.f26422OoooO.setStyle(Paint.Style.FILL);
        if (this.f26426OoooOO0.size() > 0) {
            canvas.drawCircle(this.f26433o000oOoO, (int) ((getHeight() / 2.0f) + 0.5f), this.f26419Oooo0o, this.f26422OoooO);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        OooO0OO();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.f26423OoooO0;
            size = getPaddingRight() + getPaddingLeft() + ((i3 - 1) * this.f26418Oooo) + (this.f26419Oooo0o * i3 * 2) + (this.f26421Oooo0oo * 2);
        } else if (mode != 1073741824) {
            size = 0;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + (this.f26421Oooo0oo * 2) + (this.f26419Oooo0o * 2);
        } else if (mode2 == 1073741824) {
            paddingBottom = size2;
        }
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // p656o0ooo000.Oooo0
    public final void onPageScrollStateChanged(int i) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    @Override // p656o0ooo000.Oooo0
    public final void onPageScrolled(int i, float f, int i2) {
        if (!this.f26432Ooooo00 || this.f26426OoooOO0.isEmpty()) {
            return;
        }
        int iMin = Math.min(this.f26426OoooOO0.size() - 1, i);
        int iMin2 = Math.min(this.f26426OoooOO0.size() - 1, i + 1);
        PointF pointF = (PointF) this.f26426OoooOO0.get(iMin);
        PointF pointF2 = (PointF) this.f26426OoooOO0.get(iMin2);
        float f2 = pointF.x;
        this.f26433o000oOoO = (this.f26425OoooO0O.getInterpolation(f) * (pointF2.x - f2)) + f2;
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    @Override // p656o0ooo000.Oooo0
    public final void onPageSelected(int i) {
        this.f26424OoooO00 = i;
        if (this.f26432Ooooo00) {
            return;
        }
        this.f26433o000oOoO = ((PointF) this.f26426OoooOO0.get(i)).x;
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList, java.util.List<android.graphics.PointF>] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && this.f26428OoooOOo != null && Math.abs(x - this.f26429OoooOo0) <= this.f26431OoooOoo && Math.abs(y - this.f26430OoooOoO) <= this.f26431OoooOoo) {
                float f = Float.MAX_VALUE;
                for (int i = 0; i < this.f26426OoooOO0.size(); i++) {
                    float fAbs = Math.abs(((PointF) this.f26426OoooOO0.get(i)).x - x);
                    if (fAbs < f) {
                        f = fAbs;
                    }
                }
                this.f26428OoooOOo.OooO00o();
            }
        } else if (this.f26427OoooOOO) {
            this.f26429OoooOo0 = x;
            this.f26430OoooOoO = y;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCircleClickListener(OooO00o oooO00o) {
        if (!this.f26427OoooOOO) {
            this.f26427OoooOOO = true;
        }
        this.f26428OoooOOo = oooO00o;
    }

    public void setCircleColor(int i) {
        this.f26420Oooo0oO = i;
        invalidate();
    }

    public void setCircleCount(int i) {
        this.f26423OoooO0 = i;
    }

    public void setCircleSpacing(int i) {
        this.f26418Oooo = i;
        OooO0OO();
        invalidate();
    }

    public void setFollowTouch(boolean z) {
        this.f26432Ooooo00 = z;
    }

    public void setRadius(int i) {
        this.f26419Oooo0o = i;
        OooO0OO();
        invalidate();
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f26425OoooO0O = interpolator;
        if (interpolator == null) {
            this.f26425OoooO0O = new LinearInterpolator();
        }
    }

    public void setStrokeWidth(int i) {
        this.f26421Oooo0oo = i;
        invalidate();
    }

    public void setTouchable(boolean z) {
        this.f26427OoooOOO = z;
    }
}
