package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ah {
    private static ah AFKeystoreWrapper = new ah();

    private ah() {
    }

    public static ah AFInAppEventParameterName() {
        return AFKeystoreWrapper;
    }

    public static File AFInAppEventType(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

    public static List<h> values(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (file.exists()) {
                for (File file2 : file.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    AFLogger.AFInAppEventType(sb.toString());
                    arrayList.add(AFInAppEventType(file2));
                }
            } else {
                file.mkdir();
            }
        } catch (Exception e) {
            AFLogger.AFKeystoreWrapper("Could not cache request", e);
        }
        return arrayList;
    }

    public static void AFInAppEventParameterName(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        AFLogger.AFInAppEventType(sb.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                AFLogger.AFKeystoreWrapper(sb2.toString(), e);
            }
        }
    }

    public static h AFInAppEventType(File file) throws Throwable {
        FileReader fileReader;
        FileReader fileReader2 = null;
        try {
            fileReader = new FileReader(file);
            try {
                char[] cArr = new char[(int) file.length()];
                fileReader.read(cArr);
                h hVar = new h(cArr);
                hVar.AFInAppEventParameterName = file.getName();
                try {
                    fileReader.close();
                } catch (IOException e) {
                    AFLogger.values(e);
                }
                return hVar;
            } catch (Exception unused) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException e2) {
                        AFLogger.values(e2);
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (IOException e3) {
                        AFLogger.values(e3);
                    }
                }
                throw th;
            }
        } catch (Exception unused2) {
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
