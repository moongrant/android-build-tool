package p657o0ooo0o0;

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
import p656o0ooo0o.oO000Oo0;
import p656o0ooo0o.oO00O0o;
import p656o0ooo0o.oO00O0o0;
import p656o0ooo0o.oO00O0oO;
import p656o0ooo0o.oO00OO0O;
import p656o0ooo0o.oO00OOO;
import p656o0ooo0o.oO0OOo0o;
import p661o0oooO00.o0000O0O;

/* JADX INFO: loaded from: classes5.dex */
@SuppressSignatureCheck
public final class o0000oo extends o000O0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final boolean f59614OooO0Oo;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayList f59615OooO0OO;

    static {
        f59614OooO0Oo = o000O0o.OooO00o.OooO0OO() && Build.VERSION.SDK_INT >= 29;
    }

    public o0000oo() {
        oO00OOO[] oo00oooArr = new oO00OOO[4];
        oo00oooArr[0] = o000O0o.OooO00o.OooO0OO() && Build.VERSION.SDK_INT >= 29 ? new oO0OOo0o() : null;
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
        this.f59615OooO0OO = arrayList;
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
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f59615OooO0OO.iterator();
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
        Iterator it = this.f59615OooO0OO.iterator();
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
    @SuppressLint({"NewApi"})
    public final boolean OooO0oo(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
