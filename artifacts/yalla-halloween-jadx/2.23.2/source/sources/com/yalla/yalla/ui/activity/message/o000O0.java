package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.util.WebPageInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends Lambda implements Function1<WebPageInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25360OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25360OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(WebPageInfo webPageInfo) {
        WebPageInfo webPageInfo2 = webPageInfo;
        Intrinsics.checkNotNullParameter(webPageInfo2, "webPageInfo");
        o0oo0000.OooO00o.OooO0OO("305003", MapsKt.mapOf(new Pair("sources", 4)));
        int i = PrivateChatActivity.f25239Oooo000;
        this.f25360OooO0Oo.OooOo0o().setHalfDialogWebPageInfo(webPageInfo2);
        return Unit.INSTANCE;
    }
}
