package p221o00oOO;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 implements o0OO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<String, List<oo0o0Oo>> f33743OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile Map<String, String> f33744OooO0OO;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Map<String, List<oo0o0Oo>> f33745OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Map<String, List<oo0o0Oo>> f33746OooO00o = f33745OooO0O0;

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
            f33745OooO0O0 = Collections.unmodifiableMap(map);
        }
    }

    public static final class OooO0O0 implements oo0o0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final String f33747OooO00o;

        public OooO0O0(@NonNull String str) {
            this.f33747OooO00o = str;
        }

        @Override // p221o00oOO.oo0o0Oo
        public final String OooO00o() {
            return this.f33747OooO00o;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof OooO0O0) {
                return this.f33747OooO00o.equals(((OooO0O0) obj).f33747OooO00o);
            }
            return false;
        }

        public final int hashCode() {
            return this.f33747OooO00o.hashCode();
        }

        public final String toString() {
            return kotlin.reflect.jvm.internal.impl.builtins.OooO00o.OooO00o(OooO00o.OooO00o.OooO0o0("StringHeaderFactory{value='"), this.f33747OooO00o, '\'', '}');
        }
    }

    public o0O0O00(Map<String, List<oo0o0Oo>> map) {
        this.f33743OooO0O0 = Collections.unmodifiableMap(map);
    }

    @Override // p221o00oOO.o0OO00O
    public final Map<String, String> OooO00o() {
        if (this.f33744OooO0OO == null) {
            synchronized (this) {
                if (this.f33744OooO0OO == null) {
                    this.f33744OooO0OO = Collections.unmodifiableMap(OooO0O0());
                }
            }
        }
        return this.f33744OooO0OO;
    }

    public final Map<String, String> OooO0O0() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<oo0o0Oo>> entry : this.f33743OooO0O0.entrySet()) {
            List<oo0o0Oo> value = entry.getValue();
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
        if (obj instanceof o0O0O00) {
            return this.f33743OooO0O0.equals(((o0O0O00) obj).f33743OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33743OooO0O0.hashCode();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("LazyHeaders{headers=");
        sbOooO0o0.append(this.f33743OooO0O0);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
