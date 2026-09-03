package com.squareup.okhttp;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p340o0OO0ooO.o000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f21115OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Certificate> f21116OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Certificate> f21117OooO0OO;

    public Oooo000(String str, List<Certificate> list, List<Certificate> list2) {
        this.f21115OooO00o = str;
        this.f21116OooO0O0 = list;
        this.f21117OooO0OO = list2;
    }

    public static Oooo000 OooO00o(SSLSession sSLSession) {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listOooO0o = peerCertificates != null ? o000OOo.OooO0o(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new Oooo000(cipherSuite, listOooO0o, localCertificates != null ? o000OOo.OooO0o(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        return this.f21115OooO00o.equals(oooo000.f21115OooO00o) && this.f21116OooO0O0.equals(oooo000.f21116OooO0O0) && this.f21117OooO0OO.equals(oooo000.f21117OooO0OO);
    }

    public final int hashCode() {
        return this.f21117OooO0OO.hashCode() + ((this.f21116OooO0O0.hashCode() + androidx.compose.animation.OooO0O0.OooO00o(this.f21115OooO00o, 527, 31)) * 31);
    }
}
