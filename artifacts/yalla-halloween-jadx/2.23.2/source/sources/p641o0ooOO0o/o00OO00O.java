package p641o0ooOO0o;

import androidx.compose.foundation.layout.oo000o;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o0O000O f57743OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O0o f57744OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final SocketFactory f57745OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final SSLSocketFactory f57746OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final HostnameVerifier f57747OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o00OO0OO f57748OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00OOO0 f57749OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Proxy f57750OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ProxySelector f57751OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final List<Protocol> f57752OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final List<o00Oo00> f57753OooOO0O;

    public o00OO00O(@NotNull String uriHost, int i, @NotNull o0O0o dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable o00OOO0 o00ooo1, @NotNull o00OO0OO proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<o00Oo00> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f57744OooO00o = dns;
        this.f57745OooO0O0 = socketFactory;
        this.f57746OooO0OO = sSLSocketFactory;
        this.f57747OooO0Oo = hostnameVerifier;
        this.f57749OooO0o0 = o00ooo1;
        this.f57748OooO0o = proxyAuthenticator;
        this.f57750OooO0oO = proxy;
        this.f57751OooO0oo = proxySelector;
        o0O000O.OooO00o oooO00o = new o0O000O.OooO00o();
        oooO00o.OooOO0(sSLSocketFactory != null ? "https" : "http");
        oooO00o.OooO0o(uriHost);
        if (!(1 <= i && i < 65536)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(i)).toString());
        }
        oooO00o.f57803OooO0o0 = i;
        this.f57743OooO = oooO00o.OooO0OO();
        this.f57752OooOO0 = oO000o00.OooOo(protocols);
        this.f57753OooOO0O = oO000o00.OooOo(connectionSpecs);
    }

    public final boolean OooO00o(@NotNull o00OO00O that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f57744OooO00o, that.f57744OooO00o) && Intrinsics.areEqual(this.f57748OooO0o, that.f57748OooO0o) && Intrinsics.areEqual(this.f57752OooOO0, that.f57752OooOO0) && Intrinsics.areEqual(this.f57753OooOO0O, that.f57753OooOO0O) && Intrinsics.areEqual(this.f57751OooO0oo, that.f57751OooO0oo) && Intrinsics.areEqual(this.f57750OooO0oO, that.f57750OooO0oO) && Intrinsics.areEqual(this.f57746OooO0OO, that.f57746OooO0OO) && Intrinsics.areEqual(this.f57747OooO0Oo, that.f57747OooO0Oo) && Intrinsics.areEqual(this.f57749OooO0o0, that.f57749OooO0o0) && this.f57743OooO.f57794OooO0o0 == that.f57743OooO.f57794OooO0o0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00OO00O) {
            o00OO00O o00oo00o = (o00OO00O) obj;
            if (Intrinsics.areEqual(this.f57743OooO, o00oo00o.f57743OooO) && OooO00o(o00oo00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f57749OooO0o0) + ((Objects.hashCode(this.f57747OooO0Oo) + ((Objects.hashCode(this.f57746OooO0OO) + ((Objects.hashCode(this.f57750OooO0oO) + ((this.f57751OooO0oo.hashCode() + ((this.f57753OooOO0O.hashCode() + ((this.f57752OooOO0.hashCode() + ((this.f57748OooO0o.hashCode() + ((this.f57744OooO00o.hashCode() + ((this.f57743OooO.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o0O000O o0o000o = this.f57743OooO;
        sb.append(o0o000o.f57792OooO0Oo);
        sb.append(':');
        sb.append(o0o000o.f57794OooO0o0);
        sb.append(", ");
        Proxy proxy = this.f57750OooO0oO;
        return oo000o.OooO0O0(sb, proxy != null ? Intrinsics.stringPlus("proxy=", proxy) : Intrinsics.stringPlus("proxySelector=", this.f57751OooO0oo), '}');
    }
}
