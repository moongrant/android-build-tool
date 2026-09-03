package com.twitter.sdk.android.core.internal.oauth;

import com.facebook.internal.security.CertificateUtil;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterException;
import okio.ByteString;
import p433o0OoOO0o.o0O00O;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0O0oo0o;
import p433o0OoOO0o.o0oO0Ooo;
import p435o0OoOOO0.o00000;
import p440o0OoOOoO.o0OO00o0;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes2.dex */
public final class OAuth2Service extends OooO {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OAuth2Api f19963OooO0o0;

    public interface OAuth2Api {
        @FormUrlEncoded
        @Headers({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @POST("/oauth2/token")
        retrofit2.OooO0O0<OAuth2Token> getAppAuthToken(@Header("Authorization") String str, @Field("grant_type") String str2);

        @POST("/1.1/guest/activate.json")
        retrofit2.OooO0O0<com.twitter.sdk.android.core.internal.oauth.OooO00o> getGuestToken(@Header("Authorization") String str);
    }

    public class OooO00o extends o0O0o<OAuth2Token> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0O0o f19964OooO00o;

        /* JADX INFO: renamed from: com.twitter.sdk.android.core.internal.oauth.OAuth2Service$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0180OooO00o extends o0O0o<com.twitter.sdk.android.core.internal.oauth.OooO00o> {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OAuth2Token f19966OooO00o;

            public C0180OooO00o(OAuth2Token oAuth2Token) {
                this.f19966OooO00o = oAuth2Token;
            }

            @Override // p433o0OoOO0o.o0O0o
            public final void OooO0OO(TwitterException twitterException) {
                o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Your app may not allow guest auth. Please talk to us regarding upgrading your consumer key.", twitterException);
                OooO00o.this.f19964OooO00o.OooO0OO(twitterException);
            }

            @Override // p433o0OoOO0o.o0O0o
            public final void OooO0Oo(o0O00O<com.twitter.sdk.android.core.internal.oauth.OooO00o> o0o00o2) {
                OooO00o.this.f19964OooO00o.OooO0Oo(new o0O00O(new GuestAuthToken(this.f19966OooO00o.OooO0O0(), this.f19966OooO00o.OooO00o(), o0o00o2.f39934OooO00o.f19977OooO00o), null));
            }
        }

        public OooO00o(o0O0o o0o0o) {
            this.f19964OooO00o = o0o0o;
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0OO(TwitterException twitterException) {
            o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Failed to get app auth token", twitterException);
            o0O0o o0o0o = this.f19964OooO00o;
            if (o0o0o != null) {
                o0o0o.OooO0OO(twitterException);
            }
        }

        @Override // p433o0OoOO0o.o0O0o
        public final void OooO0Oo(o0O00O<OAuth2Token> o0o00o2) {
            OAuth2Token oAuth2Token = o0o00o2.f39934OooO00o;
            C0180OooO00o c0180OooO00o = new C0180OooO00o(oAuth2Token);
            OAuth2Api oAuth2Api = OAuth2Service.this.f19963OooO0o0;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Bearer ");
            sbOooO0o0.append(oAuth2Token.OooO00o());
            oAuth2Api.getGuestToken(sbOooO0o0.toString()).OoooOo0(c0180OooO00o);
        }
    }

    public OAuth2Service(o0O0oo0o o0o0oo0o, o0OO00o0 o0oo00o1) {
        super(o0o0oo0o, o0oo00o1);
        this.f19963OooO0o0 = (OAuth2Api) this.f19976OooO0Oo.OooO0O0(OAuth2Api.class);
    }

    public final void OooO00o(o0O0o<GuestAuthToken> o0o0o) {
        OooO00o oooO00o = new OooO00o(o0o0o);
        OAuth2Api oAuth2Api = this.f19963OooO0o0;
        TwitterAuthConfig twitterAuthConfig = this.f19973OooO00o.f39952OooO0Oo;
        ByteString byteStringOooO0Oo = ByteString.OooO0Oo(o00000.OooO0O0(twitterAuthConfig.f19938Oooo0o) + CertificateUtil.DELIMITER + o00000.OooO0O0(twitterAuthConfig.f19939Oooo0oO));
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Basic ");
        sbOooO0o0.append(byteStringOooO0Oo.OooO00o());
        oAuth2Api.getAppAuthToken(sbOooO0o0.toString(), "client_credentials").OoooOo0(oooO00o);
    }
}
