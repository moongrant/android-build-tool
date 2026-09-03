package p418o0Oo0oo;

import kotlin.jvm.JvmInline;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39740OooO00o;

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static String OooO0O0(long j) {
        return "PointerId(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0OOO0o) && this.f39740OooO00o == ((o0OOO0o) obj).f39740OooO00o;
    }

    public final int hashCode() {
        long j = this.f39740OooO00o;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return OooO0O0(this.f39740OooO00o);
    }
}
