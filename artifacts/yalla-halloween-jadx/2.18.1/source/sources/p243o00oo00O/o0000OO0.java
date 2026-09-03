package p243o00oo00O;

import OooO00o.OooO00o;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Class<?> f34165OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Class<?> f34166OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Class<?> f34167OooO0OO;

    public o0000OO0() {
    }

    public final void OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f34165OooO00o = cls;
        this.f34166OooO0O0 = cls2;
        this.f34167OooO0OO = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0000OO0.class != obj.getClass()) {
            return false;
        }
        o0000OO0 o0000oo1 = (o0000OO0) obj;
        return this.f34165OooO00o.equals(o0000oo1.f34165OooO00o) && this.f34166OooO0O0.equals(o0000oo1.f34166OooO0O0) && o000O000.OooO0O0(this.f34167OooO0OO, o0000oo1.f34167OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = (this.f34166OooO0O0.hashCode() + (this.f34165OooO00o.hashCode() * 31)) * 31;
        Class<?> cls = this.f34167OooO0OO;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("MultiClassKey{first=");
        sbOooO0o0.append(this.f34165OooO00o);
        sbOooO0o0.append(", second=");
        sbOooO0o0.append(this.f34166OooO0O0);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }

    public o0000OO0(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        OooO00o(cls, cls2, cls3);
    }
}
