package p054o00000oo;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO0O implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27165OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27166OooO0O0;

    public o000OO0O(int i, int i2) {
        this.f27165OooO00o = i;
        this.f27166OooO0O0 = i2;
        if (!(i >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(Oooo0.OooO00o("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.").toString());
        }
    }

    @Override // p054o00000oo.o000O
    public final void OooO00o(@NotNull o00 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i = buffer.f27158OooO0OO;
        buffer.OooO0O0(i, Math.min(this.f27166OooO0O0 + i, buffer.OooO0o0()));
        buffer.OooO0O0(Math.max(0, buffer.f27157OooO0O0 - this.f27165OooO00o), buffer.f27157OooO0O0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000OO0O)) {
            return false;
        }
        o000OO0O o000oo0o2 = (o000OO0O) obj;
        return this.f27165OooO00o == o000oo0o2.f27165OooO00o && this.f27166OooO0O0 == o000oo0o2.f27166OooO0O0;
    }

    public final int hashCode() {
        return (this.f27165OooO00o * 31) + this.f27166OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sbOooO0o0.append(this.f27165OooO00o);
        sbOooO0o0.append(", lengthAfterCursor=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f27166OooO0O0, ')');
    }
}
