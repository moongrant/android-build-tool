package p119o00O0Oo0;

import OooO00o.OooO00o;
import Oooo000.Oooo0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f30756OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f30757OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f30758OooO0OO;

    public o0Oo0oo() {
        this(false, false, false, 7, null);
    }

    public o0Oo0oo(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.f30756OooO00o = true;
        this.f30757OooO0O0 = true;
        this.f30758OooO0OO = true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0Oo0oo)) {
            return false;
        }
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj;
        return this.f30756OooO00o == o0oo0oo2.f30756OooO00o && this.f30757OooO0O0 == o0oo0oo2.f30757OooO0O0 && this.f30758OooO0OO == o0oo0oo2.f30758OooO0OO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        boolean z = this.f30756OooO00o;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f30757OooO0O0;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.f30758OooO0OO;
        return i2 + (z3 ? 1 : z3);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("ImageLoaderOptions(addLastModifiedToFileCacheKey=");
        sbOooO0o0.append(this.f30756OooO00o);
        sbOooO0o0.append(", launchInterceptorChainOnMainThread=");
        sbOooO0o0.append(this.f30757OooO0O0);
        sbOooO0o0.append(", networkObserverEnabled=");
        return Oooo0.OooO0O0(sbOooO0o0, this.f30758OooO0OO, ')');
    }
}
