package com.common.support.apm.sailfishhttp;

import com.common.support.apm.Sailfish;
import com.common.support.apm.otlp.biz.HttpTracer;
import io.opentelemetry.api.trace.StatusCode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o00O0O0O;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o00OO0OO;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B)\b\u0002\u0012\u0006\u00101\u001a\u00020%\u0012\u0006\u0010<\u001a\u00020\u0006\u0012\u0006\u0010=\u001a\u00020\u0006\u0012\u0006\u00103\u001a\u00020%¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J*\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J2\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0018\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010'\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00100\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u0019H\u0016R\u0014\u00101\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u00105\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00102R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:¨\u0006A"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HttpEventListener;", "Lo0ooO0oO/o00OO00O;", "Lo0ooO0oO/o00O00o0;", "call", "", "callStart", "", "domainName", "dnsStart", "", "Ljava/net/InetAddress;", "inetAddressList", "dnsEnd", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "Ljava/net/Proxy;", "proxy", "connectStart", "secureConnectStart", "Lo0ooO0oO/o00OO0OO;", "handshake", "secureConnectEnd", "Lokhttp3/Protocol;", "protocol", "connectEnd", "Ljava/io/IOException;", "ioe", "connectFailed", "Lo0ooO0oO/o00O0O0O;", "connection", "connectionAcquired", "connectionReleased", "requestHeadersStart", "Lo0ooO0oO/o00OOOOo;", "request", "requestHeadersEnd", "requestBodyStart", "", "byteCount", "requestBodyEnd", "responseHeadersStart", "Lo0ooO0oO/o0oOOo;", "response", "responseHeadersEnd", "responseBodyStart", "responseBodyEnd", "callEnd", "exception", "callFailed", "callId", "J", "callStartNanos", "Lcom/common/support/apm/otlp/biz/HttpTracer;", "httpTracer", "Lcom/common/support/apm/otlp/biz/HttpTracer;", "connectedSpendTime", "", "startDnsResolution", "Z", "isNetConnected", "url", "method", "<init>", "(JLjava/lang/String;Ljava/lang/String;J)V", "Companion", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class HttpEventListener extends o00OO00O {
    private final long callId;
    private final long callStartNanos;
    private long connectedSpendTime;

    @Nullable
    private final HttpTracer httpTracer;
    private boolean isNetConnected;
    private boolean startDnsResolution;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static AtomicLong connectedSpendTimeMs = new AtomicLong(-1);

    @NotNull
    private static AtomicLong reuseConnectedSpendTimeMs = new AtomicLong(-1);

    @NotNull
    private static final o00OO00O.OooO0OO factory = new o00OO00O.OooO0OO() { // from class: com.common.support.apm.sailfishhttp.HttpEventListener$Companion$factory$1

        @NotNull
        private final AtomicLong nextCallId = new AtomicLong(1);

        @Override // o0ooO0oO.o00OO00O.OooO0OO
        @NotNull
        public o00OO00O create(@NotNull o00O00o0 call) {
            Intrinsics.checkNotNullParameter(call, "call");
            return new HttpEventListener(this.nextCallId.getAndIncrement(), call.OooO00o().f57313OooO00o.f57202OooO, call.OooO00o().f57314OooO0O0, System.nanoTime(), null);
        }

        @NotNull
        public final AtomicLong getNextCallId() {
            return this.nextCallId;
        }
    };

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HttpEventListener$Companion;", "", "Ljava/util/concurrent/atomic/AtomicLong;", "connectedSpendTimeMs", "Ljava/util/concurrent/atomic/AtomicLong;", "getConnectedSpendTimeMs$sailfish_release", "()Ljava/util/concurrent/atomic/AtomicLong;", "setConnectedSpendTimeMs$sailfish_release", "(Ljava/util/concurrent/atomic/AtomicLong;)V", "reuseConnectedSpendTimeMs", "getReuseConnectedSpendTimeMs$sailfish_release", "setReuseConnectedSpendTimeMs$sailfish_release", "Lo0ooO0oO/o00OO00O$OooO0OO;", "factory", "Lo0ooO0oO/o00OO00O$OooO0OO;", "getFactory$sailfish_release", "()Lo0ooO0oO/o00OO00O$OooO0OO;", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AtomicLong getConnectedSpendTimeMs$sailfish_release() {
            return HttpEventListener.connectedSpendTimeMs;
        }

        @NotNull
        public final o00OO00O.OooO0OO getFactory$sailfish_release() {
            return HttpEventListener.factory;
        }

        @NotNull
        public final AtomicLong getReuseConnectedSpendTimeMs$sailfish_release() {
            return HttpEventListener.reuseConnectedSpendTimeMs;
        }

        public final void setConnectedSpendTimeMs$sailfish_release(@NotNull AtomicLong atomicLong) {
            Intrinsics.checkNotNullParameter(atomicLong, "<set-?>");
            HttpEventListener.connectedSpendTimeMs = atomicLong;
        }

        public final void setReuseConnectedSpendTimeMs$sailfish_release(@NotNull AtomicLong atomicLong) {
            Intrinsics.checkNotNullParameter(atomicLong, "<set-?>");
            HttpEventListener.reuseConnectedSpendTimeMs = atomicLong;
        }
    }

    public /* synthetic */ HttpEventListener(long j, String str, String str2, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, j2);
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void callEnd(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.callEnd(call);
        if (this.isNetConnected) {
            connectedSpendTimeMs.set(this.connectedSpendTime / ((long) DurationKt.NANOS_IN_MILLIS));
            HttpTracer httpTracer = this.httpTracer;
            HttpTracer.HttpExtendAttribute httpExtendAttribute = httpTracer == null ? null : httpTracer.getHttpExtendAttribute();
            if (httpExtendAttribute != null) {
                httpExtendAttribute.setReusedConnection(false);
            }
        } else {
            reuseConnectedSpendTimeMs.set(0L);
        }
        HttpTracer httpTracer2 = this.httpTracer;
        if (httpTracer2 == null) {
            return;
        }
        httpTracer2.totalEnd$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void callFailed(@NotNull o00O00o0 call, @NotNull IOException exception) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(exception, "exception");
        super.callFailed(call, exception);
        if (this.isNetConnected) {
            connectedSpendTimeMs.set(this.connectedSpendTime / ((long) DurationKt.NANOS_IN_MILLIS));
            HttpTracer httpTracer = this.httpTracer;
            HttpTracer.HttpExtendAttribute httpExtendAttribute = httpTracer == null ? null : httpTracer.getHttpExtendAttribute();
            if (httpExtendAttribute != null) {
                httpExtendAttribute.setReusedConnection(false);
            }
        }
        HttpTracer httpTracer2 = this.httpTracer;
        if (httpTracer2 != null) {
            httpTracer2.setHttpResponseCode(-1);
            StatusCode statusCode = StatusCode.ERROR;
            String message = exception.getMessage();
            if (message == null) {
                message = "";
            }
            httpTracer2.setStatus(statusCode, message);
            httpTracer2.totalEnd$sailfish_release();
            httpTracer2.end();
        }
        HttpTracerCache.INSTANCE.remove$sailfish_release(call.hashCode());
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void callStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.callStart(call);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer != null) {
            httpTracer.start();
        }
        HttpTracer httpTracer2 = this.httpTracer;
        if (httpTracer2 != null) {
            httpTracer2.totalStart$sailfish_release();
        }
        HttpTracer httpTracer3 = this.httpTracer;
        if (httpTracer3 != null) {
            httpTracer3.fetchStart$sailfish_release();
        }
        HttpTracerCache.INSTANCE.add$sailfish_release(call.hashCode(), this.httpTracer);
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void connectEnd(@NotNull o00O00o0 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        this.isNetConnected = true;
        this.connectedSpendTime = System.nanoTime() - this.callStartNanos;
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        httpTracer.connectEnd$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void connectFailed(@NotNull o00O00o0 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
        super.connectFailed(call, inetSocketAddress, proxy, protocol, ioe);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        httpTracer.connectEnd$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void connectStart(@NotNull o00O00o0 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        super.connectStart(call, inetSocketAddress, proxy);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        httpTracer.connectStart$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void connectionAcquired(@NotNull o00O00o0 call, @NotNull o00O0O0O connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        super.connectionAcquired(call, connection);
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void connectionReleased(@NotNull o00O00o0 call, @NotNull o00O0O0O connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
        super.connectionReleased(call, connection);
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void dnsEnd(@NotNull o00O00o0 call, @NotNull String domainName, @NotNull List<? extends InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
        super.dnsEnd(call, domainName, inetAddressList);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        httpTracer.dnsEnd$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void dnsStart(@NotNull o00O00o0 call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        super.dnsStart(call, domainName);
        this.startDnsResolution = true;
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer != null) {
            httpTracer.fetchEnd$sailfish_release();
        }
        HttpTracer httpTracer2 = this.httpTracer;
        if (httpTracer2 == null) {
            return;
        }
        httpTracer2.dnsStart$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void requestBodyEnd(@NotNull o00O00o0 call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.requestBodyEnd(call, byteCount);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        httpTracer.getHttpExtendAttribute().setRequestBodyCount(byteCount);
        httpTracer.requestEnd$sailfish_release();
        httpTracer.httpLinkStart$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void requestBodyStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.requestBodyStart(call);
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void requestHeadersEnd(@NotNull o00O00o0 call, @NotNull o00OOOOo request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
        super.requestHeadersEnd(call, request);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        HttpTracer.HttpExtendAttribute httpExtendAttribute = httpTracer.getHttpExtendAttribute();
        String[] strArr = request.f57315OooO0OO.f57369OooO0Oo;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        httpExtendAttribute.setRequestHeaderCount(length);
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void requestHeadersStart(@NotNull o00O00o0 call) {
        HttpTracer httpTracer;
        Intrinsics.checkNotNullParameter(call, "call");
        super.requestHeadersStart(call);
        if (this.startDnsResolution && (httpTracer = this.httpTracer) != null) {
            httpTracer.fetchEnd$sailfish_release();
        }
        HttpTracer httpTracer2 = this.httpTracer;
        if (httpTracer2 == null) {
            return;
        }
        httpTracer2.requestStart$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void responseBodyEnd(@NotNull o00O00o0 call, long byteCount) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.responseBodyEnd(call, byteCount);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        httpTracer.getHttpExtendAttribute().setResponseBodyCount(byteCount);
        httpTracer.responseEnd$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void responseBodyStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.responseBodyStart(call);
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void responseHeadersEnd(@NotNull o00O00o0 call, @NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        super.responseHeadersEnd(call, response);
        int i = response.f57345OooO0oO;
        StatusCode statusCode = 100 <= i && i <= 399 ? StatusCode.OK : StatusCode.ERROR;
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        HttpTracer.HttpExtendAttribute httpExtendAttribute = httpTracer.getHttpExtendAttribute();
        String[] strArr = response.f57341OooO.f57369OooO0Oo;
        long length = strArr.length * 2;
        for (String str : strArr) {
            length += (long) str.length();
        }
        httpExtendAttribute.setResponseHeaderCount(length);
        httpTracer.setHttpResponseCode(response.f57345OooO0oO);
        httpTracer.setStatus(statusCode, response.f57343OooO0o);
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void responseHeadersStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.responseHeadersStart(call);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer != null) {
            httpTracer.httpLinkEnd$sailfish_release();
        }
        HttpTracer httpTracer2 = this.httpTracer;
        if (httpTracer2 == null) {
            return;
        }
        httpTracer2.responseStart$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void secureConnectEnd(@NotNull o00O00o0 call, @Nullable o00OO0OO handshake) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.secureConnectEnd(call, handshake);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        httpTracer.secureConnectEnd$sailfish_release();
    }

    @Override // p634o0ooO0oO.o00OO00O
    public void secureConnectStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        super.secureConnectStart(call);
        HttpTracer httpTracer = this.httpTracer;
        if (httpTracer == null) {
            return;
        }
        httpTracer.secureConnectStart$sailfish_release();
    }

    private HttpEventListener(long j, String str, String str2, long j2) {
        this.callId = j;
        this.callStartNanos = j2;
        this.httpTracer = Sailfish.INSTANCE.httpTracerOrNull(str, str2);
    }
}
