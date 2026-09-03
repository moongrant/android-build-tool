package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25369OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(PrivateChatActivity privateChatActivity) {
        super(0);
        this.f25369OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PrivateChatActivity privateChatActivity = this.f25369OooO0Oo;
        if (privateChatActivity.f25242OooOOoo) {
            privateChatActivity.OooOo0().f44878OooO.scrollToPosition(0);
        }
        return Unit.INSTANCE;
    }
}
