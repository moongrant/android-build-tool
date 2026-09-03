package org.conscrypt;

import OooO00o.OooO00o;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class ChainStrengthAnalyzer {
    private static final int MIN_DSA_P_LEN_BITS = 1024;
    private static final int MIN_DSA_Q_LEN_BITS = 160;
    private static final int MIN_EC_FIELD_SIZE_BITS = 160;
    private static final int MIN_RSA_MODULUS_LEN_BITS = 1024;
    private static final String[] SIGNATURE_ALGORITHM_OID_BLACKLIST = {"1.2.840.113549.1.1.2", "1.2.840.113549.1.1.3", "1.2.840.113549.1.1.4", "1.2.840.113549.1.1.5", "1.2.840.10040.4.3", "1.2.840.10045.4.1"};

    public static final void check(X509Certificate[] x509CertificateArr) throws CertificateException {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            try {
                checkCert(x509Certificate);
            } catch (CertificateException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unacceptable certificate: ");
                sbOooO0o0.append(x509Certificate.getSubjectX500Principal());
                throw new CertificateException(sbOooO0o0.toString(), e);
            }
        }
    }

    public static final void checkCert(X509Certificate x509Certificate) throws CertificateException {
        checkKeyLength(x509Certificate);
        checkSignatureAlgorithm(x509Certificate);
    }

    private static void checkKeyLength(X509Certificate x509Certificate) throws CertificateException {
        PublicKey publicKey = x509Certificate.getPublicKey();
        if (publicKey instanceof RSAPublicKey) {
            if (((RSAPublicKey) publicKey).getModulus().bitLength() < 1024) {
                throw new CertificateException("RSA modulus is < 1024 bits");
            }
            return;
        }
        if (publicKey instanceof ECPublicKey) {
            if (((ECPublicKey) publicKey).getParams().getCurve().getField().getFieldSize() < 160) {
                throw new CertificateException("EC key field size is < 160 bits");
            }
        } else {
            if (!(publicKey instanceof DSAPublicKey)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Rejecting unknown key class ");
                sbOooO0o0.append(publicKey.getClass().getName());
                throw new CertificateException(sbOooO0o0.toString());
            }
            DSAPublicKey dSAPublicKey = (DSAPublicKey) publicKey;
            int iBitLength = dSAPublicKey.getParams().getP().bitLength();
            int iBitLength2 = dSAPublicKey.getParams().getQ().bitLength();
            if (iBitLength < 1024 || iBitLength2 < 160) {
                throw new CertificateException("DSA key length is < (1024, 160) bits");
            }
        }
    }

    private static void checkSignatureAlgorithm(X509Certificate x509Certificate) throws CertificateException {
        String sigAlgOID = x509Certificate.getSigAlgOID();
        for (String str : SIGNATURE_ALGORITHM_OID_BLACKLIST) {
            if (sigAlgOID.equals(str)) {
                throw new CertificateException(OooOo00.OooO0Oo("Signature uses an insecure hash function: ", sigAlgOID));
            }
        }
    }

    public static final void check(List<X509Certificate> list) throws CertificateException {
        for (X509Certificate x509Certificate : list) {
            try {
                checkCert(x509Certificate);
            } catch (CertificateException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unacceptable certificate: ");
                sbOooO0o0.append(x509Certificate.getSubjectX500Principal());
                throw new CertificateException(sbOooO0o0.toString(), e);
            }
        }
    }
}
