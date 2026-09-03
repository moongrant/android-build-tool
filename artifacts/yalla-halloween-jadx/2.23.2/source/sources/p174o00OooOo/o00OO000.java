package p174o00OooOo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Class<?> f38348OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Class<?> f38349OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Class<?> f38350OooO0OO;

    public o00OO000() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00OO000.class != obj.getClass()) {
            return false;
        }
        o00OO000 o00oo001 = (o00OO000) obj;
        return this.f38348OooO00o.equals(o00oo001.f38348OooO00o) && this.f38349OooO0O0.equals(o00oo001.f38349OooO0O0) && o00OO0O0.OooO0O0(this.f38350OooO0OO, o00oo001.f38350OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = (this.f38349OooO0O0.hashCode() + (this.f38348OooO00o.hashCode() * 31)) * 31;
        Class<?> cls = this.f38350OooO0OO;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f38348OooO00o + ", second=" + this.f38349OooO0O0 + '}';
    }

    public o00OO000(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f38348OooO00o = cls;
        this.f38349OooO0O0 = cls2;
        this.f38350OooO0OO = cls3;
    }
}
