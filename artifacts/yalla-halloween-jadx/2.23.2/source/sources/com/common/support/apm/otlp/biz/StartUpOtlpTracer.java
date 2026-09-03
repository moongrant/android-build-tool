package com.common.support.apm.otlp.biz;

import com.common.support.apm.otlp.YallaOtlpSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.qiniu.android.collect.ReportItem;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.OooO0O0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0010J\u001e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007J\u0016\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/common/support/apm/otlp/biz/StartUpOtlpTracer;", "", RemoteConfigConstants$RequestFieldKey.APP_ID, "", "env", "(Ljava/lang/String;Ljava/lang/String;)V", "applicationSpan", "Lio/opentelemetry/api/trace/Span;", "coldSpan", "firstScreenSpan", "tracer", "Lio/opentelemetry/api/trace/Tracer;", "getTracer", "()Lio/opentelemetry/api/trace/Tracer;", "warmSpan", "endApplicationSpan", "", "endColdSpan", "endFirstScreenSpan", ReportItem.QualityKeyResult, "", "endWarmSpan", "startApplicationSpan", "name", "time", "", "parentSpan", "startColdSpan", "startFirstScreenSpan", "startWarmSpan", "Companion", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StartUpOtlpTracer {

    @NotNull
    private static final String STARTUP_INSTRUMENTATION_NAME = "launch_monitor";

    @NotNull
    private static final String STARTUP_INSTRUMENTATION_VERSION = "1.0.0";

    @NotNull
    private static final String STARTUP_TYPE = "type";

    @NotNull
    private static final String STARTUP_TYPE_COLD = "2";

    @NotNull
    private static final String STARTUP_TYPE_FIRST_TIME = "1";

    @NotNull
    private static final String STARTUP_TYPE_WARM = "3";

    @NotNull
    private final String appId;
    private Span applicationSpan;
    private Span coldSpan;

    @NotNull
    private final String env;
    private Span firstScreenSpan;

    @NotNull
    private final Tracer tracer;
    private Span warmSpan;

    public StartUpOtlpTracer(@NotNull String appId, @NotNull String env) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(env, "env");
        this.appId = appId;
        this.env = env;
        Tracer tracerOooO00o = YallaOtlpSdk.INSTANCE.getOpenTelemetrySdk().OooO00o(STARTUP_INSTRUMENTATION_NAME);
        Intrinsics.checkNotNullExpressionValue(tracerOooO00o, "YallaOtlpSdk.getOpenTele…STRUMENTATION_VERSION\n  )");
        this.tracer = tracerOooO00o;
    }

    public final void endApplicationSpan() {
        Span span = this.applicationSpan;
        if (span == null) {
            return;
        }
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("applicationSpan");
            span = null;
        }
        span.OooO0oo();
    }

    public final void endColdSpan() {
        Span span = this.coldSpan;
        if (span == null) {
            return;
        }
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coldSpan");
            span = null;
        }
        span.OooO0oo();
    }

    public final void endFirstScreenSpan() {
        Span span = this.firstScreenSpan;
        if (span == null) {
            return;
        }
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firstScreenSpan");
            span = null;
        }
        span.OooO0oo();
    }

    public final void endWarmSpan() {
        Span span = this.warmSpan;
        if (span == null) {
            return;
        }
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("warmSpan");
            span = null;
        }
        span.OooO0oo();
    }

    @NotNull
    public final Tracer getTracer() {
        return this.tracer;
    }

    @NotNull
    public final Span startApplicationSpan(@NotNull String name, long time, @NotNull Span parentSpan) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parentSpan, "parentSpan");
        Span spanOooO00o = this.tracer.OooO00o(name).OooO0o(SpanKind.CLIENT).OooO0oO(time, TimeUnit.NANOSECONDS).OooO0Oo(OooO0O0.OooO00o().OooO0o0(parentSpan)).OooO0O0().OooO00o();
        Intrinsics.checkNotNullExpressionValue(spanOooO00o, "tracer.spanBuilder(name)…(true)\n      .startSpan()");
        this.applicationSpan = spanOooO00o;
        if (spanOooO00o != null) {
            return spanOooO00o;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applicationSpan");
        return null;
    }

    @NotNull
    public final Span startColdSpan(@NotNull String name, long time) {
        Intrinsics.checkNotNullParameter(name, "name");
        Span spanOooO00o = this.tracer.OooO00o(name).OooO0o(SpanKind.CLIENT).OooO0oO(time, TimeUnit.NANOSECONDS).OooO0oo("2").OooO0O0().OooO00o();
        Intrinsics.checkNotNullExpressionValue(spanOooO00o, "tracer.spanBuilder(name)…(true)\n      .startSpan()");
        this.coldSpan = spanOooO00o;
        if (spanOooO00o != null) {
            return spanOooO00o;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coldSpan");
        return null;
    }

    @NotNull
    public final Span startFirstScreenSpan(@NotNull String name, long time, @NotNull Span parentSpan) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parentSpan, "parentSpan");
        Span spanOooO00o = this.tracer.OooO00o(name).OooO0o(SpanKind.CLIENT).OooO0oO(time, TimeUnit.NANOSECONDS).OooO0Oo(OooO0O0.OooO00o().OooO0o0(parentSpan)).OooO0O0().OooO00o();
        Intrinsics.checkNotNullExpressionValue(spanOooO00o, "tracer.spanBuilder(name)…(true)\n      .startSpan()");
        this.firstScreenSpan = spanOooO00o;
        if (spanOooO00o != null) {
            return spanOooO00o;
        }
        Intrinsics.throwUninitializedPropertyAccessException("firstScreenSpan");
        return null;
    }

    @NotNull
    public final Span startWarmSpan(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Span spanOooO00o = this.tracer.OooO00o(name).OooO0o(SpanKind.CLIENT).OooO0O0().OooO0oo("3").OooO00o();
        Intrinsics.checkNotNullExpressionValue(spanOooO00o, "tracer.spanBuilder(name)…_WARM)\n      .startSpan()");
        this.warmSpan = spanOooO00o;
        if (spanOooO00o != null) {
            return spanOooO00o;
        }
        Intrinsics.throwUninitializedPropertyAccessException("warmSpan");
        return null;
    }

    public final void endFirstScreenSpan(boolean result) {
        Span span = null;
        if (result) {
            Span span2 = this.firstScreenSpan;
            if (span2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("firstScreenSpan");
                span2 = null;
            }
            span2.OooO(StatusCode.OK);
        } else {
            Span span3 = this.firstScreenSpan;
            if (span3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("firstScreenSpan");
                span3 = null;
            }
            span3.OooO(StatusCode.ERROR);
        }
        Span span4 = this.firstScreenSpan;
        if (span4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("firstScreenSpan");
        } else {
            span = span4;
        }
        span.OooO0oo();
    }
}
