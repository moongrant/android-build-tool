package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/PayssionOrderState;", "", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "balance", "", "getBalance", "()J", "setBalance", "(J)V", "coinnum", "getCoinnum", "setCoinnum", "state", "", "getState", "()I", "setState", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PayssionOrderState {
    public static final int $stable = 8;

    @NotNull
    private String amount = "";
    private long balance;
    private long coinnum;
    private int state;

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    public final long getBalance() {
        return this.balance;
    }

    public final long getCoinnum() {
        return this.coinnum;
    }

    public final int getState() {
        return this.state;
    }

    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amount = str;
    }

    public final void setBalance(long j) {
        this.balance = j;
    }

    public final void setCoinnum(long j) {
        this.coinnum = j;
    }

    public final void setState(int i) {
        this.state = i;
    }
}
