package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/model/RechargeTypeGoogleModel;", "", "()V", "data", "", "Lcom/yalla/yalla/model/RechargeCommodity;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "data1", "Lcom/yalla/yalla/model/RechargeBanType;", "getData1", "setData1", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RechargeTypeGoogleModel {
    public static final int $stable = 8;

    @NotNull
    private List<RechargeCommodity> data = new ArrayList();

    @NotNull
    private List<RechargeBanType> data1 = new ArrayList();

    @NotNull
    public final List<RechargeCommodity> getData() {
        return this.data;
    }

    @NotNull
    public final List<RechargeBanType> getData1() {
        return this.data1;
    }

    public final void setData(@NotNull List<RechargeCommodity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setData1(@NotNull List<RechargeBanType> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data1 = list;
    }
}
