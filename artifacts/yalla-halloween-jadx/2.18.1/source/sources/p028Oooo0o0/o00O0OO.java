package p028Oooo0o0;

import OooO00o.OooO00o;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00O0OO implements o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f2066OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2067OooO0O0 = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f2068OooO0OO = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f2069OooO0Oo = 0;

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO00o(@NotNull OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f2066OooO00o;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0O0(@NotNull OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f2068OooO0OO;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0OO(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f2067OooO0O0;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0Oo(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return this.f2069OooO0Oo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0OO)) {
            return false;
        }
        o00O0OO o00o0oo2 = (o00O0OO) obj;
        return this.f2066OooO00o == o00o0oo2.f2066OooO00o && this.f2067OooO0O0 == o00o0oo2.f2067OooO0O0 && this.f2068OooO0OO == o00o0oo2.f2068OooO0OO && this.f2069OooO0Oo == o00o0oo2.f2069OooO0Oo;
    }

    public final int hashCode() {
        return (((((this.f2066OooO00o * 31) + this.f2067OooO0O0) * 31) + this.f2068OooO0OO) * 31) + this.f2069OooO0Oo;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Insets(left=");
        sbOooO0o0.append(this.f2066OooO00o);
        sbOooO0o0.append(", top=");
        sbOooO0o0.append(this.f2067OooO0O0);
        sbOooO0o0.append(", right=");
        sbOooO0o0.append(this.f2068OooO0OO);
        sbOooO0o0.append(", bottom=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f2069OooO0Oo, ')');
    }
}
