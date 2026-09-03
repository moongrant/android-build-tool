package com.amazonaws.internal.keyvaluestore;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.camera.core.impl.OooOOOO;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import java.security.Key;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public class AWSKeyValueStore {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Log f9120OooO0oO = LogFactory.OooO00o(AWSKeyValueStore.class);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final HashMap f9121OooO0oo = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, String> f9122OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f9123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public SharedPreferences f9124OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f9125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final SecureRandom f9126OooO0o = new SecureRandom();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public KeyProvider23 f9127OooO0o0;

    public AWSKeyValueStore(Context context, String str, boolean z) {
        Map<String, String> map;
        HashMap map2 = f9121OooO0oo;
        if (map2.containsKey(str)) {
            map = (Map) map2.get(str);
        } else {
            HashMap map3 = new HashMap();
            map2.put(str, map3);
            map = map3;
        }
        this.f9122OooO00o = map;
        this.f9125OooO0Oo = str;
        synchronized (this) {
            try {
                try {
                    boolean z2 = this.f9123OooO0O0;
                    this.f9123OooO0O0 = z;
                    if (z && !z2) {
                        this.f9124OooO0OO = context.getSharedPreferences(str, 0);
                        context.getSharedPreferences(str + ".encryptionkey", 0);
                        this.f9127OooO0o0 = new KeyProvider23();
                        Log log = f9120OooO0oO;
                        log.OooO0oo("Detected Android API Level = " + Build.VERSION.SDK_INT);
                        log.OooO0oo("Creating the AWSKeyValueStore with key for sharedPreferencesForData = " + str);
                        OooO0oO();
                    } else if (!z) {
                        f9120OooO0oO.OooO0oo("Persistence is disabled. Data will be accessed from memory.");
                    }
                    if (!z && z2) {
                        this.f9124OooO0OO.edit().clear().apply();
                    }
                } catch (Exception e) {
                    f9120OooO0oO.OooO0Oo("Error in enabling persistence for " + this.f9125OooO0Oo, e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String OooO0O0(Key key, GCMParameterSpec gCMParameterSpec, String str) {
        try {
            byte[] bArrOooO00o = Base64.OooO00o(str);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, key, gCMParameterSpec);
            return new String(cipher.doFinal(bArrOooO00o), "UTF-8");
        } catch (Exception e) {
            f9120OooO0oO.OooO0Oo("Error in decrypting data. ", e);
            return null;
        }
    }

    public static String OooO0OO(Key key, GCMParameterSpec gCMParameterSpec, String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, key, gCMParameterSpec);
            return Base64.OooO0O0(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception e) {
            f9120OooO0oO.OooO0Oo("Error in encrypting data. ", e);
            return null;
        }
    }

    public final synchronized void OooO(String str) {
        this.f9122OooO00o.remove(str);
        if (this.f9123OooO0O0) {
            String strConcat = str == null ? null : str.concat(".encrypted");
            this.f9124OooO0OO.edit().remove(strConcat).remove(strConcat + ".iv").remove(strConcat + ".keyvaluestoreversion").apply();
        }
    }

    public final synchronized boolean OooO00o(String str) {
        if (!this.f9123OooO0O0) {
            return this.f9122OooO00o.containsKey(str);
        }
        if (this.f9122OooO00o.containsKey(str)) {
            return true;
        }
        return this.f9124OooO0OO.contains(str == null ? null : str.concat(".encrypted"));
    }

    public final synchronized Key OooO0Oo(String str) {
        try {
        } catch (KeyNotGeneratedException e) {
            f9120OooO0oO.OooO0Oo("Encryption Key cannot be generated successfully.", e);
            return null;
        }
        return this.f9127OooO0o0.OooO0O0(str);
    }

    public final GCMParameterSpec OooO0o(String str) throws Exception {
        String strOooO00o = OooOOOO.OooO00o(str, ".iv");
        if (!this.f9124OooO0OO.contains(strOooO00o)) {
            throw new Exception(o000oOoO.OooO00o("Initialization vector for ", str, " is missing from the SharedPreferences."));
        }
        String string = this.f9124OooO0OO.getString(strOooO00o, null);
        if (string == null) {
            throw new Exception(o000oOoO.OooO00o("Cannot read the initialization vector for ", str, " from SharedPreferences."));
        }
        byte[] bArrOooO00o = Base64.OooO00o(string);
        if (bArrOooO00o == null || bArrOooO00o.length == 0) {
            throw new Exception(o000oOoO.OooO00o("Cannot base64 decode the initialization vector for ", str, " read from SharedPreferences."));
        }
        return new GCMParameterSpec(128, bArrOooO00o);
    }

    public final synchronized String OooO0o0(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f9122OooO00o.containsKey(str) && this.f9123OooO0O0) {
            String strConcat = str.concat(".encrypted");
            Key keyOooOO0 = OooOO0(this.f9125OooO0Oo + ".aesKeyStoreAlias");
            if (keyOooOO0 == null) {
                f9120OooO0oO.OooO0o0("Error in retrieving the decryption key used to decrypt the data from the persistent store. Returning null for the requested dataKey = ".concat(str));
                return null;
            }
            if (!this.f9124OooO0OO.contains(strConcat)) {
                return null;
            }
            try {
                if (Integer.parseInt(this.f9124OooO0OO.getString(strConcat + ".keyvaluestoreversion", null)) == 1) {
                    String strOooO0O0 = OooO0O0(keyOooOO0, OooO0o(strConcat), this.f9124OooO0OO.getString(strConcat, null));
                    this.f9122OooO00o.put(str, strOooO0O0);
                    return strOooO0O0;
                }
                f9120OooO0oO.OooO0o0("The version of the data read from SharedPreferences for " + str + " does not match the version of the store.");
                return null;
            } catch (Exception e) {
                f9120OooO0oO.OooO0Oo("Error in retrieving value for dataKey = ".concat(str), e);
                OooO(str);
                return null;
            }
        }
        return this.f9122OooO00o.get(str);
    }

    public final void OooO0oO() {
        Map<String, ?> all = this.f9124OooO0OO.getAll();
        for (String str : all.keySet()) {
            if (!str.endsWith(".encrypted") && !str.endsWith(".iv") && !str.endsWith(".keyvaluestoreversion")) {
                if (all.get(str) instanceof Long) {
                    OooO0oo(str, String.valueOf(Long.valueOf(this.f9124OooO0OO.getLong(str, 0L))));
                } else if (all.get(str) instanceof String) {
                    OooO0oo(str, this.f9124OooO0OO.getString(str, null));
                } else if (all.get(str) instanceof Float) {
                    OooO0oo(str, String.valueOf(Float.valueOf(this.f9124OooO0OO.getFloat(str, 0.0f))));
                } else if (all.get(str) instanceof Boolean) {
                    OooO0oo(str, String.valueOf(Boolean.valueOf(this.f9124OooO0OO.getBoolean(str, false))));
                } else if (all.get(str) instanceof Integer) {
                    OooO0oo(str, String.valueOf(Integer.valueOf(this.f9124OooO0OO.getInt(str, 0))));
                } else if (all.get(str) instanceof Set) {
                    Set set = (Set) all.get(str);
                    StringBuilder sb = new StringBuilder();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        if (it.hasNext()) {
                            sb.append(",");
                        }
                    }
                    OooO0oo(str, sb.toString());
                }
                this.f9124OooO0OO.edit().remove(str).apply();
            }
        }
    }

    public final synchronized void OooO0oo(String str, String str2) {
        if (str == null) {
            f9120OooO0oO.OooO0o0("dataKey is null.");
            return;
        }
        this.f9122OooO00o.put(str, str2);
        if (!this.f9123OooO0O0) {
            return;
        }
        if (str2 == null) {
            f9120OooO0oO.OooO0oO("Value is null. Removing the data, IV and version from SharedPreferences");
            this.f9122OooO00o.remove(str);
            OooO(str);
            return;
        }
        String strConcat = str.concat(".encrypted");
        String str3 = this.f9125OooO0Oo + ".aesKeyStoreAlias";
        Key keyOooOO0 = OooOO0(str3);
        if (keyOooOO0 == null) {
            Log log = f9120OooO0oO;
            log.OooO("No encryption key found for encryptionKeyAlias: " + str3);
            Key keyOooO0Oo = OooO0Oo(str3);
            if (keyOooO0Oo == null) {
                log.OooO0o0("Error in generating the encryption key for encryptionKeyAlias: " + str3 + " used to encrypt the data before storing. Skipping persisting the data in the persistent store.");
                return;
            }
            keyOooOO0 = keyOooO0Oo;
        }
        try {
            byte[] bArr = new byte[12];
            this.f9126OooO0o.nextBytes(bArr);
            String strOooO0OO = OooO0OO(keyOooOO0, new GCMParameterSpec(128, bArr), str2);
            String strOooO0O0 = Base64.OooO0O0(bArr);
            if (strOooO0O0 == null) {
                throw new Exception("Error in Base64 encoding the IV for dataKey = ".concat(str));
            }
            this.f9124OooO0OO.edit().putString(strConcat, strOooO0OO).putString(strConcat + ".iv", strOooO0O0).putString(strConcat + ".keyvaluestoreversion", String.valueOf(1)).apply();
        } catch (Exception e) {
            f9120OooO0oO.OooO0Oo("Error in storing value for dataKey = " + str + ". This data has not been stored in the persistent store.", e);
        }
    }

    public final synchronized Key OooOO0(String str) {
        try {
        } catch (KeyNotFoundException e) {
            Log log = f9120OooO0oO;
            log.OooO0o0(e);
            log.OooO0oo("Deleting the encryption key identified by the keyAlias: " + str);
            this.f9127OooO0o0.OooO00o(str);
            return null;
        }
        return this.f9127OooO0o0.OooO0OO(str);
    }
}
