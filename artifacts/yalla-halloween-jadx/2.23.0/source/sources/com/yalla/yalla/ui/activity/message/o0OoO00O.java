package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoO00O extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25965OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(SystemMessageActivity systemMessageActivity) {
        super(1);
        this.f25965OooO0Oo = systemMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2;
        String url = str;
        if (!com.code.android.util.OooOo00.OooO00o(url)) {
            RoomIndexModel value = p464o0Oooo.o000000O.f46724OoooOoo.getValue();
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.UserLevel);
            Intrinsics.checkNotNullExpressionValue(url, "it");
            Intrinsics.checkNotNullParameter(url, "url");
            webPageInfo.f32819OooO0o0 = url;
            webPageInfo.OooO0Oo(com.code.android.util.o0000.OooO0OO(oO00OOo0.room_info_bonus));
            if (value != null && (str2 = value.barid) != null) {
                webPageInfo.OooO00o("barId", str2);
            }
            int i = WebActivity.f25584OooOoO0;
            WebActivity.OooO00o.OooO00o(this.f25965OooO0Oo, webPageInfo);
        }
        return Unit.INSTANCE;
    }
}
