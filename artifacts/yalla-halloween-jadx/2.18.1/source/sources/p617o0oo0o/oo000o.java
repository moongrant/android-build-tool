package p617o0oo0o;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import o0000.OooO0o;
import o0000.OooOOO0;
import o00000O.o00oO0o;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o00O000;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oo000o {
    @NotNull
    public static final String OooO00o() {
        String strOooO00o;
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Context ctx = o00O000.OooO00o();
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Object systemService = ctx.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String country = ((TelephonyManager) systemService).getSimCountryIso();
        boolean z = true;
        String strOooO00o2 = null;
        if (country == null || country.length() == 0) {
            strOooO00o = null;
        } else {
            Intrinsics.checkNotNullExpressionValue(country, "country");
            strOooO00o = o00oO0o.OooO00o(country, new OooO0o(OooOOO0.f26569OooO00o.OooO00o().get(0)));
        }
        if (strOooO00o != null) {
            o00O00.OooO0O0("Country From Sim country = " + strOooO00o);
            return strOooO00o;
        }
        String country2 = o00000O0.OooO00o().getCountry();
        if (country2 != null && country2.length() != 0) {
            z = false;
        }
        if (!z) {
            Intrinsics.checkNotNullExpressionValue(country2, "country");
            strOooO00o2 = o00oO0o.OooO00o(country2, new OooO0o(OooOOO0.f26569OooO00o.OooO00o().get(0)));
        }
        if (strOooO00o2 != null) {
            o00O00.OooO0oO("Country From Device country = " + strOooO00o2);
            return strOooO00o2;
        }
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        String strOooO00o3 = o00oO0o.OooO00o(p497o0o00Oo.OooOOO0.OooO0O0().OooO0Oo("currentCountryCode", ""), new OooO0o(OooOOO0.f26569OooO00o.OooO00o().get(0)));
        o00O00.OooO("Country From ServiceIp country = " + strOooO00o3);
        return strOooO00o3;
    }
}
