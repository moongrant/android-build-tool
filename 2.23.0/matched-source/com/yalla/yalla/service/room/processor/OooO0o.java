package com.yalla.yalla.service.room.processor;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import p385o0OOooOO.oOO00O;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

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
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
            oOO00O.OooO0o((int) backPackGiftReply.getGiftId(), backPackGiftReply.getRemainingNum(), backPackGiftReply.getMinExpirationTime());
            return;
        }
        boolean z = true;
        if (code != 1 && code != 4153) {
            z = false;
        }
        if (z) {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oOO00O.f44351OooO00o;
            oOO00O.OooO0o((int) backPackGiftReply.getGiftId(), backPackGiftReply.getRemainingNum(), backPackGiftReply.getMinExpirationTime());
            o000O00O.OooO0O0(o0000.OooO0OO(backPackGiftReply.getRemainingNum() > 0 ? oO00OOo0.Some_gifts_have_expired : oO00OOo0.The_gift_has_expired));
        } else if (code == 4154) {
            LiveEventBus.get("GiftBackpackFrozen").post(Boolean.TRUE);
        } else if (code == 4155) {
            o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.gift_sold_out));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0Oo(RoomGiftModel roomGiftModel, int i, int i2) {
        MutableStateFlow<Long> userId;
        p592o0oo00O.OooOOO0.OooO0O0("parseGiftMessage type: " + roomGiftModel.getType() + ", model = " + p140o00OOooo.OooOO0.OooO00o(roomGiftModel));
        RoomUserInfoModel newFrom = roomGiftModel.getNewFrom();
        Long value = (newFrom == null || (userId = newFrom.getUserId()) == null) ? null : userId.getValue();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(value, o000000O.OooOOo0().getValue())) {
            o0OO000.OooO0O0("202004", p188o00o0O.OooOO0O.OooO00o(new Pair("Giftid", Integer.valueOf(roomGiftModel.getGiftid()))));
        }
        if (i == GiftPropTypePay.Coin.getValue()) {
            long morajuid = roomGiftModel.getMorajuid();
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && morajuid == l.longValue()) {
                MixedRoomDataSource.OooO0o0().f23472OooOOo0 = roomGiftModel;
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
        p592o0oo00O.OooOOO0.OooO0O0("NormalGiftRunWay, messageType:" + i2 + "  isAddGiftRunway:" + roomGiftModel.isAddGiftRunway() + "  " + p140o00OOooo.OooOO0.OooO00o(roomGiftModel));
        LiveEventBus.get("NormalGiftRunWay").post(roomGiftModel);
    }

    public static void OooO0o(RoomGiftModel roomGiftModel, int i) {
        MutableStateFlow<Long> userId;
        MutableStateFlow<Long> userId2;
        Long value = null;
        if (roomGiftModel.getNewFrom() != null) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            T value2 = o000000O.OooOOo0().getValue();
            RoomUserInfoModel newFrom = roomGiftModel.getNewFrom();
            if (Intrinsics.areEqual(value2, (newFrom == null || (userId2 = newFrom.getUserId()) == null) ? null : userId2.getValue())) {
                if (i == GiftPropTypePay.Coin.getValue()) {
                    o000000O.OooO0O0().postValue(Long.valueOf(roomGiftModel.getCoin()));
                    return;
                } else {
                    o000000O.OooO0Oo().postValue(Long.valueOf(roomGiftModel.getCrystal()));
                    return;
                }
            }
        }
        if (roomGiftModel.getNewTo() != null) {
            o000000O o000000o3 = o000000O.f46674OooO00o;
            T value3 = o000000O.OooOOo0().getValue();
            RoomUserInfoModel newTo = roomGiftModel.getNewTo();
            if (newTo != null && (userId = newTo.getUserId()) != null) {
                value = userId.getValue();
            }
            if (Intrinsics.areEqual(value3, value) && i == GiftPropTypePay.Coin.getValue()) {
                o000000O.OooO0O0().postValue(Long.valueOf(roomGiftModel.getCoin()));
            }
        }
    }

    @Override // com.yalla.yalla.service.room.processor.OooO00o
    @NotNull
    public final String OooO00o() {
        return OooO00o.C0319OooO00o.OooO00o(this);
    }

    public final void OooO0o0(int i, @Nullable Object obj) {
        OooO00o.C0319OooO00o.OooO0O0(this, i, obj);
        String str = new String((byte[]) obj, Charsets.UTF_8);
        try {
            switch (i) {
                case 10009:
                    p592o0oo00O.OooOOO0.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 接收到送金币礼物");
                    RoomGiftModel roomGiftModel = (RoomGiftModel) oOo00OO0.OooO00o(str, RoomGiftModel.class);
                    if (roomGiftModel != null) {
                        OooO0Oo(roomGiftModel, GiftPropTypePay.Coin.getValue(), i);
                    }
                    break;
                case 10048:
                    p592o0oo00O.OooOOO0.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 接收到送房间所有人金币礼物");
                    GiftRoomAllResultModel giftRoomAllResultModel = (GiftRoomAllResultModel) oOo00OO0.OooO00o(str, GiftRoomAllResultModel.class);
                    if (giftRoomAllResultModel != null) {
                        OooO0O0(giftRoomAllResultModel, GiftPropTypePay.Coin.getValue(), true);
                    }
                    break;
                case 10056:
                    RoomGiftModel roomGiftModel2 = (RoomGiftModel) oOo00OO0.OooO00o(str, RoomGiftModel.class);
                    if (roomGiftModel2 != null) {
                        OooO0Oo(roomGiftModel2, GiftPropTypePay.Crystal.getValue(), i);
                    }
                    break;
                case 10057:
                    p592o0oo00O.OooOOO0.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 接收到送房间所有人水晶礼物");
                    GiftRoomAllResultModel giftRoomAllResultModel2 = (GiftRoomAllResultModel) oOo00OO0.OooO00o(str, GiftRoomAllResultModel.class);
                    if (giftRoomAllResultModel2 != null) {
                        OooO0O0(giftRoomAllResultModel2, GiftPropTypePay.Crystal.getValue(), true);
                    }
                    break;
                case 1000100:
                    p592o0oo00O.OooOOO0.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 一键送麦上礼物");
                    GiftRoomAllResultModel giftRoomAllResultModel3 = (GiftRoomAllResultModel) oOo00OO0.OooO00o(str, GiftRoomAllResultModel.class);
                    if (giftRoomAllResultModel3 != null) {
                        OooO0O0(giftRoomAllResultModel3, giftRoomAllResultModel3.getCoin() > 0 ? GiftPropTypePay.Coin.getValue() : GiftPropTypePay.Crystal.getValue(), false);
                    }
                    break;
                case 1000600:
                    p592o0oo00O.OooOOO0.OooO0O0("RoomGiftMsgProcessor parseMessage type = " + i + ", 活动特效");
                    RoomActivityEffectAnimModel roomActivityEffectAnimModel = (RoomActivityEffectAnimModel) oOo00OO0.OooO00o(str, RoomActivityEffectAnimModel.class);
                    if (roomActivityEffectAnimModel != null) {
                        MixedRoomDataSource.OooO0o0().OooOOOO(1000600, roomActivityEffectAnimModel);
                    }
                    break;
                case 1001001:
                    RoomGiftModel roomGiftModel3 = (RoomGiftModel) oOo00OO0.OooO00o(str, RoomGiftModel.class);
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
