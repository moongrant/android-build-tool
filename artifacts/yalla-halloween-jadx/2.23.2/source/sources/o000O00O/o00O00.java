package o000O00O;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f34045OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.OooOOOO.OooO0O0 f34046OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f34047OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f34048OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f34049OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f34050OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f34051OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f34052OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f34053OooO0oo;

    public o00O00(androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        p080o000OoO.o00Oo0.OooO00o(!z4 || z2);
        p080o000OoO.o00Oo0.OooO00o(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        p080o000OoO.o00Oo0.OooO00o(z5);
        this.f34046OooO00o = oooO0O0;
        this.f34047OooO0O0 = j;
        this.f34048OooO0OO = j2;
        this.f34049OooO0Oo = j3;
        this.f34051OooO0o0 = j4;
        this.f34050OooO0o = z;
        this.f34052OooO0oO = z2;
        this.f34053OooO0oo = z3;
        this.f34045OooO = z4;
    }

    public final o00O00 OooO00o(long j) {
        return j == this.f34048OooO0OO ? this : new o00O00(this.f34046OooO00o, this.f34047OooO0O0, j, this.f34049OooO0Oo, this.f34051OooO0o0, this.f34050OooO0o, this.f34052OooO0oO, this.f34053OooO0oo, this.f34045OooO);
    }

    public final o00O00 OooO0O0(long j) {
        return j == this.f34047OooO0O0 ? this : new o00O00(this.f34046OooO00o, j, this.f34048OooO0OO, this.f34049OooO0Oo, this.f34051OooO0o0, this.f34050OooO0o, this.f34052OooO0oO, this.f34053OooO0oo, this.f34045OooO);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00O00.class != obj.getClass()) {
            return false;
        }
        o00O00 o00o01 = (o00O00) obj;
        return this.f34047OooO0O0 == o00o01.f34047OooO0O0 && this.f34048OooO0OO == o00o01.f34048OooO0OO && this.f34049OooO0Oo == o00o01.f34049OooO0Oo && this.f34051OooO0o0 == o00o01.f34051OooO0o0 && this.f34050OooO0o == o00o01.f34050OooO0o && this.f34052OooO0oO == o00o01.f34052OooO0oO && this.f34053OooO0oo == o00o01.f34053OooO0oo && this.f34045OooO == o00o01.f34045OooO && p080o000OoO.o00.OooO00o(this.f34046OooO00o, o00o01.f34046OooO00o);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f34046OooO00o.hashCode() + 527) * 31) + ((int) this.f34047OooO0O0)) * 31) + ((int) this.f34048OooO0OO)) * 31) + ((int) this.f34049OooO0Oo)) * 31) + ((int) this.f34051OooO0o0)) * 31) + (this.f34050OooO0o ? 1 : 0)) * 31) + (this.f34052OooO0oO ? 1 : 0)) * 31) + (this.f34053OooO0oo ? 1 : 0)) * 31) + (this.f34045OooO ? 1 : 0);
    }
}
