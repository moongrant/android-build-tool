package p203o00o0o0o;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.OooOOOO;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f39227OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOOO.OooO0O0 f39228OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39229OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39230OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39231OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f39232OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39233OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f39234OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f39235OooO0oo;

    public o00OOOOo(OooOOOO.OooO0O0 oooO0O0, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        o00O000o.OooO00o(!z4 || z2);
        o00O000o.OooO00o(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        o00O000o.OooO00o(z5);
        this.f39228OooO00o = oooO0O0;
        this.f39229OooO0O0 = j;
        this.f39230OooO0OO = j2;
        this.f39231OooO0Oo = j3;
        this.f39233OooO0o0 = j4;
        this.f39232OooO0o = z;
        this.f39234OooO0oO = z2;
        this.f39235OooO0oo = z3;
        this.f39227OooO = z4;
    }

    public final o00OOOOo OooO00o(long j) {
        return j == this.f39230OooO0OO ? this : new o00OOOOo(this.f39228OooO00o, this.f39229OooO0O0, j, this.f39231OooO0Oo, this.f39233OooO0o0, this.f39232OooO0o, this.f39234OooO0oO, this.f39235OooO0oo, this.f39227OooO);
    }

    public final o00OOOOo OooO0O0(long j) {
        return j == this.f39229OooO0O0 ? this : new o00OOOOo(this.f39228OooO00o, j, this.f39230OooO0OO, this.f39231OooO0Oo, this.f39233OooO0o0, this.f39232OooO0o, this.f39234OooO0oO, this.f39235OooO0oo, this.f39227OooO);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00OOOOo.class != obj.getClass()) {
            return false;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) obj;
        return this.f39229OooO0O0 == o00ooooo2.f39229OooO0O0 && this.f39230OooO0OO == o00ooooo2.f39230OooO0OO && this.f39231OooO0Oo == o00ooooo2.f39231OooO0Oo && this.f39233OooO0o0 == o00ooooo2.f39233OooO0o0 && this.f39232OooO0o == o00ooooo2.f39232OooO0o && this.f39234OooO0oO == o00ooooo2.f39234OooO0oO && this.f39235OooO0oo == o00ooooo2.f39235OooO0oo && this.f39227OooO == o00ooooo2.f39227OooO && o0O00.OooO00o(this.f39228OooO00o, o00ooooo2.f39228OooO00o);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f39228OooO00o.hashCode() + 527) * 31) + ((int) this.f39229OooO0O0)) * 31) + ((int) this.f39230OooO0OO)) * 31) + ((int) this.f39231OooO0Oo)) * 31) + ((int) this.f39233OooO0o0)) * 31) + (this.f39232OooO0o ? 1 : 0)) * 31) + (this.f39234OooO0oO ? 1 : 0)) * 31) + (this.f39235OooO0oo ? 1 : 0)) * 31) + (this.f39227OooO ? 1 : 0);
    }
}
