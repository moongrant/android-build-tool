package com.common.support.apm.otlp.exporter;

import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.logger.OtlpLogger;
import com.common.support.apm.otlp.YallaOtlpSdk;
import com.common.support.apm.xlog.entity.TraceModel;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/common/support/apm/otlp/exporter/YallaOtlpSpanExporter;", "Lio/opentelemetry/sdk/trace/export/SpanExporter;", "()V", "export", "Lio/opentelemetry/sdk/common/CompletableResultCode;", "spans", "", "Lio/opentelemetry/sdk/trace/data/SpanData;", "flush", "shutdown", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class YallaOtlpSpanExporter implements SpanExporter {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown().OooO0OO(10L, TimeUnit.SECONDS);
    }

    @Override // io.opentelemetry.sdk.trace.export.SpanExporter
    @NotNull
    public CompletableResultCode export(@NotNull final Collection<? extends SpanData> spans) {
        Intrinsics.checkNotNullParameter(spans, "spans");
        if (spans.isEmpty()) {
            CompletableResultCode completableResultCode = CompletableResultCode.f32659OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(completableResultCode, "ofSuccess()");
            return completableResultCode;
        }
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.otlp.exporter.YallaOtlpSpanExporter.export.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "YallaOtlpSpanExporter export count: " + spans.size();
            }
        }, 1, null);
        OtlpLogger otlpLogger = YallaOtlpSdk.INSTANCE.getOtlpLogger();
        if (otlpLogger != null) {
            otlpLogger.writeTraceLog(new TraceModel(spans));
        }
        CompletableResultCode completableResultCode2 = CompletableResultCode.f32659OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(completableResultCode2, "ofSuccess()");
        return completableResultCode2;
    }

    @NotNull
    public CompletableResultCode flush() {
        CompletableResultCode completableResultCode = CompletableResultCode.f32659OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(completableResultCode, "ofSuccess()");
        return completableResultCode;
    }

    @Override // io.opentelemetry.sdk.trace.export.SpanExporter
    @NotNull
    public CompletableResultCode shutdown() {
        CompletableResultCode completableResultCode = CompletableResultCode.f32659OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(completableResultCode, "ofSuccess()");
        return completableResultCode;
    }
}
