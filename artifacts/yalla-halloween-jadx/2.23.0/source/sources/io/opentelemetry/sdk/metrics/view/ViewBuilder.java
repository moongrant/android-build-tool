package io.opentelemetry.sdk.metrics.view;

import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;

/* JADX INFO: loaded from: classes5.dex */
public final class ViewBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Aggregation f33434OooO00o = Aggregation.f33411OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AttributesProcessor f33435OooO0O0 = AttributesProcessor.f33399OooO00o;

    public final View OooO00o() {
        return new AutoValue_View(this.f33434OooO00o, this.f33435OooO0O0);
    }
}
