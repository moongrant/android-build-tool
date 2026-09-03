package com.yalla.yalla.model.gift;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\u0010\u0016J\u0006\u00101\u001a\u00020\u0006J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u0093\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001J\u0013\u0010@\u001a\u00020\u00062\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020\u0003HÖ\u0001J\t\u0010C\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010%\"\u0004\b&\u0010'R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010%R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006D"}, d2 = {"Lcom/yalla/yalla/model/gift/GifListJson;", "", "catalogId", "", "buyType", "isCanUse", "", "isNew", "expireTime", "", "dayNum", "payType", "price", "promotionPrice", "folderName", "", "folderIcon", "themeConfig", "Lcom/yalla/yalla/model/gift/ThemeConfig;", "item", "", "Lcom/yalla/yalla/model/gift/GifConfigJson;", "(IIZZJIIIILjava/lang/String;Ljava/lang/String;Lcom/yalla/yalla/model/gift/ThemeConfig;Ljava/util/List;)V", "getBuyType", "()I", "setBuyType", "(I)V", "getCatalogId", "getDayNum", "setDayNum", "getExpireTime", "()J", "setExpireTime", "(J)V", "getFolderIcon", "()Ljava/lang/String;", "getFolderName", "()Z", "setCanUse", "(Z)V", "getItem", "()Ljava/util/List;", "getPayType", "getPrice", "getPromotionPrice", "getThemeConfig", "()Lcom/yalla/yalla/model/gift/ThemeConfig;", "setThemeConfig", "(Lcom/yalla/yalla/model/gift/ThemeConfig;)V", "canNotUse", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GifListJson {
    public static final int $stable = 8;
    private int buyType;
    private final int catalogId;
    private int dayNum;
    private long expireTime;

    @NotNull
    private final String folderIcon;

    @NotNull
    private final String folderName;
    private boolean isCanUse;
    private final boolean isNew;

    @NotNull
    private final List<GifConfigJson> item;
    private final int payType;
    private final int price;
    private final int promotionPrice;

    @Nullable
    private ThemeConfig themeConfig;

    public GifListJson(int i, int i2, boolean z, boolean z2, long j, int i3, int i4, int i5, int i6, @NotNull String folderName, @NotNull String folderIcon, @Nullable ThemeConfig themeConfig, @NotNull List<GifConfigJson> item) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(folderIcon, "folderIcon");
        Intrinsics.checkNotNullParameter(item, "item");
        this.catalogId = i;
        this.buyType = i2;
        this.isCanUse = z;
        this.isNew = z2;
        this.expireTime = j;
        this.dayNum = i3;
        this.payType = i4;
        this.price = i5;
        this.promotionPrice = i6;
        this.folderName = folderName;
        this.folderIcon = folderIcon;
        this.themeConfig = themeConfig;
        this.item = item;
    }

    public final boolean canNotUse() {
        return this.buyType == 1 && !this.isCanUse;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCatalogId() {
        return this.catalogId;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFolderName() {
        return this.folderName;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFolderIcon() {
        return this.folderIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ThemeConfig getThemeConfig() {
        return this.themeConfig;
    }

    @NotNull
    public final List<GifConfigJson> component13() {
        return this.item;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBuyType() {
        return this.buyType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCanUse() {
        return this.isCanUse;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDayNum() {
        return this.dayNum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getPromotionPrice() {
        return this.promotionPrice;
    }

    @NotNull
    public final GifListJson copy(int catalogId, int buyType, boolean isCanUse, boolean isNew, long expireTime, int dayNum, int payType, int price, int promotionPrice, @NotNull String folderName, @NotNull String folderIcon, @Nullable ThemeConfig themeConfig, @NotNull List<GifConfigJson> item) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        Intrinsics.checkNotNullParameter(folderIcon, "folderIcon");
        Intrinsics.checkNotNullParameter(item, "item");
        return new GifListJson(catalogId, buyType, isCanUse, isNew, expireTime, dayNum, payType, price, promotionPrice, folderName, folderIcon, themeConfig, item);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GifListJson)) {
            return false;
        }
        GifListJson gifListJson = (GifListJson) other;
        return this.catalogId == gifListJson.catalogId && this.buyType == gifListJson.buyType && this.isCanUse == gifListJson.isCanUse && this.isNew == gifListJson.isNew && this.expireTime == gifListJson.expireTime && this.dayNum == gifListJson.dayNum && this.payType == gifListJson.payType && this.price == gifListJson.price && this.promotionPrice == gifListJson.promotionPrice && Intrinsics.areEqual(this.folderName, gifListJson.folderName) && Intrinsics.areEqual(this.folderIcon, gifListJson.folderIcon) && Intrinsics.areEqual(this.themeConfig, gifListJson.themeConfig) && Intrinsics.areEqual(this.item, gifListJson.item);
    }

    public final int getBuyType() {
        return this.buyType;
    }

    public final int getCatalogId() {
        return this.catalogId;
    }

    public final int getDayNum() {
        return this.dayNum;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    @NotNull
    public final String getFolderIcon() {
        return this.folderIcon;
    }

    @NotNull
    public final String getFolderName() {
        return this.folderName;
    }

    @NotNull
    public final List<GifConfigJson> getItem() {
        return this.item;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getPromotionPrice() {
        return this.promotionPrice;
    }

    @Nullable
    public final ThemeConfig getThemeConfig() {
        return this.themeConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        int i = ((this.catalogId * 31) + this.buyType) * 31;
        boolean z = this.isCanUse;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        boolean z2 = this.isNew;
        ?? r2 = z2 ? 1 : z2;
        long j = this.expireTime;
        int iOooO00o = o0OO00O.OooO00o(this.folderIcon, o0OO00O.OooO00o(this.folderName, (((((((((((i2 + r2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.dayNum) * 31) + this.payType) * 31) + this.price) * 31) + this.promotionPrice) * 31, 31), 31);
        ThemeConfig themeConfig = this.themeConfig;
        return this.item.hashCode() + ((iOooO00o + (themeConfig == null ? 0 : themeConfig.hashCode())) * 31);
    }

    public final boolean isCanUse() {
        return this.isCanUse;
    }

    public final boolean isNew() {
        return this.isNew;
    }

    public final void setBuyType(int i) {
        this.buyType = i;
    }

    public final void setCanUse(boolean z) {
        this.isCanUse = z;
    }

    public final void setDayNum(int i) {
        this.dayNum = i;
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setThemeConfig(@Nullable ThemeConfig themeConfig) {
        this.themeConfig = themeConfig;
    }

    @NotNull
    public String toString() {
        int i = this.catalogId;
        int i2 = this.buyType;
        boolean z = this.isCanUse;
        boolean z2 = this.isNew;
        long j = this.expireTime;
        int i3 = this.dayNum;
        int i4 = this.payType;
        int i5 = this.price;
        int i6 = this.promotionPrice;
        String str = this.folderName;
        String str2 = this.folderIcon;
        ThemeConfig themeConfig = this.themeConfig;
        List<GifConfigJson> list = this.item;
        StringBuilder sbOooO00o = o00000.OooO00o("GifListJson(catalogId=", i, ", buyType=", i2, ", isCanUse=");
        sbOooO00o.append(z);
        sbOooO00o.append(", isNew=");
        sbOooO00o.append(z2);
        sbOooO00o.append(", expireTime=");
        sbOooO00o.append(j);
        sbOooO00o.append(", dayNum=");
        sbOooO00o.append(i3);
        sbOooO00o.append(", payType=");
        sbOooO00o.append(i4);
        sbOooO00o.append(", price=");
        sbOooO00o.append(i5);
        sbOooO00o.append(", promotionPrice=");
        sbOooO00o.append(i6);
        sbOooO00o.append(", folderName=");
        sbOooO00o.append(str);
        sbOooO00o.append(", folderIcon=");
        sbOooO00o.append(str2);
        sbOooO00o.append(", themeConfig=");
        sbOooO00o.append(themeConfig);
        sbOooO00o.append(", item=");
        sbOooO00o.append(list);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }

    public /* synthetic */ GifListJson(int i, int i2, boolean z, boolean z2, long j, int i3, int i4, int i5, int i6, String str, String str2, ThemeConfig themeConfig, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, z, z2, j, i3, i4, i5, i6, str, str2, (i7 & 2048) != 0 ? null : themeConfig, list);
    }
}
