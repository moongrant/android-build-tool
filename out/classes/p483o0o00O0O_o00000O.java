package p483o0o00O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.common.support.crypto.AESKt;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.api.result.ApiError;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p247o00oo0oO.o000OO0O;
import p472o0o0000o.OooOO0O;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public final class o00000O implements Interceptor {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Charset f94096OooO00o = Charsets.UTF_8;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MediaType f94097OooO0O0 = MediaType.INSTANCE.get("text/plain; charset=utf-8");

    public static final class OooO00o {
        @NotNull
        public static String OooO00o(@NotNull String string, boolean z) throws JSONException {
            Intrinsics.checkNotNullParameter(string, "string");
            JSONObject jSONObject = new JSONObject(string);
            JSONObject jSONObject2 = new JSONObject();
            if (!jSONObject.has("page")) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (StringsKt__StringsJVMKt.equals(next, "pageindex", true) || StringsKt__StringsJVMKt.equals(next, "index", true) || StringsKt__StringsJVMKt.equals(next, "pagesize", true) || StringsKt__StringsJVMKt.equals(next, "datasort", true)) {
                        jSONObject2.put(next, jSONObject.get(next));
                        itKeys.remove();
                    }
                }
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("page", jSONObject2);
            }
            if (!Intrinsics.areEqual(jSONObject.get("code"), "1000") && !Intrinsics.areEqual(jSONObject.get("code"), (Object) 1000)) {
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject.has("data")) {
                    jSONObject3.put("data", jSONObject.get("data"));
                    jSONObject.remove("data");
                }
                if (jSONObject.has(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)) {
                    jSONObject3.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.get(ShareConstants.WEB_DIALOG_PARAM_MESSAGE));
                }
                Iterator<String> itKeys2 = jSONObject.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!Intrinsics.areEqual(next2, "code") && !Intrinsics.areEqual(next2, "page") && !Intrinsics.areEqual(next2, "errMessage")) {
                        jSONObject3.put(next2, jSONObject.get(next2));
                        itKeys2.remove();
                    }
                }
                if (jSONObject3.length() > 0) {
                    jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "\"" + jSONObject3 + "\"");
                }
            } else if (z) {
                JSONObject jSONObject4 = new JSONObject();
                Iterator<String> itKeys3 = jSONObject.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    if (!Intrinsics.areEqual(next3, "code") && !Intrinsics.areEqual(next3, ShareConstants.WEB_DIALOG_PARAM_MESSAGE) && !Intrinsics.areEqual(next3, "page")) {
                        jSONObject4.put(next3, jSONObject.get(next3));
                        itKeys3.remove();
                    }
                }
                if (jSONObject4.length() > 0) {
                    jSONObject.put("data", jSONObject4);
                }
            }
            String string2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        ResponseBody responseBodyBody;
        MediaType mediaTypeContentType;
        String strSubtype;
        String strString;
        RequestBody requestBodyBody;
        MediaType mediaTypeContentType2;
        String strHeader$default;
        byte[] bArrBytes;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        if (Intrinsics.areEqual(request.header("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE) || (responseBodyBody = responseProceed.body()) == null || (mediaTypeContentType = responseBodyBody.contentType()) == null || (strSubtype = mediaTypeContentType.subtype()) == null) {
            return responseProceed;
        }
        if (!StringsKt__StringsKt.contains$default(strSubtype, "json", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strSubtype, "xml", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strSubtype, "plain", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default(strSubtype, "html", false, 2, (Object) null)) {
            return responseProceed;
        }
        String strHeader = request.header("AbortDataCheck");
        if (strHeader != null && Boolean.parseBoolean(strHeader)) {
            return responseProceed;
        }
        boolean zEquals = StringsKt__StringsJVMKt.equals(request.method(), "POST", true);
        MediaType mediaType = f94097OooO0O0;
        if (!zEquals || (requestBodyBody = request.body()) == null || (mediaTypeContentType2 = requestBodyBody.contentType()) == null || !Intrinsics.areEqual(mediaTypeContentType2.type(), "application") || !Intrinsics.areEqual(mediaTypeContentType2.subtype(), "json") || (strHeader$default = Response.header$default(responseProceed, "flags", null, 2, null)) == null || strHeader$default.length() == 0) {
            ResponseBody responseBodyBody2 = responseProceed.body();
            if (responseBodyBody2 == null || (strString = responseBodyBody2.string()) == null) {
                strString = "";
            }
            String strHeader2 = request.header("Abnormal");
            return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(OooO00o.OooO00o(strString, strHeader2 != null ? Boolean.parseBoolean(strHeader2) : false), mediaType)).build();
        }
        try {
            ResponseBody responseBodyBody3 = responseProceed.body();
            if (responseBodyBody3 == null || (bArrBytes = responseBodyBody3.bytes()) == null) {
                bArrBytes = new byte[0];
            }
            String str = new String(AESKt.aesDecrypt$default(bArrBytes, OooOO0O.OooO0oo().f93824OooO0O0, OooOO0O.OooO0oo().f93825OooO0OO, (String) null, 4, (Object) null), f94096OooO00o);
            String strHeader3 = request.header("Abnormal");
            return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(OooO00o.OooO00o(str, strHeader3 != null ? Boolean.parseBoolean(strHeader3) : false), mediaType)).build();
        } catch (Exception e) {
            e.printStackTrace();
            return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(o000OO0O.OooO00o(new ApiError(1, "data error", null, null, 12, null)), mediaType)).build();
        }
    }
}
