package p412o0Oo0o00;

import android.support.v4.media.OooO00o;
import com.squareup.okhttp.Protocol;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p086o000OooO.o0O0O00;
import p413o0Oo0o0O.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<Protocol> f39335OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Proxy f39336OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f39337OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39338OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SocketFactory f39339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HostnameVerifier f39340OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SSLSocketFactory f39341OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000OO f39342OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000000 f39343OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<o0000oo> f39344OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ProxySelector f39345OooOO0O;

    public o000OOo(String str, int i, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, o00000OO o00000oo2, o000000 o000000Var, Proxy proxy, List<Protocol> list, List<o0000oo> list2, ProxySelector proxySelector) {
        Objects.requireNonNull(str, "uriHost == null");
        if (i <= 0) {
            throw new IllegalArgumentException(OooO00o.OooO00o("uriPort <= 0: ", i));
        }
        if (o000000Var == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        if (proxySelector == null) {
            throw new IllegalArgumentException("proxySelector == null");
        }
        this.f39336OooO00o = proxy;
        this.f39337OooO0O0 = str;
        this.f39338OooO0OO = i;
        this.f39339OooO0Oo = socketFactory;
        this.f39341OooO0o0 = sSLSocketFactory;
        this.f39340OooO0o = hostnameVerifier;
        this.f39342OooO0oO = o00000oo2;
        this.f39343OooO0oo = o000000Var;
        this.f39335OooO = o000000.OooO0oo(list);
        this.f39344OooOO0 = o000000.OooO0oo(list2);
        this.f39345OooOO0O = proxySelector;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o000OOo)) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) obj;
        return o000000.OooO0o(this.f39336OooO00o, o000ooo2.f39336OooO00o) && this.f39337OooO0O0.equals(o000ooo2.f39337OooO0O0) && this.f39338OooO0OO == o000ooo2.f39338OooO0OO && o000000.OooO0o(this.f39341OooO0o0, o000ooo2.f39341OooO0o0) && o000000.OooO0o(this.f39340OooO0o, o000ooo2.f39340OooO0o) && o000000.OooO0o(this.f39342OooO0oO, o000ooo2.f39342OooO0oO) && o000000.OooO0o(this.f39343OooO0oo, o000ooo2.f39343OooO0oo) && o000000.OooO0o(this.f39335OooO, o000ooo2.f39335OooO) && o000000.OooO0o(this.f39344OooOO0, o000ooo2.f39344OooOO0) && o000000.OooO0o(this.f39345OooOO0O, o000ooo2.f39345OooOO0O);
    }

    public final int hashCode() {
        Proxy proxy = this.f39336OooO00o;
        int iOooO00o = (o0O0O00.OooO00o(this.f39337OooO0O0, ((proxy != null ? proxy.hashCode() : 0) + 527) * 31, 31) + this.f39338OooO0OO) * 31;
        SSLSocketFactory sSLSocketFactory = this.f39341OooO0o0;
        int iHashCode = (iOooO00o + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f39340OooO0o;
        int iHashCode2 = (iHashCode + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        o00000OO o00000oo2 = this.f39342OooO0oO;
        return this.f39345OooOO0O.hashCode() + ((this.f39344OooOO0.hashCode() + ((this.f39335OooO.hashCode() + ((this.f39343OooO0oo.hashCode() + ((iHashCode2 + (o00000oo2 != null ? o00000oo2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
