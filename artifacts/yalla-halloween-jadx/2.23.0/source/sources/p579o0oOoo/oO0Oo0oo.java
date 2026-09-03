package p579o0oOoo;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.StringKt;
import androidx.core.os.OooO00o;
import com.code.android.util.o000O0;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00oO0o;
import p408o0Oo0o0O.o00Oo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oO0Oo0oo {
    @Nullable
    public static String OooO00o() {
        OooO00o OooO00o2 = o00oO0o.OooO00o(Resources.getSystem().getConfiguration());
        Intrinsics.checkNotNullExpressionValue(OooO00o2, "getLocales(Resources.getSystem().configuration)");
        if (OooO00o2.OooO0Oo()) {
            return null;
        }
        Locale localeOooO0OO = OooO00o2.OooO0OO(0);
        String country = localeOooO0OO != null ? localeOooO0OO.getCountry() : null;
        if (country == null || country.length() == 0) {
            return null;
        }
        return StringKt.toUpperCase(country, androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent());
    }

    @Nullable
    public static String OooO0O0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String country = ((TelephonyManager) systemService).getSimCountryIso();
        if (country == null || country.length() == 0) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(country, "country");
        return StringKt.toUpperCase(country, androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent());
    }

    @NotNull
    public static String OooO0OO() {
        return OooO0Oo(o000O0.OooO00o());
    }

    @NotNull
    public static String OooO0Oo(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        String strOooO0O0 = OooO0O0(ctx);
        if (strOooO0O0 != null) {
            OooOOO0.OooO0O0("Country From Sim country = ".concat(strOooO0O0));
            return strOooO0O0;
        }
        String strOooO00o = OooO00o();
        if (strOooO00o != null) {
            OooOOO0.OooO0o("Country From Device country = ".concat(strOooO00o));
            return strOooO00o;
        }
        String upperCase = StringKt.toUpperCase(o00Oo0.OooO0O0().OooO0o0("currentCountryCode", ""), androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent());
        OooOOO0.OooO0oO("Country From ServiceIp country = " + upperCase);
        return upperCase;
    }
}
