package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import oO0000Oo.OooO0OO;
import oO000Oo.OooO00o;
import oO000Oo.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public class X509CertificateObject extends X509Certificate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f53713Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f53714Oooo0oO;

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            new StringBuilder().append("certificate expired on ");
            throw null;
        }
        if (date.getTime() >= getNotBefore().getTime()) {
            return;
        }
        new StringBuilder().append("certificate not valid till ");
        throw null;
    }

    @Override // java.security.cert.Certificate
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        try {
            return OooO00o.OooO00o(getEncoded(), ((Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        return -1;
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        new HashSet();
        throw null;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() throws CertificateParsingException {
        throw null;
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() throws CertificateParsingException {
        String str = OooO0OO.f52400Oooo0oo.f52198Oooo0o;
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        try {
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getIssuerX500Principal() {
        try {
            new ByteArrayOutputStream();
            throw null;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        return null;
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        new HashSet();
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        throw null;
    }

    @Override // java.security.cert.Certificate
    public final PublicKey getPublicKey() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        Provider provider = Security.getProvider("BC");
        if (provider != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Alg.Alias.Signature.");
            sbOooO0o0.append(getSigAlgOID());
            String property = provider.getProperty(sbOooO0o0.toString());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Alg.Alias.Signature.");
            sbOooO0o1.append(getSigAlgOID());
            String property2 = provider2.getProperty(sbOooO0o1.toString());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() throws CertificateParsingException {
        String str = OooO0OO.f52399Oooo0oO.f52198Oooo0o;
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final X500Principal getSubjectX500Principal() {
        try {
            new ByteArrayOutputStream();
            throw null;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        throw null;
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        throw null;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        if (getVersion() != 3) {
            return false;
        }
        throw null;
    }

    @Override // java.security.cert.Certificate
    public final synchronized int hashCode() {
        if (!this.f53713Oooo0o) {
            int i = 0;
            try {
                byte[] encoded = getEncoded();
                int i2 = 0;
                for (int i3 = 1; i3 < encoded.length; i3++) {
                    i2 += encoded[i3] * i3;
                }
                i = i2;
            } catch (CertificateEncodingException unused) {
            }
            this.f53714Oooo0oO = i;
            this.f53713Oooo0o = true;
        }
        return this.f53714Oooo0oO;
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = OooO0o.f52666OooO00o;
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(str);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(oO0OO0OO.OooO0OO.OooO0OO(signature, 0, 20)));
        stringBuffer.append(str);
        int i = 20;
        while (i < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i < length ? new String(oO0OO0OO.OooO0OO.OooO0OO(signature, i, 20)) : new String(oO0OO0OO.OooO0OO.OooO0OO(signature, i, signature.length - i)));
            stringBuffer.append(str);
            i += 20;
        }
        throw null;
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        throw null;
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        throw null;
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException {
        throw null;
    }
}
