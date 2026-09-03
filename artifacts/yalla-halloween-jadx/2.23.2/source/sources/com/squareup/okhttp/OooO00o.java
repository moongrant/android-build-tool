package com.squareup.okhttp;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p340o0OO0ooO.o000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<Protocol> f21041OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Proxy f21042OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f21043OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f21044OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SocketFactory f21045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final HostnameVerifier f21046OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SSLSocketFactory f21047OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0O f21048OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f21049OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<OooOo00> f21050OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ProxySelector f21051OooOO0O;

    public OooO00o(String str, int i, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, OooOO0O oooOO0O, OooO0O0 oooO0O0, Proxy proxy, List<Protocol> list, List<OooOo00> list2, ProxySelector proxySelector) {
        if (str == null) {
            throw new NullPointerException("uriHost == null");
        }
        if (i <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("uriPort <= 0: ", i));
        }
        if (oooO0O0 == null) {
            throw new IllegalArgumentException("authenticator == null");
        }
        if (list == null) {
            throw new IllegalArgumentException("protocols == null");
        }
        if (proxySelector == null) {
            throw new IllegalArgumentException("proxySelector == null");
        }
        this.f21042OooO00o = proxy;
        this.f21043OooO0O0 = str;
        this.f21044OooO0OO = i;
        this.f21045OooO0Oo = socketFactory;
        this.f21047OooO0o0 = sSLSocketFactory;
        this.f21046OooO0o = hostnameVerifier;
        this.f21048OooO0oO = oooOO0O;
        this.f21049OooO0oo = oooO0O0;
        byte[] bArr = o000OOo.f42529OooO00o;
        this.f21041OooO = Collections.unmodifiableList(new ArrayList(list));
        this.f21050OooOO0 = Collections.unmodifiableList(new ArrayList(list2));
        this.f21051OooOO0O = proxySelector;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return o000OOo.OooO0Oo(this.f21042OooO00o, oooO00o.f21042OooO00o) && this.f21043OooO0O0.equals(oooO00o.f21043OooO0O0) && this.f21044OooO0OO == oooO00o.f21044OooO0OO && o000OOo.OooO0Oo(this.f21047OooO0o0, oooO00o.f21047OooO0o0) && o000OOo.OooO0Oo(this.f21046OooO0o, oooO00o.f21046OooO0o) && o000OOo.OooO0Oo(this.f21048OooO0oO, oooO00o.f21048OooO0oO) && o000OOo.OooO0Oo(this.f21049OooO0oo, oooO00o.f21049OooO0oo) && o000OOo.OooO0Oo(this.f21041OooO, oooO00o.f21041OooO) && o000OOo.OooO0Oo(this.f21050OooOO0, oooO00o.f21050OooOO0) && o000OOo.OooO0Oo(this.f21051OooOO0O, oooO00o.f21051OooOO0O);
    }

    public final int hashCode() {
        Proxy proxy = this.f21042OooO00o;
        int iOooO00o = (androidx.compose.animation.OooO0O0.OooO00o(this.f21043OooO0O0, ((proxy != null ? proxy.hashCode() : 0) + 527) * 31, 31) + this.f21044OooO0OO) * 31;
        SSLSocketFactory sSLSocketFactory = this.f21047OooO0o0;
        int iHashCode = (iOooO00o + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f21046OooO0o;
        int iHashCode2 = (iHashCode + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        OooOO0O oooOO0O = this.f21048OooO0oO;
        return this.f21051OooOO0O.hashCode() + ((this.f21050OooOO0.hashCode() + ((this.f21041OooO.hashCode() + ((this.f21049OooO0oo.hashCode() + ((iHashCode2 + (oooOO0O != null ? oooOO0O.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
