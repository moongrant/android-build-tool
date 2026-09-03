package com.common.support.apm.otlp.exporter;

import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.logger.OtlpLogger;
import com.common.support.apm.otlp.YallaOtlpSdk;
import com.common.support.apm.xlog.entity.MetricModel;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.export.MetricExporter;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/common/support/apm/otlp/exporter/YallaOtlpMetricExporter;", "Lio/opentelemetry/sdk/metrics/export/MetricExporter;", "()V", "export", "Lio/opentelemetry/sdk/common/CompletableResultCode;", "metrics", "", "Lio/opentelemetry/sdk/metrics/data/MetricData;", "flush", "shutdown", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class YallaOtlpMetricExporter implements MetricExporter {
    @Override // io.opentelemetry.sdk.metrics.export.MetricExporter
    @Nullable
    public CompletableResultCode export(@NotNull final Collection<? extends MetricData> metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        if (metrics.isEmpty()) {
            return CompletableResultCode.f33192OooO0Oo;
        }
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.otlp.exporter.YallaOtlpMetricExporter.export.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return Intrinsics.stringPlus("YallaOtlpMetricExporter export count: ", Integer.valueOf(metrics.size()));
            }
        }, 1, null);
        OtlpLogger otlpLogger = YallaOtlpSdk.INSTANCE.getOtlpLogger();
        if (otlpLogger != null) {
            otlpLogger.writeMetricLog(new MetricModel(metrics));
        }
        return CompletableResultCode.f33192OooO0Oo;
    }

    @Nullable
    public CompletableResultCode flush() {
        return CompletableResultCode.f33192OooO0Oo;
    }

    @Override // io.opentelemetry.sdk.metrics.export.MetricExporter
    @Nullable
    public CompletableResultCode shutdown() {
        return CompletableResultCode.f33192OooO0Oo;
    }
}
