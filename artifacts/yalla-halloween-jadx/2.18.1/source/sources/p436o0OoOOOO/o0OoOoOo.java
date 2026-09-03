package p436o0OoOOOO;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<String, Object> f40049OooO00o;

    public o0OoOoOo() {
        this.f40049OooO00o = Collections.unmodifiableMap(Collections.EMPTY_MAP);
    }

    public final <T> T OooO00o(String str) {
        try {
            return (T) this.f40049OooO00o.get(str);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public o0OoOoOo(Map<String, Object> map) {
        this.f40049OooO00o = Collections.unmodifiableMap(map);
    }
}
