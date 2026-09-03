package p634o0ooO0oO;

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
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o00OO f57144OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO000 f57145OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final SocketFactory f57146OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final SSLSocketFactory f57147OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final HostnameVerifier f57148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final oOO00O f57149OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00O0 f57150OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final Proxy f57151OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ProxySelector f57152OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final List<Protocol> f57153OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final List<oo0o0O0> f57154OooOO0O;

    public o00O00(@NotNull String uriHost, int i, @NotNull o00OO000 dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable o00O0 o00o1, @NotNull oOO00O proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<oo0o0O0> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f57145OooO00o = dns;
        this.f57146OooO0O0 = socketFactory;
        this.f57147OooO0OO = sSLSocketFactory;
        this.f57148OooO0Oo = hostnameVerifier;
        this.f57150OooO0o0 = o00o1;
        this.f57149OooO0o = proxyAuthenticator;
        this.f57151OooO0oO = proxy;
        this.f57152OooO0oo = proxySelector;
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        oooO00o.OooOO0(sSLSocketFactory != null ? "https" : "http");
        oooO00o.OooO0o(uriHost);
        if (!(1 <= i && i < 65536)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(i)).toString());
        }
        oooO00o.f57217OooO0o0 = i;
        this.f57144OooO = oooO00o.OooO0OO();
        this.f57153OooOO0 = o0O000o0.OooOo(protocols);
        this.f57154OooOO0O = o0O000o0.OooOo(connectionSpecs);
    }

    public final boolean OooO00o(@NotNull o00O00 that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f57145OooO00o, that.f57145OooO00o) && Intrinsics.areEqual(this.f57149OooO0o, that.f57149OooO0o) && Intrinsics.areEqual(this.f57153OooOO0, that.f57153OooOO0) && Intrinsics.areEqual(this.f57154OooOO0O, that.f57154OooOO0O) && Intrinsics.areEqual(this.f57152OooO0oo, that.f57152OooO0oo) && Intrinsics.areEqual(this.f57151OooO0oO, that.f57151OooO0oO) && Intrinsics.areEqual(this.f57147OooO0OO, that.f57147OooO0OO) && Intrinsics.areEqual(this.f57148OooO0Oo, that.f57148OooO0Oo) && Intrinsics.areEqual(this.f57150OooO0o0, that.f57150OooO0o0) && this.f57144OooO.f57208OooO0o0 == that.f57144OooO.f57208OooO0o0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00O00) {
            o00O00 o00o01 = (o00O00) obj;
            if (Intrinsics.areEqual(this.f57144OooO, o00o01.f57144OooO) && OooO00o(o00o01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f57150OooO0o0) + ((Objects.hashCode(this.f57148OooO0Oo) + ((Objects.hashCode(this.f57147OooO0OO) + ((Objects.hashCode(this.f57151OooO0oO) + ((this.f57152OooO0oo.hashCode() + ((this.f57154OooOO0O.hashCode() + ((this.f57153OooOO0.hashCode() + ((this.f57149OooO0o.hashCode() + ((this.f57145OooO00o.hashCode() + ((this.f57144OooO.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        o00OO o00oo2 = this.f57144OooO;
        sb.append(o00oo2.f57206OooO0Oo);
        sb.append(':');
        sb.append(o00oo2.f57208OooO0o0);
        sb.append(", ");
        Proxy proxy = this.f57151OooO0oO;
        return oo000o.OooO00o(sb, proxy != null ? Intrinsics.stringPlus("proxy=", proxy) : Intrinsics.stringPlus("proxySelector=", this.f57152OooO0oo), '}');
    }
}
