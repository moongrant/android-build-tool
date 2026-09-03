package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020,R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\u001a\u0010\"\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001a\u0010%\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\b¨\u0006-"}, d2 = {"Lcom/yalla/yalla/model/BadgeRankModel;", "", "()V", "cType", "", "getCType", "()Ljava/lang/String;", "setCType", "(Ljava/lang/String;)V", "copperNum", "", "getCopperNum", "()I", "setCopperNum", "(I)V", "data", "", "Lcom/yalla/yalla/model/BadgeRankDataModel;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "diamondNum", "getDiamondNum", "setDiamondNum", "goldNum", "getGoldNum", "setGoldNum", "openDiamondMedal", "getOpenDiamondMedal", "setOpenDiamondMedal", "rank", "getRank", "setRank", "silverNum", "getSilverNum", "setSilverNum", "sumStars", "getSumStars", "setSumStars", "type", "getType", "setType", "isOpenDiamondMedal", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BadgeRankModel {
    public static final int $stable = 8;
    private int copperNum;

    @Nullable
    private List<BadgeRankDataModel> data;
    private int diamondNum;
    private int goldNum;
    private int openDiamondMedal;
    private int rank;
    private int silverNum;
    private int sumStars;

    @NotNull
    private String type = "";

    @SerializedName("ctype")
    @NotNull
    private String cType = "";

    @NotNull
    public final String getCType() {
        return this.cType;
    }

    public final int getCopperNum() {
        return this.copperNum;
    }

    @Nullable
    public final List<BadgeRankDataModel> getData() {
        return this.data;
    }

    public final int getDiamondNum() {
        return this.diamondNum;
    }

    public final int getGoldNum() {
        return this.goldNum;
    }

    public final int getOpenDiamondMedal() {
        return this.openDiamondMedal;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getSilverNum() {
        return this.silverNum;
    }

    public final int getSumStars() {
        return this.sumStars;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final boolean isOpenDiamondMedal() {
        return this.openDiamondMedal == 1;
    }

    public final void setCType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cType = str;
    }

    public final void setCopperNum(int i) {
        this.copperNum = i;
    }

    public final void setData(@Nullable List<BadgeRankDataModel> list) {
        this.data = list;
    }

    public final void setDiamondNum(int i) {
        this.diamondNum = i;
    }

    public final void setGoldNum(int i) {
        this.goldNum = i;
    }

    public final void setOpenDiamondMedal(int i) {
        this.openDiamondMedal = i;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setSilverNum(int i) {
        this.silverNum = i;
    }

    public final void setSumStars(int i) {
        this.sumStars = i;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
