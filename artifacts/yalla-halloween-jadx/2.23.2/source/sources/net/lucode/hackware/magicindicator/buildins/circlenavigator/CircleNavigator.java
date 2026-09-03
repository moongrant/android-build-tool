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
import o0OO0.OooO0o;
import p635o0ooO0o0.o0000;

/* JADX INFO: loaded from: classes5.dex */
public class CircleNavigator extends View implements o0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33097OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33098OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33099OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f33100OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f33101OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f33102OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Interpolator f33103OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Paint f33104OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final ArrayList f33105OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f33106OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public float f33107OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f33108OooOOOO;

    public interface OooO00o {
    }

    public CircleNavigator(Context context) {
        super(context);
        this.f33103OooOO0 = new LinearInterpolator();
        this.f33104OooOO0O = new Paint(1);
        this.f33105OooOO0o = new ArrayList();
        this.f33108OooOOOO = true;
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.f33098OooO0Oo = OooO0o.OooO0O0(context, 3.0d);
        this.f33101OooO0oO = OooO0o.OooO0O0(context, 8.0d);
        this.f33099OooO0o = OooO0o.OooO0O0(context, 1.0d);
    }

    @Override // p635o0ooO0o0.o0000
    public final void OooO00o() {
    }

    @Override // p635o0ooO0o0.o0000
    public final void OooO0O0() {
    }

    public final void OooO0OO() {
        ArrayList arrayList = this.f33105OooOO0o;
        arrayList.clear();
        if (this.f33097OooO > 0) {
            int height = (int) ((getHeight() / 2.0f) + 0.5f);
            int i = this.f33098OooO0Oo;
            int i2 = (i * 2) + this.f33101OooO0oO;
            int paddingLeft = getPaddingLeft() + i + ((int) ((this.f33099OooO0o / 2.0f) + 0.5f));
            for (int i3 = 0; i3 < this.f33097OooO; i3++) {
                arrayList.add(new PointF(paddingLeft, height));
                paddingLeft += i2;
            }
            this.f33107OooOOO0 = ((PointF) arrayList.get(this.f33102OooO0oo)).x;
        }
    }

    public OooO00o getCircleClickListener() {
        return null;
    }

    public int getCircleColor() {
        return this.f33100OooO0o0;
    }

    public int getCircleCount() {
        return this.f33097OooO;
    }

    public int getCircleSpacing() {
        return this.f33101OooO0oO;
    }

    public int getRadius() {
        return this.f33098OooO0Oo;
    }

    public Interpolator getStartInterpolator() {
        return this.f33103OooOO0;
    }

    public int getStrokeWidth() {
        return this.f33099OooO0o;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f33104OooOO0O;
        paint.setColor(this.f33100OooO0o0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f33099OooO0o);
        ArrayList arrayList = this.f33105OooOO0o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            PointF pointF = (PointF) arrayList.get(i);
            canvas.drawCircle(pointF.x, pointF.y, this.f33098OooO0Oo, paint);
        }
        paint.setStyle(Paint.Style.FILL);
        if (arrayList.size() > 0) {
            canvas.drawCircle(this.f33107OooOOO0, (int) ((getHeight() / 2.0f) + 0.5f), this.f33098OooO0Oo, paint);
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
            int i3 = this.f33097OooO;
            size = getPaddingRight() + getPaddingLeft() + ((i3 - 1) * this.f33101OooO0oO) + (this.f33098OooO0Oo * i3 * 2) + (this.f33099OooO0o * 2);
        } else if (mode != 1073741824) {
            size = 0;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + (this.f33099OooO0o * 2) + (this.f33098OooO0Oo * 2);
        } else if (mode2 == 1073741824) {
            paddingBottom = size2;
        }
        setMeasuredDimension(size, paddingBottom);
    }

    @Override // p635o0ooO0o0.o0000
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // p635o0ooO0o0.o0000
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.f33108OooOOOO) {
            ArrayList arrayList = this.f33105OooOO0o;
            if (arrayList.isEmpty()) {
                return;
            }
            int iMin = Math.min(arrayList.size() - 1, i);
            int iMin2 = Math.min(arrayList.size() - 1, i + 1);
            PointF pointF = (PointF) arrayList.get(iMin);
            PointF pointF2 = (PointF) arrayList.get(iMin2);
            float f2 = pointF.x;
            this.f33107OooOOO0 = (this.f33103OooOO0.getInterpolation(f) * (pointF2.x - f2)) + f2;
            invalidate();
        }
    }

    @Override // p635o0ooO0o0.o0000
    public final void onPageSelected(int i) {
        this.f33102OooO0oo = i;
        if (this.f33108OooOOOO) {
            return;
        }
        this.f33107OooOOO0 = ((PointF) this.f33105OooOO0o.get(i)).x;
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f33106OooOOO) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCircleClickListener(OooO00o oooO00o) {
        if (this.f33106OooOOO) {
            return;
        }
        this.f33106OooOOO = true;
    }

    public void setCircleColor(int i) {
        this.f33100OooO0o0 = i;
        invalidate();
    }

    public void setCircleCount(int i) {
        this.f33097OooO = i;
    }

    public void setCircleSpacing(int i) {
        this.f33101OooO0oO = i;
        OooO0OO();
        invalidate();
    }

    public void setFollowTouch(boolean z) {
        this.f33108OooOOOO = z;
    }

    public void setRadius(int i) {
        this.f33098OooO0Oo = i;
        OooO0OO();
        invalidate();
    }

    public void setStartInterpolator(Interpolator interpolator) {
        this.f33103OooOO0 = interpolator;
        if (interpolator == null) {
            this.f33103OooOO0 = new LinearInterpolator();
        }
    }

    public void setStrokeWidth(int i) {
        this.f33099OooO0o = i;
        invalidate();
    }

    public void setTouchable(boolean z) {
        this.f33106OooOOO = z;
    }
}
