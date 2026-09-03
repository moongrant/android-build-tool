package p203o00o0o0o;

import androidx.annotation.Nullable;
import kotlin.jvm.internal.LongCompanionObject;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O00OO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0O00OO f39282OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39283OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39284OooO0O0;

    static {
        o0O00OO o0o00oo2 = new o0O00OO(0L, 0L);
        new o0O00OO(LongCompanionObject.MAX_VALUE, LongCompanionObject.MAX_VALUE);
        new o0O00OO(LongCompanionObject.MAX_VALUE, 0L);
        new o0O00OO(0L, LongCompanionObject.MAX_VALUE);
        f39282OooO0OO = o0o00oo2;
    }

    public o0O00OO(long j, long j2) {
        o00O000o.OooO00o(j >= 0);
        o00O000o.OooO00o(j2 >= 0);
        this.f39283OooO00o = j;
        this.f39284OooO0O0 = j2;
    }

    public final long OooO00o(long j, long j2, long j3) {
        long j4 = this.f39283OooO00o;
        long j5 = this.f39284OooO0O0;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        int i = o0O00.f40595OooO00o;
        long j6 = j - j4;
        if (((j4 ^ j) & (j ^ j6)) < 0) {
            j6 = Long.MIN_VALUE;
        }
        long j7 = j + j5;
        if (((j5 ^ j7) & (j ^ j7)) < 0) {
            j7 = LongCompanionObject.MAX_VALUE;
        }
        boolean z = j6 <= j2 && j2 <= j7;
        boolean z2 = j6 <= j3 && j3 <= j7;
        if (z && z2) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z) {
            return j2;
        }
        return z2 ? j3 : j6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0O00OO.class != obj.getClass()) {
            return false;
        }
        o0O00OO o0o00oo2 = (o0O00OO) obj;
        return this.f39283OooO00o == o0o00oo2.f39283OooO00o && this.f39284OooO0O0 == o0o00oo2.f39284OooO0O0;
    }

    public final int hashCode() {
        return (((int) this.f39283OooO00o) * 31) + ((int) this.f39284OooO0O0);
    }
}
