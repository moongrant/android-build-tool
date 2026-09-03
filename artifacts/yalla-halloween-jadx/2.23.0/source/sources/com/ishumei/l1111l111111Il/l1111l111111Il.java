package com.ishumei.l1111l111111Il;

import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.ishumei.dfp.SMSDK;
import com.ishumei.smantifraud.SmAntiFraud;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class l1111l111111Il {
    private static int l1111l111111Il = 1;
    private static String l111l11111I1l = null;
    private static String l111l11111Il = null;
    private static int l111l11111lIl = 2;
    private static String l111l1111l1Il;
    private static String l111l1111lI1l;
    private static String l111l1111lIl;
    private static String l111l1111llIl;
    private static String l11l1111I11l;
    private static String l11l1111I1l;
    private static String l11l1111I1ll;
    private static String l11l1111Il;
    private static String l11l1111Il1l;
    private static String l11l1111Ill;
    private static String l11l1111lIIl;
    private static String l11l111l11Il;
    private static l1111l111111Il l11l111l1lll;
    private static String l11l11IlIIll;
    private String l111l11IlIlIl;

    static {
        try {
            l111l11111I1l = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("919a8b88908d94");
            com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("908f9a8d9e8b908d");
            l111l1111l1Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c8c969b");
            l111l1111llIl = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9d8c8c969b");
            l111l1111lI1l = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("88969996968f");
            com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("96929a96");
            com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("96928c96");
            com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("969c9c969b");
            l11l1111I1l = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e9b969b");
            com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c9a9393");
            com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e8f8f8c");
            l11l1111Il1l = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("919a8b");
            l11l1111Ill = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8c9a918c908d");
            l11l11IlIIll = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9e96919990");
            com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("8d968c949e8f8f");
        } catch (Exception unused) {
        }
        l11l111l1lll = null;
    }

    public static l1111l111111Il l1111l111111Il() {
        if (l11l111l1lll == null) {
            synchronized (l1111l111111Il.class) {
                if (l11l111l1lll == null) {
                    l11l111l1lll = new l1111l111111Il();
                }
            }
        }
        return l11l111l1lll;
    }

    public final String l111l11111lIl() {
        return this.l111l11IlIlIl;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x02d2  */
    public final synchronized String l1111l111111Il(int i) {
        String strV1;
        int i2;
        l111l11111lIl l111l11111lil = new l111l11111lIl();
        l111l11111lil.l11l1111I1ll(l111l1111llIl.l1111l111111Il.l111l1111l1Il);
        com.ishumei.l111l11111lIl.l111l11111lIl l111l11111lIl2 = com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111lIl();
        SmAntiFraud.SmOption smOption = SmAntiFraud.l1111l111111Il;
        String strL11l1111Il = null;
        try {
            Set<String> setL11l1111Ill = smOption.l11l1111Ill();
            if (setL11l1111Ill == null) {
                setL11l1111Ill = Collections.emptySet();
            }
            l111l11111lil.l1111l111111Il(setL11l1111Ill);
            l111l11111lil.l11l1111lIIl(smOption.l1111l111111Il());
            Set<String> setL11l1111Il1l = l111l11111lIl2 == null ? null : l111l11111lIl2.l11l1111Il1l();
            l111l11111lil.l11l1111Il("all");
            l111l11111lil.l111l11111Il(smOption.l11l1111I1ll());
            l11l1111I1l.l1111l111111Il().l1111l111111Il(l111l11111lil);
            l111l11111lil.l1111l111111Il(com.ishumei.l111l11111Il.l1111l111111Il.l11l1111I1ll());
            int i3 = i & 1;
            l111l11111lil.l11l1111Ill(i3 == 1 ? "md5" : "none");
            l111l11111lil.l11l11IlIIll(l111l1111l1Il.l1111l111111Il().l111l11111lIl());
            l111l11111lil.l11l111l11Il(smOption.l11l1111Il());
            l111l11111lil.l11l111l1lll("android");
            l111l11111lil.l111l11IlIlIl("3.0.6");
            l111l11111lil.l11l111l1I1l("");
            l111l11111lil.l1111l111111Il(Long.valueOf(System.currentTimeMillis()));
            l111l11111lil.l1111l111111Il(Integer.valueOf(com.ishumei.l111l11111Il.l111l11111lIl.l1111l111111Il()));
            l111l11111lil.l11l111l1Il(Build.VERSION.RELEASE);
            l111l11111lil.l11l111ll11l(smOption.l11l11IlIIll());
            if (setL11l1111Il1l != null && setL11l1111Il1l.contains(l11l11IlIIll)) {
                StringBuilder sb = new StringBuilder();
                sb.append(com.ishumei.l111l11111Il.l1111l111111Il.l111l11111lIl());
                l111l11111lil.l11l111ll1Il(sb.toString());
            }
            com.ishumei.l111l11111Il.l111l1111lIl l111l1111lil = new com.ishumei.l111l11111Il.l111l1111lIl();
            if (!setL11l1111Ill.contains(l11l1111Il1l)) {
                List<String> listL111l1111l1Il = com.ishumei.l111l11111Il.l111l1111lIl.l111l1111l1Il();
                if (i3 == 1) {
                    ArrayList arrayList = new ArrayList(listL111l1111l1Il.size());
                    Iterator<String> it = listL111l1111l1Il.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111I1l(it.next()));
                    }
                    l111l11111lil.l111l11111lIl(arrayList);
                } else {
                    l111l11111lil.l111l11111lIl(listL111l1111l1Il);
                }
            }
            if (setL11l1111Il1l != null && setL11l1111Il1l.contains(l111l1111llIl) && !setL11l1111Ill.contains(l111l1111llIl)) {
                l111l11111lil.l11l111lll(i3 == 1 ? com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111I1l(l111l1111lil.l111l11111lIl()) : l111l1111lil.l111l11111lIl());
            }
            if (setL11l1111Il1l != null && setL11l1111Il1l.contains(l111l1111l1Il) && !setL11l1111Ill.contains(l111l1111l1Il)) {
                l111l11111lil.l111l111llIl(l111l1111lil.l1111l111111Il());
            }
            if (!setL11l1111Ill.contains(l111l1111lI1l)) {
                l111l11111lil.l11l111lI1l(l111l1111lil.l111l11111I1l());
            }
            if (!setL11l1111Ill.contains(l111l11111I1l)) {
                l111l11111lil.l11l111I11l(l111l1111lil.l111l11111Il());
            }
            l111l11111lil.l1111l111111Il(com.ishumei.l111l11111Il.l11l1111I1l.l1111l111111Il());
            if (!setL11l1111Ill.contains(l11l1111I1l)) {
                l111l11111lil.l11l111lllIl(i3 == 1 ? com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111I1l(com.ishumei.l111l11111Il.l11l1111I11l.l1111l111111Il()) : com.ishumei.l111l11111Il.l11l1111I11l.l1111l111111Il());
            }
            l111l11111lil.l11l111llI1l(Build.getRadioVersion());
            l111l11111lil.l11l1111I11l(com.ishumei.l111l11111Il.l1111l111111Il.l111l1111lI1l());
            l111l11111lil.l111l1111lIl(com.ishumei.l111l11111Il.l1111l111111Il.l111l1111lIl());
            l111l11111lil.l11l11l1lIl(com.ishumei.l111l11111Il.l111l1111l1Il.l1111l111111Il().l1111l111111Il);
            l111l11111lil.l111l11111Il(Integer.valueOf(com.ishumei.l111l11111Il.l111l1111l1Il.l111l11111lIl()));
            l111l11111lil.l111l1111l1Il(Integer.valueOf(com.ishumei.l111l11111Il.l111l1111l1Il.l111l11111I1l()));
            l111l11111lil.l111l11111I1l(Long.valueOf(com.ishumei.l111l11111Il.l111l1111l1Il.l111l11111Il()));
            l111l11111lil.l11l111lIll(com.ishumei.l111l11111Il.l111l1111llIl.l1111l111111Il());
            l111l11111lil.l111l11111lIl(Integer.valueOf(com.ishumei.l111l11111Il.l111l1111llIl.l111l11111I1l()));
            l111l11111lil.l111l1111lI1l(com.ishumei.l111l11111Il.l111l1111llIl.l111l11111lIl());
            l111l11111lil.l111l1111llIl(Integer.valueOf(com.ishumei.l111l11111Il.l11l1111I11l.l111l11111I1l()));
            l111l11111lil.l111l111lIlll(com.ishumei.l111l11111Il.l111l11111lIl.l111l11111lIl());
            l111l11111lil.l11l111I111l(com.ishumei.l111l11111Il.l111l11111lIl.l111l11111I1l());
            l111l11111lil.l111l11111lIl(Long.valueOf(com.ishumei.l111l11111Il.l11l1111I11l.l111l11111lIl()));
            l111l11111lil.l111l11111lIl(com.ishumei.l111l11111Il.l111l11111lIl.l1111l111111Il.C0265l1111l111111Il.l1111l111111Il(!setL11l1111Ill.contains("sn")));
            if (!setL11l1111Ill.contains(l11l1111Ill)) {
                l111l11111lil.l111l11111I1l(com.ishumei.l111l11111Il.l11l1111lIIl.l1111l111111Il());
            }
            l111l11111lil.l111l111I1l(com.ishumei.l111l11111Il.l111l1111lI1l.l1111l111111Il("", ""));
            if (l111l11111lIl2 != null) {
                l111l11111lil.l11l111Il(l111l11111lIl2.l11l1111I1ll());
            }
            Object objL111l11111Il = com.ishumei.l111l11111Il.l111l11111lIl.l111l11111Il();
            if (objL111l11111Il != null) {
                l111l11111lil.l111l111Il1l(com.ishumei.l111l11111Il.l111l11111lIl.l1111l111111Il(objL111l11111Il));
                l111l11111lil.l111l1111lI1l(Integer.valueOf(objL111l11111Il.hashCode()));
            }
            l111l11111lil.l11l1111lIIl(com.ishumei.l111l11111Il.l111l11111lIl.l111l1111l1Il());
            com.ishumei.l111l11111Il.l11l1111I1ll.l1111l111111Il(l111l11111lil);
            Context context = l111l1111llIl.l1111l111111Il.l111l11111Il;
            if (context != null) {
                l111l11111lil.l11IIIlIll(context.getFilesDir().toString());
            }
            l111l11111lil.l111l11111I1l(com.ishumei.l111l11111Il.l1111l111111Il.l111l1111l1Il());
            long jL111l11111Il = com.ishumei.l111l1111llIl.l111l11111lIl.l1111l111111Il().l111l11111Il();
            if (jL111l11111Il != -1) {
                l111l11111lil.l111l11111Il(Long.valueOf(jL111l11111Il));
            }
            l111l11111lil.l111l11111Il(com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il.l1111l111111Il().l111l11111lIl());
            l111l11111lil.l111l11111Il(com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111I1l());
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                l111l11111lil.l111l1111l1Il(Long.valueOf(statFs.getAvailableBytes()));
                l111l11111lil.l111l1111llIl(Long.valueOf(statFs.getFreeBytes()));
                l111l11111lil.l111l1111lI1l(Long.valueOf(statFs.getTotalBytes()));
            } catch (Exception unused) {
            }
            l111l11111lil.l111l1111l1Il(com.ishumei.l111l11111Il.l1111l111111Il.l111l1111llIl.l111l11111lIl());
            Context context2 = l111l1111llIl.l1111l111111Il.l111l11111Il;
            if (context2 == null) {
                i2 = 0;
            } else {
                if (Settings.Secure.getInt(context2.getContentResolver(), "mock_location", 0) != 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
            l111l11111lil.l111l1111lIl(Integer.valueOf(i2));
            l111l11111lil.l111l11111I1l(Integer.valueOf(com.ishumei.l111l11111Il.l11l1111I11l.l111l1111l1Il()));
            l111l11111lil.l11l1111lIIl(Integer.valueOf(Debug.isDebuggerConnected() ? 1 : 0));
            l111l11111lil.l11l1111I11l(Integer.valueOf(com.ishumei.l111l11111Il.l111l11111lIl.l111l1111llIl()));
            l111l11111lil.l11l11l111Il(com.ishumei.l111l11111Il.l111l1111lIl.l111l1111llIl());
            l111l11111lil.l111l1111llIl(com.ishumei.l111l11111Il.l1111l111111Il.l111l11111Il());
            l111l11111lil.l111l11111lIl(com.ishumei.l111l11111Il.l1111l111111Il.l111l11111I1l());
            l111l11111lil.l11l1111I1l(com.ishumei.l111l11111Il.l1111l111111Il.l111l1111llIl());
            l111l11111lil.l1111l111111Il(com.ishumei.l111l11111Il.l1111l111111Il.l11l1111lIIl());
            l111l11111lil.l111l11111lIl(com.ishumei.l111l11111Il.l1111l111111Il.l11l1111I11l());
            l111l11111lil.l111l11111I1l(com.ishumei.l111l11111Il.l1111l111111Il.l11l1111I1l());
            l111l11111lil.l11l11l11I1l(new com.ishumei.l111l11111Il.l1111l111111Il.l111l1111llIl(l111l1111llIl.l1111l111111Il.l111l11111Il).l1111l111111Il());
            l111l11111lil.l111l1111lI1l(com.ishumei.l111l11111Il.l1111l111111Il.l11l1111Il());
            l111l11111lil.l11l11l1lI1l(smOption.l11l111l11Il());
            if (com.ishumei.l111l11111Il.l1111l111111Il.l11l1111Il1l() == 1) {
                l111l11111lil.l1111l111111Il(1);
            }
            if (l111l11111lIl2 != null && l111l11111lIl2.l111l1111lIl()) {
                l111l11111lil.l111l1111lIl(com.ishumei.l111l11111Il.l1111l111111Il.l1111l111111Il());
                JSONObject jSONObjectL1111l111111Il = com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(l111l11111lil);
                Context context3 = l111l1111llIl.l1111l111111Il.l111l11111Il;
                String string = jSONObjectL1111l111111Il.toString();
                if (l111l11111lIl2 != null) {
                    strL11l1111Il = l111l11111lIl2.l11l1111Il();
                }
                strV1 = SMSDK.v1(context3, string, strL11l1111Il, smOption.l111l1111llIl(), smOption.l11l1111I1ll(), smOption.l11l11IlIIll());
                this.l111l11IlIlIl = com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl(strV1.getBytes());
                if (!TextUtils.isEmpty(strV1)) {
                }
                throw new Exception("error ret: " + strV1);
            }
            try {
                JSONObject jSONObjectL1111l111111Il2 = com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(l111l11111lil);
                Context context4 = l111l1111llIl.l1111l111111Il.l111l11111Il;
                String string2 = jSONObjectL1111l111111Il2.toString();
                if (l111l11111lIl2 != null && l111l11111lIl2.l11l1111I11l()) {
                    strL11l1111Il = l111l11111lIl2.l11l1111Il();
                }
                strV1 = SMSDK.v1(context4, string2, strL11l1111Il, smOption.l111l1111llIl(), smOption.l11l1111I1ll(), smOption.l11l11IlIIll());
                this.l111l11IlIlIl = com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl(strV1.getBytes());
                if (!TextUtils.isEmpty(strV1) || !strV1.startsWith("{")) {
                    throw new Exception("error ret: " + strV1);
                }
            } catch (Throwable th) {
                return com.ishumei.l111l11111lIl.l111l11111I1l.l1111l111111Il().l1111l111111Il(th);
            }
        } catch (Throwable th2) {
            l111l11111lil.l11l11l11lIl(Log.getStackTraceString(th2));
        }
        throw th;
        return strV1;
    }
}
