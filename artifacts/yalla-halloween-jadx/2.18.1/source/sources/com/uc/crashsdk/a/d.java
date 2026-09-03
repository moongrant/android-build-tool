package com.uc.crashsdk.a;

import android.os.Process;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.internal.ServerProtocol;
import com.umeng.analytics.pro.ak;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.Locale;
import p023Oooo00O.o00O0;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static final /* synthetic */ boolean a = true;
    private static boolean b = true;
    private static boolean d = false;
    private static String e = "hsdk";
    private static String f = "alid ";
    private static String g;
    private static String i;
    private static final Object c = new Object();
    private static final Object h = new Object();

    public static void a() {
        f.a(0, new e(500), com.uc.crashsdk.b.H() ? 900000L : 90000L);
    }

    public static String b() {
        try {
            return "inv" + f + "cras" + e;
        } catch (Throwable th) {
            g.b(th);
            return "";
        }
    }

    public static void c() {
        synchronized (h) {
            i = null;
        }
    }

    public static byte[] d() {
        return new byte[]{6, 0, 23, 8};
    }

    public static boolean e() {
        try {
            if (!com.uc.crashsdk.e.F() && !com.uc.crashsdk.b.L()) {
                a(true);
                return b;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    private static String f() {
        String strA = i;
        if (g.a(strA)) {
            synchronized (h) {
                strA = g.a(com.uc.crashsdk.b.j(), (com.uc.crashsdk.g.P() ? "https://errlogos.umeng.com" : "https://errlog.umeng.com") + "/api/crashsdk/validate", true);
                i = strA;
            }
        }
        return strA;
    }

    private static String g() {
        byte[] bArrA;
        String strF;
        byte[] bArrA2;
        byte[] bArrA3;
        StringBuilder sb = new StringBuilder();
        a(sb, "platform", com.uc.crashsdk.g.e());
        a(sb, "pkgname", com.uc.crashsdk.a.a);
        a(sb, UMModuleRegister.PROCESS, com.uc.crashsdk.e.h());
        a(sb, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, com.uc.crashsdk.a.a());
        a(sb, "cver", "3.3.0.0");
        a(sb, "ctag", "umeng");
        a(sb, "inter", com.uc.crashsdk.g.P() ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        a(sb, ak.x, "android");
        String string = sb.toString();
        byte[] bArr = new byte[16];
        c.a(bArr, 0, h.j());
        c.a(bArr, 4, c.a());
        c.a(bArr, 8, d());
        c.a(bArr, 12, com.uc.crashsdk.a.f());
        try {
            bArrA = c.a(string.getBytes(), bArr, true);
        } catch (Throwable th) {
            g.a(th);
            bArrA = null;
        }
        if (bArrA == null || (strF = f()) == null || (bArrA2 = c.a(strF, bArrA)) == null) {
            return null;
        }
        try {
            bArrA3 = c.a(bArrA2, bArr, false);
        } catch (Throwable th2) {
            g.a(th2);
            bArrA3 = null;
        }
        if (bArrA3 != null) {
            return new String(bArrA3);
        }
        return null;
    }

    public static void a(int i2) {
        if (i2 != 500) {
            if (!a) {
                throw new AssertionError();
            }
            return;
        }
        synchronized (c) {
            g = null;
            a(!com.uc.crashsdk.b.F());
            if (g.b(g)) {
                h.a(g);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    private static boolean a(boolean z) {
        int iC;
        boolean z2;
        String str;
        if (d) {
            return false;
        }
        d = !z;
        if ((com.uc.crashsdk.a.b.equals("2.0") && com.uc.crashsdk.b.c(536870912)) || !com.uc.crashsdk.b.A()) {
            return false;
        }
        String strN = com.uc.crashsdk.b.n();
        String strA = b.a(strN);
        String str2 = null;
        long jC = 0;
        if (g.b(strA)) {
            String[] strArrSplit = strA.split(ZegoConstants.ZegoVideoDataAuxPublishingStream, 4);
            if (strArrSplit.length == 3) {
                str2 = strArrSplit[0];
                jC = g.c(strArrSplit[1]);
                iC = (int) g.c(strArrSplit[2]);
            } else {
                iC = 0;
            }
        } else {
            iC = 0;
        }
        b = true;
        if (System.currentTimeMillis() - jC >= 259200000) {
            z2 = true;
        } else {
            if (!"o".equals(str2)) {
                if (FeedbackType.Suggestions.equals(str2)) {
                    b = false;
                } else {
                    if ("1".equals(str2)) {
                        b = false;
                    }
                    z2 = true;
                }
            }
            z2 = false;
        }
        if (!z2 || z) {
            return true;
        }
        if (iC == Process.myPid()) {
            return false;
        }
        g = "per";
        String strG = g();
        if (strG == null || !strG.contains("retcode=")) {
            if (strG == null) {
                g = "ner";
            } else {
                g = "ser";
            }
            return false;
        }
        if (strG.contains("retcode=0")) {
            b = true;
            str = "o";
            g = "aus";
        } else {
            b = false;
            if ("1".equals(str2)) {
                str = FeedbackType.Suggestions;
                g = "auf2";
            } else {
                str = "1";
                g = "auf1";
            }
        }
        b.a(strN, String.format(Locale.US, "%s %d %d", str, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Process.myPid())));
        if (g.b(strG)) {
            for (String str3 : strG.split("`", 30)) {
                String[] strArrSplit2 = str3.split("=", 2);
                if (strArrSplit2.length == 2) {
                    String strTrim = strArrSplit2[0].trim();
                    String strTrim2 = strArrSplit2[1].trim();
                    boolean z3 = g.b(strTrim2) && strTrim2.startsWith("http");
                    if ("logurl".equals(strTrim)) {
                        if (z3) {
                            com.uc.crashsdk.e.b(strTrim2);
                        }
                    } else if ("staturl".equals(strTrim)) {
                        if (z3) {
                            h.b(strTrim2);
                        }
                    } else if ("policyurl".equals(strTrim)) {
                        if (z3) {
                            synchronized (h) {
                                i = strTrim2;
                                b.a(com.uc.crashsdk.b.j(), strTrim2 + "\n");
                            }
                        } else {
                            continue;
                        }
                    } else if ("logpolicy".equals(strTrim)) {
                        com.uc.crashsdk.e.c(strTrim2);
                    }
                }
            }
        }
        return true;
    }

    private static StringBuilder a(StringBuilder sb, String str, String str2) {
        if (sb.length() > 0) {
            sb.append("`");
        }
        o00O0.OooO0OO(sb, str, "=", str2);
        return sb;
    }
}
