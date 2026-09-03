package p028Oooo0o0;

import OooO00o.OooO00o;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o00OO000 implements o0O00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0oOo0O0 f2090OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO f2091OooO0O0;

    public o00OO000(@NotNull o0oOo0O0 insets, @NotNull OooO density) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f2090OooO00o = insets;
        this.f2091OooO0O0 = density;
    }

    @Override // p028Oooo0o0.o0O00O0o
    public final float OooO00o() {
        OooO oooO = this.f2091OooO0O0;
        return oooO.OooO0o0(this.f2090OooO00o.OooO0Oo(oooO));
    }

    @Override // p028Oooo0o0.o0O00O0o
    public final float OooO0O0(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        OooO oooO = this.f2091OooO0O0;
        return oooO.OooO0o0(this.f2090OooO00o.OooO00o(oooO, layoutDirection));
    }

    @Override // p028Oooo0o0.o0O00O0o
    public final float OooO0OO(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        OooO oooO = this.f2091OooO0O0;
        return oooO.OooO0o0(this.f2090OooO00o.OooO0O0(oooO, layoutDirection));
    }

    @Override // p028Oooo0o0.o0O00O0o
    public final float OooO0Oo() {
        OooO oooO = this.f2091OooO0O0;
        return oooO.OooO0o0(this.f2090OooO00o.OooO0OO(oooO));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OO000)) {
            return false;
        }
        o00OO000 o00oo001 = (o00OO000) obj;
        return Intrinsics.areEqual(this.f2090OooO00o, o00oo001.f2090OooO00o) && Intrinsics.areEqual(this.f2091OooO0O0, o00oo001.f2091OooO0O0);
    }

    public final int hashCode() {
        return this.f2091OooO0O0.hashCode() + (this.f2090OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("InsetsPaddingValues(insets=");
        sbOooO0o0.append(this.f2090OooO00o);
        sbOooO0o0.append(", density=");
        sbOooO0o0.append(this.f2091OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
