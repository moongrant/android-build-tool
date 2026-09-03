package com.yalla.yalla.data.db.table;

import OooO0OO.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.AppEventsConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p041Ooooo0o.o00000;
import p082o000OoOo.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b+\b\u0017\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010>\u001a\u00020\u0016J\b\u0010?\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\u001c\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001e\u0010 \u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\"\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u001e\u0010%\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R\u001e\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR\u001e\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR\u001e\u0010.\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\bR\u001e\u00101\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0006\"\u0004\b3\u0010\bR\u001e\u00104\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0006\"\u0004\b6\u0010\bR\u001e\u00107\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0006\"\u0004\b9\u0010\bR\u001e\u0010:\u001a\u00020\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u000f\"\u0004\b<\u0010\u0011¨\u0006A"}, d2 = {"Lcom/yalla/yalla/data/db/table/GiftProp;", "Ljava/io/Serializable;", "()V", "dyEffectLimitNumber", "", "getDyEffectLimitNumber", "()I", "setDyEffectLimitNumber", "(I)V", "id", "getId", "setId", "imageUrl", "", "getImageUrl", "()Ljava/lang/String;", "setImageUrl", "(Ljava/lang/String;)V", "index", "getIndex", "setIndex", "isDyEffect", "", "()Z", "setDyEffect", "(Z)V", "isHot", "setHot", "isLuck", "setLuck", "isSoundEffect", "setSoundEffect", "isWeek", "setWeek", "name", "getName", "setName", "price", "getPrice", "setPrice", "propType", "getPropType", "setPropType", "propUserType", "getPropUserType", "setPropUserType", "region", "getRegion", "setRegion", "sort", "getSort", "setSort", "state", "getState", "setState", "type", "getType", "setType", "videoUrl", "getVideoUrl", "setVideoUrl", "initId", "isAllSiteGift", "toString", "Companion", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class GiftProp implements Serializable {
    public static final int Flags = 3;
    public static final int HOT = 0;
    public static final int NOBILITY = 1;
    public static final int PROP_TYPE_COIN = 0;
    public static final int PROP_TYPE_CRYSTAL = 1;
    public static final int TYPE_AllSITE = 2;
    public static final int TYPE_HOT = 0;
    public static final int TYPE_SYSTEM = 1;
    public static final int VIP = 2;
    private int dyEffectLimitNumber;

    @SerializedName(alternate = {"propId"}, value = "propid")
    private int id;
    private int index;
    private boolean isDyEffect;

    @SerializedName("isHot")
    private boolean isHot;

    @SerializedName("isLuck")
    private boolean isLuck;

    @SerializedName("isSoundEffect")
    private boolean isSoundEffect;

    @SerializedName("isWeek")
    private boolean isWeek;

    @SerializedName("propType")
    private int propType;

    @SerializedName("propUserType")
    private int propUserType;

    @SerializedName("region")
    private int region;

    @SerializedName("sort")
    private int sort;

    @SerializedName("state")
    private int state;

    @SerializedName("type")
    private int type;
    public static final int $stable = 8;

    @SerializedName("name")
    @NotNull
    private String name = "";

    @SerializedName("price")
    @NotNull
    private String price = AppEventsConstants.EVENT_PARAM_VALUE_NO;

    @SerializedName(alternate = {"imageUrl"}, value = "imageurl")
    @NotNull
    private String imageUrl = "";

    @SerializedName("dyEffectPropUrl")
    @NotNull
    private String videoUrl = "";

    public final int getDyEffectLimitNumber() {
        return this.dyEffectLimitNumber;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPrice() {
        return this.price;
    }

    public final int getPropType() {
        return this.propType;
    }

    public final int getPropUserType() {
        return this.propUserType;
    }

    public final int getRegion() {
        return this.region;
    }

    public final int getSort() {
        return this.sort;
    }

    public final int getState() {
        return this.state;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @NotNull
    public final GiftProp initId(int id) {
        GiftProp giftProp = new GiftProp();
        giftProp.id = id;
        return giftProp;
    }

    public final boolean isAllSiteGift() {
        return this.type == 2;
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

    public final void setDyEffect(boolean z) {
        this.isDyEffect = z;
    }

    public final void setDyEffectLimitNumber(int i) {
        this.dyEffectLimitNumber = i;
    }

    public final void setHot(boolean z) {
        this.isHot = z;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageUrl = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setLuck(boolean z) {
        this.isLuck = z;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.price = str;
    }

    public final void setPropType(int i) {
        this.propType = i;
    }

    public final void setPropUserType(int i) {
        this.propUserType = i;
    }

    public final void setRegion(int i) {
        this.region = i;
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

    public final void setType(int i) {
        this.type = i;
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
        int i = this.index;
        int i2 = this.id;
        int i3 = this.propUserType;
        int i4 = this.propType;
        int i5 = this.type;
        String str = this.name;
        String str2 = this.price;
        String str3 = this.imageUrl;
        int i6 = this.state;
        int i7 = this.sort;
        boolean z = this.isHot;
        boolean z2 = this.isWeek;
        boolean z3 = this.isLuck;
        boolean z4 = this.isSoundEffect;
        int i8 = this.region;
        String str4 = this.videoUrl;
        boolean z5 = this.isDyEffect;
        int i9 = this.dyEffectLimitNumber;
        StringBuilder sbOooO00o = o00000.OooO00o("\nGiftProp(index=", i, ", id=", i2, ", propUserType=");
        OooOOO0.OooO00o(sbOooO00o, i3, ", propType=", i4, ", type=");
        sbOooO00o.append(i5);
        sbOooO00o.append(", name='");
        sbOooO00o.append(str);
        sbOooO00o.append("', price='");
        OooO0O0.OooO00o(sbOooO00o, str2, "', imageUrl='", str3, "', state=");
        OooOOO0.OooO00o(sbOooO00o, i6, ", sort=", i7, ", isHot=");
        sbOooO00o.append(z);
        sbOooO00o.append(", isWeek=");
        sbOooO00o.append(z2);
        sbOooO00o.append(", isLuck=");
        sbOooO00o.append(z3);
        sbOooO00o.append(", isSoundEffect=");
        sbOooO00o.append(z4);
        sbOooO00o.append(", region=");
        sbOooO00o.append(i8);
        sbOooO00o.append(", dyEffectPropUrl='");
        sbOooO00o.append(str4);
        sbOooO00o.append("', isDyEffect=");
        sbOooO00o.append(z5);
        sbOooO00o.append(", dyEffectLimitNumber=");
        sbOooO00o.append(i9);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }
}
