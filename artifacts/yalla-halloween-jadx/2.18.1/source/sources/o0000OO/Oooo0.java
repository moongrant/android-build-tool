package o0000OO;

import androidx.compose.runtime.Stable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Stable
public final class Oooo0 implements o0O0O00.o00O0O {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final OooOO0O f27383Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Function1<OooOO0, Unit> f27384Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Object f27385Oooo0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public Oooo0(@NotNull OooOO0O ref, @NotNull Function1<? super OooOO0, Unit> constrain) {
        Intrinsics.checkNotNullParameter(ref, "ref");
        Intrinsics.checkNotNullParameter(constrain, "constrain");
        this.f27383Oooo0o = ref;
        this.f27384Oooo0oO = constrain;
        this.f27385Oooo0oo = ref.f27364OooO00o;
    }

    @Override // o0O0O00.o00O0O
    @NotNull
    public final Object OooO00o() {
        return this.f27385Oooo0oo;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Oooo0) {
            Oooo0 oooo0 = (Oooo0) obj;
            if (Intrinsics.areEqual(this.f27383Oooo0o.f27364OooO00o, oooo0.f27383Oooo0o.f27364OooO00o) && Intrinsics.areEqual(this.f27384Oooo0oO, oooo0.f27384Oooo0oO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f27384Oooo0oO.hashCode() + (this.f27383Oooo0o.f27364OooO00o.hashCode() * 31);
    }
}
