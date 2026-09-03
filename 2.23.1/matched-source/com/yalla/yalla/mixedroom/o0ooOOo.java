package com.yalla.yalla.mixedroom;

import android.content.Intent;
import androidx.lifecycle.Observer;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.model.SkillCardModel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p499o0o00OoO.o000O0;
import p587o0oOooO.oOO00OO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0ooOOo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f23089OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BaseFragmentActivity f23090OooO0o0;

    public /* synthetic */ o0ooOOo(BaseFragmentActivity baseFragmentActivity, int i) {
        this.f23089OooO0Oo = i;
        this.f23090OooO0o0 = baseFragmentActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f23089OooO0Oo;
        BaseFragmentActivity baseFragmentActivity = this.f23090OooO0o0;
        switch (i) {
            case 0:
                o000O0 o000o0 = ((MixedRoomActivity) baseFragmentActivity).f22972OooOoOO;
                if (o000o0 != null) {
                    o000o0.OooO00o((SkillCardModel) obj);
                }
                break;
            default:
                SmsCodeActivity context = (SmsCodeActivity) baseFragmentActivity;
                String url = (String) obj;
                int i2 = SmsCodeActivity.f24845Oooo0;
                Intrinsics.checkNotNullParameter(context, "this$0");
                if (!(url == null || StringsKt.isBlank(url))) {
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.VerificationCodeFeedback);
                    Intrinsics.checkNotNull(url);
                    Intrinsics.checkNotNullParameter(url, "url");
                    webPageInfo.f32289OooO0o0 = url;
                    webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.feedback));
                    String strSubstring = context.f24847OooOo.substring(context.f24853OooOoO0.length(), context.f24847OooOo.length());
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    webPageInfo.OooO00o("Tel", strSubstring);
                    webPageInfo.OooO00o("type", FeedbackType.Suggestions);
                    webPageInfo.OooO00o("areaCode", "mAreaCode");
                    webPageInfo.OooO00o("PID", p388o0OOooO.o000000.OooO00o());
                    webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, p388o0OOooO.oo0o0Oo.OooO0Oo());
                    webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, p388o0OOooO.o000000.OooO0O0());
                    webPageInfo.OooO00o("sysVersion", p388o0OOooO.o000000.OooO0Oo());
                    webPageInfo.OooO00o("internet", oOO00OO.OooO00o().toString());
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) WebActivity.class);
                    intent.putExtra("pageinfo", webPageInfo);
                    context.startActivity(intent);
                    break;
                }
                break;
        }
    }
}
