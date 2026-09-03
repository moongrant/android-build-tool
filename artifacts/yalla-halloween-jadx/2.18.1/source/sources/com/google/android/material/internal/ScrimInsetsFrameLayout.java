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
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f17348Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public Drawable f17349Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Rect f17350Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Rect f17351Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f17352OoooO00;

    public class OooO00o implements o000O0O0.oo000o {
        public OooO00o() {
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f17350Oooo0oO == null) {
                scrimInsetsFrameLayout.f17350Oooo0oO = new Rect();
            }
            ScrimInsetsFrameLayout.this.f17350Oooo0oO.set(windowInsetsCompat.OooO0oO(), windowInsetsCompat.OooO(), windowInsetsCompat.OooO0oo(), windowInsetsCompat.OooO0o());
            ScrimInsetsFrameLayout.this.OooO00o(windowInsetsCompat);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            boolean z = true;
            if ((!windowInsetsCompat.f7918OooO00o.OooOO0O().equals(p071o000O0o.OooO.f28161OooO0o0)) && ScrimInsetsFrameLayout.this.f17349Oooo0o != null) {
                z = false;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout3 = ScrimInsetsFrameLayout.this;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO0o.OooOO0O(scrimInsetsFrameLayout3);
            return windowInsetsCompat.OooO00o();
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
        if (this.f17350Oooo0oO == null || this.f17349Oooo0o == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f17348Oooo) {
            this.f17351Oooo0oo.set(0, 0, width, this.f17350Oooo0oO.top);
            this.f17349Oooo0o.setBounds(this.f17351Oooo0oo);
            this.f17349Oooo0o.draw(canvas);
        }
        if (this.f17352OoooO00) {
            this.f17351Oooo0oo.set(0, height - this.f17350Oooo0oO.bottom, width, height);
            this.f17349Oooo0o.setBounds(this.f17351Oooo0oo);
            this.f17349Oooo0o.draw(canvas);
        }
        Rect rect = this.f17351Oooo0oo;
        Rect rect2 = this.f17350Oooo0oO;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f17349Oooo0o.setBounds(this.f17351Oooo0oo);
        this.f17349Oooo0o.draw(canvas);
        Rect rect3 = this.f17351Oooo0oo;
        Rect rect4 = this.f17350Oooo0oO;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f17349Oooo0o.setBounds(this.f17351Oooo0oo);
        this.f17349Oooo0o.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f17349Oooo0o;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f17349Oooo0o;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f17352OoooO00 = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f17348Oooo = z;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f17349Oooo0o = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17351Oooo0oo = new Rect();
        this.f17348Oooo = true;
        this.f17352OoooO00 = true;
        TypedArray typedArrayOooO0Oo = o000oOoO.OooO0Oo(context, attributeSet, p337o0OO0o0.Oooo0.ScrimInsetsFrameLayout, i, p337o0OO0o0.Oooo000.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f17349Oooo0o = typedArrayOooO0Oo.getDrawable(p337o0OO0o0.Oooo0.ScrimInsetsFrameLayout_insetForeground);
        typedArrayOooO0Oo.recycle();
        setWillNotDraw(true);
        OooO00o oooO00o = new OooO00o();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(this, oooO00o);
    }
}
