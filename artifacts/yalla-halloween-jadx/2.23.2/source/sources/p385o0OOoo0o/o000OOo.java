package p385o0OOoo0o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.appevents.UserDataStore;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.text.StringsKt__StringsKt;
import p269o00oooo0.o0O0oo0o;
import p384o0OOoo0O.Oooo0;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;
import p426o0OoO0o0.OooOOOO;
import p475o0Ooooo0.o0O00oO0;
import p477o0o00.OooO0o;
import p590o0oOooo0.oOO0O0O;
import p590o0oOooo0.oOO0OOO;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static o000OOo f43481OooO00o;

    public static o000OOo OooO00o() {
        if (f43481OooO00o == null) {
            synchronized (o000OOo.class) {
                if (f43481OooO00o == null) {
                    f43481OooO00o = new o000OOo();
                }
            }
        }
        return f43481OooO00o;
    }

    public static void OooO0O0(long j, String str, Context context) {
        long jOooOO0o = o0O0O0Oo.OooOO0o(new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date()));
        OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        String strConcat = "accountTimeStamp".concat(String.valueOf(o0O00oO0.OooOOo0().getValue()));
        SharedPreferences sharedPreferences = oooO0oOooO00o.f48377OooO00o;
        long j2 = sharedPreferences == null ? -1L : sharedPreferences.getLong(strConcat, -1L);
        if (j2 == -1 || jOooOO0o != j2) {
            try {
                context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
            } catch (Exception e) {
                e.printStackTrace();
            }
            String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(oo0o0Oo.OooO0Oo(), "_", (String) null, 2, (Object) null);
            o0O0O00 o0o0o00 = new o0O0O00(context);
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("userid", j + "");
            linkedHashMapOooO00o.put("token", str);
            linkedHashMapOooO00o.put("Device", o000000.OooO00o());
            linkedHashMapOooO00o.put("sources", FeedbackType.Suggestions);
            linkedHashMapOooO00o.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, strSubstringBefore$default);
            linkedHashMapOooO00o.put("sysversion", Build.VERSION.RELEASE);
            linkedHashMapOooO00o.put("phoneBrand", oOO0OOO.OooO0O0(o000000.OooO0O0()));
            linkedHashMapOooO00o.put("phoneType", oOO0OOO.OooO0O0(o000000.OooO0OO()));
            linkedHashMapOooO00o.put(UserDataStore.COUNTRY, oOO0O0O.OooO0Oo(context));
            OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43379OoooOOO, linkedHashMapOooO00o, o0o0o00);
        }
    }
}
