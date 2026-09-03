package p372o0OOo0o;

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
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f38683OooO00o;

    public o0O0O00(Context context, String str) {
        this.f38683OooO00o = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void OooO00o() {
        long j = this.f38683OooO00o.getLong("fire-count", 0L);
        String str = null;
        String key = "";
        for (Map.Entry<String, ?> entry : this.f38683OooO00o.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f38683OooO00o.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        this.f38683OooO00o.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
    }

    public final synchronized void OooO0O0() {
        SharedPreferences.Editor editorEdit = this.f38683OooO00o.edit();
        for (Map.Entry<String, ?> entry : this.f38683OooO00o.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                editorEdit.remove(entry.getKey());
            }
        }
        editorEdit.remove("fire-count");
        editorEdit.commit();
    }

    public final synchronized List<o000OOo> OooO0OO() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f38683OooO00o.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                arrayList.add(new o00Ooo(entry.getKey(), new ArrayList((Set) entry.getValue())));
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            this.f38683OooO00o.edit().putLong("fire-global", jCurrentTimeMillis).commit();
        }
        return arrayList;
        return arrayList;
    }

    public final synchronized String OooO0Oo(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized void OooO0o(String str) {
        String strOooO0o0 = OooO0o0(str);
        if (strOooO0o0 == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f38683OooO00o.getStringSet(strOooO0o0, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f38683OooO00o.edit().remove(strOooO0o0).commit();
        } else {
            this.f38683OooO00o.edit().putStringSet(strOooO0o0, hashSet).commit();
        }
    }

    public final synchronized String OooO0o0(String str) {
        for (Map.Entry<String, ?> entry : this.f38683OooO00o.getAll().entrySet()) {
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

    public final synchronized boolean OooO0oO(long j) {
        if (!this.f38683OooO00o.contains("fire-global")) {
            this.f38683OooO00o.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = this.f38683OooO00o.getLong("fire-global", -1L);
        synchronized (this) {
            if (OooO0Oo(j2).equals(OooO0Oo(j))) {
                return false;
            }
            this.f38683OooO00o.edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public final synchronized void OooO0oo(long j, String str) {
        String strOooO0Oo = OooO0Oo(j);
        if (this.f38683OooO00o.getString("last-used-date", "").equals(strOooO0Oo)) {
            return;
        }
        long j2 = this.f38683OooO00o.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            OooO00o();
            j2 = this.f38683OooO00o.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f38683OooO00o.getStringSet(str, new HashSet()));
        hashSet.add(strOooO0Oo);
        this.f38683OooO00o.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strOooO0Oo).commit();
    }
}
