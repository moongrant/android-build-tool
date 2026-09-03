package com.squareup.okhttp;

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

/* JADX INFO: loaded from: classes4.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOO0O f21551OooO0O0 = new OooOO0O(new OooO00o());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, Set<ByteString>> f21552OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final LinkedHashMap f21553OooO00o = new LinkedHashMap();
    }

    public OooOO0O(OooO00o oooO00o) {
        LinkedHashMap linkedHashMap = oooO00o.f21553OooO00o;
        byte[] bArr = p336o0OO0oo0.o000oOoO.f43328OooO00o;
        this.f21552OooO00o = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
    }

    public static String OooO0O0(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha1/" + OooO0OO(x509Certificate).OooO00o();
    }

    public static ByteString OooO0OO(X509Certificate x509Certificate) {
        ByteString byteStringOooOOO0 = ByteString.OooOOO0(x509Certificate.getPublicKey().getEncoded());
        byte[] bArr = p336o0OO0oo0.o000oOoO.f43328OooO00o;
        try {
            return ByteString.OooOOO0(MessageDigest.getInstance("SHA-1").digest(byteStringOooOOO0.OooOOoo()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final void OooO00o(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        Map<String, Set<ByteString>> map = this.f21552OooO00o;
        Set<ByteString> set = map.get(str);
        int iIndexOf = str.indexOf(46);
        Set<ByteString> set2 = iIndexOf != str.lastIndexOf(46) ? map.get("*." + str.substring(iIndexOf + 1)) : null;
        if (set == null && set2 == null) {
            set = null;
        } else if (set != null && set2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(set);
            linkedHashSet.addAll(set2);
            set = linkedHashSet;
        } else if (set == null) {
            set = set2;
        }
        if (set == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (set.contains(OooO0OO((X509Certificate) list.get(i)))) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            sb.append("\n    ");
            sb.append(OooO0O0(x509Certificate));
            sb.append(": ");
            sb.append(x509Certificate.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(CertificateUtil.DELIMITER);
        for (ByteString byteString : set) {
            sb.append("\n    sha1/");
            sb.append(byteString.OooO00o());
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }
}
