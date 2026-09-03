package com.twitter.sdk.android.core.internal.oauth;

import com.facebook.internal.security.CertificateUtil;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.o0OOO0o;
import o0OOOOO.OooOo00;
import okio.ByteString;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes4.dex */
public final class OAuth2Service extends OooOO0O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OAuth2Api f22001OooO0o0;

    public interface OAuth2Api {
        @FormUrlEncoded
        @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @POST("/oauth2/token")
        retrofit2.OooO0O0<OAuth2Token> getAppAuthToken(@Header("Authorization") String str, @Field("grant_type") String str2);

        @POST("/1.1/guest/activate.json")
        retrofit2.OooO0O0<OooO00o> getGuestToken(@Header("Authorization") String str);
    }

    public OAuth2Service(o0OOO0o o0ooo0o2, OooOo00 oooOo00) {
        super(o0ooo0o2, oooOo00);
        this.f22001OooO0o0 = (OAuth2Api) this.f22021OooO0Oo.OooO0O0(OAuth2Api.class);
    }

    public final void OooO00o(com.twitter.sdk.android.core.OooO.OooO00o oooO00o) {
        OooO oooO = new OooO(this, oooO00o);
        TwitterAuthConfig twitterAuthConfig = this.f22018OooO00o.f22223OooO0Oo;
        String str = o0OOOOOO.OooOO0.OooO0O0(twitterAuthConfig.f21976OooO0Oo) + CertificateUtil.DELIMITER + o0OOOOOO.OooOO0.OooO0O0(twitterAuthConfig.f21977OooO0o0);
        ByteString byteString = ByteString.f60866OooO0oO;
        this.f22001OooO0o0.getAppAuthToken("Basic " + ByteString.OooO00o.OooO0OO(str).OooO00o(), "client_credentials").OooOooO(oooO);
    }
}
