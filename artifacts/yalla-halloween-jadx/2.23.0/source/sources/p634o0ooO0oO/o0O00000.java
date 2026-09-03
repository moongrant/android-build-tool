package p634o0ooO0oO;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O00 f57326OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Proxy f57327OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final InetSocketAddress f57328OooO0OO;

    public o0O00000(@NotNull o00O00 address, @NotNull Proxy proxy, @NotNull InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.f57326OooO00o = address;
        this.f57327OooO0O0 = proxy;
        this.f57328OooO0OO = socketAddress;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof o0O00000) {
            o0O00000 o0o00000 = (o0O00000) obj;
            if (Intrinsics.areEqual(o0o00000.f57326OooO00o, this.f57326OooO00o) && Intrinsics.areEqual(o0o00000.f57327OooO0O0, this.f57327OooO0O0) && Intrinsics.areEqual(o0o00000.f57328OooO0OO, this.f57328OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f57328OooO0OO.hashCode() + ((this.f57327OooO0O0.hashCode() + ((this.f57326OooO00o.hashCode() + 527) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Route{" + this.f57328OooO0OO + '}';
    }
}
