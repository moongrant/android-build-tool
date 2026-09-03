package p054o00000oo;

import kotlin.jvm.internal.Intrinsics;
import o00000O.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f27219OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O0O00 f27220OooO0O0;

    public o00OOO0(@NotNull OooO00o text, @NotNull o00O0O00 offsetMapping) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        this.f27219OooO00o = text;
        this.f27220OooO0O0 = offsetMapping;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OOO0)) {
            return false;
        }
        o00OOO0 o00ooo1 = (o00OOO0) obj;
        return Intrinsics.areEqual(this.f27219OooO00o, o00ooo1.f27219OooO00o) && Intrinsics.areEqual(this.f27220OooO0O0, o00ooo1.f27220OooO0O0);
    }

    public final int hashCode() {
        return this.f27220OooO0O0.hashCode() + (this.f27219OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TransformedText(text=");
        sbOooO0o0.append((Object) this.f27219OooO00o);
        sbOooO0o0.append(", offsetMapping=");
        sbOooO0o0.append(this.f27220OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
