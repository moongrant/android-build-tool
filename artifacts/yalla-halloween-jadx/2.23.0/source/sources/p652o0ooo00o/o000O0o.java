package p652o0ooo00o;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
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
import p649o0ooo0.o00O0;
import p649o0ooo0.o00O0O00;
import p649o0ooo0.o00O0OO;
import p649o0ooo0.o00OO000;
import p649o0ooo0.oo0o0O0;
import p649o0ooo0.oo0oOO0;
import p655o0ooo0o0.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
@SuppressSignatureCheck
public final class o000O0o extends o000O0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f60034OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f60035OooO0OO;

    static {
        f60034OooO0Oo = o000O0O0.OooO00o.OooO0OO() && Build.VERSION.SDK_INT >= 29;
    }

    public o000O0o() {
        o00OO000[] o00oo000Arr = new o00OO000[4];
        o00oo000Arr[0] = o000O0O0.OooO00o.OooO0OO() && Build.VERSION.SDK_INT >= 29 ? new o00O0() : null;
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
        this.f60035OooO0OO = arrayList;
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
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f60035OooO0OO.iterator();
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
        Iterator it = this.f60035OooO0OO.iterator();
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
    @SuppressLint({"NewApi"})
    public final boolean OooO0oo(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
