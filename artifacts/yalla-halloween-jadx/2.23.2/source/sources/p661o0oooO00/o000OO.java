package p661o0oooO00;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p648o0ooOoo.oO000o00;
import p648o0ooOoo.oO0OOo0o;
import p662o0oooO0O.oO0000O;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO implements HostnameVerifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000OO f59741OooO00o = new o000OO();

    public static List OooO00o(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0155  */
    public static boolean OooO0O0(@NotNull String host, @NotNull X509Certificate certificate) {
        boolean zAreEqual;
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        byte[] bArr = oO000o00.f58124OooO00o;
        Intrinsics.checkNotNullParameter(host, "<this>");
        if (oO000o00.f58128OooO0o.matches(host)) {
            String strOooO0O0 = oO0OOo0o.OooO0O0(host);
            List listOooO00o = OooO00o(certificate, 7);
            if ((listOooO00o instanceof Collection) && listOooO00o.isEmpty()) {
                return false;
            }
            Iterator it = listOooO00o.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(strOooO0O0, oO0OOo0o.OooO0O0((String) it.next()))) {
                }
            }
            return false;
        }
        if (host.length() == ((int) oO0000O.OooO00o(host))) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            host = host.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(host, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listOooO00o2 = OooO00o(certificate, 2);
        if ((listOooO00o2 instanceof Collection) && listOooO00o2.isEmpty()) {
            return false;
        }
        for (String lowerCase : listOooO00o2) {
            if ((host == null || host.length() == 0) || StringsKt__StringsJVMKt.startsWith$default(host, ".", false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(host, "..", false, 2, null)) {
                zAreEqual = false;
            } else if ((lowerCase == null || lowerCase.length() == 0) || StringsKt__StringsJVMKt.startsWith$default(lowerCase, ".", false, 2, null) || StringsKt__StringsJVMKt.endsWith$default(lowerCase, "..", false, 2, null)) {
                zAreEqual = false;
            } else {
                String strStringPlus = !StringsKt__StringsJVMKt.endsWith$default(host, ".", false, 2, null) ? Intrinsics.stringPlus(host, ".") : host;
                if (!StringsKt__StringsJVMKt.endsWith$default(lowerCase, ".", false, 2, null)) {
                    lowerCase = Intrinsics.stringPlus(lowerCase, ".");
                }
                if (lowerCase.length() == ((int) oO0000O.OooO00o(lowerCase))) {
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    lowerCase = lowerCase.toLowerCase(US2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                }
                if (!StringsKt__StringsKt.contains$default(lowerCase, "*", false, 2, (Object) null)) {
                    zAreEqual = Intrinsics.areEqual(strStringPlus, lowerCase);
                } else if (!StringsKt__StringsJVMKt.startsWith$default(lowerCase, "*.", false, 2, null) || StringsKt__StringsKt.indexOf$default((CharSequence) lowerCase, '*', 1, false, 4, (Object) null) != -1 || strStringPlus.length() < lowerCase.length() || Intrinsics.areEqual("*.", lowerCase)) {
                    zAreEqual = false;
                } else {
                    String strSubstring = lowerCase.substring(1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                    if (StringsKt__StringsJVMKt.endsWith$default(strStringPlus, strSubstring, false, 2, null) && ((length = strStringPlus.length() - strSubstring.length()) <= 0 || StringsKt__StringsKt.lastIndexOf$default((CharSequence) strStringPlus, '.', length - 1, false, 4, (Object) null) == -1)) {
                        zAreEqual = true;
                    } else {
                        zAreEqual = false;
                    }
                }
            }
            if (zAreEqual) {
            }
        }
        return false;
        return true;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(@NotNull String host, @NotNull SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!(host.length() == ((int) oO0000O.OooO00o(host)))) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return OooO0O0(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
