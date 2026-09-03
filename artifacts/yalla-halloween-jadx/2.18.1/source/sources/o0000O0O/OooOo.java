package o0000O0O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooOo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27310OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f27311OooO0OO = Oooo000.OooO00o(0, 0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27312OooO00o;

    public static final class OooO00o {
    }

    public static long OooO00o(long j, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = OooO0OO(j);
        }
        return Oooo000.OooO00o(i, i2);
    }

    public static final boolean OooO0O0(long j, long j2) {
        return j == j2;
    }

    public static final int OooO0OO(long j) {
        return (int) (j & 4294967295L);
    }

    @Stable
    @NotNull
    public static String OooO0Oo(long j) {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
        sbOooO00o.append((int) (j >> 32));
        sbOooO00o.append(", ");
        sbOooO00o.append(OooO0OO(j));
        sbOooO00o.append(')');
        return sbOooO00o.toString();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooOo) && this.f27312OooO00o == ((OooOo) obj).f27312OooO00o;
    }

    public final int hashCode() {
        long j = this.f27312OooO00o;
        return (int) (j ^ (j >>> 32));
    }

    @Stable
    @NotNull
    public final String toString() {
        return OooO0Oo(this.f27312OooO00o);
    }
}
