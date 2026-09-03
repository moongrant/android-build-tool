package p254o00ooO0O;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinVersion;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo0 {
    @JvmStatic
    public static final void OooO00o(@NotNull View addMarginView) {
        Intrinsics.checkNotNullParameter(addMarginView, "addMarginView");
        if (addMarginView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = addMarginView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), OooO0OO() + marginLayoutParams.topMargin, marginLayoutParams.getMarginEnd(), marginLayoutParams.bottomMargin);
            addMarginView.requestLayout();
        }
    }

    @JvmStatic
    public static final void OooO0O0(@NotNull View addPaddingView) {
        Intrinsics.checkNotNullParameter(addPaddingView, "addPaddingView");
        ViewGroup.LayoutParams layoutParams = addPaddingView.getLayoutParams();
        layoutParams.height = OooO0OO() + layoutParams.height;
        addPaddingView.setPadding(addPaddingView.getPaddingLeft(), OooO0OO() + addPaddingView.getPaddingTop(), addPaddingView.getPaddingRight(), addPaddingView.getPaddingEnd());
    }

    @JvmStatic
    public static final int OooO0OO() {
        Resources system = Resources.getSystem();
        return system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    @JvmStatic
    public static final void OooO0Oo(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        activity.getWindow().setStatusBarColor(i);
        activity.getWindow().getDecorView().setSystemUiVisibility(256);
    }

    @JvmStatic
    public static final void OooO0o(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.getWindow().setStatusBarColor(Color.argb(0, 0, 0, 0));
        activity.getWindow().getDecorView().setSystemUiVisibility(1024);
    }

    @JvmStatic
    public static final void OooO0o0(@NotNull Activity activity, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        float f = 1 - (51 / 255.0f);
        OooO0Oo(activity, ((int) (((double) ((i & KotlinVersion.MAX_COMPONENT_VALUE) * f)) + 0.5d)) | (-16777216) | (((int) (((double) (((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) * f)) + 0.5d)) << 16) | (((int) (((double) (((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) * f)) + 0.5d)) << 8));
    }
}
