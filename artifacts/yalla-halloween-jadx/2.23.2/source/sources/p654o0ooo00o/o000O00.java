package p654o0ooo00o;

import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o0;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0OoOoOo;
import p641o0ooOO0o.o0oO0Ooo;
import p648o0ooOoo.oO000o00;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OO00o0;

/* JADX INFO: loaded from: classes5.dex */
public final class o000O00 implements o0OoOoOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O00o0 f59407OooO00o;

    public o000O00(@NotNull o0O00o0 cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f59407OooO00o = cookieJar;
    }

    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) throws IOException {
        boolean z;
        o0O00oO0 o0o00oo1;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o000O o000o = (o000O) chain;
        o0O00O0o request = o000o.f59401OooO0o0;
        request.getClass();
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o(request);
        o0oO0Ooo o0oo0ooo2 = request.f57831OooO0Oo;
        if (o0oo0ooo2 != null) {
            o0O000Oo o0o000ooContentType = o0oo0ooo2.contentType();
            if (o0o000ooContentType != null) {
                oooO00o.OooO0Oo("Content-Type", o0o000ooContentType.f57808OooO00o);
            }
            long jContentLength = o0oo0ooo2.contentLength();
            if (jContentLength != -1) {
                oooO00o.OooO0Oo("Content-Length", String.valueOf(jContentLength));
                oooO00o.OooO0oo("Transfer-Encoding");
            } else {
                oooO00o.OooO0Oo("Transfer-Encoding", "chunked");
                oooO00o.OooO0oo("Content-Length");
            }
        }
        String strOooO0O0 = request.OooO0O0("Host");
        int i = 0;
        o0O000O o0o000o = request.f57828OooO00o;
        if (strOooO0O0 == null) {
            oooO00o.OooO0Oo("Host", oO000o00.OooOo0o(o0o000o, false));
        }
        if (request.OooO0O0("Connection") == null) {
            oooO00o.OooO0Oo("Connection", "Keep-Alive");
        }
        if (request.OooO0O0("Accept-Encoding") == null && request.OooO0O0("Range") == null) {
            oooO00o.OooO0Oo("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        o0O00o0 o0o00o1 = this.f59407OooO00o;
        List<Cookie> listLoadForRequest = o0o00o1.loadForRequest(o0o000o);
        if (true ^ listLoadForRequest.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : listLoadForRequest) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Cookie cookie = (Cookie) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(cookie.name());
                sb.append('=');
                sb.append(cookie.value());
                i = i2;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            oooO00o.OooO0Oo("Cookie", string);
        }
        if (request.OooO0O0("User-Agent") == null) {
            oooO00o.OooO0Oo("User-Agent", "okhttp/4.10.0");
        }
        o0O00o00 o0o00o00OooO0OO = o000o.OooO0OO(oooO00o.OooO0O0());
        o0O000 o0o001 = o0o00o00OooO0OO.f57846OooO;
        o000OO0O.OooO0O0(o0o00o1, o0o000o, o0o001);
        o0O00o00.OooO00o oooO00o2 = new o0O00o00.OooO00o(o0o00o00OooO0OO);
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o2.f57861OooO00o = request;
        if (z && StringsKt__StringsJVMKt.equals("gzip", o0o00o00OooO0OO.OooO0OO("Content-Encoding", null), true) && o000OO0O.OooO00o(o0o00o00OooO0OO) && (o0o00oo1 = o0o00o00OooO0OO.f57852OooOO0) != null) {
            o0OO00o0 o0oo00o1 = new o0OO00o0(o0o00oo1.OooOOo());
            o0O000.OooO00o oooO00oOooO0Oo = o0o001.OooO0Oo();
            oooO00oOooO0Oo.OooO0Oo("Content-Encoding");
            oooO00oOooO0Oo.OooO0Oo("Content-Length");
            oooO00o2.OooO0OO(oooO00oOooO0Oo.OooO0OO());
            oooO00o2.f57867OooO0oO = new o000OO00(o0o00o00OooO0OO.OooO0OO("Content-Type", null), -1L, o0OO.OooO0O0(o0oo00o1));
        }
        return oooO00o2.OooO00o();
    }
}
