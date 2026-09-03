package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/VipBuyResultModel;", "", "daynum", "", "paytype", "", "balance", "", "(Ljava/lang/String;IJ)V", "getBalance", "()J", "getDaynum", "()Ljava/lang/String;", "getPaytype", "()I", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VipBuyResultModel {
    public static final int $stable = 0;
    private final long balance;

    @NotNull
    private final String daynum;
    private final int paytype;

    public VipBuyResultModel(@NotNull String daynum, int i, long j) {
        Intrinsics.checkNotNullParameter(daynum, "daynum");
        this.daynum = daynum;
        this.paytype = i;
        this.balance = j;
    }

    public final long getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getDaynum() {
        return this.daynum;
    }

    public final int getPaytype() {
        return this.paytype;
    }
}
