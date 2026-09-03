package p089o000o000;

import OooO00o.OooO00o;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@VisibleForTesting
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f29058OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO0O0 f29059OooO0O0;

    public o00oO0o(int i, @NotNull o00OO0O0 hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f29058OooO00o = i;
        this.f29059OooO0O0 = hint;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00oO0o)) {
            return false;
        }
        o00oO0o o00oo0o2 = (o00oO0o) obj;
        return this.f29058OooO00o == o00oo0o2.f29058OooO00o && Intrinsics.areEqual(this.f29059OooO0O0, o00oo0o2.f29059OooO0O0);
    }

    public final int hashCode() {
        return this.f29059OooO0O0.hashCode() + (this.f29058OooO00o * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("GenerationalViewportHint(generationId=");
        sbOooO0o0.append(this.f29058OooO00o);
        sbOooO0o0.append(", hint=");
        sbOooO0o0.append(this.f29059OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
