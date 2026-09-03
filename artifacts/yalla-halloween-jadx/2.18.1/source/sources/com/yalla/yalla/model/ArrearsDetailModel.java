package com.yalla.yalla.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/model/ArrearsDetailModel;", "", "()V", "coinNum", "", "getCoinNum", "()I", "setCoinNum", "(I)V", "purchaseStamp", "", "getPurchaseStamp", "()J", "setPurchaseStamp", "(J)V", "refundStamp", "getRefundStamp", "setRefundStamp", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ArrearsDetailModel {
    public static final int $stable = 8;
    private int coinNum;
    private long purchaseStamp;
    private long refundStamp;

    public final int getCoinNum() {
        return this.coinNum;
    }

    public final long getPurchaseStamp() {
        return this.purchaseStamp;
    }

    public final long getRefundStamp() {
        return this.refundStamp;
    }

    public final void setCoinNum(int i) {
        this.coinNum = i;
    }

    public final void setPurchaseStamp(long j) {
        this.purchaseStamp = j;
    }

    public final void setRefundStamp(long j) {
        this.refundStamp = j;
    }
}
