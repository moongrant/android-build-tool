package o00000O;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final String f26803OooO00o;

    public o000000(@NotNull String verbatim) {
        Intrinsics.checkNotNullParameter(verbatim, "verbatim");
        this.f26803OooO00o = verbatim;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o000000) && Intrinsics.areEqual(this.f26803OooO00o, ((o000000) obj).f26803OooO00o);
    }

    public final int hashCode() {
        return this.f26803OooO00o.hashCode();
    }

    @NotNull
    public final String toString() {
        return Oooo000.o00oO0o.OooO0O0(OooO00o.OooO00o.OooO0o0("VerbatimTtsAnnotation(verbatim="), this.f26803OooO00o, ')');
    }
}
