package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\b¨\u00063"}, d2 = {"Lcom/yalla/yalla/model/BadgeDataModel;", "Ljava/io/Serializable;", "()V", "currentvalue", "", "getCurrentvalue", "()I", "setCurrentvalue", "(I)V", "medalId", "getMedalId", "setMedalId", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "progress", "getProgress", "setProgress", "ranking", "getRanking", "setRanking", "remark", "getRemark", "setRemark", "remark1", "getRemark1", "setRemark1", "setTime", "", "getSetTime", "()J", "setSetTime", "(J)V", "sort", "getSort", "setSort", "stars", "Lcom/yalla/yalla/model/StarsModel;", "getStars", "()Lcom/yalla/yalla/model/StarsModel;", "setStars", "(Lcom/yalla/yalla/model/StarsModel;)V", "state", "getState", "setState", "type", "getType", "setType", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BadgeDataModel implements Serializable {
    public static final int $stable = 8;
    private int currentvalue;

    @SerializedName("medalid")
    private int medalId;
    private int ranking;
    private long setTime;
    private int sort;

    @Nullable
    private StarsModel stars;
    private int state;
    private int type;

    @NotNull
    private String progress = "";

    @NotNull
    private String name = "";

    @NotNull
    private String remark = "";

    @NotNull
    private String remark1 = "";

    public final int getCurrentvalue() {
        return this.currentvalue;
    }

    public final int getMedalId() {
        return this.medalId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getProgress() {
        return this.progress;
    }

    public final int getRanking() {
        return this.ranking;
    }

    @NotNull
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final String getRemark1() {
        return this.remark1;
    }

    public final long getSetTime() {
        return this.setTime;
    }

    public final int getSort() {
        return this.sort;
    }

    @Nullable
    public final StarsModel getStars() {
        return this.stars;
    }

    public final int getState() {
        return this.state;
    }

    public final int getType() {
        return this.type;
    }

    public final void setCurrentvalue(int i) {
        this.currentvalue = i;
    }

    public final void setMedalId(int i) {
        this.medalId = i;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setProgress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.progress = str;
    }

    public final void setRanking(int i) {
        this.ranking = i;
    }

    public final void setRemark(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark = str;
    }

    public final void setRemark1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.remark1 = str;
    }

    public final void setSetTime(long j) {
        this.setTime = j;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final void setStars(@Nullable StarsModel starsModel) {
        this.stars = starsModel;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
