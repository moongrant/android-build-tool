package p167o00Ooo;

import OooO00o.OooO00o;
import Oooo000.OooO0O0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f32635OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f32636OooO0O0;

    public o0OoOo0(float f, float f2) {
        this.f32635OooO00o = f;
        this.f32636OooO0O0 = f2;
    }

    @NotNull
    public final float[] OooO00o() {
        float f = this.f32635OooO00o;
        float f2 = this.f32636OooO0O0;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f32635OooO00o), (Object) Float.valueOf(o0oooo1.f32635OooO00o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f32636OooO0O0), (Object) Float.valueOf(o0oooo1.f32636OooO0O0));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f32636OooO0O0) + (Float.floatToIntBits(this.f32635OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("WhitePoint(x=");
        sbOooO0o0.append(this.f32635OooO00o);
        sbOooO0o0.append(", y=");
        return OooO0O0.OooO00o(sbOooO0o0, this.f32636OooO0O0, ')');
    }
}
