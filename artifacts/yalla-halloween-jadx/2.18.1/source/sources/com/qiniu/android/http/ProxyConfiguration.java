package com.qiniu.android.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import p660o0ooo0o0.o000OOo0;
import p660o0ooo0o0.o00O0O00;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00Oo00;

/* JADX INFO: loaded from: classes2.dex */
public final class ProxyConfiguration {
    public final String hostAddress;
    public final String password;
    public final int port;
    public final Proxy.Type type;
    public final String user;

    public ProxyConfiguration(String str, int i, String str2, String str3, Proxy.Type type) {
        this.hostAddress = str;
        this.port = i;
        this.user = str2;
        this.password = str3;
        this.type = type;
    }

    public o000OOo0 authenticator() {
        return new o000OOo0() { // from class: com.qiniu.android.http.ProxyConfiguration.1
            @Override // p660o0ooo0o0.o000OOo0
            public o00OOO00 authenticate(o00Oo00 o00oo00, o00OOOO0 o00oooo1) throws IOException {
                ProxyConfiguration proxyConfiguration = ProxyConfiguration.this;
                String str = proxyConfiguration.user;
                String str2 = proxyConfiguration.password;
                Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
                Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
                String strOooO00o = o00O0O00.OooO00o(str, str2, ISO_8859_1);
                o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o(o00oooo1.f51439Oooo0oO);
                oooO00o.OooO0o0("Proxy-Authorization", strOooO00o);
                oooO00o.OooO0o0("Proxy-Connection", "Keep-Alive");
                return oooO00o.OooO0O0();
            }
        };
    }

    public Proxy proxy() {
        return new Proxy(this.type, new InetSocketAddress(this.hostAddress, this.port));
    }

    public ProxyConfiguration(String str, int i) {
        this(str, i, null, null, Proxy.Type.HTTP);
    }
}
