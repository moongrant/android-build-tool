package p461o0OooO0;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f46625OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f46626OooO0O0 = 64;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f46627OooO0OO;

    public o000000O(int i) {
        this.f46627OooO0OO = i;
    }

    public static String OooO0O0(int i, String str) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i ? strTrim.substring(0, i) : strTrim;
    }

    @NonNull
    public final synchronized Map<String, String> OooO00o() {
        return Collections.unmodifiableMap(new HashMap(this.f46625OooO00o));
    }

    public final synchronized boolean OooO0OO(String str, String str2) {
        boolean zEquals;
        String strOooO0O0 = OooO0O0(this.f46627OooO0OO, str);
        if (this.f46625OooO00o.size() >= this.f46626OooO0O0 && !this.f46625OooO00o.containsKey(strOooO0O0)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f46626OooO0O0, null);
            return false;
        }
        String strOooO0O1 = OooO0O0(this.f46627OooO0OO, str2);
        String str3 = (String) this.f46625OooO00o.get(strOooO0O0);
        if (str3 == null) {
            zEquals = strOooO0O1 == null;
        } else {
            zEquals = str3.equals(strOooO0O1);
        }
        if (zEquals) {
            return false;
        }
        HashMap map = this.f46625OooO00o;
        if (str2 == null) {
            strOooO0O1 = "";
        }
        map.put(strOooO0O0, strOooO0O1);
        return true;
    }

    public final synchronized void OooO0Oo(Map<String, String> map) {
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String strOooO0O0 = OooO0O0(this.f46627OooO0OO, key);
            if (this.f46625OooO00o.size() < this.f46626OooO0O0 || this.f46625OooO00o.containsKey(strOooO0O0)) {
                String value = entry.getValue();
                this.f46625OooO00o.put(strOooO0O0, value == null ? "" : OooO0O0(this.f46627OooO0OO, value));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f46626OooO0O0, null);
        }
    }
}
