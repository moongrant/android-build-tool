package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/model/VipPrivilegeModel;", "", "()V", "data", "", "Lcom/yalla/yalla/model/VipPrivilegeInfo;", "getData", "()Ljava/util/List;", "sumcount", "", "getSumcount", "()I", "vipcount", "getVipcount", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VipPrivilegeModel {
    public static final int $stable = 8;

    @NotNull
    private final List<VipPrivilegeInfo> data = new ArrayList();
    private final int sumcount;
    private final int vipcount;

    @NotNull
    public final List<VipPrivilegeInfo> getData() {
        return this.data;
    }

    public final int getSumcount() {
        return this.sumcount;
    }

    public final int getVipcount() {
        return this.vipcount;
    }
}
