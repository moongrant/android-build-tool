package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;

/* JADX INFO: loaded from: classes5.dex */
public interface WriteableMetricStorage {
    BoundStorageHandle OooO00o(Attributes attributes);

    void OooO0O0(long j, Attributes attributes, Context context);
}
