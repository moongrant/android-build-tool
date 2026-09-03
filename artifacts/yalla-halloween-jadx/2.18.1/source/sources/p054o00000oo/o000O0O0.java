package p054o00000oo;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 implements o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f27161OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27162OooO0O0;

    public o000O0O0(int i, int i2) {
        this.f27161OooO00o = i;
        this.f27162OooO0O0 = i2;
        if (!(i >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(Oooo0.OooO00o("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.").toString());
        }
    }

    @Override // p054o00000oo.o000O
    public final void OooO00o(@NotNull o00 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i = this.f27161OooO00o;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            int i4 = buffer.f27157OooO0O0;
            if (i4 > i2) {
                if (Character.isHighSurrogate(buffer.OooO0OO((i4 - i2) - 1)) && Character.isLowSurrogate(buffer.OooO0OO(buffer.f27157OooO0O0 - i2))) {
                    i2++;
                }
            }
            if (i2 == buffer.f27157OooO0O0) {
                break;
            }
        }
        int i5 = this.f27162OooO0O0;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6++;
            if (buffer.f27158OooO0OO + i6 < buffer.OooO0o0()) {
                if (Character.isHighSurrogate(buffer.OooO0OO((buffer.f27158OooO0OO + i6) - 1)) && Character.isLowSurrogate(buffer.OooO0OO(buffer.f27158OooO0OO + i6))) {
                    i6++;
                }
            }
            if (buffer.f27158OooO0OO + i6 == buffer.OooO0o0()) {
                break;
            }
        }
        int i8 = buffer.f27158OooO0OO;
        buffer.OooO0O0(i8, i6 + i8);
        int i9 = buffer.f27157OooO0O0;
        buffer.OooO0O0(i9 - i2, i9);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000O0O0)) {
            return false;
        }
        o000O0O0 o000o0o1 = (o000O0O0) obj;
        return this.f27161OooO00o == o000o0o1.f27161OooO00o && this.f27162OooO0O0 == o000o0o1.f27162OooO0O0;
    }

    public final int hashCode() {
        return (this.f27161OooO00o * 31) + this.f27162OooO0O0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sbOooO0o0.append(this.f27161OooO00o);
        sbOooO0o0.append(", lengthAfterCursor=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f27162OooO0O0, ')');
    }
}
