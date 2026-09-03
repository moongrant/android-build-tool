package com.common.support.apm.otlp.biz;

import android.net.Uri;
import androidx.compose.animation.Oooo000;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.common.support.apm.otlp.YallaOtlpSdk;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.OooO0o;
import io.opentelemetry.api.internal.TemporaryBuffers;
import io.opentelemetry.api.trace.OooO00o;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.OooO0O0;
import io.opentelemetry.context.propagation.TextMapSetter;
import io.opentelemetry.sdk.trace.SemanticAttributes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.oo0O;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 W2\u00020\u0001:\u0002WXB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\r\u0010%\u001a\u00020&H\u0000¢\u0006\u0002\b'J\r\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0002\b)J\u0010\u0010*\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tH\u0002J\r\u0010+\u001a\u00020&H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020&J\r\u00100\u001a\u00020&H\u0000¢\u0006\u0002\b1J\r\u00102\u001a\u00020\u0007H\u0000¢\u0006\u0002\b3J\r\u00104\u001a\u00020&H\u0000¢\u0006\u0002\b5J\r\u00106\u001a\u00020\u0007H\u0000¢\u0006\u0002\b7J\r\u00108\u001a\u00020&H\u0000¢\u0006\u0002\b9J\r\u0010:\u001a\u00020\u0007H\u0000¢\u0006\u0002\b;J\r\u0010<\u001a\u00020&H\u0000¢\u0006\u0002\b=J\r\u0010>\u001a\u00020\u0007H\u0000¢\u0006\u0002\b?J\r\u0010@\u001a\u00020&H\u0000¢\u0006\u0002\bAJ\r\u0010B\u001a\u00020\u0007H\u0000¢\u0006\u0002\bCJ\r\u0010D\u001a\u00020&H\u0000¢\u0006\u0002\bEJ\r\u0010F\u001a\u00020\u0007H\u0000¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020&H\u0002J\u000e\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020KJ\u0016\u0010L\u001a\u00020&2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0003J\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030QJ\u0006\u0010R\u001a\u00020\u0007J\r\u0010S\u001a\u00020&H\u0000¢\u0006\u0002\bTJ\r\u0010U\u001a\u00020\u0007H\u0000¢\u0006\u0002\bVR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lcom/common/support/apm/otlp/biz/HttpTracer;", "", "requestUrl", "", "requestMethod", "(Ljava/lang/String;Ljava/lang/String;)V", "connectSpan", "Lio/opentelemetry/api/trace/Span;", "connectSpanBuilder", "Lio/opentelemetry/api/trace/SpanBuilder;", "dnsSpan", "dnsSpanBuilder", "fetchSpan", "fetchSpanBuilder", "httpExtendAttribute", "Lcom/common/support/apm/otlp/biz/HttpTracer$HttpExtendAttribute;", "getHttpExtendAttribute$sailfish_release", "()Lcom/common/support/apm/otlp/biz/HttpTracer$HttpExtendAttribute;", "httpLinkSpan", "httpLinkSpanBuilder", "requestSpan", "requestSpanBuilder", "responseSpan", "responseSpanBuilder", "rootSpan", "secureSpan", "secureSpanBuilder", "serializationSpan", "serializationSpanBuilder", "spanBuilder", "textMapSetter", "Lio/opentelemetry/context/propagation/TextMapSetter;", "", "totalSpan", "totalSpanBuilder", "tracer", "Lio/opentelemetry/api/trace/Tracer;", "connectEnd", "", "connectEnd$sailfish_release", "connectStart", "connectStart$sailfish_release", "createSpan", "dnsEnd", "dnsEnd$sailfish_release", "dnsStart", "dnsStart$sailfish_release", "end", "fetchEnd", "fetchEnd$sailfish_release", "fetchStart", "fetchStart$sailfish_release", "httpLinkEnd", "httpLinkEnd$sailfish_release", "httpLinkStart", "httpLinkStart$sailfish_release", "requestEnd", "requestEnd$sailfish_release", "requestStart", "requestStart$sailfish_release", "responseEnd", "responseEnd$sailfish_release", "responseStart", "responseStart$sailfish_release", "secureConnectEnd", "secureConnectEnd$sailfish_release", "secureConnectStart", "secureConnectStart$sailfish_release", "serializationEnd", "serializationEnd$sailfish_release", "serializationStart", "serializationStart$sailfish_release", "setExtendAttribute", "setHttpResponseCode", "code", "", "setStatus", "statueCode", "Lio/opentelemetry/api/trace/StatusCode;", "description", "spanHeaders", "", "start", "totalEnd", "totalEnd$sailfish_release", "totalStart", "totalStart$sailfish_release", "Companion", "HttpExtendAttribute", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class HttpTracer {

    @NotNull
    private static final String HTTPS_SCHEME = "HTTPS";

    @NotNull
    private static final String HTTP_CONNECT_DURATION = "app_connectDuration";

    @NotNull
    private static final String HTTP_DOMAIN_LOOKUP_DURATION = "app_domainLookupDuration";

    @NotNull
    private static final String HTTP_FETCH_DURATION = "app_fetchDuration";

    @NotNull
    private static final String HTTP_HTTP_LINK_DURATION = "app_httpDuration";

    @NotNull
    private static final String HTTP_REQUEST_DURATION = "app_requestDuration";
    public static final int HTTP_REQUEST_ERROR = -1;

    @NotNull
    private static final String HTTP_RESPONSE_DURATION = "app_responseDuration";

    @NotNull
    private static final String HTTP_SECURE_CONNECTION_DURATION = "app_secureConnectionDuration";

    @NotNull
    private static final String HTTP_SERIALIZATION_DURATION = "app_serializationDuration";

    @NotNull
    private static final String HTTP_TOTAL_DURATION = "app_totalDuration";

    @NotNull
    private static final String HTTP_TRACE_NAME = "HTTP";

    @NotNull
    private static final String HTTP_TRACE_VERSION = "1.0.0";
    private Span connectSpan;

    @NotNull
    private final SpanBuilder connectSpanBuilder;
    private Span dnsSpan;

    @NotNull
    private final SpanBuilder dnsSpanBuilder;
    private Span fetchSpan;

    @NotNull
    private final SpanBuilder fetchSpanBuilder;

    @NotNull
    private final HttpExtendAttribute httpExtendAttribute;
    private Span httpLinkSpan;

    @NotNull
    private final SpanBuilder httpLinkSpanBuilder;
    private Span requestSpan;

    @NotNull
    private final SpanBuilder requestSpanBuilder;
    private Span responseSpan;

    @NotNull
    private final SpanBuilder responseSpanBuilder;
    private Span rootSpan;
    private Span secureSpan;

    @NotNull
    private final SpanBuilder secureSpanBuilder;
    private Span serializationSpan;

    @NotNull
    private final SpanBuilder serializationSpanBuilder;

    @NotNull
    private final SpanBuilder spanBuilder;

    @NotNull
    private final TextMapSetter<Map<String, String>> textMapSetter;
    private Span totalSpan;

    @NotNull
    private final SpanBuilder totalSpanBuilder;

    @NotNull
    private final Tracer tracer;
    private static final AttributeKey<Boolean> httpReusedConnectionKey = OooO0o.OooO00o("http.reusedConnection");
    private static final AttributeKey<Long> httpRequestHeaderCountKey = OooO0o.OooO0OO("http.requestHeaderCount");
    private static final AttributeKey<Long> httpRequestBodyCountKey = OooO0o.OooO0OO("http.requestBodyCount");
    private static final AttributeKey<Long> httpResponseHeaderCountKey = OooO0o.OooO0OO("http.responseHeaderCount");
    private static final AttributeKey<Long> httpResponseBodyCountKey = OooO0o.OooO0OO("http.responseBodyCount");

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/common/support/apm/otlp/biz/HttpTracer$HttpExtendAttribute;", "", "reusedConnection", "", "requestHeaderCount", "", "requestBodyCount", "responseHeaderCount", "responseBodyCount", "(ZJJJJ)V", "getRequestBodyCount", "()J", "setRequestBodyCount", "(J)V", "getRequestHeaderCount", "setRequestHeaderCount", "getResponseBodyCount", "setResponseBodyCount", "getResponseHeaderCount", "setResponseHeaderCount", "getReusedConnection", "()Z", "setReusedConnection", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "sailfish_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class HttpExtendAttribute {
        private long requestBodyCount;
        private long requestHeaderCount;
        private long responseBodyCount;
        private long responseHeaderCount;
        private boolean reusedConnection;

        public HttpExtendAttribute() {
            this(false, 0L, 0L, 0L, 0L, 31, null);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getReusedConnection() {
            return this.reusedConnection;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getRequestHeaderCount() {
            return this.requestHeaderCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getRequestBodyCount() {
            return this.requestBodyCount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getResponseHeaderCount() {
            return this.responseHeaderCount;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getResponseBodyCount() {
            return this.responseBodyCount;
        }

        @NotNull
        public final HttpExtendAttribute copy(boolean reusedConnection, long requestHeaderCount, long requestBodyCount, long responseHeaderCount, long responseBodyCount) {
            return new HttpExtendAttribute(reusedConnection, requestHeaderCount, requestBodyCount, responseHeaderCount, responseBodyCount);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HttpExtendAttribute)) {
                return false;
            }
            HttpExtendAttribute httpExtendAttribute = (HttpExtendAttribute) other;
            return this.reusedConnection == httpExtendAttribute.reusedConnection && this.requestHeaderCount == httpExtendAttribute.requestHeaderCount && this.requestBodyCount == httpExtendAttribute.requestBodyCount && this.responseHeaderCount == httpExtendAttribute.responseHeaderCount && this.responseBodyCount == httpExtendAttribute.responseBodyCount;
        }

        public final long getRequestBodyCount() {
            return this.requestBodyCount;
        }

        public final long getRequestHeaderCount() {
            return this.requestHeaderCount;
        }

        public final long getResponseBodyCount() {
            return this.responseBodyCount;
        }

        public final long getResponseHeaderCount() {
            return this.responseHeaderCount;
        }

        public final boolean getReusedConnection() {
            return this.reusedConnection;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        public int hashCode() {
            boolean z = this.reusedConnection;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            long j = this.requestHeaderCount;
            int i = ((r0 * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.requestBodyCount;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.responseHeaderCount;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.responseBodyCount;
            return i3 + ((int) (j4 ^ (j4 >>> 32)));
        }

        public final void setRequestBodyCount(long j) {
            this.requestBodyCount = j;
        }

        public final void setRequestHeaderCount(long j) {
            this.requestHeaderCount = j;
        }

        public final void setResponseBodyCount(long j) {
            this.responseBodyCount = j;
        }

        public final void setResponseHeaderCount(long j) {
            this.responseHeaderCount = j;
        }

        public final void setReusedConnection(boolean z) {
            this.reusedConnection = z;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("HttpExtendAttribute(reusedConnection=");
            sb.append(this.reusedConnection);
            sb.append(", requestHeaderCount=");
            sb.append(this.requestHeaderCount);
            sb.append(", requestBodyCount=");
            sb.append(this.requestBodyCount);
            sb.append(", responseHeaderCount=");
            sb.append(this.responseHeaderCount);
            sb.append(", responseBodyCount=");
            return Oooo000.OooO0OO(sb, this.responseBodyCount, ')');
        }

        public HttpExtendAttribute(boolean z, long j, long j2, long j3, long j4) {
            this.reusedConnection = z;
            this.requestHeaderCount = j;
            this.requestBodyCount = j2;
            this.responseHeaderCount = j3;
            this.responseBodyCount = j4;
        }

        public /* synthetic */ HttpExtendAttribute(boolean z, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) == 0 ? j4 : 0L);
        }
    }

    public HttpTracer(@NotNull String requestUrl, @NotNull String requestMethod) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        this.textMapSetter = new OooO0OO();
        Tracer tracerOooO00o = YallaOtlpSdk.INSTANCE.getOpenTelemetrySdk().OooO00o(HTTP_TRACE_NAME);
        Intrinsics.checkNotNullExpressionValue(tracerOooO00o, "YallaOtlpSdk.getOpenTele…NAME, HTTP_TRACE_VERSION)");
        this.tracer = tracerOooO00o;
        this.httpExtendAttribute = new HttpExtendAttribute(false, 0L, 0L, 0L, 0L, 31, null);
        Uri uri = Uri.parse(requestUrl);
        String host = uri.getHost();
        host = host == null ? "" : host;
        String scheme = uri.getScheme();
        scheme = scheme == null ? HTTPS_SCHEME : scheme;
        String path = uri.getPath();
        path = path == null ? requestUrl : path;
        SpanBuilder spanBuilderOooO00o = tracerOooO00o.OooO00o(path);
        SpanKind spanKind = SpanKind.CLIENT;
        SpanBuilder spanBuilderOooO0Oo = spanBuilderOooO00o.OooO0o0(spanKind).OooO0Oo(SemanticAttributes.f33524OooO0o0, scheme).OooO0Oo(SemanticAttributes.f33520OooO0O0, requestMethod).OooO0Oo(SemanticAttributes.f33521OooO0OO, requestUrl).OooO0Oo(SemanticAttributes.f33522OooO0Oo, path).OooO0Oo(SemanticAttributes.f33519OooO00o, host);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0Oo, "tracer.spanBuilder(rootS…utes.NET_PEER_NAME, host)");
        this.spanBuilder = spanBuilderOooO0Oo;
        SpanBuilder spanBuilderOooO0o0 = tracerOooO00o.OooO00o(HTTP_FETCH_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o0, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.fetchSpanBuilder = spanBuilderOooO0o0;
        SpanBuilder spanBuilderOooO0o1 = tracerOooO00o.OooO00o(HTTP_DOMAIN_LOOKUP_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o1, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.dnsSpanBuilder = spanBuilderOooO0o1;
        SpanBuilder spanBuilderOooO0o2 = tracerOooO00o.OooO00o(HTTP_SECURE_CONNECTION_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o2, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.secureSpanBuilder = spanBuilderOooO0o2;
        SpanBuilder spanBuilderOooO0o3 = tracerOooO00o.OooO00o(HTTP_CONNECT_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o3, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.connectSpanBuilder = spanBuilderOooO0o3;
        SpanBuilder spanBuilderOooO0o4 = tracerOooO00o.OooO00o(HTTP_REQUEST_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o4, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.requestSpanBuilder = spanBuilderOooO0o4;
        SpanBuilder spanBuilderOooO0o5 = tracerOooO00o.OooO00o(HTTP_HTTP_LINK_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o5, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.httpLinkSpanBuilder = spanBuilderOooO0o5;
        SpanBuilder spanBuilderOooO0o6 = tracerOooO00o.OooO00o(HTTP_RESPONSE_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o6, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.responseSpanBuilder = spanBuilderOooO0o6;
        SpanBuilder spanBuilderOooO0o7 = tracerOooO00o.OooO00o(HTTP_TOTAL_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o7, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.totalSpanBuilder = spanBuilderOooO0o7;
        SpanBuilder spanBuilderOooO0o8 = tracerOooO00o.OooO00o(HTTP_SERIALIZATION_DURATION).OooO0o0(spanKind);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o8, "tracer.spanBuilder(HTTP_…SpanKind(SpanKind.CLIENT)");
        this.serializationSpanBuilder = spanBuilderOooO0o8;
    }

    private final Span createSpan(SpanBuilder spanBuilder) {
        Context contextOooO00o = OooO0O0.OooO00o();
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        spanBuilder.OooO0OO(contextOooO00o.OooO0o0(span));
        Span spanOooO00o = spanBuilder.OooO00o();
        Intrinsics.checkNotNullExpressionValue(spanOooO00o, "spanBuilder.startSpan()");
        return spanOooO00o;
    }

    private final void setExtendAttribute() {
        HttpExtendAttribute httpExtendAttribute = this.httpExtendAttribute;
        Span span = this.rootSpan;
        Span span2 = null;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0oo(httpReusedConnectionKey, Boolean.valueOf(httpExtendAttribute.getReusedConnection()));
        Span span3 = this.rootSpan;
        if (span3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span3 = null;
        }
        span3.OooO0oo(httpRequestHeaderCountKey, Long.valueOf(httpExtendAttribute.getRequestHeaderCount()));
        Span span4 = this.rootSpan;
        if (span4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span4 = null;
        }
        span4.OooO0oo(httpRequestBodyCountKey, Long.valueOf(httpExtendAttribute.getRequestBodyCount()));
        Span span5 = this.rootSpan;
        if (span5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span5 = null;
        }
        span5.OooO0oo(httpResponseHeaderCountKey, Long.valueOf(httpExtendAttribute.getResponseHeaderCount()));
        Span span6 = this.rootSpan;
        if (span6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
        } else {
            span2 = span6;
        }
        span2.OooO0oo(httpResponseBodyCountKey, Long.valueOf(httpExtendAttribute.getResponseBodyCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: textMapSetter$lambda-0, reason: not valid java name */
    public static final void m4014textMapSetter$lambda0(Map map, String key, String value) {
        if (map == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(key, "key");
        Intrinsics.checkNotNullExpressionValue(value, "value");
        map.put(key, value);
    }

    public final void connectEnd$sailfish_release() {
        Span span = this.connectSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span connectStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.connectSpanBuilder);
        this.connectSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("connectSpan");
        return null;
    }

    public final void dnsEnd$sailfish_release() {
        Span span = this.dnsSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dnsSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span dnsStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.dnsSpanBuilder);
        this.dnsSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dnsSpan");
        return null;
    }

    public final void end() {
        setExtendAttribute();
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0o();
    }

    public final void fetchEnd$sailfish_release() {
        Span span = this.fetchSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fetchSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span fetchStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.fetchSpanBuilder);
        this.fetchSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fetchSpan");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getHttpExtendAttribute$sailfish_release, reason: from getter */
    public final HttpExtendAttribute getHttpExtendAttribute() {
        return this.httpExtendAttribute;
    }

    public final void httpLinkEnd$sailfish_release() {
        Span span = this.httpLinkSpan;
        if (span == null) {
            return;
        }
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("httpLinkSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span httpLinkStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.httpLinkSpanBuilder);
        this.httpLinkSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("httpLinkSpan");
        return null;
    }

    public final void requestEnd$sailfish_release() {
        Span span = this.requestSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span requestStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.requestSpanBuilder);
        this.requestSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("requestSpan");
        return null;
    }

    public final void responseEnd$sailfish_release() {
        Span span = this.responseSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("responseSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span responseStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.responseSpanBuilder);
        this.responseSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("responseSpan");
        return null;
    }

    public final void secureConnectEnd$sailfish_release() {
        Span span = this.secureSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("secureSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span secureConnectStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.secureSpanBuilder);
        this.secureSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("secureSpan");
        return null;
    }

    public final void serializationEnd$sailfish_release() {
        Span span = this.serializationSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("serializationSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span serializationStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.serializationSpanBuilder);
        this.serializationSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("serializationSpan");
        return null;
    }

    public final void setHttpResponseCode(int code) {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(SemanticAttributes.f33523OooO0o, code);
    }

    public final void setStatus(@NotNull StatusCode statueCode, @NotNull String description) {
        Intrinsics.checkNotNullParameter(statueCode, "statueCode");
        Intrinsics.checkNotNullParameter(description, "description");
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO(statueCode, description);
    }

    @NotNull
    public final Map<String, String> spanHeaders() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        Context contextOooO0o0 = span.OooO0o0(OooO0O0.OooO00o());
        W3CTraceContextPropagator w3CTraceContextPropagator = W3CTraceContextPropagator.f33074OooO0o;
        TextMapSetter<Map<String, String>> textMapSetter = this.textMapSetter;
        w3CTraceContextPropagator.getClass();
        if (contextOooO0o0 != null && textMapSetter != null) {
            SpanContext spanContextOooO0O0 = OooO00o.OooO0O0(contextOooO0o0).OooO0O0();
            if (spanContextOooO0O0.isValid()) {
                int i = W3CTraceContextPropagator.f33073OooO0Oo;
                char[] cArrOooO00o = TemporaryBuffers.OooO00o(i);
                cArrOooO00o[0] = "00".charAt(0);
                cArrOooO00o[1] = "00".charAt(1);
                cArrOooO00o[2] = '-';
                String strOooO0Oo = spanContextOooO0O0.OooO0Oo();
                strOooO0Oo.getChars(0, strOooO0Oo.length(), cArrOooO00o, 3);
                int i2 = W3CTraceContextPropagator.f33071OooO0O0;
                cArrOooO00o[i2 - 1] = '-';
                String strOooO0OO = spanContextOooO0O0.OooO0OO();
                strOooO0OO.getChars(0, strOooO0OO.length(), cArrOooO00o, i2);
                int i3 = W3CTraceContextPropagator.f33072OooO0OO;
                cArrOooO00o[i3 - 1] = '-';
                String strOooO0O0 = spanContextOooO0O0.OooO0oo().OooO0O0();
                cArrOooO00o[i3] = strOooO0O0.charAt(0);
                cArrOooO00o[i3 + 1] = strOooO0O0.charAt(1);
                textMapSetter.OooO00o(linkedHashMap, "traceparent", new String(cArrOooO00o, 0, i));
                TraceState traceStateOooO0oO = spanContextOooO0O0.OooO0oO();
                if (!traceStateOooO0oO.isEmpty()) {
                    StringBuilder sb = new StringBuilder(ConstantsKt.MINIMUM_BLOCK_SIZE);
                    traceStateOooO0oO.OooO00o(new oo0O(sb));
                    textMapSetter.OooO00o(linkedHashMap, "tracestate", sb.toString());
                }
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final Span start() {
        Span spanOooO00o = this.spanBuilder.OooO00o();
        Intrinsics.checkNotNullExpressionValue(spanOooO00o, "spanBuilder.startSpan()");
        this.rootSpan = spanOooO00o;
        if (spanOooO00o != null) {
            return spanOooO00o;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
        return null;
    }

    public final void totalEnd$sailfish_release() {
        Span span = this.totalSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("totalSpan");
            span = null;
        }
        span.OooO0o();
    }

    @NotNull
    public final Span totalStart$sailfish_release() {
        Span spanCreateSpan = createSpan(this.totalSpanBuilder);
        this.totalSpan = spanCreateSpan;
        if (spanCreateSpan != null) {
            return spanCreateSpan;
        }
        Intrinsics.throwUninitializedPropertyAccessException("totalSpan");
        return null;
    }
}
