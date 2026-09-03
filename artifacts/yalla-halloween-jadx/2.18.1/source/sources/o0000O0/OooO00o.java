package o0000O0;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@JvmInline
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final C0287OooO00o f27250OooO0O0 = new C0287OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f27251OooO00o;

    /* JADX INFO: renamed from: o0000O0.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0287OooO00o {
    }

    public final boolean equals(Object obj) {
        float f = this.f27251OooO00o;
        if (obj instanceof OooO00o) {
            return Intrinsics.areEqual((Object) Float.valueOf(f), (Object) Float.valueOf(((OooO00o) obj).f27251OooO00o));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f27251OooO00o);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f27251OooO00o + ')';
    }
}
