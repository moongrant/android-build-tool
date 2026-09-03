package p466o0OooO0;

import androidx.annotation.Nullable;
import p310o0O0o0oo.o00O00O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00O.OooO00o f40509OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f40510OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f40511OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f40512OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f40513OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40514OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f40515OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f40516OooO0oo;

    public o0000OO0(o00O00O.OooO00o oooO00o, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f40509OooO00o = oooO00o;
        this.f40510OooO0O0 = j;
        this.f40511OooO0OO = j2;
        this.f40512OooO0Oo = j3;
        this.f40514OooO0o0 = j4;
        this.f40513OooO0o = z;
        this.f40515OooO0oO = z2;
        this.f40516OooO0oo = z3;
    }

    public final o0000OO0 OooO00o(long j) {
        return j == this.f40510OooO0O0 ? this : new o0000OO0(this.f40509OooO00o, j, this.f40511OooO0OO, this.f40512OooO0Oo, this.f40514OooO0o0, this.f40513OooO0o, this.f40515OooO0oO, this.f40516OooO0oo);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0000OO0.class != obj.getClass()) {
            return false;
        }
        o0000OO0 o0000oo1 = (o0000OO0) obj;
        return this.f40510OooO0O0 == o0000oo1.f40510OooO0O0 && this.f40511OooO0OO == o0000oo1.f40511OooO0OO && this.f40512OooO0Oo == o0000oo1.f40512OooO0Oo && this.f40514OooO0o0 == o0000oo1.f40514OooO0o0 && this.f40513OooO0o == o0000oo1.f40513OooO0o && this.f40515OooO0oO == o0000oo1.f40515OooO0oO && this.f40516OooO0oo == o0000oo1.f40516OooO0oo && o000OOo0.OooO00o(this.f40509OooO00o, o0000oo1.f40509OooO00o);
    }

    public final int hashCode() {
        return ((((((((((((((this.f40509OooO00o.hashCode() + 527) * 31) + ((int) this.f40510OooO0O0)) * 31) + ((int) this.f40511OooO0OO)) * 31) + ((int) this.f40512OooO0Oo)) * 31) + ((int) this.f40514OooO0o0)) * 31) + (this.f40513OooO0o ? 1 : 0)) * 31) + (this.f40515OooO0oO ? 1 : 0)) * 31) + (this.f40516OooO0oo ? 1 : 0);
    }
}
