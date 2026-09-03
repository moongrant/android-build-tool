package o0000O0O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27307OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f27308OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27309OooO00o;

    public static final class OooO00o {
    }

    static {
        float f = 0;
        OooOOO.OooO00o(f, f);
        f27308OooO0OO = OooOOO.OooO00o(Float.NaN, Float.NaN);
    }

    public /* synthetic */ OooOOOO(long j) {
        this.f27309OooO00o = j;
    }

    public static final float OooO00o(long j) {
        if (!(j != f27308OooO0OO)) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float OooO0O0(long j) {
        if (!(j != f27308OooO0OO)) {
            throw new IllegalStateException("DpOffset is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooOOOO) && this.f27309OooO00o == ((OooOOOO) obj).f27309OooO00o;
    }

    public final int hashCode() {
        long j = this.f27309OooO00o;
        return (int) (j ^ (j >>> 32));
    }

    @Stable
    @NotNull
    public final String toString() {
        long j = this.f27309OooO00o;
        if (!(j != f27308OooO0OO)) {
            return "DpOffset.Unspecified";
        }
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
        sbOooO00o.append((Object) OooOOO0.OooO0O0(OooO00o(j)));
        sbOooO00o.append(", ");
        sbOooO00o.append((Object) OooOOO0.OooO0O0(OooO0O0(j)));
        sbOooO00o.append(')');
        return sbOooO00o.toString();
    }
}
