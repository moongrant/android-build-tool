package p028Oooo0o0;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o00O0OO0 implements o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f2070OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f2071OooO0O0;

    public o00O0OO0(@NotNull o0oOo0O0 included, @NotNull o0oOo0O0 excluded) {
        Intrinsics.checkNotNullParameter(included, "included");
        Intrinsics.checkNotNullParameter(excluded, "excluded");
        this.f2070OooO00o = included;
        this.f2071OooO0O0 = excluded;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO00o(@NotNull OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return RangesKt.coerceAtLeast(this.f2070OooO00o.OooO00o(density, layoutDirection) - this.f2071OooO0O0.OooO00o(density, layoutDirection), 0);
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0O0(@NotNull OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return RangesKt.coerceAtLeast(this.f2070OooO00o.OooO0O0(density, layoutDirection) - this.f2071OooO0O0.OooO0O0(density, layoutDirection), 0);
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0OO(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return RangesKt.coerceAtLeast(this.f2070OooO00o.OooO0OO(density) - this.f2071OooO0O0.OooO0OO(density), 0);
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0Oo(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return RangesKt.coerceAtLeast(this.f2070OooO00o.OooO0Oo(density) - this.f2071OooO0O0.OooO0Oo(density), 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0OO0)) {
            return false;
        }
        o00O0OO0 o00o0oo1 = (o00O0OO0) obj;
        return Intrinsics.areEqual(o00o0oo1.f2070OooO00o, this.f2070OooO00o) && Intrinsics.areEqual(o00o0oo1.f2071OooO0O0, this.f2071OooO0O0);
    }

    public final int hashCode() {
        return this.f2071OooO0O0.hashCode() + (this.f2070OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
        sbOooO00o.append(this.f2070OooO00o);
        sbOooO00o.append(" - ");
        sbOooO00o.append(this.f2071OooO0O0);
        sbOooO00o.append(')');
        return sbOooO00o.toString();
    }
}
