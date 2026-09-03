package p667o0oooOO;

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
import p669o0oooOOo.ak;
import p669o0oooOOo.qj;
import p669o0oooOOo.rj;
import p669o0oooOOo.vj;
import p669o0oooOOo.wj;
import p669o0oooOOo.yj;
import p669o0oooOOo.zj;
import p670o0oooOo.v;

/* JADX INFO: loaded from: classes3.dex */
@SuppressSignatureCheck
public final class k extends s {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f51890OooO0o = new OooO00o();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final boolean f51891OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<ak> f51892OooO0Oo;

    public static final class OooO00o {
    }

    static {
        f51891OooO0o0 = s.f51921OooO0OO.OooO0OO() && Build.VERSION.SDK_INT >= 29;
    }

    public k() {
        ak[] akVarArr = new ak[4];
        akVarArr[0] = Intrinsics.areEqual("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29 ? new qj() : null;
        vj.OooO00o oooO00o = vj.f51932OooO0oO;
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
        this.f51892OooO0Oo = arrayList;
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o0oooOOo.ak>] */
    @Override // p667o0oooOO.s
    public final void OooO0Oo(@NotNull SSLSocket sslSocket, @Nullable String str, @NotNull List<? extends Protocol> protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f51892OooO0Oo.iterator();
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
        Iterator it = this.f51892OooO0Oo.iterator();
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
    @SuppressLint({"NewApi"})
    public final boolean OooO0oo(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
