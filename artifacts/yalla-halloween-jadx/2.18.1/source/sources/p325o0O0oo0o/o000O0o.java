package p325o0O0oo0o;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class o000O0o {

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends o000O0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO00o f36969OooO00o = new OooO00o();
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0O0 extends o000O0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f36970OooO00o = new OooO0O0();
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0OO extends o000O0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f36971OooO00o;

        public OooO0OO(float f) {
            this.f36971OooO00o = f;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0OO) && Intrinsics.areEqual((Object) Float.valueOf(this.f36971OooO00o), (Object) Float.valueOf(((OooO0OO) obj).f36971OooO00o));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f36971OooO00o);
        }

        @NotNull
        public final String toString() {
            return Oooo000.OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("Loading(progress="), this.f36971OooO00o, ')');
        }
    }
}
