package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import o0000O.o0O0O00;
import org.jctools.util.Pow2;
import p272o0O0000o.o00000;
import p272o0O0000o.o00000O;
import p272o0O0000o.o00000O0;
import p272o0O0000o.o0000O00;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o0000Ooo;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RectF f17687OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ClockHandView f17688OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Rect f17689OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Rect f17690OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final SparseArray<TextView> f17691OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO0O0 f17692OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float[] f17693OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int[] f17694OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f17695OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f17696OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f17697OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f17698OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public String[] f17699OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ColorStateList f17700OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f17701OooOo00;

    public class OooO00o implements ViewTreeObserver.OnPreDrawListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            ClockFaceView clockFaceView = ClockFaceView.this;
            if (!clockFaceView.isShown()) {
                return true;
            }
            clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f17688OooO0oO.f17708OooO0oO) - clockFaceView.f17695OooOOOO;
            if (height != clockFaceView.f17723OooO0o0) {
                clockFaceView.f17723OooO0o0 = height;
                clockFaceView.OooO0O0();
                int i = clockFaceView.f17723OooO0o0;
                ClockHandView clockHandView = clockFaceView.f17688OooO0oO;
                clockHandView.f17715OooOOOO = i;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    public class OooO0O0 extends androidx.core.view.OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0O0O00 o0o0o00) {
            super.onInitializeAccessibilityNodeInfo(view, o0o0o00);
            int iIntValue = ((Integer) view.getTag(o0000Ooo.material_value_index)).intValue();
            if (iIntValue > 0) {
                o0o0o00.f33510OooO00o.setTraversalAfter(ClockFaceView.this.f17691OooOO0O.get(iIntValue - 1));
            }
            o0o0o00.OooOOO0(o0O0O00.OooOO0O.OooO00o(0, 1, iIntValue, 1, false, view.isSelected()));
            o0o0o00.f33510OooO00o.setClickable(true);
            o0o0o00.OooO0O0(o0O0O00.OooO00o.f33516OooO0oO);
        }

        @Override // androidx.core.view.OooO00o
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = ClockFaceView.this;
            view.getHitRect(clockFaceView.f17689OooO0oo);
            float fCenterX = clockFaceView.f17689OooO0oo.centerX();
            float fCenterY = clockFaceView.f17689OooO0oo.centerY();
            clockFaceView.f17688OooO0oO.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            clockFaceView.f17688OooO0oO.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialClockStyle);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OooO00o
    public final void OooO00o(float f) {
        if (Math.abs(this.f17701OooOo00 - f) > 0.001f) {
            this.f17701OooOo00 = f;
            OooO0OO();
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void OooO0O0() {
        super.OooO0O0();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f17691OooOO0O;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.get(i).setVisibility(0);
            i++;
        }
    }

    public final void OooO0OO() {
        SparseArray<TextView> sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.f17688OooO0oO.f17710OooOO0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f17691OooOO0O;
            int size = sparseArray.size();
            rectF = this.f17687OooO;
            rect = this.f17689OooO0oo;
            if (i >= size) {
                break;
            }
            TextView textView2 = sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.f17690OooOO0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f17694OooOOO0, this.f17693OooOOO, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0O0O00.OooOO0.OooO00o(1, this.f17699OooOOoo.length, 1, false).f33532OooO00o);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0OO();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f17697OooOOo / Math.max(Math.max(this.f17696OooOOOo / displayMetrics.heightPixels, this.f17698OooOOo0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, Pow2.MAX_POW2);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17689OooO0oo = new Rect();
        this.f17687OooO = new RectF();
        this.f17690OooOO0 = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f17691OooOO0O = sparseArray;
        this.f17693OooOOO = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.ClockFaceView, i, o0000O0O.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListOooO00o = p276o0O00OoO.OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.ClockFaceView_clockNumberTextColor);
        this.f17700OooOo0 = colorStateListOooO00o;
        LayoutInflater.from(context).inflate(o0000O00.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(o0000Ooo.material_clock_hand);
        this.f17688OooO0oO = clockHandView;
        this.f17695OooOOOO = resources.getDimensionPixelSize(o00000O.material_clock_hand_padding);
        int colorForState = colorStateListOooO00o.getColorForState(new int[]{R.attr.state_selected}, colorStateListOooO00o.getDefaultColor());
        this.f17694OooOOO0 = new int[]{colorForState, colorForState, colorStateListOooO00o.getDefaultColor()};
        clockHandView.f17706OooO0o.add(this);
        int defaultColor = ContextCompat.OooO0O0(o00000O0.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList colorStateListOooO00o2 = p276o0O00OoO.OooO0o.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListOooO00o2 != null ? colorStateListOooO00o2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new OooO00o());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f17692OooOO0o = new OooO0O0();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f17699OooOOoo = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f17699OooOOoo.length, size); i2++) {
            TextView textView = sparseArray.get(i2);
            if (i2 >= this.f17699OooOOoo.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(o0000O00.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f17699OooOOoo[i2]);
                textView.setTag(o0000Ooo.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(o0000Ooo.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                ViewCompat.OooOOOO(textView, this.f17692OooOO0o);
                textView.setTextColor(this.f17700OooOo0);
            }
        }
        ClockHandView clockHandView2 = this.f17688OooO0oO;
        if (clockHandView2.f17707OooO0o0 && !z) {
            clockHandView2.f17716OooOOOo = 1;
        }
        clockHandView2.f17707OooO0o0 = z;
        clockHandView2.invalidate();
        this.f17696OooOOOo = resources.getDimensionPixelSize(o00000O.material_time_picker_minimum_screen_height);
        this.f17698OooOOo0 = resources.getDimensionPixelSize(o00000O.material_time_picker_minimum_screen_width);
        this.f17697OooOOo = resources.getDimensionPixelSize(o00000O.material_clock_size);
    }
}
