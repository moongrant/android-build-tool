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
    public volatile boolean f33324OooO0O0 = false;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicLong f33323OooO00o = new AtomicLong(2);

    public abstract T OooO00o();

    @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
    public final void OooO0O0(long j, Attributes attributes, Context context) {
        OooO0OO(j);
        this.f33324OooO0O0 = true;
    }

    public void OooO0OO(long j) {
        throw new UnsupportedOperationException("This aggregator does not support recording long values.");
    }

    @Override // io.opentelemetry.sdk.metrics.internal.state.BoundStorageHandle
    public final void release() {
        this.f33323OooO00o.getAndAdd(-2L);
    }
}
