package o00000O;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;
import p042Ooooo0o.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26874OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f26875OooO0OO = o000O0O0.OooO00o(0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f26876OooO00o;

    public static final class OooO00o {
    }

    public /* synthetic */ o0OO00O(long j) {
        this.f26876OooO00o = j;
    }

    public static int OooO(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean OooO00o(long j, long j2) {
        return OooO0oO(j) <= OooO0oO(j2) && OooO0o(j2) <= OooO0o(j);
    }

    public static final boolean OooO0O0(long j, long j2) {
        return j == j2;
    }

    public static final boolean OooO0OO(long j) {
        return ((int) (j >> 32)) == OooO0Oo(j);
    }

    public static final int OooO0Oo(long j) {
        return (int) (j & 4294967295L);
    }

    public static final int OooO0o(long j) {
        int i = (int) (j >> 32);
        return i > OooO0Oo(j) ? i : OooO0Oo(j);
    }

    public static final int OooO0o0(long j) {
        return OooO0o(j) - OooO0oO(j);
    }

    public static final int OooO0oO(long j) {
        int i = (int) (j >> 32);
        return i > OooO0Oo(j) ? OooO0Oo(j) : i;
    }

    public static final boolean OooO0oo(long j) {
        return ((int) (j >> 32)) > OooO0Oo(j);
    }

    @NotNull
    public static String OooOO0(long j) {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextRange(");
        sbOooO0o0.append((int) (j >> 32));
        sbOooO0o0.append(", ");
        sbOooO0o0.append(OooO0Oo(j));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0OO00O) && this.f26876OooO00o == ((o0OO00O) obj).f26876OooO00o;
    }

    public final int hashCode() {
        return OooO(this.f26876OooO00o);
    }

    @NotNull
    public final String toString() {
        return OooOO0(this.f26876OooO00o);
    }
}
