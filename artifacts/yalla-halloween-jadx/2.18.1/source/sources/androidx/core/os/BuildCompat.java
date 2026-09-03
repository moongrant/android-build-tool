package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class BuildCompat {

    @RequiresOptIn
    public @interface PrereleaseSdkCheck {
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public static boolean OooO00o(@NonNull String str) {
        String str2 = Build.VERSION.CODENAME;
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @ChecksSdkIntAtLeast(api = 31, codename = "S")
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean OooO0O0() {
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            if (i >= 30) {
                String str = Build.VERSION.CODENAME;
                if (OooO00o("S")) {
                }
            }
            return false;
        }
        return true;
    }
}
