package p412o0Oo0o00;

import com.facebook.internal.security.CertificateUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okio.ByteString;
import org.conscrypt.EvpMdRef;
import p413o0Oo0o0O.o000000;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o00000OO f39255OooO0O0 = new o00000OO(new OooO00o());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, Set<ByteString>> f39256OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<String, Set<ByteString>> f39257OooO00o = new LinkedHashMap();
    }

    public o00000OO(OooO00o oooO00o) {
        Map<String, Set<ByteString>> map = oooO00o.f39257OooO00o;
        byte[] bArr = o000000.f39346OooO00o;
        this.f39256OooO00o = Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static String OooO0O0(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("sha1/");
        sbOooO0o0.append(OooO0OO((X509Certificate) certificate).OooO00o());
        return sbOooO0o0.toString();
    }

    public static ByteString OooO0OO(X509Certificate x509Certificate) {
        ByteString byteStringOooO = ByteString.OooO(x509Certificate.getPublicKey().getEncoded());
        byte[] bArr = o000000.f39346OooO00o;
        try {
            return ByteString.OooO(MessageDigest.getInstance(EvpMdRef.SHA1.JCA_NAME).digest(byteStringOooO.OooOOO0()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final void OooO00o(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        Set<ByteString> set;
        Set<ByteString> set2 = this.f39256OooO00o.get(str);
        int iIndexOf = str.indexOf(46);
        if (iIndexOf != str.lastIndexOf(46)) {
            Map<String, Set<ByteString>> map = this.f39256OooO00o;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("*.");
            sbOooO0o0.append(str.substring(iIndexOf + 1));
            set = map.get(sbOooO0o0.toString());
        } else {
            set = null;
        }
        if (set2 == null && set == null) {
            set2 = null;
        } else if (set2 != null && set != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set2);
            linkedHashSet.addAll(set);
            set2 = linkedHashSet;
        } else if (set2 == null) {
            set2 = set;
        }
        if (set2 == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (set2.contains(OooO0OO((X509Certificate) list.get(i)))) {
                return;
            }
        }
        StringBuilder sbOooO00o = Oooo0.OooO00o("Certificate pinning failure!", "\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            sbOooO00o.append("\n    ");
            sbOooO00o.append(OooO0O0(x509Certificate));
            sbOooO00o.append(": ");
            sbOooO00o.append(x509Certificate.getSubjectDN().getName());
        }
        sbOooO00o.append("\n  Pinned certificates for ");
        sbOooO00o.append(str);
        sbOooO00o.append(CertificateUtil.DELIMITER);
        for (ByteString byteString : set2) {
            sbOooO00o.append("\n    sha1/");
            sbOooO00o.append(byteString.OooO00o());
        }
        throw new SSLPeerUnverifiedException(sbOooO00o.toString());
    }
}
