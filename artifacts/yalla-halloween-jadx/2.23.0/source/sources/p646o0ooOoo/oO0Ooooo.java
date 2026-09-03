package p646o0ooOoo;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00O0O0;
import p634o0ooO0oO.oo0o0O0;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0Ooooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<oo0o0O0> f59685OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f59686OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f59687OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f59688OooO0Oo;

    public oO0Ooooo(@NotNull List<oo0o0O0> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f59685OooO00o = connectionSpecs;
    }

    @NotNull
    public final oo0o0O0 OooO00o(@NotNull SSLSocket sslSocket) throws IOException {
        oo0o0O0 oo0o0o0;
        boolean z;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.f59686OooO0O0;
        List<oo0o0O0> list = this.f59685OooO00o;
        int size = list.size();
        while (true) {
            if (i >= size) {
                oo0o0o0 = null;
                break;
            }
            int i2 = i + 1;
            oo0o0o0 = list.get(i);
            if (oo0o0o0.OooO0O0(sslSocket)) {
                this.f59686OooO0O0 = i2;
                break;
            }
            i = i2;
        }
        if (oo0o0o0 == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f59688OooO0Oo);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f59686OooO0O0;
        int size2 = list.size();
        while (true) {
            if (i3 >= size2) {
                z = false;
                break;
            }
            int i4 = i3 + 1;
            if (list.get(i3).OooO0O0(sslSocket)) {
                z = true;
                break;
            }
            i3 = i4;
        }
        this.f59687OooO0OO = z;
        boolean z2 = this.f59688OooO0Oo;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = oo0o0o0.f57375OooO0OO;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = o0O000o0.OooOOOo(enabledCipherSuites, strArr, o00O0O0.f57178OooO0OO);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = oo0o0o0.f57376OooO0Oo;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = o0O000o0.OooOOOo(enabledProtocols2, strArr2, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        o00O0O0.OooO00o comparator = o00O0O0.f57178OooO0OO;
        byte[] bArr = o0O000o0.f57386OooO00o;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i5], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i5++;
        }
        if (z2 && i5 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = supportedCipherSuites[i5];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[ArraysKt.getLastIndex(cipherSuitesIntersection)] = value;
        }
        oo0o0O0.OooO00o oooO00o = new oo0o0O0.OooO00o(oo0o0o0);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        oooO00o.OooO0O0((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        oooO00o.OooO0o0((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        oo0o0O0 oo0o0o0OooO00o = oooO00o.OooO00o();
        if (oo0o0o0OooO00o.OooO0OO() != null) {
            sslSocket.setEnabledProtocols(oo0o0o0OooO00o.f57376OooO0Oo);
        }
        if (oo0o0o0OooO00o.OooO00o() != null) {
            sslSocket.setEnabledCipherSuites(oo0o0o0OooO00o.f57375OooO0OO);
        }
        return oo0o0o0;
    }
}
