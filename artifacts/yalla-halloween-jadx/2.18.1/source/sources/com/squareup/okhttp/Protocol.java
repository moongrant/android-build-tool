package com.squareup.okhttp;

import java.io.IOException;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");

    private final String protocol;

    Protocol(String str) {
        this.protocol = str;
    }

    public static Protocol OooO00o(String str) throws IOException {
        Protocol protocol = HTTP_1_0;
        if (str.equals(protocol.protocol)) {
            return protocol;
        }
        Protocol protocol2 = HTTP_1_1;
        if (str.equals(protocol2.protocol)) {
            return protocol2;
        }
        Protocol protocol3 = HTTP_2;
        if (str.equals(protocol3.protocol)) {
            return protocol3;
        }
        Protocol protocol4 = SPDY_3;
        if (str.equals(protocol4.protocol)) {
            return protocol4;
        }
        throw new IOException(OooOo00.OooO0Oo("Unexpected protocol: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
