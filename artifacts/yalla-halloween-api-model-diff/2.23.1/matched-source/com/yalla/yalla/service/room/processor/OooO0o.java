package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.RoomActivityEffectAnimModel;
import com.yalla.yalla.model.RoomGiftModel;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypePay;
import com.yalla.yalla.model.gift.GiftPropTypeTag;
import com.yalla.yalla.model.gift.GiftRoomAllResultModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p393o0OOooo0.o0OO00O;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;
import p587o0oOooO.oO00Oo0;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0o implements OooO00o {
    public static void OooO0O0(GiftRoomAllResultModel giftRoomAllResultModel, int i, boolean z) {
        if (giftRoomAllResultModel.getType() != 81) {
            String effectUrl = giftRoomAllResultModel.getEffectUrl();
            if (!(effectUrl == null || StringsKt.isBlank(effectUrl))) {
                return;
            }
        }
        RoomGiftModel allGiftMessage = RoomGiftModel.INSTANCE.parseAllGiftMessage(giftRoomAllResultModel, z);
        OooO0o(allGiftMessage, i);
        LiveEventBus.get("NormalGiftRunWay").post(allGiftMessage);
    }

    public static void OooO0OO(Room.BackPackGiftReply backPackGiftReply) {
        int code = backPackGiftReply.getCode();
        if (code == 0) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = o0OO00O.f43560OooO00o;
            o0OO00O.OooO0o((int) backPackGiftReply.getGiftId(), backPackGiftReply.getRemainingNum(), backPackGiftReply.getMinExpirationTime());
            return;
        }
        boolean z = true;
        if (code != 1 && code != 4153) {
            z = false;
        }
        if (z) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = o0OO00O.f43560OooO00o;
            o0OO00O.OooO0o((int) backPackGiftReply.getGiftId(), backPackGiftReply.getRemainingNum(), backPackGiftReply.getMinExpirationTime());
            o000O00.OooO0O0(o0000.OooO0OO(backPackGiftReply.getRemainingNum() > 0 ? o000OOo.Some_gifts_have_expired : o000OOo.The_gift_has_expired));
        } else if (code == 4154) {
            LiveEventBus.get("GiftBackpackFrozen").post(Boolean.TRUE);
        } else if (code == 4155) {
            o000O00.OooO0O0(o0000.OooO0OO(o000OOo.gift_sold_out));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0Oo(RoomGiftModel roomGiftModel, int i, int i2) {
        MutableStateFlow<Long> userId;
        p597o0oo00O.OooOOOO.OooO0O0("parseGiftMessage type: " + roomGiftModel.getType() + ", model = " + p187o00o00o0.OooO.OooO00o(roomGiftModel));
        RoomUserInfoModel newFrom = roomGiftModel.getNewFrom();
        Long value = (newFrom == null || (userId = newFrom.getUserId()) == null) ? null : userId.getValue();
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (Intrinsics.areEqual(value, oo0oO0.OooOOo0().getValue())) {
            h0.OooO0OO("202004", p190o00o0O.OooOO0.OooO00o(new Pair("Giftid", Integer.valueOf(roomGiftModel.getGiftid()))));
        }
        if (i == GiftPropTypePay.Coin.getValue()) {
            long morajuid = roomGiftModel.getMorajuid();
            Long l = (Long) oo0oO0.OooOOo0().getValue();
            if (l != null && morajuid == l.longValue()) {
                MixedRoomDataSource.OooO0o0().f23008OooOOo0 = roomGiftModel;
                return;
            } else if (roomGiftModel.getEnvelopflag() == 0 && roomGiftModel.getMorajuid() <= 0 && roomGiftModel.getGiftType() != GiftPropTypeTag.Blind.getValue()) {
                OooO0O0.OooO0OO(roomGiftModel);
            }
        } else {
            OooO0O0.OooO0OO(roomGiftModel);
        }
        OooO0o(roomGiftModel, i);
        String effectUrl = roomGiftModel.getEffectUrl();
        if (!(effectUrl == null || StringsKt.isBlank(effectUrl)) || roomGiftModel.getType() == 92) {
            LiveEventBus.get("PlayEffectVideoGift").post(roomGiftModel);
            return;
        }
        if (roomGiftModel.getType() == 7 || roomGiftModel.getType() == 71 || roomGiftModel.getType() == 72 || roomGiftModel.getType() == 8) {
            return;
        }
        p597o0oo00O.OooOOOO.OooO0O0("NormalGiftRunWay, messageType:" + i2 + "  isAddGiftRunway:" + roomGiftModel.isAddGiftRunway() + "  " + p187o00o00o0.OooO.OooO00o(roomGiftModel));
        LiveEventBus.get("NormalGiftRunWay").post(roomGiftModel);
    }

    public static void OooO0o(RoomGiftModel roomGiftModel, int i) {
        MutableStateFlow<Long> userId;
        MutableStateFlow<Long> userId2;
        Long value = null;
        if (roomGiftModel.getNewFrom() != null) {
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            T value2 = oo0oO0.OooOOo0().getValue();
            RoomUserInfoModel newFrom = roomGiftModel.getNewFrom();
            if (Intrinsics.areEqual(value2, (newFrom == null || (userId2 = newFrom.getUserId()) == null) ? null : userId2.getValue())) {
                if (i == GiftPropTypePay.Coin.getValue()) {
                    oo0oO0.OooO0O0().postValue(Long.valueOf(roomGiftModel.getCoin()));
                    return;
                } else {
                    oo0oO0.OooO0Oo().postValue(Long.valueOf(roomGiftModel.getCrystal()));
                    return;
                }
            }
        }
        if (roomGiftModel.getNewTo() != null) {
            oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
            T value3 = oo0oO0.OooOOo0().getValue();
            RoomUserInfoModel newTo = roomGiftModel.getNewTo();
            if (newTo != null && (userId = newTo.getUserId()) != null) {
                value = userId.getValue();
            }
            if (Intrinsics.areEqual(value3, value) && i == GiftPropTypePay.Coin.getValue()) {
                oo0oO0.OooO0O0().postValue(Long.valueOf(roomGiftModel.getCoin()));
            }
        }
    }

    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return OooO00o.C0318OooO00o.OooO00o(this);
    }

    public final void OooO0o0(int i, @Nullable Object obj) {
        OooO00o.C0318OooO00o.OooO0O0(this, i, obj);
        String str = new String((byte[]) obj, Charsets.UTF_8);
        try {
            switch (i) {
                case 10009:
                    p597o0oo00O.OooOOOO.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 接收到送金币礼物");
                    RoomGiftModel roomGiftModel = (RoomGiftModel) oO00Oo0.OooO00o(str, RoomGiftModel.class);
                    if (roomGiftModel != null) {
                        OooO0Oo(roomGiftModel, GiftPropTypePay.Coin.getValue(), i);
                    }
                    break;
                case 10048:
                    p597o0oo00O.OooOOOO.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 接收到送房间所有人金币礼物");
                    GiftRoomAllResultModel giftRoomAllResultModel = (GiftRoomAllResultModel) oO00Oo0.OooO00o(str, GiftRoomAllResultModel.class);
                    if (giftRoomAllResultModel != null) {
                        OooO0O0(giftRoomAllResultModel, GiftPropTypePay.Coin.getValue(), true);
                    }
                    break;
                case 10056:
                    RoomGiftModel roomGiftModel2 = (RoomGiftModel) oO00Oo0.OooO00o(str, RoomGiftModel.class);
                    if (roomGiftModel2 != null) {
                        OooO0Oo(roomGiftModel2, GiftPropTypePay.Crystal.getValue(), i);
                    }
                    break;
                case 10057:
                    p597o0oo00O.OooOOOO.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 接收到送房间所有人水晶礼物");
                    GiftRoomAllResultModel giftRoomAllResultModel2 = (GiftRoomAllResultModel) oO00Oo0.OooO00o(str, GiftRoomAllResultModel.class);
                    if (giftRoomAllResultModel2 != null) {
                        OooO0O0(giftRoomAllResultModel2, GiftPropTypePay.Crystal.getValue(), true);
                    }
                    break;
                case 1000100:
                    p597o0oo00O.OooOOOO.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 一键送麦上礼物");
                    GiftRoomAllResultModel giftRoomAllResultModel3 = (GiftRoomAllResultModel) oO00Oo0.OooO00o(str, GiftRoomAllResultModel.class);
                    if (giftRoomAllResultModel3 != null) {
                        OooO0O0(giftRoomAllResultModel3, giftRoomAllResultModel3.getCoin() > 0 ? GiftPropTypePay.Coin.getValue() : GiftPropTypePay.Crystal.getValue(), false);
                    }
                    break;
                case 1000600:
                    p597o0oo00O.OooOOOO.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 活动特效");
                    RoomActivityEffectAnimModel roomActivityEffectAnimModel = (RoomActivityEffectAnimModel) oO00Oo0.OooO00o(str, RoomActivityEffectAnimModel.class);
                    if (roomActivityEffectAnimModel != null) {
                        MixedRoomDataSource.OooO0o0().OooOOOO(1000600, roomActivityEffectAnimModel);
                    }
                    break;
                case 1001001:
                    RoomGiftModel roomGiftModel3 = (RoomGiftModel) oO00Oo0.OooO00o(str, RoomGiftModel.class);
                    if (roomGiftModel3 != null) {
                        OooO0Oo(roomGiftModel3, GiftPropTypePay.Coin.getValue(), i);
                    }
                    break;
                case 1001003:
                    Room.BackPackGiftReply from = Room.BackPackGiftReply.parseFrom((byte[]) obj);
                    if (from != null) {
                        OooO0OO(from);
                    }
                    break;
                case 1001050:
                    Room.MessageBlindBoxNotify gift = Room.MessageBlindBoxNotify.parseFrom((byte[]) obj);
                    if (gift != null) {
                        Intrinsics.checkNotNullParameter(gift, "gift");
                        ChatModel chatModel = new ChatModel();
                        chatModel.setType(37);
                        chatModel.setGiftBlindBoxNotify(gift);
                        MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
