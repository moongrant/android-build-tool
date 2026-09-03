package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;

/* JADX INFO: loaded from: classes5.dex */
public interface WriteableMetricStorage {
    void OooO00o(Attributes attributes, Context context);

    BoundStorageHandle OooO0O0(Attributes attributes);
}
