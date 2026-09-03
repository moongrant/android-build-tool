package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/StarsModel;", "Ljava/io/Serializable;", "()V", "fourthStars", "", "getFourthStars", "()I", "setFourthStars", "(I)V", "oneStars", "getOneStars", "setOneStars", "threeStars", "getThreeStars", "setThreeStars", "twoStars", "getTwoStars", "setTwoStars", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StarsModel implements Serializable {
    public static final int $stable = 8;

    @SerializedName("fourthStars")
    private int fourthStars;

    @SerializedName("onestars")
    private int oneStars;

    @SerializedName("threestars")
    private int threeStars;

    @SerializedName("twostars")
    private int twoStars;

    public final int getFourthStars() {
        return this.fourthStars;
    }

    public final int getOneStars() {
        return this.oneStars;
    }

    public final int getThreeStars() {
        return this.threeStars;
    }

    public final int getTwoStars() {
        return this.twoStars;
    }

    public final void setFourthStars(int i) {
        this.fourthStars = i;
    }

    public final void setOneStars(int i) {
        this.oneStars = i;
    }

    public final void setThreeStars(int i) {
        this.threeStars = i;
    }

    public final void setTwoStars(int i) {
        this.twoStars = i;
    }
}
