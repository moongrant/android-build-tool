package com.squareup.okhttp;

import org.conscrypt.NativeCrypto;

/* JADX INFO: loaded from: classes2.dex */
public enum TlsVersion {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0(NativeCrypto.OBSOLETE_PROTOCOL_SSLV3);

    public final String javaName;

    TlsVersion(String str) {
        this.javaName = str;
    }
}
