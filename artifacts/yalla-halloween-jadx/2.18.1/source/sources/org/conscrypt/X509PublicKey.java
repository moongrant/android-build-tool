package org.conscrypt;

import OooO00o.OooO00o;
import java.security.PublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class X509PublicKey implements PublicKey {
    private static final long serialVersionUID = -8610156854731664298L;
    private final String algorithm;
    private final byte[] encoded;

    public X509PublicKey(String str, byte[] bArr) {
        this.algorithm = str;
        this.encoded = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X509PublicKey.class != obj.getClass()) {
            return false;
        }
        X509PublicKey x509PublicKey = (X509PublicKey) obj;
        String str = this.algorithm;
        if (str == null) {
            if (x509PublicKey.algorithm != null) {
                return false;
            }
        } else if (!str.equals(x509PublicKey.algorithm)) {
            return false;
        }
        return Arrays.equals(this.encoded, x509PublicKey.encoded);
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return this.encoded;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        String str = this.algorithm;
        return Arrays.hashCode(this.encoded) + (((str == null ? 0 : str.hashCode()) + 31) * 31);
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("X509PublicKey [algorithm=");
        sbOooO0o0.append(this.algorithm);
        sbOooO0o0.append(", encoded=");
        sbOooO0o0.append(Arrays.toString(this.encoded));
        sbOooO0o0.append("]");
        return sbOooO0o0.toString();
    }
}
