package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0001VB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010P\u001a\u00020\u0000J\u0006\u0010Q\u001a\u00020\u001cJ\u0006\u0010R\u001a\u00020\u001cJ\u0006\u0010S\u001a\u00020\u001cJ\u0006\u0010T\u001a\u00020\u001cJ\b\u0010U\u001a\u00020\u0010H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001e\u0010\"\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001e\u0010$\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001e\u0010&\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001a\u0010(\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001c\u0010+\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u001e\u0010.\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014R\u001e\u00101\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR\u001e\u00104\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR\u001e\u00107\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u001e\u0010:\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000eR\u001e\u0010=\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR \u0010@\u001a\u0004\u0018\u00010A8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001e\u0010F\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\u0012\u0010I\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001e\u0010J\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\f\"\u0004\bL\u0010\u000eR\u001e\u0010M\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0012\"\u0004\bO\u0010\u0014¨\u0006W"}, d2 = {"Lcom/yalla/yalla/model/GiftPropModel;", "Ljava/io/Serializable;", "()V", "customPropDetail", "Lcom/yalla/yalla/model/GiftPropModel$CustomPropDetail;", "getCustomPropDetail", "()Lcom/yalla/yalla/model/GiftPropModel$CustomPropDetail;", "setCustomPropDetail", "(Lcom/yalla/yalla/model/GiftPropModel$CustomPropDetail;)V", "dyEffectLimitNumber", "", "getDyEffectLimitNumber", "()I", "setDyEffectLimitNumber", "(I)V", "explainUrl", "", "getExplainUrl", "()Ljava/lang/String;", "setExplainUrl", "(Ljava/lang/String;)V", "giftId", "getGiftId", "setGiftId", "imageUrl", "getImageUrl", "setImageUrl", "isDyEffect", "", "()Z", "setDyEffect", "(Z)V", "isHot", "setHot", "isLuck", "setLuck", "isSoundEffect", "setSoundEffect", "isWeek", "setWeek", "localCount", "getLocalCount", "setLocalCount", "localSendResultImageUrl", "getLocalSendResultImageUrl", "setLocalSendResultImageUrl", "name", "getName", "setName", "price", "getPrice", "setPrice", "region", "getRegion", "setRegion", "sendLvLimit", "getSendLvLimit", "setSendLvLimit", "sort", "getSort", "setSort", ServerProtocol.DIALOG_PARAM_STATE, "getState", "setState", "subPropDetails", "Lcom/yalla/yalla/model/GiftPropSubDetailsModel;", "getSubPropDetails", "()Lcom/yalla/yalla/model/GiftPropSubDetailsModel;", "setSubPropDetails", "(Lcom/yalla/yalla/model/GiftPropSubDetailsModel;)V", "typePay", "getTypePay", "setTypePay", "typeTag", "typeUser", "getTypeUser", "setTypeUser", "videoUrl", "getVideoUrl", "setVideoUrl", "clone", "isAllSiteGift", "isBlind", "isCoin", "isCustomMade", "toString", "CustomPropDetail", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GiftPropModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("customPropDetail")
    @Nullable
    private CustomPropDetail customPropDetail;

    @SerializedName("dyEffectLimitNumber")
    private int dyEffectLimitNumber;

    @SerializedName(alternate = {"propId"}, value = "propid")
    private int giftId;

    @SerializedName("isDyEffect")
    private boolean isDyEffect;

    @SerializedName("isHot")
    private boolean isHot;

    @SerializedName("isLuck")
    private boolean isLuck;

    @SerializedName("isSoundEffect")
    private boolean isSoundEffect;

    @SerializedName("isWeek")
    private boolean isWeek;
    private int localCount;

    @SerializedName("price")
    private int price;

    @SerializedName("region")
    private int region;

    @SerializedName("sendLvLimit")
    private int sendLvLimit;

    @SerializedName("sort")
    private int sort;

    @SerializedName(ServerProtocol.DIALOG_PARAM_STATE)
    private int state;

    @SerializedName("subPropDetails")
    @Nullable
    private GiftPropSubDetailsModel subPropDetails;

    @SerializedName("propType")
    private int typePay;

    @SerializedName("type")
    private int typeTag;

    @SerializedName("propUserType")
    private int typeUser;

    @Nullable
    private String localSendResultImageUrl = "";

    @SerializedName("name")
    @NotNull
    private String name = "";

    @SerializedName(alternate = {"imageUrl"}, value = "imageurl")
    @NotNull
    private String imageUrl = "";

    @SerializedName("dyEffectPropUrl")
    @NotNull
    private String videoUrl = "";

    @SerializedName("explainUrl")
    @NotNull
    private String explainUrl = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/GiftPropModel$CustomPropDetail;", "", "()V", "isFirst", "", "()Z", "setFirst", "(Z)V", "isFirstOpenCustomMade", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CustomPropDetail {
        public static final int $stable = 8;

        @SerializedName("isFirst")
        private boolean isFirst;

        /* JADX INFO: renamed from: isFirst, reason: from getter */
        public final boolean getIsFirst() {
            return this.isFirst;
        }

        public final boolean isFirstOpenCustomMade() {
            if (this.isFirst) {
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                o0ooOOo o0oooooOooO0Oo = OooOOO0.OooO0Oo();
                Objects.requireNonNull(o0oooooOooO0Oo);
                if (o0oooooOooO0Oo.OooO00o("isFirstOpenCustomMadeGift" + OooOOO.f41216OooO00o.OooOo().getValue(), true)) {
                    return true;
                }
            }
            return false;
        }

        public final void setFirst(boolean z) {
            this.isFirst = z;
        }
    }

    @NotNull
    public final GiftPropModel clone() {
        GiftPropModel giftPropModel = new GiftPropModel();
        giftPropModel.localCount = this.localCount;
        giftPropModel.localSendResultImageUrl = this.localSendResultImageUrl;
        giftPropModel.giftId = this.giftId;
        giftPropModel.name = this.name;
        giftPropModel.typeTag = this.typeTag;
        giftPropModel.typePay = this.typePay;
        giftPropModel.typeUser = this.typeUser;
        giftPropModel.price = this.price;
        giftPropModel.imageUrl = this.imageUrl;
        giftPropModel.sort = this.sort;
        giftPropModel.state = this.state;
        giftPropModel.region = this.region;
        giftPropModel.isHot = this.isHot;
        giftPropModel.isWeek = this.isWeek;
        giftPropModel.isLuck = this.isLuck;
        giftPropModel.isDyEffect = this.isDyEffect;
        giftPropModel.dyEffectLimitNumber = this.dyEffectLimitNumber;
        giftPropModel.videoUrl = this.videoUrl;
        giftPropModel.isSoundEffect = this.isSoundEffect;
        giftPropModel.sendLvLimit = this.sendLvLimit;
        giftPropModel.subPropDetails = this.subPropDetails;
        return giftPropModel;
    }

    @Nullable
    public final CustomPropDetail getCustomPropDetail() {
        return this.customPropDetail;
    }

    public final int getDyEffectLimitNumber() {
        return this.dyEffectLimitNumber;
    }

    @NotNull
    public final String getExplainUrl() {
        return this.explainUrl;
    }

    public final int getGiftId() {
        return this.giftId;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getLocalCount() {
        return this.localCount;
    }

    @Nullable
    public final String getLocalSendResultImageUrl() {
        return this.localSendResultImageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getRegion() {
        return this.region;
    }

    public final int getSendLvLimit() {
        return this.sendLvLimit;
    }

    public final int getSort() {
        return this.sort;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final GiftPropSubDetailsModel getSubPropDetails() {
        return this.subPropDetails;
    }

    public final int getTypePay() {
        return this.typePay;
    }

    public final int getTypeUser() {
        return this.typeUser;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final boolean isAllSiteGift() {
        return this.typeTag == GiftPropTypeTag.AllSite.getValue();
    }

    public final boolean isBlind() {
        return this.typeTag == GiftPropTypeTag.Blind.getValue();
    }

    public final boolean isCoin() {
        return this.typePay == GiftPropTypePay.Coin.getValue();
    }

    public final boolean isCustomMade() {
        return this.typeTag == GiftPropTypeTag.CustomMade.getValue();
    }

    /* JADX INFO: renamed from: isDyEffect, reason: from getter */
    public final boolean getIsDyEffect() {
        return this.isDyEffect;
    }

    /* JADX INFO: renamed from: isHot, reason: from getter */
    public final boolean getIsHot() {
        return this.isHot;
    }

    /* JADX INFO: renamed from: isLuck, reason: from getter */
    public final boolean getIsLuck() {
        return this.isLuck;
    }

    /* JADX INFO: renamed from: isSoundEffect, reason: from getter */
    public final boolean getIsSoundEffect() {
        return this.isSoundEffect;
    }

    /* JADX INFO: renamed from: isWeek, reason: from getter */
    public final boolean getIsWeek() {
        return this.isWeek;
    }

    public final void setCustomPropDetail(@Nullable CustomPropDetail customPropDetail) {
        this.customPropDetail = customPropDetail;
    }

    public final void setDyEffect(boolean z) {
        this.isDyEffect = z;
    }

    public final void setDyEffectLimitNumber(int i) {
        this.dyEffectLimitNumber = i;
    }

    public final void setExplainUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.explainUrl = str;
    }

    public final void setGiftId(int i) {
        this.giftId = i;
    }

    public final void setHot(boolean z) {
        this.isHot = z;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setLocalCount(int i) {
        this.localCount = i;
    }

    public final void setLocalSendResultImageUrl(@Nullable String str) {
        this.localSendResultImageUrl = str;
    }

    public final void setLuck(boolean z) {
        this.isLuck = z;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setRegion(int i) {
        this.region = i;
    }

    public final void setSendLvLimit(int i) {
        this.sendLvLimit = i;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final void setSoundEffect(boolean z) {
        this.isSoundEffect = z;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setSubPropDetails(@Nullable GiftPropSubDetailsModel giftPropSubDetailsModel) {
        this.subPropDetails = giftPropSubDetailsModel;
    }

    public final void setTypePay(int i) {
        this.typePay = i;
    }

    public final void setTypeUser(int i) {
        this.typeUser = i;
    }

    public final void setVideoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoUrl = str;
    }

    public final void setWeek(boolean z) {
        this.isWeek = z;
    }

    @NotNull
    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("GiftProp(\ngiftId=");
        sbOooO0o0.append(this.giftId);
        sbOooO0o0.append(", name='");
        sbOooO0o0.append(this.name);
        sbOooO0o0.append("', typeTag=");
        sbOooO0o0.append(this.typeTag);
        sbOooO0o0.append(", typePay=");
        sbOooO0o0.append(this.typePay);
        sbOooO0o0.append(", typeUser=");
        sbOooO0o0.append(this.typeUser);
        sbOooO0o0.append(", price=");
        sbOooO0o0.append(this.price);
        sbOooO0o0.append(", imageUrl='");
        sbOooO0o0.append(this.imageUrl);
        sbOooO0o0.append("',sort=");
        sbOooO0o0.append(this.sort);
        sbOooO0o0.append(", state=");
        sbOooO0o0.append(this.state);
        sbOooO0o0.append(", region=");
        sbOooO0o0.append(this.region);
        sbOooO0o0.append(", isHot=");
        sbOooO0o0.append(this.isHot);
        sbOooO0o0.append(", isWeek=");
        sbOooO0o0.append(this.isWeek);
        sbOooO0o0.append(", isLuck=");
        sbOooO0o0.append(this.isLuck);
        sbOooO0o0.append(", isDyEffect=");
        sbOooO0o0.append(this.isDyEffect);
        sbOooO0o0.append(", dyEffectLimitNumber=");
        sbOooO0o0.append(this.dyEffectLimitNumber);
        sbOooO0o0.append(", videoUrl='");
        sbOooO0o0.append(this.videoUrl);
        sbOooO0o0.append("', isSoundEffect=");
        sbOooO0o0.append(this.isSoundEffect);
        sbOooO0o0.append(", sendLvLimit=");
        sbOooO0o0.append(this.sendLvLimit);
        sbOooO0o0.append(", subPropDetails=");
        sbOooO0o0.append(this.subPropDetails);
        sbOooO0o0.append(", )");
        return sbOooO0o0.toString();
    }
}
