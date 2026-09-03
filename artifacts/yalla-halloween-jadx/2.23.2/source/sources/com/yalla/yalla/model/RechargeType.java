package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yalla/yalla/model/RechargeType;", "", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "logo", "getLogo", "setLogo", "name", "getName", "setName", "payurl", "getPayurl", "setPayurl", "pm_id", "getPm_id", "setPm_id", "shoplist", "", "Lcom/yalla/yalla/model/RechargeCommodity;", "getShoplist", "()Ljava/util/List;", "setShoplist", "(Ljava/util/List;)V", "type", "", "getType", "()I", "setType", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RechargeType {
    public static final int $stable = 8;
    private int type;

    @NotNull
    private String id = "";

    @NotNull
    private String pm_id = "";

    @NotNull
    private String name = "";

    @NotNull
    private String logo = "";

    @NotNull
    private String payurl = "";

    @NotNull
    private List<RechargeCommodity> shoplist = new ArrayList();

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPayurl() {
        return this.payurl;
    }

    @NotNull
    public final String getPm_id() {
        return this.pm_id;
    }

    @NotNull
    public final List<RechargeCommodity> getShoplist() {
        return this.shoplist;
    }

    public final int getType() {
        return this.type;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setLogo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.logo = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setPayurl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.payurl = str;
    }

    public final void setPm_id(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pm_id = str;
    }

    public final void setShoplist(@NotNull List<RechargeCommodity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.shoplist = list;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
