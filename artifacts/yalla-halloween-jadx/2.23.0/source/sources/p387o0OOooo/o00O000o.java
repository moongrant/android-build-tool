package p387o0OOooo;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.appsflyer.AppsFlyerLib;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.common.support.crypto.AESKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p386o0OOooOo.o00O0O0;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000OOo;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000O0;
import p579o0oOoo.oO000Oo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44374OooO0Oo;

    public o00O000o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44374OooO0Oo = context;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        Context context = this.f44374OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        o00O0O0 o00o0o0 = new o00O0O0();
        String strOooO00o = oO000O0.OooO00o(oO000O0.f56533OooO00o);
        if (OooOo00.OooO0O0(strOooO00o) && !strOooO00o.equals("Yalla")) {
            AppsFlyerLib.getInstance().setOutOfStore(strOooO00o);
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        o000OOo o000oooOooO0o = o00Oo0.OooO0o();
        o000oooOooO0o.getClass();
        appsFlyerLib.init(new String(AESKt.aesDecrypt$default(o000oooOooO0o.OooO0o0(String.valueOf(-1347112992), o0000.OooO0OO(oO00OOo0.appsflyer_key)), oO000Oo.OooO00o(), o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8), o00o0o0, application);
        AppsFlyerLib.getInstance().setCollectIMEI(false);
        AppsFlyerLib.getInstance().setCollectAndroidID(false);
        AppsFlyerLib.getInstance().start(application);
    }
}
