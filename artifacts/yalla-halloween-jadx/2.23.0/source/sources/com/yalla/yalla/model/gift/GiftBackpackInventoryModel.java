package com.yalla.yalla.model.gift;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/gift/GiftBackpackInventoryModel;", "Ljava/io/Serializable;", "()V", "backpackInfo", "Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;", "getBackpackInfo", "()Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;", "setBackpackInfo", "(Lcom/yalla/yalla/model/gift/GiftBackpackInfoModel;)V", "propInventory", "", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "getPropInventory", "()Ljava/util/List;", "setPropInventory", "(Ljava/util/List;)V", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GiftBackpackInventoryModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("backpackInfo")
    @Nullable
    private GiftBackpackInfoModel backpackInfo;

    @SerializedName("propInventory")
    @NotNull
    private List<GiftPropModel> propInventory = new ArrayList();

    @Nullable
    public final GiftBackpackInfoModel getBackpackInfo() {
        return this.backpackInfo;
    }

    @NotNull
    public final List<GiftPropModel> getPropInventory() {
        return this.propInventory;
    }

    public final void setBackpackInfo(@Nullable GiftBackpackInfoModel giftBackpackInfoModel) {
        this.backpackInfo = giftBackpackInfoModel;
    }

    public final void setPropInventory(@NotNull List<GiftPropModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.propInventory = list;
    }

    @NotNull
    public String toString() {
        return OooOO0.OooO00o(this);
    }
}
