package com.yalla.yalla.model.gift;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p414o0Oo0oO.oO0Oo0oo;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001}B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010r\u001a\u00020\u0000J\u0006\u0010s\u001a\u000204J\u0006\u0010t\u001a\u000204J\u0006\u0010u\u001a\u000204J\u0006\u0010v\u001a\u000204J\u0006\u0010w\u001a\u000204J\u0018\u0010x\u001a\u0002042\u0010\b\u0002\u0010y\u001a\n\u0012\u0004\u0012\u00020{\u0018\u00010zJ\b\u0010|\u001a\u00020\u0019H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001e\u0010-\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001e\u00100\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001b\"\u0004\b2\u0010\u001dR\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00105\"\u0004\b6\u00107R\u001e\u00108\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00105\"\u0004\b9\u00107R\u001e\u0010:\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u00107R\u001e\u0010<\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u00105\"\u0004\b=\u00107R\u001a\u0010>\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\u001e\u0010@\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u00105\"\u0004\bA\u00107R\u001e\u0010B\u001a\u0002048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u00105\"\u0004\bC\u00107R\u001a\u0010D\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0012\"\u0004\bF\u0010\u0014R\u001c\u0010G\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u001b\"\u0004\bI\u0010\u001dR \u0010J\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010P\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001b\"\u0004\bR\u0010\u001dR\u001e\u0010S\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0012\"\u0004\bU\u0010\u0014R\u001e\u0010V\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0012\"\u0004\bX\u0010\u0014R\u001e\u0010Y\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0012\"\u0004\b[\u0010\u0014R\u001e\u0010\\\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u0012\"\u0004\b^\u0010\u0014R\u001e\u0010_\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u0012\"\u0004\ba\u0010\u0014R \u0010b\u001a\u0004\u0018\u00010c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001e\u0010h\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010\u0012\"\u0004\bj\u0010\u0014R\u0012\u0010k\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001e\u0010l\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010\u0012\"\u0004\bn\u0010\u0014R\u001e\u0010o\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u001b\"\u0004\bq\u0010\u001d¨\u0006~"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftPropModel;", "Ljava/io/Serializable;", "()V", "backpackInfo", "Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;", "getBackpackInfo", "()Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;", "setBackpackInfo", "(Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;)V", "customPropDetail", "Lcom/yalla/yalla/model/gift/GiftPropModel$CustomPropDetail;", "getCustomPropDetail", "()Lcom/yalla/yalla/model/gift/GiftPropModel$CustomPropDetail;", "setCustomPropDetail", "(Lcom/yalla/yalla/model/gift/GiftPropModel$CustomPropDetail;)V", "dyEffectLimitNumber", "", "getDyEffectLimitNumber", "()I", "setDyEffectLimitNumber", "(I)V", "effectFrameType", "getEffectFrameType", "setEffectFrameType", "explainUrl", "", "getExplainUrl", "()Ljava/lang/String;", "setExplainUrl", "(Ljava/lang/String;)V", "giftBackpackMinExpirationTimeStamp", "", "getGiftBackpackMinExpirationTimeStamp", "()J", "setGiftBackpackMinExpirationTimeStamp", "(J)V", "giftBackpackPropNum", "getGiftBackpackPropNum", "setGiftBackpackPropNum", "giftBlindDetail", "Lcom/yalla/yalla/model/gift/GiftBlindDetail;", "getGiftBlindDetail", "()Lcom/yalla/yalla/model/gift/GiftBlindDetail;", "setGiftBlindDetail", "(Lcom/yalla/yalla/model/gift/GiftBlindDetail;)V", "giftId", "getGiftId", "setGiftId", "imageUrl", "getImageUrl", "setImageUrl", "isDyEffect", "", "()Z", "setDyEffect", "(Z)V", "isHot", "setHot", "isLuck", "setLuck", "isNew", "setNew", "isNewAnimated", "setNewAnimated", "isSoundEffect", "setSoundEffect", "isWeek", "setWeek", "localCount", "getLocalCount", "setLocalCount", "localSendResultImageUrl", "getLocalSendResultImageUrl", "setLocalSendResultImageUrl", "mergePropDetail", "Lcom/yalla/yalla/model/gift/GiftPropMergeDetail;", "getMergePropDetail", "()Lcom/yalla/yalla/model/gift/GiftPropMergeDetail;", "setMergePropDetail", "(Lcom/yalla/yalla/model/gift/GiftPropMergeDetail;)V", "name", "getName", "setName", "price", "getPrice", "setPrice", "region", "getRegion", "setRegion", "sendLvLimit", "getSendLvLimit", "setSendLvLimit", "sort", "getSort", "setSort", "state", "getState", "setState", "subPropDetails", "Lcom/yalla/yalla/model/gift/GiftPropSubDetailsModel;", "getSubPropDetails", "()Lcom/yalla/yalla/model/gift/GiftPropSubDetailsModel;", "setSubPropDetails", "(Lcom/yalla/yalla/model/gift/GiftPropSubDetailsModel;)V", "typePay", "getTypePay", "setTypePay", "typeTag", "typeUser", "getTypeUser", "setTypeUser", "videoUrl", "getVideoUrl", "setVideoUrl", "clone", "isAllSiteGift", "isBackpack", "isBlind", "isCoin", "isCustomMade", "isMerge", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "toString", "CustomPropDetail", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GiftPropModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("backpackInfo")
    @Nullable
    private GiftBackpackInfoModel backpackInfo;

    @SerializedName("customPropDetail")
    @Nullable
    private CustomPropDetail customPropDetail;

    @SerializedName("dyEffectLimitNumber")
    private int dyEffectLimitNumber;

    @SerializedName("effectFrameType")
    private int effectFrameType;

    @SerializedName("minExpirationTimeStamp")
    private long giftBackpackMinExpirationTimeStamp;

    @SerializedName("propNum")
    private long giftBackpackPropNum;

    @Nullable
    private GiftBlindDetail giftBlindDetail;

    @SerializedName(alternate = {"propId"}, value = "propid")
    private int giftId;

    @SerializedName("isDyEffect")
    private boolean isDyEffect;

    @SerializedName("isHot")
    private boolean isHot;

    @SerializedName("isLuck")
    private boolean isLuck;

    @SerializedName("isNew")
    private boolean isNew;
    private boolean isNewAnimated;

    @SerializedName("isSoundEffect")
    private boolean isSoundEffect;

    @SerializedName("isWeek")
    private boolean isWeek;
    private int localCount;

    @SerializedName("mergePropDetail")
    @Nullable
    private GiftPropMergeDetail mergePropDetail;

    @SerializedName("price")
    private int price;

    @SerializedName("region")
    private int region;

    @SerializedName("sendLvLimit")
    private int sendLvLimit;

    @SerializedName("sort")
    private int sort;

    @SerializedName("state")
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
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftPropModel$CustomPropDetail;", "", "()V", "isFirst", "", "()Z", "setFirst", "(Z)V", "isFirstOpenCustomMade", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
                oO0Oo0oo oo0oo0ooOooO0Oo = o00Ooo.OooO0Oo();
                oo0oo0ooOooO0Oo.getClass();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (oo0oo0ooOooO0Oo.OooO0O0("isFirstOpenCustomMadeGift" + o0O00oO0.OooOOo0().getValue(), true)) {
                    return true;
                }
            }
            return false;
        }

        public final void setFirst(boolean z) {
            this.isFirst = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isMerge$default(GiftPropModel giftPropModel, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        return giftPropModel.isMerge(function0);
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
        giftPropModel.giftBlindDetail = this.giftBlindDetail;
        return giftPropModel;
    }

    @Nullable
    public final GiftBackpackInfoModel getBackpackInfo() {
        return this.backpackInfo;
    }

    @Nullable
    public final CustomPropDetail getCustomPropDetail() {
        return this.customPropDetail;
    }

    public final int getDyEffectLimitNumber() {
        return this.dyEffectLimitNumber;
    }

    public final int getEffectFrameType() {
        return this.effectFrameType;
    }

    @NotNull
    public final String getExplainUrl() {
        return this.explainUrl;
    }

    public final long getGiftBackpackMinExpirationTimeStamp() {
        return this.giftBackpackMinExpirationTimeStamp;
    }

    public final long getGiftBackpackPropNum() {
        return this.giftBackpackPropNum;
    }

    @Nullable
    public final GiftBlindDetail getGiftBlindDetail() {
        return this.giftBlindDetail;
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

    @Nullable
    public final GiftPropMergeDetail getMergePropDetail() {
        return this.mergePropDetail;
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

    public final boolean isBackpack() {
        return this.typeUser == GiftPropTypeUser.Backpack.getValue();
    }

    public final boolean isBlind() {
        List<GiftPropSubItemModel> subProps;
        if (this.typeTag != GiftPropTypeTag.Blind.getValue()) {
            return false;
        }
        GiftPropSubDetailsModel giftPropSubDetailsModel = this.subPropDetails;
        return giftPropSubDetailsModel != null && (subProps = giftPropSubDetailsModel.getSubProps()) != null && (subProps.isEmpty() ^ true);
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

    public final boolean isMerge(@Nullable Function0<Unit> listener) {
        if (this.typeTag != GiftPropTypeTag.Merge.getValue()) {
            return false;
        }
        if (listener == null) {
            return true;
        }
        listener.invoke();
        return true;
    }

    /* JADX INFO: renamed from: isNew, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: isNewAnimated, reason: from getter */
    public final boolean getIsNewAnimated() {
        return this.isNewAnimated;
    }

    /* JADX INFO: renamed from: isSoundEffect, reason: from getter */
    public final boolean getIsSoundEffect() {
        return this.isSoundEffect;
    }

    /* JADX INFO: renamed from: isWeek, reason: from getter */
    public final boolean getIsWeek() {
        return this.isWeek;
    }

    public final void setBackpackInfo(@Nullable GiftBackpackInfoModel giftBackpackInfoModel) {
        this.backpackInfo = giftBackpackInfoModel;
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

    public final void setEffectFrameType(int i) {
        this.effectFrameType = i;
    }

    public final void setExplainUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.explainUrl = str;
    }

    public final void setGiftBackpackMinExpirationTimeStamp(long j) {
        this.giftBackpackMinExpirationTimeStamp = j;
    }

    public final void setGiftBackpackPropNum(long j) {
        this.giftBackpackPropNum = j;
    }

    public final void setGiftBlindDetail(@Nullable GiftBlindDetail giftBlindDetail) {
        this.giftBlindDetail = giftBlindDetail;
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

    public final void setMergePropDetail(@Nullable GiftPropMergeDetail giftPropMergeDetail) {
        this.mergePropDetail = giftPropMergeDetail;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNew(boolean z) {
        this.isNew = z;
    }

    public final void setNewAnimated(boolean z) {
        this.isNewAnimated = z;
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
        return OooO.OooO00o(this);
    }
}
