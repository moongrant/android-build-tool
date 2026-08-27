package p483o0o00O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.OooO;
import okio.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f94099OooO00o = Charset.forName("UTF-8");

    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) throws JSONException, IOException {
        String strHeader;
        String strO0000oO0;
        MediaType mediaTypeContentType;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (Intrinsics.areEqual(request.header("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return responseProceed;
        }
        ResponseBody responseBodyBody = responseProceed.body();
        String strSubtype = (responseBodyBody == null || (mediaTypeContentType = responseBodyBody.contentType()) == null) ? null : mediaTypeContentType.subtype();
        if (strSubtype != null && ((StringsKt__StringsKt.contains$default(strSubtype, "json", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strSubtype, "xml", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strSubtype, "plain", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strSubtype, "html", false, 2, (Object) null)) && ((strHeader = request.header("AbortDataCheck")) == null || !Boolean.parseBoolean(strHeader)))) {
            ResponseBody responseBodyBody2 = responseProceed.body();
            if (responseBodyBody2 == null) {
                strO0000oO0 = "";
            } else {
                Intrinsics.checkNotNull(responseBodyBody2);
                OooOOO0 oooOOO0Source = responseBodyBody2.source();
                oooOOO0Source.request(Long.MAX_VALUE);
                OooO oooOClone = oooOOO0Source.OooO00o().clone();
                Charset charset = this.f94099OooO00o;
                Intrinsics.checkNotNullExpressionValue(charset, "charset");
                strO0000oO0 = oooOClone.o0000oO0(charset);
            }
            JSONObject jSONObject = new JSONObject(strO0000oO0);
            if (jSONObject.has("code")) {
                Object obj = jSONObject.get("code");
                if (Intrinsics.areEqual(obj, "101") || Intrinsics.areEqual(obj, "3000")) {
                    request.url().getUrl();
                    int size = request.headers().size();
                    for (int i = 0; i < size; i++) {
                        request.headers().name(i);
                        request.headers().value(i);
                    }
                    "\nResponse = ".concat(strO0000oO0);
                }
            }
        }
        return responseProceed;
    }
}
