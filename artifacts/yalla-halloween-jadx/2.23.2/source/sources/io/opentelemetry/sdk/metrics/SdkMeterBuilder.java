package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.MeterBuilder;
import io.opentelemetry.sdk.internal.ComponentRegistry;

/* JADX INFO: loaded from: classes5.dex */
class SdkMeterBuilder implements MeterBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComponentRegistry<SdkMeter> f32694OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f32695OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f32696OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f32697OooO0Oo;

    public SdkMeterBuilder(ComponentRegistry<SdkMeter> componentRegistry, String str) {
        this.f32694OooO00o = componentRegistry;
        this.f32695OooO0O0 = str;
    }

    @Override // io.opentelemetry.api.metrics.MeterBuilder
    public final MeterBuilder OooO00o() {
        this.f32697OooO0Oo = "";
        return this;
    }

    @Override // io.opentelemetry.api.metrics.MeterBuilder
    public final MeterBuilder OooO0O0() {
        this.f32696OooO0OO = "1.0.0";
        return this;
    }

    @Override // io.opentelemetry.api.metrics.MeterBuilder
    public final Meter build() {
        return this.f32694OooO00o.OooO00o(this.f32695OooO0O0, this.f32696OooO0OO, this.f32697OooO0Oo);
    }
}
