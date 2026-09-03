package com.amazonaws.internal.keyvaluestore;

import OooO00o.OooO00o;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.KeyPairGeneratorSpec;
import androidx.annotation.RequiresApi;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 18)
public class KeyProvider18 implements KeyProvider {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f10436OooO0Oo = LogFactory.OooO00o(KeyProvider18.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public SecureRandom f10437OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f10438OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SharedPreferences f10439OooO0OO;

    public KeyProvider18(Context context, SharedPreferences sharedPreferences) {
        this.f10438OooO0O0 = context;
        this.f10439OooO0OO = sharedPreferences;
    }

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public final synchronized Key OooO00o(String str) throws KeyNotFoundException {
        byte[] bArrOooO0Oo;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(str)) {
                throw new KeyNotFoundException("The RSA Key identified by the alias: " + str + " cannot be found in AndroidKeyStore");
            }
            if (!this.f10439OooO0OO.contains("AesGcmNoPadding18-encrypted-encryption-key")) {
                throw new KeyNotFoundException("SharedPreferences does not have the key for keyAlias: AesGcmNoPadding18-encrypted-encryption-key");
            }
            f10436OooO0Oo.OooO00o("Loading the encryption key from SharedPreferences");
            String string = this.f10439OooO0OO.getString("AesGcmNoPadding18-encrypted-encryption-key", null);
            if (string == null) {
                throw new KeyNotFoundException("Unable to retrieve the encrypted AES Key identified by AesGcmNoPadding18-encrypted-encryption-key from the SharedPreferences.");
            }
            byte[] bArrOooO00o = Base64.OooO00o(string);
            if (bArrOooO00o == null || bArrOooO00o.length == 0) {
                throw new KeyNotFoundException("Unable to Base64 decode the encrypted AES key identified by: AesGcmNoPadding18-encrypted-encryption-key");
            }
            bArrOooO0Oo = OooO0Oo(str, bArrOooO00o);
            if (bArrOooO0Oo == null || bArrOooO0Oo.length == 0) {
                throw new KeyNotFoundException("Unable to RSA decrypt the encrypted AES key identified by: AesGcmNoPadding18-encrypted-encryption-key using the RSA key identified by keyAlias: " + str);
            }
        } catch (Exception e) {
            throw new KeyNotFoundException("Error occurred while accessing AndroidKeyStore to retrieve the key for keyAlias: " + str, e);
        }
        return new SecretKeySpec(bArrOooO0Oo, "AES");
    }

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public final synchronized void OooO0O0(String str) {
        try {
            this.f10439OooO0OO.edit().remove("AesGcmNoPadding18-encrypted-encryption-key").apply();
        } catch (Exception e) {
            f10436OooO0Oo.OooO0oo("Error in deleting the encrypted AES key identified by AesGcmNoPadding18-encrypted-encryption-key from SharedPreferences.", e);
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry(str);
        } catch (Exception e2) {
            f10436OooO0Oo.OooO0oo("Error in deleting the RSA Key identified by the keyAlias: " + str + " from AndroidKeyStore", e2);
        }
    }

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public final synchronized Key OooO0OO(String str) throws KeyNotGeneratedException {
        SecretKey secretKeyGenerateKey;
        try {
            try {
                KeyStore.getInstance("AndroidKeyStore").load(null);
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(1, 30);
                KeyPairGeneratorSpec keyPairGeneratorSpecBuild = new KeyPairGeneratorSpec.Builder(this.f10438OooO0O0).setAlias(str).setSubject(new X500Principal("CN=" + str)).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator.initialize(keyPairGeneratorSpecBuild);
                keyPairGenerator.generateKeyPair();
                try {
                    this.f10437OooO00o = new SecureRandom();
                    KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                    keyGenerator.init(256, this.f10437OooO00o);
                    secretKeyGenerateKey = keyGenerator.generateKey();
                    if (secretKeyGenerateKey == null) {
                        throw new KeyNotGeneratedException("Error in generating the AES encryption key for the alias: AesGcmNoPadding18-encrypted-encryption-key");
                    }
                    byte[] encoded = secretKeyGenerateKey.getEncoded();
                    if (encoded == null || encoded.length == 0) {
                        throw new KeyNotGeneratedException("Error in generating the AES encryption key for the alias: AesGcmNoPadding18-encrypted-encryption-key");
                    }
                    byte[] bArrOooO0o0 = OooO0o0(str, encoded);
                    if (bArrOooO0o0 == null || bArrOooO0o0.length == 0) {
                        throw new KeyNotGeneratedException("Error in RSA encrypting the AES encryption key for the AES keyAlias: AesGcmNoPadding18-encrypted-encryption-key using the rsaKeyAlias: " + str);
                    }
                    String strOooO0O0 = Base64.OooO0O0(bArrOooO0o0);
                    if (strOooO0O0 == null) {
                        throw new KeyNotGeneratedException("Error in Base64 encoding of the Encrypted AES key for the AES keyAlias: AesGcmNoPadding18-encrypted-encryption-key using the rsaKeyAlias: " + str);
                    }
                    this.f10439OooO0OO.edit().putString("AesGcmNoPadding18-encrypted-encryption-key", strOooO0O0).apply();
                    f10436OooO0Oo.OooO0o("Generated and saved the Encrypted AES encryption key for the AES keyAlias: AesGcmNoPadding18-encrypted-encryption-key to SharedPreferences.");
                } catch (Exception e) {
                    throw new KeyNotGeneratedException("Error in generating the AES key and RSA encrypting the AES key using the rsaKeyAlias: " + str + " in AndroidKeyStore", e);
                }
            } catch (Exception e2) {
                throw new KeyNotGeneratedException("Error in generating the RSA Encryption key for the rsaKeyAlias: " + str + " in AndroidKeyStore", e2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return secretKeyGenerateKey;
    }

    public final byte[] OooO0Oo(String str, byte[] bArr) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
            cipher.init(2, privateKeyEntry.getPrivateKey());
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            f10436OooO0Oo.OooO0oo("Exception occurred while decrypting the encrypted AES key. ", e);
            return null;
        }
    }

    public final byte[] OooO0o0(String str, byte[] bArr) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry(str, null);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
            cipher.init(1, privateKeyEntry.getCertificate().getPublicKey());
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            Log log = f10436OooO0Oo;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Exception occurred while encrypting data. ");
            sbOooO0o0.append(e.getMessage());
            log.OooOO0(sbOooO0o0.toString());
            return null;
        }
    }
}
