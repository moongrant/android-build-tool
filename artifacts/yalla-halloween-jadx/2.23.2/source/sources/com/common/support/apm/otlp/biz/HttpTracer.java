package com.common.support.apm.otlp.biz;

import android.net.Uri;
import androidx.compose.animation.o000oOoO;
import androidx.media3.session.OooOOOO;
import com.common.support.apm.Sailfish;
import com.common.support.apm.monitor.MonitorErrorCodeKt;
import com.common.support.apm.otlp.YallaOtlpSdk;
import com.common.support.networkstate.NetworkStateUtil;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.common.OooO;
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
import io.opentelemetry.sdk.resources.ResourceAttributes;
import io.opentelemetry.sdk.trace.SemanticAttributes;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0oOo0O0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 X2\u00020\u0001:\u0002XYB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\r\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\b#J\r\u0010$\u001a\u00020\"H\u0000¢\u0006\u0002\b%J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0002J\b\u0010*\u001a\u00020\u0007H\u0002J\r\u0010+\u001a\u00020\"H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020\"H\u0000¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020\"J\r\u00100\u001a\u00020\"H\u0000¢\u0006\u0002\b1J\r\u00102\u001a\u00020\"H\u0000¢\u0006\u0002\b3J\r\u00104\u001a\u00020\"H\u0000¢\u0006\u0002\b5J\r\u00106\u001a\u00020\"H\u0000¢\u0006\u0002\b7J\r\u00108\u001a\u00020\"H\u0000¢\u0006\u0002\b9J\r\u0010:\u001a\u00020\"H\u0000¢\u0006\u0002\b;J\r\u0010<\u001a\u00020\"H\u0000¢\u0006\u0002\b=J\r\u0010>\u001a\u00020\"H\u0000¢\u0006\u0002\b?J\r\u0010@\u001a\u00020\"H\u0000¢\u0006\u0002\bAJ\r\u0010B\u001a\u00020\"H\u0000¢\u0006\u0002\bCJ\r\u0010D\u001a\u00020\"H\u0000¢\u0006\u0002\bEJ\r\u0010F\u001a\u00020\"H\u0000¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020\"H\u0002J\u000e\u0010I\u001a\u00020\"2\u0006\u0010J\u001a\u00020KJ\u0016\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u0003J\u000e\u0010P\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030RJ\u0006\u0010S\u001a\u00020\u0014J\r\u0010T\u001a\u00020\"H\u0000¢\u0006\u0002\bUJ\r\u0010V\u001a\u00020\"H\u0000¢\u0006\u0002\bWR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006Z"}, d2 = {"Lcom/common/support/apm/otlp/biz/HttpTracer;", "", "requestUrl", "", "requestMethod", "(Ljava/lang/String;Ljava/lang/String;)V", "connectStartTime", "", "dnsStartTime", "fetchStartTime", "httpExtendAttribute", "Lcom/common/support/apm/otlp/biz/HttpTracer$HttpExtendAttribute;", "getHttpExtendAttribute$sailfish_release", "()Lcom/common/support/apm/otlp/biz/HttpTracer$HttpExtendAttribute;", "httpLinkStartTime", "requestStartTime", "responseStartTime", "rootContext", "Lio/opentelemetry/context/Context;", "rootSpan", "Lio/opentelemetry/api/trace/Span;", "secureStartTime", "serializationStartTime", "spanBuilder", "Lio/opentelemetry/api/trace/SpanBuilder;", "textMapSetter", "Lio/opentelemetry/context/propagation/TextMapSetter;", "", "throwable", "", "totalStartTime", "tracer", "Lio/opentelemetry/api/trace/Tracer;", "connectEnd", "", "connectEnd$sailfish_release", "connectStart", "connectStart$sailfish_release", "createStartEndAttributes", "Lio/opentelemetry/api/common/Attributes;", "startTime", "endTime", "currentTimeMillis", "dnsEnd", "dnsEnd$sailfish_release", "dnsStart", "dnsStart$sailfish_release", HttpTracer.HTTP_SPAN_END, "fetchEnd", "fetchEnd$sailfish_release", "fetchStart", "fetchStart$sailfish_release", "httpLinkEnd", "httpLinkEnd$sailfish_release", "httpLinkStart", "httpLinkStart$sailfish_release", "requestEnd", "requestEnd$sailfish_release", "requestStart", "requestStart$sailfish_release", "responseEnd", "responseEnd$sailfish_release", "responseStart", "responseStart$sailfish_release", "secureConnectEnd", "secureConnectEnd$sailfish_release", "secureConnectStart", "secureConnectStart$sailfish_release", "serializationEnd", "serializationEnd$sailfish_release", "serializationStart", "serializationStart$sailfish_release", "setExtendAttribute", "setHttpResponseCode", "code", "", "setStatus", "statueCode", "Lio/opentelemetry/api/trace/StatusCode;", "description", "setStatusAndHttpResponseCode", "spanHeaders", "", HttpTracer.HTTP_SPAN_START, "totalEnd", "totalEnd$sailfish_release", "totalStart", "totalStart$sailfish_release", "Companion", "HttpExtendAttribute", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
    private static final String HTTP_SPAN_END = "end";

    @NotNull
    private static final String HTTP_SPAN_START = "start";

    @NotNull
    private static final String HTTP_TOTAL_DURATION = "app_totalDuration";

    @NotNull
    private static final String HTTP_TRACE_NAME = "HTTP";

    @NotNull
    private static final String HTTP_TRACE_VERSION = "1.0.0";
    private long connectStartTime;
    private long dnsStartTime;
    private long fetchStartTime;

    @NotNull
    private final HttpExtendAttribute httpExtendAttribute;
    private long httpLinkStartTime;
    private long requestStartTime;
    private long responseStartTime;
    private Context rootContext;
    private Span rootSpan;
    private long secureStartTime;
    private long serializationStartTime;

    @NotNull
    private final SpanBuilder spanBuilder;

    @NotNull
    private final TextMapSetter<Map<String, String>> textMapSetter;

    @Nullable
    private Throwable throwable;
    private long totalStartTime;

    @NotNull
    private final Tracer tracer;
    private static final AttributeKey<Boolean> httpReusedConnectionKey = OooO0o.OooO00o("http.reusedConnection");
    private static final AttributeKey<Long> httpRequestHeaderCountKey = OooO0o.OooO0O0("http.requestHeaderCount");
    private static final AttributeKey<Long> httpRequestBodyCountKey = OooO0o.OooO0O0("http.requestBodyCount");
    private static final AttributeKey<Long> httpResponseHeaderCountKey = OooO0o.OooO0O0("http.responseHeaderCount");
    private static final AttributeKey<Long> httpResponseBodyCountKey = OooO0o.OooO0O0("http.responseBodyCount");

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/common/support/apm/otlp/biz/HttpTracer$HttpExtendAttribute;", "", "reusedConnection", "", "requestHeaderCount", "", "requestBodyCount", "responseHeaderCount", "responseBodyCount", "(ZJJJJ)V", "getRequestBodyCount", "()J", "setRequestBodyCount", "(J)V", "getRequestHeaderCount", "setRequestHeaderCount", "getResponseBodyCount", "setResponseBodyCount", "getResponseHeaderCount", "setResponseHeaderCount", "getReusedConnection", "()Z", "setReusedConnection", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "sailfish_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
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
            return o000oOoO.OooO00o(sb, this.responseBodyCount, ')');
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
        this.textMapSetter = new OooOOOO();
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
        SpanBuilder spanBuilderOooO0o0 = tracerOooO00o.OooO00o(path).OooO0o(SpanKind.CLIENT).OooO0o0(SemanticAttributes.f32992OooO0o0, scheme).OooO0o0(SemanticAttributes.f32988OooO0O0, requestMethod).OooO0o0(SemanticAttributes.f32989OooO0OO, requestUrl).OooO0o0(SemanticAttributes.f32990OooO0Oo, path).OooO0o0(SemanticAttributes.f32987OooO00o, host);
        Intrinsics.checkNotNullExpressionValue(spanBuilderOooO0o0, "tracer.spanBuilder(rootS…utes.NET_PEER_NAME, host)");
        this.spanBuilder = spanBuilderOooO0o0;
    }

    private final Attributes createStartEndAttributes(long startTime, long endTime) {
        if (startTime == 0 || endTime == 0 || startTime > endTime) {
            Attributes attributesOooO0O0 = OooO.OooO0O0();
            Intrinsics.checkNotNullExpressionValue(attributesOooO0O0, "{\n      Attributes.empty()\n    }");
            return attributesOooO0O0;
        }
        AttributesBuilder attributesBuilderOooO00o = OooO.OooO00o();
        attributesBuilderOooO00o.OooO00o(startTime, HTTP_SPAN_START);
        attributesBuilderOooO00o.OooO00o(endTime, HTTP_SPAN_END);
        Attributes attributesBuild = attributesBuilderOooO00o.build();
        Intrinsics.checkNotNullExpressionValue(attributesBuild, "{\n      Attributes.build…me)\n      }.build()\n    }");
        return attributesBuild;
    }

    private final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    private final void setExtendAttribute() {
        HttpExtendAttribute httpExtendAttribute = this.httpExtendAttribute;
        Span span = this.rootSpan;
        Span span2 = null;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooOO0(httpReusedConnectionKey, Boolean.valueOf(httpExtendAttribute.getReusedConnection()));
        Span span3 = this.rootSpan;
        if (span3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span3 = null;
        }
        span3.OooOO0(httpRequestHeaderCountKey, Long.valueOf(httpExtendAttribute.getRequestHeaderCount()));
        Span span4 = this.rootSpan;
        if (span4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span4 = null;
        }
        span4.OooOO0(httpRequestBodyCountKey, Long.valueOf(httpExtendAttribute.getRequestBodyCount()));
        Span span5 = this.rootSpan;
        if (span5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span5 = null;
        }
        span5.OooOO0(httpResponseHeaderCountKey, Long.valueOf(httpExtendAttribute.getResponseHeaderCount()));
        Span span6 = this.rootSpan;
        if (span6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
        } else {
            span2 = span6;
        }
        span2.OooOO0(httpResponseBodyCountKey, Long.valueOf(httpExtendAttribute.getResponseBodyCount()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: textMapSetter$lambda-0, reason: not valid java name */
    public static final void m4024textMapSetter$lambda0(Map map, String key, String value) {
        if (map != null) {
            Intrinsics.checkNotNullExpressionValue(key, "key");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            map.put(key, value);
        }
    }

    public final void connectEnd$sailfish_release() {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(createStartEndAttributes(this.connectStartTime, currentTimeMillis()), HTTP_CONNECT_DURATION);
    }

    public final void connectStart$sailfish_release() {
        this.connectStartTime = currentTimeMillis();
    }

    public final void dnsEnd$sailfish_release() {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(createStartEndAttributes(this.dnsStartTime, currentTimeMillis()), HTTP_DOMAIN_LOOKUP_DURATION);
    }

    public final void dnsStart$sailfish_release() {
        this.dnsStartTime = currentTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    public final void end() {
        android.content.Context context;
        Span span;
        Throwable th = this.throwable;
        Span span2 = null;
        if (th != null) {
            int iErrorCode = MonitorErrorCodeKt.errorCode(th);
            if (th instanceof IOException) {
                String message = th.getMessage();
                if (Intrinsics.areEqual("Canceled", message != null ? StringsKt.trim((CharSequence) message).toString() : null)) {
                    Span span3 = this.rootSpan;
                    if (span3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
                        span3 = null;
                    }
                    span3.OooOO0(ResourceAttributes.f32907OooO00o, Boolean.TRUE);
                } else {
                    context = Sailfish.INSTANCE.getContextRef$sailfish_release().get();
                    if (context == null) {
                        span = this.rootSpan;
                        if (span == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
                            span = null;
                        }
                        span.OooOO0(ResourceAttributes.f32907OooO00o, Boolean.TRUE);
                    } else {
                        span = this.rootSpan;
                        if (span == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
                            span = null;
                        }
                        span.OooOO0(ResourceAttributes.f32907OooO00o, Boolean.TRUE);
                    }
                }
            } else {
                context = Sailfish.INSTANCE.getContextRef$sailfish_release().get();
                if ((context == null && !NetworkStateUtil.INSTANCE.isRealConnected(context)) || iErrorCode == -100) {
                    span = this.rootSpan;
                    if (span == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
                        span = null;
                    }
                    span.OooOO0(ResourceAttributes.f32907OooO00o, Boolean.TRUE);
                }
            }
            setHttpResponseCode(iErrorCode);
            StatusCode statusCode = StatusCode.ERROR;
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            setStatus(statusCode, message2);
        }
        setExtendAttribute();
        Span span4 = this.rootSpan;
        if (span4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
        } else {
            span2 = span4;
        }
        span2.OooO0oo();
    }

    public final void fetchEnd$sailfish_release() {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(createStartEndAttributes(this.fetchStartTime, currentTimeMillis()), HTTP_FETCH_DURATION);
    }

    public final void fetchStart$sailfish_release() {
        this.fetchStartTime = currentTimeMillis();
    }

    @NotNull
    /* JADX INFO: renamed from: getHttpExtendAttribute$sailfish_release, reason: from getter */
    public final HttpExtendAttribute getHttpExtendAttribute() {
        return this.httpExtendAttribute;
    }

    public final void httpLinkEnd$sailfish_release() {
        if (this.httpLinkStartTime != 0) {
            Span span = this.rootSpan;
            if (span == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
                span = null;
            }
            span.OooO0OO(createStartEndAttributes(this.httpLinkStartTime, currentTimeMillis()), HTTP_HTTP_LINK_DURATION);
        }
    }

    public final void httpLinkStart$sailfish_release() {
        this.httpLinkStartTime = currentTimeMillis();
    }

    public final void requestEnd$sailfish_release() {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(createStartEndAttributes(this.requestStartTime, currentTimeMillis()), HTTP_REQUEST_DURATION);
    }

    public final void requestStart$sailfish_release() {
        this.requestStartTime = currentTimeMillis();
    }

    public final void responseEnd$sailfish_release() {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(createStartEndAttributes(this.responseStartTime, currentTimeMillis()), HTTP_RESPONSE_DURATION);
    }

    public final void responseStart$sailfish_release() {
        this.responseStartTime = currentTimeMillis();
    }

    public final void secureConnectEnd$sailfish_release() {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(createStartEndAttributes(this.secureStartTime, currentTimeMillis()), HTTP_SECURE_CONNECTION_DURATION);
    }

    public final void secureConnectStart$sailfish_release() {
        this.secureStartTime = currentTimeMillis();
    }

    public final void serializationEnd$sailfish_release() {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(createStartEndAttributes(this.serializationStartTime, currentTimeMillis()), HTTP_SERIALIZATION_DURATION);
    }

    public final void serializationStart$sailfish_release() {
        this.serializationStartTime = currentTimeMillis();
    }

    public final void setHttpResponseCode(int code) {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0o0(SemanticAttributes.f32991OooO0o, code);
    }

    public final void setStatus(@NotNull StatusCode statueCode, @NotNull String description) {
        Intrinsics.checkNotNullParameter(statueCode, "statueCode");
        Intrinsics.checkNotNullParameter(description, "description");
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooOO0O(statueCode, description);
    }

    public final void setStatusAndHttpResponseCode(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.throwable = throwable;
    }

    @NotNull
    public final Map<String, String> spanHeaders() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Context context = this.rootContext;
        if (context != null) {
            W3CTraceContextPropagator w3CTraceContextPropagator = W3CTraceContextPropagator.f32541OooO0o;
            TextMapSetter<Map<String, String>> textMapSetter = this.textMapSetter;
            w3CTraceContextPropagator.getClass();
            if (textMapSetter != null) {
                SpanContext spanContextOooO0O0 = OooO00o.OooO0O0(context).OooO0O0();
                if (spanContextOooO0O0.isValid()) {
                    int i = W3CTraceContextPropagator.f32540OooO0Oo;
                    char[] cArrOooO00o = TemporaryBuffers.OooO00o(i);
                    cArrOooO00o[0] = "00".charAt(0);
                    cArrOooO00o[1] = "00".charAt(1);
                    cArrOooO00o[2] = '-';
                    String strOooO0Oo = spanContextOooO0O0.OooO0Oo();
                    strOooO0Oo.getChars(0, strOooO0Oo.length(), cArrOooO00o, 3);
                    int i2 = W3CTraceContextPropagator.f32538OooO0O0;
                    cArrOooO00o[i2 - 1] = '-';
                    String strOooO0OO = spanContextOooO0O0.OooO0OO();
                    strOooO0OO.getChars(0, strOooO0OO.length(), cArrOooO00o, i2);
                    int i3 = W3CTraceContextPropagator.f32539OooO0OO;
                    cArrOooO00o[i3 - 1] = '-';
                    String strOooO0O0 = spanContextOooO0O0.OooO0oo().OooO0O0();
                    cArrOooO00o[i3] = strOooO0O0.charAt(0);
                    cArrOooO00o[i3 + 1] = strOooO0O0.charAt(1);
                    textMapSetter.OooO00o(linkedHashMap, "traceparent", new String(cArrOooO00o, 0, i));
                    TraceState traceStateOooO0oO = spanContextOooO0O0.OooO0oO();
                    if (!traceStateOooO0oO.isEmpty()) {
                        StringBuilder sb = new StringBuilder(ConstantsKt.MINIMUM_BLOCK_SIZE);
                        traceStateOooO0oO.OooO00o(new o0oOo0O0(sb));
                        textMapSetter.OooO00o(linkedHashMap, "tracestate", sb.toString());
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final Span start() {
        Span spanOooO00o = this.spanBuilder.OooO0OO().OooO00o();
        Intrinsics.checkNotNullExpressionValue(spanOooO00o, "spanBuilder.setNoParent().startSpan()");
        this.rootSpan = spanOooO00o;
        Context contextOooO0O0 = OooO0O0.OooO0O0();
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        Context contextOooO0o0 = contextOooO0O0.OooO0o0(span);
        Intrinsics.checkNotNullExpressionValue(contextOooO0o0, "root().with(rootSpan)");
        this.rootContext = contextOooO0o0;
        Span span2 = this.rootSpan;
        if (span2 != null) {
            return span2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
        return null;
    }

    public final void totalEnd$sailfish_release() {
        Span span = this.rootSpan;
        if (span == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootSpan");
            span = null;
        }
        span.OooO0OO(createStartEndAttributes(this.totalStartTime, currentTimeMillis()), HTTP_TOTAL_DURATION);
    }

    public final void totalStart$sailfish_release() {
        this.totalStartTime = currentTimeMillis();
    }
}
