package com.yallatech.support.platform.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yallatech/support/platform/utils/NetUtil$NetworkType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "NETWORK_WIFI", "NETWORK_5G", "NETWORK_4G", "NETWORK_3G", "NETWORK_2G", "NETWORK_UNKNOWN", "NETWORK_NO", "lib_release"}, k = 1, mv = {1, 5, 1})
public enum NetUtil$NetworkType {
    NETWORK_WIFI(1),
    NETWORK_5G(5),
    NETWORK_4G(4),
    NETWORK_3G(3),
    NETWORK_2G(2),
    NETWORK_UNKNOWN(0),
    NETWORK_NO(-1);

    private final int value;

    NetUtil$NetworkType(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: OooO00o, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
