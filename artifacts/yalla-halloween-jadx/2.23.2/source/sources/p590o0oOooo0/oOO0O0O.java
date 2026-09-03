package p590o0oOooo0;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.StringKt;
import com.code.android.util.o000O00O;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00O0O;
import p063o0000oO.o00oO0o;
import p415o0Oo0oO0.o00Ooo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class oOO0O0O {
    @Nullable
    public static String OooO00o() {
        o00oO0o o00oo0oOooO00o = o00O0O.OooO00o(Resources.getSystem().getConfiguration());
        Intrinsics.checkNotNullExpressionValue(o00oo0oOooO00o, "getLocales(...)");
        if (o00oo0oOooO00o.OooO0Oo()) {
            return null;
        }
        Locale localeOooO0OO = o00oo0oOooO00o.OooO0OO(0);
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
        String simCountryIso = ((TelephonyManager) systemService).getSimCountryIso();
        if (simCountryIso == null || simCountryIso.length() == 0) {
            return null;
        }
        Intrinsics.checkNotNull(simCountryIso);
        return StringKt.toUpperCase(simCountryIso, androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent());
    }

    @NotNull
    public static String OooO0OO() {
        return OooO0Oo(o000O00O.OooO00o());
    }

    @NotNull
    public static String OooO0Oo(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        String strOooO0O0 = OooO0O0(ctx);
        if (strOooO0O0 != null) {
            o0000O00.OooO0O0("Country From Sim country = ".concat(strOooO0O0));
            return strOooO0O0;
        }
        String strOooO00o = OooO00o();
        if (strOooO00o != null) {
            o0000O00.OooO0o("Country From Device country = ".concat(strOooO00o));
            return strOooO00o;
        }
        String upperCase = StringKt.toUpperCase(o00Ooo.OooO0O0().OooO0o0("currentCountryCode", ""), androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent());
        o0000O00.OooO0oO("Country From ServiceIp country = " + upperCase);
        return upperCase;
    }
}
