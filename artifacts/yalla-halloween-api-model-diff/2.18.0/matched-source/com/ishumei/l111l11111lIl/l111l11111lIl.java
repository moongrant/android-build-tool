package com.ishumei.l111l11111lIl;

import android.text.TextUtils;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.share.internal.ShareConstants;
import com.ishumei.l111l1111llIl.l111l1111lIl;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l111l11111lIl {
    private static final String l1111l111111Il = "sm";
    private Map<String, l111l11111I1l> l111l11111I1l;
    private Map<String, l111l11111Il> l111l11111Il;
    private Map<String, C0166l111l11111lIl> l111l11111lIl;
    private Set<String> l111l1111l1Il;
    private String l111l1111lI1l;
    private String l111l1111lIl;
    private List<l1111l111111Il> l111l1111llIl;
    private boolean l11l1111I1ll;
    private String l11l1111lIIl;
    private boolean l11l111l11Il;
    private boolean l11l111l1lll;
    private boolean l11l11IlIIll;
    private boolean l11l1111I11l = true;
    private boolean l11l1111I1l = true;
    private int l11l1111Il = 50;
    private int l11l1111Il1l = 10;
    private boolean l11l1111Ill = true;
    private int l111l11IlIlIl = 0;
    private int l11l111l1I1l = 2;
    private int l11l111l1Il = -1;
    private int l11l111ll11l = 100;
    private int l11l111ll1Il = 10;
    private int l11l111lll = 60;

    public static class l1111l111111Il {
        private static int l1111l111111Il = 1;
        private static int l111l11111I1l = 3;
        private static int l111l11111lIl = 2;
        private String l111l11111Il;
        private String l111l1111l1Il;
        private List<String> l111l1111lI1l;
        private int l111l1111lIl;
        private String l111l1111llIl;

        private String l111l1111l1Il() {
            return this.l111l11111Il;
        }

        public final String l1111l111111Il() {
            return this.l111l1111l1Il;
        }

        public final void l1111l111111Il(int i) {
            this.l111l1111lIl = i;
        }

        public final void l1111l111111Il(String str) {
            this.l111l11111Il = str;
        }

        public final void l1111l111111Il(List<String> list) {
            this.l111l1111lI1l = list;
        }

        public final List<String> l111l11111I1l() {
            return this.l111l1111lI1l;
        }

        public final void l111l11111I1l(String str) {
            this.l111l1111llIl = str;
        }

        public final int l111l11111Il() {
            return this.l111l1111lIl;
        }

        public final String l111l11111lIl() {
            return this.l111l1111llIl;
        }

        public final void l111l11111lIl(String str) {
            this.l111l1111l1Il = str;
        }
    }

    public static class l111l11111I1l {
        private static int l1111l111111Il = 0;
        private static int l111l11111lIl = 1;
        private String l111l11111I1l;
        private int l111l11111Il;
        private String l111l1111l1Il;

        private int l111l11111I1l() {
            return this.l111l11111Il;
        }

        private String l111l11111lIl() {
            return this.l111l1111l1Il;
        }

        public final String l1111l111111Il() {
            return this.l111l11111I1l;
        }

        public final void l1111l111111Il(int i) {
            this.l111l11111Il = i;
        }

        public final void l1111l111111Il(String str) {
            this.l111l11111I1l = str;
        }

        public final void l111l11111lIl(String str) {
            this.l111l1111l1Il = str;
        }
    }

    public static class l111l11111Il {
        private String l1111l111111Il;
        private String l111l11111lIl;

        private String l111l11111lIl() {
            return this.l111l11111lIl;
        }

        public final String l1111l111111Il() {
            return this.l1111l111111Il;
        }

        public final void l1111l111111Il(String str) {
            this.l1111l111111Il = str;
        }

        public final void l111l11111lIl(String str) {
            this.l111l11111lIl = str;
        }
    }

    /* JADX INFO: renamed from: com.ishumei.l111l11111lIl.l111l11111lIl$l111l11111lIl, reason: collision with other inner class name */
    public static class C0166l111l11111lIl {
        private String l1111l111111Il;
        private String l111l11111I1l;
        private String l111l11111lIl;

        private String l111l11111I1l() {
            return this.l111l11111I1l;
        }

        private String l111l11111lIl() {
            return this.l111l11111lIl;
        }

        public final String l1111l111111Il() {
            return this.l1111l111111Il;
        }

        public final void l1111l111111Il(String str) {
            this.l1111l111111Il = str;
        }

        public final void l111l11111I1l(String str) {
            this.l111l11111I1l = str;
        }

        public final void l111l11111lIl(String str) {
            this.l111l11111lIl = str;
        }
    }

    private static Map<String, C0166l111l11111lIl> l1111l111111Il(JSONArray jSONArray) {
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C0166l111l11111lIl c0166l111l11111lIl = new C0166l111l11111lIl();
                String next = jSONObject.keys().next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                c0166l111l11111lIl.l1111l111111Il(next);
                c0166l111l11111lIl.l111l11111lIl(jSONObject2.getString("pn"));
                c0166l111l11111lIl.l111l11111I1l(jSONObject2.getString(ShareConstants.MEDIA_URI));
                map.put(c0166l111l11111lIl.l1111l111111Il(), c0166l111l11111lIl);
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    private static Set<String> l1111l111111Il(JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (next.startsWith("sensitive.") && jSONObject.getBoolean(next)) {
                    hashSet.add(next.split("\\.")[1]);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private void l1111l111111Il(int i) {
        this.l11l111ll11l = i;
    }

    private void l1111l111111Il(List<l1111l111111Il> list) {
        this.l111l1111llIl = list;
    }

    private void l1111l111111Il(Map<String, C0166l111l11111lIl> map) {
        this.l111l11111lIl = map;
    }

    private void l1111l111111Il(Set<String> set) {
        this.l111l1111l1Il = set;
    }

    private void l1111l111111Il(boolean z) {
        this.l11l111l1lll = z;
    }

    public static l111l11111lIl l111l11111I1l(String str) throws IOException {
        l111l11111lIl l111l11111lil = new l111l11111lIl();
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                l111l11111lil.l111l11111lIl = l111l11111I1l(jSONObject.getJSONObject("risk_apps"));
            } catch (Exception unused) {
            }
            try {
                l111l11111lil.l111l11111I1l = l111l11111Il(jSONObject.getJSONObject("risk_dirs"));
            } catch (Exception unused2) {
            }
            try {
                l111l11111lil.l111l11111Il = l111l1111l1Il(jSONObject.getJSONObject("white_apps"));
            } catch (Exception unused3) {
            }
            try {
                l111l11111lil.l111l1111l1Il = l111l1111llIl(jSONObject.getJSONObject("sensitive"));
            } catch (Exception unused4) {
            }
            try {
                l111l11111lil.l11l1111I11l = jSONObject.getBoolean("core_atamper");
            } catch (Exception unused5) {
            }
            try {
                l111l11111lil.l11l1111I1l = jSONObject.getBoolean("all_atamper");
            } catch (Exception unused6) {
            }
            try {
                l111l11111lil.l11l1111I1ll = jSONObject.getBoolean("risk_file_switch");
            } catch (Exception unused7) {
            }
            try {
                l111l11111lil.l11l1111Ill = jSONObject.getBoolean("upload_checker_switch");
            } catch (Exception unused8) {
            }
            l111l11111lil.l111l1111lI1l = str;
            l111l11111lil.l111l1111lIl = l111l1111lIl.l111l11111I1l(str);
            return l111l11111lil;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static Map<String, l111l11111Il> l111l11111I1l(JSONArray jSONArray) {
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                l111l11111Il l111l11111il = new l111l11111Il();
                String next = jSONObject.keys().next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                l111l11111il.l1111l111111Il(next);
                l111l11111il.l111l11111lIl(jSONObject2.getString("pn"));
                map.put(l111l11111il.l1111l111111Il(), l111l11111il);
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    private static Map<String, C0166l111l11111lIl> l111l11111I1l(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                C0166l111l11111lIl c0166l111l11111lIl = new C0166l111l11111lIl();
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                c0166l111l11111lIl.l1111l111111Il(next);
                c0166l111l11111lIl.l111l11111lIl(jSONObject2.getString("pn"));
                c0166l111l11111lIl.l111l11111I1l(jSONObject2.getString(ShareConstants.MEDIA_URI));
                map.put(c0166l111l11111lIl.l1111l111111Il(), c0166l111l11111lIl);
            } catch (Exception unused) {
            }
        }
        return map;
    }

    private void l111l11111I1l(int i) {
        this.l11l111lll = i;
    }

    private void l111l11111I1l(Map<String, l111l11111Il> map) {
        this.l111l11111Il = map;
    }

    private void l111l11111I1l(boolean z) {
        this.l11l111l11Il = z;
    }

    private static Map<String, l111l11111I1l> l111l11111Il(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                l111l11111I1l l111l11111i1l = new l111l11111I1l();
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                l111l11111i1l.l1111l111111Il(next);
                if (TextUtils.equals("sdcard", jSONObject2.getString("type"))) {
                    l111l11111i1l.l1111l111111Il(0);
                } else if (TextUtils.equals(Constants.PATH_TYPE_ABSOLUTE, jSONObject2.getString("type"))) {
                    l111l11111i1l.l1111l111111Il(1);
                }
                l111l11111i1l.l111l11111lIl(jSONObject2.getString("dir"));
                map.put(l111l11111i1l.l1111l111111Il(), l111l11111i1l);
            } catch (Exception unused) {
            }
        }
        return map;
    }

    private void l111l11111Il(int i) {
        this.l111l11IlIlIl = i;
    }

    private void l111l11111Il(String str) {
        this.l111l1111lIl = str;
    }

    private void l111l11111Il(boolean z) {
        this.l11l1111Ill = z;
    }

    public static l111l11111lIl l111l11111lIl(String str) throws IOException {
        l111l11111lIl l111l11111lil = new l111l11111lIl();
        try {
            JSONObject jSONObject = new JSONObject(str);
            try {
                if (jSONObject.has("usrappcnt")) {
                    l111l11111lil.l11l1111Il = jSONObject.getInt("usrappcnt");
                }
                if (jSONObject.has("sysappcnt")) {
                    l111l11111lil.l11l1111Il1l = jSONObject.getInt("sysappcnt");
                }
            } catch (Exception unused) {
            }
            try {
                l111l11111lil.l111l11111lIl = l1111l111111Il(jSONObject.getJSONArray("risk_apps"));
            } catch (Exception unused2) {
            }
            try {
                l111l11111lil.l111l11111I1l = l111l11111lIl(jSONObject.getJSONArray("risk_dirs"));
            } catch (Exception unused3) {
            }
            try {
                l111l11111lil.l111l11111Il = l111l11111I1l(jSONObject.getJSONArray("white_apps"));
            } catch (Exception unused4) {
            }
            try {
                l111l11111lil.l111l1111l1Il = l1111l111111Il(jSONObject);
            } catch (Exception unused5) {
            }
            try {
                l111l11111lil.l11l1111I11l = jSONObject.getBoolean("core_atamper");
            } catch (Exception unused6) {
            }
            try {
                l111l11111lil.l11l1111I1l = jSONObject.getBoolean("all_atamper");
            } catch (Exception unused7) {
            }
            try {
                l111l11111lil.l11l1111I1ll = jSONObject.getBoolean("risk_file_switch");
            } catch (Exception unused8) {
            }
            try {
                l111l11111lil.l11l1111Ill = jSONObject.getBoolean("upload_checker_switch");
            } catch (Exception unused9) {
            }
            try {
                l111l11111lil.l11l11IlIIll = jSONObject.getBoolean("hook_switch");
            } catch (Exception unused10) {
            }
            try {
                l111l11111lil.l11l111l11Il = jSONObject.getBoolean("hook_java_switch");
            } catch (Exception unused11) {
            }
            try {
                l111l11111lil.l11l111l1lll = jSONObject.optBoolean("ip_cache_switch");
            } catch (Exception unused12) {
            }
            try {
                l111l11111lil.l111l11IlIlIl = jSONObject.getInt("net_max");
            } catch (Exception unused13) {
            }
            try {
                l111l11111lil.l11l111l1I1l = jSONObject.getInt("re_max");
            } catch (Exception unused14) {
            }
            try {
                l111l11111lil.l11l111l1Il = jSONObject.getInt("up_max");
            } catch (Exception unused15) {
            }
            try {
                l111l11111lil.l11l111lll = jSONObject.optInt("weventt", 60);
                l111l11111lil.l11l111ll11l = jSONObject.optInt("weventc", 100);
                l111l11111lil.l11l111ll1Il = jSONObject.optInt("weventmax", 10);
            } catch (Exception unused16) {
            }
            l111l11111lil.l111l1111lI1l = str;
            l111l11111lil.l111l1111lIl = l111l1111lIl.l111l11111I1l(str);
            return l111l11111lil;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static Map<String, l111l11111I1l> l111l11111lIl(JSONArray jSONArray) {
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                l111l11111I1l l111l11111i1l = new l111l11111I1l();
                String next = jSONObject.keys().next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                l111l11111i1l.l1111l111111Il(next);
                if (TextUtils.equals("sdcard", jSONObject2.getString("type"))) {
                    l111l11111i1l.l1111l111111Il(0);
                } else {
                    if (TextUtils.equals(Constants.PATH_TYPE_ABSOLUTE, jSONObject2.getString("type"))) {
                        l111l11111i1l.l1111l111111Il(1);
                    }
                }
                l111l11111i1l.l111l11111lIl(jSONObject2.getString("dir"));
                map.put(l111l11111i1l.l1111l111111Il(), l111l11111i1l);
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    private void l111l11111lIl(int i) {
        this.l11l111ll1Il = i;
    }

    private void l111l11111lIl(Map<String, l111l11111I1l> map) {
        this.l111l11111I1l = map;
    }

    private void l111l11111lIl(JSONObject jSONObject) {
        if (jSONObject.has("usrappcnt")) {
            this.l11l1111Il = jSONObject.getInt("usrappcnt");
        }
        if (jSONObject.has("sysappcnt")) {
            this.l11l1111Il1l = jSONObject.getInt("sysappcnt");
        }
    }

    private void l111l11111lIl(boolean z) {
        this.l11l11IlIIll = z;
    }

    private static Map<String, l111l11111Il> l111l1111l1Il(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                l111l11111Il l111l11111il = new l111l11111Il();
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                l111l11111il.l1111l111111Il(next);
                l111l11111il.l111l11111lIl(jSONObject2.getString("pn"));
                map.put(l111l11111il.l1111l111111Il(), l111l11111il);
            } catch (Exception unused) {
            }
        }
        return map;
    }

    private void l111l1111l1Il(int i) {
        this.l11l111l1I1l = i;
    }

    private void l111l1111l1Il(String str) {
        this.l111l1111lI1l = str;
    }

    private void l111l1111l1Il(boolean z) {
        this.l11l1111I1ll = z;
    }

    private void l111l1111lI1l(int i) {
        this.l11l1111Il = i;
    }

    private void l111l1111lI1l(boolean z) {
        this.l11l1111I1l = z;
    }

    private void l111l1111lIl(int i) {
        this.l11l1111Il1l = i;
    }

    private static Set<String> l111l1111llIl(JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (jSONObject.getBoolean(next)) {
                    hashSet.add(next);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    private void l111l1111llIl(int i) {
        this.l11l111l1Il = i;
    }

    private void l111l1111llIl(boolean z) {
        this.l11l1111I11l = z;
    }

    private boolean l111l11IlIlIl() {
        return this.l11l1111I1l;
    }

    private boolean l11l1111Ill() {
        return this.l11l11IlIIll;
    }

    private int l11l111l11Il() {
        return this.l11l1111Il;
    }

    private String l11l111l1I1l() {
        return this.l11l1111lIIl;
    }

    private Map<String, C0166l111l11111lIl> l11l111l1Il() {
        return this.l111l11111lIl;
    }

    private int l11l111l1lll() {
        return this.l11l1111Il1l;
    }

    private Map<String, l111l11111I1l> l11l111ll11l() {
        return this.l111l11111I1l;
    }

    private Map<String, l111l11111Il> l11l111ll1Il() {
        return this.l111l11111Il;
    }

    private List<l1111l111111Il> l11l11IlIIll() {
        return this.l111l1111llIl;
    }

    public final int l1111l111111Il() {
        return this.l11l111ll11l;
    }

    public final void l1111l111111Il(String str) {
        this.l11l1111lIIl = str;
    }

    public final int l111l11111I1l() {
        return this.l11l111lll;
    }

    public final int l111l11111Il() {
        return this.l111l11IlIlIl;
    }

    public final int l111l11111lIl() {
        return this.l11l111ll1Il;
    }

    public final int l111l1111l1Il() {
        return this.l11l111l1I1l;
    }

    public final boolean l111l1111lI1l() {
        return this.l11l111l1lll;
    }

    public final boolean l111l1111lIl() {
        return this.l11l111l11Il;
    }

    public final int l111l1111llIl() {
        return this.l11l111l1Il;
    }

    public final boolean l11l1111I11l() {
        return this.l11l1111I1ll;
    }

    public final boolean l11l1111I1l() {
        return this.l11l1111I11l;
    }

    public final String l11l1111I1ll() {
        return this.l111l1111lIl;
    }

    public final String l11l1111Il() {
        return this.l111l1111lI1l;
    }

    public final Set<String> l11l1111Il1l() {
        return this.l111l1111l1Il;
    }

    public final boolean l11l1111lIIl() {
        return this.l11l1111Ill;
    }
}
