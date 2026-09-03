package p424o0OoO0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.json.OooO00o;
import com.yalla.yalla.model.http.ApiError;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Protocol;
import okhttp3.internal.connection.RouteException;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o0;
import p634o0ooO0oO.o00OOO0;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O0o;
import p634o0ooO0oO.o0oOOo;
import p647o0ooOooo.nc;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiExceptionInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiExceptionInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiExceptionInterceptor\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,63:1\n109#2:64\n*S KotlinDebug\n*F\n+ 1 ApiExceptionInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiExceptionInterceptor\n*L\n43#1:64\n*E\n"})
public final class o00000OO implements o00OOO00 {
    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public final o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) {
        String message;
        String str;
        o0oOOo o0ooooOooO0O0;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o00OOOOo request = ((nc) chain).f59720OooO0o0;
        try {
            o0ooooOooO0O0 = ((nc) chain).OooO0O0(request);
            str = null;
        } catch (UnknownHostException e) {
            message = e.getMessage();
            if (message == null) {
                message = "UnknownHostException";
            }
            str = message;
            o0ooooOooO0O0 = null;
        } catch (IOException e2) {
            message = e2.getMessage();
            if (message == null) {
                message = "IOException";
            }
            str = message;
            o0ooooOooO0O0 = null;
        } catch (RouteException e3) {
            message = e3.getMessage();
            if (message == null) {
                message = "RouteException";
            }
            str = message;
            o0ooooOooO0O0 = null;
        } catch (Exception e4) {
            message = e4.getMessage();
            if (message == null) {
                message = "Exception";
            }
            str = message;
            o0ooooOooO0O0 = null;
        }
        if (o0ooooOooO0O0 != null && o0ooooOooO0O0.OooO0oO()) {
            return o0ooooOooO0O0;
        }
        String message2 = "code=" + (o0ooooOooO0O0 != null ? Integer.valueOf(o0ooooOooO0O0.f57345OooO0oO) : null) + "," + str;
        String strOooO0oo = OooO00o.OooO00o().OooO0oo(new ApiError(1, message2, null, 4, null));
        if (strOooO0oo == null) {
            strOooO0oo = "";
        }
        Pattern pattern = o00OOO0.f57234OooO0o0;
        o0 o0VarOooO00o = o0O0o.OooO0O0.OooO00o(strOooO0oo, o00OOO0.OooO00o.OooO00o("text/plain; charset=utf-8"));
        o0oOOo.OooO00o oooO00o = new o0oOOo.OooO00o();
        oooO00o.f57358OooO0OO = 1;
        Protocol protocol = Protocol.HTTP_2;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        oooO00o.f57357OooO0O0 = protocol;
        oooO00o.f57362OooO0oO = o0VarOooO00o;
        Intrinsics.checkNotNullParameter(message2, "message");
        oooO00o.f57359OooO0Oo = message2;
        Intrinsics.checkNotNullParameter(request, "request");
        oooO00o.f57356OooO00o = request;
        oooO00o.f57366OooOO0o = System.currentTimeMillis();
        return oooO00o.OooO00o();
    }
}
