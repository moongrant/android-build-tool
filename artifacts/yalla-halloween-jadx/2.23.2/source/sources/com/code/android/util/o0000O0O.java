package com.code.android.util;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0000O0O {
    @JvmStatic
    public static final void OooO00o(@NotNull View addHeightView) {
        Intrinsics.checkNotNullParameter(addHeightView, "addHeightView");
        ViewGroup.LayoutParams layoutParams = addHeightView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = OooO0Oo() + marginLayoutParams.height;
        addHeightView.requestLayout();
    }

    @JvmStatic
    public static final void OooO0O0(@NotNull View addMarginView) {
        Intrinsics.checkNotNullParameter(addMarginView, "addMarginView");
        if (addMarginView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = addMarginView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), OooO0Oo() + marginLayoutParams.topMargin, marginLayoutParams.getMarginEnd(), marginLayoutParams.bottomMargin);
            addMarginView.requestLayout();
        }
    }

    @JvmStatic
    public static final void OooO0OO(@NotNull View addPaddingView) {
        Intrinsics.checkNotNullParameter(addPaddingView, "addPaddingView");
        ViewGroup.LayoutParams layoutParams = addPaddingView.getLayoutParams();
        layoutParams.height = OooO0Oo() + layoutParams.height;
        addPaddingView.setPadding(addPaddingView.getPaddingLeft(), OooO0Oo() + addPaddingView.getPaddingTop(), addPaddingView.getPaddingRight(), addPaddingView.getPaddingEnd());
    }

    @JvmStatic
    public static final int OooO0Oo() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    @JvmStatic
    public static final void OooO0o(@NotNull Activity activity, int i, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setStatusBarColor(i);
        if (z) {
            activity.getWindow().getDecorView().setSystemUiVisibility(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        }
    }

    @JvmStatic
    public static final void OooO0o0(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        float f = 1 - (51 / 255.0f);
        OooO0o(activity, ((int) (((double) ((i & 255) * f)) + 0.5d)) | (-16777216) | (((int) (((double) (((i >> 16) & 255) * f)) + 0.5d)) << 16) | (((int) (((double) (((i >> 8) & 255) * f)) + 0.5d)) << 8), true);
    }

    @JvmStatic
    public static final void OooO0oO(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().setStatusBarColor(Color.argb(0, 0, 0, 0));
        activity.getWindow().getDecorView().setSystemUiVisibility(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
    }
}
