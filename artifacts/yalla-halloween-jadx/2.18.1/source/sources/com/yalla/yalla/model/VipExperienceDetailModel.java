package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/VipExperienceDetailModel;", "", "()V", "experienceType", "", "getExperienceType", "()I", "setExperienceType", "(I)V", "experienceValue", "getExperienceValue", "setExperienceValue", "tradeTimeStamp", "", "getTradeTimeStamp", "()J", "setTradeTimeStamp", "(J)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VipExperienceDetailModel {
    public static final int $stable = 8;

    @SerializedName("expeType")
    private int experienceType;

    @SerializedName("expeVal")
    private int experienceValue;
    private long tradeTimeStamp;

    public final int getExperienceType() {
        return this.experienceType;
    }

    public final int getExperienceValue() {
        return this.experienceValue;
    }

    public final long getTradeTimeStamp() {
        return this.tradeTimeStamp;
    }

    public final void setExperienceType(int i) {
        this.experienceType = i;
    }

    public final void setExperienceValue(int i) {
        this.experienceValue = i;
    }

    public final void setTradeTimeStamp(long j) {
        this.tradeTimeStamp = j;
    }
}
