package p028Oooo0o0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p071o000O0o.OooO;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o00oOoo implements o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f2103OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f2104OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2105OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2106OooO0Oo;

    public o00oOoo(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2103OooO00o = i;
        this.f2104OooO0O0 = name;
        this.f2105OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(OooO.f28161OooO0o0);
        this.f2106OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.TRUE);
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO00o(@NotNull o0000O0O.OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return OooO0o0().f28162OooO00o;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0O0(@NotNull o0000O0O.OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return OooO0o0().f28164OooO0OO;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0OO(@NotNull o0000O0O.OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return OooO0o0().f28163OooO0O0;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0Oo(@NotNull o0000O0O.OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return OooO0o0().f28165OooO0Oo;
    }

    public final void OooO0o(@NotNull WindowInsetsCompat windowInsetsCompat, int i) {
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "windowInsetsCompat");
        if (i == 0 || (i & this.f2103OooO00o) != 0) {
            OooO oooOOooO0Oo = windowInsetsCompat.OooO0Oo(this.f2103OooO00o);
            Intrinsics.checkNotNullParameter(oooOOooO0Oo, "<set-?>");
            this.f2105OooO0OO.setValue(oooOOooO0Oo);
            this.f2106OooO0Oo.setValue(Boolean.valueOf(windowInsetsCompat.f7918OooO00o.OooOOOo(this.f2103OooO00o)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final OooO OooO0o0() {
        return (OooO) this.f2105OooO0OO.getValue();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o00oOoo) && this.f2103OooO00o == ((o00oOoo) obj).f2103OooO00o;
    }

    public final int hashCode() {
        return this.f2103OooO00o;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2104OooO0O0);
        sb.append('(');
        sb.append(OooO0o0().f28162OooO00o);
        sb.append(", ");
        sb.append(OooO0o0().f28163OooO0O0);
        sb.append(", ");
        sb.append(OooO0o0().f28164OooO0OO);
        sb.append(", ");
        return o0O0ooO.OooO00o(sb, OooO0o0().f28165OooO0Oo, ')');
    }
}
