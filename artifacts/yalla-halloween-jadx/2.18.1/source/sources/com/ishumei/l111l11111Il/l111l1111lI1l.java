package com.ishumei.l111l11111Il;

import android.os.Build;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class l111l1111lI1l {
    private static String l1111l111111Il = "sm";
    private static final String[] l111l1111lI1l = null;
    private static final String[] l111l1111llIl = null;
    private static final String[] l111l11111lIl = {"/dev/socket/qemud", "/dev/qemu_pipe"};
    private static final String[] l111l11111I1l = {"goldfish"};
    private static final String[] l111l11111Il = {"/sys/qemu_trace", "/system/bin/qemu-props"};
    private static final String[] l111l1111l1Il = {"000000000000000"};

    public static String l1111l111111Il(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(l1111l111111Il(l1111l111111Il()));
        sb.append(l1111l111111Il(l111l11111lIl()));
        sb.append(l1111l111111Il(l111l11111I1l()));
        sb.append(l1111l111111Il(false));
        sb.append(l1111l111111Il(l1111l111111Il(str)));
        sb.append(l1111l111111Il("unknown".equals(Build.BOARD) || "unknown".equals(Build.BOOTLOADER) || "generic".equals(Build.BRAND) || "generic".equals(Build.DEVICE) || ServerProtocol.DIALOG_PARAM_SDK_VERSION.equals(Build.MODEL) || ServerProtocol.DIALOG_PARAM_SDK_VERSION.equals(Build.PRODUCT) || "goldfish".equals(Build.HARDWARE)));
        sb.append(l1111l111111Il(l111l11111lIl(str2)));
        return sb.toString();
    }

    private static String l1111l111111Il(boolean z) {
        return z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    private static boolean l1111l111111Il() {
        try {
            String[] strArr = l111l11111lIl;
            for (int i = 0; i < 2; i++) {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean l1111l111111Il(String str) {
        try {
            String[] strArr = l111l1111l1Il;
            for (int i = 0; i <= 0; i++) {
                if (strArr[0].equalsIgnoreCase(str)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean l111l11111I1l() {
        try {
            String[] strArr = l111l11111Il;
            for (int i = 0; i < 2; i++) {
                if (new File(strArr[i]).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean l111l11111Il() {
        return false;
    }

    private static boolean l111l11111lIl() {
        try {
            File file = new File("/proc/tty/drivers");
            if (file.exists() && file.canRead()) {
                byte[] bArr = new byte[(int) file.length()];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        fileInputStream2.read(bArr);
                        String str = new String(bArr);
                        String[] strArr = l111l11111I1l;
                        for (int i = 0; i <= 0; i++) {
                            if (str.contains(strArr[0])) {
                                com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream2);
                                return true;
                            }
                        }
                        com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream2);
                    } catch (Exception unused) {
                        fileInputStream = fileInputStream2;
                        com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable unused3) {
        }
        return false;
    }

    private static boolean l111l11111lIl(String str) {
        try {
            return str.toLowerCase().equals("android");
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean l111l1111l1Il() {
        return "unknown".equals(Build.BOARD) || "unknown".equals(Build.BOOTLOADER) || "generic".equals(Build.BRAND) || "generic".equals(Build.DEVICE) || ServerProtocol.DIALOG_PARAM_SDK_VERSION.equals(Build.MODEL) || ServerProtocol.DIALOG_PARAM_SDK_VERSION.equals(Build.PRODUCT) || "goldfish".equals(Build.HARDWARE);
    }
}
