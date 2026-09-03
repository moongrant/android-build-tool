package p466o0OooO0;

import androidx.annotation.Nullable;
import p318o0O0oOo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000O0O0 f40534OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f40535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f40536OooO0O0;

    static {
        o000O0O0 o000o0o1 = new o000O0O0(0L, 0L);
        new o000O0O0(Long.MAX_VALUE, Long.MAX_VALUE);
        new o000O0O0(Long.MAX_VALUE, 0L);
        new o000O0O0(0L, Long.MAX_VALUE);
        f40534OooO0OO = o000o0o1;
    }

    public o000O0O0(long j, long j2) {
        o00000O0.OooO00o(j >= 0);
        o00000O0.OooO00o(j2 >= 0);
        this.f40535OooO00o = j;
        this.f40536OooO0O0 = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o000O0O0.class != obj.getClass()) {
            return false;
        }
        o000O0O0 o000o0o1 = (o000O0O0) obj;
        return this.f40535OooO00o == o000o0o1.f40535OooO00o && this.f40536OooO0O0 == o000o0o1.f40536OooO0O0;
    }

    public final int hashCode() {
        return (((int) this.f40535OooO00o) * 31) + ((int) this.f40536OooO0O0);
    }
}
