package io.opentelemetry.sdk.trace.export;

import com.common.support.apm.otlp.exporter.YallaOtlpSpanExporter;
import java.util.concurrent.TimeUnit;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class BatchSpanProcessorBuilder {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SpanExporter f33567OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f33568OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f33569OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f33570OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f33571OooO0o0;

    public BatchSpanProcessorBuilder(YallaOtlpSpanExporter yallaOtlpSpanExporter) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f33568OooO0O0 = timeUnit.toNanos(5000L);
        this.f33569OooO0OO = 2048;
        this.f33570OooO0Oo = ConstantsKt.MINIMUM_BLOCK_SIZE;
        this.f33571OooO0o0 = timeUnit.toNanos(30000L);
        this.f33567OooO00o = yallaOtlpSpanExporter;
    }
}
