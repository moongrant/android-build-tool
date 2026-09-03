package org.conscrypt;

import OooO00o.OooO00o;
import com.facebook.internal.security.CertificateUtil;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
final class CryptoUpcalls {
    private static final Logger logger = Logger.getLogger(CryptoUpcalls.class.getName());

    private CryptoUpcalls() {
    }

    public static byte[] ecSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        if ("EC".equals(privateKey.getAlgorithm())) {
            return signDigestWithPrivateKey(privateKey, bArr, "NONEwithECDSA");
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Unexpected key type: ");
        sbOooO0o0.append(privateKey.toString());
        throw new RuntimeException(sbOooO0o0.toString());
    }

    private static ArrayList<Provider> getExternalProviders(String str) {
        ArrayList<Provider> arrayList = new ArrayList<>(1);
        for (Provider provider : Security.getProviders(str)) {
            if (!Conscrypt.isConscrypt(provider)) {
                arrayList.add(provider);
            }
        }
        if (arrayList.isEmpty()) {
            logger.warning("Could not find external provider for algorithm: " + str);
        }
        return arrayList;
    }

    public static byte[] rsaDecryptWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 2, bArr);
    }

    private static byte[] rsaOpWithPrivateKey(PrivateKey privateKey, int i, int i2, byte[] bArr) {
        String str;
        Cipher cipher;
        String algorithm = privateKey.getAlgorithm();
        if (!"RSA".equals(algorithm)) {
            logger.warning("Unexpected key type: " + algorithm);
            return null;
        }
        if (i == 1) {
            str = "PKCS1Padding";
        } else if (i == 3) {
            str = "NoPadding";
        } else {
            if (i != 4) {
                logger.warning("Unsupported OpenSSL/BoringSSL padding: " + i);
                return null;
            }
            str = "OAEPPadding";
        }
        String str2 = "RSA/ECB/" + str;
        try {
            cipher = Cipher.getInstance(str2);
            cipher.init(i2, privateKey);
            if (Conscrypt.isConscrypt(cipher.getProvider())) {
                cipher = null;
            }
        } catch (InvalidKeyException e) {
            logger.log(Level.WARNING, "Preferred provider doesn't support key:", (Throwable) e);
        } catch (NoSuchAlgorithmException unused) {
            logger.warning("Unsupported cipher algorithm: " + str2);
            return null;
        } catch (NoSuchPaddingException unused2) {
            logger.warning("Unsupported cipher algorithm: " + str2);
            return null;
        }
        if (cipher == null) {
            Iterator<Provider> it = getExternalProviders(OooOo00.OooO0Oo("Cipher.", str2)).iterator();
            while (it.hasNext()) {
                try {
                    cipher = Cipher.getInstance(str2, it.next());
                    cipher.init(i2, privateKey);
                    break;
                } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused3) {
                    cipher = null;
                }
            }
            if (cipher == null) {
                logger.warning("Could not find provider for algorithm: " + str2);
                return null;
            }
        }
        try {
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Exception while decrypting message with ");
            sbOooO0o0.append(privateKey.getAlgorithm());
            sbOooO0o0.append(" private key using ");
            sbOooO0o0.append(str2);
            sbOooO0o0.append(CertificateUtil.DELIMITER);
            logger2.log(level, sbOooO0o0.toString(), (Throwable) e2);
            return null;
        }
    }

    public static byte[] rsaSignDigestWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 1, bArr);
    }

    private static byte[] signDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr, String str) {
        Signature signature;
        try {
            signature = Signature.getInstance(str);
            signature.initSign(privateKey);
            if (Conscrypt.isConscrypt(signature.getProvider())) {
                signature = null;
            }
        } catch (InvalidKeyException e) {
            logger.warning("Preferred provider doesn't support key:");
            e.printStackTrace();
        } catch (NoSuchAlgorithmException unused) {
            logger.warning("Unsupported signature algorithm: " + str);
            return null;
        }
        if (signature == null) {
            Iterator<Provider> it = getExternalProviders(OooOo00.OooO0Oo("Signature.", str)).iterator();
            RuntimeException runtimeException = null;
            while (it.hasNext()) {
                try {
                    signature = Signature.getInstance(str, it.next());
                    signature.initSign(privateKey);
                    break;
                } catch (RuntimeException e2) {
                    if (runtimeException == null) {
                        runtimeException = e2;
                    }
                    signature = null;
                } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                    signature = null;
                }
            }
            if (signature == null) {
                if (runtimeException != null) {
                    throw runtimeException;
                }
                logger.warning("Could not find provider for algorithm: " + str);
                return null;
            }
        }
        try {
            signature.update(bArr);
            return signature.sign();
        } catch (Exception e3) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Exception while signing message with ");
            sbOooO0o0.append(privateKey.getAlgorithm());
            sbOooO0o0.append(" private key:");
            logger2.log(level, sbOooO0o0.toString(), (Throwable) e3);
            return null;
        }
    }
}
