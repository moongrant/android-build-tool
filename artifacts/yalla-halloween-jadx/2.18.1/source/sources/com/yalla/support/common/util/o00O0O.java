package com.yalla.support.common.util;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O {
    public static final void OooO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (OooO0OO(view)) {
            return;
        }
        view.setVisibility(0);
    }

    public static final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
    }

    public static final void OooO0O0(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static final boolean OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static void OooO0Oo(View view, Function1 action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.setOnClickListener(new o0OoOo0(500L, action));
    }

    public static final void OooO0o(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(view.getPaddingStart(), i, view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static final void OooO0o0(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static final void OooO0oO(@NotNull View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            OooO(view);
        } else {
            OooO00o(view);
        }
    }

    public static final void OooO0oo(@NotNull View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLayoutParams().height = i;
        view.requestLayout();
    }
}
