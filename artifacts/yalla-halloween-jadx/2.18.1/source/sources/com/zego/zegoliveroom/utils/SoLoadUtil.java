package com.zego.zegoliveroom.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class SoLoadUtil {
    private static final int BUFFER_SIZE = 65536;
    private static final String VERSION_FILE_NAME_TEMPLATE = "cur_ver_%d.txt";

    private static boolean copyFile(File file, File file2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2, false));
                try {
                    byte[] bArr = new byte[65536];
                    int i = 0;
                    while (true) {
                        int i2 = bufferedInputStream2.read(bArr, 0, 65536);
                        if (i2 == -1) {
                            bufferedOutputStream.flush();
                            bufferedInputStream2.close();
                            bufferedOutputStream.close();
                            return true;
                        }
                        bufferedOutputStream.write(bArr, 0, i2);
                        i++;
                        if (i % 10 == 0) {
                            bufferedOutputStream.flush();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedOutputStream = null;
        }
    }

    private static File getCustomizeLibDir(Context context, String str) {
        return new File(context.getDir("libs", 0), str);
    }

    private static String[] getSupportABIs() {
        return Build.SUPPORTED_ABIS;
    }

    private static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean loadSoFile(String str, Context context) {
        File customizeLibDir = getCustomizeLibDir(context, "apk");
        File file = new File(customizeLibDir, versionFileName(getVersionCode(context)));
        File file2 = new File(customizeLibDir, str);
        int iUnzipSo = (file.exists() && file2.exists()) ? 0 : unzipSo(context, str, file2, file);
        if (iUnzipSo == 0 && file.exists() && file2.exists()) {
            System.load(file2.getPath());
            return true;
        }
        Log.e("ZegoSoLoadUtil", "unzip " + str + " from apk failed, errorCode: " + iUnzipSo);
        return false;
    }

    public static boolean loadSpecialLibrary(String str, Context context) throws Exception {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            System.load(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            File file2 = new File(getCustomizeLibDir(context, "ext"), file.getName());
            if (!file2.exists() || file2.length() != file.length()) {
                copyFile(file, file2);
            }
            if (!file2.exists()) {
                return true;
            }
            System.load(file2.getAbsolutePath());
            return true;
        }
    }

    private static int unzipSo(Context context, String str, File file, File file2) {
        String packageCodePath = context.getPackageCodePath();
        for (String str2 : getSupportABIs()) {
            try {
                if (unzipSpecialABISo(packageCodePath, str, str2, file)) {
                    return file2.createNewFile() ? 0 : -1;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return -2;
            }
        }
        return -3;
    }

    private static boolean unzipSpecialABISo(String str, String str2, String str3, File file) throws Throwable {
        boolean z;
        ZipInputStream zipInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        zipInputStream = null;
        try {
            try {
                ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream2.getNextEntry();
                        if (nextEntry == null) {
                            z = false;
                            break;
                        }
                        String name = nextEntry.getName();
                        if (!name.contains("../")) {
                            if (name.startsWith("lib/") && name.startsWith(str3, 4) && name.endsWith(str2)) {
                                z = true;
                                break;
                            }
                        } else {
                            throw new SecurityException("unsecurity zip file!");
                        }
                    } catch (Exception e) {
                        e = e;
                        zipInputStream = zipInputStream2;
                        e.printStackTrace();
                        if (zipInputStream != null) {
                            zipInputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        zipInputStream = zipInputStream2;
                        if (zipInputStream != null) {
                            zipInputStream.close();
                        }
                        throw th;
                    }
                }
                if (!z) {
                    zipInputStream2.close();
                    return false;
                }
                byte[] bArr = new byte[65536];
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file), 65536);
                    while (true) {
                        try {
                            int i = zipInputStream2.read(bArr, 0, 65536);
                            if (i == -1) {
                                bufferedOutputStream2.flush();
                                bufferedOutputStream2.close();
                                zipInputStream2.close();
                                return true;
                            }
                            bufferedOutputStream2.write(bArr, 0, i);
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static String versionFileName(int i) {
        return String.format(VERSION_FILE_NAME_TEMPLATE, Integer.valueOf(i));
    }
}
