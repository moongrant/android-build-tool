package io.opentelemetry.sdk.metrics;

import com.common.support.apm.otlp.biz.BlockMetric;
import io.opentelemetry.api.metrics.Meter;
import io.opentelemetry.api.metrics.MeterBuilder;
import io.opentelemetry.api.metrics.MeterProvider;
import io.opentelemetry.compat.Function;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.internal.ComponentRegistry;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.export.MetricProducer;
import io.opentelemetry.sdk.metrics.internal.state.MeterProviderSharedState;
import io.opentelemetry.sdk.metrics.internal.state.MetricStorage;
import io.opentelemetry.sdk.metrics.internal.state.MetricStorageRegistry;
import io.opentelemetry.sdk.metrics.internal.view.ViewRegistry;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class SdkMeterProvider implements MeterProvider, MetricProducer {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Logger f32698OooO0OO = Logger.getLogger(SdkMeterProvider.class.getName());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ComponentRegistry<SdkMeter> f32699OooO00o = new ComponentRegistry<>(new Function() { // from class: io.opentelemetry.sdk.metrics.OooO00o
        @Override // io.opentelemetry.compat.Function
        public final Object apply(Object obj) {
            return new SdkMeter(this.f32690OooO00o.f32700OooO0O0, (InstrumentationLibraryInfo) obj);
        }
    });

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final MeterProviderSharedState f32700OooO0O0;

    public SdkMeterProvider(Clock clock, Resource resource, ViewRegistry viewRegistry) {
        this.f32700OooO0O0 = MeterProviderSharedState.OooO00o(clock, resource, viewRegistry);
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricProducer
    public final Collection<MetricData> OooO00o() {
        ComponentRegistry<SdkMeter> componentRegistry = this.f32699OooO00o;
        componentRegistry.getClass();
        Collection<SdkMeter> collectionUnmodifiableCollection = Collections.unmodifiableCollection(new ArrayList(componentRegistry.f32670OooO00o.values()));
        ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection.size());
        for (SdkMeter sdkMeter : collectionUnmodifiableCollection) {
            long jOooO00o = this.f32700OooO0O0.OooO0O0().OooO00o();
            MetricStorageRegistry metricStorageRegistryOooO0OO = sdkMeter.f32693OooO0O0.OooO0OO();
            metricStorageRegistryOooO0OO.getClass();
            Collection<MetricStorage> collectionUnmodifiableCollection2 = Collections.unmodifiableCollection(new ArrayList(metricStorageRegistryOooO0OO.f32852OooO00o.values()));
            ArrayList arrayList2 = new ArrayList(collectionUnmodifiableCollection2.size());
            for (MetricStorage metricStorage : collectionUnmodifiableCollection2) {
                sdkMeter.f32692OooO00o.OooO0Oo();
                MetricData metricDataOooO0Oo = metricStorage.OooO0Oo(jOooO00o);
                if (metricDataOooO0Oo != null) {
                    arrayList2.add(metricDataOooO0Oo);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final Meter OooO0O0() {
        return ((SdkMeterBuilder) OooO0OO(BlockMetric.INSTRUMENTATION_NAME_BLOCK)).build();
    }

    public final MeterBuilder OooO0OO(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            f32698OooO0OO.fine("Meter requested without instrumentation name.");
            str = "unknown";
        }
        return new SdkMeterBuilder(this.f32699OooO00o, str);
    }
}
