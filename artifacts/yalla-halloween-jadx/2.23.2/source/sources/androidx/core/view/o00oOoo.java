package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o00oOoo {

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static void OooO00o(@NonNull Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    @RequiresApi(30)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(@NonNull Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    public static void OooO00o(@NonNull Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            OooO0O0.OooO00o(window, z);
        } else {
            OooO00o.OooO00o(window, z);
        }
    }
}
