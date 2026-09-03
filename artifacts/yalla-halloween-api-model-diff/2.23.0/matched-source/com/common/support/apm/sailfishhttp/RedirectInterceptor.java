package com.common.support.apm.sailfishhttp;

import androidx.compose.compiler.plugins.kotlin.lower.OooO0OO;
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
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OOO00;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0oOOo;
import p635o0ooO0oo.o0O000o0;
import p647o0ooOooo.mc;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0016\u0010\n\u001a\b\u0018\u00010\tR\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u000b\u001a\u00060\tR\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004H\u0002J\"\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/common/support/apm/sailfishhttp/RedirectInterceptor;", "Lo0ooO0oO/o00OOO00;", "Lo0ooO0oO/o00OOOOo;", "originalRequest", "Lo0ooO0oO/o0oOOo;", "response", "Lo0ooO0oO/o00OOO00$OooO00o;", "chain", "toAuthIfNeeded", "Lcom/common/support/apm/sailfishhttp/RedirectInterceptor$RedirectParams;", "parseRedirectParamsFromResponse", "redirectParams", "userResponse", "tryBuildAuthRequest", "", "isRedirectedToAuth", "buildRedirectRequest", "Lo0ooO0oO/o00OO;", "getLocationUrlFromResponse", "f", "s", "compareUrl", "intercept", "", RemoteConfigConstants$RequestFieldKey.APP_ID, "Ljava/lang/String;", "appSecret", "deviceId", "Ljava/util/concurrent/locks/ReentrantLock;", "authorizingLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "RedirectParams", "sailfish_release"}, k = 1, mv = {1, 5, 1})
public final class RedirectInterceptor implements o00OOO00 {

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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/common/support/apm/sailfishhttp/RedirectInterceptor$RedirectParams;", "", "Lo0ooO0oO/o00OO;", "url", "Lo0ooO0oO/o00OO;", "getUrl", "()Lo0ooO0oO/o00OO;", "", "redirectUrl", "Ljava/lang/String;", "getRedirectUrl", "()Ljava/lang/String;", "state", "getState", "<init>", "(Lcom/common/support/apm/sailfishhttp/RedirectInterceptor;Lo0ooO0oO/o00OO;Ljava/lang/String;Ljava/lang/String;)V", "sailfish_release"}, k = 1, mv = {1, 5, 1})
    public final class RedirectParams {

        @NotNull
        private final String redirectUrl;

        @NotNull
        private final String state;
        final /* synthetic */ RedirectInterceptor this$0;

        @NotNull
        private final o00OO url;

        public RedirectParams(@NotNull RedirectInterceptor this$0, @NotNull o00OO url, @NotNull String redirectUrl, String state) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
            Intrinsics.checkNotNullParameter(state, "state");
            this.this$0 = this$0;
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
        public final o00OO getUrl() {
            return this.url;
        }
    }

    public RedirectInterceptor(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        OooO0OO.OooO00o(str, RemoteConfigConstants$RequestFieldKey.APP_ID, str2, "appSecret", str3, "deviceId");
        this.appId = str;
        this.appSecret = str2;
        this.deviceId = str3;
        this.authorizingLock = new ReentrantLock();
    }

    private final o00OOOOo buildRedirectRequest(o00OOOOo originalRequest, o0oOOo userResponse, boolean isRedirectedToAuth) {
        o00OO locationUrlFromResponse = getLocationUrlFromResponse(userResponse);
        if (locationUrlFromResponse == null) {
            return null;
        }
        if (!Intrinsics.areEqual(locationUrlFromResponse.f57203OooO00o, userResponse.f57342OooO0Oo.f57313OooO00o.f57203OooO00o)) {
            return null;
        }
        Pair pair = isRedirectedToAuth ? new Pair(originalRequest, originalRequest.f57313OooO00o) : new Pair(userResponse.f57342OooO0Oo, locationUrlFromResponse);
        o00OOOOo o00ooooo2 = (o00OOOOo) pair.component1();
        o00OO url = (o00OO) pair.component2();
        String str = o00ooooo2.f57314OooO0O0;
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00ooooo2);
        if (mc.OooO00o(str)) {
            oooO00o.OooO0o(str, o00ooooo2.f57316OooO0Oo);
        }
        if (!o0O000o0.OooO00o(o00ooooo2.f57313OooO00o, locationUrlFromResponse)) {
            oooO00o.OooO0oo("Authorization");
        }
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57319OooO00o = url;
        return oooO00o.OooO0O0();
    }

    private final boolean compareUrl(o00OO f, o00OO s) {
        return Intrinsics.areEqual(f.f57203OooO00o, s.f57203OooO00o) && Intrinsics.areEqual(f.f57206OooO0Oo, s.f57206OooO0Oo) && Intrinsics.areEqual(CollectionsKt___CollectionsKt.joinToString$default(f.f57207OooO0o, "/", null, null, 0, null, null, 62, null), CollectionsKt___CollectionsKt.joinToString$default(s.f57207OooO0o, "/", null, null, 0, null, null, 62, null));
    }

    private final o00OO getLocationUrlFromResponse(final o0oOOo response) {
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
                return "response.request.url = " + response.f57342OooO0Oo.f57313OooO00o.OooOO0(strOooO0OO) + " ,location = " + strOooO0OO;
            }
        }, 1, null);
        return response.f57342OooO0Oo.f57313OooO00o.OooOO0(strOooO0OO);
    }

    private final RedirectParams parseRedirectParamsFromResponse(o0oOOo response) {
        String strOooO0oO;
        final o00OO locationUrlFromResponse = getLocationUrlFromResponse(response);
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
                return Intrinsics.stringPlus("redirect url = ", locationUrlFromResponse.OooO0oO("redirect_uri"));
            }
        }, 1, null);
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.parseRedirectParamsFromResponse.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return Intrinsics.stringPlus("state = ", locationUrlFromResponse.OooO0oO("state"));
            }
        }, 1, null);
        String strOooO0oO2 = locationUrlFromResponse.OooO0oO("redirect_uri");
        if (strOooO0oO2 == null || (strOooO0oO = locationUrlFromResponse.OooO0oO("state")) == null) {
            return null;
        }
        final String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(locationUrlFromResponse.f57207OooO0o, "/", null, null, 0, null, null, 62, null);
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.parseRedirectParamsFromResponse.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return Intrinsics.stringPlus("urlPath = ", strJoinToString$default);
            }
        }, 1, null);
        if (Intrinsics.areEqual(strJoinToString$default, REDIRECT_AUTH_URL)) {
            return new RedirectParams(this, locationUrlFromResponse, strOooO0oO2, strOooO0oO);
        }
        return null;
    }

    private final o0oOOo toAuthIfNeeded(final o00OOOOo originalRequest, final o0oOOo response, o00OOO00.OooO00o chain) {
        RedirectParams redirectParamsFromResponse;
        LoggerKt.logD$default(null, new Function0<String>() { // from class: com.common.support.apm.sailfishhttp.RedirectInterceptor.toAuthIfNeeded.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return Intrinsics.stringPlus("RedirectInterceptor response code is ", Integer.valueOf(response.f57345OooO0oO));
            }
        }, 1, null);
        if (response.f57345OooO0oO != 302 || (redirectParamsFromResponse = parseRedirectParamsFromResponse(response)) == null) {
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
                    return "authorizing = " + z + ", original request url = " + originalRequest.f57313OooO00o;
                }
            }, 1, null);
            if (!z) {
                o00OOOOo o00oooooTryBuildAuthRequest = tryBuildAuthRequest(redirectParamsFromResponse, response);
                if (o00oooooTryBuildAuthRequest != null) {
                    response.close();
                    response = chain.OooO0O0(o00oooooTryBuildAuthRequest);
                    if (response.f57345OooO0oO == 302) {
                        o00OOOOo o00oooooBuildRedirectRequest = buildRedirectRequest(originalRequest, response, false);
                        response.close();
                        if (o00oooooBuildRedirectRequest != null) {
                            response = chain.OooO0O0(o00oooooBuildRedirectRequest);
                            if (response.f57345OooO0oO != 302) {
                            }
                        }
                    }
                }
            }
            o00OOOOo o00oooooBuildRedirectRequest2 = buildRedirectRequest(originalRequest, response, true);
            response.close();
            return o00oooooBuildRedirectRequest2 == null ? response : chain.OooO0O0(o00oooooBuildRedirectRequest2);
        } finally {
            this.authorizingLock.unlock();
        }
    }

    private final o00OOOOo tryBuildAuthRequest(RedirectParams redirectParams, o0oOOo userResponse) {
        o00OOOOo o00ooooo2 = userResponse.f57342OooO0Oo;
        o00OO o00oo2 = o00ooooo2.f57313OooO00o;
        o00OO.OooO00o oooO00oOooO0o = redirectParams.getUrl().OooO0o();
        oooO00oOooO0o.OooO("redirect_uri");
        oooO00oOooO0o.OooO("state");
        oooO00oOooO0o.OooO("client_id");
        oooO00oOooO0o.OooO("scope");
        oooO00oOooO0o.OooO(ServerProtocol.DIALOG_PARAM_RESPONSE_TYPE);
        for (String str : o00oo2.OooO0oo()) {
            oooO00oOooO0o.OooO0O0(str, o00oo2.OooO0oO(str));
        }
        o00OO url = oooO00oOooO0o.OooO0OO();
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o(o00ooooo2);
        Intrinsics.checkNotNullParameter(url, "url");
        oooO00o.f57319OooO00o = url;
        oooO00o.OooO0oO(RequestUtil.INSTANCE.createFormBody(new Pair<>("app_id", this.appId), new Pair<>("random", this.appSecret), new Pair<>("device_id", this.deviceId), new Pair<>("redirect_uri", redirectParams.getRedirectUrl()), new Pair<>("state", redirectParams.getState())));
        return oooO00o.OooO0O0();
    }

    @Override // p634o0ooO0oO.o00OOO00
    @NotNull
    public o0oOOo intercept(@NotNull o00OOO00.OooO00o chain) throws IOException {
        o00OOOOo o00oooooBuildRedirectRequest;
        Intrinsics.checkNotNullParameter(chain, "chain");
        o00OOOOo o00oooooOooO00o = chain.OooO00o();
        o0oOOo authIfNeeded = toAuthIfNeeded(o00oooooOooO00o, chain.OooO0O0(o00oooooOooO00o), chain);
        o00OOOOo o00ooooo2 = o00oooooOooO00o;
        while (true) {
            int i = authIfNeeded.f57345OooO0oO;
            o00OOOOo o00ooooo3 = null;
            if ((i == 302 || i == 307 || i == 308) && (o00oooooBuildRedirectRequest = buildRedirectRequest(o00oooooOooO00o, authIfNeeded, false)) != null) {
                o00ooooo2 = o00oooooBuildRedirectRequest;
                o00ooooo3 = o00ooooo2;
            }
            if (o00ooooo3 == null) {
                return authIfNeeded;
            }
            authIfNeeded.close();
            authIfNeeded = chain.OooO0O0(o00ooooo2);
        }
    }
}
