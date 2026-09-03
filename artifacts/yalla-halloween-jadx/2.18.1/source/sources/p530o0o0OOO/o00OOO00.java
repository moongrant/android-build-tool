package p530o0o0OOO;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f43383OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f43384OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f43385OooO0OO;

    public o00OOO00(int i, boolean z, boolean z2) {
        this.f43383OooO00o = i;
        this.f43384OooO0O0 = z;
        this.f43385OooO0OO = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00OOO00)) {
            return false;
        }
        o00OOO00 o00ooo01 = (o00OOO00) obj;
        return this.f43383OooO00o == o00ooo01.f43383OooO00o && this.f43384OooO0O0 == o00ooo01.f43384OooO0O0 && this.f43385OooO0OO == o00ooo01.f43385OooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final int hashCode() {
        int i = this.f43383OooO00o * 31;
        boolean z = this.f43384OooO0O0;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (i + r1) * 31;
        boolean z2 = this.f43385OooO0OO;
        return i2 + (z2 ? 1 : z2);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("UpdateMoraListRefresh(moraGameTotal=");
        sbOooO0o0.append(this.f43383OooO00o);
        sbOooO0o0.append(", refresh=");
        sbOooO0o0.append(this.f43384OooO0O0);
        sbOooO0o0.append(", noMoreData=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f43385OooO0OO, ')');
    }
}
