package p262o00ooOoo;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f34889OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<String> f34890OooO0O0;

    public v(Object obj) {
        Objects.requireNonNull(obj, "null reference");
        this.f34889OooO00o = obj;
        this.f34890OooO0O0 = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final v OooO00o(String str, Object obj) {
        ?? r0 = this.f34890OooO0O0;
        String str2 = str + "=" + obj;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        r0.add(str2);
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(this.f34889OooO00o.getClass().getSimpleName());
        sb.append('{');
        int size = this.f34890OooO0O0.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) this.f34890OooO0O0.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
