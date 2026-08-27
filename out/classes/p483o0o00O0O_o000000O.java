package p483o0o00O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.code.android.json.JsonUtil;
import com.yalla.yalla.util.log.OooOO0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.OooO;
import okio.OooOOO0;
import org.jetbrains.annotations.NotNull;
import p014OooOo0O.Oooo000;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nApiLogInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiLogInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiLogInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1869#2,2:105\n*S KotlinDebug\n*F\n+ 1 ApiLogInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiLogInterceptor\n*L\n65#1:105,2\n*E\n"})
public final class o000000O implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Charset f94094OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f94095OooO0O0;

    public o000000O() {
        Intrinsics.checkNotNullParameter("WebApi", "logTag");
        this.f94094OooO00o = Charset.forName("UTF-8");
        String property = System.getProperty("line.separator");
        this.f94095OooO0O0 = property == null ? SignParameters.NEW_LINE : property;
    }

    public final String OooO00o(ResponseBody responseBody) throws IOException {
        if (responseBody == null) {
            return "";
        }
        Intrinsics.checkNotNull(responseBody);
        OooOOO0 oooOOO0Source = responseBody.source();
        oooOOO0Source.request(Long.MAX_VALUE);
        OooO oooOClone = oooOOO0Source.OooO00o().clone();
        Charset charset = this.f94094OooO00o;
        Intrinsics.checkNotNullExpressionValue(charset, "charset");
        return oooOClone.o0000oO0(charset);
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        String strOooO0O0;
        MediaType mediaTypeContentType;
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (p447o0Ooo00.OooOOO0.OooOO0O()) {
            return chain.proceed(chain.request());
        }
        Request request = chain.request();
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(" WebAPI ->\n╔═发起请求════════════════════════════════════════════════════════════════════════════\n");
        sb.append("  URL: " + request.url() + SignParameters.NEW_LINE);
        sb.append("  Method: " + request.method() + SignParameters.NEW_LINE);
        if (request.body() != null) {
            try {
                Request requestBuild = request.newBuilder().build();
                OooO oooO = new OooO();
                if (requestBuild.body() == null) {
                    strOooO0O0 = "";
                } else {
                    RequestBody requestBodyBody = requestBuild.body();
                    if (requestBodyBody != null) {
                        requestBodyBody.writeTo(oooO);
                    }
                    JsonUtil jsonUtil = JsonUtil.f27146OooO00o;
                    String strOooooO0 = oooO.OooooO0();
                    jsonUtil.getClass();
                    strOooO0O0 = JsonUtil.OooO00o(strOooooO0);
                }
            } catch (IOException e) {
                strOooO0O0 = Oooo000.OooO0O0("{\"err\": \"", e.getMessage(), "\"}");
            }
            sb.append("  RequestBody: " + strOooO0O0 + SignParameters.NEW_LINE);
        }
        sb.append("╚═══════════════════════════════════════════════════════════════════════════════════");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        OooOO0.OooO0OO("WebApi", string);
        Response responseProceed = chain.proceed(request);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        StringBuilder sb2 = new StringBuilder(" WebAPI ->\n╔═接收响应═══════════════════════════════════════════════════════════════════════════\n");
        sb2.append("  URL: " + request.url() + SignParameters.NEW_LINE);
        sb2.append("  is success : " + responseProceed.isSuccessful() + " - Received in: " + jCurrentTimeMillis2 + "ms\n");
        int iCode = responseProceed.code();
        StringBuilder sb3 = new StringBuilder("  Status Code: ");
        sb3.append(iCode);
        sb3.append(SignParameters.NEW_LINE);
        sb2.append(sb3.toString());
        if (responseProceed.isSuccessful()) {
            sb2.append("  Body:\n");
            ResponseBody responseBodyBody = responseProceed.body();
            String strSubtype = (responseBodyBody == null || (mediaTypeContentType = responseBodyBody.contentType()) == null) ? null : mediaTypeContentType.subtype();
            if (strSubtype == null || !(StringsKt__StringsKt.contains$default(strSubtype, "json", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strSubtype, "xml", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strSubtype, "plain", false, 2, (Object) null) || StringsKt__StringsKt.contains$default(strSubtype, "html", false, 2, (Object) null))) {
                sb2.append("  body is file");
            } else {
                String strOooO00o = OooO00o(responseProceed.body());
                JsonUtil.f27146OooO00o.getClass();
                Iterator<T> it = new Regex(this.f94095OooO0O0).split(JsonUtil.OooO00o(strOooO00o), 0).iterator();
                while (it.hasNext()) {
                    sb2.append("  " + ((String) it.next()) + SignParameters.NEW_LINE);
                }
                Unit unit = Unit.INSTANCE;
            }
        } else {
            sb2.append("  error:" + OooO00o(responseProceed.body()) + SignParameters.NEW_LINE);
        }
        sb2.append("╚═══════════════════════════════════════════════════════════════════════════════════");
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        OooOO0.OooO0OO("WebApi", string2);
        return responseProceed;
    }
}
