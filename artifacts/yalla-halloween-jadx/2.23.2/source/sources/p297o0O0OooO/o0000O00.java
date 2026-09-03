package p297o0O0OooO;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41707OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, Object> f41708OooO0O0;

    public o0000O00(String str, Map<Class<?>, Object> map) {
        this.f41707OooO00o = str;
        this.f41708OooO0O0 = map;
    }

    @NonNull
    public static o0000O00 OooO00o(@NonNull String str) {
        return new o0000O00(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000O00)) {
            return false;
        }
        o0000O00 o0000o00 = (o0000O00) obj;
        return this.f41707OooO00o.equals(o0000o00.f41707OooO00o) && this.f41708OooO0O0.equals(o0000o00.f41708OooO0O0);
    }

    public final int hashCode() {
        return this.f41708OooO0O0.hashCode() + (this.f41707OooO00o.hashCode() * 31);
    }

    @NonNull
    public final String toString() {
        return "FieldDescriptor{name=" + this.f41707OooO00o + ", properties=" + this.f41708OooO0O0.values() + "}";
    }
}
