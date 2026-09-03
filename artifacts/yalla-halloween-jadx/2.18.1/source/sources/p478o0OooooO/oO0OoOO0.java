package p478o0OooooO;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.uc.crashsdk.export.LogType;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import o000O0O0.o00000O;
import o000O0O0.oo000o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0OoOO0 {

    public static final class OooO00o implements oo000o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f40668Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f40669Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f40670Oooo0oo;

        public OooO00o(View view, boolean z, boolean z2) {
            this.f40668Oooo0o = view;
            this.f40669Oooo0oO = z;
            this.f40670Oooo0oo = z2;
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View v, WindowInsetsCompat insets) {
            View view = this.f40668Oooo0o;
            int i = oO0Ooooo.window_inset_manager_inset_top;
            Integer num = (Integer) view.getTag(i);
            int iIntValue = num != null ? num.intValue() : 0;
            Intrinsics.checkNotNullExpressionValue(insets, "insets");
            if (iIntValue == insets.OooO()) {
                return insets;
            }
            ViewGroup.LayoutParams layoutParams = this.f40668Oooo0o.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int iOooO = insets.OooO() - iIntValue;
            if (this.f40669Oooo0oO) {
                int i2 = marginLayoutParams.height;
                if (i2 >= 0) {
                    marginLayoutParams.height = i2 + iOooO;
                }
                View view2 = this.f40668Oooo0o;
                view2.setPadding(view2.getPaddingLeft(), this.f40668Oooo0o.getPaddingTop() + iOooO, this.f40668Oooo0o.getPaddingRight(), this.f40668Oooo0o.getPaddingBottom());
            } else {
                marginLayoutParams.topMargin += iOooO;
            }
            Intrinsics.checkNotNullExpressionValue(v, "v");
            v.setLayoutParams(marginLayoutParams);
            this.f40668Oooo0o.requestLayout();
            this.f40668Oooo0o.setTag(i, Integer.valueOf(insets.OooO()));
            return this.f40670Oooo0oo ? insets.OooOO0o(insets.OooO0oO(), 0, insets.OooO0oo(), insets.OooO0o()) : insets;
        }
    }

    public static final class OooO0O0 implements oo000o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ View f40671Oooo0o;

        public OooO0O0(View view) {
            this.f40671Oooo0o = view;
        }

        @Override // o000O0O0.oo000o
        public final WindowInsetsCompat OooO00o(View v, WindowInsetsCompat insets) {
            View view = this.f40671Oooo0o;
            int i = oO0Ooooo.window_inset_manager_inset_top;
            Integer num = (Integer) view.getTag(i);
            int iIntValue = num != null ? num.intValue() : 0;
            Intrinsics.checkNotNullExpressionValue(insets, "insets");
            if (iIntValue != insets.OooO()) {
                ViewGroup.LayoutParams layoutParams = this.f40671Oooo0o.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int iOooO = insets.OooO() - iIntValue;
                int i2 = marginLayoutParams.height;
                if (i2 >= 0) {
                    marginLayoutParams.height = i2 + iOooO;
                }
                Intrinsics.checkNotNullExpressionValue(v, "v");
                v.setLayoutParams(marginLayoutParams);
                this.f40671Oooo0o.requestLayout();
                this.f40671Oooo0o.setTag(i, Integer.valueOf(insets.OooO()));
            }
            return insets;
        }
    }

    public static final void OooO00o(@NotNull View fitTopInset, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(fitTopInset, "$this$fitTopInset");
        OooO00o oooO00o = new OooO00o(fitTopInset, z, z2);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(fitTopInset, oooO00o);
    }

    public static /* synthetic */ void OooO0O0(View view, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        OooO00o(view, z, false);
    }

    public static final void OooO0OO(@NotNull View fitTopInsetHight) {
        Intrinsics.checkNotNullParameter(fitTopInsetHight, "$this$fitTopInsetHight");
        OooO0O0 oooO0O0 = new OooO0O0(fitTopInsetHight);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(fitTopInsetHight, oooO0O0);
    }

    public static final void OooO0Oo(@NotNull Window colorStatusBar, int i) {
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
        decorView2.setSystemUiVisibility(LogType.UNEXP_ANR);
        colorStatusBar.setSoftInputMode(16);
    }
}
