package p641o0ooOO0o;

import androidx.compose.animation.OooO0o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.TlsVersion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o00Oo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00Oo00 f57762OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00Oo00 f57763OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f57764OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f57765OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String[] f57766OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String[] f57767OooO0Oo;

    static {
        o0o0Oo o0o0oo = o0o0Oo.f57957OooOOo;
        o0o0Oo o0o0oo2 = o0o0Oo.f57959OooOOoo;
        o0o0Oo o0o0oo3 = o0o0Oo.f57960OooOo00;
        o0o0Oo o0o0oo4 = o0o0Oo.f57952OooOO0o;
        o0o0Oo o0o0oo5 = o0o0Oo.f57953OooOOO;
        o0o0Oo o0o0oo6 = o0o0Oo.f57954OooOOO0;
        o0o0Oo o0o0oo7 = o0o0Oo.f57955OooOOOO;
        o0o0Oo o0o0oo8 = o0o0Oo.f57958OooOOo0;
        o0o0Oo o0o0oo9 = o0o0Oo.f57956OooOOOo;
        o0o0Oo[] o0o0ooArr = {o0o0oo, o0o0oo2, o0o0oo3, o0o0oo4, o0o0oo5, o0o0oo6, o0o0oo7, o0o0oo8, o0o0oo9};
        o0o0Oo[] o0o0ooArr2 = {o0o0oo, o0o0oo2, o0o0oo3, o0o0oo4, o0o0oo5, o0o0oo6, o0o0oo7, o0o0oo8, o0o0oo9, o0o0Oo.f57950OooOO0, o0o0Oo.f57951OooOO0O, o0o0Oo.f57949OooO0oo, o0o0Oo.f57942OooO, o0o0Oo.f57946OooO0o, o0o0Oo.f57948OooO0oO, o0o0Oo.f57947OooO0o0};
        OooO00o oooO00o = new OooO00o();
        oooO00o.OooO0OO((o0o0Oo[]) Arrays.copyOf(o0o0ooArr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        oooO00o.OooO0o(tlsVersion, tlsVersion2);
        oooO00o.OooO0Oo();
        oooO00o.OooO00o();
        OooO00o oooO00o2 = new OooO00o();
        oooO00o2.OooO0OO((o0o0Oo[]) Arrays.copyOf(o0o0ooArr2, 16));
        oooO00o2.OooO0o(tlsVersion, tlsVersion2);
        oooO00o2.OooO0Oo();
        f57763OooO0o0 = oooO00o2.OooO00o();
        OooO00o oooO00o3 = new OooO00o();
        oooO00o3.OooO0OO((o0o0Oo[]) Arrays.copyOf(o0o0ooArr2, 16));
        oooO00o3.OooO0o(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        oooO00o3.OooO0Oo();
        oooO00o3.OooO00o();
        f57762OooO0o = new o00Oo00(false, false, null, null);
    }

    public o00Oo00(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f57764OooO00o = z;
        this.f57765OooO0O0 = z2;
        this.f57766OooO0OO = strArr;
        this.f57767OooO0Oo = strArr2;
    }

    @JvmName(name = "cipherSuites")
    @Nullable
    public final List<o0o0Oo> OooO00o() {
        String[] strArr = this.f57766OooO0OO;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(o0o0Oo.f57943OooO0O0.OooO0O0(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean OooO0O0(@NotNull SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f57764OooO00o) {
            return false;
        }
        String[] strArr = this.f57767OooO0Oo;
        if (strArr != null && !oO000o00.OooOO0(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f57766OooO0OO;
        return strArr2 == null || oO000o00.OooOO0(strArr2, socket.getEnabledCipherSuites(), o0o0Oo.f57944OooO0OO);
    }

    @JvmName(name = "tlsVersions")
    @Nullable
    public final List<TlsVersion> OooO0OO() {
        String[] strArr = this.f57767OooO0Oo;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.INSTANCE.getClass();
            arrayList.add(TlsVersion.Companion.OooO00o(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o00Oo00)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        o00Oo00 o00oo00 = (o00Oo00) obj;
        boolean z = o00oo00.f57764OooO00o;
        boolean z2 = this.f57764OooO00o;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f57766OooO0OO, o00oo00.f57766OooO0OO) && Arrays.equals(this.f57767OooO0Oo, o00oo00.f57767OooO0Oo) && this.f57765OooO0O0 == o00oo00.f57765OooO0O0);
    }

    public final int hashCode() {
        if (!this.f57764OooO00o) {
            return 17;
        }
        String[] strArr = this.f57766OooO0OO;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f57767OooO0Oo;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f57765OooO0O0 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (!this.f57764OooO00o) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append((Object) Objects.toString(OooO00o(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append((Object) Objects.toString(OooO0OO(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return OooO0o.OooO00o(sb, this.f57765OooO0O0, ')');
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f57768OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String[] f57769OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public String[] f57770OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f57771OooO0Oo;

        public OooO00o() {
            this.f57768OooO00o = true;
        }

        @NotNull
        public final o00Oo00 OooO00o() {
            return new o00Oo00(this.f57768OooO00o, this.f57771OooO0Oo, this.f57769OooO0O0, this.f57770OooO0OO);
        }

        @NotNull
        public final void OooO0O0(@NotNull String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f57768OooO00o) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.f57769OooO0O0 = (String[]) cipherSuites.clone();
        }

        @NotNull
        public final void OooO0OO(@NotNull o0o0Oo... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f57768OooO00o) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (o0o0Oo o0o0oo : cipherSuites) {
                arrayList.add(o0o0oo.f57961OooO00o);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            OooO0O0((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final void OooO0Oo() {
            if (!this.f57768OooO00o) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f57771OooO0Oo = true;
        }

        @NotNull
        public final void OooO0o(@NotNull TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f57768OooO00o) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.getJavaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            OooO0o0((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final void OooO0o0(@NotNull String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f57768OooO00o) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.f57770OooO0OO = (String[]) tlsVersions.clone();
        }

        public OooO00o(@NotNull o00Oo00 connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f57768OooO00o = connectionSpec.f57764OooO00o;
            this.f57769OooO0O0 = connectionSpec.f57766OooO0OO;
            this.f57770OooO0OO = connectionSpec.f57767OooO0Oo;
            this.f57771OooO0Oo = connectionSpec.f57765OooO0O0;
        }
    }
}
