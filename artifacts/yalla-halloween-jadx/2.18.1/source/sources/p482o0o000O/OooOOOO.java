package p482o0o000O;

import android.app.Application;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.ProxyBillingActivity;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookActivity;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.twitter.sdk.android.core.identity.OAuthActivity;
import com.weieyu.yalla.wxapi.WXEntryActivity;
import com.yalla.support.common.util.OooO0O0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;
import p391o0OOooOo.o0O00000;
import p487o0o000oO.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40862OooO0OO;

    public OooOOOO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40862OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        Context context = this.f40862OooO0OO;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) this.f40862OooO0OO;
        FacebookSdk.sdkInitialize(application);
        AppEventsLogger.activateApp(application);
        o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
        o0O00000.OooO0o0("OS_CPUABI", (String) o0Oo0oo.f40953OooO0oO.getValue());
        OooO0O0 oooO0O0 = OooO0O0.f20502OooO00o;
        oooO0O0.OooO00o(OAuthActivity.class);
        oooO0O0.OooO00o(FacebookActivity.class);
        oooO0O0.OooO00o(CustomTabActivity.class);
        oooO0O0.OooO00o(CustomTabMainActivity.class);
        oooO0O0.OooO00o(WXEntryActivity.class);
        oooO0O0.OooO00o(ProxyBillingActivity.class);
    }
}
