package p368o0OOo0O;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38661OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<Class<?>, Object> f38662OooO0O0;

    public Oooo0(String str, Map<Class<?>, Object> map) {
        this.f38661OooO00o = str;
        this.f38662OooO0O0 = map;
    }

    @NonNull
    public static Oooo0 OooO00o(@NonNull String str) {
        return new Oooo0(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return this.f38661OooO00o.equals(oooo0.f38661OooO00o) && this.f38662OooO0O0.equals(oooo0.f38662OooO0O0);
    }

    public final int hashCode() {
        return this.f38662OooO0O0.hashCode() + (this.f38661OooO00o.hashCode() * 31);
    }

    @NonNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FieldDescriptor{name=");
        sbOooO0o0.append(this.f38661OooO00o);
        sbOooO0o0.append(", properties=");
        sbOooO0o0.append(this.f38662OooO0O0.values());
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }

    public Oooo0(String str, Map map, OooO00o oooO00o) {
        this.f38661OooO00o = str;
        this.f38662OooO0O0 = map;
    }
}
