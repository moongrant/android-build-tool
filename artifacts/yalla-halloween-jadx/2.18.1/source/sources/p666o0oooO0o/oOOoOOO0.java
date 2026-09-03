package p666o0oooO0o;

import com.efs.sdk.base.Constants;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00O;
import p660o0ooo0o0.o00O0;
import p660o0ooo0o0.o00O00o0;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OO0O0;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00OOOOo;
import p660o0ooo0o0.o0o0Oo;
import p674o0oooo0.o0O000;
import p674o0oooo0.o0O000Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOoOOO0 implements o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0 f51873OooO00o;

    public oOOoOOO0(@NotNull o00O0 cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f51873OooO00o = cookieJar;
    }

    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o chain) throws IOException {
        boolean z;
        o00OOOOo o00ooooo2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        oOo00o0o ooo00o0o = (oOo00o0o) chain;
        o00OOO00 request = ooo00o0o.f51883OooO0o;
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o(request);
        o0o0Oo o0o0oo = request.f51429OooO0o0;
        if (o0o0oo != null) {
            o00OO0O0 o00oo0o0ContentType = o0o0oo.contentType();
            if (o00oo0o0ContentType != null) {
                oooO00o.OooO0o0("Content-Type", o00oo0o0ContentType.f51402OooO00o);
            }
            long jContentLength = o0o0oo.contentLength();
            if (jContentLength != -1) {
                oooO00o.OooO0o0("Content-Length", String.valueOf(jContentLength));
                oooO00o.OooO("Transfer-Encoding");
            } else {
                oooO00o.OooO0o0("Transfer-Encoding", "chunked");
                oooO00o.OooO("Content-Length");
            }
        }
        int i = 0;
        if (request.OooO0O0("Host") == null) {
            oooO00o.OooO0o0("Host", p659o0ooo0o.o00OOO00.OooOoO0(request.f51425OooO0O0, false));
        }
        if (request.OooO0O0("Connection") == null) {
            oooO00o.OooO0o0("Connection", "Keep-Alive");
        }
        if (request.OooO0O0("Accept-Encoding") == null && request.OooO0O0("Range") == null) {
            oooO00o.OooO0o0("Accept-Encoding", Constants.CP_GZIP);
            z = true;
        } else {
            z = false;
        }
        List<o00O00o0> listOooO0O0 = this.f51873OooO00o.OooO0O0(request.f51425OooO0O0);
        if (true ^ listOooO0O0.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : listOooO0O0) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                o00O00o0 o00o00o1 = (o00O00o0) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(o00o00o1.f51296OooO00o);
                sb.append('=');
                sb.append(o00o00o1.f51297OooO0O0);
                i = i2;
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            oooO00o.OooO0o0("Cookie", string);
        }
        if (request.OooO0O0("User-Agent") == null) {
            oooO00o.OooO0o0("User-Agent", "okhttp/4.9.3");
        }
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(oooO00o.OooO0O0());
        oO00o00O.OooO0O0(this.f51873OooO00o, request.f51425OooO0O0, o00oooo0OooO0O0.f51444OoooO0O);
        o00OOOO0.OooO00o oooO00o2 = new o00OOOO0.OooO00o(o00oooo0OooO0O0);
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o2.f51452OooO00o = request;
        if (z && StringsKt.OooO(Constants.CP_GZIP, o00oooo0OooO0O0.OooO0O0("Content-Encoding", null)) && oO00o00O.OooO00o(o00oooo0OooO0O0) && (o00ooooo2 = o00oooo0OooO0O0.f51441OoooO) != null) {
            o0O000 o0o001 = new o0O000(o00ooooo2.OooO0oo());
            o00O.OooO00o oooO00oOooO0OO = o00oooo0OooO0O0.f51444OoooO0O.OooO0OO();
            oooO00oOooO0OO.OooO0o("Content-Encoding");
            oooO00oOooO0OO.OooO0o("Content-Length");
            oooO00o2.OooO0Oo(oooO00oOooO0OO.OooO0Oo());
            oooO00o2.f51458OooO0oO = new oOo00ooO(o00oooo0OooO0O0.OooO0O0("Content-Type", null), -1L, o0O000Oo.OooO0OO(o0o001));
        }
        return oooO00o2.OooO00o();
    }
}
