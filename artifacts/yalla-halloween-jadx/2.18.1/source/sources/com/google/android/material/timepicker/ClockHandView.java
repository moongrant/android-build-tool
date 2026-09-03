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
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.OooOO0;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f18057Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ValueAnimator f18058Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float f18059Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f18060Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Paint f18061OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f18062OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final List<OooO00o> f18063OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final float f18064OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final RectF f18065OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public float f18066OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f18067OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public double f18068OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public int f18069OoooOoO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Px
    public final int f18070o000oOoO;

    public interface OooO00o {
        void OooO00o(@FloatRange(from = 0.0d, to = 360.0d) float f);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.materialClockStyle);
    }

    public final int OooO00o(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public final void OooO0O0(@FloatRange(from = 0.0d, to = 360.0d) float f) {
        ValueAnimator valueAnimator = this.f18058Oooo0o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        OooO0OO(f, false);
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList, java.util.List<com.google.android.material.timepicker.ClockHandView$OooO00o>] */
    public final void OooO0OO(@FloatRange(from = 0.0d, to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.f18066OoooOOO = f2;
        this.f18068OoooOo0 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.f18069OoooOoO * ((float) Math.cos(this.f18068OoooOo0))) + (getWidth() / 2);
        float fSin = (this.f18069OoooOoO * ((float) Math.sin(this.f18068OoooOo0))) + height;
        RectF rectF = this.f18065OoooOO0;
        float f3 = this.f18062OoooO0;
        rectF.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.f18063OoooO00.iterator();
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
        float f = width;
        float fCos = (this.f18069OoooOoO * ((float) Math.cos(this.f18068OoooOo0))) + f;
        float f2 = height;
        float fSin = (this.f18069OoooOoO * ((float) Math.sin(this.f18068OoooOo0))) + f2;
        this.f18061OoooO.setStrokeWidth(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        canvas.drawCircle(fCos, fSin, this.f18062OoooO0, this.f18061OoooO);
        double dSin = Math.sin(this.f18068OoooOo0);
        double dCos = Math.cos(this.f18068OoooOo0);
        double d = this.f18069OoooOoO - this.f18062OoooO0;
        this.f18061OoooO.setStrokeWidth(this.f18070o000oOoO);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f18061OoooO);
        canvas.drawCircle(f, f2, this.f18064OoooO0O, this.f18061OoooO);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0O0(this.f18066OoooOOO);
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
        if (actionMasked != 0) {
            z = (actionMasked == 1 || actionMasked == 2) ? this.f18067OoooOOo : false;
            z2 = false;
        } else {
            this.f18059Oooo0oO = x;
            this.f18060Oooo0oo = y;
            this.f18067OoooOOo = false;
            z = false;
            z2 = true;
        }
        boolean z4 = this.f18067OoooOOo;
        float fOooO00o = OooO00o(x, y);
        boolean z5 = this.f18066OoooOOO != fOooO00o;
        if (z2 && z5) {
            z3 = true;
        } else if (z5 || z) {
            OooO0O0(fOooO00o);
            z3 = true;
        }
        this.f18067OoooOOo = z4 | z3;
        return true;
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18063OoooO00 = new ArrayList();
        Paint paint = new Paint();
        this.f18061OoooO = paint;
        this.f18065OoooOO0 = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo0.ClockHandView, i, Oooo000.Widget_MaterialComponents_TimePicker_Clock);
        this.f18069OoooOoO = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ClockHandView_materialCircleRadius, 0);
        this.f18062OoooO0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(Oooo0.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f18070o000oOoO = resources.getDimensionPixelSize(OooOO0.material_clock_hand_stroke_width);
        this.f18064OoooO0O = resources.getDimensionPixelSize(OooOO0.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(Oooo0.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f18057Oooo = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOoo(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
