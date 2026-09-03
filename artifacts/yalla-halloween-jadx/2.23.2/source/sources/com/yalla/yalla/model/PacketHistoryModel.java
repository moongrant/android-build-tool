package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/PacketHistoryModel;", "", "()V", "amountsum", "", "getAmountsum", "()I", "bestlucksum", "getBestlucksum", "data", "", "Lcom/yalla/yalla/model/PacketHistoryItemModel;", "getData", "()Ljava/util/List;", "headhrl", "", "getHeadhrl", "()Ljava/lang/String;", "nickname", "getNickname", "redsum", "getRedsum", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PacketHistoryModel {
    public static final int $stable = 8;
    private final int amountsum;
    private final int bestlucksum;
    private final int redsum;

    @NotNull
    private final String nickname = "";

    @NotNull
    private final String headhrl = "";

    @NotNull
    private final List<PacketHistoryItemModel> data = CollectionsKt.emptyList();

    public final int getAmountsum() {
        return this.amountsum;
    }

    public final int getBestlucksum() {
        return this.bestlucksum;
    }

    @NotNull
    public final List<PacketHistoryItemModel> getData() {
        return this.data;
    }

    @NotNull
    public final String getHeadhrl() {
        return this.headhrl;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final int getRedsum() {
        return this.redsum;
    }
}
