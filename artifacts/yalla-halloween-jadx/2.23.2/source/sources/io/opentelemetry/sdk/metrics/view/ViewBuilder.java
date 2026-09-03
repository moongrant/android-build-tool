package io.opentelemetry.sdk.metrics.view;

import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;

/* JADX INFO: loaded from: classes5.dex */
public final class ViewBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Aggregation f32900OooO00o = Aggregation.f32877OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AttributesProcessor f32901OooO0O0 = AttributesProcessor.f32865OooO00o;

    public final View OooO00o() {
        return new AutoValue_View(this.f32900OooO00o, this.f32901OooO0O0);
    }
}
