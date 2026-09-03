package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001e\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001a\u0010\"\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010%\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001e\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u00107\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0012\"\u0004\b9\u0010\u0014R\u001a\u0010:\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0006\"\u0004\b<\u0010\bR\u001e\u0010=\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001e\u0010@\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0012\"\u0004\bB\u0010\u0014¨\u0006C"}, d2 = {"Lcom/yalla/yalla/model/ThemeModel;", "", "()V", "dayNum", "", "getDayNum", "()I", "setDayNum", "(I)V", "defaultDrawable", "", "getDefaultDrawable", "()Z", "setDefaultDrawable", "(Z)V", "h5Url", "", "getH5Url", "()Ljava/lang/String;", "setH5Url", "(Ljava/lang/String;)V", "isBoxAward", "setBoxAward", "isCanGive", "setCanGive", "isHave", "setHave", "isRoomTeamAward", "setRoomTeamAward", "isSelected", "setSelected", "limitNum", "getLimitNum", "setLimitNum", "name", "getName", "setName", "pic", "getPic", "setPic", "premiumLvThemeTag", "getPremiumLvThemeTag", "setPremiumLvThemeTag", "price", "getPrice", "setPrice", "promotionPrice", "getPromotionPrice", "setPromotionPrice", "shopId", "", "getShopId", "()J", "setShopId", "(J)V", "themeTag", "getThemeTag", "setThemeTag", "themeTagType", "getThemeTagType", "setThemeTagType", "timeLong", "getTimeLong", "setTimeLong", "videoPath", "getVideoPath", "setVideoPath", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ThemeModel {
    public static final int $stable = 8;

    @SerializedName("daynum")
    private int dayNum;
    private boolean defaultDrawable;
    private boolean isBoxAward;
    private boolean isCanGive;

    @SerializedName("ishave")
    private int isHave;
    private boolean isRoomTeamAward;
    private boolean isSelected;

    @SerializedName("limitnum")
    private int limitNum;
    private int premiumLvThemeTag;
    private int price;

    @SerializedName("promotionprice")
    private int promotionPrice;

    @SerializedName("shopid")
    private long shopId;
    private int themeTagType;

    @SerializedName("timelong")
    private long timeLong;

    @NotNull
    private String name = "";

    @NotNull
    private String pic = "";

    @SerializedName("picDynamic")
    @NotNull
    private String videoPath = "";

    @NotNull
    private String themeTag = "";

    @NotNull
    private String h5Url = "";

    public final int getDayNum() {
        return this.dayNum;
    }

    public final boolean getDefaultDrawable() {
        return this.defaultDrawable;
    }

    @NotNull
    public final String getH5Url() {
        return this.h5Url;
    }

    public final int getLimitNum() {
        return this.limitNum;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    public final int getPremiumLvThemeTag() {
        return this.premiumLvThemeTag;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getPromotionPrice() {
        return this.promotionPrice;
    }

    public final long getShopId() {
        return this.shopId;
    }

    @NotNull
    public final String getThemeTag() {
        return this.themeTag;
    }

    public final int getThemeTagType() {
        return this.themeTagType;
    }

    public final long getTimeLong() {
        return this.timeLong;
    }

    @NotNull
    public final String getVideoPath() {
        return this.videoPath;
    }

    /* JADX INFO: renamed from: isBoxAward, reason: from getter */
    public final boolean getIsBoxAward() {
        return this.isBoxAward;
    }

    /* JADX INFO: renamed from: isCanGive, reason: from getter */
    public final boolean getIsCanGive() {
        return this.isCanGive;
    }

    /* JADX INFO: renamed from: isHave, reason: from getter */
    public final int getIsHave() {
        return this.isHave;
    }

    /* JADX INFO: renamed from: isRoomTeamAward, reason: from getter */
    public final boolean getIsRoomTeamAward() {
        return this.isRoomTeamAward;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setBoxAward(boolean z) {
        this.isBoxAward = z;
    }

    public final void setCanGive(boolean z) {
        this.isCanGive = z;
    }

    public final void setDayNum(int i) {
        this.dayNum = i;
    }

    public final void setDefaultDrawable(boolean z) {
        this.defaultDrawable = z;
    }

    public final void setH5Url(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.h5Url = str;
    }

    public final void setHave(int i) {
        this.isHave = i;
    }

    public final void setLimitNum(int i) {
        this.limitNum = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public final void setPremiumLvThemeTag(int i) {
        this.premiumLvThemeTag = i;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final void setPromotionPrice(int i) {
        this.promotionPrice = i;
    }

    public final void setRoomTeamAward(boolean z) {
        this.isRoomTeamAward = z;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setShopId(long j) {
        this.shopId = j;
    }

    public final void setThemeTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.themeTag = str;
    }

    public final void setThemeTagType(int i) {
        this.themeTagType = i;
    }

    public final void setTimeLong(long j) {
        this.timeLong = j;
    }

    public final void setVideoPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoPath = str;
    }

    @NotNull
    public final ThemeModel setDefaultDrawable(boolean defaultDrawable, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.defaultDrawable = defaultDrawable;
        this.shopId = 0L;
        this.isHave = 1;
        this.name = name;
        this.isCanGive = false;
        return this;
    }
}
