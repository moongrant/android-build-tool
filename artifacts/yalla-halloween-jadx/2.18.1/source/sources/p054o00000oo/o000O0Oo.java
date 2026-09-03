package p054o00000oo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o00000O.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f27163OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27164OooO0O0;

    public o000O0Oo(@NotNull String text, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        OooO00o annotatedString = new OooO00o(text, null, 6);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.f27163OooO00o = annotatedString;
        this.f27164OooO0O0 = i;
    }

    @Override // p054o00000oo.o000O
    public final void OooO00o(@NotNull o00 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.OooO0o()) {
            buffer.OooO0oO(buffer.f27159OooO0Oo, buffer.f27160OooO0o0, this.f27163OooO00o.f26756Oooo0o);
        } else {
            buffer.OooO0oO(buffer.f27157OooO0O0, buffer.f27158OooO0OO, this.f27163OooO00o.f26756Oooo0o);
        }
        int i = buffer.f27157OooO0O0;
        int i2 = buffer.f27158OooO0OO;
        if (i != i2) {
            i2 = -1;
        }
        int i3 = this.f27164OooO0O0;
        int iCoerceIn = RangesKt.coerceIn(i3 > 0 ? (i2 + i3) - 1 : (i2 + i3) - this.f27163OooO00o.f26756Oooo0o.length(), 0, buffer.OooO0o0());
        buffer.OooO(iCoerceIn, iCoerceIn);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0Oo)) {
            return false;
        }
        o000O0Oo o000o0oo2 = (o000O0Oo) obj;
        return Intrinsics.areEqual(this.f27163OooO00o.f26756Oooo0o, o000o0oo2.f27163OooO00o.f26756Oooo0o) && this.f27164OooO0O0 == o000o0oo2.f27164OooO0O0;
    }

    public final int hashCode() {
        return (this.f27163OooO00o.f26756Oooo0o.hashCode() * 31) + this.f27164OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CommitTextCommand(text='");
        sbOooO0o0.append(this.f27163OooO00o.f26756Oooo0o);
        sbOooO0o0.append("', newCursorPosition=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f27164OooO0O0, ')');
    }
}
