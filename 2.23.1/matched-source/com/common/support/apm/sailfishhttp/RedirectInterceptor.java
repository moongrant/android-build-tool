package com.common.support.apm.sailfishhttp;

import com.common.support.apm.base.LoggerKt;
import com.common.support.okhttpforsdk.RequestUtil;
import com.facebook.internal.ServerProtocol;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p640o0ooO0oo.o0OOOO00;
import p640o0ooO0oo.o0OOOO0o;
import p640o0ooO0oo.oO0000Oo;
import p640o0ooO0oo.ooo0Oo0;
import p643o0ooOO0O.o00OO0O0;
import p655o0ooo000.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\n\u001a\b\u0018\u00010\tR\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u000b\u001a\u00060\tR\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0002J\"\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/common/support/apm/sailfishhttp/RedirectInterceptor;", "Lo0ooO0oo/o0OOOO0o;", "Lo0ooO0oo/ooo0Oo0;", "originalRequest", "Lo0ooO0oo/oO0000Oo;", "response", "Lo0ooO0oo/o0OOOO0o$OooO00o;", "chain", "toAuthIfNeeded", "Lcom/common/support/apm/sailfishhttp/RedirectInterceptor$RedirectParams;", "parseRedirectParamsFromResponse", "redirectParams", "userResponse", "tryBuildAuthRequest", "", "isRedirectedToAuth", "buildRedirectRequest", "Lo0ooO0oo/o0OOOO00;", "getLocationUrlFromResponse", "f", "s", "compareUrl", "intercept", "", RemoteConfigConstants$RequestFieldKey.APP_ID, "Ljava/lang/String;", "appSecret", "deviceId", "Ljava/util/concurrent/locks/ReentrantLock;", "authorizingLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "RedirectParams", "sailfish_release"}, k = 1, mv = {1, 7, 1})
public final class RedirectInterceptor implements o0OOOO0o {

    @NotNull
    private static final String REDIRECT_AUTH_URL = "oauth/authorize/";

    @NotNull
    private static final String REDIRECT_LOCATION = "Location";

    @NotNull
    private static final String REDIRECT_URI = "redirect_uri";

    @NotNull
    private static final String STATE = "state";

    @NotNull
    private final String appId;

    @NotNull
    private final String appSecret;

    @NotNull
    private final ReentrantLock authorizingLock;

    @NotNull
    private final String deviceId;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/common/support/apm/sailfishhttp/RedirectInterceptor$RedirectParams;", "", "Lo0ooO0oo/o0OOOO00;", "url", "Lo0ooO0oo/o0OOOO00;", "getUrl", "()Lo0ooO0oo/o0OOOO00;", "", "redirectUrl", "Ljava/lang/String;", "getRedirectUrl", "()Ljava/lang/String;", "state", "getState", "<init>", "(Lcom/common/support/apm/sailfishhttp/RedirectInterceptor;Lo0ooO0oo/o0OOOO00;Ljava/lang/String;Ljava/lang/String;)V", "sailfish_release"}, k = 1, mv = {1, 7, 1})
    public final class RedirectParams {

        @NotNull
        private final String redirectUrl;

        @NotNull
        private final String state;
        final /* synthetic */ RedirectInterceptor this$0;

        @NotNull
        private final o0OOOO00 url;

        public RedirectParams(@NotNull RedirectInterceptor redirectInterceptor, @NotNull o0OOOO00 url, @NotNull String redirectUrl, String state) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            Intrinsics.checkNotNullParameter(state, "state");
            this.this$0 = redirectInterceptor;
            this.url = url;
            this.redirectUrl = redirectUrl;
            this.state = state;
        }

        @NotNull
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @NotNull
        public final String getState() {
            return this.state;
        }

        @NotNull
        public final o0OOOO00 getUrl() {
            return this.url;
        }
    }

    public RedirectInterceptor(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        com.common.support.apm.netdetector.OooO00o.OooO0O0(str, RemoteConfigConstants$RequestFieldKey.APP_ID, str2, "appSecret", str3, "deviceId");
        this.appId = str;
        this.appSecret = str2;
        this.deviceId = str3;
        this.authorizingLock = new ReentrantLock();
    }

    private final ooo0Oo0 buildRedirectRequest(ooo0Oo0 originalRequest, oO0000Oo userResponse, boolean isRedirectedToAuth) {
        o0OOOO00 locationUrlFromResponse = getLocationUrlFromResponse(userResponse);
        if (locationUrlFromResponse == null) {
            return null;
        }
        if (!Intrinsics.areEqual(locationUrlFromResponse.f57345OooO00o, userResponse.f57454OooO0Oo.f57512OooO00o.f57345OooO00o)) {
            return null;
        }
        Pair pair = isRedirectedToAuth ? new Pair(originalRequest, originalRequest.f57512OooO00o) : new Pair(userResponse.f57454OooO0Oo, locationUrlFromResponse);
        ooo0Oo0 ooo0oo0 = (ooo0Oo0) pair.component1();
        o0OOOO00 url = (o0OOOO00) pair.component2();
        String str = ooo0oo0.f57513OooO0O0;
        ooo0Oo0.OooO00o oooO00o = new ooo0Oo0.OooO00o(ooo0oo0);
        if (o0000O00.OooO00o(str)) {
            oooO00o.OooO0o(str, ooo0oo0.f57515OooO0Oo);
        }
        if (!o00OO0O0.OooO00o(ooo0oo0.f57512OooO00o, locationUrlFromResponse)) {
            oooO00o.OooO0oo("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57518OooO00o = url;
        return oooO00o.OooO0O0();
    }

    private final boolean compareUrl(o0OOOO00 f, o0OOOO00 s) {
        return Intrinsics.areEqual(f.f57345OooO00o, s.f57345OooO00o) && Intrinsics.areEqual(f.f57348OooO0Oo, s.f57348OooO0Oo) && Intrinsics.areEqual(CollectionsKt___CollectionsKt.joinToString$default(f.f57349OooO0o, "/", null, null, 0, null, null, 62, null), CollectionsKt___CollectionsKt.joinToString$default(s.f57349OooO0o, "/", null, null, 0, null, null, 62, null));
    }

    private final o0OOOO00 getLocationUrlFromResponse(final oO0000Oo response) {
        final String strOooO0OO = response.OooO0OO(REDIRECT_LOCATION, null);
        if (strOooO0OO == null) {
            return null;
        }
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.getLocationUrlFromResponse.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "response.request.url = " + response.f57454OooO0Oo.f57512OooO00o.OooOO0(strOooO0OO) + " ,location = " + strOooO0OO;
            }
        }, 1, null);
        return response.f57454OooO0Oo.f57512OooO00o.OooOO0(strOooO0OO);
    }

    private final RedirectParams parseRedirectParamsFromResponse(oO0000Oo response) {
        String strOooO0oO;
        final o0OOOO00 locationUrlFromResponse = getLocationUrlFromResponse(response);
        if (locationUrlFromResponse == null) {
            return null;
        }
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.parseRedirectParamsFromResponse.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "redirect url = " + locationUrlFromResponse.OooO0oO("redirect_uri");
            }
        }, 1, null);
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.parseRedirectParamsFromResponse.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "state = " + locationUrlFromResponse.OooO0oO("state");
            }
        }, 1, null);
        String strOooO0oO2 = locationUrlFromResponse.OooO0oO("redirect_uri");
        if (strOooO0oO2 == null || (strOooO0oO = locationUrlFromResponse.OooO0oO("state")) == null) {
            return null;
        }
        final String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(locationUrlFromResponse.f57349OooO0o, "/", null, null, 0, null, null, 62, null);
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.parseRedirectParamsFromResponse.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "urlPath = " + strJoinToString$default;
            }
        }, 1, null);
        if (Intrinsics.areEqual(strJoinToString$default, REDIRECT_AUTH_URL)) {
            return new RedirectParams(this, locationUrlFromResponse, strOooO0oO2, strOooO0oO);
        }
        return null;
    }

    private final oO0000Oo toAuthIfNeeded(final ooo0Oo0 originalRequest, final oO0000Oo response, o0OOOO0o.OooO00o chain) {
        RedirectParams redirectParamsFromResponse;
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.toAuthIfNeeded.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "RedirectInterceptor response code is " + response.f57457OooO0oO;
            }
        }, 1, null);
        if (response.f57457OooO0oO != 302 || (redirectParamsFromResponse = parseRedirectParamsFromResponse(response)) == null) {
            return response;
        }
        final boolean z = !this.authorizingLock.isHeldByCurrentThread() && this.authorizingLock.isLocked();
        try {
            this.authorizingLock.lock();
            LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.toAuthIfNeeded.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "authorizing = " + z + ", original request url = " + originalRequest.f57512OooO00o;
                }
            }, 1, null);
            if (!z) {
                ooo0Oo0 ooo0oo0TryBuildAuthRequest = tryBuildAuthRequest(redirectParamsFromResponse, response);
                if (ooo0oo0TryBuildAuthRequest != null) {
                    response.close();
                    response = chain.OooO0O0(ooo0oo0TryBuildAuthRequest);
                    if (response.f57457OooO0oO == 302) {
                        ooo0Oo0 ooo0oo0BuildRedirectRequest = buildRedirectRequest(originalRequest, response, false);
                        response.close();
                        if (ooo0oo0BuildRedirectRequest != null) {
                            response = chain.OooO0O0(ooo0oo0BuildRedirectRequest);
                            if (response.f57457OooO0oO != 302) {
                            }
                        }
                    }
                }
            }
            ooo0Oo0 ooo0oo0BuildRedirectRequest2 = buildRedirectRequest(originalRequest, response, true);
            response.close();
            return ooo0oo0BuildRedirectRequest2 == null ? response : chain.OooO0O0(ooo0oo0BuildRedirectRequest2);
        } finally {
            this.authorizingLock.unlock();
        }
    }

    private final ooo0Oo0 tryBuildAuthRequest(RedirectParams redirectParams, oO0000Oo userResponse) {
        ooo0Oo0 ooo0oo0 = userResponse.f57454OooO0Oo;
        o0OOOO00 o0oooo01 = ooo0oo0.f57512OooO00o;
        o0OOOO00.OooO00o oooO00oOooO0o = redirectParams.getUrl().OooO0o();
        oooO00oOooO0o.OooO("redirect_uri");
        oooO00oOooO0o.OooO("state");
        oooO00oOooO0o.OooO("client_id");
        oooO00oOooO0o.OooO("scope");
        oooO00oOooO0o.OooO(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE);
        for (String str : o0oooo01.OooO0oo()) {
            oooO00oOooO0o.OooO0O0(str, o0oooo01.OooO0oO(str));
        }
        o0OOOO00 url = oooO00oOooO0o.OooO0OO();
        ooo0Oo0.OooO00o oooO00o = new ooo0Oo0.OooO00o(ooo0oo0);
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57518OooO00o = url;
        oooO00o.OooO0oO(RequestUtil.INSTANCE.createFormBody(new Pair<>("app_id", this.appId), new Pair<>("random", this.appSecret), new Pair<>("device_id", this.deviceId), new Pair<>("redirect_uri", redirectParams.getRedirectUrl()), new Pair<>("state", redirectParams.getState())));
        return oooO00o.OooO0O0();
    }

    @Override // p640o0ooO0oo.o0OOOO0o
    @NotNull
    public oO0000Oo intercept(@NotNull o0OOOO0o.OooO00o chain) throws IOException {
        ooo0Oo0 ooo0oo0BuildRedirectRequest;
        Intrinsics.checkNotNullParameter(chain, "chain");
        ooo0Oo0 ooo0oo0OooO00o = chain.OooO00o();
        oO0000Oo authIfNeeded = toAuthIfNeeded(ooo0oo0OooO00o, chain.OooO0O0(ooo0oo0OooO00o), chain);
        ooo0Oo0 ooo0oo0 = ooo0oo0OooO00o;
        while (true) {
            int i = authIfNeeded.f57457OooO0oO;
            ooo0Oo0 ooo0oo1 = null;
            if ((i == 302 || i == 307 || i == 308) && (ooo0oo0BuildRedirectRequest = buildRedirectRequest(ooo0oo0OooO00o, authIfNeeded, false)) != null) {
                ooo0oo0 = ooo0oo0BuildRedirectRequest;
                ooo0oo1 = ooo0oo0;
            }
            if (ooo0oo1 == null) {
                return authIfNeeded;
            }
            authIfNeeded.close();
            authIfNeeded = chain.OooO0O0(ooo0oo0);
        }
    }
}
