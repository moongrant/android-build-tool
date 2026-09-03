package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.internal.oo0o0Oo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Paint f18180OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ValueAnimator f18181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ArrayList f18182OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f18183OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f18184OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f18185OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final RectF f18186OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Px
    public final int f18187OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f18188OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public double f18189OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f18190OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f18191OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f18192OooOOOo;

    public interface OooO00o {
        void OooO00o(@FloatRange(from = 0.0d, to = 360.0d) float f);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialClockStyle);
    }

    @Dimension
    public final int OooO00o(int i) {
        return i == 2 ? Math.round(this.f18191OooOOOO * 0.66f) : this.f18191OooOOOO;
    }

    public final void OooO0O0(@FloatRange(from = 0.0d, to = 360.0d) float f) {
        ValueAnimator valueAnimator = this.f18181OooO0Oo;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        OooO0OO(f, false);
    }

    public final void OooO0OO(@FloatRange(from = 0.0d, to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.f18188OooOO0o = f2;
        this.f18189OooOOO = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fOooO00o = OooO00o(this.f18192OooOOOo);
        float fCos = (((float) Math.cos(this.f18189OooOOO)) * fOooO00o) + width;
        float fSin = (fOooO00o * ((float) Math.sin(this.f18189OooOOO))) + height;
        float f3 = this.f18184OooO0oO;
        this.f18186OooOO0.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f18182OooO0o.iterator();
        while (it.hasNext()) {
            ((OooO00o) it.next()).OooO00o(f2);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iOooO00o = OooO00o(this.f18192OooOOOo);
        float f = width;
        float f2 = iOooO00o;
        float fCos = (((float) Math.cos(this.f18189OooOOO)) * f2) + f;
        float f3 = height;
        float fSin = (f2 * ((float) Math.sin(this.f18189OooOOO))) + f3;
        Paint paint = this.f18180OooO;
        paint.setStrokeWidth(0.0f);
        int i = this.f18184OooO0oO;
        canvas.drawCircle(fCos, fSin, i, paint);
        double dSin = Math.sin(this.f18189OooOOO);
        double d = iOooO00o - i;
        paint.setStrokeWidth(this.f18187OooOO0O);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.f18189OooOOO) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.f18185OooO0oo, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f18181OooO0Oo.isRunning()) {
            return;
        }
        OooO0O0(this.f18188OooOO0o);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.f18190OooOOO0 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.f18190OooOOO0;
            if (this.f18183OooO0o0) {
                this.f18192OooOOOo = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) OooO00o(2)) + oo0o0Oo.OooO0O0(12, getContext()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.f18190OooOOO0;
        int degrees = ((int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = degrees;
        boolean z5 = this.f18188OooOO0o != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            OooO0O0(f);
            z3 = true;
        }
        this.f18190OooOOO0 = z4 | z3;
        return true;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18181OooO0Oo = new ValueAnimator();
        this.f18182OooO0o = new ArrayList();
        Paint paint = new Paint();
        this.f18180OooO = paint;
        this.f18186OooOO0 = new RectF();
        this.f18192OooOOOo = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.ClockHandView, i, o0000O0O.Widget_MaterialComponents_TimePicker_Clock);
        o0O00OO.OooO00o.OooO0OO(o00000.motionDurationLong2, context, 200);
        o0O00OO.OooO00o.OooO0Oo(context, o00000.motionEasingEmphasizedInterpolator, o0O000.OooO0O0.f41572OooO0O0);
        this.f18191OooOOOO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ClockHandView_materialCircleRadius, 0);
        this.f18184OooO0oO = typedArrayObtainStyledAttributes.getDimensionPixelSize(o000OO.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f18187OooOO0O = resources.getDimensionPixelSize(o00000O.material_clock_hand_stroke_width);
        this.f18185OooO0oo = resources.getDimensionPixelSize(o00000O.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(o000OO.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        OooO0O0(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
