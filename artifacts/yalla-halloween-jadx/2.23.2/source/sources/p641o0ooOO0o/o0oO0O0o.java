package p641o0ooOO0o;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0oO0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OO00O f57962OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Proxy f57963OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final InetSocketAddress f57964OooO0OO;

    public o0oO0O0o(@NotNull o00OO00O address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f57962OooO00o = address;
        this.f57963OooO0O0 = proxy;
        this.f57964OooO0OO = socketAddress;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o0oO0O0o) {
            o0oO0O0o o0oo0o0o2 = (o0oO0O0o) obj;
            if (Intrinsics.areEqual(o0oo0o0o2.f57962OooO00o, this.f57962OooO00o) && Intrinsics.areEqual(o0oo0o0o2.f57963OooO0O0, this.f57963OooO0O0) && Intrinsics.areEqual(o0oo0o0o2.f57964OooO0OO, this.f57964OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f57964OooO0OO.hashCode() + ((this.f57963OooO0O0.hashCode() + ((this.f57962OooO00o.hashCode() + 527) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Route{" + this.f57964OooO0OO + '}';
    }
}
