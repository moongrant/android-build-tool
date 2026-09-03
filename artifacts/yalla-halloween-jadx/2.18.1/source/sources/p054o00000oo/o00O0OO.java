package p054o00000oo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o00000O.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OO implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f27185OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27186OooO0O0;

    public o00O0OO(@NotNull String text, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        OooO00o annotatedString = new OooO00o(text, null, 6);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.f27185OooO00o = annotatedString;
        this.f27186OooO0O0 = i;
    }

    @Override // p054o00000oo.o000O
    public final void OooO00o(@NotNull o00 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.OooO0o()) {
            int i = buffer.f27159OooO0Oo;
            buffer.OooO0oO(i, buffer.f27160OooO0o0, this.f27185OooO00o.f26756Oooo0o);
            if (this.f27185OooO00o.f26756Oooo0o.length() > 0) {
                buffer.OooO0oo(i, this.f27185OooO00o.f26756Oooo0o.length() + i);
            }
        } else {
            int i2 = buffer.f27157OooO0O0;
            buffer.OooO0oO(i2, buffer.f27158OooO0OO, this.f27185OooO00o.f26756Oooo0o);
            if (this.f27185OooO00o.f26756Oooo0o.length() > 0) {
                buffer.OooO0oo(i2, this.f27185OooO00o.f26756Oooo0o.length() + i2);
            }
        }
        int i3 = buffer.f27157OooO0O0;
        int i4 = buffer.f27158OooO0OO;
        if (i3 != i4) {
            i4 = -1;
        }
        int i5 = this.f27186OooO0O0;
        int iCoerceIn = RangesKt.coerceIn(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - this.f27185OooO00o.f26756Oooo0o.length(), 0, buffer.OooO0o0());
        buffer.OooO(iCoerceIn, iCoerceIn);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0OO)) {
            return false;
        }
        o00O0OO o00o0oo2 = (o00O0OO) obj;
        return Intrinsics.areEqual(this.f27185OooO00o.f26756Oooo0o, o00o0oo2.f27185OooO00o.f26756Oooo0o) && this.f27186OooO0O0 == o00o0oo2.f27186OooO0O0;
    }

    public final int hashCode() {
        return (this.f27185OooO00o.f26756Oooo0o.hashCode() * 31) + this.f27186OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SetComposingTextCommand(text='");
        sbOooO0o0.append(this.f27185OooO00o.f26756Oooo0o);
        sbOooO0o0.append("', newCursorPosition=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f27186OooO0O0, ')');
    }
}
