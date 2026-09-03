package p433o0OoOO0o;

import com.google.gson.annotations.SerializedName;
import p433o0OoOO0o.o0oOOo;

/* JADX INFO: loaded from: classes2.dex */
public class o0O00OO<T extends o0oOOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @SerializedName("auth_token")
    private final T f39936OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @SerializedName("id")
    private final long f39937OooO0O0;

    public o0O00OO(T t, long j) {
        if (t == null) {
            throw new IllegalArgumentException("AuthToken must not be null.");
        }
        this.f39936OooO00o = t;
        this.f39937OooO0O0 = j;
    }

    public final T OooO00o() {
        return this.f39936OooO00o;
    }

    public final long OooO0O0() {
        return this.f39937OooO0O0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o0O00OO o0o00oo2 = (o0O00OO) obj;
        if (this.f39937OooO0O0 != o0o00oo2.f39937OooO0O0) {
            return false;
        }
        T t = this.f39936OooO00o;
        T t2 = o0o00oo2.f39936OooO00o;
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    public int hashCode() {
        T t = this.f39936OooO00o;
        int iHashCode = t != null ? t.hashCode() : 0;
        long j = this.f39937OooO0O0;
        return (iHashCode * 31) + ((int) (j ^ (j >>> 32)));
    }
}
