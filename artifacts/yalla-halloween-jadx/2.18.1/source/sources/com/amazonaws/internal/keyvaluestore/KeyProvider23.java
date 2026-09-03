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

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 23)
class KeyProvider23 implements KeyProvider {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Log f10440OooO00o = LogFactory.OooO00o(KeyProvider23.class);

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public final synchronized Key OooO00o(String str) throws KeyNotFoundException {
        Key key;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias(str)) {
                throw new KeyNotFoundException("AndroidKeyStore does not contain the keyAlias: " + str);
            }
            Log log = f10440OooO00o;
            log.OooO00o("AndroidKeyStore contains keyAlias " + str);
            log.OooO00o("Loading the encryption key from Android KeyStore.");
            key = keyStore.getKey(str, null);
            if (key == null) {
                throw new KeyNotFoundException("Key is null even though the keyAlias: " + str + " is present in AndroidKeyStore");
            }
        } catch (Exception e) {
            throw new KeyNotFoundException("Error occurred while accessing AndroidKeyStore to retrieve the key for keyAlias: " + str, e);
        }
        return key;
    }

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public final synchronized void OooO0O0(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            keyStore.deleteEntry(str);
        } catch (Exception e) {
            f10440OooO00o.OooO0oo("Error in deleting the key for keyAlias: " + str + " from Android KeyStore.", e);
        }
    }

    @Override // com.amazonaws.internal.keyvaluestore.KeyProvider
    public final synchronized Key OooO0OO(String str) throws KeyNotGeneratedException {
        SecretKey secretKeyGenerateKey;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (keyStore.containsAlias(str)) {
                throw new KeyNotGeneratedException("Key already exists for the keyAlias: " + str + " in AndroidKeyStore");
            }
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(false).build());
            secretKeyGenerateKey = keyGenerator.generateKey();
            f10440OooO00o.OooO0o("Generated the encryption key identified by the keyAlias: " + str + " using AndroidKeyStore");
        } catch (Exception e) {
            throw new KeyNotGeneratedException("Cannot generate a key for alias: " + str + " in AndroidKeyStore", e);
        }
        return secretKeyGenerateKey;
    }
}
