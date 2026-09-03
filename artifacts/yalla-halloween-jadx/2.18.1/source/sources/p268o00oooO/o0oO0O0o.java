package p268o00oooO;

import com.common.support.apm.api.ApmApi;
import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p272o00oooo0.o0O0o000;
import p660o0ooo0o0.o00OO000;
import p660o0ooo0o0.o00OO00O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p666o0oooO0o.oOo00o0o;

/* JADX INFO: loaded from: classes.dex */
public final class o0oO0O0o implements o00OO00O {
    @Override // p660o0ooo0o0.o00OO00O
    @NotNull
    public final o00OOOO0 intercept(@NotNull o00OO00O.OooO00o chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        oOo00o0o ooo00o0o = (oOo00o0o) chain;
        o00OOO00 o00ooo01 = ooo00o0o.f51883OooO0o;
        Intrinsics.checkNotNullExpressionValue(o00ooo01, "chain.request()");
        o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o(o00ooo01);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "request.newBuilder()");
        o00OO000.OooO00o oooO00oOooO0o = o00ooo01.f51425OooO0O0.OooO0o();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        oooO00oOooO0o.OooO0O0("access_key", ApmApi.OooO00o.f12656OooO0Oo);
        oooO00oOooO0o.OooO0O0("sign_type", "aes");
        oooO00oOooO0o.OooO0O0("timestamp", String.valueOf(System.currentTimeMillis()));
        oooO00oOooO0o.OooO0O0(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "v1.0");
        oooO00oOooO0o.OooO0O0("nonce", string);
        String debug = Intrinsics.stringPlus("query params nonce is ", string);
        Intrinsics.checkNotNullParameter(debug, "debug");
        if (o0O0o000.f34971OooO0Oo) {
            o0O0o000.f34969OooO0O0.OooO00o(3, o0O0o000.f34970OooO0OO, debug);
        }
        o00OO000 url = oooO00oOooO0o.OooO0OO();
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f51430OooO00o = url;
        o00OOOO0 o00oooo0OooO0O0 = ooo00o0o.OooO0O0(oooO00o.OooO0O0());
        Intrinsics.checkNotNullExpressionValue(o00oooo0OooO0O0, "chain.proceed(newRequest.build())");
        return o00oooo0OooO0O0;
    }
}
