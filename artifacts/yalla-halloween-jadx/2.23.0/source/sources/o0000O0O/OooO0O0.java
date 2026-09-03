package o0000O0O;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Method f34102OooO00o;

    @RequiresApi(21)
    public static class OooO00o {
        @DoNotInline
        public static String OooO00o(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: renamed from: o0000O0O.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @RequiresApi(24)
    public static class C0394OooO0O0 {
        @DoNotInline
        public static ULocale OooO00o(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        @DoNotInline
        public static ULocale OooO0O0(Locale locale) {
            return ULocale.forLocale(locale);
        }

        @DoNotInline
        public static String OooO0OO(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f34102OooO00o = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    @Nullable
    public static String OooO00o(@NonNull Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0394OooO0O0.OooO0OO(C0394OooO0O0.OooO00o(C0394OooO0O0.OooO0O0(locale)));
        }
        try {
            return OooO00o.OooO00o((Locale) f34102OooO00o.invoke(null, locale));
        } catch (IllegalAccessException e) {
            Log.w("ICUCompat", e);
            return OooO00o.OooO00o(locale);
        } catch (InvocationTargetException e2) {
            Log.w("ICUCompat", e2);
            return OooO00o.OooO00o(locale);
        }
    }
}
