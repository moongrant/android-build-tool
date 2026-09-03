package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0014X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/model/PacketHistoryItemModel;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "getnum", "getGetnum", "giftId", "", "getGiftId", "()I", "giftNum", "getGiftNum", "giftUrl", "getGiftUrl", "nickName", "getNickName", "sendtime", "", "getSendtime", "()J", "stime", "getStime", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PacketHistoryItemModel {
    public static final int $stable = 0;
    private final int giftId;
    private final int giftNum;
    private final long sendtime;

    @SerializedName(alternate = {"nickname"}, value = "nickName")
    @NotNull
    private final String nickName = "";

    @NotNull
    private final String stime = "";

    @NotNull
    private final String giftUrl = "";

    @NotNull
    private final String amount = "";

    @NotNull
    private final String getnum = "";

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getGetnum() {
        return this.getnum;
    }

    public final int getGiftId() {
        return this.giftId;
    }

    public final int getGiftNum() {
        return this.giftNum;
    }

    @NotNull
    public final String getGiftUrl() {
        return this.giftUrl;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final long getSendtime() {
        return this.sendtime;
    }

    @NotNull
    public final String getStime() {
        return this.stime;
    }
}
