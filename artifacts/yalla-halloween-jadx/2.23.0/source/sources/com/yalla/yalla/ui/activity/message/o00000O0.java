package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25799OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25799OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String s = str;
        Intrinsics.checkNotNullParameter(s, "s");
        int i = PrivateChatActivity.f25694Oooo000;
        PrivateChatActivity privateChatActivity = this.f25799OooO0Oo;
        privateChatActivity.OooOo().setFriendRemark(s);
        privateChatActivity.OooOo00(privateChatActivity.OooOo().getFriendRemark());
        privateChatActivity.OooOo().getGiftSendUser().getUserName().setValue(privateChatActivity.OooOo().getFriendRemark());
        return Unit.INSTANCE;
    }
}
