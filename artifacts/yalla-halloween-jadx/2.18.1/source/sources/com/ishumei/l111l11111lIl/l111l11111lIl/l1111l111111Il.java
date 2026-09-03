package com.ishumei.l111l11111lIl.l111l11111lIl;

import android.content.Context;
import android.content.SharedPreferences;
import com.ishumei.l1111l111111Il.l111l1111llIl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class l1111l111111Il {
    private static final String l1111l111111Il = "fc_times";
    private static final String l111l11111I1l = "n";
    private static final String l111l11111Il = "t";
    private static final String l111l11111lIl = "l";
    private static final int l111l1111l1Il = 20;
    private static final int l111l1111llIl = -1048576;
    private SharedPreferences l111l1111lI1l;
    private List<String> l111l1111lIl;

    /* JADX INFO: renamed from: com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
    public static class C0167l1111l111111Il {
        private static final l1111l111111Il l1111l111111Il = new l1111l111111Il(0);

        private C0167l1111l111111Il() {
        }
    }

    private l1111l111111Il() {
        this.l111l1111lIl = null;
        try {
            Context context = l111l1111llIl.l1111l111111Il.l111l11111Il;
            if (context != null) {
                this.l111l1111lI1l = context.getSharedPreferences(l1111l111111Il, 0);
            }
        } catch (Throwable unused) {
        }
    }

    public /* synthetic */ l1111l111111Il(byte b) {
        this();
    }

    private static int l1111l111111Il(int i) {
        int iAbs = Math.abs(i & 1048575);
        if (iAbs > 2880) {
            return 2880;
        }
        return iAbs;
    }

    public static l1111l111111Il l1111l111111Il() {
        return C0167l1111l111111Il.l1111l111111Il;
    }

    private void l111l11111Il() {
        HashSet hashSet = new HashSet(this.l111l1111lI1l.getStringSet("t", new HashSet()));
        hashSet.add(String.valueOf(System.currentTimeMillis()));
        com.ishumei.l111l1111llIl.l111l1111llIl.l1111l111111Il(this.l111l1111lI1l, "t", hashSet);
    }

    private static int l111l11111lIl(int i) {
        int i2 = i >> 20;
        if (i2 > 100) {
            return 100;
        }
        return i2;
    }

    private static int l111l11111lIl(int i, int i2) {
        return (i2 << 20) + i;
    }

    private void l111l1111l1Il() {
        try {
            this.l111l1111lIl = new ArrayList(this.l111l1111lI1l.getStringSet("t", new HashSet()));
            com.ishumei.l111l1111llIl.l111l1111llIl.l1111l111111Il(this.l111l1111lI1l, l111l11111lIl, System.currentTimeMillis());
            com.ishumei.l111l1111llIl.l111l1111llIl.l1111l111111Il(this.l111l1111lI1l, "t", new HashSet());
        } catch (Exception unused) {
        }
    }

    public final synchronized void l1111l111111Il(int i, int i2) {
        try {
            SharedPreferences sharedPreferences = this.l111l1111lI1l;
            if (sharedPreferences == null) {
                return;
            }
            if (i <= 0 || i2 <= 0) {
                com.ishumei.l111l1111llIl.l111l1111llIl.l1111l111111Il(sharedPreferences, l111l11111I1l, 0);
            } else {
                com.ishumei.l111l1111llIl.l111l1111llIl.l1111l111111Il(sharedPreferences, l111l11111I1l, (i2 << 20) + i);
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized List<String> l111l11111I1l() {
        ArrayList arrayList = new ArrayList();
        List<String> list = this.l111l1111lIl;
        if (list == null) {
            return arrayList;
        }
        arrayList.addAll(list);
        this.l111l1111lIl = null;
        return arrayList;
    }

    public final synchronized boolean l111l11111lIl() {
        try {
            SharedPreferences sharedPreferences = this.l111l1111lI1l;
            if (sharedPreferences == null) {
                return true;
            }
            int i = sharedPreferences.getInt(l111l11111I1l, 0);
            if (i == 0) {
                l111l1111l1Il();
                return true;
            }
            long j = this.l111l1111lI1l.getLong(l111l11111lIl, 0L);
            int iAbs = Math.abs(1048575 & i);
            if (iAbs > 2880) {
                iAbs = 2880;
            }
            if (((long) iAbs) * 60000 < Math.abs(System.currentTimeMillis() - j)) {
                l111l1111l1Il();
                return true;
            }
            int size = this.l111l1111lI1l.getStringSet("t", new HashSet()).size();
            int i2 = i >> 20;
            if (i2 > 100) {
                i2 = 100;
            }
            if (size >= i2) {
                l111l1111l1Il();
                return true;
            }
            HashSet hashSet = new HashSet(this.l111l1111lI1l.getStringSet("t", new HashSet()));
            hashSet.add(String.valueOf(System.currentTimeMillis()));
            com.ishumei.l111l1111llIl.l111l1111llIl.l1111l111111Il(this.l111l1111lI1l, "t", hashSet);
            return false;
        } catch (Throwable unused) {
            l111l1111l1Il();
            return true;
        }
    }
}
