package p660o0ooo0o0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
import p659o0ooo0o.o00OOO00;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O00OO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00OO f51280OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00O00OO f51281OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f51282OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f51283OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String[] f51284OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String[] f51285OooO0Oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f51286OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String[] f51287OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public String[] f51288OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f51289OooO0Oo;

        public OooO00o() {
            this.f51286OooO00o = true;
        }

        @NotNull
        public final o00O00OO OooO00o() {
            return new o00O00OO(this.f51286OooO00o, this.f51289OooO0Oo, this.f51287OooO0O0, this.f51288OooO0OO);
        }

        @NotNull
        public final OooO00o OooO0O0(@NotNull String... cipherSuites) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f51286OooO00o) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (!(!(cipherSuites.length == 0))) {
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            Object objClone = cipherSuites.clone();
            Objects.requireNonNull(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f51287OooO0O0 = (String[]) objClone;
            return this;
        }

        @NotNull
        public final OooO00o OooO0OO(@NotNull o00O00... cipherSuites) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f51286OooO00o) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (o00O00 o00o01 : cipherSuites) {
                arrayList.add(o00o01.f51252OooO00o);
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            OooO0O0((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        @Deprecated(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final OooO00o OooO0Oo() {
            if (!this.f51286OooO00o) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
            }
            this.f51289OooO0Oo = true;
            return this;
        }

        @NotNull
        public final OooO00o OooO0o(@NotNull TlsVersion... tlsVersions) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f51286OooO00o) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.getJavaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            String[] strArr = (String[]) array;
            OooO0o0((String[]) Arrays.copyOf(strArr, strArr.length));
            return this;
        }

        @NotNull
        public final OooO00o OooO0o0(@NotNull String... tlsVersions) throws CloneNotSupportedException {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f51286OooO00o) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (!(!(tlsVersions.length == 0))) {
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            Object objClone = tlsVersions.clone();
            Objects.requireNonNull(objClone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            this.f51288OooO0OO = (String[]) objClone;
            return this;
        }

        public OooO00o(@NotNull o00O00OO connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f51286OooO00o = connectionSpec.f51282OooO00o;
            this.f51287OooO0O0 = connectionSpec.f51284OooO0OO;
            this.f51288OooO0OO = connectionSpec.f51285OooO0Oo;
            this.f51289OooO0Oo = connectionSpec.f51283OooO0O0;
        }
    }

    static {
        o00O00 o00o01 = o00O00.f51249OooOOo0;
        o00O00 o00o02 = o00O00.f51248OooOOo;
        o00O00 o00o03 = o00O00.f51250OooOOoo;
        o00O00 o00o04 = o00O00.f51242OooOO0O;
        o00O00 o00o05 = o00O00.f51245OooOOO0;
        o00O00 o00o06 = o00O00.f51243OooOO0o;
        o00O00 o00o07 = o00O00.f51244OooOOO;
        o00O00 o00o08 = o00O00.f51247OooOOOo;
        o00O00 o00o09 = o00O00.f51246OooOOOO;
        o00O00[] o00o00Arr = {o00o01, o00o02, o00o03, o00o04, o00o05, o00o06, o00o07, o00o08, o00o09};
        o00O00[] o00o00Arr2 = {o00o01, o00o02, o00o03, o00o04, o00o05, o00o06, o00o07, o00o08, o00o09, o00O00.f51233OooO, o00O00.f51241OooOO0, o00O00.f51239OooO0oO, o00O00.f51240OooO0oo, o00O00.f51238OooO0o0, o00O00.f51237OooO0o, o00O00.f51236OooO0Oo};
        OooO00o oooO00o = new OooO00o();
        oooO00o.OooO0OO((o00O00[]) Arrays.copyOf(o00o00Arr, 9));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        oooO00o.OooO0o(tlsVersion, tlsVersion2);
        oooO00o.OooO0Oo();
        oooO00o.OooO00o();
        OooO00o oooO00o2 = new OooO00o();
        oooO00o2.OooO0OO((o00O00[]) Arrays.copyOf(o00o00Arr2, 16));
        oooO00o2.OooO0o(tlsVersion, tlsVersion2);
        oooO00o2.OooO0Oo();
        f51281OooO0o0 = oooO00o2.OooO00o();
        OooO00o oooO00o3 = new OooO00o();
        oooO00o3.OooO0OO((o00O00[]) Arrays.copyOf(o00o00Arr2, 16));
        oooO00o3.OooO0o(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0);
        oooO00o3.OooO0Oo();
        oooO00o3.OooO00o();
        f51280OooO0o = new o00O00OO(false, false, null, null);
    }

    public o00O00OO(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.f51282OooO00o = z;
        this.f51283OooO0O0 = z2;
        this.f51284OooO0OO = strArr;
        this.f51285OooO0Oo = strArr2;
    }

    @JvmName(name = "cipherSuites")
    @Nullable
    public final List<o00O00> OooO00o() {
        String[] strArr = this.f51284OooO0OO;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(o00O00.f51251OooOo00.OooO0O0(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean OooO0O0(@NotNull SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f51282OooO00o) {
            return false;
        }
        String[] strArr = this.f51285OooO0Oo;
        if (strArr != null && !o00OOO00.OooOO0O(strArr, socket.getEnabledProtocols(), ComparisonsKt.naturalOrder())) {
            return false;
        }
        String[] strArr2 = this.f51284OooO0OO;
        if (strArr2 == null) {
            return true;
        }
        String[] enabledCipherSuites = socket.getEnabledCipherSuites();
        o00O00.OooO0O0 oooO0O0 = o00O00.f51251OooOo00;
        Comparator<String> comparator = o00O00.f51234OooO0O0;
        return o00OOO00.OooOO0O(strArr2, enabledCipherSuites, o00O00.f51234OooO0O0);
    }

    @JvmName(name = "tlsVersions")
    @Nullable
    public final List<TlsVersion> OooO0OO() {
        String[] strArr = this.f51285OooO0Oo;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.INSTANCE.OooO00o(str));
        }
        return CollectionsKt.toList(arrayList);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o00O00OO)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.f51282OooO00o;
        o00O00OO o00o00oo2 = (o00O00OO) obj;
        if (z != o00o00oo2.f51282OooO00o) {
            return false;
        }
        return !z || (Arrays.equals(this.f51284OooO0OO, o00o00oo2.f51284OooO0OO) && Arrays.equals(this.f51285OooO0Oo, o00o00oo2.f51285OooO0Oo) && this.f51283OooO0O0 == o00o00oo2.f51283OooO0O0);
    }

    public final int hashCode() {
        if (!this.f51282OooO00o) {
            return 17;
        }
        String[] strArr = this.f51284OooO0OO;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f51285OooO0Oo;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f51283OooO0O0 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (!this.f51282OooO00o) {
            return "ConnectionSpec()";
        }
        StringBuilder sbOooO00o = Oooo0.OooO00o("ConnectionSpec(", "cipherSuites=");
        sbOooO00o.append(Objects.toString(OooO00o(), "[all enabled]"));
        sbOooO00o.append(", ");
        sbOooO00o.append("tlsVersions=");
        sbOooO00o.append(Objects.toString(OooO0OO(), "[all enabled]"));
        sbOooO00o.append(", ");
        sbOooO00o.append("supportsTlsExtensions=");
        return Oooo000.Oooo0.OooO0O0(sbOooO00o, this.f51283OooO0O0, ')');
    }
}
