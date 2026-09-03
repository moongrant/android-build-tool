package io.opentelemetry.sdk.metrics.internal.state;

import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator;
import java.util.HashMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
final class InstrumentProcessor<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Aggregator<T> f32847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f32848OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f32849OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public HashMap f32850OooO0Oo = new HashMap();

    public InstrumentProcessor(Aggregator<T> aggregator, long j) {
        this.f32847OooO00o = aggregator;
        this.f32848OooO0O0 = j;
        this.f32849OooO0OO = j;
    }

    @Nullable
    public final MetricData OooO00o(long j) {
        if (this.f32850OooO0Oo.isEmpty()) {
            return null;
        }
        MetricData metricDataOooO0Oo = this.f32847OooO00o.OooO0Oo(this.f32850OooO0Oo, this.f32848OooO0O0, this.f32849OooO0OO, j);
        this.f32849OooO0OO = j;
        if (!this.f32847OooO00o.OooO0o0()) {
            this.f32850OooO0Oo = new HashMap();
        }
        return metricDataOooO0Oo;
    }
}
