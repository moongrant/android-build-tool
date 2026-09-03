package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class al {
    private static String AFKeystoreWrapper;

    public static synchronized String AFInAppEventParameterName(WeakReference<Context> weakReference) {
        if (weakReference.get() == null) {
            return AFKeystoreWrapper;
        }
        if (AFKeystoreWrapper == null) {
            String string = null;
            if (weakReference.get() != null) {
                string = ag.AFInAppEventParameterName(weakReference.get()).getString("AF_INSTALLATION", null);
            }
            if (string != null) {
                AFKeystoreWrapper = string;
            } else {
                try {
                    File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                    if (file.exists()) {
                        AFKeystoreWrapper = AFInAppEventType(file);
                        file.delete();
                    } else {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        StringBuilder sb = new StringBuilder();
                        sb.append(jCurrentTimeMillis);
                        sb.append("-");
                        sb.append(Math.abs(new SecureRandom().nextLong()));
                        AFKeystoreWrapper = sb.toString();
                    }
                    String str = AFKeystoreWrapper;
                    SharedPreferences.Editor editorEdit = ag.AFInAppEventParameterName(weakReference.get()).edit();
                    editorEdit.putString("AF_INSTALLATION", str);
                    editorEdit.apply();
                } catch (Exception e) {
                    AFLogger.AFKeystoreWrapper("Error getting AF unique ID", e);
                }
            }
            if (AFKeystoreWrapper != null) {
                AppsFlyerProperties.getInstance().set("uid", AFKeystoreWrapper);
            }
        }
        return AFKeystoreWrapper;
    }

    private static String AFInAppEventType(File file) throws Throwable {
        byte[] bArr;
        RandomAccessFile randomAccessFile = null;
        byte[] bArr2 = null;
        randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    bArr2 = new byte[(int) randomAccessFile2.length()];
                    randomAccessFile2.readFully(bArr2);
                    randomAccessFile2.close();
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e) {
                        AFLogger.AFKeystoreWrapper("Exception while trying to close the InstallationFile", e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = bArr2;
                    randomAccessFile = randomAccessFile2;
                    AFLogger.AFKeystoreWrapper("Exception while reading InstallationFile: ", e);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e3) {
                            AFLogger.AFKeystoreWrapper("Exception while trying to close the InstallationFile", e3);
                        }
                    }
                    bArr2 = bArr;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e4) {
                            AFLogger.AFKeystoreWrapper("Exception while trying to close the InstallationFile", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                bArr = null;
            }
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            return new String(bArr2);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
