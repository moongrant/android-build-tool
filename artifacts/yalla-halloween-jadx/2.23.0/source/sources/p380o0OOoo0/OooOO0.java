package p380o0OOoo0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.android.billingclient.api.o0000OO0;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.text.StringsKt__StringsKt;
import p377o0OOoOo.o0000O;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p464o0Oooo.o000000O;
import p480o0o000Oo.o0OOO0o;
import p579o0oOoo.oO000Oo0;
import p579o0oOoo.oO0Oo0oo;
import p590o0oo0.OooOOOO;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooOO0 f44247OooO00o;

    public static OooOO0 OooO00o() {
        if (f44247OooO00o == null) {
            synchronized (OooOO0.class) {
                if (f44247OooO00o == null) {
                    f44247OooO00o = new OooOO0();
                }
            }
        }
        return f44247OooO00o;
    }

    public static void OooO0O0(long j, String str, Context context) {
        long jOooOO0o = OooOOOO.OooOO0o(new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date()));
        o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        String strConcat = "accountTimeStamp".concat(String.valueOf(o000000O.OooOOo0().getValue()));
        SharedPreferences sharedPreferences = o0ooo0oOooO0O0.f47688OooO00o;
        long j2 = sharedPreferences == null ? -1L : sharedPreferences.getLong(strConcat, -1L);
        if (j2 == -1 || jOooOO0o != j2) {
            try {
                context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(o00Ooo.OooO0Oo(), "_", (String) null, 2, (Object) null);
            OooO oooO = new OooO(context);
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("userid", j + "");
            linkedHashMapOooO00o.put("token", str);
            linkedHashMapOooO00o.put("Device", oo000o.OooO00o());
            linkedHashMapOooO00o.put("sources", FeedbackType.Suggestions);
            linkedHashMapOooO00o.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, strSubstringBefore$default);
            linkedHashMapOooO00o.put("sysversion", Build.VERSION.RELEASE);
            linkedHashMapOooO00o.put("phoneBrand", oO000Oo0.OooO0O0(oo000o.OooO0O0()));
            linkedHashMapOooO00o.put("phoneType", oO000Oo0.OooO0O0(oo000o.OooO0OO()));
            linkedHashMapOooO00o.put(UserDataStore.COUNTRY, oO0Oo0oo.OooO0Oo(context));
            OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44120OoooOOO, linkedHashMapOooO00o, oooO);
        }
    }
}
