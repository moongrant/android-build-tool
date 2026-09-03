package o0000OO0;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f27509OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f27510OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f27511OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final SecureFlagPolicy f27512OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f27513OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f27514OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f27515OooO0oO;

    @ExperimentalComposeUiApi
    public oo0o0Oo(boolean z, boolean z2, boolean z3, @NotNull SecureFlagPolicy securePolicy, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this.f27509OooO00o = z;
        this.f27510OooO0O0 = z2;
        this.f27511OooO0OO = z3;
        this.f27512OooO0Oo = securePolicy;
        this.f27514OooO0o0 = z4;
        this.f27513OooO0o = z5;
        this.f27515OooO0oO = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0o0Oo)) {
            return false;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        return this.f27509OooO00o == oo0o0oo.f27509OooO00o && this.f27510OooO0O0 == oo0o0oo.f27510OooO0O0 && this.f27511OooO0OO == oo0o0oo.f27511OooO0OO && this.f27512OooO0Oo == oo0o0oo.f27512OooO0Oo && this.f27514OooO0o0 == oo0o0oo.f27514OooO0o0 && this.f27513OooO0o == oo0o0oo.f27513OooO0o && this.f27515OooO0oO == oo0o0oo.f27515OooO0oO;
    }

    public final int hashCode() {
        boolean z = this.f27510OooO0O0;
        return ((((((this.f27512OooO0Oo.hashCode() + ((((((((z ? 1231 : 1237) * 31) + (this.f27509OooO00o ? 1231 : 1237)) * 31) + (z ? 1231 : 1237)) * 31) + (this.f27511OooO0OO ? 1231 : 1237)) * 31)) * 31) + (this.f27514OooO0o0 ? 1231 : 1237)) * 31) + (this.f27513OooO0o ? 1231 : 1237)) * 31) + (this.f27515OooO0oO ? 1231 : 1237);
    }

    @ExperimentalComposeUiApi
    public oo0o0Oo() {
        this(false, true, true, SecureFlagPolicy.Inherit, true, true, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oo0o0Oo(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5 = (i & 1) != 0 ? false : z;
        boolean z6 = (i & 2) != 0 ? true : z2;
        boolean z7 = (i & 4) != 0 ? true : z3;
        SecureFlagPolicy securePolicy = (i & 8) != 0 ? SecureFlagPolicy.Inherit : null;
        boolean z8 = (i & 16) != 0 ? true : z4;
        boolean z9 = (i & 32) != 0;
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        this(z5, z6, z7, securePolicy, z8, z9, false);
    }
}
