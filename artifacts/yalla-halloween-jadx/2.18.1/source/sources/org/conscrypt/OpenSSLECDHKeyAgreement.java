package org.conscrypt;

import OooO00o.OooO00o;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenSSLECDHKeyAgreement extends KeyAgreementSpi {
    private int mExpectedResultLength;
    private OpenSSLKey mOpenSslPrivateKey;
    private byte[] mResult;

    private void checkCompleted() {
        if (this.mResult == null) {
            throw new IllegalStateException("Key agreement not completed");
        }
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException {
        if (this.mOpenSslPrivateKey == null) {
            throw new IllegalStateException("Not initialized");
        }
        if (!z) {
            throw new IllegalStateException("ECDH only has one phase");
        }
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if (!(key instanceof PublicKey)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Not a public key: ");
            sbOooO0o0.append(key.getClass());
            throw new InvalidKeyException(sbOooO0o0.toString());
        }
        OpenSSLKey openSSLKeyFromPublicKey = OpenSSLKey.fromPublicKey((PublicKey) key);
        byte[] bArr = new byte[this.mExpectedResultLength];
        int iECDH_compute_key = NativeCrypto.ECDH_compute_key(bArr, 0, openSSLKeyFromPublicKey.getNativeRef(), this.mOpenSslPrivateKey.getNativeRef());
        if (iECDH_compute_key == -1) {
            throw new RuntimeException(android.support.v4.media.OooO00o.OooO00o("Engine returned ", iECDH_compute_key));
        }
        int i = this.mExpectedResultLength;
        if (iECDH_compute_key != i) {
            if (iECDH_compute_key >= i) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Engine produced a longer than expected result. Expected: ");
                sbOooO0o1.append(this.mExpectedResultLength);
                sbOooO0o1.append(", actual: ");
                sbOooO0o1.append(iECDH_compute_key);
                throw new RuntimeException(sbOooO0o1.toString());
            }
            byte[] bArr2 = this.mResult;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            bArr = new byte[iECDH_compute_key];
        }
        this.mResult = bArr;
        return null;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) throws ShortBufferException {
        checkCompleted();
        int length = bArr.length - i;
        byte[] bArr2 = this.mResult;
        if (bArr2.length <= length) {
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            return this.mResult.length;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Needed: ");
        sbOooO0o0.append(this.mResult.length);
        sbOooO0o0.append(", available: ");
        sbOooO0o0.append(length);
        throw new ShortBufferException(sbOooO0o0.toString());
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key == null) {
            throw new InvalidKeyException("key == null");
        }
        if (!(key instanceof PrivateKey)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Not a private key: ");
            sbOooO0o0.append(key.getClass());
            throw new InvalidKeyException(sbOooO0o0.toString());
        }
        OpenSSLKey openSSLKeyFromPrivateKey = OpenSSLKey.fromPrivateKey((PrivateKey) key);
        this.mExpectedResultLength = (NativeCrypto.EC_GROUP_get_degree(new NativeRef.EC_GROUP(NativeCrypto.EC_KEY_get1_group(openSSLKeyFromPrivateKey.getNativeRef()))) + 7) / 8;
        this.mOpenSslPrivateKey = openSSLKeyFromPrivateKey;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        checkCompleted();
        return this.mResult;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        checkCompleted();
        return new SecretKeySpec(engineGenerateSecret(), str);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null) {
            engineInit(key, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
