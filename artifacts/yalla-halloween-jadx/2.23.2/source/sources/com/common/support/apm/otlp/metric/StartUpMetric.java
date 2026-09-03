package com.common.support.apm.otlp.metric;

import com.common.support.apm.otlp.YallaOtlpSdk;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.common.OooO;
import io.opentelemetry.api.metrics.MeterBuilder;
import io.opentelemetry.api.metrics.ObservableLongMeasurement;
import io.opentelemetry.compat.Consumer;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/common/support/apm/otlp/metric/StartUpMetric;", "", "()V", "upload", "", "totalDuration", "", "isFirstLaunch", "", "Companion", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StartUpMetric {

    @NotNull
    private static final String STARTUP_GAUGE_NAME = "launch_duration";

    @NotNull
    private static final String STARTUP_INSTRUMENTATION_NAME = "launch_monitor";

    @NotNull
    private static final String STARTUP_INSTRUMENTATION_VERSION = "1.0.0";

    public static /* synthetic */ void upload$default(StartUpMetric startUpMetric, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        startUpMetric.upload(j, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o00oo000.OooOo] */
    public final void upload(final long totalDuration, boolean isFirstLaunch) {
        AttributesBuilder attributesBuilderOooO00o = OooO.OooO00o();
        attributesBuilderOooO00o.OooO0O0(isFirstLaunch);
        final Attributes attributesBuild = attributesBuilderOooO00o.build();
        SdkMeterProvider meterProvider = YallaOtlpSdk.INSTANCE.getMeterProvider();
        meterProvider.getClass();
        MeterBuilder meterBuilderOooO0OO = meterProvider.OooO0OO(STARTUP_INSTRUMENTATION_NAME);
        meterBuilderOooO0OO.OooO0O0();
        meterBuilderOooO0OO.OooO00o();
        meterBuilderOooO0OO.build().OooO0O0().OooO0O0().OooO00o().OooO0OO().OooO0Oo(new Consumer() { // from class: o00oo000.OooOo
            @Override // io.opentelemetry.compat.Consumer
            public final void OooO00o(ObservableLongMeasurement observableLongMeasurement) {
                observableLongMeasurement.OooO00o(totalDuration, attributesBuild);
            }
        });
    }
}
