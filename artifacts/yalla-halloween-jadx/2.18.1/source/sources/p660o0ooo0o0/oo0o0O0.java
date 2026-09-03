package p660o0ooo0o0;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oo0o0O0 {
    public static final OooO0O0 Companion = new OooO0O0();

    @JvmField
    @NotNull
    public static final oo0o0O0 NONE = new OooO00o();

    public static final class OooO00o extends oo0o0O0 {
    }

    public static final class OooO0O0 {
    }

    public interface OooO0OO {
        @NotNull
        oo0o0O0 OooO00o(@NotNull o0O0ooO o0o0ooo);
    }

    public void cacheConditionalHit(@NotNull o0O0ooO call, @NotNull o00OOOO0 cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(@NotNull o0O0ooO call, @NotNull o00OOOO0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callEnd(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callFailed(@NotNull o0O0ooO call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void canceled(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void connectEnd(@NotNull o0O0ooO call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(@NotNull o0O0ooO call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(@NotNull o0O0ooO call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull o0O0ooO call, @NotNull o00O00O connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(@NotNull o0O0ooO call, @NotNull o00O00O connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(@NotNull o0O0ooO call, @NotNull String domainName, @NotNull List<InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(@NotNull o0O0ooO call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void proxySelectEnd(@NotNull o0O0ooO call, @NotNull o00OO000 url, @NotNull List<Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(@NotNull o0O0ooO call, @NotNull o00OO000 url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(@NotNull o0O0ooO call, long j) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestFailed(@NotNull o0O0ooO call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(@NotNull o0O0ooO call, @NotNull o00OOO00 request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(@NotNull o0O0ooO call, long j) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseFailed(@NotNull o0O0ooO call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(@NotNull o0O0ooO call, @NotNull o00OOOO0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void satisfactionFailure(@NotNull o0O0ooO call, @NotNull o00OOOO0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(@NotNull o0O0ooO call, @Nullable oo0oOO0 oo0ooo0) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(@NotNull o0O0ooO call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
