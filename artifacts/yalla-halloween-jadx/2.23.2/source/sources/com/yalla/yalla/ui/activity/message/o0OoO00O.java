package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25524OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(SystemMessageActivity systemMessageActivity) {
        super(1);
        this.f25524OooO0Oo = systemMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2;
        String url = str;
        if (!com.code.android.util.OooOo00.OooO00o(url)) {
            RoomIndexModel value = p475o0Ooooo0.o0O00oO0.f47987Ooooo00.getValue();
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserLevel);
            Intrinsics.checkNotNull(url);
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32283OooO0o0 = url;
            webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.room_info_bonus));
            if (value != null && (str2 = value.barid) != null) {
                webPageInfo.OooO00o("barId", str2);
            }
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f25524OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
