package com.qiniu.android.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O00000;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
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

    public oOO00O authenticator() {
        return new oOO00O() { // from class: com.qiniu.android.http.ProxyConfiguration.1
            @Override // p634o0ooO0oO.oOO00O
            public o00OOOOo authenticate(o0O00000 o0o00000, o0oOOo o0oooo) throws IOException {
                ProxyConfiguration proxyConfiguration = ProxyConfiguration.this;
                String username = proxyConfiguration.user;
                String password = proxyConfiguration.password;
                Intrinsics.checkNotNullParameter(username, "username");
                Intrinsics.checkNotNullParameter(password, "password");
                Charset charset = StandardCharsets.ISO_8859_1;
                Intrinsics.checkNotNullExpressionValue(charset, "ISO_8859_1");
                Intrinsics.checkNotNullParameter(username, "username");
                Intrinsics.checkNotNullParameter(password, "password");
                Intrinsics.checkNotNullParameter(charset, "charset");
                String str = username + ':' + password;
                ByteString byteString = ByteString.f60866OooO0oO;
                Intrinsics.checkNotNullParameter(str, "<this>");
                Intrinsics.checkNotNullParameter(charset, "charset");
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strStringPlus = Intrinsics.stringPlus("Basic ", new ByteString(bytes).OooO00o());
                o00OOOOo o00ooooo2 = o0oooo.f57342OooO0Oo;
                o00ooooo2.getClass();
                o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00ooooo2);
                oooO00o.OooO0Oo("Proxy-Authorization", strStringPlus);
                oooO00o.OooO0Oo("Proxy-Connection", "Keep-Alive");
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
