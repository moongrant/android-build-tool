package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0oo0o extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25954OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo0o(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25954OooO0Oo = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        Intrinsics.checkNotNullParameter(url, "it");
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.YallaTeamLink);
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f32819OooO0o0 = url;
        webPageInfo.f32825OooOOO = true;
        int i = WebActivity.f25584OooOoO0;
        WebActivity.OooO00o.OooO00o(this.f25954OooO0Oo, webPageInfo);
        return Unit.INSTANCE;
    }
}
