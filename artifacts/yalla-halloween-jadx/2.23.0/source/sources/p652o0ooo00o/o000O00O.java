package p652o0ooo00o;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
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

/* JADX INFO: loaded from: classes5.dex */
public final class o000O00O extends o000O0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f60028OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Provider f60029OooO0OO;

    public static final class OooO00o {
    }

    public static final class OooO0O0 implements ConscryptHostnameVerifier {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f60030OooO0Oo = new OooO0O0();

        @Override // org.conscrypt.ConscryptHostnameVerifier
        public final boolean verify(@Nullable String str, @Nullable SSLSession sSLSession) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    static {
        boolean z;
        boolean z2 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, OooO00o.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
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
        f60028OooO0Oo = z2;
    }

    public o000O00O() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "newProvider()");
        this.f60029OooO0OO = providerNewProvider;
    }

    @Override // p652o0ooo00o.o000O0O0
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.OooO0Oo(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = o000O0O0.OooO00o.OooO00o(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // p652o0ooo00o.o000O0O0
    @Nullable
    public final String OooO0o(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return null;
    }

    @Override // p652o0ooo00o.o000O0O0
    @NotNull
    public final SSLContext OooOO0o() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f60029OooO0OO);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p652o0ooo00o.o000O0O0
    @NotNull
    public final X509TrustManager OooOOO() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String string = Arrays.toString(trustManagers);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, OooO0O0.f60030OooO0Oo);
        return x509TrustManager;
    }

    @Override // p652o0ooo00o.o000O0O0
    @NotNull
    public final SSLSocketFactory OooOOO0(@NotNull X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContextOooOO0o = OooOO0o();
        sSLContextOooOO0o.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = sSLContextOooOO0o.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }
}
