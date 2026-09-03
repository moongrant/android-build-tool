package p187o00o00oo;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public abstract class o00O0O0O {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends o00O0O0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO00o f38710OooO00o = new OooO00o();
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 extends o00O0O0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f38711OooO00o = new OooO0O0();
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0OO extends o00O0O0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f38712OooO00o;

        public OooO0OO(float f) {
            this.f38712OooO00o = f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0OO) && Float.compare(this.f38712OooO00o, ((OooO0OO) obj).f38712OooO00o) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f38712OooO00o);
        }

        @NotNull
        public final String toString() {
            return androidx.compose.animation.OooO00o.OooO00o(new StringBuilder("Loading(progress="), this.f38712OooO00o, ')');
        }
    }
}
