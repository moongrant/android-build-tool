package p063o0000oO;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class o00oO0o {

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static LocaleList OooO00o(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @NonNull
    public static androidx.core.os.OooO00o OooO00o(@NonNull Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? new androidx.core.os.OooO00o(new o00000(OooO00o.OooO00o(configuration))) : androidx.core.os.OooO00o.OooO00o(configuration.locale);
    }
}
