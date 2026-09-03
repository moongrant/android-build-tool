package io.opentelemetry.api.metrics.internal;

import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.MeterBuilder;
import io.opentelemetry.api.metrics.MeterProvider;

/* JADX INFO: loaded from: classes5.dex */
public class NoopMeterProvider implements MeterProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final NoopMeterProvider f33056OooO00o = new NoopMeterProvider();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final MeterBuilder f33057OooO0O0 = new NoopMeterBuilder(0);

    public static class NoopMeterBuilder implements MeterBuilder {
        private NoopMeterBuilder() {
        }

        public /* synthetic */ NoopMeterBuilder(int i) {
            this();
        }

        @Override // io.opentelemetry.api.metrics.MeterBuilder
        public final MeterBuilder OooO00o() {
            return this;
        }

        @Override // io.opentelemetry.api.metrics.MeterBuilder
        public final MeterBuilder OooO0O0() {
            return this;
        }

        @Override // io.opentelemetry.api.metrics.MeterBuilder
        public final Meter build() {
            return NoopMeter.f33055OooO00o;
        }
    }

    private NoopMeterProvider() {
    }

    @Override // io.opentelemetry.api.metrics.MeterProvider
    public final MeterBuilder OooO0O0(String str) {
        return f33057OooO0O0;
    }
}
