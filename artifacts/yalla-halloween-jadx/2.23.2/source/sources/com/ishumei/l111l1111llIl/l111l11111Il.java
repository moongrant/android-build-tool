package com.ishumei.l111l1111llIl;

import android.util.Log;
import p028Oooo0oO.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class l111l11111Il {
    private static boolean l1111l111111Il = false;
    private static int l111l11111lIl = 5;

    private static String l1111l111111Il(String str, Object... objArr) {
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof String[]) {
                objArr[i] = l1111l111111Il((String[]) obj);
            }
        }
        return "[" + Thread.currentThread().getId() + "] " + String.format(str, objArr);
    }

    public static void l111l11111I1l(String str, String str2, Object... objArr) {
        if (!l1111l111111Il || l111l11111lIl > 5) {
            return;
        }
        Log.w(str, l1111l111111Il(str2, objArr));
    }

    public static void l111l11111Il(String str, String str2, Object... objArr) {
        if (!l1111l111111Il || l111l11111lIl > 6) {
            return;
        }
        Log.e(str, l1111l111111Il(str2, objArr));
    }

    public static void l111l11111lIl(String str, String str2, Object... objArr) {
        if (!l1111l111111Il || l111l11111lIl > 4) {
            return;
        }
        Log.i(str, l1111l111111Il(str2, objArr));
    }

    private static void l111l1111l1Il(String str, String str2, Object... objArr) {
        if (!l1111l111111Il || l111l11111lIl > 2) {
            return;
        }
        Log.v(str, l1111l111111Il(str2, objArr));
    }

    private static void l111l1111llIl(String str, String str2, Object... objArr) {
        if (l111l11111lIl <= 6) {
            Log.e(str, l1111l111111Il(str2, objArr));
        }
    }

    private static String l1111l111111Il(String[] strArr) {
        if (strArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int length = strArr.length - 1;
        for (int i = 0; i < length; i++) {
            sb.append(strArr[i]);
            sb.append(", ");
        }
        return o0oOO.OooO0O0(sb, strArr[length], "]");
    }

    private static void l1111l111111Il(int i) {
        l111l11111lIl = i;
    }

    public static void l1111l111111Il(String str, String str2, Object... objArr) {
        if (!l1111l111111Il || l111l11111lIl > 3) {
            return;
        }
        Log.d(str, l1111l111111Il(str2, objArr));
    }

    public static void l1111l111111Il(Throwable th) {
        if (l1111l111111Il) {
            th.printStackTrace();
        }
    }

    private static void l1111l111111Il(boolean z) {
        l1111l111111Il = z;
    }
}
