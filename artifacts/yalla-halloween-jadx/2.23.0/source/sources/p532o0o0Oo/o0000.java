package p532o0o0Oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Class<?> f54553OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Class<?> f54554OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Class<?> f54555OooO0OO;

    public o0000() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0000.class != obj.getClass()) {
            return false;
        }
        o0000 o0000Var = (o0000) obj;
        return this.f54553OooO00o.equals(o0000Var.f54553OooO00o) && this.f54554OooO0O0.equals(o0000Var.f54554OooO0O0) && o0000oo.OooO0O0(this.f54555OooO0OO, o0000Var.f54555OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = (this.f54554OooO0O0.hashCode() + (this.f54553OooO00o.hashCode() * 31)) * 31;
        Class<?> cls = this.f54555OooO0OO;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f54553OooO00o + ", second=" + this.f54554OooO0O0 + '}';
    }

    public o0000(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f54553OooO00o = cls;
        this.f54554OooO0O0 = cls2;
        this.f54555OooO0OO = cls3;
    }
}
