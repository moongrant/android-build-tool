package Oooo000;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO0O0 f986OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Function1<o0000O0O.o000oOoO, o0000O0O.o000oOoO> f987OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> f988OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f989OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o0Oo0oo(@NotNull o00OO0O0 alignment, @NotNull Function1<? super o0000O0O.o000oOoO, o0000O0O.o000oOoO> size, @NotNull p023Oooo00O.o0000O0O<o0000O0O.o000oOoO> animationSpec, boolean z) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f986OooO00o = alignment;
        this.f987OooO0O0 = size;
        this.f988OooO0OO = animationSpec;
        this.f989OooO0Oo = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0Oo0oo)) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        return Intrinsics.areEqual(this.f986OooO00o, o0oo0oo2.f986OooO00o) && Intrinsics.areEqual(this.f987OooO0O0, o0oo0oo2.f987OooO0O0) && Intrinsics.areEqual(this.f988OooO0OO, o0oo0oo2.f988OooO0OO) && this.f989OooO0Oo == o0oo0oo2.f989OooO0Oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iHashCode = (this.f988OooO0OO.hashCode() + ((this.f987OooO0O0.hashCode() + (this.f986OooO00o.hashCode() * 31)) * 31)) * 31;
        boolean z = this.f989OooO0Oo;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ChangeSize(alignment=");
        sbOooO0o0.append(this.f986OooO00o);
        sbOooO0o0.append(", size=");
        sbOooO0o0.append(this.f987OooO0O0);
        sbOooO0o0.append(", animationSpec=");
        sbOooO0o0.append(this.f988OooO0OO);
        sbOooO0o0.append(", clip=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f989OooO0Oo, ')');
    }
}
