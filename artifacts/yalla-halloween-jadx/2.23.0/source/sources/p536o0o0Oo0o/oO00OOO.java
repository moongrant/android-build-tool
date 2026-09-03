package p536o0o0Oo0o;

import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.model.FaqTag;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p579o0oOoo.oO;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OOO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f55129OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(FragmentActivity fragmentActivity) {
        super(1);
        this.f55129OooO0Oo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            o0OO000.OooO00o("105022");
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FAQ);
            Intrinsics.checkNotNullExpressionValue(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.OooO00o("isReply", AppEventsConstants.EVENT_PARAM_VALUE_NO);
            webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, o00Ooo.OooO0Oo());
            webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, oo000o.OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo000o.OooO0OO());
            webPageInfo.OooO00o("sysVersion", oo000o.OooO0Oo());
            webPageInfo.OooO00o("internet", oO.OooO00o().toString());
            webPageInfo.OooO00o("faqTag", String.valueOf(FaqTag.HotIssues.getValue()));
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f55129OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
