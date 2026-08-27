package p483o0o00O0O;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.json.JsonUtil;
import com.code.android.util.o000000;
import com.common.support.apm.otlp.biz.entity.ErrorCode;
import com.yalla.yalla.api.old.o000oOoO;
import com.yalla.yalla.api.result.ApiError;
import com.yalla.yalla.app.startup.SailfishApm;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RouteException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nApiExceptionInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiExceptionInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiExceptionInterceptor\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,122:1\n189#2:123\n*S KotlinDebug\n*F\n+ 1 ApiExceptionInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiExceptionInterceptor\n*L\n61#1:123\n*E\n"})
public final class o0OOO0o implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) {
        String message;
        ErrorCode errorCode;
        String str;
        Response responseProceed;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        ErrorCode.CODE_SUCCESS code_success = ErrorCode.CODE_SUCCESS.INSTANCE;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        try {
            responseProceed = chain.proceed(chain.request());
            str = null;
        } catch (UnknownHostException e) {
            message = e.getMessage();
            if (message == null) {
                message = "UnknownHostException";
            }
            str = message;
            responseProceed = null;
        } catch (IOException e2) {
            if (e2 instanceof UnknownHostException) {
                errorCode = ErrorCode.CODE_ERROR1.INSTANCE;
            } else if (e2 instanceof ConnectException) {
                errorCode = ErrorCode.CODE_ERROR2.INSTANCE;
            } else {
                errorCode = (!(e2 instanceof SocketTimeoutException) && (e2 instanceof SSLException)) ? ErrorCode.CODE_ERROR20.INSTANCE : ErrorCode.CODE_ERROR20.INSTANCE;
            }
            SailfishApm.OooO0OO((int) (SystemClock.elapsedRealtime() - jElapsedRealtime), errorCode, request.url().encodedPath(), request.url().host());
            z = Intrinsics.areEqual(e2.getMessage(), "Canceled") || Intrinsics.areEqual(e2.getMessage(), "canceled");
            message = e2.getMessage();
            if (message == null) {
                message = "IOException";
            }
            str = message;
            responseProceed = null;
        } catch (RouteException e3) {
            message = e3.getMessage();
            if (message == null) {
                message = "RouteException";
            }
            str = message;
            responseProceed = null;
        } catch (Exception e4) {
            message = e4.getMessage();
            if (message == null) {
                message = "Exception";
            }
            str = message;
            responseProceed = null;
        }
        if (responseProceed != null && responseProceed.isSuccessful()) {
            return responseProceed;
        }
        String str2 = "code=" + (responseProceed != null ? Integer.valueOf(responseProceed.code()) : null) + "," + str;
        String strOooO0O0 = o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(z ? 3 : 1, str2, null, null, 12, null));
        if (strOooO0O0 == null) {
            strOooO0O0 = "";
        }
        return new Response.Builder().code(1).protocol(Protocol.HTTP_2).body(ResponseBody.INSTANCE.create(strOooO0O0, MediaType.INSTANCE.get("text/plain; charset=utf-8"))).header("domain_head_is_canceled", o000000.OooOOOO(Boolean.valueOf(z))).header("real_response_code", String.valueOf(responseProceed != null ? Integer.valueOf(responseProceed.code()) : null)).message(str2).request(chain.request()).receivedResponseAtMillis(System.currentTimeMillis()).build();
    }
}
