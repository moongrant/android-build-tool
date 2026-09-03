package p660o0ooo0o0;

import android.support.v4.media.OooO00o;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p659o0ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final o000OOo0 f51217OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO000 f51218OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Protocol> f51219OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<o00O00OO> f51220OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O0OO0 f51221OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final SSLSocketFactory f51222OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final SocketFactory f51223OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final HostnameVerifier f51224OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final o00O000 f51225OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Proxy f51226OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ProxySelector f51227OooOO0O;

    public o000O(@NotNull String uriHost, int i, @NotNull o00O0OO0 dns, @NotNull SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable o00O000 o00o001, @NotNull o000OOo0 proxyAuthenticator, @Nullable Proxy proxy, @NotNull List<? extends Protocol> protocols, @NotNull List<o00O00OO> connectionSpecs, @NotNull ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f51221OooO0Oo = dns;
        this.f51223OooO0o0 = socketFactory;
        this.f51222OooO0o = sSLSocketFactory;
        this.f51224OooO0oO = hostnameVerifier;
        this.f51225OooO0oo = o00o001;
        this.f51217OooO = proxyAuthenticator;
        this.f51226OooOO0 = proxy;
        this.f51227OooOO0O = proxySelector;
        o00OO000.OooO00o oooO00o = new o00OO000.OooO00o();
        String scheme = sSLSocketFactory != null ? "https" : "http";
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (StringsKt.OooO(scheme, "http")) {
            oooO00o.f51391OooO00o = "http";
        } else {
            if (!StringsKt.OooO(scheme, "https")) {
                throw new IllegalArgumentException(OooOo00.OooO0Oo("unexpected scheme: ", scheme));
            }
            oooO00o.f51391OooO00o = "https";
        }
        oooO00o.OooO0o(uriHost);
        if (!(1 <= i && 65535 >= i)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("unexpected port: ", i).toString());
        }
        oooO00o.f51396OooO0o0 = i;
        this.f51218OooO00o = oooO00o.OooO0OO();
        this.f51219OooO0O0 = o00OOO00.OooOoO(protocols);
        this.f51220OooO0OO = o00OOO00.OooOoO(connectionSpecs);
    }

    public final boolean OooO00o(@NotNull o000O that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f51221OooO0Oo, that.f51221OooO0Oo) && Intrinsics.areEqual(this.f51217OooO, that.f51217OooO) && Intrinsics.areEqual(this.f51219OooO0O0, that.f51219OooO0O0) && Intrinsics.areEqual(this.f51220OooO0OO, that.f51220OooO0OO) && Intrinsics.areEqual(this.f51227OooOO0O, that.f51227OooOO0O) && Intrinsics.areEqual(this.f51226OooOO0, that.f51226OooOO0) && Intrinsics.areEqual(this.f51222OooO0o, that.f51222OooO0o) && Intrinsics.areEqual(this.f51224OooO0oO, that.f51224OooO0oO) && Intrinsics.areEqual(this.f51225OooO0oo, that.f51225OooO0oo) && this.f51218OooO00o.f51386OooO0o == that.f51218OooO00o.f51386OooO0o;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o000O) {
            o000O o000o = (o000O) obj;
            if (Intrinsics.areEqual(this.f51218OooO00o, o000o.f51218OooO00o) && OooO00o(o000o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f51225OooO0oo) + ((Objects.hashCode(this.f51224OooO0oO) + ((Objects.hashCode(this.f51222OooO0o) + ((Objects.hashCode(this.f51226OooOO0) + ((this.f51227OooOO0O.hashCode() + ((this.f51220OooO0OO.hashCode() + ((this.f51219OooO0O0.hashCode() + ((this.f51217OooO.hashCode() + ((this.f51221OooO0Oo.hashCode() + ((this.f51218OooO00o.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0;
        Object obj;
        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Address{");
        sbOooO0o1.append(this.f51218OooO00o.f51387OooO0o0);
        sbOooO0o1.append(':');
        sbOooO0o1.append(this.f51218OooO00o.f51386OooO0o);
        sbOooO0o1.append(", ");
        if (this.f51226OooOO0 != null) {
            sbOooO0o0 = OooO00o.OooO00o.OooO0o0("proxy=");
            obj = this.f51226OooOO0;
        } else {
            sbOooO0o0 = OooO00o.OooO00o.OooO0o0("proxySelector=");
            obj = this.f51227OooOO0O;
        }
        sbOooO0o0.append(obj);
        sbOooO0o1.append(sbOooO0o0.toString());
        sbOooO0o1.append("}");
        return sbOooO0o1.toString();
    }
}
