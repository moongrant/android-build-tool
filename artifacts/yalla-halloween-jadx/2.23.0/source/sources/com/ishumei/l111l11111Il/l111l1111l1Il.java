package com.ishumei.l111l11111Il;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes3.dex */
public final class l111l1111l1Il {
    private static final int l1111l111111Il = -1;
    private static final FileFilter l111l11111lIl = new FileFilter() { // from class: com.ishumei.l111l11111Il.l111l1111l1Il.1
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            try {
                if (name.startsWith(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c8f8a"))) {
                    for (int i = 3; i < name.length(); i++) {
                        if (!Character.isDigit(name.charAt(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            return false;
        }
    };

    public static class l1111l111111Il {
        public String l1111l111111Il = "";
    }

    private static int l1111l111111Il(String str) throws Throwable {
        FileInputStream fileInputStream;
        int i = -1;
        BufferedReader bufferedReader = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null && line.matches("0-[\\d]+$")) {
                        i = Integer.parseInt(line.substring(2)) + 1;
                    }
                    com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) bufferedReader2);
                } catch (IOException unused) {
                    bufferedReader = bufferedReader2;
                    com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) bufferedReader);
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) bufferedReader);
                    com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused3) {
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream);
        return i;
    }

    public static int l111l11111I1l() throws Throwable {
        FileInputStream fileInputStream;
        Throwable th;
        try {
            int iL111l11111lIl = l111l11111lIl();
            int iIntValue = -1;
            for (int i = 0; i < iL111l11111lIl; i++) {
                File file = new File(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d08c868cd09b9a89969c9a8cd08c868c8b9a92d09c8f8ad09c8f8a") + i + com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d09c8f8a998d9a8ed09c8f8a96919990a0929e87a0998d9a8e"));
                if (file.exists()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        int i2 = 0;
                        while (i2 < 128 && Character.isDigit(bArr[i2])) {
                            i2++;
                        }
                        Integer numValueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i2)));
                        if (numValueOf.intValue() > iIntValue) {
                            iIntValue = numValueOf.intValue();
                        }
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th2) {
                        com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream2);
                        throw th2;
                    }
                    com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream2);
                }
            }
            if (iIntValue == -1) {
                try {
                    fileInputStream = new FileInputStream(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d08f8d909cd09c8f8a96919990"));
                    try {
                        int iL1111l111111Il = l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c8f8adfb2b785"), fileInputStream) * 1000;
                        if (iL1111l111111Il > iIntValue) {
                            iIntValue = iL1111l111111Il;
                        }
                        com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream);
                    } catch (Throwable th3) {
                        th = th3;
                        com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    fileInputStream = null;
                    th = th4;
                }
            }
            return iIntValue;
        } catch (Exception unused2) {
            return -1;
        }
    }

    @TargetApi(16)
    public static long l111l11111Il() {
        Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
        if (context == null) {
            return 0L;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static int l111l11111lIl() {
        try {
            int iL1111l111111Il = l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d08c868cd09b9a89969c9a8cd08c868c8b9a92d09c8f8ad08f908c8c969d939a"));
            if (iL1111l111111Il == -1) {
                iL1111l111111Il = l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d08c868cd09b9a89969c9a8cd08c868c8b9a92d09c8f8ad08f8d9a8c9a918b"));
            }
            return iL1111l111111Il == -1 ? l111l1111l1Il() : iL1111l111111Il;
        } catch (SecurityException | Exception unused) {
            return -1;
        }
    }

    private static int l111l1111l1Il() {
        try {
            return new File(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d08c868cd09b9a89969c9a8cd08c868c8b9a92d09c8f8ad08f908c8c969d939a")).listFiles(l111l11111lIl).length;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int l1111l111111Il(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
        try {
            int i = fileInputStream.read(bArr);
            int i2 = 0;
            while (i2 < i) {
                byte b = bArr[i2];
                if (b == 10 || i2 == 0) {
                    if (b == 10) {
                        i2++;
                    }
                    int i3 = i2;
                    while (i3 < i) {
                        int i4 = i3 - i2;
                        if (bArr[i3] != str.charAt(i4)) {
                            break;
                        }
                        if (i4 == str.length() - 1) {
                            while (i3 < 1024) {
                                byte b2 = bArr[i3];
                                if (b2 == 10) {
                                    break;
                                }
                                if (Character.isDigit(b2)) {
                                    int i5 = i3 + 1;
                                    while (i5 < 1024 && Character.isDigit(bArr[i5])) {
                                        i5++;
                                    }
                                    return Integer.parseInt(new String(bArr, 0, i3, i5 - i3));
                                }
                                i3++;
                            }
                            return -1;
                        }
                        i3++;
                    }
                }
                i2++;
            }
        } catch (IOException | NumberFormatException unused) {
        }
        return -1;
    }

    private static int l111l11111lIl(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.parseInt(str.substring(2)) + 1;
    }

    private static int l1111l111111Il(byte[] bArr, int i) {
        byte b;
        while (i < 1024 && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < 1024 && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    public static l1111l111111Il l1111l111111Il() {
        l1111l111111Il l1111l111111il = new l1111l111111Il();
        try {
            Iterator<String> it = com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("d08f8d909cd09c8f8a96919990")).iterator();
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split(CertificateUtil.DELIMITER);
                if (2 == strArrSplit.length) {
                    String strTrim = strArrSplit[0].trim();
                    String strTrim2 = strArrSplit[1].trim();
                    if (TextUtils.equals(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("af8d909c9a8c8c908d"), strTrim) || TextUtils.equals(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("92909b9a93df919e929a"), strTrim)) {
                        l1111l111111il.l1111l111111Il = strTrim2;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return l1111l111111il;
    }
}
