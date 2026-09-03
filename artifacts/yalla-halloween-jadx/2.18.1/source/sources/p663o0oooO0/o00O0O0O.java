package p663o0oooO0;

import OooO00o.OooO00o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OOO00;
import p660o0ooo0o0.o00O00;
import p660o0ooo0o0.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f51722OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f51723OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f51724OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o00O00OO> f51725OooO0Oo;

    public o00O0O0O(@NotNull List<o00O00OO> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f51725OooO0Oo = connectionSpecs;
    }

    @NotNull
    public final o00O00OO OooO00o(@NotNull SSLSocket sslSocket) throws IOException, CloneNotSupportedException {
        o00O00OO o00o00oo2;
        boolean z;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.f51722OooO00o;
        int size = this.f51725OooO0Oo.size();
        while (true) {
            if (i >= size) {
                o00o00oo2 = null;
                break;
            }
            o00o00oo2 = this.f51725OooO0Oo.get(i);
            if (o00o00oo2.OooO0O0(sslSocket)) {
                this.f51722OooO00o = i + 1;
                break;
            }
            i++;
        }
        if (o00o00oo2 == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unable to find acceptable protocols. isFallback=");
            sbOooO0o0.append(this.f51724OooO0OO);
            sbOooO0o0.append(',');
            sbOooO0o0.append(" modes=");
            sbOooO0o0.append(this.f51725OooO0Oo);
            sbOooO0o0.append(',');
            sbOooO0o0.append(" supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
            sbOooO0o0.append(string);
            throw new UnknownServiceException(sbOooO0o0.toString());
        }
        int i2 = this.f51722OooO00o;
        int size2 = this.f51725OooO0Oo.size();
        while (true) {
            if (i2 >= size2) {
                z = false;
                break;
            }
            if (this.f51725OooO0Oo.get(i2).OooO0O0(sslSocket)) {
                z = true;
                break;
            }
            i2++;
        }
        this.f51723OooO0O0 = z;
        boolean z2 = this.f51724OooO0OO;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (o00o00oo2.f51284OooO0OO != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            String[] strArr = o00o00oo2.f51284OooO0OO;
            o00O00.OooO0O0 oooO0O0 = o00O00.f51251OooOo00;
            Comparator<String> comparator = o00O00.f51234OooO0O0;
            cipherSuitesIntersection = o00OOO00.OooOOo0(enabledCipherSuites, strArr, o00O00.f51234OooO0O0);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (o00o00oo2.f51285OooO0Oo != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = o00OOO00.OooOOo0(enabledProtocols2, o00o00oo2.f51285OooO0Oo, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] indexOf = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(indexOf, "supportedCipherSuites");
        o00O00.OooO0O0 oooO0O1 = o00O00.f51251OooOo00;
        Comparator<String> comparator2 = o00O00.f51234OooO0O0;
        Comparator<String> comparator3 = o00O00.f51234OooO0O0;
        byte[] bArr = o00OOO00.f51183OooO00o;
        Intrinsics.checkNotNullParameter(indexOf, "$this$indexOf");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullParameter(comparator3, "comparator");
        int length = indexOf.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (comparator3.compare(indexOf[i3], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i3++;
        }
        if (z2 && i3 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = indexOf[i3];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "$this$concat");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "java.util.Arrays.copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[ArraysKt.getLastIndex(cipherSuitesIntersection)] = value;
        }
        o00O00OO.OooO00o oooO00o = new o00O00OO.OooO00o(o00o00oo2);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        oooO00o.OooO0O0((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        oooO00o.OooO0o0((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        o00O00OO o00o00ooOooO00o = oooO00o.OooO00o();
        if (o00o00ooOooO00o.OooO0OO() != null) {
            sslSocket.setEnabledProtocols(o00o00ooOooO00o.f51285OooO0Oo);
        }
        if (o00o00ooOooO00o.OooO00o() != null) {
            sslSocket.setEnabledCipherSuites(o00o00ooOooO00o.f51284OooO0OO);
        }
        return o00o00oo2;
    }
}
