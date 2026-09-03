package com.yalla.yalla.model.room;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/room/LockShopModel;", "", "()V", "data", "", "Lcom/yalla/yalla/model/room/LockShopModel$LockShopModelItem;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "isRoom", "", "()Z", "setRoom", "(Z)V", "payType", "", "getPayType", "()I", "setPayType", "(I)V", "LockShopModelItem", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LockShopModel {
    public static final int $stable = 8;

    @SerializedName("data")
    @NotNull
    private List<LockShopModelItem> data = new ArrayList();

    @SerializedName("isRoom")
    private boolean isRoom;

    @SerializedName("paytype")
    private int payType;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001e\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\b¨\u00063"}, d2 = {"Lcom/yalla/yalla/model/room/LockShopModel$LockShopModelItem;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "discountPrice", "", "getDiscountPrice", "()J", "setDiscountPrice", "(J)V", "picUrl", "getPicUrl", "setPicUrl", "price", "", "getPrice", "()D", "setPrice", "(D)V", "promotionPrice", "getPromotionPrice", "setPromotionPrice", "renew", "", "getRenew", "()I", "setRenew", "(I)V", "returnMoney", "getReturnMoney", "setReturnMoney", "shopId", "getShopId", "setShopId", "sku", "getSku", "setSku", "timeLong", "getTimeLong", "setTimeLong", "unit", "getUnit", "setUnit", "waresname", "getWaresname", "setWaresname", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LockShopModelItem {
        public static final int $stable = 8;

        @SerializedName("discountprice")
        private long discountPrice;

        @SerializedName("price")
        private double price;

        @SerializedName("promotionprice")
        private long promotionPrice;

        @SerializedName("renew")
        private int renew;

        @SerializedName("shopid")
        private long shopId;

        @SerializedName("timelong")
        private long timeLong;

        @SerializedName("waresname")
        @NotNull
        private String waresname = "";

        @SerializedName("picurl")
        @NotNull
        private String picUrl = "";

        @SerializedName("unit")
        @NotNull
        private String unit = "";

        @SerializedName("sku")
        @NotNull
        private String sku = "";

        @SerializedName("amount")
        @NotNull
        private String amount = "";

        @SerializedName("returnMoney")
        @NotNull
        private String returnMoney = "";

        @NotNull
        public final String getAmount() {
            return this.amount;
        }

        public final long getDiscountPrice() {
            return this.discountPrice;
        }

        @NotNull
        public final String getPicUrl() {
            return this.picUrl;
        }

        public final double getPrice() {
            return this.price;
        }

        public final long getPromotionPrice() {
            return this.promotionPrice;
        }

        public final int getRenew() {
            return this.renew;
        }

        @NotNull
        public final String getReturnMoney() {
            return this.returnMoney;
        }

        public final long getShopId() {
            return this.shopId;
        }

        @NotNull
        public final String getSku() {
            return this.sku;
        }

        public final long getTimeLong() {
            return this.timeLong;
        }

        @NotNull
        public final String getUnit() {
            return this.unit;
        }

        @NotNull
        public final String getWaresname() {
            return this.waresname;
        }

        public final void setAmount(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.amount = str;
        }

        public final void setDiscountPrice(long j) {
            this.discountPrice = j;
        }

        public final void setPicUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.picUrl = str;
        }

        public final void setPrice(double d) {
            this.price = d;
        }

        public final void setPromotionPrice(long j) {
            this.promotionPrice = j;
        }

        public final void setRenew(int i) {
            this.renew = i;
        }

        public final void setReturnMoney(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.returnMoney = str;
        }

        public final void setShopId(long j) {
            this.shopId = j;
        }

        public final void setSku(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.sku = str;
        }

        public final void setTimeLong(long j) {
            this.timeLong = j;
        }

        public final void setUnit(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.unit = str;
        }

        public final void setWaresname(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.waresname = str;
        }
    }

    @NotNull
    public final List<LockShopModelItem> getData() {
        return this.data;
    }

    public final int getPayType() {
        return this.payType;
    }

    /* JADX INFO: renamed from: isRoom, reason: from getter */
    public final boolean getIsRoom() {
        return this.isRoom;
    }

    public final void setData(@NotNull List<LockShopModelItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setPayType(int i) {
        this.payType = i;
    }

    public final void setRoom(boolean z) {
        this.isRoom = z;
    }
}
