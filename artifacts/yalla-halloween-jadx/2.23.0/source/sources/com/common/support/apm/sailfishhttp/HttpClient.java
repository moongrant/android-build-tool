package com.common.support.apm.sailfishhttp;

import android.content.Context;
import com.common.support.apm.Constants;
import com.common.support.apm.Sailfish;
import com.common.support.apm.base.LoggerKt;
import com.common.support.apm.nlog.NLog;
import com.common.support.apm.sailfishhttp.cookie.AuthCookieJar;
import com.common.support.apm.sailfishhttp.cookie.CookieManager;
import com.common.support.apm.sailfishhttp.requestbody.ProtoRequestBody;
import com.common.support.crypto.HashKt;
import com.common.support.crypto.RSAKt;
import com.common.support.okhttpforsdk.CommonHeaderInterceptor;
import com.common.support.okhttpforsdk.CommonQueryParamsInterceptor;
import com.common.support.okhttpforsdk.Config;
import com.common.support.okhttpforsdk.HttpService;
import com.common.support.okhttpforsdk.RetryInterceptor;
import com.facebook.appevents.UserDataStore;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J%\u0010\u0007\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00040\u0002¢\u0006\u0002\b\u0006H\u0002J%\u0010\b\u001a\u001f\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0002\b\u0006H\u0002JJ\u0010\u0015\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012J1\u0010\u001b\u001a\u00020\u001a2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0016\"\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u001d2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010$R\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010$¨\u0006'"}, d2 = {"Lcom/common/support/apm/sailfishhttp/HttpClient;", "", "Lkotlin/Function1;", "Lo0ooO0oO/o00OOOOo;", "", "", "Lkotlin/ExtensionFunctionType;", "createCommonParams", "createCommonHeaders", "Landroid/content/Context;", "context", RemoteConfigConstants$RequestFieldKey.APP_ID, "appSecret", "deviceId", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "", "init", "", "hosts", "Lo0ooO0oO/o00OOO00;", "interceptor", "Lo0ooO0oO/o00OOOO0$OooO00o;", "createOkHttpClientBuilder", "([Ljava/lang/String;[Lo0ooO0oO/o00OOO00;)Lo0ooO0oO/o00OOOO0$OooO00o;", "Lo0ooO0oO/o00OOOO0;", "createOkHttpClient", "([Ljava/lang/String;)Lo0ooO0oO/o00OOOO0;", "", "SIGN_TYPE_AES", "I", "SIGN_TYPE_HMACSHA256", "Ljava/lang/String;", "<init>", "()V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class HttpClient {

    @NotNull
    public static final HttpClient INSTANCE = new HttpClient();
    private static final int SIGN_TYPE_AES = 1;
    private static final int SIGN_TYPE_HMACSHA256 = 2;
    private static String appId;
    private static String appSecret;
    private static String deviceId;

    private HttpClient() {
    }

    private final Function1<o00OOOOo, Map<String, String>> createCommonHeaders() {
        return new Function1<o00OOOOo, Map<String, ? extends String>>() { // from class: com.common.support.apm.sailfishhttp.HttpClient.createCommonHeaders.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Map<String, String> invoke(@NotNull o00OOOOo o00ooooo2) {
                Intrinsics.checkNotNullParameter(o00ooooo2, "$this$null");
                String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                String strOooOoO = "";
                String strOooOoO2 = StringsKt.OooOoO(string, "-", "");
                String strOooOoO3 = StringsKt.OooOoO(RSAKt.rsaEncrypt(strOooOoO2, NLog.INSTANCE.G(Sailfish.INSTANCE.getConfig$sailfish_release().getEnv())), "\n", "");
                try {
                    HeaderUtil headerUtil = HeaderUtil.INSTANCE;
                    if (headerUtil.isProtoRequestBody(o00ooooo2)) {
                        oo00oO oo00oo = o00ooooo2.f57316OooO0Oo;
                        if (oo00oo == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.common.support.apm.sailfishhttp.requestbody.ProtoRequestBody");
                        }
                        strOooOoO = StringsKt.OooOoO(HashKt.hmacsha256AndBase64(headerUtil.createProtoBodyByteArray((ProtoRequestBody) oo00oo), strOooOoO2), "\n", "");
                    } else {
                        strOooOoO = StringsKt.OooOoO(HashKt.hmacsha256(headerUtil.createHeaderStr(o00ooooo2), strOooOoO2), "\n", "");
                    }
                } catch (Throwable unused) {
                }
                return MapsKt.mapOf(TuplesKt.to("sk", strOooOoO3), TuplesKt.to("sn", strOooOoO), TuplesKt.to("app_id", Sailfish.appId), TuplesKt.to("app_version", Sailfish.appVersion), TuplesKt.to("app_device_id", Sailfish.deviceId), TuplesKt.to("app_user_iden", Sailfish.uniqueId), TuplesKt.to("app_namespace", Sailfish.appNameSpace), TuplesKt.to("client_type", "1"), TuplesKt.to("sdk_version", Constants.SDK_VERSION));
            }
        };
    }

    private final Function1<o00OOOOo, Map<String, Object>> createCommonParams() {
        return new Function1<o00OOOOo, Map<String, ? extends Object>>() { // from class: com.common.support.apm.sailfishhttp.HttpClient.createCommonParams.1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Map<String, Object> invoke(@NotNull o00OOOOo o00ooooo2) {
                Intrinsics.checkNotNullParameter(o00ooooo2, "$this$null");
                return MapsKt.mapOf(TuplesKt.to(UserDataStore.STATE, 2), TuplesKt.to("timestamp", String.valueOf(System.currentTimeMillis())), TuplesKt.to("nonce", UUID.randomUUID().toString()));
            }
        };
    }

    public static /* synthetic */ o00OOOO0 createOkHttpClient$default(HttpClient httpClient, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = new String[0];
        }
        return httpClient.createOkHttpClient(strArr);
    }

    public static /* synthetic */ o00OOOO0.OooO00o createOkHttpClientBuilder$default(HttpClient httpClient, String[] strArr, o00OOO00[] o00ooo00Arr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = new String[0];
        }
        return httpClient.createOkHttpClientBuilder(strArr, o00ooo00Arr);
    }

    @NotNull
    public final o00OOOO0 createOkHttpClient(@NotNull String[] hosts) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        o00OOOO0.OooO00o oooO00oCreateOkHttpClientBuilder = createOkHttpClientBuilder(hosts, new o00OOO00[0]);
        oooO00oCreateOkHttpClientBuilder.getClass();
        return new o00OOOO0(oooO00oCreateOkHttpClientBuilder);
    }

    @NotNull
    public final o00OOOO0.OooO00o createOkHttpClientBuilder(@NotNull String[] hosts, @NotNull o00OOO00... interceptor) {
        Intrinsics.checkNotNullParameter(hosts, "hosts");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        o00OOOO0 o00oooo0CreateClient = HttpService.INSTANCE.createClient();
        o00oooo0CreateClient.getClass();
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o(o00oooo0CreateClient);
        int i = 0;
        oooO00o.f57292OooO0oo = false;
        AuthCookieJar cookieJar = new AuthCookieJar();
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        Intrinsics.checkNotNullParameter(cookieJar, "<set-?>");
        oooO00o.f57293OooOO0 = cookieJar;
        oooO00o.OooO00o(new CommonQueryParamsInterceptor(INSTANCE.createCommonParams()));
        int i2 = 1;
        if (!(hosts.length == 0)) {
            oooO00o.OooO00o(new HostSwitchInterceptor(new HostProvider((String[]) Arrays.copyOf(hosts, hosts.length))));
        }
        if (!(interceptor.length == 0)) {
            int length = interceptor.length;
            int i3 = 0;
            while (i3 < length) {
                o00OOO00 o00ooo01 = interceptor[i3];
                i3++;
                oooO00o.OooO00o(o00ooo01);
            }
        }
        String str = appId;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(RemoteConfigConstants$RequestFieldKey.APP_ID);
            str = null;
        }
        String str2 = appSecret;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appSecret");
            str2 = null;
        }
        String str3 = deviceId;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deviceId");
            str3 = null;
        }
        oooO00o.OooO00o(new RedirectInterceptor(str, str2, str3));
        HttpClient httpClient = INSTANCE;
        oooO00o.OooO00o(new CommonHeaderInterceptor(httpClient.createCommonHeaders()));
        oooO00o.OooO00o(new RetryInterceptor(i, httpClient.createCommonParams(), i2, defaultConstructorMarker));
        return oooO00o;
    }

    public final void init(@NotNull Context context, @NotNull String appId2, @NotNull String appSecret2, @NotNull String deviceId2, @Nullable ExecutorService executorService, @Nullable SSLSocketFactory sslSocketFactory, @Nullable X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId2, "appId");
        Intrinsics.checkNotNullParameter(appSecret2, "appSecret");
        Intrinsics.checkNotNullParameter(deviceId2, "deviceId");
        appId = appId2;
        appSecret = appSecret2;
        deviceId = deviceId2;
        HttpService.INSTANCE.init(new Config(HttpLoggingInterceptor.Level.BODY, LoggerKt.DEFAULT_LOG_TAG, executorService, sslSocketFactory, trustManager, HttpEventListener.INSTANCE.getFactory$sailfish_release(), Sailfish.sdkLoggable));
        CookieManager.INSTANCE.init(context);
    }
}
