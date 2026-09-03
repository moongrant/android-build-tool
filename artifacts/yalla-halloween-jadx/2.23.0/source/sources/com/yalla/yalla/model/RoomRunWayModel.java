package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00106\u001a\u00020\u0016J\u0006\u0010Q\u001a\u00020\u0016J\u0006\u0010R\u001a\u00020\u0016J\u0010\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001a\u0010$\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010'\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\u000e\u00106\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R \u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010E\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\u001a\u0010H\u001a\u000208X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0014¨\u0006W"}, d2 = {"Lcom/yalla/yalla/model/RoomRunWayModel;", "", "()V", "fromUserHead", "", "getFromUserHead", "()Ljava/lang/String;", "setFromUserHead", "(Ljava/lang/String;)V", "fromUserId", "getFromUserId", "setFromUserId", "fromUserName", "getFromUserName", "setFromUserName", "fromUserVipLevel", "", "getFromUserVipLevel", "()I", "setFromUserVipLevel", "(I)V", "fromUserVipShow", "", "getFromUserVipShow", "()Z", "setFromUserVipShow", "(Z)V", "fromUserVipState", "getFromUserVipState", "setFromUserVipState", "giftId", "getGiftId", "setGiftId", "giftIsAudio", "getGiftIsAudio", "setGiftIsAudio", "giftNum", "getGiftNum", "setGiftNum", "giftType", "getGiftType", "setGiftType", "giftUrl", "getGiftUrl", "setGiftUrl", "giftUserType", "getGiftUserType", "setGiftUserType", "giftVideoUrl", "getGiftVideoUrl", "setGiftVideoUrl", "giftsubtype", "getGiftsubtype", "setGiftsubtype", "hasFirstLuckyLevel", "luckyflag", "", "luckyinstances", "", "Lcom/yalla/yalla/model/LuckyInstancesModel;", "getLuckyinstances", "()Ljava/util/List;", "setLuckyinstances", "(Ljava/util/List;)V", "luckymoney", "getLuckymoney", "()J", "setLuckymoney", "(J)V", "luckymultiple", "getLuckymultiple", "setLuckymultiple", "toUserId", "getToUserId", "setToUserId", "toUserName", "getToUserName", "setToUserName", "type", "getType", "setType", "isLuckyflag", "isVip6", "setDataFromGiftRoomModel", "", "data", "Lcom/yalla/yalla/model/RoomGiftModel;", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RoomRunWayModel {
    public static final int $stable = 8;
    private int fromUserVipLevel;
    private boolean fromUserVipShow;
    private int fromUserVipState;
    private int giftId;
    private boolean giftIsAudio;
    private int giftNum;
    private int giftType;
    private int giftUserType;
    private int giftsubtype;
    private boolean hasFirstLuckyLevel;
    private long luckyflag;
    private long luckymoney;
    private long luckymultiple;
    private long toUserId;
    private int type;

    @NotNull
    private String fromUserHead = "";

    @NotNull
    private String fromUserName = "";

    @NotNull
    private String toUserName = "";

    @NotNull
    private String giftUrl = "";

    @NotNull
    private String giftVideoUrl = "";

    @NotNull
    private String fromUserId = "";

    @NotNull
    private List<LuckyInstancesModel> luckyinstances = new ArrayList();

    @NotNull
    public final String getFromUserHead() {
        return this.fromUserHead;
    }

    @NotNull
    public final String getFromUserId() {
        return this.fromUserId;
    }

    @NotNull
    public final String getFromUserName() {
        return this.fromUserName;
    }

    public final int getFromUserVipLevel() {
        return this.fromUserVipLevel;
    }

    public final boolean getFromUserVipShow() {
        return this.fromUserVipShow;
    }

    public final int getFromUserVipState() {
        return this.fromUserVipState;
    }

    public final int getGiftId() {
        return this.giftId;
    }

    public final boolean getGiftIsAudio() {
        return this.giftIsAudio;
    }

    public final int getGiftNum() {
        return this.giftNum;
    }

    public final int getGiftType() {
        return this.giftType;
    }

    @NotNull
    public final String getGiftUrl() {
        return this.giftUrl;
    }

    public final int getGiftUserType() {
        return this.giftUserType;
    }

    @NotNull
    public final String getGiftVideoUrl() {
        return this.giftVideoUrl;
    }

    public final int getGiftsubtype() {
        return this.giftsubtype;
    }

    @NotNull
    public final List<LuckyInstancesModel> getLuckyinstances() {
        return this.luckyinstances;
    }

    public final long getLuckymoney() {
        return this.luckymoney;
    }

    public final long getLuckymultiple() {
        return this.luckymultiple;
    }

    public final long getToUserId() {
        return this.toUserId;
    }

    @NotNull
    public final String getToUserName() {
        return this.toUserName;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean hasFirstLuckyLevel() {
        Iterator<LuckyInstancesModel> it = this.luckyinstances.iterator();
        while (it.hasNext()) {
            if (it.next().getLlevel() == 1) {
                this.hasFirstLuckyLevel = true;
                break;
            }
        }
        return this.hasFirstLuckyLevel;
    }

    public final boolean isLuckyflag() {
        return this.luckyflag == 1;
    }

    public final boolean isVip6() {
        return this.fromUserVipState == VipState.Vip.getValue() && this.fromUserVipLevel == VipLevel.Vip6.getValue() && this.fromUserVipShow;
    }

    public final void setDataFromGiftRoomModel(@Nullable RoomGiftModel data) {
        if (data != null) {
            RoomUserInfoModel newFrom = data.getNewFrom();
            if (newFrom != null) {
                this.fromUserHead = o0OoOo0.OooOOO(newFrom.getUserHeader().getValue(), "");
                this.fromUserName = o0OoOo0.OooOOO(newFrom.getUserName().getValue(), "");
                this.fromUserVipLevel = o0OoOo0.OooO0o0(0, newFrom.getVipLevel().getValue());
                this.fromUserVipState = o0OoOo0.OooO0o0(0, newFrom.getVipState().getValue());
                this.fromUserVipShow = o0OoOo0.OooO00o(newFrom.getShowVIP().getValue());
                this.fromUserId = o0OoOo0.OooOOO0("", newFrom.getUserId().getValue());
            }
            RoomUserInfoModel newTo = data.getNewTo();
            if (newTo != null) {
                this.toUserName = o0OoOo0.OooOOO(newTo.getUserName().getValue(), "");
                this.toUserId = o0OoOo0.OooOO0(newTo.getUserId().getValue());
            }
            this.giftId = o0OoOo0.OooO0o0(0, Integer.valueOf(data.getGiftid()));
            this.giftsubtype = o0OoOo0.OooO0o0(0, Integer.valueOf(data.getGiftsubtype()));
            this.giftUrl = o0OoOo0.OooOOO(data.getGiftUrl(), "");
            this.giftVideoUrl = o0OoOo0.OooOOO(data.getEffectUrl(), "");
            this.giftIsAudio = o0OoOo0.OooO00o(Boolean.valueOf(data.getGiftIsAudio()));
            this.giftNum = o0OoOo0.OooO0o0(0, Integer.valueOf(data.getNumber()));
            this.luckyflag = o0OoOo0.OooOO0(Long.valueOf(data.getLuckyflag()));
            this.luckymoney = o0OoOo0.OooOO0(Long.valueOf(data.getLuckymoney()));
            this.luckymultiple = o0OoOo0.OooOO0(Long.valueOf(data.getLuckymultiple()));
            List<LuckyInstancesModel> luckyInstances = data.getLuckyInstances();
            this.luckyinstances.clear();
            this.luckyinstances.addAll(luckyInstances);
            this.type = o0OoOo0.OooO0o0(0, Integer.valueOf(data.getType()));
            this.giftUserType = o0OoOo0.OooO0o0(0, Integer.valueOf(data.getGiftUserType()));
            this.giftType = o0OoOo0.OooO0o0(0, Integer.valueOf(data.getGiftType()));
        }
    }

    public final void setFromUserHead(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fromUserHead = str;
    }

    public final void setFromUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fromUserId = str;
    }

    public final void setFromUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fromUserName = str;
    }

    public final void setFromUserVipLevel(int i) {
        this.fromUserVipLevel = i;
    }

    public final void setFromUserVipShow(boolean z) {
        this.fromUserVipShow = z;
    }

    public final void setFromUserVipState(int i) {
        this.fromUserVipState = i;
    }

    public final void setGiftId(int i) {
        this.giftId = i;
    }

    public final void setGiftIsAudio(boolean z) {
        this.giftIsAudio = z;
    }

    public final void setGiftNum(int i) {
        this.giftNum = i;
    }

    public final void setGiftType(int i) {
        this.giftType = i;
    }

    public final void setGiftUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.giftUrl = str;
    }

    public final void setGiftUserType(int i) {
        this.giftUserType = i;
    }

    public final void setGiftVideoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.giftVideoUrl = str;
    }

    public final void setGiftsubtype(int i) {
        this.giftsubtype = i;
    }

    public final void setLuckyinstances(@NotNull List<LuckyInstancesModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.luckyinstances = list;
    }

    public final void setLuckymoney(long j) {
        this.luckymoney = j;
    }

    public final void setLuckymultiple(long j) {
        this.luckymultiple = j;
    }

    public final void setToUserId(long j) {
        this.toUserId = j;
    }

    public final void setToUserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toUserName = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
