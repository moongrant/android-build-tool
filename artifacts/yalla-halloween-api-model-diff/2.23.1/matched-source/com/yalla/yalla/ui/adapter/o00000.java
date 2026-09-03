package com.yalla.yalla.ui.adapter;

import p646o0ooOOOO.q0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends q0 {
    @Override // p646o0ooOOOO.q0
    public final int OooO00o(int i) {
        if (i == PrivateChatAdapter.ViewType.ChatCommonViewType.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_text_common;
        }
        if (i == PrivateChatAdapter.ViewType.SendText.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_text_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveText.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_text_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendVoice.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_voice_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveVoice.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_voice_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendEmotion.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_emotion_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveEmotion.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_emotion_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendGif.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_gif_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveGif.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_gif_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendGift.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_gift_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveGift.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_gift_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareRoom.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_room_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareRoom.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_room_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareMoment.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_post_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareMoment.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_post_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareTopic.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_topic_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareTopic.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_topic_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareUser.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_user_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareUser.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_user_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareActivity.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_activity_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareActivity.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_activity_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendGiveRoomTheme.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_theme_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveGetRoomTheme.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_theme_receive;
        }
        if (i == PrivateChatAdapter.ViewType.UnknownMessage.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_text_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendEventRoom.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_event_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveEventRoom.getValue()) {
            return p565o0oOo000.o0OO00O.message_item_chat_private_share_event_receive;
        }
        return i == PrivateChatAdapter.ViewType.ToYallaChat4ChatMessage.getValue() ? p565o0oOo000.o0OO00O.message_item_chat_private_to_yalla_chat : p565o0oOo000.o0OO00O.message_item_chat_private_text_send;
    }
}
