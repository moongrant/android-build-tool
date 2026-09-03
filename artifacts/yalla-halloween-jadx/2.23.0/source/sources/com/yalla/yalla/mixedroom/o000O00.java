package com.yalla.yalla.mixedroom;

import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomMessageReplyInfo;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00 extends Lambda implements Function2<RoomMessageReplyInfo, ChatModel, Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000O00 f23515OooO0Oo = new o000O00();

    public o000O00() {
        super(2);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0137  */
    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(RoomMessageReplyInfo roomMessageReplyInfo, ChatModel chatModel) {
        boolean zAreEqual;
        RoomMessageReplyInfo roomMessageReplyInfo2 = roomMessageReplyInfo;
        ChatModel chatModel2 = chatModel;
        boolean z = false;
        if ((chatModel2 != null ? chatModel2.getNewFrom() : null) != null && roomMessageReplyInfo2 != null && roomMessageReplyInfo2.getFrom() != null) {
            RoomUserInfoModel newFrom = chatModel2.getNewFrom();
            Intrinsics.checkNotNull(newFrom);
            long jLongValue = newFrom.getUserId().getValue().longValue();
            RoomMessageReplyInfo.User from = roomMessageReplyInfo2.getFrom();
            Intrinsics.checkNotNull(from);
            if (jLongValue == from.getUserId()) {
                int replyType = roomMessageReplyInfo2.getReplyType();
                if (replyType != 1) {
                    if (replyType != 2) {
                        if (replyType != 3) {
                            if (replyType == 5 && roomMessageReplyInfo2.getGifEmoticon() != null) {
                                RoomMessageReplyInfo.GifEmoticon gifEmoticon = roomMessageReplyInfo2.getGifEmoticon();
                                Intrinsics.checkNotNull(gifEmoticon);
                                if (!com.code.android.util.OooOo00.OooO00o(gifEmoticon.getUuid()) && !com.code.android.util.OooOo00.OooO00o(chatModel2.getUuid())) {
                                    RoomMessageReplyInfo.GifEmoticon gifEmoticon2 = roomMessageReplyInfo2.getGifEmoticon();
                                    Intrinsics.checkNotNull(gifEmoticon2);
                                    zAreEqual = Intrinsics.areEqual(gifEmoticon2.getUuid(), chatModel2.getUuid());
                                    z = zAreEqual;
                                } else if (chatModel2.getGif() != null) {
                                    RoomMessageReplyInfo.GifEmoticon gifEmoticon3 = roomMessageReplyInfo2.getGifEmoticon();
                                    Intrinsics.checkNotNull(gifEmoticon3);
                                    int iOooO0o = com.code.android.util.o0OoOo0.OooO0o(0, gifEmoticon3.getGifId());
                                    ChatMessageOld.Gif gif = chatModel2.getGif();
                                    Intrinsics.checkNotNull(gif);
                                    if (iOooO0o == gif.gifId) {
                                        z = true;
                                    }
                                }
                            }
                        } else if (roomMessageReplyInfo2.getGift() != null) {
                            RoomMessageReplyInfo.Gift gift = roomMessageReplyInfo2.getGift();
                            Intrinsics.checkNotNull(gift);
                            if (com.code.android.util.OooOo00.OooO00o(gift.getUuid()) || com.code.android.util.OooOo00.OooO00o(chatModel2.getUuid())) {
                                RoomMessageReplyInfo.Gift gift2 = roomMessageReplyInfo2.getGift();
                                Intrinsics.checkNotNull(gift2);
                                if (gift2.getTo() != null) {
                                    RoomMessageReplyInfo.Gift gift3 = roomMessageReplyInfo2.getGift();
                                    Intrinsics.checkNotNull(gift3);
                                    if (gift3.getGiftId() == chatModel2.getGiftid()) {
                                        RoomMessageReplyInfo.Gift gift4 = roomMessageReplyInfo2.getGift();
                                        Intrinsics.checkNotNull(gift4);
                                        if (gift4.getNumber() == chatModel2.getNumber()) {
                                            RoomMessageReplyInfo.Gift gift5 = roomMessageReplyInfo2.getGift();
                                            Intrinsics.checkNotNull(gift5);
                                            RoomMessageReplyInfo.User to = gift5.getTo();
                                            Intrinsics.checkNotNull(to);
                                            long userId = to.getUserId();
                                            RoomUserInfoModel newTo = chatModel2.getNewTo();
                                            Intrinsics.checkNotNull(newTo);
                                            if (userId == newTo.getUserId().getValue().longValue()) {
                                                z = true;
                                            }
                                        }
                                    }
                                }
                            } else {
                                RoomMessageReplyInfo.Gift gift6 = roomMessageReplyInfo2.getGift();
                                Intrinsics.checkNotNull(gift6);
                                zAreEqual = Intrinsics.areEqual(gift6.getUuid(), chatModel2.getUuid());
                                z = zAreEqual;
                            }
                        }
                    } else if (roomMessageReplyInfo2.getPic() != null) {
                        RoomMessageReplyInfo.Pic pic = roomMessageReplyInfo2.getPic();
                        Intrinsics.checkNotNull(pic);
                        if (com.code.android.util.OooOo00.OooO00o(pic.getUuid()) || com.code.android.util.OooOo00.OooO00o(chatModel2.getUuid())) {
                            RoomMessageReplyInfo.Pic pic2 = roomMessageReplyInfo2.getPic();
                            Intrinsics.checkNotNull(pic2);
                            zAreEqual = Intrinsics.areEqual(pic2.getMessage(), chatModel2.getMessage());
                        } else {
                            RoomMessageReplyInfo.Pic pic3 = roomMessageReplyInfo2.getPic();
                            Intrinsics.checkNotNull(pic3);
                            zAreEqual = Intrinsics.areEqual(pic3.getUuid(), chatModel2.getUuid());
                        }
                        z = zAreEqual;
                    }
                } else if (roomMessageReplyInfo2.getText() != null) {
                    RoomMessageReplyInfo.Text text = roomMessageReplyInfo2.getText();
                    Intrinsics.checkNotNull(text);
                    if (com.code.android.util.OooOo00.OooO00o(text.getUuid()) || com.code.android.util.OooOo00.OooO00o(chatModel2.getUuid())) {
                        RoomMessageReplyInfo.Text text2 = roomMessageReplyInfo2.getText();
                        Intrinsics.checkNotNull(text2);
                        zAreEqual = Intrinsics.areEqual(text2.getMessage(), chatModel2.getMessage());
                    } else {
                        RoomMessageReplyInfo.Text text3 = roomMessageReplyInfo2.getText();
                        Intrinsics.checkNotNull(text3);
                        zAreEqual = Intrinsics.areEqual(text3.getUuid(), chatModel2.getUuid());
                    }
                    z = zAreEqual;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
