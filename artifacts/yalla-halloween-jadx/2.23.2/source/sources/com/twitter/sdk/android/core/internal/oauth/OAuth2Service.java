package com.twitter.sdk.android.core.internal.oauth;

import com.facebook.internal.security.CertificateUtil;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.o0ooOOo;
import o0OOOOOO.OooOo00;
import okio.ByteString;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
public final class OAuth2Service extends OooOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OAuth2Api f21530OooO0o0;

    public interface OAuth2Api {
        @FormUrlEncoded
        @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @POST("/oauth2/token")
        retrofit2.OooO0O0<OAuth2Token> getAppAuthToken(@Header("Authorization") String str, @Field("grant_type") String str2);

        @POST("/1.1/guest/activate.json")
        retrofit2.OooO0O0<OooO00o> getGuestToken(@Header("Authorization") String str);
    }

    public OAuth2Service(o0ooOOo o0ooooo, OooOo00 oooOo00) {
        super(o0ooooo, oooOo00);
        this.f21530OooO0o0 = (OAuth2Api) this.f21550OooO0Oo.OooO0O0(OAuth2Api.class);
    }

    public final void OooO00o(com.twitter.sdk.android.core.OooO.OooO00o oooO00o) {
        OooO0o oooO0o = new OooO0o(this, oooO00o);
        TwitterAuthConfig twitterAuthConfig = this.f21547OooO00o.f21756OooO0Oo;
        String str = com.google.gson.internal.OooO.OooO0Oo(twitterAuthConfig.f21505OooO0Oo) + CertificateUtil.DELIMITER + com.google.gson.internal.OooO.OooO0Oo(twitterAuthConfig.f21506OooO0o0);
        ByteString byteString = ByteString.f60193OooO0oO;
        this.f21530OooO0o0.getAppAuthToken("Basic " + ByteString.OooO00o.OooO0OO(str).OooO00o(), "client_credentials").OooOooo(oooO0o);
    }
}
