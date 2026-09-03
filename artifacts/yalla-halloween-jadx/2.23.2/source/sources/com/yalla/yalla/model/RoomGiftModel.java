package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.gift.GiftRoomAllResultModel;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00O0.OooO0OO;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 w2\u00020\u0001:\u0001wB\u0005¢\u0006\u0002\u0010\u0002J\f\u0010q\u001a\b\u0012\u0004\u0012\u00020K0JJ\u0006\u0010r\u001a\u00020sJ\u0006\u0010t\u001a\u000201J\u0006\u0010E\u001a\u000201J\u0006\u0010u\u001a\u000201J\u0006\u0010v\u001a\u000201R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR \u0010!\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u00020\u00048\u0002X\u0083D¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u0002018\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR \u00109\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010$\"\u0004\b;\u0010&R\u001e\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u000e\u0010E\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\u0016\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010L\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010\u000eR\u001a\u0010O\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\f\"\u0004\bQ\u0010\u000eR\u001a\u0010R\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\f\"\u0004\bT\u0010\u000eR\u001a\u0010U\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\f\"\u0004\bW\u0010\u000eR\u001e\u0010X\u001a\u0004\u0018\u00010Y8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001e\u0010^\u001a\u0004\u0018\u00010Y8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R\u001a\u0010a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0006\"\u0004\bc\u0010\bR\u001c\u0010d\u001a\u0004\u0018\u00010eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0010\u0010j\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010k\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010\u0006\"\u0004\bm\u0010\bR\u001a\u0010n\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010$\"\u0004\bp\u0010&¨\u0006x"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftModel;", "", "()V", "blindBoxLevel", "", "getBlindBoxLevel", "()I", "setBlindBoxLevel", "(I)V", "coin", "", "getCoin", "()J", "setCoin", "(J)V", "combineGiftInfo", "Lcom/yalla/yalla/model/RoomGiftCombineGiftInfo;", "getCombineGiftInfo", "()Lcom/yalla/yalla/model/RoomGiftCombineGiftInfo;", "setCombineGiftInfo", "(Lcom/yalla/yalla/model/RoomGiftCombineGiftInfo;)V", "crystal", "getCrystal", "setCrystal", "customGiftInfo", "Lcom/yalla/yalla/model/RoomGiftCustomModel;", "getCustomGiftInfo", "()Lcom/yalla/yalla/model/RoomGiftCustomModel;", "setCustomGiftInfo", "(Lcom/yalla/yalla/model/RoomGiftCustomModel;)V", "effectFrameType", "getEffectFrameType", "setEffectFrameType", "effectUrl", "", "getEffectUrl", "()Ljava/lang/String;", "setEffectUrl", "(Ljava/lang/String;)V", "envelopflag", "getEnvelopflag", "setEnvelopflag", "from", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "frombackpack", "fromboxid", "getFromboxid", "setFromboxid", "giftIsAudio", "", "getGiftIsAudio", "()Z", "setGiftIsAudio", "(Z)V", "giftType", "getGiftType", "setGiftType", "giftUrl", "getGiftUrl", "setGiftUrl", "giftUserType", "getGiftUserType", "setGiftUserType", "giftid", "getGiftid", "setGiftid", "giftsubtype", "getGiftsubtype", "setGiftsubtype", "hasFirstLuckyLevel", "luckyflag", "getLuckyflag", "setLuckyflag", "luckyinstances", "", "Lcom/yalla/yalla/model/LuckyInstancesModel;", "luckymoney", "getLuckymoney", "setLuckymoney", "luckymultiple", "getLuckymultiple", "setLuckymultiple", "luckynum", "getLuckynum", "setLuckynum", "morajuid", "getMorajuid", "setMorajuid", "newFrom", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "getNewFrom", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "setNewFrom", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;)V", "newTo", "getNewTo", "setNewTo", "number", "getNumber", "setNumber", "roominfo", "Lcom/yalla/yalla/model/BarInfoModel$RoomInfoOld;", "getRoominfo", "()Lcom/yalla/yalla/model/BarInfoModel$RoomInfoOld;", "setRoominfo", "(Lcom/yalla/yalla/model/BarInfoModel$RoomInfoOld;)V", "to", "type", "getType", "setType", "uuid", "getUuid", "setUuid", "getLuckyInstances", "getRoomChatModel", "Lcom/yalla/yalla/model/chat/ChatModel;", "giftFromBackpack", "isAddGiftRunway", "isLuckyflag", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoomGiftModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftModel.kt\ncom/yalla/yalla/model/RoomGiftModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n1855#2,2:415\n*S KotlinDebug\n*F\n+ 1 RoomGiftModel.kt\ncom/yalla/yalla/model/RoomGiftModel\n*L\n222#1:415,2\n*E\n"})
public final class RoomGiftModel {

    @SerializedName("blindboxlevel")
    private int blindBoxLevel;
    private long coin;

    @SerializedName("combineGiftInfo")
    @Nullable
    private RoomGiftCombineGiftInfo combineGiftInfo;
    private long crystal;

    @SerializedName("customGiftInfo")
    @Nullable
    private RoomGiftCustomModel customGiftInfo;

    @SerializedName("effectFrameType")
    private int effectFrameType;

    @SerializedName("effectUrl")
    @Nullable
    private String effectUrl;
    private int envelopflag;

    @Nullable
    private RoomUserInfoDTO from;

    @SerializedName("frombackpack")
    private final int frombackpack;

    @SerializedName("fromboxid")
    private int fromboxid;

    @SerializedName(alternate = {"giftisaudio"}, value = "giftsaudio")
    private boolean giftIsAudio;

    @SerializedName("gifttype")
    private int giftType;

    @SerializedName("gifturl")
    @Nullable
    private String giftUrl;

    @SerializedName("giftusertype")
    private int giftUserType;
    private int giftid;
    private int giftsubtype;
    private boolean hasFirstLuckyLevel;
    private long luckyflag;

    @Nullable
    private List<LuckyInstancesModel> luckyinstances;
    private long luckymoney;
    private long luckymultiple;
    private long luckynum;
    private long morajuid;

    @Nullable
    private transient RoomUserInfoModel newFrom;

    @Nullable
    private transient RoomUserInfoModel newTo;
    private int number;

    @Nullable
    private BarInfoModel.RoomInfoOld roominfo;

    @Nullable
    private RoomUserInfoDTO to;
    private int type;

    @NotNull
    private String uuid = "";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/model/RoomGiftModel$Companion;", "", "()V", "parseAllGiftMessage", "Lcom/yalla/yalla/model/RoomGiftModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/model/gift/GiftRoomAllResultModel;", "isSendGiftAllInRoom", "", "receiveSendAllGIft", "data", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ RoomGiftModel parseAllGiftMessage$default(Companion companion, GiftRoomAllResultModel giftRoomAllResultModel, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            return companion.parseAllGiftMessage(giftRoomAllResultModel, z);
        }

        @NotNull
        public final RoomGiftModel parseAllGiftMessage(@Nullable GiftRoomAllResultModel model, boolean isSendGiftAllInRoom) {
            RoomGiftModel roomGiftModel = new RoomGiftModel();
            if (model != null) {
                roomGiftModel.setType(isSendGiftAllInRoom ? 7 : 8);
                roomGiftModel.setNewFrom(model.getNewFrom());
                roomGiftModel.setGiftid(model.getGiftid());
                roomGiftModel.setGiftUrl(OooO0OO.OooO0Oo(model.getGiftUrl()));
                roomGiftModel.setEffectUrl(OooO0OO.OooO0Oo(model.getEffectUrl()));
                roomGiftModel.setEffectFrameType(model.getEffectFrameType());
                roomGiftModel.setGiftIsAudio(model.getGiftIsAudio());
                roomGiftModel.setGiftUserType(model.getGiftUserType());
                roomGiftModel.setNumber(model.getSuccessnum());
                RoomUserInfoDTO roomUserInfoDTO = new RoomUserInfoDTO();
                roomUserInfoDTO.setUserName(isSendGiftAllInRoom ? o0000.OooO0OO(o000000.everyone) : o0000.OooO0OO(o000000.room_dialog_send_gift_all_in_mic));
                roomGiftModel.to = roomUserInfoDTO;
                roomGiftModel.setCoin(model.getCoin());
                roomGiftModel.setCrystal(model.getCrystal());
                roomGiftModel.setLuckyflag(model.getLuckyflag());
                roomGiftModel.setLuckymoney(model.getLuckymoney());
                roomGiftModel.setLuckynum(model.getLuckynum());
                roomGiftModel.setLuckymultiple(model.getLuckymultiple());
                ArrayList<LuckyInstancesModel> luckyinstances = model.getLuckyinstances();
                if (luckyinstances != null) {
                    roomGiftModel.getLuckyInstances().clear();
                    roomGiftModel.getLuckyInstances().addAll(luckyinstances);
                }
            }
            return roomGiftModel;
        }

        @NotNull
        public final RoomGiftModel receiveSendAllGIft(@Nullable GiftRoomAllResultModel data) {
            RoomGiftModel roomGiftModel = new RoomGiftModel();
            if (data != null) {
                roomGiftModel.setType(7);
                roomGiftModel.setNewFrom(data.getNewFrom());
                roomGiftModel.setGiftid(data.getGiftid());
                roomGiftModel.setNumber(data.getSuccessnum());
                RoomUserInfoDTO roomUserInfoDTO = new RoomUserInfoDTO();
                roomUserInfoDTO.setUserName(o0000.OooO0OO(o000000.everyone));
                roomGiftModel.to = roomUserInfoDTO;
                roomGiftModel.setCoin(data.getCoin());
                roomGiftModel.setCrystal(data.getCrystal());
                roomGiftModel.setLuckyflag(data.getLuckyflag());
                roomGiftModel.setLuckymoney(data.getLuckymoney());
                roomGiftModel.setLuckynum(data.getLuckynum());
                roomGiftModel.setLuckymultiple(data.getLuckymultiple());
                ArrayList<LuckyInstancesModel> luckyinstances = data.getLuckyinstances();
                if (luckyinstances != null) {
                    roomGiftModel.getLuckyInstances().clear();
                    roomGiftModel.getLuckyInstances().addAll(luckyinstances);
                }
            }
            return roomGiftModel;
        }
    }

    public final int getBlindBoxLevel() {
        return this.blindBoxLevel;
    }

    public final long getCoin() {
        return this.coin;
    }

    @Nullable
    public final RoomGiftCombineGiftInfo getCombineGiftInfo() {
        return this.combineGiftInfo;
    }

    public final long getCrystal() {
        return this.crystal;
    }

    @Nullable
    public final RoomGiftCustomModel getCustomGiftInfo() {
        return this.customGiftInfo;
    }

    public final int getEffectFrameType() {
        return this.effectFrameType;
    }

    @Nullable
    public final String getEffectUrl() {
        return this.effectUrl;
    }

    public final int getEnvelopflag() {
        return this.envelopflag;
    }

    public final int getFromboxid() {
        return this.fromboxid;
    }

    public final boolean getGiftIsAudio() {
        return this.giftIsAudio;
    }

    public final int getGiftType() {
        return this.giftType;
    }

    @Nullable
    public final String getGiftUrl() {
        return this.giftUrl;
    }

    public final int getGiftUserType() {
        return this.giftUserType;
    }

    public final int getGiftid() {
        return this.giftid;
    }

    public final int getGiftsubtype() {
        return this.giftsubtype;
    }

    @NotNull
    public final List<LuckyInstancesModel> getLuckyInstances() {
        if (this.luckyinstances == null) {
            this.luckyinstances = new ArrayList();
        }
        List<LuckyInstancesModel> list = this.luckyinstances;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.yalla.yalla.model.LuckyInstancesModel>");
        return TypeIntrinsics.asMutableList(list);
    }

    public final long getLuckyflag() {
        return this.luckyflag;
    }

    public final long getLuckymoney() {
        return this.luckymoney;
    }

    public final long getLuckymultiple() {
        return this.luckymultiple;
    }

    public final long getLuckynum() {
        return this.luckynum;
    }

    public final long getMorajuid() {
        return this.morajuid;
    }

    @Nullable
    public final RoomUserInfoModel getNewFrom() {
        if (this.newFrom == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.from;
            this.newFrom = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newFrom;
    }

    @Nullable
    public final RoomUserInfoModel getNewTo() {
        if (this.newTo == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.to;
            this.newTo = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newTo;
    }

    public final int getNumber() {
        return this.number;
    }

    @NotNull
    public final ChatModel getRoomChatModel() {
        ChatModel chatModel = new ChatModel();
        chatModel.setType(1);
        chatModel.setNumber(this.number);
        chatModel.setGiftid(this.giftid);
        chatModel.setGiftsubtype(this.giftsubtype);
        chatModel.setGiftUrl(this.giftUrl);
        chatModel.setGiftUserType(this.giftUserType);
        chatModel.setGiftType(this.giftType);
        chatModel.setNewFrom(getNewFrom());
        chatModel.setNewTo(getNewTo());
        chatModel.setUuid(this.uuid);
        return chatModel;
    }

    @Nullable
    public final BarInfoModel.RoomInfoOld getRoominfo() {
        return this.roominfo;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final boolean giftFromBackpack() {
        return this.frombackpack == 1;
    }

    public final boolean hasFirstLuckyLevel() {
        if (!this.hasFirstLuckyLevel) {
            List<LuckyInstancesModel> list = this.luckyinstances;
            if (!(list == null || list.isEmpty())) {
                List<LuckyInstancesModel> list2 = this.luckyinstances;
                if (list2 != null) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (((LuckyInstancesModel) it.next()).getLlevel() == 1) {
                            this.hasFirstLuckyLevel = true;
                        }
                    }
                }
                return this.hasFirstLuckyLevel;
            }
        }
        return this.hasFirstLuckyLevel;
    }

    public final boolean isAddGiftRunway() {
        int i = this.type;
        if (i == 7 || i == 8) {
            return true;
        }
        if (i != 81) {
            if (this.from != null) {
                return true;
            }
        } else if (this.from == null) {
            return true;
        }
        return false;
    }

    public final boolean isLuckyflag() {
        return this.luckyflag == 1;
    }

    public final void setBlindBoxLevel(int i) {
        this.blindBoxLevel = i;
    }

    public final void setCoin(long j) {
        this.coin = j;
    }

    public final void setCombineGiftInfo(@Nullable RoomGiftCombineGiftInfo roomGiftCombineGiftInfo) {
        this.combineGiftInfo = roomGiftCombineGiftInfo;
    }

    public final void setCrystal(long j) {
        this.crystal = j;
    }

    public final void setCustomGiftInfo(@Nullable RoomGiftCustomModel roomGiftCustomModel) {
        this.customGiftInfo = roomGiftCustomModel;
    }

    public final void setEffectFrameType(int i) {
        this.effectFrameType = i;
    }

    public final void setEffectUrl(@Nullable String str) {
        this.effectUrl = str;
    }

    public final void setEnvelopflag(int i) {
        this.envelopflag = i;
    }

    public final void setFromboxid(int i) {
        this.fromboxid = i;
    }

    public final void setGiftIsAudio(boolean z) {
        this.giftIsAudio = z;
    }

    public final void setGiftType(int i) {
        this.giftType = i;
    }

    public final void setGiftUrl(@Nullable String str) {
        this.giftUrl = str;
    }

    public final void setGiftUserType(int i) {
        this.giftUserType = i;
    }

    public final void setGiftid(int i) {
        this.giftid = i;
    }

    public final void setGiftsubtype(int i) {
        this.giftsubtype = i;
    }

    public final void setLuckyflag(long j) {
        this.luckyflag = j;
    }

    public final void setLuckymoney(long j) {
        this.luckymoney = j;
    }

    public final void setLuckymultiple(long j) {
        this.luckymultiple = j;
    }

    public final void setLuckynum(long j) {
        this.luckynum = j;
    }

    public final void setMorajuid(long j) {
        this.morajuid = j;
    }

    public final void setNewFrom(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newFrom = roomUserInfoModel;
    }

    public final void setNewTo(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newTo = roomUserInfoModel;
    }

    public final void setNumber(int i) {
        this.number = i;
    }

    public final void setRoominfo(@Nullable BarInfoModel.RoomInfoOld roomInfoOld) {
        this.roominfo = roomInfoOld;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }
}
