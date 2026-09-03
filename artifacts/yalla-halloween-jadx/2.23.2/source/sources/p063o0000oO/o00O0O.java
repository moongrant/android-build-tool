package p063o0000oO;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O {

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static LocaleList OooO00o(Configuration configuration) {
            return configuration.getLocales();
        }

        @DoNotInline
        public static void OooO0O0(@NonNull Configuration configuration, @NonNull o00oO0o o00oo0o2) {
            configuration.setLocales((LocaleList) o00oo0o2.f33780OooO00o.OooO0O0());
        }
    }

    @NonNull
    public static o00oO0o OooO00o(@NonNull Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new o00oO0o(new o0O0O00(OooO00o.OooO00o(configuration))) : o00oO0o.OooO00o(configuration.locale);
    }
}
