package p667o0oooOO;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends s {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f51902OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f51903OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Provider f51904OooO0Oo;

    public static final class OooO00o {
    }

    public static final class OooO0O0 implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f51905Oooo0o = new OooO0O0();

        @Override // org.conscrypt.ConscryptHostnameVerifier
        public final boolean verify(@Nullable String str, @Nullable SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x0030  */
    static {
        boolean z;
        OooO00o oooO00o = new OooO00o();
        f51902OooO0o = oooO00o;
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, oooO00o.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                Objects.requireNonNull(oooO00o);
                Conscrypt.Version version = Conscrypt.version();
                if (version.major() != 2) {
                    if (version.major() > 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (version.minor() != 1) {
                    if (version.minor() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (version.patch() >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f51903OooO0o0 = z2;
    }

    public n() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "Conscrypt.newProvider()");
        this.f51904OooO0Oo = providerNewProvider;
    }

    @Override // p667o0oooOO.s
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.OooO0Oo(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = ((ArrayList) s.f51921OooO0OO.OooO00o(protocols)).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // p667o0oooOO.s
    @Nullable
    public final String OooO0o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Override // p667o0oooOO.s
    @NotNull
    public final SSLContext OooOO0o() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f51904OooO0Oo);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p667o0oooOO.s
    @NotNull
    public final X509TrustManager OooOOO() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        Intrinsics.checkNotNullExpressionValue(trustManagerFactory, "TrustManagerFactory.getI…(null as KeyStore?)\n    }");
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
            TrustManager trustManager = trustManagers[0];
            Objects.requireNonNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
            Conscrypt.setHostnameVerifier(x509TrustManager, OooO0O0.f51905Oooo0o);
            return x509TrustManager;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sbOooO0o0.append(string);
        throw new IllegalStateException(sbOooO0o0.toString().toString());
    }

    @Override // p667o0oooOO.s
    @NotNull
    public final SSLSocketFactory OooOOO0(@NotNull X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f51904OooO0Oo);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "SSLContext.getInstance(\"TLS\", provider)");
        sSLContext.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }
}
