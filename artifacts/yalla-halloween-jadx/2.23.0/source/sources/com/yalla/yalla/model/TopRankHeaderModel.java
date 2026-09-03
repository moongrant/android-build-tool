package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.bean.AbsJavaBeanApi;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/TopRankHeaderModel;", "Lcom/yalla/yalla/model/bean/AbsJavaBeanApi;", "", "()V", "barSendData", "", "Lcom/yalla/yalla/model/RankModel2;", "getBarSendData", "()Ljava/util/List;", "setBarSendData", "(Ljava/util/List;)V", "perGetData", "getPerGetData", "setPerGetData", "perSendData", "getPerSendData", "setPerSendData", "totalRankData", "getTotalRankData", "setTotalRankData", "getPosition", "position", "", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopRankHeaderModel extends AbsJavaBeanApi<Object> {
    public static final int $stable = 8;

    @Nullable
    private List<? extends RankModel2> barSendData;

    @Nullable
    private List<? extends RankModel2> perGetData;

    @Nullable
    private List<? extends RankModel2> perSendData;

    @Nullable
    private List<? extends RankModel2> totalRankData;

    @Nullable
    public final List<RankModel2> getBarSendData() {
        return this.barSendData;
    }

    @Nullable
    public final List<RankModel2> getPerGetData() {
        return this.perGetData;
    }

    @Nullable
    public final List<RankModel2> getPerSendData() {
        return this.perSendData;
    }

    @Nullable
    public final List<RankModel2> getPosition(int position) {
        if (position == 0) {
            return this.barSendData;
        }
        if (position == 1) {
            return this.perSendData;
        }
        if (position == 2) {
            return this.perGetData;
        }
        if (position != 3) {
            return null;
        }
        return this.totalRankData;
    }

    @Nullable
    public final List<RankModel2> getTotalRankData() {
        return this.totalRankData;
    }

    public final void setBarSendData(@Nullable List<? extends RankModel2> list) {
        this.barSendData = list;
    }

    public final void setPerGetData(@Nullable List<? extends RankModel2> list) {
        this.perGetData = list;
    }

    public final void setPerSendData(@Nullable List<? extends RankModel2> list) {
        this.perSendData = list;
    }

    public final void setTotalRankData(@Nullable List<? extends RankModel2> list) {
        this.totalRankData = list;
    }
}
