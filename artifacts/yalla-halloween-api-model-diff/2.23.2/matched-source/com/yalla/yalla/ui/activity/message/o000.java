package com.yalla.yalla.ui.activity.message;

import com.yalla.yalla.data.constant.StatusEnum$MsgSendStatus;
import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o000 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f25338OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f25339OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(PrivateChatActivity privateChatActivity, ChatMessage chatMessage) {
        super(0);
        this.f25338OooO0Oo = privateChatActivity;
        this.f25339OooO0o0 = chatMessage;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        int i = PrivateChatActivity.f25239Oooo000;
        PrivateChatActivity privateChatActivity = this.f25338OooO0Oo;
        privateChatActivity.getClass();
        ChatMessage chatMessage = this.f25339OooO0o0;
        if (chatMessage.getSendState() == StatusEnum$MsgSendStatus.SUCCESS.OooO00o()) {
            return null;
        }
        switch (chatMessage.getContentType()) {
            case 1:
                privateChatActivity.OooOo().reSendTextMessage(chatMessage);
                break;
            case 2:
                privateChatActivity.OooOo().reSendVoiceMessage(chatMessage);
                break;
            case 4:
                privateChatActivity.OooOo().reSendGifMessage(chatMessage);
                break;
            case 5:
                privateChatActivity.OooOo().reSendGiftMessage(chatMessage);
                break;
            case 6:
                privateChatActivity.OooOo().reSendShareRoomMsg(chatMessage);
                break;
            case 7:
                privateChatActivity.OooOo().reSendShareMomentMsg(chatMessage);
                break;
            case 8:
                privateChatActivity.OooOo().reSendShareTopicMsg(chatMessage);
                break;
            case 9:
                privateChatActivity.OooOo().reSendShareUserMsg(chatMessage);
                break;
            case 10:
                privateChatActivity.OooOo().reSendShareActivityMsg(chatMessage);
                break;
        }
        return null;
    }
}
