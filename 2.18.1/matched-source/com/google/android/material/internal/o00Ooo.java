package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00Ooo {

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f17358Oooo0o;

        public OooO00o(View view) {
            this.f17358Oooo0o = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((InputMethodManager) this.f17358Oooo0o.getContext().getSystemService("input_method")).showSoftInput(this.f17358Oooo0o, 1);
        }
    }

    public class OooO0O0 implements o000O0O0.oo000o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f17359Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0o f17360Oooo0oO;

        public OooO0O0(OooO0OO oooO0OO, OooO0o oooO0o) {
            this.f17359Oooo0o = oooO0OO;
            this.f17360Oooo0oO = oooO0o;
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f17359Oooo0o.OooO00o(view, windowInsetsCompat, new OooO0o(this.f17360Oooo0oO));
        }
    }

    public interface OooO0OO {
        WindowInsetsCompat OooO00o(View view, WindowInsetsCompat windowInsetsCompat, OooO0o oooO0o);
    }

    public static void OooO00o(@NonNull View view, @NonNull OooO0OO oooO0OO) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(view, new OooO0O0(oooO0OO, new OooO0o(ViewCompat.OooO.OooO0o(view), view.getPaddingTop(), ViewCompat.OooO.OooO0o0(view), view.getPaddingBottom())));
        if (ViewCompat.OooOO0O.OooO0O0(view)) {
            ViewCompat.OooOOO0.OooO0OO(view);
        } else {
            view.addOnAttachStateChangeListener(new o00oO0o());
        }
    }

    public static float OooO0O0(@NonNull Context context, @Dimension(unit = 0) int i) {
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
    public static o00Oo0 OooO0Oo(@NonNull View view) {
        ViewGroup viewGroupOooO0OO = OooO0OO(view);
        if (viewGroupOooO0OO == null) {
            return null;
        }
        return new o00O0O(viewGroupOooO0OO);
    }

    public static boolean OooO0o(View view) {
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooO.OooO0Oo(view) == 1;
    }

    public static float OooO0o0(@NonNull View view) {
        float fOooO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            fOooO += ViewCompat.OooOOO.OooO((View) parent);
        }
        return fOooO;
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

    public static void OooO0oo(@NonNull View view) {
        view.requestFocus();
        view.post(new OooO00o(view));
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f17361OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f17362OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f17363OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f17364OooO0Oo;

        public OooO0o(int i, int i2, int i3, int i4) {
            this.f17361OooO00o = i;
            this.f17362OooO0O0 = i2;
            this.f17363OooO0OO = i3;
            this.f17364OooO0Oo = i4;
        }

        public final void OooO00o(View view) {
            int i = this.f17361OooO00o;
            int i2 = this.f17362OooO0O0;
            int i3 = this.f17363OooO0OO;
            int i4 = this.f17364OooO0Oo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooO.OooOO0O(view, i, i2, i3, i4);
        }

        public OooO0o(@NonNull OooO0o oooO0o) {
            this.f17361OooO00o = oooO0o.f17361OooO00o;
            this.f17362OooO0O0 = oooO0o.f17362OooO0O0;
            this.f17363OooO0OO = oooO0o.f17363OooO0OO;
            this.f17364OooO0Oo = oooO0o.f17364OooO0Oo;
        }
    }
}
