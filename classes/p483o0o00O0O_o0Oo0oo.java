package p483o0o00O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.json.JsonUtil;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.api.old.o000oOoO;
import com.yalla.yalla.api.result.ApiError;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nApiFailInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiFailInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiFailInterceptor\n+ 2 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,33:1\n189#2:34\n*S KotlinDebug\n*F\n+ 1 ApiFailInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiFailInterceptor\n*L\n29#1:34\n*E\n"})
public final class o0Oo0oo implements Interceptor {
    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (responseProceed.isSuccessful() || Intrinsics.areEqual(request.header("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return responseProceed;
        }
        String strOooO0O0 = o000oOoO.OooO0O0(JsonUtil.f27146OooO00o, new ApiError(responseProceed.code(), responseProceed.message(), null, null, 12, null));
        if (strOooO0O0 == null) {
            strOooO0O0 = "";
        }
        return responseProceed.newBuilder().code(200).body(ResponseBody.INSTANCE.create(strOooO0O0, MediaType.INSTANCE.get("text/plain; charset=utf-8"))).build();
    }
}
