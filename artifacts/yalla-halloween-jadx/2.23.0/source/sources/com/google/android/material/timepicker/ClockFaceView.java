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
import o0000O.o0Oo0oo;
import org.jctools.util.Pow2;
import p270o0O0000o.o00000;
import p270o0O0000o.o00000O;
import p270o0O0000o.o00000O0;
import p270o0O0000o.o0000O00;
import p270o0O0000o.o0000O0O;
import p270o0O0000o.o0000Ooo;
import p270o0O0000o.o000OO;
import p545o0oO0Ooo.c1;

/* JADX INFO: loaded from: classes3.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RectF f18163OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ClockHandView f18164OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Rect f18165OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Rect f18166OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final SparseArray<TextView> f18167OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO0O0 f18168OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final float[] f18169OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int[] f18170OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f18171OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f18172OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f18173OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f18174OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public String[] f18175OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ColorStateList f18176OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public float f18177OooOo00;

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
            int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f18164OooO0oO.f18184OooO0oO) - clockFaceView.f18171OooOOOO;
            if (height != clockFaceView.f18199OooO0o0) {
                clockFaceView.f18199OooO0o0 = height;
                clockFaceView.OooO0O0();
                int i = clockFaceView.f18199OooO0o0;
                ClockHandView clockHandView = clockFaceView.f18164OooO0oO;
                clockHandView.f18191OooOOOO = i;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    public class OooO0O0 extends androidx.core.view.OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.core.view.OooO00o
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull o0Oo0oo o0oo0oo2) {
            super.onInitializeAccessibilityNodeInfo(view, o0oo0oo2);
            int iIntValue = ((Integer) view.getTag(o0000Ooo.material_value_index)).intValue();
            if (iIntValue > 0) {
                o0oo0oo2.f34022OooO00o.setTraversalAfter(ClockFaceView.this.f18167OooOO0O.get(iIntValue - 1));
            }
            o0oo0oo2.OooOO0o(o0Oo0oo.OooO0o.OooO00o(0, 1, iIntValue, 1, false, view.isSelected()));
            o0oo0oo2.f34022OooO00o.setClickable(true);
            o0oo0oo2.OooO0O0(o0Oo0oo.OooO00o.f34028OooO0oO);
        }

        @Override // androidx.core.view.OooO00o
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = ClockFaceView.this;
            view.getHitRect(clockFaceView.f18165OooO0oo);
            float fCenterX = clockFaceView.f18165OooO0oo.centerX();
            float fCenterY = clockFaceView.f18165OooO0oo.centerY();
            clockFaceView.f18164OooO0oO.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            clockFaceView.f18164OooO0oO.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.materialClockStyle);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OooO00o
    public final void OooO00o(float f) {
        if (Math.abs(this.f18177OooOo00 - f) > 0.001f) {
            this.f18177OooOo00 = f;
            OooO0OO();
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void OooO0O0() {
        super.OooO0O0();
        int i = 0;
        while (true) {
            SparseArray<TextView> sparseArray = this.f18167OooOO0O;
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
        RectF rectF2 = this.f18164OooO0oO.f18186OooOO0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f18167OooOO0O;
            int size = sparseArray.size();
            rectF = this.f18163OooO;
            rect = this.f18165OooO0oo;
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
                Rect rect2 = this.f18166OooOO0;
                textView3.getLineBounds(0, rect2);
                rectF.inset(rect2.left, rect2.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f18170OooOOO0, this.f18169OooOOO, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0Oo0oo.OooO0OO.OooO00o(1, this.f18175OooOOoo.length, 1, false).f34044OooO00o);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0OO();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f18173OooOOo / Math.max(Math.max(this.f18172OooOOOo / displayMetrics.heightPixels, this.f18174OooOOo0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, Pow2.MAX_POW2);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18165OooO0oo = new Rect();
        this.f18163OooO = new RectF();
        this.f18166OooOO0 = new Rect();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f18167OooOO0O = sparseArray;
        this.f18169OooOOO = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o000OO.ClockFaceView, i, o0000O0O.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListOooO00o = c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.ClockFaceView_clockNumberTextColor);
        this.f18176OooOo0 = colorStateListOooO00o;
        LayoutInflater.from(context).inflate(o0000O00.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(o0000Ooo.material_clock_hand);
        this.f18164OooO0oO = clockHandView;
        this.f18171OooOOOO = resources.getDimensionPixelSize(o00000O.material_clock_hand_padding);
        int colorForState = colorStateListOooO00o.getColorForState(new int[]{R.attr.state_selected}, colorStateListOooO00o.getDefaultColor());
        this.f18170OooOOO0 = new int[]{colorForState, colorForState, colorStateListOooO00o.getDefaultColor()};
        clockHandView.f18182OooO0o.add(this);
        int defaultColor = ContextCompat.OooO0O0(o00000O0.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList colorStateListOooO00o2 = c1.OooO00o(context, typedArrayObtainStyledAttributes, o000OO.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListOooO00o2 != null ? colorStateListOooO00o2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new OooO00o());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f18168OooOO0o = new OooO0O0();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f18175OooOOoo = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.f18175OooOOoo.length, size); i2++) {
            TextView textView = sparseArray.get(i2);
            if (i2 >= this.f18175OooOOoo.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(o0000O00.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f18175OooOOoo[i2]);
                textView.setTag(o0000Ooo.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(o0000Ooo.material_clock_level, Integer.valueOf(i3));
                z = i3 > 1 ? true : z;
                ViewCompat.OooOOOO(textView, this.f18168OooOO0o);
                textView.setTextColor(this.f18176OooOo0);
            }
        }
        ClockHandView clockHandView2 = this.f18164OooO0oO;
        if (clockHandView2.f18183OooO0o0 && !z) {
            clockHandView2.f18192OooOOOo = 1;
        }
        clockHandView2.f18183OooO0o0 = z;
        clockHandView2.invalidate();
        this.f18172OooOOOo = resources.getDimensionPixelSize(o00000O.material_time_picker_minimum_screen_height);
        this.f18174OooOOo0 = resources.getDimensionPixelSize(o00000O.material_time_picker_minimum_screen_width);
        this.f18173OooOOo = resources.getDimensionPixelSize(o00000O.material_clock_size);
    }
}
