package p657o0ooo0o0;

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
import p656o0ooo0o.oO000Oo0;
import p656o0ooo0o.oO00O0o;
import p656o0ooo0o.oO00O0o0;
import p656o0ooo0o.oO00O0oO;
import p656o0ooo0o.oO00OO0O;
import p656o0ooo0o.oO00OOO;
import p656o0ooo0o.oO00OOOo;
import p656o0ooo0o.oOo00OO0;
import p661o0oooO00.o0000O;
import p661o0oooO00.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
@SuppressSignatureCheck
public final class o0000O0 extends o000O0o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f59607OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f59608OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oOo00OO0 f59609OooO0Oo;

    public static final class OooO00o implements o0000O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final X509TrustManager f59610OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Method f59611OooO0O0;

        public OooO00o(@NotNull X509TrustManager trustManager, @NotNull Method findByIssuerAndSignatureMethod) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f59610OooO00o = trustManager;
            this.f59611OooO0O0 = findByIssuerAndSignatureMethod;
        }

        @Override // p661o0oooO00.o0000O
        @Nullable
        public final X509Certificate OooO00o(@NotNull X509Certificate cert) {
            Intrinsics.checkNotNullParameter(cert, "cert");
            try {
                Object objInvoke = this.f59611OooO0O0.invoke(this.f59610OooO00o, cert);
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
            return Intrinsics.areEqual(this.f59610OooO00o, oooO00o.f59610OooO00o) && Intrinsics.areEqual(this.f59611OooO0O0, oooO00o.f59611OooO0O0);
        }

        public final int hashCode() {
            return this.f59611OooO0O0.hashCode() + (this.f59610OooO00o.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f59610OooO00o + ", findByIssuerAndSignatureMethod=" + this.f59611OooO0O0 + ')';
        }
    }

    static {
        f59607OooO0o0 = o000O0o.OooO00o.OooO0OO() && Build.VERSION.SDK_INT < 30;
    }

    public o0000O0() throws NoSuchMethodException {
        oO00OOOo oo00oooo;
        Method method;
        Method method2;
        oO00OOO[] oo00oooArr = new oO00OOO[4];
        int i = oO00OOOo.f59593OooO0oO;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME);
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            Class<?> cls2 = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl"));
            Class<?> paramsClass = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".SSLParametersImpl"));
            Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
            oo00oooo = new oO00OOOo(cls, cls2, paramsClass);
        } catch (Exception e) {
            o000O0o.f59618OooO00o.getClass();
            o000O0o.OooO(e, 5, "unable to load android socket classes");
            oo00oooo = null;
        }
        oo00oooArr[0] = oo00oooo;
        oo00oooArr[1] = new oO00OO0O(oO00O0o0.f59584OooO0o);
        oo00oooArr[2] = new oO00OO0O(oO00O0oO.f59590OooO00o);
        oo00oooArr[3] = new oO00OO0O(oO00O0o.f59583OooO00o);
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) oo00oooArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOfNotNull) {
            if (((oO00OOO) obj).OooO0O0()) {
                arrayList.add(obj);
            }
        }
        this.f59608OooO0OO = arrayList;
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
        this.f59609OooO0Oo = new oOo00OO0(method3, method2, method);
    }

    @Override // p657o0ooo0o0.o000O0o
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
        oO000Oo0 oo000oo0 = x509TrustManagerExtensions != null ? new oO000Oo0(trustManager, x509TrustManagerExtensions) : null;
        return oo000oo0 == null ? super.OooO0O0(trustManager) : oo000oo0;
    }

    @Override // p657o0ooo0o0.o000O0o
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

    @Override // p657o0ooo0o0.o000O0o
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f59608OooO0OO.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((oO00OOO) next).OooO00o(sslSocket));
        oO00OOO oo00ooo = (oO00OOO) next;
        if (oo00ooo == null) {
            return;
        }
        oo00ooo.OooO0Oo(sslSocket, str, protocols);
    }

    @Override // p657o0ooo0o0.o000O0o
    @Nullable
    public final String OooO0o(@NotNull SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f59608OooO0OO.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((oO00OOO) next).OooO00o(sslSocket));
        oO00OOO oo00ooo = (oO00OOO) next;
        if (oo00ooo == null) {
            return null;
        }
        return oo00ooo.OooO0OO(sslSocket);
    }

    @Override // p657o0ooo0o0.o000O0o
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

    @Override // p657o0ooo0o0.o000O0o
    @Nullable
    public final Object OooO0oO() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        oOo00OO0 ooo00oo0 = this.f59609OooO0Oo;
        ooo00oo0.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = ooo00oo0.f59595OooO00o;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            Method method2 = ooo00oo0.f59596OooO0O0;
            Intrinsics.checkNotNull(method2);
            method2.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p657o0ooo0o0.o000O0o
    public final boolean OooO0oo(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    @Override // p657o0ooo0o0.o000O0o
    public final void OooOO0O(@Nullable Object obj, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        oOo00OO0 ooo00oo0 = this.f59609OooO0Oo;
        ooo00oo0.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                Method method = ooo00oo0.f59597OooO0OO;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        o000O0o.OooOO0(this, message, 5, 4);
    }
}
