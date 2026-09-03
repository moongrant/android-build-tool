package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;

/* JADX INFO: loaded from: classes5.dex */
public interface BoundStorageHandle {
    void OooO0O0(long j, Attributes attributes, Context context);

    void release();
}
