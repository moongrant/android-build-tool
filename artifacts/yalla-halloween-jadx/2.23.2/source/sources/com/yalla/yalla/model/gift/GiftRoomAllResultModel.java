package com.yalla.yalla.model.gift;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.LuckyInstancesModel;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR \u0010,\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR.\u00105\u001a\u0016\u0012\u0004\u0012\u000207\u0018\u000106j\n\u0012\u0004\u0012\u000207\u0018\u0001`8X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR\u001a\u0010@\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010\u000eR\u001a\u0010C\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\f\"\u0004\bE\u0010\u000eR\u001e\u0010F\u001a\u0004\u0018\u00010G8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\u001e\u0010O\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0006\"\u0004\bQ\u0010\bR\u001a\u0010R\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0018\"\u0004\bT\u0010\u001a¨\u0006U"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftRoomAllResultModel;", "", "()V", "code", "", "getCode", "()I", "setCode", "(I)V", "coin", "", "getCoin", "()J", "setCoin", "(J)V", "crystal", "getCrystal", "setCrystal", "effectFrameType", "getEffectFrameType", "setEffectFrameType", "effectUrl", "", "getEffectUrl", "()Ljava/lang/String;", "setEffectUrl", "(Ljava/lang/String;)V", "from", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "frombackpack", "getFrombackpack", "setFrombackpack", "giftIsAudio", "", "getGiftIsAudio", "()Z", "setGiftIsAudio", "(Z)V", "giftUrl", "getGiftUrl", "setGiftUrl", "giftUserType", "getGiftUserType", "setGiftUserType", "giftVideoUrl", "getGiftVideoUrl", "setGiftVideoUrl", "giftid", "getGiftid", "setGiftid", "luckyflag", "getLuckyflag", "setLuckyflag", "luckyinstances", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/LuckyInstancesModel;", "Lkotlin/collections/ArrayList;", "getLuckyinstances", "()Ljava/util/ArrayList;", "setLuckyinstances", "(Ljava/util/ArrayList;)V", "luckymoney", "getLuckymoney", "setLuckymoney", "luckymultiple", "getLuckymultiple", "setLuckymultiple", "luckynum", "getLuckynum", "setLuckynum", "newFrom", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "getNewFrom", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "setNewFrom", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;)V", "successnum", "getSuccessnum", "setSuccessnum", "type", "getType", "setType", "uuid", "getUuid", "setUuid", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GiftRoomAllResultModel {
    public static final int $stable = 8;
    private int code;
    private long coin;
    private long crystal;

    @SerializedName("effectFrameType")
    private int effectFrameType;

    @SerializedName("effectUrl")
    @Nullable
    private String effectUrl;

    @Nullable
    private RoomUserInfoDTO from;

    @SerializedName("frombackpack")
    private int frombackpack;

    @SerializedName(alternate = {"giftisaudio"}, value = "giftsaudio")
    private boolean giftIsAudio;

    @SerializedName("gifturl")
    @Nullable
    private String giftUrl;

    @SerializedName(alternate = {"gifttype"}, value = "giftusertype")
    private int giftUserType;

    @SerializedName("giftmedia")
    @Nullable
    private String giftVideoUrl;
    private int giftid;
    private long luckyflag;

    @Nullable
    private ArrayList<LuckyInstancesModel> luckyinstances;
    private long luckymoney;
    private long luckymultiple;
    private long luckynum;

    @Nullable
    private transient RoomUserInfoModel newFrom;
    private int successnum;

    @SerializedName("type")
    private int type;

    @NotNull
    private String uuid = "";

    public final int getCode() {
        return this.code;
    }

    public final long getCoin() {
        return this.coin;
    }

    public final long getCrystal() {
        return this.crystal;
    }

    public final int getEffectFrameType() {
        return this.effectFrameType;
    }

    @Nullable
    public final String getEffectUrl() {
        return this.effectUrl;
    }

    public final int getFrombackpack() {
        return this.frombackpack;
    }

    public final boolean getGiftIsAudio() {
        return this.giftIsAudio;
    }

    @Nullable
    public final String getGiftUrl() {
        return this.giftUrl;
    }

    public final int getGiftUserType() {
        return this.giftUserType;
    }

    @Nullable
    public final String getGiftVideoUrl() {
        return this.giftVideoUrl;
    }

    public final int getGiftid() {
        return this.giftid;
    }

    public final long getLuckyflag() {
        return this.luckyflag;
    }

    @Nullable
    public final ArrayList<LuckyInstancesModel> getLuckyinstances() {
        return this.luckyinstances;
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

    @Nullable
    public final RoomUserInfoModel getNewFrom() {
        if (this.newFrom == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.from;
            this.newFrom = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newFrom;
    }

    public final int getSuccessnum() {
        return this.successnum;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setCoin(long j) {
        this.coin = j;
    }

    public final void setCrystal(long j) {
        this.crystal = j;
    }

    public final void setEffectFrameType(int i) {
        this.effectFrameType = i;
    }

    public final void setEffectUrl(@Nullable String str) {
        this.effectUrl = str;
    }

    public final void setFrombackpack(int i) {
        this.frombackpack = i;
    }

    public final void setGiftIsAudio(boolean z) {
        this.giftIsAudio = z;
    }

    public final void setGiftUrl(@Nullable String str) {
        this.giftUrl = str;
    }

    public final void setGiftUserType(int i) {
        this.giftUserType = i;
    }

    public final void setGiftVideoUrl(@Nullable String str) {
        this.giftVideoUrl = str;
    }

    public final void setGiftid(int i) {
        this.giftid = i;
    }

    public final void setLuckyflag(long j) {
        this.luckyflag = j;
    }

    public final void setLuckyinstances(@Nullable ArrayList<LuckyInstancesModel> arrayList) {
        this.luckyinstances = arrayList;
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

    public final void setNewFrom(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newFrom = roomUserInfoModel;
    }

    public final void setSuccessnum(int i) {
        this.successnum = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }
}
