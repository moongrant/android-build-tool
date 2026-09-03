package p491o0o00O0o;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.TopicSettingActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p386o0OOooO.oo0o0Oo;
import p562o0oOo000.o000000;
import p590o0oOooo0.a0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O00000 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49000OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseActivityK f49001OooO0o0;

    public /* synthetic */ o0O00000(BaseActivityK baseActivityK, int i) {
        this.f49000OooO0Oo = i;
        this.f49001OooO0o0 = baseActivityK;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49000OooO0Oo;
        BaseActivityK baseActivityK = this.f49001OooO0o0;
        switch (i) {
            case 0:
                PhoneNumberActivity context = (PhoneNumberActivity) baseActivityK;
                String url = (String) obj;
                int i2 = PhoneNumberActivity.f24807OooOoO;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginPageFeedback);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32283OooO0o0 = url;
                    webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.feedback));
                    webPageInfo.OooO00o("PID", p386o0OOooO.o000000.OooO00o());
                    webPageInfo.OooO00o("type", "1");
                    webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, oo0o0Oo.OooO0Oo());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, p386o0OOooO.o000000.OooO0O0());
                    webPageInfo.OooO00o("sysVersion", p386o0OOooO.o000000.OooO0Oo());
                    webPageInfo.OooO00o("internet", a0.OooO00o().toString());
                    context.getClass();
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    break;
                }
                break;
            default:
                TopicSettingActivity this$0 = (TopicSettingActivity) baseActivityK;
                String it = (String) obj;
                int i3 = TopicSettingActivity.f25963OooOo0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                TopicInfoModel topicInfoModel = this$0.f25966OooOo00;
                if (topicInfoModel != null) {
                    topicInfoModel.setDescribe(it);
                }
                this$0.OooOo().f45087OooO0oO.setText(it);
                break;
        }
    }
}
