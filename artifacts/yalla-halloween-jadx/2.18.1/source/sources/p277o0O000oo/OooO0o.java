package p277o0O000oo;

import OooO00o.OooO00o;
import com.common.support.networkstate.NetworkType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f35100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NetworkType f35101OooO0O0;

    public OooO0o() {
        NetworkType networkType = NetworkType.NETWORK_NONE;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        this.f35100OooO00o = false;
        this.f35101OooO0O0 = networkType;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return this.f35100OooO00o == oooO0o.f35100OooO00o && this.f35101OooO0O0 == oooO0o.f35101OooO0O0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final int hashCode() {
        boolean z = this.f35100OooO00o;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.f35101OooO0O0.hashCode() + (r0 * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("NetworkState(isConnected=");
        sbOooO0o0.append(this.f35100OooO00o);
        sbOooO0o0.append(", networkType=");
        sbOooO0o0.append(this.f35101OooO0O0);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public OooO0o(@NotNull NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        this.f35100OooO00o = true;
        this.f35101OooO0O0 = networkType;
    }
}
