package Oooo000;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00oOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<o0000O0O.o000oOoO, o0000O0O.OooOo> f977OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p023Oooo00O.o0000O0O<o0000O0O.OooOo> f978OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o00oOoo(@NotNull Function1<? super o0000O0O.o000oOoO, o0000O0O.OooOo> slideOffset, @NotNull p023Oooo00O.o0000O0O<o0000O0O.OooOo> animationSpec) {
        Intrinsics.checkNotNullParameter(slideOffset, "slideOffset");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.f977OooO00o = slideOffset;
        this.f978OooO0O0 = animationSpec;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00oOoo)) {
            return false;
        }
        o00oOoo o00oooo2 = (o00oOoo) obj;
        return Intrinsics.areEqual(this.f977OooO00o, o00oooo2.f977OooO00o) && Intrinsics.areEqual(this.f978OooO0O0, o00oooo2.f978OooO0O0);
    }

    public final int hashCode() {
        return this.f978OooO0O0.hashCode() + (this.f977OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Slide(slideOffset=");
        sbOooO0o0.append(this.f977OooO00o);
        sbOooO0o0.append(", animationSpec=");
        sbOooO0o0.append(this.f978OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
