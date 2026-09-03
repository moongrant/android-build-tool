package io.opentelemetry.api.metrics;

import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public interface Meter {
    LongCounterBuilder OooO00o(String str);

    DoubleGaugeBuilder OooO0O0(String str);
}
