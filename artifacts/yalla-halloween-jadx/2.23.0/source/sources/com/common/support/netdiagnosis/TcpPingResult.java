package com.common.support.netdiagnosis;

import androidx.compose.foundation.layout.OooO0O0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/common/support/netdiagnosis/TcpPingResult;", "", "resultMsg", "", "averageSpendTime", "", "(Ljava/lang/String;I)V", "getAverageSpendTime", "()I", "getResultMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class TcpPingResult {
    private final int averageSpendTime;

    @NotNull
    private final String resultMsg;

    public TcpPingResult(@NotNull String resultMsg, int i) {
        Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
        this.resultMsg = resultMsg;
        this.averageSpendTime = i;
    }

    public static /* synthetic */ TcpPingResult copy$default(TcpPingResult tcpPingResult, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tcpPingResult.resultMsg;
        }
        if ((i2 & 2) != 0) {
            i = tcpPingResult.averageSpendTime;
        }
        return tcpPingResult.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResultMsg() {
        return this.resultMsg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAverageSpendTime() {
        return this.averageSpendTime;
    }

    @NotNull
    public final TcpPingResult copy(@NotNull String resultMsg, int averageSpendTime) {
        Intrinsics.checkNotNullParameter(resultMsg, "resultMsg");
        return new TcpPingResult(resultMsg, averageSpendTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TcpPingResult)) {
            return false;
        }
        TcpPingResult tcpPingResult = (TcpPingResult) other;
        return Intrinsics.areEqual(this.resultMsg, tcpPingResult.resultMsg) && this.averageSpendTime == tcpPingResult.averageSpendTime;
    }

    public final int getAverageSpendTime() {
        return this.averageSpendTime;
    }

    @NotNull
    public final String getResultMsg() {
        return this.resultMsg;
    }

    public int hashCode() {
        return (this.resultMsg.hashCode() * 31) + this.averageSpendTime;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TcpPingResult(resultMsg=");
        sb.append(this.resultMsg);
        sb.append(", averageSpendTime=");
        return OooO0O0.OooO00o(sb, this.averageSpendTime, ')');
    }
}
