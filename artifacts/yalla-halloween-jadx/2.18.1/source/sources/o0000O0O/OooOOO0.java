package o0000O0O;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooOOO0 implements Comparable<OooOOO0> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27305Oooo0oO = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final float f27306Oooo0o;

    public static final class OooO00o {
    }

    public static final boolean OooO00o(float f, float f2) {
        return Intrinsics.areEqual((Object) Float.valueOf(f), (Object) Float.valueOf(f2));
    }

    @Stable
    @NotNull
    public static String OooO0O0(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(OooOOO0 oooOOO0) {
        return Float.compare(this.f27306Oooo0o, oooOOO0.f27306Oooo0o);
    }

    public final boolean equals(Object obj) {
        float f = this.f27306Oooo0o;
        if (obj instanceof OooOOO0) {
            return Intrinsics.areEqual((Object) Float.valueOf(f), (Object) Float.valueOf(((OooOOO0) obj).f27306Oooo0o));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f27306Oooo0o);
    }

    @Stable
    @NotNull
    public final String toString() {
        return OooO0O0(this.f27306Oooo0o);
    }
}
