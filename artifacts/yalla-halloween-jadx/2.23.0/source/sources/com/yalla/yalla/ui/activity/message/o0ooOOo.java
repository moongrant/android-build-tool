package com.yalla.yalla.ui.activity.message;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f25984OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0ooOOo(FriendRequestMessageActivity friendRequestMessageActivity) {
        super(0);
        this.f25984OooO0Oo = friendRequestMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = FriendRequestMessageActivity.f25650OooOo0o;
        this.f25984OooO0Oo.OooOoO().clearMessage();
        return Unit.INSTANCE;
    }
}
