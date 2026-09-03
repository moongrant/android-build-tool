package o0000O0O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.FloatCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f27314OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f27316OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27313OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f27315OooO0Oo = OooOOO.OooO0O0(Float.NaN, Float.NaN);

    public static final class OooO00o {
    }

    static {
        float f = 0;
        f27314OooO0OO = OooOOO.OooO0O0(f, f);
    }

    public static final float OooO00o(long j) {
        if (!(j != f27315OooO0Oo)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float OooO0O0(long j) {
        if (!(j != f27315OooO0Oo)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static int OooO0OO(long j) {
        return (int) (j ^ (j >>> 32));
    }

    @Stable
    @NotNull
    public static String OooO0Oo(long j) {
        if (!(j != f27315OooO0Oo)) {
            return "DpSize.Unspecified";
        }
        return ((Object) OooOOO0.OooO0O0(OooO0O0(j))) + " x " + ((Object) OooOOO0.OooO0O0(OooO00o(j)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooOo00) && this.f27316OooO00o == ((OooOo00) obj).f27316OooO00o;
    }

    public final int hashCode() {
        return OooO0OO(this.f27316OooO00o);
    }

    @Stable
    @NotNull
    public final String toString() {
        return OooO0Oo(this.f27316OooO00o);
    }
}
