package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f16817OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Drawable f16818OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Rect f16819OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Rect f16820OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f16821OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f16822OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f16823OooOO0;

    public class OooO00o implements o000000O {
        public OooO00o() {
        }

        @Override // androidx.core.view.o000000O
        public final WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f16820OooO0o0 == null) {
                scrimInsetsFrameLayout.f16820OooO0o0 = new Rect();
            }
            scrimInsetsFrameLayout.f16820OooO0o0.set(windowInsetsCompat.OooO0Oo(), windowInsetsCompat.OooO0o(), windowInsetsCompat.OooO0o0(), windowInsetsCompat.OooO0OO());
            scrimInsetsFrameLayout.OooO00o(windowInsetsCompat);
            WindowInsetsCompat.OooOo00 oooOo00 = windowInsetsCompat.f5389OooO00o;
            boolean z = true;
            if ((!oooOo00.OooOO0o().equals(p052o00000oO.OooOO0O.f33476OooO0o0)) && scrimInsetsFrameLayout.f16818OooO0Oo != null) {
                z = false;
            }
            scrimInsetsFrameLayout.setWillNotDraw(z);
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooO0o.OooOO0O(scrimInsetsFrameLayout);
            return oooOo00.OooO0OO();
        }
    }

    public ScrimInsetsFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public void OooO00o(WindowInsetsCompat windowInsetsCompat) {
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f16820OooO0o0 == null || this.f16818OooO0Oo == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z = this.f16821OooO0oO;
        Rect rect = this.f16819OooO0o;
        if (z) {
            rect.set(0, 0, width, this.f16820OooO0o0.top);
            this.f16818OooO0Oo.setBounds(rect);
            this.f16818OooO0Oo.draw(canvas);
        }
        if (this.f16822OooO0oo) {
            rect.set(0, height - this.f16820OooO0o0.bottom, width, height);
            this.f16818OooO0Oo.setBounds(rect);
            this.f16818OooO0Oo.draw(canvas);
        }
        if (this.f16817OooO) {
            Rect rect2 = this.f16820OooO0o0;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f16818OooO0Oo.setBounds(rect);
            this.f16818OooO0Oo.draw(canvas);
        }
        if (this.f16823OooOO0) {
            Rect rect3 = this.f16820OooO0o0;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f16818OooO0Oo.setBounds(rect);
            this.f16818OooO0Oo.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f16818OooO0Oo;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f16818OooO0Oo;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f16822OooO0oo = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f16817OooO = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.f16823OooOO0 = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f16821OooO0oO = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f16818OooO0Oo = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16819OooO0o = new Rect();
        this.f16821OooO0oO = true;
        this.f16822OooO0oo = true;
        this.f16817OooO = true;
        this.f16823OooOO0 = true;
        TypedArray typedArrayOooO0Oo = o00oO0o.OooO0Oo(context, attributeSet, o000OO.ScrimInsetsFrameLayout, i, o0000O0O.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f16818OooO0Oo = typedArrayOooO0Oo.getDrawable(o000OO.ScrimInsetsFrameLayout_insetForeground);
        typedArrayOooO0Oo.recycle();
        setWillNotDraw(true);
        OooO00o oooO00o = new OooO00o();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(this, oooO00o);
    }
}
