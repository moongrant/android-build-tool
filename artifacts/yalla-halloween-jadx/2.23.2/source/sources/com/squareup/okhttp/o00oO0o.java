package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f21195OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Proxy f21196OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InetSocketAddress f21197OooO0OO;

    public o00oO0o(OooO00o oooO00o, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (oooO00o == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f21195OooO00o = oooO00o;
        this.f21196OooO0O0 = proxy;
        this.f21197OooO0OO = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o00oO0o)) {
            return false;
        }
        o00oO0o o00oo0o2 = (o00oO0o) obj;
        return this.f21195OooO00o.equals(o00oo0o2.f21195OooO00o) && this.f21196OooO0O0.equals(o00oo0o2.f21196OooO0O0) && this.f21197OooO0OO.equals(o00oo0o2.f21197OooO0OO);
    }

    public final int hashCode() {
        return this.f21197OooO0OO.hashCode() + ((this.f21196OooO0O0.hashCode() + ((this.f21195OooO00o.hashCode() + 527) * 31)) * 31);
    }
}
