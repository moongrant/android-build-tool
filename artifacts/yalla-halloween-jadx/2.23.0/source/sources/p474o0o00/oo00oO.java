package p474o0o00;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p579o0oOoo.oO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00oO implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47352OooO0Oo;

    public oo00oO(PhoneNumberActivity phoneNumberActivity) {
        this.f47352OooO0Oo = phoneNumberActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String url = str;
        if (url == null || StringsKt.isBlank(url)) {
            return;
        }
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginPageFeedback);
        Intrinsics.checkNotNullExpressionValue(url, "it");
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32819OooO0o0 = url;
        webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.feedback));
        webPageInfo.OooO00o("PID", oo000o.OooO00o());
        webPageInfo.OooO00o("type", "1");
        webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, o00Ooo.OooO0Oo());
        webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, oo000o.OooO0O0());
        webPageInfo.OooO00o("sysVersion", oo000o.OooO0Oo());
        webPageInfo.OooO00o("internet", oO.OooO00o().toString());
        int i = WebActivity.f25584OooOoO0;
        PhoneNumberActivity phoneNumberActivity = this.f47352OooO0Oo;
        phoneNumberActivity.getClass();
        WebActivity.OooO00o.OooO00o(phoneNumberActivity, webPageInfo);
    }
}
