package p669o0oooOOo;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.SuppressSignatureCheck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p670o0oooOo.v;

/* JADX INFO: loaded from: classes3.dex */
public final class rj extends v {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final X509TrustManager f51924OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final X509TrustManagerExtensions f51925OooO0O0;

    public rj(@NotNull X509TrustManager trustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f51924OooO00o = trustManager;
        this.f51925OooO0O0 = x509TrustManagerExtensions;
    }

    @Override // p670o0oooOo.v
    @SuppressSignatureCheck
    @NotNull
    public final List<Certificate> OooO00o(@NotNull List<? extends Certificate> chain, @NotNull String hostname) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        try {
            List<X509Certificate> listCheckServerTrusted = this.f51925OooO0O0.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            Intrinsics.checkNotNullExpressionValue(listCheckServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return listCheckServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof rj) && ((rj) obj).f51924OooO00o == this.f51924OooO00o;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f51924OooO00o);
    }
}
