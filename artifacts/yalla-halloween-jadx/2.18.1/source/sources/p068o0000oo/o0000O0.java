package p068o0000oo;

import OooO00o.OooO00o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Object f27946OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f27947OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f27948OooO0OO;

    public o0000O0(@NotNull Object span, int i, int i2) {
        Intrinsics.checkNotNullParameter(span, "span");
        this.f27946OooO00o = span;
        this.f27947OooO0O0 = i;
        this.f27948OooO0OO = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0000O0)) {
            return false;
        }
        o0000O0 o0000o1 = (o0000O0) obj;
        return Intrinsics.areEqual(this.f27946OooO00o, o0000o1.f27946OooO00o) && this.f27947OooO0O0 == o0000o1.f27947OooO0O0 && this.f27948OooO0OO == o0000o1.f27948OooO0OO;
    }

    public final int hashCode() {
        return (((this.f27946OooO00o.hashCode() * 31) + this.f27947OooO0O0) * 31) + this.f27948OooO0OO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SpanRange(span=");
        sbOooO0o0.append(this.f27946OooO00o);
        sbOooO0o0.append(", start=");
        sbOooO0o0.append(this.f27947OooO0O0);
        sbOooO0o0.append(", end=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f27948OooO0OO, ')');
    }
}
