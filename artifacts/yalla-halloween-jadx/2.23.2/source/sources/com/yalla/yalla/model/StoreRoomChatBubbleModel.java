package com.yalla.yalla.model;

import androidx.compose.animation.OooO0O0;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O0Oo.OooOOO0;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003¢\u0006\u0002\u0010\u001cJ\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\tHÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\tHÆ\u0003J\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\tHÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\t\u0010L\u001a\u00020\tHÆ\u0003J\t\u0010M\u001a\u00020\tHÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003Jï\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010P\u001a\u00020\u00072\b\u0010Q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010R\u001a\u00020\tHÖ\u0001J\t\u0010S\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010#R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u0011\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b0\u0010%R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010#\"\u0004\b3\u00104R\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001e¨\u0006T"}, d2 = {"Lcom/yalla/yalla/model/StoreRoomChatBubbleModel;", "", "attachedPicUrl", "", "backgroundUrl", "bubbleColour", "canBuy", "", "canBuyUserType", "", "dayNum", "exclusiveLv", "flagType", "frozenDay", "h5Url", "isHave", "limitNum", "obtainType", "obtainLevel", "picUrl", "price", "promotionPrice", "replyColour", "selected", "shopId", "timeLong", "waresName", "bubbleText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIIILjava/lang/String;ZIIILjava/lang/String;IILjava/lang/String;ZIILjava/lang/String;Ljava/lang/String;)V", "getAttachedPicUrl", "()Ljava/lang/String;", "getBackgroundUrl", "getBubbleColour", "getBubbleText", "getCanBuy", "()Z", "getCanBuyUserType", "()I", "getDayNum", "getExclusiveLv", "getFlagType", "getFrozenDay", "getH5Url", "getLimitNum", "getObtainLevel", "getObtainType", "getPicUrl", "getPrice", "getPromotionPrice", "getReplyColour", "getSelected", "setSelected", "(Z)V", "getShopId", "getTimeLong", "getWaresName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StoreRoomChatBubbleModel {
    public static final int $stable = 8;

    @NotNull
    private final String attachedPicUrl;

    @NotNull
    private final String backgroundUrl;

    @NotNull
    private final String bubbleColour;

    @NotNull
    private final String bubbleText;
    private final boolean canBuy;
    private final int canBuyUserType;
    private final int dayNum;
    private final int exclusiveLv;
    private final int flagType;
    private final int frozenDay;

    @NotNull
    private final String h5Url;
    private final boolean isHave;
    private final int limitNum;
    private final int obtainLevel;
    private final int obtainType;

    @NotNull
    private final String picUrl;
    private final int price;
    private final int promotionPrice;

    @NotNull
    private final String replyColour;
    private boolean selected;
    private final int shopId;
    private final int timeLong;

    @NotNull
    private final String waresName;

    public StoreRoomChatBubbleModel() {
        this(null, null, null, false, 0, 0, 0, 0, 0, null, false, 0, 0, 0, null, 0, 0, null, false, 0, 0, null, null, 8388607, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAttachedPicUrl() {
        return this.attachedPicUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getH5Url() {
        return this.h5Url;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsHave() {
        return this.isHave;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getLimitNum() {
        return this.limitNum;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getObtainType() {
        return this.obtainType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getObtainLevel() {
        return this.obtainLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getPromotionPrice() {
        return this.promotionPrice;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getReplyColour() {
        return this.replyColour;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getShopId() {
        return this.shopId;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getTimeLong() {
        return this.timeLong;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getWaresName() {
        return this.waresName;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getBubbleText() {
        return this.bubbleText;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBubbleColour() {
        return this.bubbleColour;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCanBuy() {
        return this.canBuy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getCanBuyUserType() {
        return this.canBuyUserType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDayNum() {
        return this.dayNum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getExclusiveLv() {
        return this.exclusiveLv;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFlagType() {
        return this.flagType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFrozenDay() {
        return this.frozenDay;
    }

    @NotNull
    public final StoreRoomChatBubbleModel copy(@NotNull String attachedPicUrl, @NotNull String backgroundUrl, @NotNull String bubbleColour, boolean canBuy, int canBuyUserType, int dayNum, int exclusiveLv, int flagType, int frozenDay, @NotNull String h5Url, boolean isHave, int limitNum, int obtainType, int obtainLevel, @NotNull String picUrl, int price, int promotionPrice, @NotNull String replyColour, boolean selected, int shopId, int timeLong, @NotNull String waresName, @NotNull String bubbleText) {
        Intrinsics.checkNotNullParameter(attachedPicUrl, "attachedPicUrl");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(bubbleColour, "bubbleColour");
        Intrinsics.checkNotNullParameter(h5Url, "h5Url");
        Intrinsics.checkNotNullParameter(picUrl, "picUrl");
        Intrinsics.checkNotNullParameter(replyColour, "replyColour");
        Intrinsics.checkNotNullParameter(waresName, "waresName");
        Intrinsics.checkNotNullParameter(bubbleText, "bubbleText");
        return new StoreRoomChatBubbleModel(attachedPicUrl, backgroundUrl, bubbleColour, canBuy, canBuyUserType, dayNum, exclusiveLv, flagType, frozenDay, h5Url, isHave, limitNum, obtainType, obtainLevel, picUrl, price, promotionPrice, replyColour, selected, shopId, timeLong, waresName, bubbleText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreRoomChatBubbleModel)) {
            return false;
        }
        StoreRoomChatBubbleModel storeRoomChatBubbleModel = (StoreRoomChatBubbleModel) other;
        return Intrinsics.areEqual(this.attachedPicUrl, storeRoomChatBubbleModel.attachedPicUrl) && Intrinsics.areEqual(this.backgroundUrl, storeRoomChatBubbleModel.backgroundUrl) && Intrinsics.areEqual(this.bubbleColour, storeRoomChatBubbleModel.bubbleColour) && this.canBuy == storeRoomChatBubbleModel.canBuy && this.canBuyUserType == storeRoomChatBubbleModel.canBuyUserType && this.dayNum == storeRoomChatBubbleModel.dayNum && this.exclusiveLv == storeRoomChatBubbleModel.exclusiveLv && this.flagType == storeRoomChatBubbleModel.flagType && this.frozenDay == storeRoomChatBubbleModel.frozenDay && Intrinsics.areEqual(this.h5Url, storeRoomChatBubbleModel.h5Url) && this.isHave == storeRoomChatBubbleModel.isHave && this.limitNum == storeRoomChatBubbleModel.limitNum && this.obtainType == storeRoomChatBubbleModel.obtainType && this.obtainLevel == storeRoomChatBubbleModel.obtainLevel && Intrinsics.areEqual(this.picUrl, storeRoomChatBubbleModel.picUrl) && this.price == storeRoomChatBubbleModel.price && this.promotionPrice == storeRoomChatBubbleModel.promotionPrice && Intrinsics.areEqual(this.replyColour, storeRoomChatBubbleModel.replyColour) && this.selected == storeRoomChatBubbleModel.selected && this.shopId == storeRoomChatBubbleModel.shopId && this.timeLong == storeRoomChatBubbleModel.timeLong && Intrinsics.areEqual(this.waresName, storeRoomChatBubbleModel.waresName) && Intrinsics.areEqual(this.bubbleText, storeRoomChatBubbleModel.bubbleText);
    }

    @NotNull
    public final String getAttachedPicUrl() {
        return this.attachedPicUrl;
    }

    @NotNull
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @NotNull
    public final String getBubbleColour() {
        return this.bubbleColour;
    }

    @NotNull
    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final boolean getCanBuy() {
        return this.canBuy;
    }

    public final int getCanBuyUserType() {
        return this.canBuyUserType;
    }

    public final int getDayNum() {
        return this.dayNum;
    }

    public final int getExclusiveLv() {
        return this.exclusiveLv;
    }

    public final int getFlagType() {
        return this.flagType;
    }

    public final int getFrozenDay() {
        return this.frozenDay;
    }

    @NotNull
    public final String getH5Url() {
        return this.h5Url;
    }

    public final int getLimitNum() {
        return this.limitNum;
    }

    public final int getObtainLevel() {
        return this.obtainLevel;
    }

    public final int getObtainType() {
        return this.obtainType;
    }

    @NotNull
    public final String getPicUrl() {
        return this.picUrl;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getPromotionPrice() {
        return this.promotionPrice;
    }

    @NotNull
    public final String getReplyColour() {
        return this.replyColour;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getShopId() {
        return this.shopId;
    }

    public final int getTimeLong() {
        return this.timeLong;
    }

    @NotNull
    public final String getWaresName() {
        return this.waresName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iOooO00o = OooO0O0.OooO00o(this.bubbleColour, OooO0O0.OooO00o(this.backgroundUrl, this.attachedPicUrl.hashCode() * 31, 31), 31);
        boolean z = this.canBuy;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iOooO00o2 = OooO0O0.OooO00o(this.h5Url, (((((((((((iOooO00o + r1) * 31) + this.canBuyUserType) * 31) + this.dayNum) * 31) + this.exclusiveLv) * 31) + this.flagType) * 31) + this.frozenDay) * 31, 31);
        boolean z2 = this.isHave;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iOooO00o3 = OooO0O0.OooO00o(this.replyColour, (((OooO0O0.OooO00o(this.picUrl, (((((((iOooO00o2 + r2) * 31) + this.limitNum) * 31) + this.obtainType) * 31) + this.obtainLevel) * 31, 31) + this.price) * 31) + this.promotionPrice) * 31, 31);
        boolean z3 = this.selected;
        return this.bubbleText.hashCode() + OooO0O0.OooO00o(this.waresName, (((((iOooO00o3 + (z3 ? 1 : z3)) * 31) + this.shopId) * 31) + this.timeLong) * 31, 31);
    }

    public final boolean isHave() {
        return this.isHave;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    @NotNull
    public String toString() {
        String str = this.attachedPicUrl;
        String str2 = this.backgroundUrl;
        String str3 = this.bubbleColour;
        boolean z = this.canBuy;
        int i = this.canBuyUserType;
        int i2 = this.dayNum;
        int i3 = this.exclusiveLv;
        int i4 = this.flagType;
        int i5 = this.frozenDay;
        String str4 = this.h5Url;
        boolean z2 = this.isHave;
        int i6 = this.limitNum;
        int i7 = this.obtainType;
        int i8 = this.obtainLevel;
        String str5 = this.picUrl;
        int i9 = this.price;
        int i10 = this.promotionPrice;
        String str6 = this.replyColour;
        boolean z3 = this.selected;
        int i11 = this.shopId;
        int i12 = this.timeLong;
        String str7 = this.waresName;
        String str8 = this.bubbleText;
        StringBuilder sbOooO00o = OooO0OO.OooO00o("StoreRoomChatBubbleModel(attachedPicUrl=", str, ", backgroundUrl=", str2, ", bubbleColour=");
        sbOooO00o.append(str3);
        sbOooO00o.append(", canBuy=");
        sbOooO00o.append(z);
        sbOooO00o.append(", canBuyUserType=");
        OooOOO0.OooO00o(sbOooO00o, i, ", dayNum=", i2, ", exclusiveLv=");
        OooOOO0.OooO00o(sbOooO00o, i3, ", flagType=", i4, ", frozenDay=");
        sbOooO00o.append(i5);
        sbOooO00o.append(", h5Url=");
        sbOooO00o.append(str4);
        sbOooO00o.append(", isHave=");
        sbOooO00o.append(z2);
        sbOooO00o.append(", limitNum=");
        sbOooO00o.append(i6);
        sbOooO00o.append(", obtainType=");
        OooOOO0.OooO00o(sbOooO00o, i7, ", obtainLevel=", i8, ", picUrl=");
        sbOooO00o.append(str5);
        sbOooO00o.append(", price=");
        sbOooO00o.append(i9);
        sbOooO00o.append(", promotionPrice=");
        sbOooO00o.append(i10);
        sbOooO00o.append(", replyColour=");
        sbOooO00o.append(str6);
        sbOooO00o.append(", selected=");
        sbOooO00o.append(z3);
        sbOooO00o.append(", shopId=");
        sbOooO00o.append(i11);
        sbOooO00o.append(", timeLong=");
        sbOooO00o.append(i12);
        sbOooO00o.append(", waresName=");
        sbOooO00o.append(str7);
        sbOooO00o.append(", bubbleText=");
        return o0oOO.OooO0O0(sbOooO00o, str8, ")");
    }

    public StoreRoomChatBubbleModel(@NotNull String attachedPicUrl, @NotNull String backgroundUrl, @NotNull String bubbleColour, boolean z, int i, int i2, int i3, int i4, int i5, @NotNull String h5Url, boolean z2, int i6, int i7, int i8, @NotNull String picUrl, int i9, int i10, @NotNull String replyColour, boolean z3, int i11, int i12, @NotNull String waresName, @NotNull String bubbleText) {
        Intrinsics.checkNotNullParameter(attachedPicUrl, "attachedPicUrl");
        Intrinsics.checkNotNullParameter(backgroundUrl, "backgroundUrl");
        Intrinsics.checkNotNullParameter(bubbleColour, "bubbleColour");
        Intrinsics.checkNotNullParameter(h5Url, "h5Url");
        Intrinsics.checkNotNullParameter(picUrl, "picUrl");
        Intrinsics.checkNotNullParameter(replyColour, "replyColour");
        Intrinsics.checkNotNullParameter(waresName, "waresName");
        Intrinsics.checkNotNullParameter(bubbleText, "bubbleText");
        this.attachedPicUrl = attachedPicUrl;
        this.backgroundUrl = backgroundUrl;
        this.bubbleColour = bubbleColour;
        this.canBuy = z;
        this.canBuyUserType = i;
        this.dayNum = i2;
        this.exclusiveLv = i3;
        this.flagType = i4;
        this.frozenDay = i5;
        this.h5Url = h5Url;
        this.isHave = z2;
        this.limitNum = i6;
        this.obtainType = i7;
        this.obtainLevel = i8;
        this.picUrl = picUrl;
        this.price = i9;
        this.promotionPrice = i10;
        this.replyColour = replyColour;
        this.selected = z3;
        this.shopId = i11;
        this.timeLong = i12;
        this.waresName = waresName;
        this.bubbleText = bubbleText;
    }

    public /* synthetic */ StoreRoomChatBubbleModel(String str, String str2, String str3, boolean z, int i, int i2, int i3, int i4, int i5, String str4, boolean z2, int i6, int i7, int i8, String str5, int i9, int i10, String str6, boolean z3, int i11, int i12, String str7, String str8, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? false : z, (i13 & 16) != 0 ? 0 : i, (i13 & 32) != 0 ? 0 : i2, (i13 & 64) != 0 ? 0 : i3, (i13 & 128) != 0 ? 0 : i4, (i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? 0 : i5, (i13 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? "" : str4, (i13 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? false : z2, (i13 & 2048) != 0 ? 0 : i6, (i13 & 4096) != 0 ? 0 : i7, (i13 & 8192) != 0 ? 0 : i8, (i13 & 16384) != 0 ? "" : str5, (i13 & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0 ? 0 : i9, (i13 & 65536) != 0 ? 0 : i10, (i13 & 131072) != 0 ? "" : str6, (i13 & 262144) != 0 ? false : z3, (i13 & 524288) != 0 ? 0 : i11, (i13 & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0 ? 0 : i12, (i13 & 2097152) != 0 ? "" : str7, (i13 & Configuration.BLOCK_SIZE) != 0 ? "" : str8);
    }
}
