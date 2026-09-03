package com.amazonaws.internal.keyvaluestore;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.RequiresApi;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.google.android.gms.stats.CodePackage;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(api = 23)
class KeyProvider23 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f12218OooO00o = LogFactory.OooO00o(KeyProvider23.class);

    public final synchronized void OooO00o(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry(str);
        } catch (Exception e) {
            f12218OooO00o.OooO0Oo("Error in deleting the key for keyAlias: " + str + " from Android KeyStore.", e);
        }
    }

    public final synchronized Key OooO0O0(String str) throws KeyNotGeneratedException {
        SecretKey secretKeyGenerateKey;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias(str)) {
                throw new KeyNotGeneratedException("Key already exists for the keyAlias: " + str + " in AndroidKeyStore");
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).setRandomizedEncryptionRequired(false).build());
            secretKeyGenerateKey = keyGenerator.generateKey();
            f12218OooO00o.OooO0oo("Generated the encryption key identified by the keyAlias: " + str + " using AndroidKeyStore");
        } catch (Exception e) {
            throw new KeyNotGeneratedException("Cannot generate a key for alias: " + str + " in AndroidKeyStore", e);
        }
        return secretKeyGenerateKey;
    }

    public final synchronized Key OooO0OO(String str) throws KeyNotFoundException {
        Key key;
        try {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (!keyStore.containsAlias(str)) {
                    throw new KeyNotFoundException("AndroidKeyStore does not contain the keyAlias: " + str);
                }
                Log log = f12218OooO00o;
                log.OooO0oO("AndroidKeyStore contains keyAlias " + str);
                log.OooO0oO("Loading the encryption key from Android KeyStore.");
                key = keyStore.getKey(str, null);
                if (key == null) {
                    throw new KeyNotFoundException("Key is null even though the keyAlias: " + str + " is present in AndroidKeyStore");
                }
            } catch (Exception e) {
                throw new KeyNotFoundException("Error occurred while accessing AndroidKeyStore to retrieve the key for keyAlias: " + str, e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return key;
    }
}
