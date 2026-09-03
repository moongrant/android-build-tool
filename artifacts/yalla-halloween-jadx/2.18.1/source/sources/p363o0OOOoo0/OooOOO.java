package p363o0OOOoo0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, String> f38544OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f38545OooO0O0 = 64;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f38546OooO0OO;

    public OooOOO(int i) {
        this.f38546OooO0OO = i;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public final synchronized void OooO00o(Map<String, String> map) {
        String strTrim;
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            int i2 = this.f38546OooO0OO;
            String strTrim2 = key.trim();
            if (strTrim2.length() > i2) {
                strTrim2 = strTrim2.substring(0, i2);
            }
            if (this.f38544OooO00o.size() < this.f38545OooO0O0 || this.f38544OooO00o.containsKey(strTrim2)) {
                String value = entry.getValue();
                ?? r4 = this.f38544OooO00o;
                if (value == null) {
                    strTrim = "";
                } else {
                    int i3 = this.f38546OooO0OO;
                    strTrim = value.trim();
                    if (strTrim.length() > i3) {
                        strTrim = strTrim.substring(0, i3);
                    }
                }
                r4.put(strTrim2, strTrim);
            } else {
                i++;
            }
        }
        if (i > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f38545OooO0O0, null);
        }
    }
}
