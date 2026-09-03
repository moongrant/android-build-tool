package o0000OO0;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f27494OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f27495OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final SecureFlagPolicy f27496OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f27497OooO0Oo;

    @ExperimentalComposeUiApi
    public o00O0O() {
        this(false, false, 15);
    }

    public o00O0O(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        SecureFlagPolicy securePolicy = (i & 4) != 0 ? SecureFlagPolicy.Inherit : null;
        boolean z3 = (i & 8) != 0;
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.f27494OooO00o = z;
        this.f27495OooO0O0 = z2;
        this.f27496OooO0OO = securePolicy;
        this.f27497OooO0Oo = z3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00O0O)) {
            return false;
        }
        o00O0O o00o0o2 = (o00O0O) obj;
        return this.f27494OooO00o == o00o0o2.f27494OooO00o && this.f27495OooO0O0 == o00o0o2.f27495OooO0O0 && this.f27496OooO0OO == o00o0o2.f27496OooO0OO && this.f27497OooO0Oo == o00o0o2.f27497OooO0Oo;
    }

    public final int hashCode() {
        return ((this.f27496OooO0OO.hashCode() + ((((this.f27494OooO00o ? 1231 : 1237) * 31) + (this.f27495OooO0O0 ? 1231 : 1237)) * 31)) * 31) + (this.f27497OooO0Oo ? 1231 : 1237);
    }

    public o00O0O(boolean z, boolean z2, SecureFlagPolicy secureFlagPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        SecureFlagPolicy securePolicy = SecureFlagPolicy.Inherit;
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.f27494OooO00o = true;
        this.f27495OooO0O0 = true;
        this.f27496OooO0OO = securePolicy;
        this.f27497OooO0Oo = true;
    }
}
