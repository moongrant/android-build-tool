package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import java.util.Locale;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public final class BuildCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f5310OooO00o = 0;

    @RequiresApi(30)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int f5311OooO00o = 0;

        static {
            SdkExtensions.getExtensionVersion(30);
            SdkExtensions.getExtensionVersion(31);
            SdkExtensions.getExtensionVersion(33);
            SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
        }
    }

    @RequiresOptIn
    public @interface PrereleaseSdkCheck {
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = OooO00o.f5311OooO00o;
        }
        if (i >= 30) {
            int i3 = OooO00o.f5311OooO00o;
        }
        if (i >= 30) {
            int i4 = OooO00o.f5311OooO00o;
        }
        if (i >= 30) {
            int i5 = OooO00o.f5311OooO00o;
        }
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public static boolean OooO00o(@NonNull String str, @NonNull String str2) {
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
        return i >= 31 || (i >= 30 && OooO00o("S", Build.VERSION.CODENAME));
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @PrereleaseSdkCheck
    public static boolean OooO0OO() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && OooO00o("Tiramisu", Build.VERSION.CODENAME));
    }
}
