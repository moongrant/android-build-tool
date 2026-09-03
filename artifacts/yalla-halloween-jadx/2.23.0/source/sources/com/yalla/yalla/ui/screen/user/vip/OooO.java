package com.yalla.yalla.ui.screen.user.vip;

import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p579o0oOoo.oOo0o00;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f30196OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(AppCompatActivity appCompatActivity) {
        super(1);
        this.f30196OooO0Oo = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserKaVipHelpPage);
            webPageInfo.f32818OooO0o = true;
            Intrinsics.checkNotNullExpressionValue(url, "url");
            oOo0o00.OooO0O0(url, "tab", "1");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f30196OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
