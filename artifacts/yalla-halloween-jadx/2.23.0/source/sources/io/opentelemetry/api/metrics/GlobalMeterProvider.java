package io.opentelemetry.api.metrics;

import io.opentelemetry.api.metrics.internal.NoopMeterProvider;

/* JADX INFO: loaded from: classes5.dex */
public class GlobalMeterProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile MeterProvider f33054OooO00o = NoopMeterProvider.f33056OooO00o;

    private GlobalMeterProvider() {
    }
}
