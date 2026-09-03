package p226o00oOo00;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f39859OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39860OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f39861OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39862OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f39863OooO0o0;

    public o0000oo(Object obj) {
        this(obj, -1L);
    }

    public final boolean OooO00o() {
        return this.f39860OooO0O0 != -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000oo)) {
            return false;
        }
        o0000oo o0000ooVar = (o0000oo) obj;
        return this.f39859OooO00o.equals(o0000ooVar.f39859OooO00o) && this.f39860OooO0O0 == o0000ooVar.f39860OooO0O0 && this.f39861OooO0OO == o0000ooVar.f39861OooO0OO && this.f39862OooO0Oo == o0000ooVar.f39862OooO0Oo && this.f39863OooO0o0 == o0000ooVar.f39863OooO0o0;
    }

    public final int hashCode() {
        return ((((((((this.f39859OooO00o.hashCode() + 527) * 31) + this.f39860OooO0O0) * 31) + this.f39861OooO0OO) * 31) + ((int) this.f39862OooO0Oo)) * 31) + this.f39863OooO0o0;
    }

    public o0000oo(Object obj, long j) {
        this(j, -1, -1, -1, obj);
    }

    public o0000oo(o0000oo o0000ooVar) {
        this.f39859OooO00o = o0000ooVar.f39859OooO00o;
        this.f39860OooO0O0 = o0000ooVar.f39860OooO0O0;
        this.f39861OooO0OO = o0000ooVar.f39861OooO0OO;
        this.f39862OooO0Oo = o0000ooVar.f39862OooO0Oo;
        this.f39863OooO0o0 = o0000ooVar.f39863OooO0o0;
    }

    public o0000oo(long j, int i, int i2, int i3, Object obj) {
        this.f39859OooO00o = obj;
        this.f39860OooO0O0 = i;
        this.f39861OooO0OO = i2;
        this.f39862OooO0Oo = j;
        this.f39863OooO0o0 = i3;
    }
}
