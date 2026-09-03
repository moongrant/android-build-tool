package o000O00O;

import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f34664OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final androidx.paging.o00000 f34665OooO0O0;

    public oo000o(int i, @NotNull androidx.paging.o00000 hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f34664OooO00o = i;
        this.f34665OooO0O0 = hint;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo000o)) {
            return false;
        }
        oo000o oo000oVar = (oo000o) obj;
        return this.f34664OooO00o == oo000oVar.f34664OooO00o && Intrinsics.areEqual(this.f34665OooO0O0, oo000oVar.f34665OooO0O0);
    }

    public final int hashCode() {
        return this.f34665OooO0O0.hashCode() + (this.f34664OooO00o * 31);
    }

    @NotNull
    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f34664OooO00o + ", hint=" + this.f34665OooO0O0 + ')';
    }
}
