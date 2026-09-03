package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p021OooOooo.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f16445OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f16446OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16447OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16448OooO0o0;

    public HeaderScrollingViewBehavior() {
        this.f16445OooO0OO = new Rect();
        this.f16446OooO0Oo = new Rect();
        this.f16448OooO0o0 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        View viewOooOo0o;
        WindowInsetsCompat lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (viewOooOo0o = OooOo0o(coordinatorLayout.OooO(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(viewOooOo0o) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.OooO0o() + lastWindowInsets.OooO();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.OooOo(view, i, i2, View.MeasureSpec.makeMeasureSpec((size + OooOoO(viewOooOo0o)) - viewOooOo0o.getMeasuredHeight(), i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
        return true;
    }

    public final int OooOo(View view) {
        if (this.f16447OooO0o == 0) {
            return 0;
        }
        float fOooOoO0 = OooOoO0(view);
        int i = this.f16447OooO0o;
        return o00O0O.OooO0o0((int) (fOooOoO0 * i), 0, i);
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void OooOo0(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        View viewOooOo0o = OooOo0o(coordinatorLayout.OooO(view));
        if (viewOooOo0o == null) {
            coordinatorLayout.OooOo0o(view, i);
            this.f16448OooO0o0 = 0;
            return;
        }
        CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) view.getLayoutParams();
        Rect rect = this.f16445OooO0OO;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin, viewOooOo0o.getBottom() + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin, ((viewOooOo0o.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(coordinatorLayout) && !ViewCompat.OooO0o.OooO0O0(view)) {
                rect.left = lastWindowInsets.OooO0oO() + rect.left;
                rect.right -= lastWindowInsets.OooO0oo();
            }
        }
        Rect rect2 = this.f16446OooO0Oo;
        int i2 = oooO0o.f7763OooO0OO;
        o000O0O0.OooO0o.OooO0O0(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iOooOo = OooOo(viewOooOo0o);
        view.layout(rect2.left, rect2.top - iOooOo, rect2.right, rect2.bottom - iOooOo);
        this.f16448OooO0o0 = rect2.top - viewOooOo0o.getBottom();
    }

    @Nullable
    public abstract View OooOo0o(List<View> list);

    public int OooOoO(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    public float OooOoO0(View view) {
        return 1.0f;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16445OooO0OO = new Rect();
        this.f16446OooO0Oo = new Rect();
        this.f16448OooO0o0 = 0;
    }
}
