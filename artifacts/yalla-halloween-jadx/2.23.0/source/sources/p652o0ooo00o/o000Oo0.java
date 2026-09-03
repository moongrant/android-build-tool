package p652o0ooo00o;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooo0.o00O;
import p649o0ooo0.o00O0O00;
import p649o0ooo0.o00O0OO;
import p649o0ooo0.o00O0OOO;
import p649o0ooo0.o00OO000;
import p649o0ooo0.o00OO00O;
import p649o0ooo0.oo0o0O0;
import p649o0ooo0.oo0oOO0;
import p655o0ooo0o0.o0000O;
import p655o0ooo0o0.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
@SuppressSignatureCheck
public final class o000Oo0 extends o000O0O0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f60038OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f60039OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O0OOO f60040OooO0Oo;

    public static final class OooO00o implements o0000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final X509TrustManager f60041OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Method f60042OooO0O0;

        public OooO00o(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f60041OooO00o = trustManager;
            this.f60042OooO0O0 = findByIssuerAndSignatureMethod;
        }

        @Override // p655o0ooo0o0.o0000O
        @Nullable
        public final X509Certificate OooO00o(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f60042OooO0O0.invoke(this.f60041OooO00o, cert);
                if (objInvoke != null) {
                    return ((TrustAnchor) objInvoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f60041OooO00o, oooO00o.f60041OooO00o) && Intrinsics.areEqual(this.f60042OooO0O0, oooO00o.f60042OooO0O0);
        }

        public final int hashCode() {
            return this.f60042OooO0O0.hashCode() + (this.f60041OooO00o.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f60041OooO00o + ", findByIssuerAndSignatureMethod=" + this.f60042OooO0O0 + ')';
        }
    }

    static {
        f60038OooO0o0 = o000O0O0.OooO00o.OooO0OO() && Build.VERSION.SDK_INT < 30;
    }

    public o000Oo0() throws NoSuchMethodException {
        o00OO00O o00oo00o;
        Method method;
        Method method2;
        o00OO000[] o00oo000Arr = new o00OO000[4];
        int i = o00OO00O.f59820OooO0oO;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME);
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            Class<?> cls2 = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl"));
            Class<?> paramsClass = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".SSLParametersImpl"));
            Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
            o00oo00o = new o00OO00O(cls, cls2, paramsClass);
        } catch (Exception e) {
            o000O0O0.f60031OooO00o.getClass();
            o000O0O0.OooO(e, 5, "unable to load android socket classes");
            o00oo00o = null;
        }
        o00oo000Arr[0] = o00oo00o;
        o00oo000Arr[1] = new o00O(oo0o0O0.f59821OooO0o);
        o00oo000Arr[2] = new o00O(oo0oOO0.f59827OooO00o);
        o00oo000Arr[3] = new o00O(o00O0OO.f59815OooO00o);
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) o00oo000Arr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((o00OO000) obj).OooO0O0()) {
                arrayList.add(obj);
            }
        }
        this.f60039OooO0OO = arrayList;
        try {
            Class<?> cls3 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls3.getMethod("get", new Class[0]);
            method2 = cls3.getMethod("open", String.class);
            method = cls3.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f60040OooO0Oo = new o00O0OOO(method3, method2, method);
    }

    @Override // p652o0ooo00o.o000O0O0
    @NotNull
    public final o0000O0O OooO0O0(@NotNull X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        o00O0O00 o00o0o01 = x509TrustManagerExtensions != null ? new o00O0O00(trustManager, x509TrustManagerExtensions) : null;
        return o00o0o01 == null ? super.OooO0O0(trustManager) : o00o0o01;
    }

    @Override // p652o0ooo00o.o000O0O0
    @NotNull
    public final o0000O OooO0OO(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new OooO00o(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.OooO0OO(trustManager);
        }
    }

    @Override // p652o0ooo00o.o000O0O0
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f60039OooO0OO.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((o00OO000) next).OooO00o(sslSocket));
        o00OO000 o00oo001 = (o00OO000) next;
        if (o00oo001 == null) {
            return;
        }
        o00oo001.OooO0Oo(sslSocket, str, protocols);
    }

    @Override // p652o0ooo00o.o000O0O0
    @Nullable
    public final String OooO0o(@NotNull SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f60039OooO0OO.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((o00OO000) next).OooO00o(sslSocket));
        o00OO000 o00oo001 = (o00OO000) next;
        if (o00oo001 == null) {
            return null;
        }
        return o00oo001.OooO0OO(sslSocket);
    }

    @Override // p652o0ooo00o.o000O0O0
    public final void OooO0o0(@NotNull Socket socket, @NotNull InetSocketAddress address, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // p652o0ooo00o.o000O0O0
    @Nullable
    public final Object OooO0oO() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        o00O0OOO o00o0ooo2 = this.f60040OooO0Oo;
        o00o0ooo2.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = o00o0ooo2.f59817OooO00o;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = o00o0ooo2.f59818OooO0O0;
            Intrinsics.checkNotNull(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p652o0ooo00o.o000O0O0
    public final boolean OooO0oo(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // p652o0ooo00o.o000O0O0
    public final void OooOO0O(@Nullable Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        o00O0OOO o00o0ooo2 = this.f60040OooO0Oo;
        o00o0ooo2.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                Method method = o00o0ooo2.f59819OooO0OO;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        o000O0O0.OooOO0(this, message, 5, 4);
    }
}
