package p647o0ooOooo;

import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Cookie;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00O0OOO;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00oO;
import p634o0ooO0oO.oo0O;
import p635o0ooO0oo.o0O000o0;
import p659o0oooO00.o000O000;
import p659o0oooO00.o000O0Oo;

/* JADX INFO: loaded from: classes5.dex */
public final class hc implements o00OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0OOO f59709OooO00o;

    public hc(@NotNull o00O0OOO cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f59709OooO00o = cookieJar;
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        boolean z;
        o0O0o o0o0o;
        Intrinsics.checkNotNullParameter(chain, "chain");
        nc ncVar = (nc) chain;
        o00OOOOo request = ncVar.f59720OooO0o0;
        request.getClass();
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(request);
        oo00oO oo00oo = request.f57316OooO0Oo;
        if (oo00oo != null) {
            o00OOO0 o00ooo0ContentType = oo00oo.contentType();
            if (o00ooo0ContentType != null) {
                oooO00o.OooO0Oo("Content-Type", o00ooo0ContentType.f57235OooO00o);
            }
            long jContentLength = oo00oo.contentLength();
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
        o00OO o00oo2 = request.f57313OooO00o;
        if (strOooO0O0 == null) {
            oooO00o.OooO0Oo("Host", o0O000o0.OooOo0o(o00oo2, false));
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
        o00O0OOO o00o0ooo2 = this.f59709OooO00o;
        List<Cookie> listLoadForRequest = o00o0ooo2.loadForRequest(o00oo2);
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
        o0oOOo o0ooooOooO0O0 = ncVar.OooO0O0(oooO00o.OooO0O0());
        oo0O oo0o = o0ooooOooO0O0.f57341OooO;
        lc.OooO0O0(o00o0ooo2, o00oo2, oo0o);
        o0oOOo.OooO00o oooO00o2 = new o0oOOo.OooO00o(o0ooooOooO0O0);
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o2.f57356OooO00o = request;
        if (z && StringsKt.OooOO0o("gzip", o0ooooOooO0O0.OooO0OO("Content-Encoding", null)) && lc.OooO00o(o0ooooOooO0O0) && (o0o0o = o0ooooOooO0O0.f57347OooOO0) != null) {
            o000O000 o000o001 = new o000O000(o0o0o.OooOOo0());
            oo0O.OooO00o oooO00oOooO0Oo = oo0o.OooO0Oo();
            oooO00oOooO0Oo.OooO0Oo("Content-Encoding");
            oooO00oOooO0Oo.OooO0Oo("Content-Length");
            oooO00o2.OooO0OO(oooO00oOooO0Oo.OooO0OO());
            oooO00o2.f57362OooO0oO = new oc(o0ooooOooO0O0.OooO0OO("Content-Type", null), -1L, o000O0Oo.OooO0O0(o000o001));
        }
        return oooO00o2.OooO00o();
    }
}
