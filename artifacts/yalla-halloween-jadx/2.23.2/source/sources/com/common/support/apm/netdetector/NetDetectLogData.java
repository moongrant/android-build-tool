package com.common.support.apm.netdetector;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/common/support/apm/netdetector/NetDetectLogData;", "", "deviceNo", "", "iden", "spendTimeMs", "", "domain", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getDeviceNo", "()Ljava/lang/String;", "setDeviceNo", "(Ljava/lang/String;)V", "getDomain", "setDomain", "getIden", "setIden", "getSpendTimeMs", "()J", "setSpendTimeMs", "(J)V", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NetDetectLogData {

    @NotNull
    private String deviceNo;

    @NotNull
    private String domain;

    @NotNull
    private String iden;
    private long spendTimeMs;

    public NetDetectLogData(@NotNull String str, @NotNull String str2, long j, @NotNull String str3) {
        OooO00o.OooO00o(str, "deviceNo", str2, "iden", str3, "domain");
        this.deviceNo = str;
        this.iden = str2;
        this.spendTimeMs = j;
        this.domain = str3;
    }

    @NotNull
    public final String getDeviceNo() {
        return this.deviceNo;
    }

    @NotNull
    public final String getDomain() {
        return this.domain;
    }

    @NotNull
    public final String getIden() {
        return this.iden;
    }

    public final long getSpendTimeMs() {
        return this.spendTimeMs;
    }

    public final void setDeviceNo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceNo = str;
    }

    public final void setDomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.domain = str;
    }

    public final void setIden(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iden = str;
    }

    public final void setSpendTimeMs(long j) {
        this.spendTimeMs = j;
    }

    public /* synthetic */ NetDetectLogData(String str, String str2, long j, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? -1L : j, str3);
    }
}
