package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O extends Lambda implements Function1<ChatMessage, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25363OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00O(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f25363OooO0Oo = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ChatMessage chatMessage) {
        ChatMessage chatMessage2 = chatMessage;
        Intrinsics.checkNotNullParameter(chatMessage2, "chatMessage");
        int i = PrivateChatActivity.f25239Oooo000;
        this.f25363OooO0Oo.OooOo().updateEmotionMessage(chatMessage2.getTargetId());
        return Unit.INSTANCE;
    }
}
