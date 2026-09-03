package io.opentelemetry.api.metrics;

import io.opentelemetry.api.common.Attributes;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public interface LongCounter {
    BoundLongCounter OooO00o(Attributes attributes);

    void OooO0O0(Attributes attributes);
}
