package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public class AFKeystoreWrapper {
    public KeyStore AFInAppEventParameterName;
    private Context AFKeystoreWrapper;
    public final Object AFInAppEventType = new Object();
    public String valueOf = "";
    public int values = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFKeystoreWrapper = context;
        AFLogger.AFInAppEventType("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventParameterName = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.AFKeystoreWrapper("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    public final String AFInAppEventParameterName() {
        String str;
        synchronized (this.AFInAppEventType) {
            str = this.valueOf;
        }
        return str;
    }

    public final void AFInAppEventType(String str) {
        AFLogger.AFInAppEventType("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.AFInAppEventType) {
                if (this.AFInAppEventParameterName.containsAlias(str)) {
                    AFLogger.AFInAppEventType("Alias already exists: ".concat(String.valueOf(str)));
                } else {
                    KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(keyGenParameterSpecBuild);
                    keyPairGenerator.generateKeyPair();
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.AFKeystoreWrapper(sb.toString(), th);
        }
    }

    public final boolean AFKeystoreWrapper() {
        boolean z;
        synchronized (this.AFInAppEventType) {
            KeyStore keyStore = this.AFInAppEventParameterName;
            z = false;
            if (keyStore != null) {
                try {
                    Enumeration<String> enumerationAliases = keyStore.aliases();
                    while (enumerationAliases.hasMoreElements()) {
                        String strNextElement = enumerationAliases.nextElement();
                        if (strNextElement != null && AFKeystoreWrapper(strNextElement)) {
                            String[] strArrSplit = strNextElement.split(",");
                            if (strArrSplit.length != 3) {
                                break;
                            }
                            AFLogger.AFInAppEventType("Found a matching AF key with alias:\n".concat(strNextElement));
                            z = true;
                            String[] strArrSplit2 = strArrSplit[1].trim().split("=");
                            String[] strArrSplit3 = strArrSplit[2].trim().split("=");
                            if (strArrSplit2.length != 2 || strArrSplit3.length != 2) {
                                break;
                                break;
                            }
                            this.valueOf = strArrSplit2[1].trim();
                            this.values = Integer.parseInt(strArrSplit3[1].trim());
                            break;
                        }
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("Couldn't list KeyStore Aliases: ");
                    sb.append(th.getClass().getName());
                    AFLogger.AFKeystoreWrapper(sb.toString(), th);
                }
            }
        }
        return z;
    }

    public final String valueOf() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFInAppEventType) {
            sb.append(this.valueOf);
            sb.append(",KSAppsFlyerRICounter=");
            sb.append(this.values);
        }
        return sb.toString();
    }

    private static boolean AFKeystoreWrapper(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final int AFInAppEventType() {
        int i;
        synchronized (this.AFInAppEventType) {
            i = this.values;
        }
        return i;
    }
}
