package p418o0Oo0oo;

import OooO00o.OooO00o;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f39727OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39728OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39729OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39730OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39731OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f39732OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f39733OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f39734OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final List<OooOo00> f39735OooO0oo;

    public o0O0O00(long j, long j2, long j3, long j4, boolean z, int i, boolean z2, List list, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this.f39728OooO00o = j;
        this.f39729OooO0O0 = j2;
        this.f39730OooO0OO = j3;
        this.f39731OooO0Oo = j4;
        this.f39733OooO0o0 = z;
        this.f39732OooO0o = i;
        this.f39734OooO0oO = z2;
        this.f39735OooO0oo = list;
        this.f39727OooO = j5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O0O00)) {
            return false;
        }
        o0O0O00 o0o0o00 = (o0O0O00) obj;
        if (o0OOO0o.OooO00o(this.f39728OooO00o, o0o0o00.f39728OooO00o) && this.f39729OooO0O0 == o0o0o00.f39729OooO0O0 && OooO.OooO00o(this.f39730OooO0OO, o0o0o00.f39730OooO0OO) && OooO.OooO00o(this.f39731OooO0Oo, o0o0o00.f39731OooO0Oo) && this.f39733OooO0o0 == o0o0o00.f39733OooO0o0) {
            return (this.f39732OooO0o == o0o0o00.f39732OooO0o) && this.f39734OooO0oO == o0o0o00.f39734OooO0oO && Intrinsics.areEqual(this.f39735OooO0oo, o0o0o00.f39735OooO0oo) && OooO.OooO00o(this.f39727OooO, o0o0o00.f39727OooO);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final int hashCode() {
        long j = this.f39728OooO00o;
        long j2 = this.f39729OooO0O0;
        int iOooO0o0 = (OooO.OooO0o0(this.f39731OooO0Oo) + ((OooO.OooO0o0(this.f39730OooO0OO) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31;
        boolean z = this.f39733OooO0o0;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (((iOooO0o0 + r0) * 31) + this.f39732OooO0o) * 31;
        boolean z2 = this.f39734OooO0oO;
        return OooO.OooO0o0(this.f39727OooO) + ((this.f39735OooO0oo.hashCode() + ((i + (z2 ? 1 : z2)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("PointerInputEventData(id=");
        sbOooO0o0.append((Object) o0OOO0o.OooO0O0(this.f39728OooO00o));
        sbOooO0o0.append(", uptime=");
        sbOooO0o0.append(this.f39729OooO0O0);
        sbOooO0o0.append(", positionOnScreen=");
        sbOooO0o0.append((Object) OooO.OooO(this.f39730OooO0OO));
        sbOooO0o0.append(", position=");
        sbOooO0o0.append((Object) OooO.OooO(this.f39731OooO0Oo));
        sbOooO0o0.append(", down=");
        sbOooO0o0.append(this.f39733OooO0o0);
        sbOooO0o0.append(", type=");
        sbOooO0o0.append((Object) o0000O00.OooO00o(this.f39732OooO0o));
        sbOooO0o0.append(", issuesEnterExit=");
        sbOooO0o0.append(this.f39734OooO0oO);
        sbOooO0o0.append(", historical=");
        sbOooO0o0.append(this.f39735OooO0oo);
        sbOooO0o0.append(", scrollDelta=");
        sbOooO0o0.append((Object) OooO.OooO(this.f39727OooO));
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
