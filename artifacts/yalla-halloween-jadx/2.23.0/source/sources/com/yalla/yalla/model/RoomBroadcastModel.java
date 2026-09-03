package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010]\u001a\u00020^2\u0006\u0010T\u001a\u00020\u00042\b\u0010?\u001a\u0004\u0018\u00010@J\u0016\u0010_\u001a\u00020^2\u0006\u0010T\u001a\u00020\u00042\u0006\u00103\u001a\u00020(R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001a\u00100\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001a\u00103\u001a\u00020(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\u001a\u00106\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001c\u0010Q\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u001b\"\u0004\bS\u0010\u001dR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001c\u0010W\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010*\"\u0004\bY\u0010,R\u001a\u0010Z\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\b¨\u0006`"}, d2 = {"Lcom/yalla/yalla/model/RoomBroadcastModel;", "", "()V", "balance", "", "getBalance", "()I", "setBalance", "(I)V", "barid", "", "getBarid", "()J", "setBarid", "(J)V", "baridx", "getBaridx", "setBaridx", "blindBoxLevel", "getBlindBoxLevel", "setBlindBoxLevel", "envelopflag", "getEnvelopflag", "setEnvelopflag", "from", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "getFrom", "()Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "setFrom", "(Lcom/yalla/yalla/model/room/RoomUserInfoDTO;)V", "fromBlindBoxId", "getFromBlindBoxId", "setFromBlindBoxId", "gift", "Lcom/yalla/yalla/model/BarInfoModel$giftClass;", "getGift", "()Lcom/yalla/yalla/model/BarInfoModel$giftClass;", "setGift", "(Lcom/yalla/yalla/model/BarInfoModel$giftClass;)V", "lang", "", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "luckymoney", "getLuckymoney", "setLuckymoney", "luckymultiple", "getLuckymultiple", "setLuckymultiple", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "moraflag", "getMoraflag", "setMoraflag", "morajuid", "getMorajuid", "setMorajuid", "num", "getNum", "setNum", "roomBroadcastOpenNobleDataModel", "Lcom/yalla/yalla/model/RoomBroadcastOpenNobleDataModel;", "getRoomBroadcastOpenNobleDataModel", "()Lcom/yalla/yalla/model/RoomBroadcastOpenNobleDataModel;", "setRoomBroadcastOpenNobleDataModel", "(Lcom/yalla/yalla/model/RoomBroadcastOpenNobleDataModel;)V", "roominfo", "Lcom/yalla/yalla/model/BarInfoModel$RoomInfoOld;", "getRoominfo", "()Lcom/yalla/yalla/model/BarInfoModel$RoomInfoOld;", "setRoominfo", "(Lcom/yalla/yalla/model/BarInfoModel$RoomInfoOld;)V", "roomtype", "getRoomtype", "setRoomtype", "showeffectflag", "getShoweffectflag", "setShoweffectflag", "to", "getTo", "setTo", "type", "getType", "setType", "username", "getUsername", "setUsername", "wincoinnum", "getWincoinnum", "setWincoinnum", "setNobleData", "", "setTextData", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoomBroadcastModel {
    public static final int $stable = 8;
    private int balance;
    private long barid;
    private long baridx;

    @SerializedName("blindboxlevel")
    private int blindBoxLevel;
    private int envelopflag;

    @Nullable
    private RoomUserInfoDTO from;

    @SerializedName("fromblindboxid")
    private long fromBlindBoxId;

    @Nullable
    private BarInfoModel.giftClass gift;

    @Nullable
    private String lang;
    private long luckymoney;
    private long luckymultiple;

    @NotNull
    private String message = "";
    private int moraflag;
    private long morajuid;
    private int num;

    @Nullable
    private RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel;

    @Nullable
    private BarInfoModel.RoomInfoOld roominfo;
    private int roomtype;
    private int showeffectflag;

    @Nullable
    private RoomUserInfoDTO to;
    private int type;

    @Nullable
    private String username;
    private int wincoinnum;

    public final int getBalance() {
        return this.balance;
    }

    public final long getBarid() {
        return this.barid;
    }

    public final long getBaridx() {
        return this.baridx;
    }

    public final int getBlindBoxLevel() {
        return this.blindBoxLevel;
    }

    public final int getEnvelopflag() {
        return this.envelopflag;
    }

    @Nullable
    public final RoomUserInfoDTO getFrom() {
        return this.from;
    }

    public final long getFromBlindBoxId() {
        return this.fromBlindBoxId;
    }

    @Nullable
    public final BarInfoModel.giftClass getGift() {
        return this.gift;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    public final long getLuckymoney() {
        return this.luckymoney;
    }

    public final long getLuckymultiple() {
        return this.luckymultiple;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getMoraflag() {
        return this.moraflag;
    }

    public final long getMorajuid() {
        return this.morajuid;
    }

    public final int getNum() {
        return this.num;
    }

    @Nullable
    public final RoomBroadcastOpenNobleDataModel getRoomBroadcastOpenNobleDataModel() {
        return this.roomBroadcastOpenNobleDataModel;
    }

    @Nullable
    public final BarInfoModel.RoomInfoOld getRoominfo() {
        return this.roominfo;
    }

    public final int getRoomtype() {
        return this.roomtype;
    }

    public final int getShoweffectflag() {
        return this.showeffectflag;
    }

    @Nullable
    public final RoomUserInfoDTO getTo() {
        return this.to;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public final int getWincoinnum() {
        return this.wincoinnum;
    }

    public final void setBalance(int i) {
        this.balance = i;
    }

    public final void setBarid(long j) {
        this.barid = j;
    }

    public final void setBaridx(long j) {
        this.baridx = j;
    }

    public final void setBlindBoxLevel(int i) {
        this.blindBoxLevel = i;
    }

    public final void setEnvelopflag(int i) {
        this.envelopflag = i;
    }

    public final void setFrom(@Nullable RoomUserInfoDTO roomUserInfoDTO) {
        this.from = roomUserInfoDTO;
    }

    public final void setFromBlindBoxId(long j) {
        this.fromBlindBoxId = j;
    }

    public final void setGift(@Nullable BarInfoModel.giftClass giftclass) {
        this.gift = giftclass;
    }

    public final void setLang(@Nullable String str) {
        this.lang = str;
    }

    public final void setLuckymoney(long j) {
        this.luckymoney = j;
    }

    public final void setLuckymultiple(long j) {
        this.luckymultiple = j;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final void setMoraflag(int i) {
        this.moraflag = i;
    }

    public final void setMorajuid(long j) {
        this.morajuid = j;
    }

    public final void setNobleData(int type, @Nullable RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel) {
        this.type = type;
        this.roomBroadcastOpenNobleDataModel = roomBroadcastOpenNobleDataModel;
    }

    public final void setNum(int i) {
        this.num = i;
    }

    public final void setRoomBroadcastOpenNobleDataModel(@Nullable RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel) {
        this.roomBroadcastOpenNobleDataModel = roomBroadcastOpenNobleDataModel;
    }

    public final void setRoominfo(@Nullable BarInfoModel.RoomInfoOld roomInfoOld) {
        this.roominfo = roomInfoOld;
    }

    public final void setRoomtype(int i) {
        this.roomtype = i;
    }

    public final void setShoweffectflag(int i) {
        this.showeffectflag = i;
    }

    public final void setTextData(int type, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.type = type;
        this.message = message;
        this.lang = "en";
    }

    public final void setTo(@Nullable RoomUserInfoDTO roomUserInfoDTO) {
        this.to = roomUserInfoDTO;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUsername(@Nullable String str) {
        this.username = str;
    }

    public final void setWincoinnum(int i) {
        this.wincoinnum = i;
    }
}
