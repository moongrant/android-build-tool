package p159o00OoOO;

import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.model.ChatModel;
import com.app.base.model.RoomMessageReplyInfo;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooO0OO;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000000 implements Function2 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final /* synthetic */ o000000 f32403Oooo0o = new o000000();

    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RoomMessageReplyInfo roomMessageReplyInfo = (RoomMessageReplyInfo) obj;
        ChatModel chatModel = (ChatModel) obj2;
        int i = MixedRoomActivity.f11764o00000oO;
        boolean zAreEqual = false;
        if (chatModel != null && chatModel.from != null && roomMessageReplyInfo != null && roomMessageReplyInfo.getFrom() != null && chatModel.from.getUserId() == roomMessageReplyInfo.getFrom().getUserId()) {
            int replyType = roomMessageReplyInfo.getReplyType();
            if (replyType != 1) {
                if (replyType != 2) {
                    if (replyType != 3) {
                        if (replyType == 5 && roomMessageReplyInfo.getGifEmoticon() != null) {
                            if (!OooO0OO.OooO00o(roomMessageReplyInfo.getGifEmoticon().getUuid()) && !OooO0OO.OooO00o(chatModel.uuid)) {
                                zAreEqual = Intrinsics.areEqual(roomMessageReplyInfo.getGifEmoticon().getUuid(), chatModel.uuid);
                            } else if (chatModel.gif != null && OooO.OooO0Oo(roomMessageReplyInfo.getGifEmoticon().getGifId(), 0) == chatModel.gif.gifId) {
                                zAreEqual = true;
                            }
                        }
                    } else if (roomMessageReplyInfo.getGift() != null) {
                        if (!OooO0OO.OooO00o(roomMessageReplyInfo.getGift().getUuid()) && !OooO0OO.OooO00o(chatModel.uuid)) {
                            zAreEqual = Intrinsics.areEqual(roomMessageReplyInfo.getGift().getUuid(), chatModel.uuid);
                        } else if (roomMessageReplyInfo.getGift().getTo() != null && roomMessageReplyInfo.getGift().getGiftId() == chatModel.giftid && roomMessageReplyInfo.getGift().getNumber() == chatModel.number && roomMessageReplyInfo.getGift().getTo().getUserId() == chatModel.to.getUserId()) {
                            zAreEqual = true;
                        }
                    }
                } else if (roomMessageReplyInfo.getPic() != null) {
                    zAreEqual = (OooO0OO.OooO00o(roomMessageReplyInfo.getPic().getUuid()) || OooO0OO.OooO00o(chatModel.uuid)) ? Intrinsics.areEqual(roomMessageReplyInfo.getPic().getMessage(), chatModel.message) : Intrinsics.areEqual(roomMessageReplyInfo.getPic().getUuid(), chatModel.uuid);
                }
            } else if (roomMessageReplyInfo.getText() != null) {
                zAreEqual = (OooO0OO.OooO00o(roomMessageReplyInfo.getText().getUuid()) || OooO0OO.OooO00o(chatModel.uuid)) ? Intrinsics.areEqual(roomMessageReplyInfo.getText().getMessage(), chatModel.message) : Intrinsics.areEqual(roomMessageReplyInfo.getText().getUuid(), chatModel.uuid);
            }
        }
        return Boolean.valueOf(zAreEqual);
    }
}
