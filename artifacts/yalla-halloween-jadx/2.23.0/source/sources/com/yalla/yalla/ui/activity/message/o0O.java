package com.yalla.yalla.ui.activity.message;

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
import p579o0oOoo.oO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25916OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25916OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        boolean z = url == null || StringsKt.isBlank(url);
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f25916OooO0Oo;
        if (z) {
            yallaTeamMessageActivity.f25783OooOoOO = false;
        } else {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FAQ);
            Intrinsics.checkNotNullExpressionValue(url, "it");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.OooO00o("isReply", "1");
            webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, p382o0OOoo0o.o00Ooo.OooO0Oo());
            webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, p382o0OOoo0o.oo000o.OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + p382o0OOoo0o.oo000o.OooO0OO());
            webPageInfo.OooO00o("sysVersion", p382o0OOoo0o.oo000o.OooO0Oo());
            webPageInfo.OooO00o("internet", oO.OooO00o().toString());
            webPageInfo.OooO00o("faqTag", String.valueOf(FaqTag.HotIssues.getValue()));
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(yallaTeamMessageActivity, webPageInfo);
            yallaTeamMessageActivity.f25783OooOoOO = false;
        }
        return Unit.INSTANCE;
    }
}
