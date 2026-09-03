package o0000O0O;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class o00O0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27323OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o00Ooo[] f27324OooO0OO = {new o00Ooo(0), new o00Ooo(4294967296L), new o00Ooo(8589934592L)};

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f27325OooO0Oo = o00Oo0.OooO0o0(0, Float.NaN);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27326OooO00o;

    public static final class OooO00o {
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final long OooO0O0(long j) {
        return f27324OooO0OO[(int) ((j & 1095216660480L) >>> 32)].f27327OooO00o;
    }

    public static final float OooO0OO(long j) {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int OooO0Oo(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @NotNull
    public static String OooO0o0(long j) {
        long jOooO0O0 = OooO0O0(j);
        if (o00Ooo.OooO00o(jOooO0O0, 0L)) {
            return "Unspecified";
        }
        if (o00Ooo.OooO00o(jOooO0O0, 4294967296L)) {
            return OooO0OO(j) + ".sp";
        }
        if (!o00Ooo.OooO00o(jOooO0O0, 8589934592L)) {
            return "Invalid";
        }
        return OooO0OO(j) + ".em";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00O0O) && this.f27326OooO00o == ((o00O0O) obj).f27326OooO00o;
    }

    public final int hashCode() {
        return OooO0Oo(this.f27326OooO00o);
    }

    @NotNull
    public final String toString() {
        return OooO0o0(this.f27326OooO00o);
    }
}
