package o0OoO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.http.ApiError;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o0O000Oo;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O00oO0;
import p641o0ooOO0o.o0O0O0O;
import p641o0ooOO0o.o0OoOoOo;
import p654o0ooo00o.o000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiExceptionInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiExceptionInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiExceptionInterceptor\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,63:1\n109#2:64\n*S KotlinDebug\n*F\n+ 1 ApiExceptionInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiExceptionInterceptor\n*L\n43#1:64\n*E\n"})
public final class OooO0O0 implements o0OoOoOo {
    @Override // p641o0ooOO0o.o0OoOoOo
    @NotNull
    public final o0O00o00 intercept(@NotNull o0OoOoOo.OooO00o chain) {
        String message;
        String str;
        o0O00o00 o0o00o00OooO0OO;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o0O00O0o request = ((o000O) chain).f59401OooO0o0;
        try {
            o0o00o00OooO0OO = ((o000O) chain).OooO0OO(request);
            str = null;
        } catch (UnknownHostException e) {
            message = e.getMessage();
            if (message == null) {
                message = "UnknownHostException";
            }
            str = message;
            o0o00o00OooO0OO = null;
        } catch (IOException e2) {
            message = e2.getMessage();
            if (message == null) {
                message = "IOException";
            }
            str = message;
            o0o00o00OooO0OO = null;
        } catch (RouteException e3) {
            message = e3.getMessage();
            if (message == null) {
                message = "RouteException";
            }
            str = message;
            o0o00o00OooO0OO = null;
        } catch (Exception e4) {
            message = e4.getMessage();
            if (message == null) {
                message = "Exception";
            }
            str = message;
            o0o00o00OooO0OO = null;
        }
        if (o0o00o00OooO0OO != null && o0o00o00OooO0OO.OooO0oO()) {
            return o0o00o00OooO0OO;
        }
        String message2 = "code=" + (o0o00o00OooO0OO != null ? Integer.valueOf(o0o00o00OooO0OO.f57850OooO0oO) : null) + "," + str;
        String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(1, message2, null, 4, null));
        if (strOooO0oo == null) {
            strOooO0oo = "";
        }
        Pattern pattern = o0O000Oo.f57807OooO0o0;
        o0O0O0O o0o0o0oOooO00o = o0O00oO0.OooO0O0.OooO00o(strOooO0oo, o0O000Oo.OooO00o.OooO00o("text/plain; charset=utf-8"));
        o0O00o00.OooO00o oooO00o = new o0O00o00.OooO00o();
        oooO00o.f57863OooO0OO = 1;
        Protocol protocol = Protocol.HTTP_2;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oooO00o.f57862OooO0O0 = protocol;
        oooO00o.f57867OooO0oO = o0o0o0oOooO00o;
        Intrinsics.checkNotNullParameter(message2, "message");
        oooO00o.f57864OooO0Oo = message2;
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o.f57861OooO00o = request;
        oooO00o.f57871OooOO0o = System.currentTimeMillis();
        return oooO00o.OooO00o();
    }
}
