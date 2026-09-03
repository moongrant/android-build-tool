package Oooo0;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final float f520OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final p145o00Oo0.o0Oo0oo f521OooO0O0;

    public Oooo0(float f, p145o00Oo0.o0Oo0oo o0oo0oo2) {
        this.f520OooO00o = f;
        this.f521OooO0O0 = o0oo0oo2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return o0000O0O.OooOOO0.OooO00o(this.f520OooO00o, oooo0.f520OooO00o) && Intrinsics.areEqual(this.f521OooO0O0, oooo0.f521OooO0O0);
    }

    public final int hashCode() {
        return this.f521OooO0O0.hashCode() + (Float.floatToIntBits(this.f520OooO00o) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("BorderStroke(width=");
        sbOooO0o0.append((Object) o0000O0O.OooOOO0.OooO0O0(this.f520OooO00o));
        sbOooO0o0.append(", brush=");
        sbOooO0o0.append(this.f521OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
