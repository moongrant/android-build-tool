package com.ishumei.l111l11111Il;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.ak;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l11l1111I1ll {
    private static String l1111l111111Il() throws Throwable {
        boolean z;
        int iIntValue = 0;
        try {
            String strL1111l111111Il = l1111l111111Il("cat /proc/self/cgroup");
            if (!TextUtils.isEmpty(strL1111l111111Il)) {
                int iLastIndexOf = strL1111l111111Il.lastIndexOf("uid");
                int iLastIndexOf2 = strL1111l111111Il.lastIndexOf("/pid");
                if (iLastIndexOf >= 0) {
                    if (iLastIndexOf2 <= 0) {
                        iLastIndexOf2 = strL1111l111111Il.length();
                    }
                    String strReplaceAll = strL1111l111111Il.substring(iLastIndexOf + 4, iLastIndexOf2).replaceAll("\n", "");
                    if (strReplaceAll != null && strReplaceAll.length() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= strReplaceAll.length()) {
                                z = true;
                                break;
                            }
                            if (!Character.isDigit(strReplaceAll.charAt(i))) {
                                z = false;
                                break;
                            }
                            i++;
                        }
                    } else {
                        z = false;
                        break;
                    }
                    if (z) {
                        iIntValue = Integer.valueOf(strReplaceAll).intValue();
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (iIntValue == 0) {
            try {
                Context context = com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111Il;
                if (context != null) {
                    iIntValue = context.getApplicationInfo().uid;
                }
            } catch (Exception unused2) {
            }
        }
        if (iIntValue == 0) {
            return null;
        }
        return l1111l111111Il(iIntValue);
    }

    private static String l1111l111111Il(int i) {
        Method method;
        if (Build.VERSION.SDK_INT > 27) {
            return String.format(Locale.CHINA, "u0_a%d", Integer.valueOf(i - 10000));
        }
        try {
            Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField(ak.x);
            if (!declaredField.isAccessible()) {
                declaredField.setAccessible(true);
            }
            Object obj = declaredField.get(null);
            if (obj != null && (method = obj.getClass().getMethod("getpwuid", Integer.TYPE)) != null) {
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                Object objInvoke = method.invoke(obj, Integer.valueOf(i));
                if (objInvoke != null) {
                    Field declaredField2 = objInvoke.getClass().getDeclaredField("pw_name");
                    if (!declaredField2.isAccessible()) {
                        declaredField2.setAccessible(true);
                    }
                    return (String) declaredField2.get(objInvoke);
                }
            }
            return null;
        } catch (Exception unused) {
            return String.format(Locale.CHINA, "u0_a%d", Integer.valueOf(i - 10000));
        }
    }

    private static String l1111l111111Il(BufferedInputStream bufferedInputStream) {
        int i;
        byte[] bArr = new byte[512];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception unused) {
            }
        } while (i >= 512);
        return sb.toString();
    }

    private static String l1111l111111Il(String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        Process processExec;
        try {
            processExec = Runtime.getRuntime().exec(str);
            try {
                bufferedInputStream = new BufferedInputStream(processExec.getInputStream());
                try {
                    processExec.waitFor();
                    String strL1111l111111Il = l1111l111111Il(bufferedInputStream);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    processExec.destroy();
                    return strL1111l111111Il;
                } catch (Exception unused2) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (processExec == null) {
                        throw th;
                    }
                    processExec.destroy();
                    throw th;
                }
            } catch (Exception unused5) {
                bufferedInputStream = null;
            } catch (Throwable th3) {
                bufferedInputStream = null;
                th = th3;
            }
        } catch (Exception unused6) {
            processExec = null;
            bufferedInputStream = null;
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            processExec = null;
        }
    }

    public static void l1111l111111Il(com.ishumei.l1111l111111Il.l111l11111lIl l111l11111lil) throws Throwable {
        try {
            String strL1111l111111Il = l1111l111111Il();
            if (TextUtils.isEmpty(strL1111l111111Il)) {
                return;
            }
            String strL1111l111111Il2 = l1111l111111Il("ps");
            if (!TextUtils.isEmpty(strL1111l111111Il2) && strL1111l111111Il2.split("\n").length > 0) {
                l111l11111lil.l111l111III1l(strL1111l111111Il);
            }
        } catch (Exception unused) {
        }
    }

    private static void l111l11111lIl(com.ishumei.l1111l111111Il.l111l11111lIl l111l11111lil) throws Throwable {
        try {
            String strL1111l111111Il = l1111l111111Il();
            if (TextUtils.isEmpty(strL1111l111111Il)) {
                return;
            }
            String strL1111l111111Il2 = l1111l111111Il("ps");
            if (!TextUtils.isEmpty(strL1111l111111Il2) && strL1111l111111Il2.split("\n").length > 0) {
                l111l11111lil.l111l111III1l(strL1111l111111Il);
            }
        } catch (Exception unused) {
        }
    }

    private static boolean l111l11111lIl(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
