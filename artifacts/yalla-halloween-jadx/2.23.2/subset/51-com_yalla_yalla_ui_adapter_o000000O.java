package com.yalla.yalla.ui.adapter;

import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends androidx.recyclerview.widget.Oooo000.OooO<ChatMessage> {
    @Override // androidx.recyclerview.widget.Oooo000.OooO
    public final boolean OooO00o(ChatMessage chatMessage, ChatMessage chatMessage2) {
        ChatMessage oldItem = chatMessage;
        ChatMessage newItem = chatMessage2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (oldItem.getSendState() == newItem.getSendState()) {
            ChatMessage.VoiceInfo voiceInfo = oldItem.getVoiceInfo();
            Boolean boolValueOf = voiceInfo != null ? Boolean.valueOf(voiceInfo.getIsVoiceRead()) : null;
            ChatMessage.VoiceInfo voiceInfo2 = newItem.getVoiceInfo();
            if (Intrinsics.areEqual(boolValueOf, voiceInfo2 != null ? Boolean.valueOf(voiceInfo2.getIsVoiceRead()) : null)) {
                ChatMessage.VoiceInfo voiceInfo3 = oldItem.getVoiceInfo();
                String filename = voiceInfo3 != null ? voiceInfo3.getFilename() : null;
                ChatMessage.VoiceInfo voiceInfo4 = newItem.getVoiceInfo();
                if (Intrinsics.areEqual(filename, voiceInfo4 != null ? voiceInfo4.getFilename() : null)) {
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo = oldItem.getGiveRoomThemeInfo();
                    Integer numValueOf = giveRoomThemeInfo != null ? Integer.valueOf(giveRoomThemeInfo.getThemeState()) : null;
                    ChatMessage.GiveRoomThemeInfo giveRoomThemeInfo2 = newItem.getGiveRoomThemeInfo();
                    if (Intrinsics.areEqual(numValueOf, giveRoomThemeInfo2 != null ? Integer.valueOf(giveRoomThemeInfo2.getThemeState()) : null)) {
                        ChatMessage.ShareEventRoomInfo shareEventRoomInfo = oldItem.getShareEventRoomInfo();
                        Boolean boolValueOf2 = shareEventRoomInfo != null ? Boolean.valueOf(shareEventRoomInfo.getIsDeleted()) : null;
                        ChatMessage.ShareEventRoomInfo shareEventRoomInfo2 = newItem.getShareEventRoomInfo();
                        if (Intrinsics.areEqual(boolValueOf2, shareEventRoomInfo2 != null ? Boolean.valueOf(shareEventRoomInfo2.getIsDeleted()) : null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.Oooo000.OooO
    public final boolean OooO0O0(ChatMessage chatMessage, ChatMessage chatMessage2) {
        ChatMessage oldItem = chatMessage;
        ChatMessage newItem = chatMessage2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.getMid(), newItem.getMid()) && oldItem.getUid() == newItem.getUid();
    }
}
