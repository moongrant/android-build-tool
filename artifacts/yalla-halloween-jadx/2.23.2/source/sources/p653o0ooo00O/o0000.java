package p653o0ooo00O;

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
import p641o0ooOO0o.o00Oo00;
import p641o0ooOO0o.o0o0Oo;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<o00Oo00> f59299OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f59300OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f59301OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f59302OooO0Oo;

    public o0000(@NotNull List<o00Oo00> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f59299OooO00o = connectionSpecs;
    }

    @NotNull
    public final o00Oo00 OooO00o(@NotNull SSLSocket sslSocket) throws IOException {
        o00Oo00 o00oo00;
        boolean z;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.f59300OooO0O0;
        List<o00Oo00> list = this.f59299OooO00o;
        int size = list.size();
        while (true) {
            if (i >= size) {
                o00oo00 = null;
                break;
            }
            int i2 = i + 1;
            o00oo00 = list.get(i);
            if (o00oo00.OooO0O0(sslSocket)) {
                this.f59300OooO0O0 = i2;
                break;
            }
            i = i2;
        }
        if (o00oo00 == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f59302OooO0Oo);
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
        int i3 = this.f59300OooO0O0;
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
        this.f59301OooO0OO = z;
        boolean z2 = this.f59302OooO0Oo;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = o00oo00.f57766OooO0OO;
        if (strArr != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = oO000o00.OooOOOo(enabledCipherSuites, strArr, o0o0Oo.f57944OooO0OO);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = o00oo00.f57767OooO0Oo;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = oO000o00.OooOOOo(enabledProtocols2, strArr2, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        o0o0Oo.OooO00o comparator = o0o0Oo.f57944OooO0OO;
        byte[] bArr = oO000o00.f58124OooO00o;
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
        o00Oo00.OooO00o oooO00o = new o00Oo00.OooO00o(o00oo00);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        oooO00o.OooO0O0((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        oooO00o.OooO0o0((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        o00Oo00 o00oo00OooO00o = oooO00o.OooO00o();
        if (o00oo00OooO00o.OooO0OO() != null) {
            sslSocket.setEnabledProtocols(o00oo00OooO00o.f57767OooO0Oo);
        }
        if (o00oo00OooO00o.OooO00o() != null) {
            sslSocket.setEnabledCipherSuites(o00oo00OooO00o.f57766OooO0OO);
        }
        return o00oo00;
    }
}
