package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/model/BadgeModel;", "Ljava/io/Serializable;", "()V", "data", "", "Lcom/yalla/yalla/model/BadgeDataModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "honordata", "getHonordata", "setHonordata", "openDiamondMedal", "", "getOpenDiamondMedal", "()Ljava/lang/Boolean;", "setOpenDiamondMedal", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "rank", "", "getRank", "()I", "setRank", "(I)V", "sumstars", "getSumstars", "setSumstars", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BadgeModel implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private List<BadgeDataModel> data;

    @Nullable
    private List<BadgeDataModel> honordata;

    @Nullable
    private Boolean openDiamondMedal = Boolean.FALSE;
    private int rank;
    private int sumstars;

    @Nullable
    public final List<BadgeDataModel> getData() {
        return this.data;
    }

    @Nullable
    public final List<BadgeDataModel> getHonordata() {
        return this.honordata;
    }

    @Nullable
    public final Boolean getOpenDiamondMedal() {
        return this.openDiamondMedal;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getSumstars() {
        return this.sumstars;
    }

    public final void setData(@Nullable List<BadgeDataModel> list) {
        this.data = list;
    }

    public final void setHonordata(@Nullable List<BadgeDataModel> list) {
        this.honordata = list;
    }

    public final void setOpenDiamondMedal(@Nullable Boolean bool) {
        this.openDiamondMedal = bool;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setSumstars(int i) {
        this.sumstars = i;
    }
}
