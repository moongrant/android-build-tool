package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/GuessData;", "", "selfData", "Lcom/yalla/yalla/model/GuessUserData;", "rankData", "", "(Lcom/yalla/yalla/model/GuessUserData;Ljava/util/List;)V", "getRankData", "()Ljava/util/List;", "setRankData", "(Ljava/util/List;)V", "getSelfData", "()Lcom/yalla/yalla/model/GuessUserData;", "setSelfData", "(Lcom/yalla/yalla/model/GuessUserData;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class GuessData {
    public static final int $stable = 8;

    @Nullable
    private List<GuessUserData> rankData;

    @Nullable
    private GuessUserData selfData;

    /* JADX WARN: Multi-variable type inference failed */
    public GuessData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GuessData copy$default(GuessData guessData, GuessUserData guessUserData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            guessUserData = guessData.selfData;
        }
        if ((i & 2) != 0) {
            list = guessData.rankData;
        }
        return guessData.copy(guessUserData, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GuessUserData getSelfData() {
        return this.selfData;
    }

    @Nullable
    public final List<GuessUserData> component2() {
        return this.rankData;
    }

    @NotNull
    public final GuessData copy(@Nullable GuessUserData selfData, @Nullable List<GuessUserData> rankData) {
        return new GuessData(selfData, rankData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuessData)) {
            return false;
        }
        GuessData guessData = (GuessData) other;
        return Intrinsics.areEqual(this.selfData, guessData.selfData) && Intrinsics.areEqual(this.rankData, guessData.rankData);
    }

    @Nullable
    public final List<GuessUserData> getRankData() {
        return this.rankData;
    }

    @Nullable
    public final GuessUserData getSelfData() {
        return this.selfData;
    }

    public int hashCode() {
        GuessUserData guessUserData = this.selfData;
        int iHashCode = (guessUserData == null ? 0 : guessUserData.hashCode()) * 31;
        List<GuessUserData> list = this.rankData;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setRankData(@Nullable List<GuessUserData> list) {
        this.rankData = list;
    }

    public final void setSelfData(@Nullable GuessUserData guessUserData) {
        this.selfData = guessUserData;
    }

    @NotNull
    public String toString() {
        return "GuessData(selfData=" + this.selfData + ", rankData=" + this.rankData + ")";
    }

    public GuessData(@Nullable GuessUserData guessUserData, @Nullable List<GuessUserData> list) {
        this.selfData = guessUserData;
        this.rankData = list;
    }

    public /* synthetic */ GuessData(GuessUserData guessUserData, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : guessUserData, (i & 2) != 0 ? null : list);
    }
}
