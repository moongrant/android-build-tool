package p660o0ooo0o0;

import OooO00o.OooO00o;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O f51473OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Proxy f51474OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final InetSocketAddress f51475OooO0OO;

    public o00Oo00(@NotNull o000O address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f51473OooO00o = address;
        this.f51474OooO0O0 = proxy;
        this.f51475OooO0OO = socketAddress;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o00Oo00) {
            o00Oo00 o00oo00 = (o00Oo00) obj;
            if (Intrinsics.areEqual(o00oo00.f51473OooO00o, this.f51473OooO00o) && Intrinsics.areEqual(o00oo00.f51474OooO0O0, this.f51474OooO0O0) && Intrinsics.areEqual(o00oo00.f51475OooO0OO, this.f51475OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f51475OooO0OO.hashCode() + ((this.f51474OooO0O0.hashCode() + ((this.f51473OooO00o.hashCode() + 527) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Route{");
        sbOooO0o0.append(this.f51475OooO0OO);
        sbOooO0o0.append('}');
        return sbOooO0o0.toString();
    }
}
