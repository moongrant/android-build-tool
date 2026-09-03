package p297o0O0o00;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f42396OooO00o;

    public o0OO00O(Context context, String str) {
        this.f42396OooO00o = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized boolean OooO(long j) {
        return OooOO0(j);
    }

    public final synchronized void OooO00o() {
        long j = this.f42396OooO00o.getLong("fire-count", 0L);
        String key = "";
        String str = null;
        for (Map.Entry<String, ?> entry : this.f42396OooO00o.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f42396OooO00o.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        this.f42396OooO00o.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
    }

    public final synchronized void OooO0O0() {
        SharedPreferences.Editor editorEdit = this.f42396OooO00o.edit();
        int i = 0;
        for (Map.Entry<String, ?> entry : this.f42396OooO00o.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String strOooO0Oo = OooO0Oo(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(strOooO0Oo)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(strOooO0Oo);
                    i++;
                    editorEdit.putStringSet(key, hashSet);
                } else {
                    editorEdit.remove(key);
                }
            }
        }
        if (i == 0) {
            editorEdit.remove("fire-count");
        } else {
            editorEdit.putLong("fire-count", i);
        }
        editorEdit.commit();
    }

    public final synchronized ArrayList OooO0OO() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f42396OooO00o.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(OooO0Oo(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new o00O0O(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        OooOO0o(System.currentTimeMillis());
        return arrayList;
    }

    public final synchronized String OooO0Oo(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized boolean OooO0o(long j, long j2) {
        return OooO0Oo(j).equals(OooO0Oo(j2));
    }

    public final synchronized String OooO0o0(String str) {
        for (Map.Entry<String, ?> entry : this.f42396OooO00o.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void OooO0oO() {
        String strOooO0Oo = OooO0Oo(System.currentTimeMillis());
        this.f42396OooO00o.edit().putString("last-used-date", strOooO0Oo).commit();
        OooO0oo(strOooO0Oo);
    }

    public final synchronized void OooO0oo(String str) {
        String strOooO0o0 = OooO0o0(str);
        if (strOooO0o0 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f42396OooO00o.getStringSet(strOooO0o0, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f42396OooO00o.edit().remove(strOooO0o0).commit();
        } else {
            this.f42396OooO00o.edit().putStringSet(strOooO0o0, hashSet).commit();
        }
    }

    public final synchronized boolean OooOO0(long j) {
        if (!this.f42396OooO00o.contains("fire-global")) {
            this.f42396OooO00o.edit().putLong("fire-global", j).commit();
            return true;
        }
        if (OooO0o(this.f42396OooO00o.getLong("fire-global", -1L), j)) {
            return false;
        }
        this.f42396OooO00o.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final synchronized void OooOO0O(long j, String str) {
        String strOooO0Oo = OooO0Oo(j);
        if (this.f42396OooO00o.getString("last-used-date", "").equals(strOooO0Oo)) {
            String strOooO0o0 = OooO0o0(strOooO0Oo);
            if (strOooO0o0 == null) {
                return;
            }
            if (strOooO0o0.equals(str)) {
                return;
            }
            OooOOO0(str, strOooO0Oo);
            return;
        }
        long j2 = this.f42396OooO00o.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            OooO00o();
            j2 = this.f42396OooO00o.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f42396OooO00o.getStringSet(str, new HashSet()));
        hashSet.add(strOooO0Oo);
        this.f42396OooO00o.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strOooO0Oo).commit();
    }

    public final synchronized void OooOO0o(long j) {
        this.f42396OooO00o.edit().putLong("fire-global", j).commit();
    }

    public final synchronized void OooOOO0(String str, String str2) {
        OooO0oo(str2);
        HashSet hashSet = new HashSet(this.f42396OooO00o.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f42396OooO00o.edit().putStringSet(str, hashSet).commit();
    }
}
