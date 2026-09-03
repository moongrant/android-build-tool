package p395o0Oo00o;

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
import p191o00o0O0.o00Oo0;
import p390o0OOooo.o000000O;
import p414o0Oo0oO.oO000Oo0;
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.o000000;
import p590o0oOooo0.oO0oO000;
import p590o0oOooo0.oOO0;
import p590o0oOooo0.oOO0Oo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOO0O extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43622OooO0Oo;

    public OooOO0O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43622OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = this.f43622OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        o000000O o000000o2 = new o000000O();
        String strOooO00o = oOO0.OooO00o(oOO0.f57167OooO00o);
        if (OooOo00.OooO0O0(strOooO00o) && !strOooO00o.equals("Yalla")) {
            AppsFlyerLib.getInstance().setOutOfStore(strOooO00o);
        }
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        oO000Oo0 oo000oo0OooO0o = o00Ooo.OooO0o();
        oo000oo0OooO0o.getClass();
        appsFlyerLib.init(new String(AESKt.aesDecrypt$default(oo000oo0OooO0o.OooO0o0(String.valueOf(-1347112992), o0000.OooO0OO(o000000.appsflyer_key)), oOO0Oo00.OooO00o(), oO0oO000.f57154OooO00o, false, null, 12, null), Charsets.UTF_8), o000000o2, application);
        AppsFlyerLib.getInstance().setCollectIMEI(false);
        AppsFlyerLib.getInstance().setCollectAndroidID(false);
        AppsFlyerLib.getInstance().start(application);
    }
}
