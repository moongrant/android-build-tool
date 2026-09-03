package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, d2 = {"Lcom/yalla/yalla/model/CustomizeThemeModel;", "", "()V", "currState", "", "getCurrState", "()I", "setCurrState", "(I)V", "dayNum", "getDayNum", "setDayNum", "froznday", "getFroznday", "setFroznday", "id", "", "getId", "()J", "setId", "(J)V", "invalidDay", "getInvalidDay", "setInvalidDay", "isExpired", "", "()Z", "setExpired", "(Z)V", "isFrozen", "setFrozen", "isSelected", "setSelected", "pic", "", "getPic", "()Ljava/lang/String;", "setPic", "(Ljava/lang/String;)V", "renewPrice", "getRenewPrice", "setRenewPrice", "themeType", "getThemeType", "setThemeType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CustomizeThemeModel {
    public static final int $stable = 8;
    private int currState;

    @SerializedName("daynum")
    private int dayNum;

    @SerializedName("froznDay")
    private int froznday;
    private long id;
    private int invalidDay;
    private boolean isExpired;
    private boolean isFrozen;
    private boolean isSelected;

    @NotNull
    private String pic = "";
    private int renewPrice;
    private int themeType;

    public final int getCurrState() {
        return this.currState;
    }

    public final int getDayNum() {
        return this.dayNum;
    }

    public final int getFroznday() {
        return this.froznday;
    }

    public final long getId() {
        return this.id;
    }

    public final int getInvalidDay() {
        return this.invalidDay;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    public final int getRenewPrice() {
        return this.renewPrice;
    }

    public final int getThemeType() {
        return this.themeType;
    }

    /* JADX INFO: renamed from: isExpired, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    /* JADX INFO: renamed from: isFrozen, reason: from getter */
    public final boolean getIsFrozen() {
        return this.isFrozen;
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setCurrState(int i) {
        this.currState = i;
    }

    public final void setDayNum(int i) {
        this.dayNum = i;
    }

    public final void setExpired(boolean z) {
        this.isExpired = z;
    }

    public final void setFrozen(boolean z) {
        this.isFrozen = z;
    }

    public final void setFroznday(int i) {
        this.froznday = i;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setInvalidDay(int i) {
        this.invalidDay = i;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public final void setRenewPrice(int i) {
        this.renewPrice = i;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final void setThemeType(int i) {
        this.themeType = i;
    }
}
