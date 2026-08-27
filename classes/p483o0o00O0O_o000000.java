package p483o0o00O0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.code.android.util.o00OO000;
import com.code.android.util.oo0o0Oo;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.common.support.crypto.HashKt;
import com.common.support.crypto.RSAKt;
import com.common.support.zeus.Zeus;
import com.common.support.zeus.ZeusEntity;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.common.Oooo000;
import com.yalla.yalla.util.OooO00o;
import com.yalla.yalla.util.o00Ooo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p037OoooOOO.o000OO00;
import p336o0OO0ooO.o0000O0O;
import p447o0Ooo00.OooO;
import p447o0Ooo00.OooOOO0;
import p447o0Ooo00.OooOo00;
import p471o0o000.OooOo;
import p472o0o0000o.OooOO0O;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nApiHeaderInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiHeaderInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiHeaderInterceptor\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,171:1\n216#2:172\n217#2:174\n1#3:173\n1869#4,2:175\n1869#4,2:177\n1011#4,2:179\n*S KotlinDebug\n*F\n+ 1 ApiHeaderInterceptor.kt\ncom/yalla/yalla/http/interceptor/ApiHeaderInterceptor\n*L\n65#1:172\n65#1:174\n89#1:175,2\n101#1:177,2\n157#1:179,2\n*E\n"})
public final class o000000 implements Interceptor {
    /* JADX WARN: Code duplicated, block: B:110:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x034f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x034c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x029d  */
    /* JADX WARN: Code duplicated, block: B:66:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x02d4 A[Catch: all -> 0x02d2, TryCatch #0 {all -> 0x02d2, blocks: (B:67:0x02b9, B:69:0x02bf, B:75:0x02e4, B:74:0x02d4), top: B:101:0x02b9 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0306  */
    /* JADX WARN: Code duplicated, block: B:85:0x030a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0310  */
    /* JADX WARN: Code duplicated, block: B:90:0x0322  */
    /* JADX WARN: Code duplicated, block: B:93:0x0336  */
    @Override // okhttp3.Interceptor
    @NotNull
    public final Response intercept(@NotNull Interceptor.Chain chain) {
        Request request;
        String string;
        ZeusEntity zeusEntityOooO0O0;
        Iterator<Pair<? extends String, ? extends String>> it;
        Pair<? extends String, ? extends String> next;
        Object objM7825constructorimpl;
        Throwable thM7828exceptionOrNullimpl;
        String str;
        ZeusEntity zeusEntitySignWithHmac$default;
        ArrayList arrayList;
        StringBuilder sb;
        int size;
        int i;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request2 = chain.request();
        if (Intrinsics.areEqual(request2.header("Custom"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            return chain.proceed(request2);
        }
        Request.Builder builderNewBuilder = request2.newBuilder();
        String strOooO0OO = o00Ooo.OooO0OO();
        o00Ooo.f81116OooO00o.getClass();
        String string2 = "";
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(RSAKt.rsaEncrypt(strOooO0OO, o00Ooo.OooO0O0("K1")), SignParameters.NEW_LINE, "", false, 4, (Object) null);
        String strOooO0OO2 = o00Ooo.OooO0OO();
        long jCurrentTimeMillis = OooO.f93060OooO00o + (System.currentTimeMillis() / ((long) 1000));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!StringsKt__StringsJVMKt.equals(request2.method(), "GET", true)) {
            if (StringsKt__StringsJVMKt.equals(request2.method(), "POST", true)) {
                RequestBody requestBodyBody = request2.body();
                MediaType mediaTypeContentType = requestBodyBody != null ? requestBodyBody.contentType() : null;
                if (Intrinsics.areEqual(mediaTypeContentType != null ? mediaTypeContentType.type() : null, "application") && Intrinsics.areEqual(mediaTypeContentType.subtype(), "json")) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"p", "v", "region", "userid", "token", "deviceLang", "smid"})) {
                        String strHeader = request2.header(str2);
                        if (strHeader != null) {
                            String lowerCase = str2.toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            linkedHashMap2.put(lowerCase, strHeader);
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    RequestBody requestBodyBody2 = request2.body();
                    if (requestBodyBody2 != null) {
                        okio.OooO oooO = new okio.OooO();
                        try {
                            requestBodyBody2.writeTo(oooO);
                            String strOooooO0 = oooO.OooooO0();
                            linkedHashMap.put("biz_body", HashKt.md5(strOooooO0));
                            OooOo oooOoOooO0oo = OooOO0O.OooO0oo();
                            oooOoOooO0oo.getClass();
                            request = request2;
                            builderNewBuilder.addHeader("flags", oooOoOooO0oo.OooO0oO("imId", o00OO000.OooO0OO(Oooo000.single_imId)));
                            String strMethod = request.method();
                            RequestBody.Companion companion = RequestBody.INSTANCE;
                            byte[] bytes = strOooooO0.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                            builderNewBuilder.method(strMethod, RequestBody.Companion.create$default(companion, AESKt.aesEncrypt$default(bytes, OooOO0O.OooO0oo().f93824OooO0O0, OooOO0O.OooO0oo().f93825OooO0OO, (String) null, 4, (Object) null), mediaTypeContentType, 0, 0, 6, (Object) null));
                            oooO.OooO0O0();
                        } catch (Throwable th) {
                            oooO.OooO0O0();
                            throw th;
                        }
                    }
                } else {
                    request = request2;
                    RequestBody requestBodyBody3 = request.body();
                    if (requestBodyBody3 instanceof FormBody) {
                        FormBody formBody = (FormBody) requestBodyBody3;
                        int size2 = formBody.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            linkedHashMap.put(formBody.name(i2), formBody.value(i2));
                        }
                    }
                }
            }
            if (!oo0o0Oo.OooO00o(linkedHashMap)) {
                arrayList = new ArrayList(linkedHashMap.entrySet());
                if (arrayList.size() > 1) {
                    CollectionsKt.sortWith(arrayList, new o000OOo());
                }
                sb = new StringBuilder();
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    Map.Entry entry = (Map.Entry) arrayList.get(i);
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    sb.append(str3);
                    sb.append("=");
                    sb.append(str4);
                    if (i != arrayList.size() - 1) {
                        sb.append("&");
                    }
                }
                string2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            }
            String strMd5 = HashKt.md5(string2);
            String strOooO0O0 = OooOo00.OooO0O0();
            OooOOO0.f93072OooO00o.getClass();
            int iOooO0oO = OooOOO0.OooO0oO();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strMd5);
            sb2.append("|");
            sb2.append(strOooO0O0);
            sb2.append("|");
            o000OO00.OooO00o(jCurrentTimeMillis, "|", strOooO0OO2, sb2);
            sb2.append("|");
            sb2.append(iOooO0oO);
            string = sb2.toString();
            builderNewBuilder.addHeader("Connection", "close").addHeader("bf", strReplace$default).addHeader("timestamp", String.valueOf(jCurrentTimeMillis)).addHeader("nonce", strOooO0OO2).addHeader(DeviceRequestsHelper.DEVICE_INFO_DEVICE, OooOo00.OooO0O0()).addHeader("sign", Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(string, strOooO0OO, OooO00o.f80879OooO00o, (String) null, 4, (Object) null))).addHeader("appver", OooOOO0.OooO0oo()).addHeader("x-sim-country", OooOo00.OooO0o()).addHeader("x-device-country", OooOo00.OooO00o()).addHeader("x-net-operator", OooOo00.OooO0OO());
            if (OooOOO0.OooOO0()) {
                builderNewBuilder.addHeader("Server-Env", "pre");
            }
            if (Intrinsics.areEqual(request.headers().get("atd_fast_sign"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                Intrinsics.checkNotNullParameter(string, "string");
                try {
                    Result.Companion companion2 = Result.INSTANCE;
                    str = OooOOO0.f93091OooOo00;
                    if (str != null || (zeusEntitySignWithHmac$default = Zeus.signWithHmacAndEnableShield$default(Zeus.INSTANCE, string, str, (String) null, (Long) null, (Boolean) null, 28, (Object) null)) == null) {
                        zeusEntitySignWithHmac$default = Zeus.signWithHmac$default(Zeus.INSTANCE, string, (String) null, (Long) null, (Boolean) null, 14, (Object) null);
                    }
                    objM7825constructorimpl = Result.m7825constructorimpl(zeusEntitySignWithHmac$default);
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th2));
                }
                thM7828exceptionOrNullimpl = Result.m7828exceptionOrNullimpl(objM7825constructorimpl);
                if (thM7828exceptionOrNullimpl != null) {
                    o0000O0O.OooO00o().OooO0OO(thM7828exceptionOrNullimpl);
                }
                if (Result.m7831isFailureimpl(objM7825constructorimpl)) {
                    objM7825constructorimpl = null;
                }
                zeusEntityOooO0O0 = (ZeusEntity) objM7825constructorimpl;
            } else {
                zeusEntityOooO0O0 = OooOOO0.OooO0O0(string);
            }
            if (zeusEntityOooO0O0 != null) {
                for (Map.Entry<String, String> entry2 : zeusEntityOooO0O0.headers().entrySet()) {
                    it = request.headers().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(next.getFirst(), entry2.getKey()));
                    if (next == null) {
                        builderNewBuilder.addHeader(entry2.getKey(), entry2.getValue());
                    }
                }
            }
            return chain.proceed(builderNewBuilder.build());
        }
        for (String str5 : request2.url().queryParameterNames()) {
            String strQueryParameter = request2.url().queryParameter(str5);
            if (strQueryParameter == null) {
                strQueryParameter = "";
            }
            linkedHashMap.put(str5, strQueryParameter);
        }
        request = request2;
        if (!oo0o0Oo.OooO00o(linkedHashMap)) {
            arrayList = new ArrayList(linkedHashMap.entrySet());
            if (arrayList.size() > 1) {
                CollectionsKt.sortWith(arrayList, new o000OOo());
            }
            sb = new StringBuilder();
            size = arrayList.size();
            while (i < size) {
                Map.Entry entry3 = (Map.Entry) arrayList.get(i);
                String str6 = (String) entry3.getKey();
                String str7 = (String) entry3.getValue();
                sb.append(str6);
                sb.append("=");
                sb.append(str7);
                if (i != arrayList.size() - 1) {
                    sb.append("&");
                }
            }
            string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        }
        String strMd6 = HashKt.md5(string2);
        String strOooO0O1 = OooOo00.OooO0O0();
        OooOOO0.f93072OooO00o.getClass();
        int iOooO0oO2 = OooOOO0.OooO0oO();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(strMd6);
        sb3.append("|");
        sb3.append(strOooO0O1);
        sb3.append("|");
        o000OO00.OooO00o(jCurrentTimeMillis, "|", strOooO0OO2, sb3);
        sb3.append("|");
        sb3.append(iOooO0oO2);
        string = sb3.toString();
        builderNewBuilder.addHeader("Connection", "close").addHeader("bf", strReplace$default).addHeader("timestamp", String.valueOf(jCurrentTimeMillis)).addHeader("nonce", strOooO0OO2).addHeader(DeviceRequestsHelper.DEVICE_INFO_DEVICE, OooOo00.OooO0O0()).addHeader("sign", Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(string, strOooO0OO, OooO00o.f80879OooO00o, (String) null, 4, (Object) null))).addHeader("appver", OooOOO0.OooO0oo()).addHeader("x-sim-country", OooOo00.OooO0o()).addHeader("x-device-country", OooOo00.OooO00o()).addHeader("x-net-operator", OooOo00.OooO0OO());
        if (OooOOO0.OooOO0()) {
            builderNewBuilder.addHeader("Server-Env", "pre");
        }
        if (Intrinsics.areEqual(request.headers().get("atd_fast_sign"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
            Intrinsics.checkNotNullParameter(string, "string");
            Result.Companion companion4 = Result.INSTANCE;
            str = OooOOO0.f93091OooOo00;
            if (str != null) {
                zeusEntitySignWithHmac$default = Zeus.signWithHmac$default(Zeus.INSTANCE, string, (String) null, (Long) null, (Boolean) null, 14, (Object) null);
            } else {
                zeusEntitySignWithHmac$default = Zeus.signWithHmac$default(Zeus.INSTANCE, string, (String) null, (Long) null, (Boolean) null, 14, (Object) null);
            }
            objM7825constructorimpl = Result.m7825constructorimpl(zeusEntitySignWithHmac$default);
            thM7828exceptionOrNullimpl = Result.m7828exceptionOrNullimpl(objM7825constructorimpl);
            if (thM7828exceptionOrNullimpl != null) {
                o0000O0O.OooO00o().OooO0OO(thM7828exceptionOrNullimpl);
            }
            if (Result.m7831isFailureimpl(objM7825constructorimpl)) {
                objM7825constructorimpl = null;
            }
            zeusEntityOooO0O0 = (ZeusEntity) objM7825constructorimpl;
        } else {
            zeusEntityOooO0O0 = OooOOO0.OooO0O0(string);
        }
        if (zeusEntityOooO0O0 != null) {
            while (r0.hasNext()) {
                it = request.headers().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(next.getFirst(), entry2.getKey()));
                if (next == null) {
                    builderNewBuilder.addHeader(entry2.getKey(), entry2.getValue());
                }
            }
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
