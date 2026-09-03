package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.context.Context;
import io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes5.dex */
@ThreadSafe
public abstract class AggregatorHandle<T> implements BoundStorageHandle {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile boolean f32790OooO0O0 = false;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicLong f32789OooO00o = new AtomicLong(2);

    @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
    public final void OooO00o(Attributes attributes, Context context) {
        OooO0OO();
        this.f32790OooO0O0 = true;
    }

    public abstract T OooO0O0();

    public void OooO0OO() {
        throw new UnsupportedOperationException("This aggregator does not support recording long values.");
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
    public final void release() {
        this.f32789OooO00o.getAndAdd(-2L);
    }
}
