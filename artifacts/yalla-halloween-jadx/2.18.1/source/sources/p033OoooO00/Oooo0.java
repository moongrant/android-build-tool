package p033OoooO00;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f3429OooO00o;

    public Oooo0(float f) {
        this.f3429OooO00o = f;
    }

    @Override // p033OoooO00.OooOo
    public final float OooO00o(long j, @NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.OoooOoo(this.f3429OooO00o);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Oooo0) && OooOOO0.OooO00o(this.f3429OooO00o, ((Oooo0) obj).f3429OooO00o);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f3429OooO00o);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("CornerSize(size = ");
        sbOooO0o0.append(this.f3429OooO00o);
        sbOooO0o0.append(".dp)");
        return sbOooO0o0.toString();
    }
}
