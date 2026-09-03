package p028Oooo0o0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class o0O0o00O implements o0oOo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f2167OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2168OooO0O0;

    public o0O0o00O(@NotNull o00OO00O insets, @NotNull String name) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f2167OooO00o = name;
        this.f2168OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(insets);
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO00o(@NotNull OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return OooO0o0().f2092OooO00o;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0O0(@NotNull OooO density, @NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return OooO0o0().f2094OooO0OO;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0OO(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return OooO0o0().f2093OooO0O0;
    }

    @Override // p028Oooo0o0.o0oOo0O0
    public final int OooO0Oo(@NotNull OooO density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return OooO0o0().f2095OooO0Oo;
    }

    public final void OooO0o(@NotNull o00OO00O o00oo00o) {
        Intrinsics.checkNotNullParameter(o00oo00o, "<set-?>");
        this.f2168OooO0O0.setValue(o00oo00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final o00OO00O OooO0o0() {
        return (o00OO00O) this.f2168OooO0O0.getValue();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0O0o00O) {
            return Intrinsics.areEqual(OooO0o0(), ((o0O0o00O) obj).OooO0o0());
        }
        return false;
    }

    public final int hashCode() {
        return this.f2167OooO00o.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2167OooO00o);
        sb.append("(left=");
        sb.append(OooO0o0().f2092OooO00o);
        sb.append(", top=");
        sb.append(OooO0o0().f2093OooO0O0);
        sb.append(", right=");
        sb.append(OooO0o0().f2094OooO0OO);
        sb.append(", bottom=");
        return o0O0ooO.OooO00o(sb, OooO0o0().f2095OooO0Oo, ')');
    }
}
