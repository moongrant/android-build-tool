package p145o00Oo0;

import OooO00o.OooO00o;
import androidx.compose.runtime.Immutable;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o0O0ooO extends o0Oo0oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f32140OooO0O0;

    public o0O0ooO(long j) {
        this.f32140OooO0O0 = j;
    }

    @Override // p145o00Oo0.o0Oo0oo
    public final void OooO00o(long j, @NotNull o000 p, float f) {
        long jOooO0OO;
        Intrinsics.checkNotNullParameter(p, "p");
        p.OooO0O0(1.0f);
        if (f == 1.0f) {
            jOooO0OO = this.f32140OooO0O0;
        } else {
            long j2 = this.f32140OooO0O0;
            jOooO0OO = o00000O0.OooO0OO(j2, o00000O0.OooO0o0(j2) * f);
        }
        p.OooOO0(jOooO0OO);
        if (p.OooO0oO() != null) {
            p.OooO0o(null);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0O0ooO) && o00000O0.OooO0Oo(this.f32140OooO0O0, ((o0O0ooO) obj).f32140OooO0O0);
    }

    public final int hashCode() {
        long j = this.f32140OooO0O0;
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        return ULong.m686hashCodeimpl(j);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SolidColor(value=");
        sbOooO0o0.append((Object) o00000O0.OooOO0(this.f32140OooO0O0));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
