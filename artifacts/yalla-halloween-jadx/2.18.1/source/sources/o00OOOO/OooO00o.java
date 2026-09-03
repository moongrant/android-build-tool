package o00OOOO;

import android.content.Context;
import android.os.Build;
import com.android.billingclient.api.o00000O;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.text.StringsKt__StringsKt;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p166o00OoOoo.o0O00O0o;
import p168o00Ooo0.o0O0O00;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.o000oOoO;
import p617o0oo0o.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO00o f31679OooO00o;

    /* JADX INFO: renamed from: o00OOOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0344OooO00o extends o00OO0O0.OooO0O0 {
        public C0344OooO00o(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            long jOooOOO0 = o0O0O00.OooOOO0(new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date()));
            o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("accountTimeStamp");
            sbOooO0o0.append(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
            o0o00o0oOooO0O0.OooO0o(sbOooO0o0.toString(), jOooOOO0);
        }
    }

    public static OooO00o OooO00o() {
        if (f31679OooO00o == null) {
            synchronized (OooO00o.class) {
                if (f31679OooO00o == null) {
                    f31679OooO00o = new OooO00o();
                }
            }
        }
        return f31679OooO00o;
    }

    public final void OooO0O0(Context context, long j, String str) {
        long jOooOOO0 = o0O0O00.OooOOO0(new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH).format(new Date()));
        o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("accountTimeStamp");
        sbOooO0o0.append(String.valueOf(OooOOO.f41216OooO00o.OooOo().getValue()));
        long jOooO0O0 = o0o00o0oOooO0O0.OooO0O0(sbOooO0o0.toString(), -1L);
        if (jOooO0O0 == -1 || jOooOOO0 != jOooO0O0) {
            try {
                context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
            } catch (Exception e) {
                e.printStackTrace();
            }
            o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
            String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(o0OOO0o.OooO0O0(), "_", (String) null, 2, (Object) null);
            C0344OooO00o c0344OooO00o = new C0344OooO00o(context);
            Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
            mapOooO0O0.put("userid", j + "");
            mapOooO0O0.put(FirebaseMessagingService.EXTRA_TOKEN, str);
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            mapOooO0O0.put("Device", o0Oo0oo.OooO00o());
            mapOooO0O0.put("sources", FeedbackType.Suggestions);
            mapOooO0O0.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, strSubstringBefore$default);
            mapOooO0O0.put("sysversion", Build.VERSION.RELEASE);
            mapOooO0O0.put("phoneBrand", o000oOoO.OooO0O0(o0Oo0oo.OooO0O0()));
            mapOooO0O0.put("phoneType", o000oOoO.OooO0O0(o0Oo0oo.OooO0OO()));
            mapOooO0O0.put("country", oo000o.OooO00o());
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32264OoooOOO, mapOooO0O0, c0344OooO00o);
        }
    }
}
