package p294o0O0Ooo0;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f42308OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, Object> f42309OooO0O0;

    public o0000O0(String str, Map<Class<?>, Object> map) {
        this.f42308OooO00o = str;
        this.f42309OooO0O0 = map;
    }

    @NonNull
    public static o0000O0 OooO00o(@NonNull String str) {
        return new o0000O0(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000O0)) {
            return false;
        }
        o0000O0 o0000o1 = (o0000O0) obj;
        return this.f42308OooO00o.equals(o0000o1.f42308OooO00o) && this.f42309OooO0O0.equals(o0000o1.f42309OooO0O0);
    }

    public final int hashCode() {
        return this.f42309OooO0O0.hashCode() + (this.f42308OooO00o.hashCode() * 31);
    }

    @NonNull
    public final String toString() {
        return "FieldDescriptor{name=" + this.f42308OooO00o + ", properties=" + this.f42309OooO0O0.values() + "}";
    }
}
