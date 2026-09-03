package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.o0O0ooO;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000O0Oo;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O implements androidx.core.view.o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f2399OooO0Oo;

    public OooOO0O(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f2399OooO0Oo = appCompatDelegateImpl;
    }

    @Override // androidx.core.view.o000000O
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        boolean z2;
        int iOooO00o;
        int iOooO0o = windowInsetsCompat.OooO0o();
        AppCompatDelegateImpl appCompatDelegateImpl = this.f2399OooO0Oo;
        appCompatDelegateImpl.getClass();
        int iOooO0o2 = windowInsetsCompat.OooO0o();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.f2314OooOoO0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatDelegateImpl.f2314OooOoO0.getLayoutParams();
            boolean z3 = true;
            if (appCompatDelegateImpl.f2314OooOoO0.isShown()) {
                if (appCompatDelegateImpl.f2347Oooooo0 == null) {
                    appCompatDelegateImpl.f2347Oooooo0 = new Rect();
                    appCompatDelegateImpl.f2346Oooooo = new Rect();
                }
                Rect rect = appCompatDelegateImpl.f2347Oooooo0;
                Rect rect2 = appCompatDelegateImpl.f2346Oooooo;
                rect.set(windowInsetsCompat.OooO0Oo(), windowInsetsCompat.OooO0o(), windowInsetsCompat.OooO0o0(), windowInsetsCompat.OooO0OO());
                ViewGroup viewGroup = appCompatDelegateImpl.f2319OooOooo;
                Method method = o0O0ooO.f3357OooO00o;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup2 = appCompatDelegateImpl.f2319OooOooo;
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                WindowInsetsCompat windowInsetsCompatOooO00o = ViewCompat.OooOOOO.OooO00o(viewGroup2);
                int iOooO0Oo = windowInsetsCompatOooO00o == null ? 0 : windowInsetsCompatOooO00o.OooO0Oo();
                int iOooO0o0 = windowInsetsCompatOooO00o == null ? 0 : windowInsetsCompatOooO00o.OooO0o0();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = appCompatDelegateImpl.f2301OooOOO;
                if (i <= 0 || appCompatDelegateImpl.f2323Oooo00O != null) {
                    View view2 = appCompatDelegateImpl.f2323Oooo00O;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iOooO0Oo || marginLayoutParams2.rightMargin != iOooO0o0) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iOooO0Oo;
                            marginLayoutParams2.rightMargin = iOooO0o0;
                            appCompatDelegateImpl.f2323Oooo00O.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    appCompatDelegateImpl.f2323Oooo00O = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iOooO0Oo;
                    layoutParams.rightMargin = iOooO0o0;
                    appCompatDelegateImpl.f2319OooOooo.addView(appCompatDelegateImpl.f2323Oooo00O, -1, layoutParams);
                }
                View view4 = appCompatDelegateImpl.f2323Oooo00O;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = appCompatDelegateImpl.f2323Oooo00O;
                    if ((ViewCompat.OooO0o.OooO0oO(view5) & 8192) != 0) {
                        int i6 = p012OooOo0O.OooOOOO.abc_decor_view_status_guard_light;
                        Object obj = ContextCompat.f5271OooO00o;
                        iOooO00o = ContextCompat.OooO0o.OooO00o(context, i6);
                    } else {
                        int i7 = p012OooOo0O.OooOOOO.abc_decor_view_status_guard;
                        Object obj2 = ContextCompat.f5271OooO00o;
                        iOooO00o = ContextCompat.OooO0o.OooO00o(context, i7);
                    }
                    view5.setBackgroundColor(iOooO00o);
                }
                if (!appCompatDelegateImpl.f2328Oooo0o0 && z) {
                    iOooO0o2 = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z3 = false;
                z = false;
            }
            if (z3) {
                appCompatDelegateImpl.f2314OooOoO0.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = appCompatDelegateImpl.f2323Oooo00O;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        return ViewCompat.OooOO0(view, iOooO0o != iOooO0o2 ? windowInsetsCompat.OooO0oo(windowInsetsCompat.OooO0Oo(), iOooO0o2, windowInsetsCompat.OooO0o0(), windowInsetsCompat.OooO0OO()) : windowInsetsCompat);
    }
}
