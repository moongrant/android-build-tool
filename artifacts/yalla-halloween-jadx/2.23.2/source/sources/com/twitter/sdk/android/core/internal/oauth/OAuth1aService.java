package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.facebook.AccessToken;
import com.facebook.internal.ServerProtocol;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.o0ooOOo;
import java.util.TreeMap;
import o0OOOOOO.OooOo00;
import p257o00ooOOo.o0OOO0;
import p641o0ooOO0o.o0O00oO0;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: classes2.dex */
public final class OAuth1aService extends OooOO0 {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OAuthApi f21529OooO0o0;

    public interface OAuthApi {
        @POST("/oauth/access_token")
        retrofit2.OooO0O0<o0O00oO0> getAccessToken(@Header("Authorization") String str, @Query("oauth_verifier") String str2);

        @POST("/oauth/request_token")
        retrofit2.OooO0O0<o0O00oO0> getTempToken(@Header("Authorization") String str);
    }

    public OAuth1aService(o0ooOOo o0ooooo, OooOo00 oooOo00) {
        super(o0ooooo, oooOo00);
        this.f21529OooO0o0 = (OAuthApi) this.f21550OooO0Oo.OooO0O0(OAuthApi.class);
    }

    public static OAuthResponse OooO0O0(String str) {
        TreeMap treeMapOooO0OO = com.google.gson.internal.OooO.OooO0OO(str, false);
        String str2 = (String) treeMapOooO0OO.get("oauth_token");
        String str3 = (String) treeMapOooO0OO.get("oauth_token_secret");
        String str4 = (String) treeMapOooO0OO.get("screen_name");
        long j = treeMapOooO0OO.containsKey(AccessToken.USER_ID_KEY) ? Long.parseLong((String) treeMapOooO0OO.get(AccessToken.USER_ID_KEY)) : 0L;
        if (str2 == null || str3 == null) {
            return null;
        }
        return new OAuthResponse(j, new TwitterAuthToken(str2, str3), str4);
    }

    public final String OooO00o(TwitterAuthConfig twitterAuthConfig) {
        Uri.Builder builderBuildUpon = Uri.parse("twittersdk://callback").buildUpon();
        this.f21547OooO00o.getClass();
        return builderBuildUpon.appendQueryParameter(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "3.3.0.12").appendQueryParameter("app", twitterAuthConfig.f21505OooO0Oo).build().toString();
    }

    public final void OooO0OO(com.twitter.sdk.android.core.identity.OooO0O0 oooO0O0, TwitterAuthToken twitterAuthToken, String str) {
        this.f21548OooO0O0.getClass();
        this.f21529OooO0o0.getAccessToken(o0OOO0.OooO0OO(this.f21547OooO00o.f21756OooO0Oo, twitterAuthToken, null, "POST", "https://api.twitter.com/oauth/access_token", null), str).OooOooo(new OooO0OO(oooO0O0));
    }

    public final void OooO0Oo(com.twitter.sdk.android.core.identity.OooO00o oooO00o) {
        TwitterAuthConfig twitterAuthConfig = this.f21547OooO00o.f21756OooO0Oo;
        this.f21548OooO0O0.getClass();
        this.f21529OooO0o0.getTempToken(o0OOO0.OooO0OO(twitterAuthConfig, null, OooO00o(twitterAuthConfig), "POST", "https://api.twitter.com/oauth/request_token", null)).OooOooo(new OooO0OO(oooO00o));
    }
}
