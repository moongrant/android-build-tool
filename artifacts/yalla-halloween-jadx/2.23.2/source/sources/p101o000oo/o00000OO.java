package p101o000oo;

import androidx.annotation.VisibleForTesting;
import androidx.paging.o00000;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35420OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00000 f35421OooO0O0;

    public o00000OO(int i, @NotNull o00000 hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f35420OooO00o = i;
        this.f35421OooO0O0 = hint;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00000OO)) {
            return false;
        }
        o00000OO o00000oo2 = (o00000OO) obj;
        return this.f35420OooO00o == o00000oo2.f35420OooO00o && Intrinsics.areEqual(this.f35421OooO0O0, o00000oo2.f35421OooO0O0);
    }

    public final int hashCode() {
        return this.f35421OooO0O0.hashCode() + (this.f35420OooO00o * 31);
    }

    @NotNull
    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f35420OooO00o + ", hint=" + this.f35421OooO0O0 + ')';
    }
}
