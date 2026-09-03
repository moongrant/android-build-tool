package io.opentelemetry.sdk.trace;

import io.opentelemetry.api.internal.OtelEncodingUtils;
import io.opentelemetry.api.internal.TemporaryBuffers;
import io.opentelemetry.api.trace.TraceId;
import java.util.Random;

/* JADX INFO: loaded from: classes5.dex */
enum AndroidFriendlyRandomIdGenerator implements IdGenerator {
    INSTANCE;

    private static final long INVALID_ID = 0;
    private static final Random random = new Random();

    @Override // io.opentelemetry.sdk.trace.IdGenerator
    public final String OooO00o() {
        long jNextLong;
        do {
            jNextLong = random.nextLong();
        } while (jNextLong == 0);
        if (jNextLong == 0) {
            return "0000000000000000";
        }
        char[] cArrOooO00o = TemporaryBuffers.OooO00o(16);
        OtelEncodingUtils.OooO0Oo(jNextLong, cArrOooO00o, 0);
        return new String(cArrOooO00o, 0, 16);
    }

    @Override // io.opentelemetry.sdk.trace.IdGenerator
    public final String OooO0O0() {
        long jNextLong;
        long jNextLong2 = random.nextLong();
        do {
            jNextLong = random.nextLong();
        } while (jNextLong == 0);
        return TraceId.OooO00o(jNextLong2, jNextLong);
    }
}
