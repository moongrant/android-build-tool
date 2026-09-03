package p054o00000oo;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0O0 implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27232OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27233OooO0O0;

    public oo0o0O0(int i, int i2) {
        this.f27232OooO00o = i;
        this.f27233OooO0O0 = i2;
    }

    @Override // p054o00000oo.o000O
    public final void OooO00o(@NotNull o00 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.OooO0o()) {
            buffer.OooO00o();
        }
        int iCoerceIn = RangesKt.coerceIn(this.f27232OooO00o, 0, buffer.OooO0o0());
        int iCoerceIn2 = RangesKt.coerceIn(this.f27233OooO0O0, 0, buffer.OooO0o0());
        if (iCoerceIn != iCoerceIn2) {
            if (iCoerceIn < iCoerceIn2) {
                buffer.OooO0oo(iCoerceIn, iCoerceIn2);
            } else {
                buffer.OooO0oo(iCoerceIn2, iCoerceIn);
            }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0o0O0)) {
            return false;
        }
        oo0o0O0 oo0o0o0 = (oo0o0O0) obj;
        return this.f27232OooO00o == oo0o0o0.f27232OooO00o && this.f27233OooO0O0 == oo0o0o0.f27233OooO0O0;
    }

    public final int hashCode() {
        return (this.f27232OooO00o * 31) + this.f27233OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SetComposingRegionCommand(start=");
        sbOooO0o0.append(this.f27232OooO00o);
        sbOooO0o0.append(", end=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f27233OooO0O0, ')');
    }
}
