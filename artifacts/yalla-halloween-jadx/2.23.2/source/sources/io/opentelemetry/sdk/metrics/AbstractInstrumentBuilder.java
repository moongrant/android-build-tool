package io.opentelemetry.sdk.metrics;

import io.opentelemetry.sdk.metrics.AbstractInstrumentBuilder;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.state.MeterSharedState;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractInstrumentBuilder<BuilderT extends AbstractInstrumentBuilder<?>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MeterProviderSharedState f32685OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MeterSharedState f32686OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f32687OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f32688OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f32689OooO0o0;

    @FunctionalInterface
    public interface SwapBuilder<T> {
    }

    public AbstractInstrumentBuilder(MeterProviderSharedState meterProviderSharedState, MeterSharedState meterSharedState, String str, String str2, String str3) {
        this.f32687OooO0OO = str;
        this.f32688OooO0Oo = str2;
        this.f32689OooO0o0 = str3;
        this.f32685OooO00o = meterProviderSharedState;
        this.f32686OooO0O0 = meterSharedState;
    }
}
