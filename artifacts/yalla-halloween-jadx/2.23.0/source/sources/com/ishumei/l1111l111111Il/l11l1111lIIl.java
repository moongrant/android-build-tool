package com.ishumei.l1111l111111Il;

import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.ishumei.dfp.SMSDK;
import com.ishumei.smantifraud.SmAntiFraud;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class l11l1111lIIl {
    Runnable l1111l111111Il;
    private int l111l11111I1l;
    private int l111l11111Il;
    private ArrayList<l11l1111I11l> l111l11111lIl;
    private com.ishumei.l111l11111lIl.l111l11111lIl l111l1111l1Il;
    private Runnable l111l1111lI1l;
    private boolean l111l1111llIl;

    public static class l1111l111111Il {
        private static final l11l1111lIIl l1111l111111Il = new l11l1111lIIl(0);

        private l1111l111111Il() {
        }
    }

    private l11l1111lIIl() {
        this.l111l11111lIl = new ArrayList<>();
        this.l111l11111I1l = 0;
        this.l111l11111Il = 0;
        this.l111l1111llIl = false;
        this.l111l1111lI1l = new Runnable() { // from class: com.ishumei.l1111l111111Il.l11l1111lIIl.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    l11l1111lIIl.l1111l111111Il(l11l1111lIIl.this);
                } catch (Exception unused) {
                }
            }
        };
        this.l1111l111111Il = new Runnable() { // from class: com.ishumei.l1111l111111Il.l11l1111lIIl.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    l11l1111lIIl.l1111l111111Il(l11l1111lIIl.this);
                } catch (Exception unused) {
                } finally {
                    com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111lIl().l1111l111111Il(this, 6, l11l1111lIIl.this.l111l1111l1Il.l111l11111I1l() * 1000, false);
                }
            }
        };
    }

    public static l11l1111lIIl l1111l111111Il() {
        return l1111l111111Il.l1111l111111Il;
    }

    public static /* synthetic */ int l111l1111l1Il(l11l1111lIIl l11l1111liil) {
        int i = l11l1111liil.l111l11111I1l;
        l11l1111liil.l111l11111I1l = i + 1;
        return i;
    }

    public /* synthetic */ l11l1111lIIl(byte b) {
        this();
    }

    private void l111l11111lIl() throws JSONException {
        if (this.l111l11111lIl.size() <= 0) {
            return;
        }
        this.l111l11111Il++;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("smid", SmAntiFraud.getDeviceId());
        jSONObject.put(RemoteConfigConstants$RequestFieldKey.APP_ID, SmAntiFraud.l1111l111111Il.l11l11IlIIll());
        jSONObject.put("appname", com.ishumei.l111l11111Il.l111l11111lIl.l111l11111I1l());
        jSONObject.put("sessionId", l111l1111llIl.l1111l111111Il.l111l1111l1Il);
        ArrayList<l11l1111I11l> arrayList = this.l111l11111lIl;
        this.l111l11111lIl = new ArrayList<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<l11l1111I11l> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(it.next()));
        }
        jSONObject.put("wevent", jSONArray);
        String strV3 = SMSDK.v3(l111l1111llIl.l1111l111111Il.l111l11111Il, jSONObject.toString(), SmAntiFraud.l1111l111111Il.l111l1111llIl(), SmAntiFraud.l1111l111111Il.l11l1111I1ll(), SmAntiFraud.l1111l111111Il.l11l11IlIIll());
        if (TextUtils.isEmpty(strV3)) {
            return;
        }
        new com.ishumei.l111l1111l1Il.l111l11111I1l().l1111l111111Il(com.ishumei.l111l1111l1Il.l1111l111111Il.l1111l111111Il(SmAntiFraud.l1111l111111Il.l11l1111Il1l(), SmAntiFraud.l1111l111111Il.l111l1111l1Il(), SmAntiFraud.l1111l111111Il.l111l11111Il())).l1111l111111Il(strV3.getBytes(), null, SmAntiFraud.l1111l111111Il.l11l1111Il1l());
    }

    public static /* synthetic */ void l1111l111111Il(l11l1111lIIl l11l1111liil) throws JSONException {
        if (l11l1111liil.l111l11111lIl.size() > 0) {
            l11l1111liil.l111l11111Il++;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("smid", SmAntiFraud.getDeviceId());
            jSONObject.put(RemoteConfigConstants$RequestFieldKey.APP_ID, SmAntiFraud.l1111l111111Il.l11l11IlIIll());
            jSONObject.put("appname", com.ishumei.l111l11111Il.l111l11111lIl.l111l11111I1l());
            jSONObject.put("sessionId", l111l1111llIl.l1111l111111Il.l111l1111l1Il);
            ArrayList<l11l1111I11l> arrayList = l11l1111liil.l111l11111lIl;
            l11l1111liil.l111l11111lIl = new ArrayList<>();
            JSONArray jSONArray = new JSONArray();
            Iterator<l11l1111I11l> it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put(com.ishumei.l111l1111llIl.l111l1111lIl.l1111l111111Il(it.next()));
            }
            jSONObject.put("wevent", jSONArray);
            String strV3 = SMSDK.v3(l111l1111llIl.l1111l111111Il.l111l11111Il, jSONObject.toString(), SmAntiFraud.l1111l111111Il.l111l1111llIl(), SmAntiFraud.l1111l111111Il.l11l1111I1ll(), SmAntiFraud.l1111l111111Il.l11l11IlIIll());
            if (TextUtils.isEmpty(strV3)) {
                return;
            }
            new com.ishumei.l111l1111l1Il.l111l11111I1l().l1111l111111Il(com.ishumei.l111l1111l1Il.l1111l111111Il.l1111l111111Il(SmAntiFraud.l1111l111111Il.l11l1111Il1l(), SmAntiFraud.l1111l111111Il.l111l1111l1Il(), SmAntiFraud.l1111l111111Il.l111l11111Il())).l1111l111111Il(strV3.getBytes(), null, SmAntiFraud.l1111l111111Il.l11l1111Il1l());
        }
    }

    public final void l1111l111111Il(final String str, final String str2, MotionEvent motionEvent) {
        final int action = motionEvent == null ? -1 : motionEvent.getAction();
        final float pressure = motionEvent == null ? -1.0f : motionEvent.getPressure();
        final float size = motionEvent == null ? -1.0f : motionEvent.getSize();
        final long downTime = motionEvent == null ? -1L : motionEvent.getDownTime();
        final long eventTime = motionEvent != null ? motionEvent.getEventTime() : -1L;
        final float xPrecision = motionEvent == null ? -1.0f : motionEvent.getXPrecision();
        final float yPrecision = motionEvent != null ? motionEvent.getYPrecision() : -1.0f;
        com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111lIl().l1111l111111Il(new Runnable() { // from class: com.ishumei.l1111l111111Il.l11l1111lIIl.3
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                if (l11l1111lIIl.this.l111l1111l1Il == null) {
                    l11l1111lIIl.this.l111l1111l1Il = com.ishumei.l111l11111lIl.l1111l111111Il.l1111l111111Il().l111l11111lIl();
                }
                if (!l11l1111lIIl.this.l111l1111llIl) {
                    com.ishumei.l111l11111I1l.l1111l111111Il l1111l111111ilL111l11111lIl = com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111lIl();
                    l11l1111lIIl l11l1111liil = l11l1111lIIl.this;
                    l1111l111111ilL111l11111lIl.l1111l111111Il(l11l1111liil.l1111l111111Il, 6, l11l1111liil.l111l1111l1Il.l111l11111I1l() * 1000, false);
                    l11l1111lIIl.l1111l111111Il(l11l1111lIIl.this, true);
                }
                if (l11l1111lIIl.this.l111l11111Il >= l11l1111lIIl.this.l111l1111l1Il.l111l11111lIl()) {
                    return;
                }
                int i = action;
                if (i == 0) {
                    str3 = "Down";
                } else if (i != 1) {
                    str3 = i != 2 ? "" : "Move";
                } else {
                    str3 = "Up";
                }
                l11l1111I11l l11l1111i11l = new l11l1111I11l();
                l11l1111i11l.l1111l111111Il(l11l1111lIIl.l111l1111l1Il(l11l1111lIIl.this));
                l11l1111i11l.l1111l111111Il(str);
                l11l1111i11l.l111l11111lIl(str3);
                l11l1111i11l.l111l11111I1l(str2);
                l11l1111i11l.l111l11111Il(pressure);
                l11l1111i11l.l111l11111I1l(size);
                l11l1111i11l.l111l11111I1l(System.currentTimeMillis());
                l11l1111i11l.l1111l111111Il(downTime);
                l11l1111i11l.l111l11111lIl(eventTime);
                l11l1111i11l.l1111l111111Il(xPrecision);
                l11l1111i11l.l111l11111lIl(yPrecision);
                l11l1111lIIl.this.l111l11111lIl.add(l11l1111i11l);
                if (l11l1111lIIl.this.l111l11111lIl.size() >= l11l1111lIIl.this.l111l1111l1Il.l1111l111111Il()) {
                    com.ishumei.l111l11111I1l.l1111l111111Il.l111l11111lIl().l1111l111111Il(l11l1111lIIl.this.l111l1111lI1l, 6);
                }
            }
        }, 6, 0L, false);
    }

    public static /* synthetic */ boolean l1111l111111Il(l11l1111lIIl l11l1111liil, boolean z) {
        l11l1111liil.l111l1111llIl = true;
        return true;
    }
}
