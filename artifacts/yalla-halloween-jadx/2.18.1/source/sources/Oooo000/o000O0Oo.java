package Oooo000;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f872OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0000O0O.OooO f873OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f874OooO0OO;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f875OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float f876OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f877OooO0OO;

        public OooO00o(float f, float f2, long j) {
            this.f875OooO00o = f;
            this.f876OooO0O0 = f2;
            this.f877OooO0OO = j;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f875OooO00o), (Object) Float.valueOf(oooO00o.f875OooO00o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f876OooO0O0), (Object) Float.valueOf(oooO00o.f876OooO0O0)) && this.f877OooO0OO == oooO00o.f877OooO0OO;
        }

        public final int hashCode() {
            int iOooO00o = o000O00O.OooO00o(this.f876OooO0O0, Float.floatToIntBits(this.f875OooO00o) * 31, 31);
            long j = this.f877OooO0OO;
            return iOooO00o + ((int) (j ^ (j >>> 32)));
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("FlingInfo(initialVelocity=");
            sbOooO0o0.append(this.f875OooO00o);
            sbOooO0o0.append(", distance=");
            sbOooO0o0.append(this.f876OooO0O0);
            sbOooO0o0.append(", duration=");
            return o000O0.OooO0O0(sbOooO0o0, this.f877OooO0OO, ')');
        }
    }

    public o000O0Oo(float f, @NotNull o0000O0O.OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.f872OooO00o = f;
        this.f873OooO0O0 = density;
        float density2 = density.getDensity();
        float f2 = o000OO0O.f881OooO00o;
        this.f874OooO0OO = density2 * 386.0878f * 160.0f * 0.84f;
    }

    @NotNull
    public final OooO00o OooO00o(float f) {
        double dOooO0O0 = OooO0O0(f);
        double d = o000OO0O.f881OooO00o;
        double d2 = d - 1.0d;
        return new OooO00o(f, (float) (Math.exp((d / d2) * dOooO0O0) * ((double) (this.f872OooO00o * this.f874OooO0OO))), (long) (Math.exp(dOooO0O0 / d2) * 1000.0d));
    }

    public final double OooO0O0(float f) {
        OooO0OO oooO0OO = OooO0OO.f797OooO00o;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f872OooO00o * this.f874OooO0OO)));
    }
}
