package p035OoooOO0;

import OooO00o.OooO00o;
import Oooo000.OooO0O0;
import Oooo000.o000O00O;
import androidx.compose.runtime.Immutable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f3579OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f3580OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f3581OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f3582OooO0Oo;

    public o000000(float f, float f2, float f3, float f4) {
        this.f3579OooO00o = f;
        this.f3580OooO0O0 = f2;
        this.f3581OooO0OO = f3;
        this.f3582OooO0Oo = f4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000000)) {
            return false;
        }
        o000000 o000000Var = (o000000) obj;
        if (!(this.f3579OooO00o == o000000Var.f3579OooO00o)) {
            return false;
        }
        if (!(this.f3580OooO0O0 == o000000Var.f3580OooO0O0)) {
            return false;
        }
        if (this.f3581OooO0OO == o000000Var.f3581OooO0OO) {
            return (this.f3582OooO0Oo > o000000Var.f3582OooO0Oo ? 1 : (this.f3582OooO0Oo == o000000Var.f3582OooO0Oo ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3582OooO0Oo) + o000O00O.OooO00o(this.f3581OooO0OO, o000O00O.OooO00o(this.f3580OooO0O0, Float.floatToIntBits(this.f3579OooO00o) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("RippleAlpha(draggedAlpha=");
        sbOooO0o0.append(this.f3579OooO00o);
        sbOooO0o0.append(", focusedAlpha=");
        sbOooO0o0.append(this.f3580OooO0O0);
        sbOooO0o0.append(", hoveredAlpha=");
        sbOooO0o0.append(this.f3581OooO0OO);
        sbOooO0o0.append(", pressedAlpha=");
        return OooO0O0.OooO00o(sbOooO0o0, this.f3582OooO0Oo, ')');
    }
}
