package p031OoooO;

import OooO00o.OooO00o;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p033OoooO00.OooOo00;
import p033OoooO00.o00O0O;
import p033OoooO00.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOo00 f2841OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooOo00 f2842OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOo00 f2843OooO0OO;

    public o000OOo() {
        this(null, null, null, 7, null);
    }

    public o000OOo(OooOo00 oooOo00, OooOo00 oooOo01, OooOo00 oooOo02, int i, DefaultConstructorMarker defaultConstructorMarker) {
        o0OoOo0 small = o00O0O.OooO0OO(4);
        o0OoOo0 medium = o00O0O.OooO0OO(4);
        o0OoOo0 large = o00O0O.OooO0OO(0);
        Intrinsics.checkNotNullParameter(small, "small");
        Intrinsics.checkNotNullParameter(medium, "medium");
        Intrinsics.checkNotNullParameter(large, "large");
        this.f2841OooO00o = small;
        this.f2842OooO0O0 = medium;
        this.f2843OooO0OO = large;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000OOo)) {
            return false;
        }
        o000OOo o000ooo2 = (o000OOo) obj;
        return Intrinsics.areEqual(this.f2841OooO00o, o000ooo2.f2841OooO00o) && Intrinsics.areEqual(this.f2842OooO0O0, o000ooo2.f2842OooO0O0) && Intrinsics.areEqual(this.f2843OooO0OO, o000ooo2.f2843OooO0OO);
    }

    public final int hashCode() {
        return this.f2843OooO0OO.hashCode() + ((this.f2842OooO0O0.hashCode() + (this.f2841OooO00o.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Shapes(small=");
        sbOooO0o0.append(this.f2841OooO00o);
        sbOooO0o0.append(", medium=");
        sbOooO0o0.append(this.f2842OooO0O0);
        sbOooO0o0.append(", large=");
        sbOooO0o0.append(this.f2843OooO0OO);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
