package p028Oooo0o0;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class oo0OOoo implements o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f2231OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f2232OooO0O0;

    public oo0OOoo(@NotNull o0oOo0O0 first, @NotNull o0oOo0O0 second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        this.f2231OooO00o = first;
        this.f2232OooO0O0 = second;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO00o(@NotNull OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f2231OooO00o.OooO00o(density, layoutDirection), this.f2232OooO0O0.OooO00o(density, layoutDirection));
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0O0(@NotNull OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f2231OooO00o.OooO0O0(density, layoutDirection), this.f2232OooO0O0.OooO0O0(density, layoutDirection));
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0OO(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f2231OooO00o.OooO0OO(density), this.f2232OooO0O0.OooO0OO(density));
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0Oo(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return Math.max(this.f2231OooO00o.OooO0Oo(density), this.f2232OooO0O0.OooO0Oo(density));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0OOoo)) {
            return false;
        }
        oo0OOoo oo0oooo = (oo0OOoo) obj;
        return Intrinsics.areEqual(oo0oooo.f2231OooO00o, this.f2231OooO00o) && Intrinsics.areEqual(oo0oooo.f2232OooO0O0, this.f2232OooO0O0);
    }

    public final int hashCode() {
        return (this.f2232OooO0O0.hashCode() * 31) + this.f2231OooO00o.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('(');
        sbOooO00o.append(this.f2231OooO00o);
        sbOooO00o.append(" ∪ ");
        sbOooO00o.append(this.f2232OooO0O0);
        sbOooO00o.append(')');
        return sbOooO00o.toString();
    }
}
