package p634o0ooO0oO;

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
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final oo0o0O0 f57371OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final oo0o0O0 f57372OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f57373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f57374OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String[] f57375OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final String[] f57376OooO0Oo;

    static {
        o00O0O0 o00o0o0 = o00O0O0.f57191OooOOo;
        o00O0O0 o00o0o1 = o00O0O0.f57193OooOOoo;
        o00O0O0 o00o0o2 = o00O0O0.f57194OooOo00;
        o00O0O0 o00o0o3 = o00O0O0.f57186OooOO0o;
        o00O0O0 o00o0o4 = o00O0O0.f57187OooOOO;
        o00O0O0 o00o0o5 = o00O0O0.f57188OooOOO0;
        o00O0O0 o00o0o6 = o00O0O0.f57189OooOOOO;
        o00O0O0 o00o0o7 = o00O0O0.f57192OooOOo0;
        o00O0O0 o00o0o8 = o00O0O0.f57190OooOOOo;
        o00O0O0[] o00o0o0Arr = {o00o0o0, o00o0o1, o00o0o2, o00o0o3, o00o0o4, o00o0o5, o00o0o6, o00o0o7, o00o0o8};
        o00O0O0[] o00o0o0Arr2 = {o00o0o0, o00o0o1, o00o0o2, o00o0o3, o00o0o4, o00o0o5, o00o0o6, o00o0o7, o00o0o8, o00O0O0.f57184OooOO0, o00O0O0.f57185OooOO0O, o00O0O0.f57183OooO0oo, o00O0O0.f57176OooO, o00O0O0.f57180OooO0o, o00O0O0.f57182OooO0oO, o00O0O0.f57181OooO0o0};
        OooO00o oooO00o = new OooO00o();
        oooO00o.OooO0OO((o00O0O0[]) Arrays.copyOf(o00o0o0Arr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        oooO00o.OooO0o(tlsVersion, tlsVersion2);
        oooO00o.OooO0Oo();
        oooO00o.OooO00o();
        OooO00o oooO00o2 = new OooO00o();
        oooO00o2.OooO0OO((o00O0O0[]) Arrays.copyOf(o00o0o0Arr2, 16));
        oooO00o2.OooO0o(tlsVersion, tlsVersion2);
        oooO00o2.OooO0Oo();
        f57372OooO0o0 = oooO00o2.OooO00o();
        OooO00o oooO00o3 = new OooO00o();
        oooO00o3.OooO0OO((o00O0O0[]) Arrays.copyOf(o00o0o0Arr2, 16));
        oooO00o3.OooO0o(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        oooO00o3.OooO0Oo();
        oooO00o3.OooO00o();
        f57371OooO0o = new oo0o0O0(false, false, null, null);
    }

    public oo0o0O0(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f57373OooO00o = z;
        this.f57374OooO0O0 = z2;
        this.f57375OooO0OO = strArr;
        this.f57376OooO0Oo = strArr2;
    }

    @JvmName(name = "cipherSuites")
    @Nullable
    public final List<o00O0O0> OooO00o() {
        String[] strArr = this.f57375OooO0OO;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(o00O0O0.f57177OooO0O0.OooO0O0(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean OooO0O0(@NotNull SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f57373OooO00o) {
            return false;
        }
        String[] strArr = this.f57376OooO0Oo;
        if (strArr != null && !o0O000o0.OooOO0(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f57375OooO0OO;
        return strArr2 == null || o0O000o0.OooOO0(strArr2, socket.getEnabledCipherSuites(), o00O0O0.f57178OooO0OO);
    }

    @JvmName(name = "tlsVersions")
    @Nullable
    public final List<TlsVersion> OooO0OO() {
        String[] strArr = this.f57376OooO0Oo;
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
        if (!(obj instanceof oo0o0O0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        oo0o0O0 oo0o0o0 = (oo0o0O0) obj;
        boolean z = oo0o0o0.f57373OooO00o;
        boolean z2 = this.f57373OooO00o;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.f57375OooO0OO, oo0o0o0.f57375OooO0OO) && Arrays.equals(this.f57376OooO0Oo, oo0o0o0.f57376OooO0Oo) && this.f57374OooO0O0 == oo0o0o0.f57374OooO0O0);
    }

    public final int hashCode() {
        if (!this.f57373OooO00o) {
            return 17;
        }
        String[] strArr = this.f57375OooO0OO;
        int iHashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.f57376OooO0Oo;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f57374OooO0O0 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (!this.f57373OooO00o) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append((Object) Objects.toString(OooO00o(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append((Object) Objects.toString(OooO0OO(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return OooO0o.OooO00o(sb, this.f57374OooO0O0, ')');
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f57377OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String[] f57378OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public String[] f57379OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f57380OooO0Oo;

        public OooO00o() {
            this.f57377OooO00o = true;
        }

        @NotNull
        public final oo0o0O0 OooO00o() {
            return new oo0o0O0(this.f57377OooO00o, this.f57380OooO0Oo, this.f57378OooO0O0, this.f57379OooO0OO);
        }

        @NotNull
        public final void OooO0O0(@NotNull String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f57377OooO00o) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            this.f57378OooO0O0 = (String[]) cipherSuites.clone();
        }

        @NotNull
        public final void OooO0OO(@NotNull o00O0O0... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f57377OooO00o) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (o00O0O0 o00o0o0 : cipherSuites) {
                arrayList.add(o00o0o0.f57195OooO00o);
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
            if (!this.f57377OooO00o) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f57380OooO0Oo = true;
        }

        @NotNull
        public final void OooO0o(@NotNull TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f57377OooO00o) {
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
            if (!this.f57377OooO00o) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            this.f57379OooO0OO = (String[]) tlsVersions.clone();
        }

        public OooO00o(@NotNull oo0o0O0 connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f57377OooO00o = connectionSpec.f57373OooO00o;
            this.f57378OooO0O0 = connectionSpec.f57375OooO0OO;
            this.f57379OooO0OO = connectionSpec.f57376OooO0Oo;
            this.f57380OooO0Oo = connectionSpec.f57374OooO0O0;
        }
    }
}
