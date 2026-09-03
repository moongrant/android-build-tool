package p667o0oooOO;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
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
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okhttp3.internal.SuppressSignatureCheck;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p669o0oooOOo.ak;
import p669o0oooOOo.bk;
import p669o0oooOOo.rj;
import p669o0oooOOo.vj;
import p669o0oooOOo.wj;
import p669o0oooOOo.xj;
import p669o0oooOOo.yj;
import p669o0oooOOo.zj;
import p670o0oooOo.v;
import p670o0oooOo.x;

/* JADX INFO: loaded from: classes3.dex */
@SuppressSignatureCheck
public final class l extends s {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final boolean f51893OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f51894OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<ak> f51895OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final xj f51896OooO0o0;

    public static final class OooO00o {
    }

    public static final class OooO0O0 implements x {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final X509TrustManager f51897OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Method f51898OooO0O0;

        public OooO0O0(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f51897OooO00o = trustManager;
            this.f51898OooO0O0 = findByIssuerAndSignatureMethod;
        }

        @Override // p670o0oooOo.x
        @Nullable
        public final X509Certificate OooO00o(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f51898OooO0O0.invoke(this.f51897OooO00o, cert);
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
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return Intrinsics.areEqual(this.f51897OooO00o, oooO0O0.f51897OooO00o) && Intrinsics.areEqual(this.f51898OooO0O0, oooO0O0.f51898OooO0O0);
        }

        public final int hashCode() {
            X509TrustManager x509TrustManager = this.f51897OooO00o;
            int iHashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
            Method method = this.f51898OooO0O0;
            return iHashCode + (method != null ? method.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CustomTrustRootIndex(trustManager=");
            sbOooO0o0.append(this.f51897OooO00o);
            sbOooO0o0.append(", findByIssuerAndSignatureMethod=");
            sbOooO0o0.append(this.f51898OooO0O0);
            sbOooO0o0.append(")");
            return sbOooO0o0.toString();
        }
    }

    static {
        boolean z = false;
        if (s.f51921OooO0OO.OooO0OO() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f51893OooO0o = z;
    }

    public l() throws NoSuchMethodException {
        bk bkVar;
        Method method;
        Method method2;
        ak[] akVarArr = new ak[4];
        bk.OooO00o oooO00o = bk.f51923OooO0oo;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl");
            Class<?> paramsClass = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
            bkVar = new bk(cls, cls2, paramsClass);
        } catch (Exception e) {
            s.f51919OooO00o.OooO("unable to load android socket classes", 5, e);
            bkVar = null;
        }
        akVarArr[0] = bkVar;
        vj.OooO00o oooO00o2 = vj.f51932OooO0oO;
        akVarArr[1] = new zj(vj.f51931OooO0o);
        akVarArr[2] = new zj(yj.f51942OooO00o);
        akVarArr[3] = new zj(wj.f51938OooO00o);
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) akVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((ak) obj).OooO0O0()) {
                arrayList.add(obj);
            }
        }
        this.f51895OooO0Oo = arrayList;
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
        this.f51896OooO0o0 = new xj(method3, method2, method);
    }

    @Override // p667o0oooOO.s
    @NotNull
    public final v OooO0O0(@NotNull X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        rj rjVar = x509TrustManagerExtensions != null ? new rj(trustManager, x509TrustManagerExtensions) : null;
        return rjVar != null ? rjVar : super.OooO0O0(trustManager);
    }

    @Override // p667o0oooOO.s
    @NotNull
    public final x OooO0OO(@NotNull X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            method.setAccessible(true);
            return new OooO0O0(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.OooO0OO(trustManager);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o0oooOOo.ak>] */
    @Override // p667o0oooOO.s
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f51895OooO0Oo.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ak) next).OooO00o(sslSocket));
        ak akVar = (ak) next;
        if (akVar != null) {
            akVar.OooO0Oo(sslSocket, str, protocols);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0oooOOo.ak>] */
    @Override // p667o0oooOO.s
    @Nullable
    public final String OooO0o(@NotNull SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f51895OooO0Oo.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ak) next).OooO00o(sslSocket));
        ak akVar = (ak) next;
        if (akVar != null) {
            return akVar.OooO0OO(sslSocket);
        }
        return null;
    }

    @Override // p667o0oooOO.s
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

    @Override // p667o0oooOO.s
    @Nullable
    public final Object OooO0oO() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        xj xjVar = this.f51896OooO0o0;
        Objects.requireNonNull(xjVar);
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = xjVar.f51939OooO00o;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = xjVar.f51940OooO0O0;
            Intrinsics.checkNotNull(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p667o0oooOO.s
    public final boolean OooO0oo(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
        }
        if (i < 23) {
            return true;
        }
        NetworkSecurityPolicy networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        Intrinsics.checkNotNullExpressionValue(networkSecurityPolicy, "NetworkSecurityPolicy.getInstance()");
        return networkSecurityPolicy.isCleartextTrafficPermitted();
    }

    @Override // p667o0oooOO.s
    public final void OooOO0O(@NotNull String message, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(message, "message");
        xj xjVar = this.f51896OooO0o0;
        Objects.requireNonNull(xjVar);
        boolean z = false;
        if (obj != null) {
            try {
                Method method = xjVar.f51941OooO0OO;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        s.OooOO0(this, message, 5, null, 4, null);
    }
}
