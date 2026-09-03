package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25810OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f25811OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(PrivateChatActivity privateChatActivity, ChatMessage chatMessage) {
        super(0);
        this.f25810OooO0Oo = privateChatActivity;
        this.f25811OooO0o0 = chatMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PrivateChatActivity privateChatActivity = this.f25810OooO0Oo;
        privateChatActivity.f25705OooOoOO = true;
        privateChatActivity.OooOo().getRoomThemeAccept(this.f25811OooO0o0);
        return Unit.INSTANCE;
    }
}
