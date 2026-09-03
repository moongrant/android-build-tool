package p634o0ooO0oO;

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

/* JADX INFO: loaded from: classes5.dex */
public abstract class o00OO00O {

    @NotNull
    public static final OooO0O0 Companion = new OooO0O0();

    @JvmField
    @NotNull
    public static final o00OO00O NONE = new OooO00o();

    public static final class OooO00o extends o00OO00O {
    }

    public static final class OooO0O0 {
    }

    public interface OooO0OO {
        @NotNull
        o00OO00O create(@NotNull o00O00o0 o00o00o1);
    }

    public void cacheConditionalHit(@NotNull o00O00o0 call, @NotNull o0oOOo cachedResponse) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
    }

    public void cacheHit(@NotNull o00O00o0 call, @NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void cacheMiss(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callEnd(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void callFailed(@NotNull o00O00o0 call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void callStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void canceled(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void connectEnd(@NotNull o00O00o0 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectFailed(@NotNull o00O00o0 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy, @Nullable Protocol protocol, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void connectStart(@NotNull o00O00o0 call, @NotNull InetSocketAddress inetSocketAddress, @NotNull Proxy proxy) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public void connectionAcquired(@NotNull o00O00o0 call, @NotNull o00O0O0O connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void connectionReleased(@NotNull o00O00o0 call, @NotNull o00O0O0O connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public void dnsEnd(@NotNull o00O00o0 call, @NotNull String domainName, @NotNull List<InetAddress> inetAddressList) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(inetAddressList, "inetAddressList");
    }

    public void dnsStart(@NotNull o00O00o0 call, @NotNull String domainName) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(domainName, "domainName");
    }

    public void proxySelectEnd(@NotNull o00O00o0 call, @NotNull o00OO url, @NotNull List<Proxy> proxies) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public void proxySelectStart(@NotNull o00O00o0 call, @NotNull o00OO url) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public void requestBodyEnd(@NotNull o00O00o0 call, long j) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestBodyStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void requestFailed(@NotNull o00O00o0 call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void requestHeadersEnd(@NotNull o00O00o0 call, @NotNull o00OOOOo request) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    public void requestHeadersStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyEnd(@NotNull o00O00o0 call, long j) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseBodyStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void responseFailed(@NotNull o00O00o0 call, @NotNull IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public void responseHeadersEnd(@NotNull o00O00o0 call, @NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void responseHeadersStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void satisfactionFailure(@NotNull o00O00o0 call, @NotNull o0oOOo response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
    }

    public void secureConnectEnd(@NotNull o00O00o0 call, @Nullable o00OO0OO o00oo0oo) {
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public void secureConnectStart(@NotNull o00O00o0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
