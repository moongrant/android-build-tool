package com.squareup.okhttp;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes4.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f21647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Proxy f21648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InetSocketAddress f21649OooO0OO;

    public o0ooOOo(OooO00o oooO00o, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (oooO00o == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f21647OooO00o = oooO00o;
        this.f21648OooO0O0 = proxy;
        this.f21649OooO0OO = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0ooOOo)) {
            return false;
        }
        o0ooOOo o0ooooo = (o0ooOOo) obj;
        return this.f21647OooO00o.equals(o0ooooo.f21647OooO00o) && this.f21648OooO0O0.equals(o0ooooo.f21648OooO0O0) && this.f21649OooO0OO.equals(o0ooooo.f21649OooO0OO);
    }

    public final int hashCode() {
        return this.f21649OooO0OO.hashCode() + ((this.f21648OooO0O0.hashCode() + ((this.f21647OooO00o.hashCode() + 527) * 31)) * 31);
    }
}
