package io.opentelemetry.sdk.metrics;

import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.MeterBuilder;
import io.opentelemetry.sdk.internal.ComponentRegistry;

/* JADX INFO: loaded from: classes5.dex */
class SdkMeterBuilder implements MeterBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComponentRegistry<SdkMeter> f33228OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f33229OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public String f33230OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f33231OooO0Oo;

    public SdkMeterBuilder(ComponentRegistry<SdkMeter> componentRegistry, String str) {
        this.f33228OooO00o = componentRegistry;
        this.f33229OooO0O0 = str;
    }

    @Override // io.opentelemetry.api.metrics.MeterBuilder
    public final MeterBuilder OooO00o() {
        this.f33231OooO0Oo = "";
        return this;
    }

    @Override // io.opentelemetry.api.metrics.MeterBuilder
    public final MeterBuilder OooO0O0() {
        this.f33230OooO0OO = "1.0.0";
        return this;
    }

    @Override // io.opentelemetry.api.metrics.MeterBuilder
    public final Meter build() {
        return this.f33228OooO00o.OooO00o(this.f33229OooO0O0, this.f33230OooO0OO, this.f33231OooO0Oo);
    }
}
