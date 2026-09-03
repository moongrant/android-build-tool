package com.common.support.apm.otlp;

import android.os.Build;
import com.common.support.apm.Constants;
import com.common.support.apm.Sailfish;
import com.common.support.apm.base.Env;
import com.common.support.apm.configuration.ConfigurationManager;
import com.common.support.apm.configuration.specific.ApmConfig;
import com.common.support.apm.configuration.specific.MetricsConfig;
import com.common.support.apm.logger.OtlpLogger;
import com.common.support.apm.otlp.biz.BlockMetric;
import com.common.support.apm.otlp.exporter.YallaOtlpMetricExporter;
import com.common.support.apm.otlp.exporter.YallaOtlpSpanExporter;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.common.OooO;
import io.opentelemetry.api.common.OooO0o;
import io.opentelemetry.api.metrics.GlobalMeterProvider;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.OpenTelemetrySdkBuilder;
import io.opentelemetry.sdk.common.Clock;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.SdkMeterProviderBuilder;
import io.opentelemetry.sdk.metrics.common.InstrumentType;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.export.IntervalMetricReader;
import io.opentelemetry.sdk.metrics.export.IntervalMetricReaderBuilder;
import io.opentelemetry.sdk.metrics.internal.view.ViewRegistry;
import io.opentelemetry.sdk.metrics.internal.view.ViewRegistryBuilder;
import io.opentelemetry.sdk.metrics.view.Aggregation;
import io.opentelemetry.sdk.metrics.view.InstrumentSelector;
import io.opentelemetry.sdk.metrics.view.View;
import io.opentelemetry.sdk.metrics.view.ViewBuilder;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.resources.ResourceAttributes;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SdkTracerProviderBuilder;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessorBuilder;
import io.opentelemetry.sdk.trace.samplers.OooO00o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.o000OO0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0012J\u0006\u0010\u001a\u001a\u00020\fJ\u0016\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rJ\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0016H\u0002J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0016H\u0002J\u0006\u0010\"\u001a\u00020\u0018J\b\u0010#\u001a\u00020\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/common/support/apm/otlp/YallaOtlpSdk;", "", "()V", "config", "Lcom/common/support/apm/otlp/YallaOtlpSdk$Configuration;", "intervalMetricReader", "Lio/opentelemetry/sdk/metrics/export/IntervalMetricReader;", "<set-?>", "", "isInited", "()Z", "openTelemetrySdk", "Lio/opentelemetry/sdk/OpenTelemetrySdk;", "Lcom/common/support/apm/logger/OtlpLogger;", "otlpLogger", "getOtlpLogger", "()Lcom/common/support/apm/logger/OtlpLogger;", "sdkMeterProvider", "Lio/opentelemetry/sdk/metrics/SdkMeterProvider;", "sdkTracerProvider", "Lio/opentelemetry/sdk/trace/SdkTracerProvider;", "createResource", "Lio/opentelemetry/sdk/resources/Resource;", "destroy", "", "getMeterProvider", "getOpenTelemetrySdk", "init", "env", "Lcom/common/support/apm/base/Env;", "logger", "initOpenTelemetryMetrics", "resource", "initOpenTelemetrySpan", "reInit", "updateConfiguration", "Configuration", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class YallaOtlpSdk {

    @NotNull
    public static final YallaOtlpSdk INSTANCE = new YallaOtlpSdk();

    @NotNull
    private static Configuration config = new Configuration();

    @Nullable
    private static IntervalMetricReader intervalMetricReader;
    private static boolean isInited;

    @Nullable
    private static OpenTelemetrySdk openTelemetrySdk;

    @Nullable
    private static OtlpLogger otlpLogger;

    @Nullable
    private static SdkMeterProvider sdkMeterProvider;

    @Nullable
    private static SdkTracerProvider sdkTracerProvider;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\n\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0014R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/common/support/apm/otlp/YallaOtlpSdk$Configuration;", "", "()V", "<set-?>", "", "apmCollectionIntervalSeconds", "getApmCollectionIntervalSeconds", "()J", "Lcom/common/support/apm/base/Env;", "env", "getEnv", "()Lcom/common/support/apm/base/Env;", "metricsCollectionIntervalSeconds", "getMetricsCollectionIntervalSeconds", "", "traceBatchSizeInB", "getTraceBatchSizeInB", "()I", "traceMaxQueueSizeInB", "getTraceMaxQueueSizeInB", "", "tracerSamplerRatio", "getTracerSamplerRatio", "()D", "apmCollectionIntervalInS", "interval", "metricsCollectionIntervalInS", "size", "ratio", "Companion", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Configuration {
        private static final long DEFAULT_APM_COLLECTION_INTERVAL_SECONDS = 5;
        private static final long DEFAULT_METRICS_COLLECTION_INTERVAL_SECONDS = 5;
        private static final int DEFAULT_TRACE_MAX_QUEUE_SIZE = 5120;
        private static final double DEFAULT_TRACE_SAMPLE_RATIO = 1.0d;
        private long apmCollectionIntervalSeconds = 5;
        private long metricsCollectionIntervalSeconds = 5;
        private int traceMaxQueueSizeInB = DEFAULT_TRACE_MAX_QUEUE_SIZE;
        private int traceBatchSizeInB = 2560;

        @NotNull
        private Env env = Env.pro;
        private double tracerSamplerRatio = DEFAULT_TRACE_SAMPLE_RATIO;

        @NotNull
        public final Configuration apmCollectionIntervalInS(long interval) {
            if (interval <= 0) {
                throw new IllegalArgumentException("Apm collection interval must be non-negative");
            }
            this.apmCollectionIntervalSeconds = interval;
            return this;
        }

        @NotNull
        public final Configuration env(@NotNull Env env) {
            Intrinsics.checkNotNullParameter(env, "env");
            this.env = env;
            return this;
        }

        public final long getApmCollectionIntervalSeconds() {
            return this.apmCollectionIntervalSeconds;
        }

        @NotNull
        public final Env getEnv() {
            return this.env;
        }

        public final long getMetricsCollectionIntervalSeconds() {
            return this.metricsCollectionIntervalSeconds;
        }

        public final int getTraceBatchSizeInB() {
            return this.traceBatchSizeInB;
        }

        public final int getTraceMaxQueueSizeInB() {
            return this.traceMaxQueueSizeInB;
        }

        public final double getTracerSamplerRatio() {
            return this.tracerSamplerRatio;
        }

        @NotNull
        public final Configuration metricsCollectionIntervalInS(long interval) {
            if (interval <= 0) {
                throw new IllegalArgumentException("Metrics collection interval must be non-negative");
            }
            this.metricsCollectionIntervalSeconds = interval;
            return this;
        }

        @NotNull
        public final Configuration traceBatchSizeInB(int size) {
            if (size <= 0) {
                throw new IllegalArgumentException("Batch size must be non-negative");
            }
            this.traceBatchSizeInB = size;
            return this;
        }

        @NotNull
        public final Configuration traceMaxQueueSizeInB(int size) {
            if (size <= 0) {
                throw new IllegalArgumentException("Max queue size must be non-negative");
            }
            this.traceMaxQueueSizeInB = size;
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0006 A[PHI: r0
          0x0006: PHI (r0v2 double) = (r0v0 double), (r0v1 double) binds: [B:3:0x0004, B:6:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
        @NotNull
        public final Configuration tracerSamplerRatio(double ratio) {
            double d = 0.0d;
            if (ratio < 0.0d) {
                ratio = d;
            } else {
                d = DEFAULT_TRACE_SAMPLE_RATIO;
                if (ratio > DEFAULT_TRACE_SAMPLE_RATIO) {
                    ratio = d;
                }
            }
            this.tracerSamplerRatio = ratio;
            return this;
        }
    }

    private YallaOtlpSdk() {
    }

    private final Resource createResource(Configuration config2) {
        AttributesBuilder attributesBuilderOooO00o = OooO.OooO00o();
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("device.model"), Build.MODEL);
        attributesBuilderOooO00o.OooO0Oo(ResourceAttributes.f32910OooO0Oo, Sailfish.appKey);
        attributesBuilderOooO00o.OooO0Oo(ResourceAttributes.f32908OooO0O0, Constants.OS);
        attributesBuilderOooO00o.OooO0Oo(ResourceAttributes.f32909OooO0OO, String.valueOf(Build.VERSION.SDK_INT));
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("sailfish.version"), Constants.SAILFISH_VERSION);
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("sdk.version"), Constants.SDK_VERSION);
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("sdk.language"), Constants.SDK_LANGUAGE);
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("app.env"), config2.getEnv().name());
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("app.id"), Sailfish.appId);
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("app.version"), Sailfish.appVersion);
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("app.channel"), Sailfish.appChannel);
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("device.id"), Sailfish.deviceId);
        attributesBuilderOooO00o.OooO0Oo(OooO0o.OooO0o0("user.id"), Sailfish.uniqueId);
        Resource resourceOooO00o = Resource.OooO00o(attributesBuilderOooO00o.build(), null);
        Intrinsics.checkNotNullExpressionValue(resourceOooO00o, "create(attributes)");
        return resourceOooO00o;
    }

    private final void initOpenTelemetryMetrics(Configuration config2, Resource resource) {
        YallaOtlpMetricExporter yallaOtlpMetricExporter = new YallaOtlpMetricExporter();
        Logger logger = SdkMeterProvider.f32698OooO0OO;
        SdkMeterProviderBuilder sdkMeterProviderBuilder = new SdkMeterProviderBuilder();
        Objects.requireNonNull(resource, "resource");
        sdkMeterProviderBuilder.f32702OooO0O0 = resource;
        InstrumentSelector.Builder builderOooO00o = InstrumentSelector.OooO00o();
        builderOooO00o.OooO0O0(new o000OO0O(BlockMetric.METER_NAME_BLOCK));
        builderOooO00o.OooO0OO(InstrumentType.COUNTER);
        InstrumentSelector instrumentSelectorOooO00o = builderOooO00o.OooO00o();
        ViewBuilder viewBuilder = new ViewBuilder();
        viewBuilder.f32900OooO00o = Aggregation.OooO0O0(AggregationTemporality.DELTA);
        View viewOooO00o = viewBuilder.OooO00o();
        Objects.requireNonNull(instrumentSelectorOooO00o, "selector");
        ViewRegistryBuilder viewRegistryBuilder = sdkMeterProviderBuilder.f32703OooO0OO;
        viewRegistryBuilder.OooO00o(instrumentSelectorOooO00o, viewOooO00o);
        Clock clock = sdkMeterProviderBuilder.f32701OooO00o;
        Resource resource2 = sdkMeterProviderBuilder.f32702OooO0O0;
        viewRegistryBuilder.getClass();
        SdkMeterProvider sdkMeterProvider2 = new SdkMeterProvider(clock, resource2, new ViewRegistry(Collections.unmodifiableList(viewRegistryBuilder.f32872OooO00o)));
        int i = GlobalMeterProvider.f32522OooO00o;
        sdkMeterProvider = sdkMeterProvider2;
        IntervalMetricReaderBuilder intervalMetricReaderBuilderOooO00o = IntervalMetricReader.OooO00o();
        intervalMetricReaderBuilderOooO00o.OooO0OO(yallaOtlpMetricExporter);
        SdkMeterProvider sdkMeterProvider3 = sdkMeterProvider;
        Intrinsics.checkNotNull(sdkMeterProvider3);
        intervalMetricReaderBuilderOooO00o.OooO0Oo(SetsKt.setOf(sdkMeterProvider3));
        intervalMetricReaderBuilderOooO00o.OooO0O0(config2.getMetricsCollectionIntervalSeconds() * ((long) 1000));
        intervalMetricReader = intervalMetricReaderBuilderOooO00o.OooO00o();
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [io.opentelemetry.sdk.trace.IdGenerator, java.lang.Enum] */
    private final void initOpenTelemetrySpan(Configuration config2, Resource resource) {
        YallaOtlpSpanExporter yallaOtlpSpanExporter = new YallaOtlpSpanExporter();
        int i = BatchSpanProcessor.f33020OooO0o;
        BatchSpanProcessorBuilder batchSpanProcessorBuilder = new BatchSpanProcessorBuilder(yallaOtlpSpanExporter);
        long apmCollectionIntervalSeconds = config2.getApmCollectionIntervalSeconds() * ((long) 1000);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.requireNonNull(timeUnit, "unit");
        if (!(apmCollectionIntervalSeconds >= 0)) {
            throw new IllegalArgumentException("delay must be non-negative");
        }
        batchSpanProcessorBuilder.f33036OooO0O0 = timeUnit.toNanos(apmCollectionIntervalSeconds);
        batchSpanProcessorBuilder.f33037OooO0OO = config2.getTraceMaxQueueSizeInB();
        int traceBatchSizeInB = config2.getTraceBatchSizeInB();
        if (!(traceBatchSizeInB > 0)) {
            throw new IllegalArgumentException("maxExportBatchSize must be positive.");
        }
        batchSpanProcessorBuilder.f33038OooO0Oo = traceBatchSizeInB;
        BatchSpanProcessor batchSpanProcessor = new BatchSpanProcessor(batchSpanProcessorBuilder.f33035OooO00o, batchSpanProcessorBuilder.f33036OooO0O0, batchSpanProcessorBuilder.f33037OooO0OO, batchSpanProcessorBuilder.f33038OooO0Oo, batchSpanProcessorBuilder.f33039OooO0o0);
        Logger logger = SdkTracerProvider.f32977OooO0o;
        SdkTracerProviderBuilder sdkTracerProviderBuilder = new SdkTracerProviderBuilder();
        Objects.requireNonNull(resource, "resource");
        sdkTracerProviderBuilder.f32984OooO0Oo = resource;
        sdkTracerProviderBuilder.f32985OooO0o = OooO00o.OooO0OO(config2.getTracerSamplerRatio());
        ArrayList arrayList = sdkTracerProviderBuilder.f32981OooO00o;
        arrayList.add(batchSpanProcessor);
        SdkTracerProvider sdkTracerProvider2 = new SdkTracerProvider(sdkTracerProviderBuilder.f32982OooO0O0, sdkTracerProviderBuilder.f32983OooO0OO, sdkTracerProviderBuilder.f32984OooO0Oo, sdkTracerProviderBuilder.f32986OooO0o0, sdkTracerProviderBuilder.f32985OooO0o, arrayList);
        sdkTracerProvider = sdkTracerProvider2;
        sdkTracerProvider2.OooO0OO(OooO00o.OooO0OO(config2.getTracerSamplerRatio()));
        OpenTelemetrySdkBuilder openTelemetrySdkBuilder = new OpenTelemetrySdkBuilder();
        openTelemetrySdkBuilder.f32655OooO0O0 = sdkTracerProvider;
        openTelemetrySdk = openTelemetrySdkBuilder.OooO00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfiguration() {
        Configuration configuration = config;
        ApmConfig apmConfig = ApmConfig.INSTANCE;
        configuration.apmCollectionIntervalInS(apmConfig.apmLogReportFrequency());
        config.metricsCollectionIntervalInS(MetricsConfig.INSTANCE.metricsReportFrequencySec());
        int iApmLogSize = (int) apmConfig.apmLogSize();
        config.traceBatchSizeInB(iApmLogSize);
        config.traceMaxQueueSizeInB(iApmLogSize);
        config.tracerSamplerRatio(((double) apmConfig.apmLogCollectionRate()) / 100.0d);
    }

    public final void destroy() {
        SdkTracerProvider sdkTracerProvider2 = sdkTracerProvider;
        if (sdkTracerProvider2 != null) {
            sdkTracerProvider2.close();
        }
        IntervalMetricReader intervalMetricReader2 = intervalMetricReader;
        if (intervalMetricReader2 != null) {
            intervalMetricReader2.OooO0O0();
        }
    }

    @NotNull
    public final synchronized SdkMeterProvider getMeterProvider() {
        SdkMeterProvider sdkMeterProvider2;
        sdkMeterProvider2 = sdkMeterProvider;
        if (sdkMeterProvider2 == null) {
            throw new IllegalStateException("Initialize YallaOtlpSdk first!");
        }
        Intrinsics.checkNotNull(sdkMeterProvider2);
        return sdkMeterProvider2;
    }

    @NotNull
    public final synchronized OpenTelemetrySdk getOpenTelemetrySdk() {
        OpenTelemetrySdk openTelemetrySdk2;
        openTelemetrySdk2 = openTelemetrySdk;
        if (openTelemetrySdk2 == null) {
            throw new IllegalStateException("Initialize YallaOtlpSdk first!");
        }
        Intrinsics.checkNotNull(openTelemetrySdk2);
        return openTelemetrySdk2;
    }

    @Nullable
    public final OtlpLogger getOtlpLogger() {
        return otlpLogger;
    }

    public final synchronized void init(@NotNull Env env, @NotNull OtlpLogger logger) {
        Intrinsics.checkNotNullParameter(env, "env");
        Intrinsics.checkNotNullParameter(logger, "logger");
        config.env(env);
        otlpLogger = logger;
        updateConfiguration();
        Resource resourceCreateResource = createResource(config);
        initOpenTelemetrySpan(config, resourceCreateResource);
        initOpenTelemetryMetrics(config, resourceCreateResource);
        ConfigurationManager.INSTANCE.addOnConfigChangeListener(new Function0<Unit>() { // from class: com.common.support.apm.otlp.YallaOtlpSdk.init.1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                YallaOtlpSdk yallaOtlpSdk = YallaOtlpSdk.INSTANCE;
                yallaOtlpSdk.updateConfiguration();
                yallaOtlpSdk.reInit();
            }
        });
        isInited = true;
    }

    public final boolean isInited() {
        return isInited;
    }

    public final synchronized void reInit() {
        if (isInited) {
            destroy();
            GlobalOpenTelemetry.f32482OooO0O0 = null;
            Resource resourceCreateResource = createResource(config);
            initOpenTelemetrySpan(config, resourceCreateResource);
            initOpenTelemetryMetrics(config, resourceCreateResource);
        }
    }
}
