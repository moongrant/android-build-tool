package io.opentelemetry.sdk.metrics.internal.state;

import com.google.auto.value.AutoValue;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.metrics.ObservableLongMeasurement;
import io.opentelemetry.context.OooO0O0;
import io.opentelemetry.sdk.common.InstrumentationLibraryInfo;
import io.opentelemetry.sdk.metrics.common.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.view.AttributesProcessor;
import io.opentelemetry.sdk.metrics.view.View;
import io.opentelemetry.sdk.resources.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.concurrent.Immutable;
import p241o00oo000.OooOo;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
@Immutable
public abstract class MeterSharedState {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f32851OooO00o = Logger.getLogger(MeterSharedState.class.getName());

    public static MeterSharedState OooO00o(InstrumentationLibraryInfo instrumentationLibraryInfo) {
        return new AutoValue_MeterSharedState(instrumentationLibraryInfo, new MetricStorageRegistry());
    }

    public abstract InstrumentationLibraryInfo OooO0O0();

    public abstract MetricStorageRegistry OooO0OO();

    /* JADX WARN: Type inference failed for: r3v3, types: [io.opentelemetry.sdk.metrics.internal.state.OooO00o] */
    public final void OooO0Oo(InstrumentDescriptor instrumentDescriptor, MeterProviderSharedState meterProviderSharedState, final OooOo oooOo) {
        for (View view : meterProviderSharedState.OooO0o0().OooO00o(instrumentDescriptor, OooO0O0())) {
            if (view.OooO00o().OooO00o(instrumentDescriptor) != null) {
                try {
                    MetricStorageRegistry metricStorageRegistryOooO0OO = OooO0OO();
                    Resource resourceOooO0OO = meterProviderSharedState.OooO0OO();
                    InstrumentationLibraryInfo instrumentationLibraryInfoOooO0O0 = OooO0O0();
                    long jOooO0Oo = meterProviderSharedState.OooO0Oo();
                    MetricDescriptor metricDescriptorOooO00o = MetricDescriptor.OooO00o(view, instrumentDescriptor);
                    final Aggregator aggregatorOooO00o = view.OooO00o().OooO00o(instrumentDescriptor).OooO00o(resourceOooO0OO, instrumentationLibraryInfoOooO0O0, instrumentDescriptor, metricDescriptorOooO00o);
                    final InstrumentProcessor instrumentProcessor = new InstrumentProcessor(aggregatorOooO00o, jOooO0Oo);
                    final AttributesProcessor attributesProcessorOooO0O0 = view.OooO0O0();
                    final ObservableLongMeasurement observableLongMeasurement = new ObservableLongMeasurement() { // from class: io.opentelemetry.sdk.metrics.internal.state.AsynchronousMetricStorage.2
                        /* JADX WARN: Type inference incomplete: some casts might be missing */
                        @Override // io.opentelemetry.api.metrics.ObservableLongMeasurement
                        public final void OooO00o(long j, Attributes attributes) {
                            Attributes attributesOooO00o = attributesProcessorOooO0O0.OooO00o(attributes, OooO0O0.OooO00o());
                            Object objOooO00o = aggregatorOooO00o.OooO00o(j);
                            InstrumentProcessor instrumentProcessor2 = instrumentProcessor;
                            HashMap map = instrumentProcessor2.f32850OooO0Oo;
                            Object objPut = map.get(attributesOooO00o);
                            if (objPut == null) {
                                objPut = map.put(attributesOooO00o, objOooO00o);
                            }
                            if (objPut != null) {
                                instrumentProcessor2.f32850OooO0Oo.put(attributesOooO00o, instrumentProcessor2.f32847OooO00o.OooO0O0((T) objPut, (T) objOooO00o));
                            }
                        }
                    };
                    metricStorageRegistryOooO0OO.OooO00o(new AsynchronousMetricStorage(metricDescriptorOooO00o, instrumentProcessor, new Runnable() { // from class: io.opentelemetry.sdk.metrics.internal.state.OooO00o
                        @Override // java.lang.Runnable
                        public final void run() {
                            oooOo.OooO00o(observableLongMeasurement);
                        }
                    }));
                } catch (DuplicateMetricStorageException e) {
                    f32851OooO00o.log(Level.WARNING, "Failed to register metric.", (Throwable) e);
                }
            }
        }
    }

    public final WriteableMetricStorage OooO0o0(InstrumentDescriptor instrumentDescriptor, MeterProviderSharedState meterProviderSharedState) {
        List<View> listOooO00o = meterProviderSharedState.OooO0o0().OooO00o(instrumentDescriptor, OooO0O0());
        ArrayList arrayList = new ArrayList(listOooO00o.size());
        for (View view : listOooO00o) {
            if (view.OooO00o().OooO00o(instrumentDescriptor) != null) {
                try {
                    MetricStorageRegistry metricStorageRegistryOooO0OO = OooO0OO();
                    Resource resourceOooO0OO = meterProviderSharedState.OooO0OO();
                    InstrumentationLibraryInfo instrumentationLibraryInfoOooO0O0 = OooO0O0();
                    long jOooO0Oo = meterProviderSharedState.OooO0Oo();
                    MetricDescriptor metricDescriptorOooO00o = MetricDescriptor.OooO00o(view, instrumentDescriptor);
                    Aggregator aggregatorOooO00o = view.OooO00o().OooO00o(instrumentDescriptor).OooO00o(resourceOooO0OO, instrumentationLibraryInfoOooO0O0, instrumentDescriptor, metricDescriptorOooO00o);
                    arrayList.add((WriteableMetricStorage) metricStorageRegistryOooO0OO.OooO00o(new SynchronousMetricStorage(metricDescriptorOooO00o, aggregatorOooO00o, new InstrumentProcessor(aggregatorOooO00o, jOooO0Oo), view.OooO0O0())));
                } catch (DuplicateMetricStorageException e) {
                    f32851OooO00o.log(Level.WARNING, "Failed to register metric.", (Throwable) e);
                }
            }
        }
        return arrayList.size() == 1 ? (WriteableMetricStorage) arrayList.get(0) : new MultiWritableMetricStorage(arrayList);
    }
}
