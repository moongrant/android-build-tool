package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p431o0OoOOOO.o00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/model/PremiumShopModel;", "", "()V", "data", "", "Lcom/yalla/yalla/model/PremiumShopModel$PremiumInfo;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "dataBan", "Lcom/yalla/yalla/model/RechargeBanType;", "getDataBan", "setDataBan", "isRoom", "", "()Z", "setRoom", "(Z)V", "paytype", "", "getPaytype", "()I", "setPaytype", "(I)V", "ChannelSKU", "PremiumInfo", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PremiumShopModel {
    public static final int $stable = 8;
    private boolean isRoom;
    private int paytype = 1;

    @NotNull
    private List<PremiumInfo> data = new ArrayList();

    @SerializedName("data1")
    @NotNull
    private List<RechargeBanType> dataBan = new ArrayList();

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\n¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/PremiumShopModel$ChannelSKU;", "Ljava/io/Serializable;", "()V", "amount", "", "getAmount", "()D", "discountprice", "", "getDiscountprice", "()Ljava/lang/String;", "picurl", "getPicurl", "price", "", "getPrice", "()I", "promotionprice", "getPromotionprice", "renew", "getRenew", "returnMoney", "getReturnMoney", "shopid", "getShopid", "sku", "getSku", "timelong", "getTimelong", "unit", "getUnit", "waresname", "getWaresname", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ChannelSKU implements Serializable {
        public static final int $stable = 0;
        private final double amount;
        private final int price;
        private final int promotionprice;
        private final int renew;
        private final int returnMoney;
        private final int timelong;

        @NotNull
        private final String discountprice = "";

        @NotNull
        private final String picurl = "";

        @NotNull
        private final String shopid = "";

        @NotNull
        private final String sku = "";

        @NotNull
        private final String unit = "";

        @NotNull
        private final String waresname = "";

        public final double getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getDiscountprice() {
            return this.discountprice;
        }

        @NotNull
        public final String getPicurl() {
            return this.picurl;
        }

        public final int getPrice() {
            return this.price;
        }

        public final int getPromotionprice() {
            return this.promotionprice;
        }

        public final int getRenew() {
            return this.renew;
        }

        public final int getReturnMoney() {
            return this.returnMoney;
        }

        @NotNull
        public final String getShopid() {
            return this.shopid;
        }

        @NotNull
        public final String getSku() {
            return this.sku;
        }

        public final int getTimelong() {
            return this.timelong;
        }

        @NotNull
        public final String getUnit() {
            return this.unit;
        }

        @NotNull
        public final String getWaresname() {
            return this.waresname;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bF\u0010GR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006R\u001a\u0010!\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\rR\u001a\u0010%\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b%\u0010\u0004\u001a\u0004\b&\u0010\u0006R\u001a\u0010'\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\rR\u001a\u0010)\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b)\u0010\u000b\u001a\u0004\b*\u0010\rR\"\u0010+\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u0004\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\b¨\u0006H"}, d2 = {"Lcom/yalla/yalla/model/PremiumShopModel$PremiumInfo;", "Ljava/io/Serializable;", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "", "amount", "D", "getAmount", "()D", "discountprice", "getDiscountprice", "picurl", "getPicurl", "price", "getPrice", "promotionprice", "getPromotionprice", "renew", "getRenew", "returnMoney", "getReturnMoney", "shopid", "getShopid", "sku", "getSku", "timelong", "getTimelong", "unit", "getUnit", "waresname", "getWaresname", "vipName", "getVipName", "setVipName", "Lcom/yalla/yalla/model/PremiumLevel;", "vipLevel", "Lcom/yalla/yalla/model/PremiumLevel;", "getVipLevel", "()Lcom/yalla/yalla/model/PremiumLevel;", "setVipLevel", "(Lcom/yalla/yalla/model/PremiumLevel;)V", "Lo0OoOOOO/o00OO;", "googlePaySkuDetail", "Lo0OoOOOO/o00OO;", "getGooglePaySkuDetail", "()Lo0OoOOOO/o00OO;", "setGooglePaySkuDetail", "(Lo0OoOOOO/o00OO;)V", "Lcom/yalla/yalla/model/PremiumShopModel$ChannelSKU;", "channelSKU", "Lcom/yalla/yalla/model/PremiumShopModel$ChannelSKU;", "getChannelSKU", "()Lcom/yalla/yalla/model/PremiumShopModel$ChannelSKU;", "setChannelSKU", "(Lcom/yalla/yalla/model/PremiumShopModel$ChannelSKU;)V", "positionLocal", "getPositionLocal", "setPositionLocal", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public static final class PremiumInfo implements Serializable {
        public static final int $stable = 8;
        private final double amount;

        @Nullable
        private ChannelSKU channelSKU;

        @Nullable
        private transient o00OO googlePaySkuDetail;
        private final int price;
        private final int promotionprice;
        private final int renew;
        private final int returnMoney;
        private final int timelong;
        private int index = -1;

        @NotNull
        private String name = "";

        @NotNull
        private final String discountprice = "";

        @NotNull
        private final String picurl = "";

        @NotNull
        private final String shopid = "";

        @NotNull
        private final String sku = "";

        @NotNull
        private final String unit = "";

        @NotNull
        private final String waresname = "";

        @NotNull
        private String vipName = "";

        @NotNull
        private PremiumLevel vipLevel = PremiumLevel.Premium1;
        private int positionLocal = -1;

        public final double getAmount() {
            return this.amount;
        }

        @Nullable
        public final ChannelSKU getChannelSKU() {
            return this.channelSKU;
        }

        @NotNull
        public final String getDiscountprice() {
            return this.discountprice;
        }

        @Nullable
        public final o00OO getGooglePaySkuDetail() {
            return this.googlePaySkuDetail;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPicurl() {
            return this.picurl;
        }

        public final int getPositionLocal() {
            return this.positionLocal;
        }

        public final int getPrice() {
            return this.price;
        }

        public final int getPromotionprice() {
            return this.promotionprice;
        }

        public final int getRenew() {
            return this.renew;
        }

        public final int getReturnMoney() {
            return this.returnMoney;
        }

        @NotNull
        public final String getShopid() {
            return this.shopid;
        }

        @NotNull
        public final String getSku() {
            return this.sku;
        }

        public final int getTimelong() {
            return this.timelong;
        }

        @NotNull
        public final String getUnit() {
            return this.unit;
        }

        @NotNull
        public final PremiumLevel getVipLevel() {
            return this.vipLevel;
        }

        @NotNull
        public final String getVipName() {
            return this.vipName;
        }

        @NotNull
        public final String getWaresname() {
            return this.waresname;
        }

        public final void setChannelSKU(@Nullable ChannelSKU channelSKU) {
            this.channelSKU = channelSKU;
        }

        public final void setGooglePaySkuDetail(@Nullable o00OO o00oo2) {
            this.googlePaySkuDetail = o00oo2;
        }

        public final void setIndex(int i) {
            this.index = i;
        }

        public final void setName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.name = str;
        }

        public final void setPositionLocal(int i) {
            this.positionLocal = i;
        }

        public final void setVipLevel(@NotNull PremiumLevel premiumLevel) {
            Intrinsics.checkNotNullParameter(premiumLevel, "<set-?>");
            this.vipLevel = premiumLevel;
        }

        public final void setVipName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.vipName = str;
        }
    }

    @NotNull
    public final List<PremiumInfo> getData() {
        return this.data;
    }

    @NotNull
    public final List<RechargeBanType> getDataBan() {
        return this.dataBan;
    }

    public final int getPaytype() {
        return this.paytype;
    }

    /* JADX INFO: renamed from: isRoom, reason: from getter */
    public final boolean getIsRoom() {
        return this.isRoom;
    }

    public final void setData(@NotNull List<PremiumInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setDataBan(@NotNull List<RechargeBanType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataBan = list;
    }

    public final void setPaytype(int i) {
        this.paytype = i;
    }

    public final void setRoom(boolean z) {
        this.isRoom = z;
    }
}
