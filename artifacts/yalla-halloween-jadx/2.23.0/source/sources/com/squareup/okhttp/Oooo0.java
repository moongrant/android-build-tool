package com.squareup.okhttp;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f21585OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final List<Certificate> f21586OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final List<Certificate> f21587OooO0OO;

    public Oooo0(String str, List<Certificate> list, List<Certificate> list2) {
        this.f21585OooO00o = str;
        this.f21586OooO0O0 = list;
        this.f21587OooO0OO = list2;
    }

    public static Oooo0 OooO00o(SSLSession sSLSession) {
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
        List listOooO0o = peerCertificates != null ? p336o0OO0oo0.o000oOoO.OooO0o(peerCertificates) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new Oooo0(cipherSuite, listOooO0o, localCertificates != null ? p336o0OO0oo0.o000oOoO.OooO0o(localCertificates) : Collections.emptyList());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return this.f21585OooO00o.equals(oooo0.f21585OooO00o) && this.f21586OooO0O0.equals(oooo0.f21586OooO0O0) && this.f21587OooO0OO.equals(oooo0.f21587OooO0OO);
    }

    public final int hashCode() {
        return this.f21587OooO0OO.hashCode() + ((this.f21586OooO0O0.hashCode() + o0OO00O.OooO00o(this.f21585OooO00o, 527, 31)) * 31);
    }
}
