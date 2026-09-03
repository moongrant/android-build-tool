package o00OO00O;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p028Oooo0oO.o0O00o0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, List<OooOOOO>> f37115OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile Map<String, String> f37116OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Map<String, List<OooOOOO>> f37117OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<String, List<OooOOOO>> f37118OooO00o = f37117OooO0O0;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char cCharAt = property.charAt(i);
                    if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                        sb.append(cCharAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new OooO0O0(property)));
            }
            f37117OooO0O0 = Collections.unmodifiableMap(map);
        }
    }

    public static final class OooO0O0 implements OooOOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final String f37119OooO00o;

        public OooO0O0(@NonNull String str) {
            this.f37119OooO00o = str;
        }

        @Override // o00OO00O.OooOOOO
        public final String OooO00o() {
            return this.f37119OooO00o;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0O0) {
                return this.f37119OooO00o.equals(((OooO0O0) obj).f37119OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f37119OooO00o.hashCode();
        }

        public final String toString() {
            return o0O00o0.OooO0O0(new StringBuilder("StringHeaderFactory{value='"), this.f37119OooO00o, "'}");
        }
    }

    public OooOo00(Map<String, List<OooOOOO>> map) {
        this.f37115OooO0O0 = Collections.unmodifiableMap(map);
    }

    @Override // o00OO00O.OooOOO
    public final Map<String, String> OooO00o() {
        if (this.f37116OooO0OO == null) {
            synchronized (this) {
                if (this.f37116OooO0OO == null) {
                    this.f37116OooO0OO = Collections.unmodifiableMap(OooO0O0());
                }
            }
        }
        return this.f37116OooO0OO;
    }

    public final HashMap OooO0O0() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<OooOOOO>> entry : this.f37115OooO0O0.entrySet()) {
            List<OooOOOO> value = entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String strOooO00o = value.get(i).OooO00o();
                if (!TextUtils.isEmpty(strOooO00o)) {
                    sb.append(strOooO00o);
                    if (i != value.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOo00) {
            return this.f37115OooO0O0.equals(((OooOo00) obj).f37115OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37115OooO0O0.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f37115OooO0O0 + '}';
    }
}
