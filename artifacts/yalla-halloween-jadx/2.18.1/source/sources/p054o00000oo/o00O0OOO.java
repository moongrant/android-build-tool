package p054o00000oo;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OOO implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27195OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27196OooO0O0;

    public o00O0OOO(int i, int i2) {
        this.f27195OooO00o = i;
        this.f27196OooO0O0 = i2;
    }

    @Override // p054o00000oo.o000O
    public final void OooO00o(@NotNull o00 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int iCoerceIn = RangesKt.coerceIn(this.f27195OooO00o, 0, buffer.OooO0o0());
        int iCoerceIn2 = RangesKt.coerceIn(this.f27196OooO0O0, 0, buffer.OooO0o0());
        if (iCoerceIn < iCoerceIn2) {
            buffer.OooO(iCoerceIn, iCoerceIn2);
        } else {
            buffer.OooO(iCoerceIn2, iCoerceIn);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0OOO)) {
            return false;
        }
        o00O0OOO o00o0ooo2 = (o00O0OOO) obj;
        return this.f27195OooO00o == o00o0ooo2.f27195OooO00o && this.f27196OooO0O0 == o00o0ooo2.f27196OooO0O0;
    }

    public final int hashCode() {
        return (this.f27195OooO00o * 31) + this.f27196OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SetSelectionCommand(start=");
        sbOooO0o0.append(this.f27195OooO00o);
        sbOooO0o0.append(", end=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f27196OooO0O0, ')');
    }
}
