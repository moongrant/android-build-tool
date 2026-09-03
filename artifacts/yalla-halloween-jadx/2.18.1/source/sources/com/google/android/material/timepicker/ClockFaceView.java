package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p072o000O0o0.o0000OO0;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final ClockHandView f18041Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final OooO0O0 f18042OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final RectF f18043OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Rect f18044OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final SparseArray<TextView> f18045OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int[] f18046OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final int f18047OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final int f18048OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final int f18049OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final int f18050OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public String[] f18051OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public float f18052Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final ColorStateList f18053Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final float[] f18054o000oOoO;

    public class OooO00o implements ViewTreeObserver.OnPreDrawListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ClockFaceView.this.getHeight() / 2;
            ClockFaceView clockFaceView = ClockFaceView.this;
            int i = (height - clockFaceView.f18041Oooo.f18062OoooO0) - clockFaceView.f18047OoooOOO;
            if (i != clockFaceView.f18074Oooo0oO) {
                clockFaceView.f18074Oooo0oO = i;
                clockFaceView.OooO0O0();
                ClockHandView clockHandView = clockFaceView.f18041Oooo;
                clockHandView.f18069OoooOoO = clockFaceView.f18074Oooo0oO;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    public class OooO0O0 extends androidx.core.view.OooO00o {
        public OooO0O0() {
        }

        @Override // androidx.core.view.OooO00o
        public final void OooO0Oo(View view, @NonNull o0000OO0 o0000oo1) {
            this.f7862OooO00o.onInitializeAccessibilityNodeInfo(view, o0000oo1.f28194OooO00o);
            int iIntValue = ((Integer) view.getTag(OooOOO0.material_value_index)).intValue();
            if (iIntValue > 0) {
                o0000oo1.OooooOO(ClockFaceView.this.f18045OoooO0O.get(iIntValue - 1));
            }
            o0000oo1.Oooo0(o0000OO0.OooO0OO.OooO00o(0, 1, iIntValue, 1, view.isSelected()));
            o0000oo1.Oooo00O(true);
            o0000oo1.OooO0O0(o0000OO0.OooO00o.f28200OooO0oO);
        }

        @Override // androidx.core.view.OooO00o
        public final boolean OooO0oO(View view, int i, Bundle bundle) {
            if (i != 16) {
                return super.OooO0oO(view, i, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            float x = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.f18041Oooo.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, x, height, 0));
            ClockFaceView.this.f18041Oooo.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, x, height, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, OooO0o.materialClockStyle);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OooO00o
    public final void OooO00o(float f) {
        if (Math.abs(this.f18052Ooooo00 - f) > 0.001f) {
            this.f18052Ooooo00 = f;
            OooO0OO();
        }
    }

    public final void OooO0OO() {
        RectF rectF = this.f18041Oooo.f18065OoooOO0;
        for (int i = 0; i < this.f18045OoooO0O.size(); i++) {
            TextView textView = this.f18045OoooO0O.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f18044OoooO00);
                offsetDescendantRectToMyCoords(textView, this.f18044OoooO00);
                textView.setSelected(rectF.contains(this.f18044OoooO00.centerX(), this.f18044OoooO00.centerY()));
                this.f18043OoooO0.set(this.f18044OoooO00);
                this.f18043OoooO0.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                textView.getPaint().setShader(!RectF.intersects(rectF, this.f18043OoooO0) ? null : new RadialGradient(rectF.centerX() - this.f18043OoooO0.left, rectF.centerY() - this.f18043OoooO0.top, 0.5f * rectF.width(), this.f18046OoooOO0, this.f18054o000oOoO, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o0000OO0.OooO0O0.OooO00o(1, this.f18051OoooOoo.length, false, 1).f28216OooO00o);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0OO();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.f18050OoooOoO / Math.max(Math.max(this.f18048OoooOOo / displayMetrics.heightPixels, this.f18049OoooOo0 / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.google.android.material.timepicker.ClockFaceView for r8v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@androidx.annotation.NonNull android.content.Context r9, @androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockFaceView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
