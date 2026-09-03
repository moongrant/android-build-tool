package com.yalla.yalla.ui.adapter;

import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends p400o0Oo0OO.OooOOO {
    @Override // p400o0Oo0OO.OooOOO
    public final int OooO00o(int i) {
        if (i == PrivateChatAdapter.ViewType.ChatCommonViewType.getValue()) {
            return oO00OO0O.message_item_chat_private_text_common;
        }
        if (i == PrivateChatAdapter.ViewType.SendText.getValue()) {
            return oO00OO0O.message_item_chat_private_text_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveText.getValue()) {
            return oO00OO0O.message_item_chat_private_text_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendVoice.getValue()) {
            return oO00OO0O.message_item_chat_private_voice_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveVoice.getValue()) {
            return oO00OO0O.message_item_chat_private_voice_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendEmotion.getValue()) {
            return oO00OO0O.message_item_chat_private_emotion_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveEmotion.getValue()) {
            return oO00OO0O.message_item_chat_private_emotion_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendGif.getValue()) {
            return oO00OO0O.message_item_chat_private_gif_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveGif.getValue()) {
            return oO00OO0O.message_item_chat_private_gif_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendGift.getValue()) {
            return oO00OO0O.message_item_chat_private_gift_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveGift.getValue()) {
            return oO00OO0O.message_item_chat_private_gift_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareRoom.getValue()) {
            return oO00OO0O.message_item_chat_private_share_room_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareRoom.getValue()) {
            return oO00OO0O.message_item_chat_private_share_room_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareMoment.getValue()) {
            return oO00OO0O.message_item_chat_private_share_post_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareMoment.getValue()) {
            return oO00OO0O.message_item_chat_private_share_post_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareTopic.getValue()) {
            return oO00OO0O.message_item_chat_private_share_topic_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareTopic.getValue()) {
            return oO00OO0O.message_item_chat_private_share_topic_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareUser.getValue()) {
            return oO00OO0O.message_item_chat_private_share_user_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareUser.getValue()) {
            return oO00OO0O.message_item_chat_private_share_user_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendShareActivity.getValue()) {
            return oO00OO0O.message_item_chat_private_share_activity_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveShareActivity.getValue()) {
            return oO00OO0O.message_item_chat_private_share_activity_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendGiveRoomTheme.getValue()) {
            return oO00OO0O.message_item_chat_private_theme_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveGetRoomTheme.getValue()) {
            return oO00OO0O.message_item_chat_private_theme_receive;
        }
        if (i == PrivateChatAdapter.ViewType.UnknownMessage.getValue()) {
            return oO00OO0O.message_item_chat_private_text_receive;
        }
        if (i == PrivateChatAdapter.ViewType.SendEventRoom.getValue()) {
            return oO00OO0O.message_item_chat_private_share_event_send;
        }
        if (i == PrivateChatAdapter.ViewType.ReceiveEventRoom.getValue()) {
            return oO00OO0O.message_item_chat_private_share_event_receive;
        }
        return i == PrivateChatAdapter.ViewType.ToYallaChat4ChatMessage.getValue() ? oO00OO0O.message_item_chat_private_to_yalla_chat : oO00OO0O.message_item_chat_private_text_send;
    }
}
