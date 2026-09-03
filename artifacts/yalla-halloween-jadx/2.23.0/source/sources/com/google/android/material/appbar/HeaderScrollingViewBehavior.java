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
import androidx.core.view.o000O0Oo;
import com.google.android.material.search.SearchBar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes3.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f16247OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f16248OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f16249OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f16250OooO0o0;

    public HeaderScrollingViewBehavior() {
        this.f16247OooO0OO = new Rect();
        this.f16248OooO0Oo = new Rect();
        this.f16250OooO0o0 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
        AppBarLayout appBarLayoutOooOo0o;
        WindowInsetsCompat lastWindowInsets;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || (appBarLayoutOooOo0o = OooOo0o(coordinatorLayout.OooO(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(appBarLayoutOooOo0o) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.OooO0OO() + lastWindowInsets.OooO0o();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int iOooOoO0 = size + OooOoO0(appBarLayoutOooOo0o);
        int measuredHeight = appBarLayoutOooOo0o.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iOooOoO0 -= measuredHeight;
        }
        coordinatorLayout.OooOOo0(view, i, i2, View.MeasureSpec.makeMeasureSpec(iOooOoO0, i4 == -1 ? Pow2.MAX_POW2 : Integer.MIN_VALUE));
        return true;
    }

    public float OooOo(View view) {
        return 1.0f;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public final void OooOo0O(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i) {
        AppBarLayout appBarLayoutOooOo0o = OooOo0o(coordinatorLayout.OooO(view));
        int iOooO0O0 = 0;
        if (appBarLayoutOooOo0o == null) {
            coordinatorLayout.OooOOOo(i, view);
            this.f16250OooO0o0 = 0;
            return;
        }
        CoordinatorLayout.OooO0o oooO0o = (CoordinatorLayout.OooO0o) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) oooO0o).leftMargin;
        int bottom = appBarLayoutOooOo0o.getBottom() + ((ViewGroup.MarginLayoutParams) oooO0o).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) oooO0o).rightMargin;
        int bottom2 = ((appBarLayoutOooOo0o.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) oooO0o).bottomMargin;
        Rect rect = this.f16247OooO0OO;
        rect.set(paddingLeft, bottom, width, bottom2);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooO0o.OooO0O0(coordinatorLayout) && !ViewCompat.OooO0o.OooO0O0(view)) {
                rect.left = lastWindowInsets.OooO0Oo() + rect.left;
                rect.right -= lastWindowInsets.OooO0o0();
            }
        }
        Rect rect2 = this.f16248OooO0Oo;
        int i2 = oooO0o.f5213OooO0OO;
        if (i2 == 0) {
            i2 = 8388659;
        }
        androidx.core.view.o000oOoO.OooO0O0(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        if (this.f16249OooO0o != 0) {
            float fOooOo = OooOo(appBarLayoutOooOo0o);
            int i3 = this.f16249OooO0o;
            iOooO0O0 = o0000O00.OooO00o.OooO0O0((int) (fOooOo * i3), 0, i3);
        }
        view.layout(rect2.left, rect2.top - iOooO0O0, rect2.right, rect2.bottom - iOooO0O0);
        this.f16250OooO0o0 = rect2.top - appBarLayoutOooOo0o.getBottom();
    }

    @Nullable
    public abstract AppBarLayout OooOo0o(ArrayList arrayList);

    public int OooOoO0(@NonNull View view) {
        return view.getMeasuredHeight();
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16247OooO0OO = new Rect();
        this.f16248OooO0Oo = new Rect();
        this.f16250OooO0o0 = 0;
    }
}
