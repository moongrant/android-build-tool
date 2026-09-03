package p476o0o0000o;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f47569OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f47570OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f47571OooO0OO;

    public o00(int i, boolean z, boolean z2) {
        this.f47569OooO00o = i;
        this.f47570OooO0O0 = z;
        this.f47571OooO0OO = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00)) {
            return false;
        }
        o00 o00Var = (o00) obj;
        return this.f47569OooO00o == o00Var.f47569OooO00o && this.f47570OooO0O0 == o00Var.f47570OooO0O0 && this.f47571OooO0OO == o00Var.f47571OooO0OO;
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
        int i = this.f47569OooO00o * 31;
        boolean z = this.f47570OooO0O0;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z2 = this.f47571OooO0OO;
        return i2 + (z2 ? 1 : z2);
    }

    @NotNull
    public final String toString() {
        return "UpdateMoraListRefresh(moraGameTotal=" + this.f47569OooO00o + ", refresh=" + this.f47570OooO0O0 + ", noMoreData=" + this.f47571OooO0OO + ")";
    }
}
