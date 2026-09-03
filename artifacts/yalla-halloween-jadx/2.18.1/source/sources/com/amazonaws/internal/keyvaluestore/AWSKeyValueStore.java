package com.amazonaws.internal.keyvaluestore;

import OooO0o.OooO0OO;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.Base64;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import p016OooOoO0.OooOo00;
import p058o0000OoO.OooO;

/* JADX INFO: loaded from: classes.dex */
public class AWSKeyValueStore {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Log f10426OooO = LogFactory.OooO00o(AWSKeyValueStore.class);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static Map<String, HashMap<String, String>> f10427OooOO0 = new HashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Map<String, String> f10428OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f10429OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Context f10430OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public SharedPreferences f10431OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public SharedPreferences f10432OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f10433OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public KeyProvider f10434OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public SecureRandom f10435OooO0oo = new SecureRandom();

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public AWSKeyValueStore(Context context, String str, boolean z) {
        HashMap<String, String> map;
        if (f10427OooOO0.containsKey(str)) {
            map = f10427OooOO0.get(str);
        } else {
            map = new HashMap<>();
            f10427OooOO0.put(str, map);
        }
        this.f10428OooO00o = map;
        this.f10433OooO0o0 = str;
        this.f10430OooO0OO = context;
        synchronized (this) {
            try {
                boolean z2 = this.f10429OooO0O0;
                this.f10429OooO0O0 = z;
                if (z && !z2) {
                    this.f10431OooO0Oo = this.f10430OooO0OO.getSharedPreferences(str, 0);
                    this.f10432OooO0o = this.f10430OooO0OO.getSharedPreferences(str + ".encryptionkey", 0);
                    OooO0oo();
                    Log log = f10426OooO;
                    log.OooO0o("Detected Android API Level = " + Build.VERSION.SDK_INT);
                    log.OooO0o("Creating the AWSKeyValueStore with key for sharedPreferencesForData = " + str);
                    OooO();
                } else if (!z) {
                    f10426OooO.OooO0o("Persistence is disabled. Data will be accessed from memory.");
                }
                if (!z && z2) {
                    this.f10431OooO0Oo.edit().clear().apply();
                }
            } catch (Exception e) {
                f10426OooO.OooO0oo("Error in enabling persistence for " + this.f10433OooO0o0, e);
            }
        }
    }

    public final void OooO() {
        Map<String, ?> all = this.f10431OooO0Oo.getAll();
        for (String str : all.keySet()) {
            if (!str.endsWith(".encrypted") && !str.endsWith(".iv") && !str.endsWith(".keyvaluestoreversion")) {
                if (all.get(str) instanceof Long) {
                    OooOO0(str, String.valueOf(Long.valueOf(this.f10431OooO0Oo.getLong(str, 0L))));
                } else if (all.get(str) instanceof String) {
                    OooOO0(str, this.f10431OooO0Oo.getString(str, null));
                } else if (all.get(str) instanceof Float) {
                    OooOO0(str, String.valueOf(Float.valueOf(this.f10431OooO0Oo.getFloat(str, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))));
                } else if (all.get(str) instanceof Boolean) {
                    OooOO0(str, String.valueOf(Boolean.valueOf(this.f10431OooO0Oo.getBoolean(str, false))));
                } else if (all.get(str) instanceof Integer) {
                    OooOO0(str, String.valueOf(Integer.valueOf(this.f10431OooO0Oo.getInt(str, 0))));
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
                    OooOO0(str, sb.toString());
                }
                this.f10431OooO0Oo.edit().remove(str).apply();
            }
        }
    }

    public final synchronized boolean OooO00o(String str) {
        if (!this.f10429OooO0O0) {
            return this.f10428OooO00o.containsKey(str);
        }
        if (this.f10428OooO00o.containsKey(str)) {
            return true;
        }
        return this.f10431OooO0Oo.contains(OooO0o0(str));
    }

    public final String OooO0O0(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            byte[] bArrOooO00o = Base64.OooO00o(str);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, key, algorithmParameterSpec);
            return new String(cipher.doFinal(bArrOooO00o), "UTF-8");
        } catch (Exception e) {
            f10426OooO.OooO0oo("Error in decrypting data. ", e);
            return null;
        }
    }

    public final String OooO0OO(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, key, algorithmParameterSpec);
            return Base64.OooO0O0(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Exception e) {
            f10426OooO.OooO0oo("Error in encrypting data. ", e);
            return null;
        }
    }

    public final synchronized String OooO0Oo(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f10428OooO00o.containsKey(str) && this.f10429OooO0O0) {
            String strOooO0o0 = OooO0o0(str);
            Key keyOooOO0o = OooOO0o(OooO0o());
            if (keyOooOO0o == null) {
                f10426OooO.OooOO0("Error in retrieving the decryption key used to decrypt the data from the persistent store. Returning null for the requested dataKey = " + str);
                return null;
            }
            if (!this.f10431OooO0Oo.contains(strOooO0o0)) {
                return null;
            }
            try {
                if (Integer.parseInt(this.f10431OooO0Oo.getString(strOooO0o0 + ".keyvaluestoreversion", null)) == 1) {
                    String strOooO0O0 = OooO0O0(keyOooOO0o, OooO0oO(strOooO0o0), this.f10431OooO0Oo.getString(strOooO0o0, null));
                    this.f10428OooO00o.put(str, strOooO0O0);
                    return strOooO0O0;
                }
                f10426OooO.OooOO0("The version of the data read from SharedPreferences for " + str + " does not match the version of the store.");
                return null;
            } catch (Exception e) {
                f10426OooO.OooO0oo("Error in retrieving value for dataKey = " + str, e);
                OooOO0O(str);
                return null;
            }
        }
        return this.f10428OooO00o.get(str);
    }

    public final String OooO0o() {
        return Build.VERSION.SDK_INT >= 23 ? OooO.OooO00o(new StringBuilder(), this.f10433OooO0o0, ".aesKeyStoreAlias") : OooO.OooO00o(new StringBuilder(), this.f10433OooO0o0, ".rsaKeyStoreAlias");
    }

    public final String OooO0o0(String str) {
        if (str == null) {
            return null;
        }
        return OooOo00.OooO0Oo(str, ".encrypted");
    }

    public final AlgorithmParameterSpec OooO0oO(String str) throws Exception {
        String strOooO0Oo = OooOo00.OooO0Oo(str, ".iv");
        if (!this.f10431OooO0Oo.contains(strOooO0Oo)) {
            throw new Exception(OooO0OO.OooO00o("Initialization vector for ", str, " is missing from the SharedPreferences."));
        }
        String string = this.f10431OooO0Oo.getString(strOooO0Oo, null);
        if (string == null) {
            throw new Exception(OooO0OO.OooO00o("Cannot read the initialization vector for ", str, " from SharedPreferences."));
        }
        byte[] bArrOooO00o = Base64.OooO00o(string);
        if (bArrOooO00o == null || bArrOooO00o.length == 0) {
            throw new Exception(OooO0OO.OooO00o("Cannot base64 decode the initialization vector for ", str, " read from SharedPreferences."));
        }
        return Build.VERSION.SDK_INT >= 23 ? new GCMParameterSpec(128, bArrOooO00o) : new IvParameterSpec(bArrOooO00o);
    }

    public final void OooO0oo() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f10434OooO0oO = new KeyProvider23();
        } else {
            this.f10434OooO0oO = new KeyProvider18(this.f10430OooO0OO, this.f10432OooO0o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0093 A[Catch: Exception -> 0x00fe, all -> 0x011c, TryCatch #0 {Exception -> 0x00fe, blocks: (B:35:0x0086, B:37:0x0093, B:39:0x00a0, B:41:0x00aa, B:42:0x00e7, B:43:0x00fd, B:38:0x009b), top: B:51:0x0086, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009b A[Catch: Exception -> 0x00fe, all -> 0x011c, TryCatch #0 {Exception -> 0x00fe, blocks: (B:35:0x0086, B:37:0x0093, B:39:0x00a0, B:41:0x00aa, B:42:0x00e7, B:43:0x00fd, B:38:0x009b), top: B:51:0x0086, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa A[Catch: Exception -> 0x00fe, all -> 0x011c, TryCatch #0 {Exception -> 0x00fe, blocks: (B:35:0x0086, B:37:0x0093, B:39:0x00a0, B:41:0x00aa, B:42:0x00e7, B:43:0x00fd, B:38:0x009b), top: B:51:0x0086, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[Catch: Exception -> 0x00fe, all -> 0x011c, TryCatch #0 {Exception -> 0x00fe, blocks: (B:35:0x0086, B:37:0x0093, B:39:0x00a0, B:41:0x00aa, B:42:0x00e7, B:43:0x00fd, B:38:0x009b), top: B:51:0x0086, outer: #3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00aa, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00e7, please report this as an issue */
    public final synchronized void OooOO0(String str, String str2) {
        byte[] bArr;
        AlgorithmParameterSpec ivParameterSpec;
        String strOooO0OO;
        String strOooO0O0;
        if (str == null) {
            f10426OooO.OooOO0("dataKey is null.");
            return;
        }
        this.f10428OooO00o.put(str, str2);
        if (this.f10429OooO0O0) {
            if (str2 == null) {
                f10426OooO.OooO00o("Value is null. Removing the data, IV and version from SharedPreferences");
                this.f10428OooO00o.remove(str);
                OooOO0O(str);
                return;
            }
            String strOooO0o0 = OooO0o0(str);
            String strOooO0o = OooO0o();
            Key keyOooOO0o = OooOO0o(strOooO0o);
            if (keyOooOO0o != null) {
                bArr = new byte[12];
                this.f10435OooO0oo.nextBytes(bArr);
                if (Build.VERSION.SDK_INT >= 23) {
                    ivParameterSpec = new GCMParameterSpec(128, bArr);
                } else {
                    ivParameterSpec = new IvParameterSpec(bArr);
                }
                strOooO0OO = OooO0OO(keyOooOO0o, ivParameterSpec, str2);
                strOooO0O0 = Base64.OooO0O0(bArr);
                if (strOooO0O0 != null) {
                    throw new Exception("Error in Base64 encoding the IV for dataKey = " + str);
                }
                this.f10431OooO0Oo.edit().putString(strOooO0o0, strOooO0OO).putString(strOooO0o0 + ".iv", strOooO0O0).putString(strOooO0o0 + ".keyvaluestoreversion", String.valueOf(1)).apply();
                return;
            }
            f10426OooO.OooO("No encryption key found for encryptionKeyAlias: " + strOooO0o);
            synchronized (this) {
                try {
                    keyOooOO0o = this.f10434OooO0oO.OooO0OO(strOooO0o);
                } catch (KeyNotGeneratedException e) {
                    f10426OooO.OooO0oo("Encryption Key cannot be generated successfully.", e);
                    keyOooOO0o = null;
                }
                if (keyOooOO0o == null) {
                    f10426OooO.OooOO0("Error in generating the encryption key for encryptionKeyAlias: " + strOooO0o + " used to encrypt the data before storing. Skipping persisting the data in the persistent store.");
                    return;
                }
                try {
                    bArr = new byte[12];
                    this.f10435OooO0oo.nextBytes(bArr);
                    if (Build.VERSION.SDK_INT >= 23) {
                        ivParameterSpec = new GCMParameterSpec(128, bArr);
                    } else {
                        ivParameterSpec = new IvParameterSpec(bArr);
                    }
                    strOooO0OO = OooO0OO(keyOooOO0o, ivParameterSpec, str2);
                    strOooO0O0 = Base64.OooO0O0(bArr);
                    if (strOooO0O0 != null) {
                        throw new Exception("Error in Base64 encoding the IV for dataKey = " + str);
                    }
                    this.f10431OooO0Oo.edit().putString(strOooO0o0, strOooO0OO).putString(strOooO0o0 + ".iv", strOooO0O0).putString(strOooO0o0 + ".keyvaluestoreversion", String.valueOf(1)).apply();
                    return;
                } catch (Exception e2) {
                    f10426OooO.OooO0oo("Error in storing value for dataKey = " + str + ". This data has not been stored in the persistent store.", e2);
                }
            }
            throw th;
        }
    }

    public final synchronized void OooOO0O(String str) {
        this.f10428OooO00o.remove(str);
        if (this.f10429OooO0O0) {
            String strOooO0o0 = OooO0o0(str);
            this.f10431OooO0Oo.edit().remove(strOooO0o0).remove(strOooO0o0 + ".iv").remove(strOooO0o0 + ".keyvaluestoreversion").apply();
        }
    }

    public final synchronized Key OooOO0o(String str) {
        try {
        } catch (KeyNotFoundException e) {
            Log log = f10426OooO;
            log.OooOO0(e);
            log.OooO0o("Deleting the encryption key identified by the keyAlias: " + str);
            this.f10434OooO0oO.OooO0O0(str);
            return null;
        }
        return this.f10434OooO0oO.OooO00o(str);
    }
}
