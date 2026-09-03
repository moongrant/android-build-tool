package p482o0o000OO;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f48442OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f48443OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f48444OooO0OO;

    public o00oO0o(int i, boolean z, boolean z2) {
        this.f48442OooO00o = i;
        this.f48443OooO0O0 = z;
        this.f48444OooO0OO = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00oO0o)) {
            return false;
        }
        o00oO0o o00oo0o2 = (o00oO0o) obj;
        return this.f48442OooO00o == o00oo0o2.f48442OooO00o && this.f48443OooO0O0 == o00oo0o2.f48443OooO0O0 && this.f48444OooO0OO == o00oo0o2.f48444OooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int i = this.f48442OooO00o * 31;
        boolean z = this.f48443OooO0O0;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z2 = this.f48444OooO0OO;
        return i2 + (z2 ? 1 : z2);
    }

    @NotNull
    public final String toString() {
        return "UpdateMoraListRefresh(moraGameTotal=" + this.f48442OooO00o + ", refresh=" + this.f48443OooO0O0 + ", noMoreData=" + this.f48444OooO0OO + ")";
    }
}
