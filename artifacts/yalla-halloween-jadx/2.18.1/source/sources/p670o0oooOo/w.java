package p670o0oooOo;

import androidx.appcompat.widget.o00000O0;
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
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p016OooOoO0.OooOo00;
import p100o000oOoO.o00O00OO;
import p659o0ooo0o.o00OO0OO;
import p659o0ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements HostnameVerifier {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final w f51947OooO00o = new w();

    public final String OooO00o(String str) {
        if (!OooO0OO(str)) {
            return str;
        }
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final List<String> OooO0O0(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && !(!Intrinsics.areEqual(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    public final boolean OooO0OO(String utf8Size) {
        int i;
        int length = utf8Size.length();
        int length2 = utf8Size.length();
        Intrinsics.checkNotNullParameter(utf8Size, "$this$utf8Size");
        if (!(length2 >= 0)) {
            throw new IllegalArgumentException(o00O00OO.OooO00o("endIndex < beginIndex: ", length2, " < ", 0).toString());
        }
        if (!(length2 <= utf8Size.length())) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("endIndex > string.length: ", length2, " > ");
            sbOooO00o.append(utf8Size.length());
            throw new IllegalArgumentException(sbOooO00o.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = utf8Size.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? utf8Size.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0123  */
    public final boolean OooO0Oo(@NotNull String canParseAsIpAddress, @NotNull X509Certificate certificate) {
        boolean zAreEqual;
        int length;
        Intrinsics.checkNotNullParameter(canParseAsIpAddress, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        byte[] bArr = o00OOO00.f51183OooO00o;
        Intrinsics.checkNotNullParameter(canParseAsIpAddress, "$this$canParseAsIpAddress");
        if (o00OOO00.f51187OooO0o.matches(canParseAsIpAddress)) {
            String strOooO0O0 = o00OO0OO.OooO0O0(canParseAsIpAddress);
            List<String> listOooO0O0 = OooO0O0(certificate, 7);
            if ((listOooO0O0 instanceof Collection) && listOooO0O0.isEmpty()) {
                return false;
            }
            Iterator<T> it = listOooO0O0.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(strOooO0O0, o00OO0OO.OooO0O0((String) it.next()))) {
                }
            }
            return false;
        }
        String strOooO00o = OooO00o(canParseAsIpAddress);
        List<String> listOooO0O1 = OooO0O0(certificate, 2);
        if ((listOooO0O1 instanceof Collection) && listOooO0O1.isEmpty()) {
            return false;
        }
        for (String strOooO0Oo : listOooO0O1) {
            w wVar = f51947OooO00o;
            if ((strOooO00o == null || strOooO00o.length() == 0) || StringsKt.OooOoOO(strOooO00o, ".") || StringsKt__StringsJVMKt.endsWith$default(strOooO00o, "..", false, 2, null)) {
                zAreEqual = false;
            } else if ((strOooO0Oo == null || strOooO0Oo.length() == 0) || StringsKt.OooOoOO(strOooO0Oo, ".") || StringsKt__StringsJVMKt.endsWith$default(strOooO0Oo, "..", false, 2, null)) {
                zAreEqual = false;
            } else {
                String strOooO0Oo2 = !StringsKt__StringsJVMKt.endsWith$default(strOooO00o, ".", false, 2, null) ? OooOo00.OooO0Oo(strOooO00o, ".") : strOooO00o;
                if (!StringsKt__StringsJVMKt.endsWith$default(strOooO0Oo, ".", false, 2, null)) {
                    strOooO0Oo = OooOo00.OooO0Oo(strOooO0Oo, ".");
                }
                String strOooO00o2 = wVar.OooO00o(strOooO0Oo);
                if (!StringsKt__StringsKt.contains$default(strOooO00o2, "*", false, 2, (Object) null)) {
                    zAreEqual = Intrinsics.areEqual(strOooO0Oo2, strOooO00o2);
                } else if (!StringsKt.OooOoOO(strOooO00o2, "*.") || StringsKt__StringsKt.indexOf$default((CharSequence) strOooO00o2, '*', 1, false, 4, (Object) null) != -1 || strOooO0Oo2.length() < strOooO00o2.length() || Intrinsics.areEqual("*.", strOooO00o2)) {
                    zAreEqual = false;
                } else {
                    String strSubstring = strOooO00o2.substring(1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    if (StringsKt__StringsJVMKt.endsWith$default(strOooO0Oo2, strSubstring, false, 2, null) && ((length = strOooO0Oo2.length() - strSubstring.length()) <= 0 || StringsKt__StringsKt.lastIndexOf$default((CharSequence) strOooO0Oo2, '.', length - 1, false, 4, (Object) null) == -1)) {
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
        if (!OooO0OO(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return OooO0Oo(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
