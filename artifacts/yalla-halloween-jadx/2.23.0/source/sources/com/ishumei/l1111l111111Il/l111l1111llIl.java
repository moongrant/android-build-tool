package com.ishumei.l1111l111111Il;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.ishumei.smantifraud.SmAntiFraud;
import com.qiniu.android.common.Constants;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes3.dex */
public class l111l1111llIl implements l1111l111111Il.InterfaceC0263l1111l111111Il, l1111l111111Il.l111l11111lIl {
    private static final int l1111l111111Il = -1;
    private static final int l111l11111I1l = -3;
    private static int l111l11111Il = -4;
    private static final int l111l11111lIl = -2;
    private static final String l111l1111l1Il = "sm";
    private com.ishumei.l111l11111I1l.l111l11111lIl l111l1111lI1l;
    private com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il l111l1111lIl;
    private AtomicInteger l111l1111llIl;
    private l1111l111111Il l11l1111lIIl;

    public static class l1111l111111Il {
        public static Context l111l11111Il;
        public static String l111l1111l1Il;
        public static String l111l1111llIl;
        boolean l1111l111111Il;
        com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il<?> l111l11111I1l;
        int l111l11111lIl;
        private String l111l1111lI1l;
        private String l111l1111lIl;
        private l111l11111lIl l11l1111I11l;
        private String l11l1111I1l;
        private InterfaceC0263l1111l111111Il l11l1111lIIl;

        /* JADX INFO: renamed from: com.ishumei.l1111l111111Il.l111l1111llIl$l1111l111111Il$1, reason: invalid class name */
        public class AnonymousClass1 extends com.ishumei.l111l11111I1l.l111l11111lIl {
            public AnonymousClass1(boolean z, int i, boolean z2, long j, boolean z3) {
                super(z, i, false, 0L, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (l1111l111111Il.this.l11l1111lIIl != null) {
                        l1111l111111Il l1111l111111il = l1111l111111Il.this;
                        l1111l111111il.l111l1111lI1l = l1111l111111il.l11l1111lIIl.l111l11111Il();
                    }
                    if (l1111l111111Il.this.l11l1111I11l != null) {
                        l1111l111111Il l1111l111111il2 = l1111l111111Il.this;
                        l1111l111111il2.l111l1111lIl = l1111l111111il2.l11l1111I11l.l111l1111l1Il();
                    }
                    com.ishumei.l111l1111l1Il.l1111l111111Il l1111l111111Il = com.ishumei.l111l1111l1Il.l1111l111111Il.l1111l111111Il(l1111l111111Il.this.l111l1111lIl, SmAntiFraud.l1111l111111Il.l111l1111l1Il(), SmAntiFraud.l1111l111111Il.l111l11111Il());
                    new com.ishumei.l111l1111l1Il.l111l11111I1l().l1111l111111Il(l1111l111111Il).l1111l111111Il(l1111l111111Il.this.l111l1111lI1l.getBytes(Constants.UTF_8), l1111l111111Il.this.l111l1111lI1l.contains("\"encode\":1"), (Map<String, String>) null, l1111l111111Il.this.l111l11111I1l);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: com.ishumei.l1111l111111Il.l111l1111llIl$l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
        public interface InterfaceC0263l1111l111111Il {
            String l111l11111Il();
        }

        public interface l111l11111lIl {
            String l111l1111l1Il();
        }

        public l1111l111111Il() {
        }

        public l1111l111111Il(InterfaceC0263l1111l111111Il interfaceC0263l1111l111111Il, l111l11111lIl l111l11111lil, boolean z, int i, com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il<?> l1111l111111il, String str) {
            this.l111l1111lI1l = null;
            this.l111l1111lIl = null;
            this.l11l1111lIIl = interfaceC0263l1111l111111Il;
            this.l11l1111I11l = l111l11111lil;
            this.l1111l111111Il = true;
            this.l111l11111lIl = 1;
            this.l111l11111I1l = l1111l111111il;
            this.l11l1111I1l = str;
        }

        public final void l1111l111111Il() {
            l1111l111111Il(this.l1111l111111Il);
        }

        private void l1111l111111Il(boolean z) {
            if (SmAntiFraud.l1111l111111Il.l11l1111I1l()) {
                new AnonymousClass1(z, this.l111l11111lIl, false, 0L, false).l1111l111111Il();
            }
        }
    }

    public static class l111l11111lIl {
        private static final l111l1111llIl l1111l111111Il = new l111l1111llIl(0);

        private l111l11111lIl() {
        }
    }

    private l111l1111llIl() {
        this.l111l1111llIl = new AtomicInteger(0);
        this.l111l1111lI1l = new com.ishumei.l111l11111I1l.l111l11111lIl(true, 1 == true ? 1 : 0) { // from class: com.ishumei.l1111l111111Il.l111l1111llIl.1
            {
                super(true, 1);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.ishumei.l111l11111lIl.l111l11111lIl l111l11111lIl2 = com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111lIl();
                    if (l111l11111lIl2 != null && l111l11111lIl2.l111l11111Il() > 0 && !com.ishumei.l111l11111Il.l111l1111lIl.l111l1111lI1l() && l111l1111llIl.this.l111l1111llIl.incrementAndGet() <= l111l11111lIl2.l111l11111Il()) {
                        com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111lIl().l1111l111111Il(this, 1, 1000L, false);
                        return;
                    }
                    l111l1111llIl.this.l111l1111llIl.set(0);
                    if (SmAntiFraud.l1111l111111Il.l11l1111I11l()) {
                        com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111I1l();
                    }
                    l1111l111111Il l1111l111111il = l111l1111llIl.this.l11l1111lIIl;
                    boolean z = l1111l111111il.l1111l111111Il;
                    if (SmAntiFraud.l1111l111111Il.l11l1111I1l()) {
                        l1111l111111il.new AnonymousClass1(z, l1111l111111il.l111l11111lIl, false, 0L, false).l1111l111111Il();
                    }
                } catch (Exception unused) {
                }
            }
        };
        com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il<Object> l1111l111111il = new com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il<Object>(1 == true ? 1 : 0, 2) { // from class: com.ishumei.l1111l111111Il.l111l1111llIl.3
            {
                super(true, 2);
            }

            @Override // com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il
            public final void l1111l111111Il(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i = jSONObject.getInt("code");
                    if (i != 1100) {
                        l1111l111111Il("", i);
                    } else if (((com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il) this).l111l11111lIl.l11l1111I1ll) {
                        SmAntiFraud.getServerIdCallback().onError(-3);
                    } else {
                        if (l111l1111llIl.this.l1111l111111Il(jSONObject)) {
                            return;
                        }
                        l1111l111111Il("", i);
                    }
                } catch (Exception unused) {
                }
            }

            @Override // com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il
            public final boolean l1111l111111Il(String str, int i) {
                int i2;
                if (i == 1902) {
                    com.ishumei.l111l1111l1Il.l111l11111I1l.l111l11111lIl l111l11111lil = ((com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il) this).l111l11111lIl;
                    if (l111l11111lil.l111l11111Il + 1 < l111l11111lil.l111l1111lIl) {
                        ((com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il) this).l111l11111lIl.l111l11111lIl = com.ishumei.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il(SmAntiFraud.l1111l111111Il.l11l1111lIIl() ? 1 : 0).getBytes();
                    }
                }
                boolean zL1111l111111Il = super.l1111l111111Il(str, i);
                if (zL1111l111111Il) {
                    com.ishumei.l111l11111lIl.l111l11111I1l.l1111l111111Il.l1111l111111Il().l1111l111111Il(new String(((com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il) this).l111l11111lIl.l111l11111lIl), ((com.ishumei.l111l1111l1Il.l111l11111I1l.l1111l111111Il) this).l111l11111lIl.l11l1111I11l);
                    if (i == 0 || i == 1) {
                        i2 = -1;
                    } else {
                        i2 = (i == 2 || i == 3) ? -2 : -3;
                    }
                    if (SmAntiFraud.getServerIdCallback() != null) {
                        SmAntiFraud.getServerIdCallback().onError(i2);
                    }
                }
                return zL1111l111111Il;
            }
        };
        this.l111l1111lIl = l1111l111111il;
        this.l11l1111lIIl = new l1111l111111Il(this, this, true, 1, l1111l111111il, "");
    }

    public static l111l1111llIl l1111l111111Il() {
        return l111l11111lIl.l1111l111111Il;
    }

    public final synchronized String l111l11111I1l() {
        if (!TextUtils.isEmpty(l1111l111111Il.l111l1111llIl)) {
            return "B" + l1111l111111Il.l111l1111llIl;
        }
        String strL111l11111lIl = l11l1111I1l.l1111l111111Il().l111l11111lIl();
        if (!TextUtils.isEmpty(strL111l11111lIl)) {
            l1111l111111Il.l111l1111llIl = strL111l11111lIl;
            return "B" + l1111l111111Il.l111l1111llIl;
        }
        String strL111l11111lIl2 = com.ishumei.l1111l111111Il.l1111l111111Il.l1111l111111Il().l111l11111lIl();
        if (!TextUtils.isEmpty(strL111l11111lIl2)) {
            return "D" + strL111l11111lIl2;
        }
        SmAntiFraud.SmOption smOption = SmAntiFraud.l1111l111111Il;
        if (smOption == null) {
            String strL111l11111Il = com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9c9e9393df989a8bbb9a89969c9ab69bdf9d8a8bdf91908bdf9c8d9a9e8b9a");
            try {
                return "D" + com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl(com.ishumei.l111l11111lIl.l111l11111I1l.l1111l111111Il().l1111l111111Il(new IllegalAccessException(strL111l11111Il)).getBytes());
            } catch (Exception e) {
                return "D" + Base64.encodeToString((strL111l11111Il + ";" + e).getBytes(), 0);
            }
        }
        String strL1111l111111Il = com.ishumei.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il(smOption.l11l1111lIIl() ? 1 : 0);
        if (TextUtils.isEmpty(strL1111l111111Il)) {
            try {
                return "D" + com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl(com.ishumei.l111l11111lIl.l111l11111I1l.l1111l111111Il().l1111l111111Il(new IllegalStateException()).getBytes());
            } catch (IOException e2) {
                return "D" + Base64.encodeToString(e2.toString().getBytes(), 0);
            }
        }
        try {
            return "D" + com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl(strL1111l111111Il.getBytes());
        } catch (Exception e3) {
            try {
                return "D" + com.ishumei.l111l1111llIl.l111l1111lIl.l111l11111lIl(com.ishumei.l111l11111lIl.l111l11111I1l.l1111l111111Il().l1111l111111Il(e3).getBytes());
            } catch (Exception e4) {
                return "D" + Base64.encodeToString(e4.toString().getBytes(), 0);
            }
        }
        throw th;
    }

    @Override // com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.InterfaceC0263l1111l111111Il
    public String l111l11111Il() {
        com.ishumei.l111l11111lIl.l111l11111lIl l111l11111lIl2 = com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111lIl();
        boolean z = l111l11111lIl2 == null || l111l11111lIl2.l11l1111I1l();
        return com.ishumei.l1111l111111Il.l1111l111111Il.l1111l111111Il().l1111l111111Il((SmAntiFraud.l1111l111111Il.l11l1111lIIl() ? 1 : 0) | (z ? 2 : 0));
    }

    @Override // com.ishumei.l1111l111111Il.l111l1111llIl.l1111l111111Il.l111l11111lIl
    public String l111l1111l1Il() {
        return SmAntiFraud.l1111l111111Il.l11l1111Il1l();
    }

    public /* synthetic */ l111l1111llIl(byte b) {
        this();
    }

    public static String l1111l111111Il(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "fp-it.fengkongcloud.com";
        }
        if (str2.startsWith("http")) {
            return str2;
        }
        if (str.startsWith("http")) {
            return str.concat(str2);
        }
        return o0O00o0.OooO0O0(new StringBuilder(z ? "https://" : "http://"), str.equals(str2) ? "fp-it.fengkongcloud.com" : str, str2);
    }

    public final void l111l11111lIl() {
        this.l111l1111lI1l.l1111l111111Il();
    }

    private static void l111l11111lIl(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("c", -1);
        int iOptInt2 = jSONObject.optInt("t", -1);
        if (iOptInt < 0 || iOptInt2 < 0) {
            return;
        }
        com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il.l1111l111111Il().l1111l111111Il(iOptInt2, iOptInt);
    }

    public final void l1111l111111Il(final SmAntiFraud.IDeviceIdCallback iDeviceIdCallback, final boolean z) {
        new Thread(new Runnable() { // from class: com.ishumei.l1111l111111Il.l111l1111llIl.2
            @Override // java.lang.Runnable
            public final void run() {
                final String strL111l11111I1l = l111l1111llIl.this.l111l11111I1l();
                if (z) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.ishumei.l1111l111111Il.l111l1111llIl.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            iDeviceIdCallback.onResult(strL111l11111I1l);
                        }
                    });
                } else {
                    iDeviceIdCallback.onResult(strL111l11111I1l);
                }
            }
        }).start();
    }

    public final boolean l1111l111111Il(JSONObject jSONObject) {
        boolean z = false;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9a8b9e9693"));
            String strOptString = jSONObject2.optString(com.ishumei.l111l1111llIl.l111l1111lI1l.l111l11111Il("9b9a89969c9ab69b"));
            int iOptInt = jSONObject2.optInt("c", -1);
            int iOptInt2 = jSONObject2.optInt("t", -1);
            if (iOptInt >= 0 && iOptInt2 >= 0) {
                com.ishumei.l111l11111lIl.l111l11111lIl.l1111l111111Il.l1111l111111Il().l1111l111111Il(iOptInt2, iOptInt);
            }
            if (!TextUtils.isEmpty(strOptString)) {
                z = true;
                l11l1111I1l.l1111l111111Il().l1111l111111Il(strOptString);
                if (SmAntiFraud.getServerIdCallback() != null) {
                    l1111l111111Il.l111l1111llIl = strOptString;
                    SmAntiFraud.getServerIdCallback().onSuccess("B" + strOptString);
                }
                com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111I1l();
            }
        } catch (Exception unused) {
        }
        return z;
    }
}
