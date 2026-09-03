package io.opentelemetry.api.trace;

import io.opentelemetry.api.internal.OtelEncodingUtils;
import io.opentelemetry.api.internal.TemporaryBuffers;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public final class TraceId {
    private TraceId() {
    }

    public static String OooO00o(long j, long j2) {
        if (j == 0 && j2 == 0) {
            return "00000000000000000000000000000000";
        }
        char[] cArrOooO00o = TemporaryBuffers.OooO00o(32);
        OtelEncodingUtils.OooO0Oo(j, cArrOooO00o, 0);
        OtelEncodingUtils.OooO0Oo(j2, cArrOooO00o, 16);
        return new String(cArrOooO00o, 0, 32);
    }
}
