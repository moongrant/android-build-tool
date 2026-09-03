package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oo0o0Oo {

    public class OooO00o implements o000000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f16868OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f16869OooO0o0;

        public OooO00o(OooO0O0 oooO0O0, OooO0OO oooO0OO) {
            this.f16868OooO0Oo = oooO0O0;
            this.f16869OooO0o0 = oooO0OO;
        }

        @Override // androidx.core.view.o000000O
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f16868OooO0Oo.OooO00o(view, windowInsetsCompat, new OooO0OO(this.f16869OooO0o0));
        }
    }

    public interface OooO0O0 {
        WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, OooO0OO oooO0OO);
    }

    public static void OooO00o(@NonNull View view, @NonNull OooO0O0 oooO0O0) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
        ViewCompat.OooOOO.OooOo0(view, new OooO00o(oooO0O0, new OooO0OO(ViewCompat.OooO.OooO0o(view), view.getPaddingTop(), ViewCompat.OooO.OooO0o0(view), view.getPaddingBottom())));
        if (ViewCompat.OooOO0O.OooO0O0(view)) {
            ViewCompat.OooOOO0.OooO0OO(view);
        } else {
            view.addOnAttachStateChangeListener(new o0O0O00());
        }
    }

    public static float OooO0O0(@Dimension(unit = 0) int i, @NonNull Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @Nullable
    public static ViewGroup OooO0OO(@Nullable View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @Nullable
    public static o0OOO0o OooO0Oo(@NonNull View view) {
        ViewGroup viewGroupOooO0OO = OooO0OO(view);
        if (viewGroupOooO0OO == null) {
            return null;
        }
        return new o0OOO0o(viewGroupOooO0OO);
    }

    public static boolean OooO0o(View view) {
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
        return ViewCompat.OooO.OooO0Oo(view) == 1;
    }

    public static void OooO0o0(@NonNull View view, boolean z) {
        o0 o0VarOooO0oo;
        if (z && (o0VarOooO0oo = ViewCompat.OooO0oo(view)) != null) {
            o0VarOooO0oo.f5423OooO00o.OooO00o(8);
            return;
        }
        Context context = view.getContext();
        Object obj = ContextCompat.f5284OooO00o;
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.OooO0o.OooO0O0(context, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static PorterDuff.Mode OooO0oO(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f16870OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f16871OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f16872OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f16873OooO0Oo;

        public OooO0OO(int i, int i2, int i3, int i4) {
            this.f16870OooO00o = i;
            this.f16871OooO0O0 = i2;
            this.f16872OooO0OO = i3;
            this.f16873OooO0Oo = i4;
        }

        public OooO0OO(@NonNull OooO0OO oooO0OO) {
            this.f16870OooO00o = oooO0OO.f16870OooO00o;
            this.f16871OooO0O0 = oooO0OO.f16871OooO0O0;
            this.f16872OooO0OO = oooO0OO.f16872OooO0OO;
            this.f16873OooO0Oo = oooO0OO.f16873OooO0Oo;
        }
    }
}
