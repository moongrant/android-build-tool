package com.qiniu.android.http;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p641o0ooOO0o.o00OO0OO;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0oO0O0o;

/* JADX INFO: loaded from: classes3.dex */
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

    public o00OO0OO authenticator() {
        return new o00OO0OO() { // from class: com.qiniu.android.http.ProxyConfiguration.1
            @Override // p641o0ooOO0o.o00OO0OO
            public o0O00O0o authenticate(o0oO0O0o o0oo0o0o2, o0O00o00 o0o00o01) throws IOException {
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
                ByteString byteString = ByteString.f60193OooO0oO;
                Intrinsics.checkNotNullParameter(str, "<this>");
                Intrinsics.checkNotNullParameter(charset, "charset");
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                String strStringPlus = Intrinsics.stringPlus("Basic ", new ByteString(bytes).OooO00o());
                o0O00O0o o0o00o0o = o0o00o01.f57847OooO0Oo;
                o0o00o0o.getClass();
                o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(o0o00o0o);
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
