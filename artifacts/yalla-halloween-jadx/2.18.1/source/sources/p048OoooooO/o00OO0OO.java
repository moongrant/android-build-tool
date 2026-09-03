package p048OoooooO;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import o0000O0O.Oooo000;
import o0000O0O.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00OO0OO implements o00OO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f4186OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f4187OooO0OO;

    @Immutable
    public static final class OooO00o implements o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f4188OooO00o;

        public OooO00o(float f) {
            this.f4188OooO00o = f;
        }

        @Override // OoooooO.o00OO0O0.OooO0O0
        public final int OooO00o(int i, int i2, @NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return MathKt.roundToInt((1 + (layoutDirection == LayoutDirection.Ltr ? this.f4188OooO00o : (-1) * this.f4188OooO00o)) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO00o) && Intrinsics.areEqual((Object) Float.valueOf(this.f4188OooO00o), (Object) Float.valueOf(((OooO00o) obj).f4188OooO00o));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f4188OooO00o);
        }

        @NotNull
        public final String toString() {
            return Oooo000.OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("Horizontal(bias="), this.f4188OooO00o, ')');
        }
    }

    @Immutable
    public static final class OooO0O0 implements o00OO0O0.OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final float f4189OooO00o;

        public OooO0O0(float f) {
            this.f4189OooO00o = f;
        }

        @Override // OoooooO.o00OO0O0.OooO0OO
        public final int OooO00o(int i, int i2) {
            return MathKt.roundToInt((1 + this.f4189OooO00o) * ((i2 - i) / 2.0f));
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OooO0O0) && Intrinsics.areEqual((Object) Float.valueOf(this.f4189OooO00o), (Object) Float.valueOf(((OooO0O0) obj).f4189OooO00o));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f4189OooO00o);
        }

        @NotNull
        public final String toString() {
            return Oooo000.OooO0O0.OooO00o(OooO00o.OooO00o.OooO0o0("Vertical(bias="), this.f4189OooO00o, ')');
        }
    }

    public o00OO0OO(float f, float f2) {
        this.f4186OooO0O0 = f;
        this.f4187OooO0OO = f2;
    }

    @Override // p048OoooooO.o00OO0O0
    public final long OooO00o(long j, long j2, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fOooO0O0 = (o000oOoO.OooO0O0(j2) - o000oOoO.OooO0O0(j)) / 2.0f;
        float f2 = 1;
        return Oooo000.OooO00o(MathKt.roundToInt(((layoutDirection == LayoutDirection.Ltr ? this.f4186OooO0O0 : (-1) * this.f4186OooO0O0) + f2) * f), MathKt.roundToInt((f2 + this.f4187OooO0OO) * fOooO0O0));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OO0OO)) {
            return false;
        }
        o00OO0OO o00oo0oo = (o00OO0OO) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f4186OooO0O0), (Object) Float.valueOf(o00oo0oo.f4186OooO0O0)) && Intrinsics.areEqual((Object) Float.valueOf(this.f4187OooO0OO), (Object) Float.valueOf(o00oo0oo.f4187OooO0OO));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4187OooO0OO) + (Float.floatToIntBits(this.f4186OooO0O0) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("BiasAlignment(horizontalBias=");
        sbOooO0o0.append(this.f4186OooO0O0);
        sbOooO0o0.append(", verticalBias=");
        return Oooo000.OooO0O0.OooO00o(sbOooO0o0, this.f4187OooO0OO, ')');
    }
}
