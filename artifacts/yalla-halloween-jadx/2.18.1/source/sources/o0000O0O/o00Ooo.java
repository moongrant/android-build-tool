package o0000O0O;

import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27327OooO00o;

    public /* synthetic */ o00Ooo(long j) {
        this.f27327OooO00o = j;
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    @NotNull
    public static String OooO0O0(long j) {
        if (OooO00o(j, 0L)) {
            return "Unspecified";
        }
        if (OooO00o(j, 4294967296L)) {
            return "Sp";
        }
        return OooO00o(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00Ooo) && this.f27327OooO00o == ((o00Ooo) obj).f27327OooO00o;
    }

    public final int hashCode() {
        long j = this.f27327OooO00o;
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public final String toString() {
        return OooO0O0(this.f27327OooO00o);
    }
}
