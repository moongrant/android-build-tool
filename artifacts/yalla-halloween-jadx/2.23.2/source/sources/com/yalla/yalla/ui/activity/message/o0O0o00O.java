package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o00O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessage f25509OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25510OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o00O(YallaTeamMessage yallaTeamMessage, YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25509OooO0Oo = yallaTeamMessage;
        this.f25510OooO0o0 = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String url = str;
        if (!(url == null || StringsKt.isBlank(url))) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
            Intrinsics.checkNotNull(url);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32283OooO0o0 = url;
            webPageInfo.f32280OooO = true;
            webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_unique_id));
            YallaTeamMessage yallaTeamMessage = this.f25509OooO0Oo;
            webPageInfo.OooO00o("typeid", String.valueOf(yallaTeamMessage.getJumpType()));
            webPageInfo.OooO00o("jumpname", yallaTeamMessage.getJumpId());
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f25510OooO0o0, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
