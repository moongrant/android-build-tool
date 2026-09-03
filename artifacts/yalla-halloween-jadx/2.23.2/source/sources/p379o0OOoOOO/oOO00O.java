package p379o0OOoOOO;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO00O {

    public static final class OooO00o implements o000000O {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ View f43253OooO0Oo;

        public OooO00o(View view) {
            this.f43253OooO0Oo = view;
        }

        @Override // androidx.core.view.o000000O
        public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
            int i = o00O000o.window_inset_manager_inset_top;
            View view = this.f43253OooO0Oo;
            Integer num = (Integer) view.getTag(i);
            int iIntValue = num != null ? num.intValue() : 0;
            Intrinsics.checkNotNullExpressionValue(insets, "insets");
            if (iIntValue != insets.OooO0o()) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int iOooO0o = insets.OooO0o() - iIntValue;
                int i2 = marginLayoutParams.height;
                if (i2 >= 0) {
                    marginLayoutParams.height = i2 + iOooO0o;
                }
                Intrinsics.checkNotNullExpressionValue(v, "v");
                v.setLayoutParams(marginLayoutParams);
                view.requestLayout();
                view.setTag(i, Integer.valueOf(insets.OooO0o()));
            }
            return insets;
        }
    }

    public static void OooO00o(View fitTopInset, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        Intrinsics.checkNotNullParameter(fitTopInset, "$this$fitTopInset");
        o00O00O o00o00o2 = new o00O00O(fitTopInset, z, false);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(fitTopInset, o00o00o2);
    }

    public static final void OooO0O0(@NotNull View fitTopInsetHight) {
        Intrinsics.checkNotNullParameter(fitTopInsetHight, "$this$fitTopInsetHight");
        OooO00o oooO00o = new OooO00o(fitTopInsetHight);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        ViewCompat.OooOOO.OooOo0(fitTopInsetHight, oooO00o);
    }

    public static final void OooO0OO(@NotNull Window colorStatusBar, int i) {
        Intrinsics.checkNotNullParameter(colorStatusBar, "$this$immersiveStatusBar");
        Intrinsics.checkNotNullParameter(colorStatusBar, "$this$setStatusBarTranslucent");
        int iArgb = Color.argb(i, 0, 0, 0);
        Intrinsics.checkNotNullParameter(colorStatusBar, "$this$colorStatusBar");
        colorStatusBar.setStatusBarColor(iArgb);
        if (Build.VERSION.SDK_INT >= 28) {
            colorStatusBar.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        View decorView = colorStatusBar.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "decorView");
        decorView.setFitsSystemWindows(false);
        View decorView2 = colorStatusBar.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "decorView");
        decorView2.setSystemUiVisibility(1280);
        colorStatusBar.setSoftInputMode(16);
    }
}
