package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016R \u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Lcom/yalla/yalla/model/RechargeMenuConfirmOrderResultModel;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/Double;", "setAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "balance", "", "getBalance", "()Ljava/lang/Long;", "setBalance", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "dayNum", "", "getDayNum", "()Ljava/lang/Integer;", "setDayNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "nVIPLv", "getNVIPLv", "setNVIPLv", "state", "getState", "setState", "time", "", "getTime", "()Ljava/lang/String;", "setTime", "(Ljava/lang/String;)V", "viplevel", "getViplevel", "setViplevel", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RechargeMenuConfirmOrderResultModel {
    public static final int $stable = 8;

    @Nullable
    private Long balance = 0L;

    @Nullable
    private Integer state = 0;

    @SerializedName("dayNum")
    @Nullable
    private Integer dayNum = 0;

    @SerializedName("amount")
    @Nullable
    private Double amount = Double.valueOf(0.0d);

    @SerializedName("time")
    @Nullable
    private String time = "";

    @SerializedName("nVIPLv")
    @Nullable
    private Integer nVIPLv = 0;

    @SerializedName("viplevel")
    @Nullable
    private Integer viplevel = 0;

    @Nullable
    public final Double getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getBalance() {
        return this.balance;
    }

    @Nullable
    public final Integer getDayNum() {
        return this.dayNum;
    }

    @Nullable
    public final Integer getNVIPLv() {
        return this.nVIPLv;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final Integer getViplevel() {
        return this.viplevel;
    }

    public final void setAmount(@Nullable Double d) {
        this.amount = d;
    }

    public final void setBalance(@Nullable Long l) {
        this.balance = l;
    }

    public final void setDayNum(@Nullable Integer num) {
        this.dayNum = num;
    }

    public final void setNVIPLv(@Nullable Integer num) {
        this.nVIPLv = num;
    }

    public final void setState(@Nullable Integer num) {
        this.state = num;
    }

    public final void setTime(@Nullable String str) {
        this.time = str;
    }

    public final void setViplevel(@Nullable Integer num) {
        this.viplevel = num;
    }
}
