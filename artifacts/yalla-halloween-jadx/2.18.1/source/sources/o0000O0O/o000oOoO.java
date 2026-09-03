package o0000O0O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27321OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27322OooO00o;

    public static final class OooO00o {
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final int OooO0O0(long j) {
        return (int) (j & 4294967295L);
    }

    public static int OooO0OO(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Stable
    @NotNull
    public static String OooO0Oo(long j) {
        return ((int) (j >> 32)) + " x " + OooO0O0(j);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o000oOoO) && this.f27322OooO00o == ((o000oOoO) obj).f27322OooO00o;
    }

    public final int hashCode() {
        return OooO0OO(this.f27322OooO00o);
    }

    @Stable
    @NotNull
    public final String toString() {
        return OooO0Oo(this.f27322OooO00o);
    }
}
